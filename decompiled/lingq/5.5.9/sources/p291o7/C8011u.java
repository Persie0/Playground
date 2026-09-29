package p291o7;

import android.content.SharedPreferences;
import dm.C5207g;

/* JADX INFO: renamed from: o7.u */
/* JADX INFO: loaded from: classes.dex */
public final class C8011u {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f43590a;

    public C8011u() {
        SharedPreferences sharedPreferences = C8004n.m15871a().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        C5207g.m11110e(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        this.f43590a = sharedPreferences;
    }
}
