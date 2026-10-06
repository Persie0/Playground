package p000;

import android.os.Build;
import android.util.Log;
import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;
import dalvik.system.VMStack;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ndt extends ndk {

    /* JADX INFO: renamed from: a */
    private static final boolean f42058a = nds.m17377a();

    /* JADX INFO: renamed from: b */
    private static final boolean f42059b;

    /* JADX INFO: renamed from: c */
    private static final ndj f42060c;

    static {
        boolean z = true;
        if (Build.FINGERPRINT != null && !"robolectric".equals(Build.FINGERPRINT)) {
            z = false;
        }
        f42059b = z;
        Log.class.getName();
        f42060c = new ndr();
    }

    /* JADX INFO: renamed from: p */
    static Class m17378p() {
        return VMStack.getStackClass2();
    }

    /* JADX INFO: renamed from: q */
    static String m17379q() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable th) {
            return null;
        }
    }

    /* JADX INFO: renamed from: t */
    static boolean m17382t() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod(EArqVBjecl.LSkkSeS, new Class[0]);
            return nds.class.getName().equals(m17379q());
        } catch (Throwable th) {
            return false;
        }
    }

    @Override // p000.ndk
    /* JADX INFO: renamed from: e */
    protected ncn mo17371e(String str) {
        if (ndv.f42062a.get() != null) {
            return ((ndp) ndv.f42062a.get()).mo17375a(str);
        }
        ndv ndvVar = new ndv(str.replace('$', '.'));
        ndu.f42061a.offer(ndvVar);
        if (ndv.f42062a.get() == null) {
            return ndvVar;
        }
        ndv.m17383e();
        return ndvVar;
    }

    @Override // p000.ndk
    /* JADX INFO: renamed from: h */
    protected ndj mo17372h() {
        return f42060c;
    }

    @Override // p000.ndk
    /* JADX INFO: renamed from: j */
    protected nea mo17373j() {
        return ndw.f42066a;
    }

    @Override // p000.ndk
    /* JADX INFO: renamed from: m */
    protected String mo17374m() {
        return "platform: Android";
    }
}
