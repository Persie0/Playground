package p000;

import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gvs {

    /* JADX INFO: renamed from: a */
    public static final nbh f26521a = nbh.m17259h("com/google/android/apps/camera/secure/SecureActivityModule");

    /* JADX INFO: renamed from: a */
    public static boolean m9801a(Intent intent) {
        if (intent == null) {
            return false;
        }
        String action = intent.getAction();
        return "android.media.action.STILL_IMAGE_CAMERA_SECURE".equals(action) || "android.media.action.IMAGE_CAPTURE_SECURE".equals(action) || intent.getBooleanExtra("secure_camera", false);
    }
}
