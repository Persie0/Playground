package p291o7;

import android.content.SharedPreferences;
import dm.C5207g;

/* JADX INFO: renamed from: o7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7988a {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f43482a;

    /* JADX INFO: renamed from: o7.a$a */
    public static final class a {
    }

    public C7988a() {
        SharedPreferences sharedPreferences = C8004n.m15871a().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        C5207g.m11110e(sharedPreferences, "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AccessTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        new a();
        this.f43482a = sharedPreferences;
    }
}
