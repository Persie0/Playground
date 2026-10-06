package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.xRFdVyfdeve;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ink {

    /* JADX INFO: renamed from: a */
    public static final nbh f31598a = nbh.m17259h("com/google/android/apps/camera/util/photos/PhotosPackageDetector");

    /* JADX INFO: renamed from: b */
    public final Context f31599b;

    public ink(Context context) {
        this.f31599b = context;
    }

    /* JADX INFO: renamed from: a */
    public final PackageInfo m11522a() {
        try {
            return this.f31599b.getPackageManager().getPackageInfo(xRFdVyfdeve.UlPLoIKsDK, 0);
        } catch (PackageManager.NameNotFoundException e) {
            ((nbe) ((nbe) ((nbe) f31598a.m17252c()).mo17283h(e)).mo17276G((char) 4350)).mo17290o("Photos app package not found.");
            return null;
        }
    }
}
