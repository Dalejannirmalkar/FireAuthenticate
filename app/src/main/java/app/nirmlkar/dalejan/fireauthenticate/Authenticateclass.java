package app.nirmlkar.dalejan.fireauthenticate;

import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by dalejan on 5/9/17.
 */

public class Authenticateclass {


    public FirebaseAuth Authenticate() {
        FirebaseAuth auth;
        auth = FirebaseAuth.getInstance();
        return auth;
    }
}
