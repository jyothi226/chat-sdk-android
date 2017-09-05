package co.chatsdk.firebase.filestorage;

import co.chatsdk.core.NetworkManager;

/**
 * Created by ben on 9/1/17.
 */

public class FirebaseFileStorageModule {

    public static void activate () {
        NetworkManager.shared().a.upload = new FirebaseUploadHandler();
    }

}
