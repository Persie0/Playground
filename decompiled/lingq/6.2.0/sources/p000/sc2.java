package p000;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class sc2 {

    /* JADX INFO: renamed from: a */
    public String f60665a;

    /* JADX INFO: renamed from: b */
    public String f60666b;

    public sc2(b64 b64Var) {
        Context context = (Context) b64Var.f8006a;
        int iM19015C = pb1.m19015C(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (iM19015C != 0) {
            this.f60665a = "Unity";
            String string = context.getResources().getString(iM19015C);
            this.f60666b = string;
            String strM17734i = AbstractC3393o1.m17734i("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strM17734i, null);
                return;
            }
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                this.f60665a = "Flutter";
                this.f60666b = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
            }
        }
        this.f60665a = null;
        this.f60666b = null;
    }

    /* JADX INFO: renamed from: a */
    public vp7 m21220a() {
        String str = this.f60666b;
        if ("first_party".equals(str)) {
            C3386nv.m17626m("Serialized doc id must be provided for first party products.");
            return null;
        }
        if (this.f60665a == null) {
            C3386nv.m17626m("Product id must be provided.");
            return null;
        }
        if (str != null) {
            return new vp7(this);
        }
        C3386nv.m17626m("Product type must be provided.");
        return null;
    }

    public /* synthetic */ sc2(String str, String str2) {
        this.f60665a = str;
        this.f60666b = str2;
    }
}
