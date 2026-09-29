package p000;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: x2 */
/* JADX INFO: loaded from: classes.dex */
public final class C3744x2 {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f67655a;

    public C3744x2(int i) {
        switch (i) {
            case 1:
                SharedPreferences sharedPreferences = sy2.m21766a().getSharedPreferences("com.facebook.AuthenticationTokenManager.SharedPreferences", 0);
                sharedPreferences.getClass();
                this.f67655a = sharedPreferences;
                break;
            default:
                SharedPreferences sharedPreferences2 = sy2.m21766a().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
                sharedPreferences2.getClass();
                this.f67655a = sharedPreferences2;
                break;
        }
    }
}
