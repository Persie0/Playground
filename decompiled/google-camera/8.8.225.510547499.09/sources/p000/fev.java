package p000;

import java.util.Calendar;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fev {

    /* JADX INFO: renamed from: a */
    public static final nbh f21578a = nbh.m17259h("com/google/android/apps/camera/metadata/panorama/PanoMetadata");

    /* JADX INFO: renamed from: b */
    public final boolean f21579b;

    /* JADX INFO: renamed from: c */
    public final int f21580c;

    /* JADX INFO: renamed from: d */
    public final int f21581d;

    /* JADX INFO: renamed from: e */
    public final int f21582e;

    /* JADX INFO: renamed from: f */
    public final int f21583f;

    /* JADX INFO: renamed from: g */
    public final boolean f21584g;

    /* JADX INFO: renamed from: h */
    public final boolean f21585h;

    public fev(int i, int i2) {
        Calendar.getInstance();
        Calendar.getInstance();
        this.f21579b = true;
        this.f21580c = i;
        this.f21581d = i2;
        this.f21582e = i;
        this.f21583f = i2;
        this.f21584g = true;
        this.f21585h = false;
    }

    public fev(boolean z, int i, int i2, int i3, int i4, boolean z2) {
        this.f21579b = z;
        this.f21580c = i;
        this.f21581d = i2;
        this.f21582e = i3;
        this.f21583f = i4;
        this.f21584g = false;
        this.f21585h = z2;
    }

    /* JADX INFO: renamed from: a */
    public static int m8314a(bfd bfdVar, String str) {
        if (bfdVar.mo2294e("http://ns.google.com/photos/1.0/panorama/", str)) {
            return bfdVar.mo2291b("http://ns.google.com/photos/1.0/panorama/", str).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m8315b(bfd bfdVar, String str) {
        if (bfdVar.mo2294e("http://ns.google.com/photos/1.0/panorama/", str)) {
            return ((Boolean) ((bfr) bfdVar).m2324l("http://ns.google.com/photos/1.0/panorama/", str, 1)).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m8316c(double d, double d2, double d3) {
        return Math.abs(d - d2) < d3;
    }

    /* JADX INFO: renamed from: d */
    public static void m8317d(bfd bfdVar, String str) {
        if (bfdVar.mo2294e("http://ns.google.com/photos/1.0/panorama/", str)) {
        }
    }
}
