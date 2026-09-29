package p291o7;

import android.content.SharedPreferences;
import dm.C5207g;

/* JADX INFO: renamed from: o7.g */
/* JADX INFO: loaded from: classes.dex */
public final class C7997g {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f43534a;

    public C7997g() {
        SharedPreferences sharedPreferences = C8004n.m15871a().getSharedPreferences("com.facebook.AuthenticationTokenManager.SharedPreferences", 0);
        C5207g.m11110e(sharedPreferences, "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AuthenticationTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        this.f43534a = sharedPreferences;
    }
}
