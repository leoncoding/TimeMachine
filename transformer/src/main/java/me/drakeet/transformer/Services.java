package me.drakeet.transformer;

import android.content.Context;
import android.support.annotation.NonNull;

/**
 * @author drakeet
 */
public class Services {

    private Services() {
        throw new AssertionError();
    }


    @NonNull public static MessageService messageService(@NonNull Context context) {
        return new MessageService(context);
    }
}
