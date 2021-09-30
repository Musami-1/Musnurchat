package com.w.musnurchat.viewHolders;

import android.view.View;

import com.w.musnurchat.models.AttachmentTypes;

public class MessageTypingViewHolder extends BaseMessageViewHolder {
    public MessageTypingViewHolder(View itemView) {
        super(itemView, AttachmentTypes.NONE_TYPING,null);
    }
}
