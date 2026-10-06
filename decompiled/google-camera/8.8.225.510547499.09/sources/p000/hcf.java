package p000;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hcf {

    /* JADX INFO: renamed from: a */
    private static final nbh f27235a = nbh.m17259h("com/google/android/apps/camera/sideline/util/SidelineCoreUtils");

    /* JADX INFO: renamed from: a */
    public static long m10101a(Context context, int i) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.pixel.camera.hal", i | 1073741824).getLongVersionCode();
        } catch (PackageManager.NameNotFoundException e) {
            ((nbe) ((nbe) f27235a.m17252c()).mo17276G((char) 3476)).mo17290o("Camera HAL package not found.");
            return -1L;
        }
    }

    /* JADX INFO: renamed from: b */
    public static long m10102b(Context context) {
        return m10101a(context, 0);
    }
}
