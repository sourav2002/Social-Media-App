package com.innovativetech.socialmedia;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.fxn.OnBubbleClickListener;
import com.innovativetech.socialmedia.Fragments.Home;
import com.innovativetech.socialmedia.Fragments.Notify;
import com.innovativetech.socialmedia.Fragments.Post;
import com.innovativetech.socialmedia.Fragments.Profile;
import com.innovativetech.socialmedia.Fragments.Search;
import com.innovativetech.socialmedia.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, new Home());
        transaction.commit();

        binding.bottomBar.addBubbleListener(new OnBubbleClickListener() {
            @Override
            public void onBubbleClick(int i) {
                switch (i) {

                    case R.id.home2:
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.frame_layout, new Home());
                        transaction.commit();
                        break;

                    case R.id.search2:
                        FragmentTransaction search = getSupportFragmentManager().beginTransaction();
                        search.replace(R.id.frame_layout, new Search());
                        search.commit();
                        break;

                    case R.id.post2:
                        FragmentTransaction post = getSupportFragmentManager().beginTransaction();
                        post.replace(R.id.frame_layout, new Post());
                        post.commit();
                        break;

                    case R.id.notify:
                        FragmentTransaction notify = getSupportFragmentManager().beginTransaction();
                        notify.replace(R.id.frame_layout, new Notify());
                        notify.commit();
                        break;

                    case R.id.profile2:
                        FragmentTransaction profile = getSupportFragmentManager().beginTransaction();
                        profile.replace(R.id.frame_layout, new Profile());
                        profile.commit();
                        break;
                }
            }
        });

    }
}