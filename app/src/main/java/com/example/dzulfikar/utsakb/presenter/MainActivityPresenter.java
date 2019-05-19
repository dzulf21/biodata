package com.example.dzulfikar.utsakb.presenter;

import com.example.dzulfikar.utsakb.model.FriendModel;
import com.example.dzulfikar.utsakb.view.FriendView;

//Nama  : Dzulfikar Miandro Akbar S
//NIM   : 10116358
//KLS   : IF 8
//TGL   : 8 Mei 2019

public class MainActivityPresenter implements FriendPresenter{

    private FriendView friendView;
    private FriendModel friend = new FriendModel();

    public MainActivityPresenter (FriendView friendView){
        this.friendView = friendView;
    }

    @Override
    public void updateNamaFriend(String namaFriend) {
        friend.setNamaFriend(namaFriend);
        friendView.updateUserInfoTextView(friend.toString());

    }

    @Override
    public void updateEmailFriend(String emailFriend) {
        friend.setEmailFriend(emailFriend);
        friendView.updateUserInfoTextView(friend.toString());

    }
}
