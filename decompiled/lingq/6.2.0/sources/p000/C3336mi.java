package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: mi */
/* JADX INFO: loaded from: classes.dex */
public final class C3336mi {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f51344a;

    public C3336mi(Context context) {
        boolean zIsEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f51344a = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m16838a(String str) {
        str.getClass();
        this.f51344a.edit().remove(str).commit();
    }

    /* JADX INFO: renamed from: b */
    public long m16839b(String str, long j) {
        str.getClass();
        return this.f51344a.getLong(str, j);
    }

    /* JADX INFO: renamed from: c */
    public boolean m16840c(String str, long j) {
        str.getClass();
        return this.f51344a.edit().putLong(str, j).commit();
    }

    public C3336mi() {
        SharedPreferences sharedPreferences = sy2.m21766a().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        sharedPreferences.getClass();
        this.f51344a = sharedPreferences;
    }

    public C3336mi(SharedPreferences sharedPreferences) {
        this.f51344a = sharedPreferences;
    }
}
