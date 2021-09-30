package com.w.musnurchat.interfaces;

import android.view.View;

import com.w.musnurchat.models.Group;
import com.w.musnurchat.models.User;


public interface OnUserGroupItemClick {
    void OnUserClick(User user, int position, View userImage);
    void OnGroupClick(Group group, int position, View userImage);
}
