package android.example.com.squawker.fcm;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by manaadvice on 25/02/18.
 */

public class SquawkerFirebaseInstanceIdService extends FirebaseInstanceIdService {
    private static final String TAG = "SquawkerFirebaseInstanc";

    @Override
    public void onTokenRefresh() {
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token : " + refreshedToken);

    }
}
