package p000;

import android.net.Uri;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class q58 {

    /* JADX INFO: renamed from: a */
    public final C3384nt f57296a;

    /* JADX INFO: renamed from: b */
    public final kn1 f57297b;

    public q58(C3384nt c3384nt, kn1 kn1Var) {
        c3384nt.getClass();
        kn1Var.getClass();
        this.f57296a = c3384nt;
        this.f57297b = kn1Var;
    }

    /* JADX INFO: renamed from: a */
    public static final URL m19661a(q58 q58Var) {
        q58Var.getClass();
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        C3384nt c3384nt = q58Var.f57296a;
        Uri.Builder builderAppendPath2 = builderAppendPath.appendPath(c3384nt.f53225a).appendPath("settings");
        C3297lg c3297lg = c3384nt.f53227c;
        return new URL(builderAppendPath2.appendQueryParameter("build_version", c3297lg.f49613c).appendQueryParameter("display_version", c3297lg.f49612b).build().toString());
    }
}
