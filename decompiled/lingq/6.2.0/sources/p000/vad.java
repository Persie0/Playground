package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.facebook.AccessToken;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vad {
    /* JADX INFO: renamed from: a */
    public static mp3 m23214a(String str, AccessToken accessToken, String str2) {
        String str3;
        String str4 = mp3.f51688j;
        mp3 mp3VarM21069q = s46.m21069q(accessToken, String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{str2}, 1)), null, null);
        Bundle bundle = mp3VarM21069q.f51694d;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("tree", str);
        Context contextM21766a = sy2.m21766a();
        try {
            str3 = contextM21766a.getPackageManager().getPackageInfo(contextM21766a.getPackageName(), 0).versionName;
            str3.getClass();
        } catch (PackageManager.NameNotFoundException unused) {
            str3 = "";
        }
        bundle.putString("app_version", str3);
        bundle.putString("platform", "android");
        bundle.putString("request_type", "app_indexing");
        bundle.putString("device_session_id", t41.m21837a());
        mp3VarM21069q.f51694d = bundle;
        mp3VarM21069q.m16988j(new C3732wr(2));
        return mp3VarM21069q;
    }

    /* JADX INFO: renamed from: b */
    public static Handler m23215b(Looper looper) {
        return Handler.createAsync(looper);
    }
}
