package com.w.musnurchat.interfaces;

import com.w.musnurchat.models.Contact;
import com.w.musnurchat.models.User;

import java.util.ArrayList;

/**
 * Created by a_man on 01-01-2018.
 */

public interface HomeIneractor {
    User getUserMe();

    ArrayList<Contact> getLocalContacts();

}
