package p000;

import com.google.android.libraries.camera.jni.graphics.bVLS.aJFPpVSaoDO;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nsh {

    /* JADX INFO: renamed from: a */
    public static final nsh f44393a;

    /* JADX INFO: renamed from: b */
    public static final nsh f44394b;

    /* JADX INFO: renamed from: c */
    public static final nsh f44395c;

    /* JADX INFO: renamed from: e */
    private static final nsh[] f44396e;

    /* JADX INFO: renamed from: f */
    private static int f44397f;

    /* JADX INFO: renamed from: d */
    public final int f44398d;

    /* JADX INFO: renamed from: g */
    private final String f44399g;

    static {
        nsh nshVar = new nsh();
        f44393a = nshVar;
        nsh nshVar2 = new nsh("kNv12");
        f44394b = nshVar2;
        nsh nshVar3 = new nsh("kNv21");
        f44395c = nshVar3;
        f44396e = new nsh[]{nshVar, nshVar2, nshVar3};
        f44397f = 0;
    }

    private nsh() {
        this.f44399g = "kInvalid";
        this.f44398d = 0;
        f44397f = 1;
    }

    private nsh(String str) {
        this.f44399g = str;
        int i = f44397f;
        f44397f = i + 1;
        this.f44398d = i;
    }

    /* JADX INFO: renamed from: a */
    public static nsh m17644a(int i) {
        nsh[] nshVarArr = f44396e;
        int i2 = 0;
        if (i < 3 && i >= 0) {
            nsh nshVar = nshVarArr[i];
            if (nshVar.f44398d == i) {
                return nshVar;
            }
        }
        while (true) {
            nsh[] nshVarArr2 = f44396e;
            if (i2 >= 3) {
                throw new IllegalArgumentException(aJFPpVSaoDO.XHzWturHXpRR + nsh.class.toString() + " with value " + i);
            }
            nsh nshVar2 = nshVarArr2[i2];
            if (nshVar2.f44398d == i) {
                return nshVar2;
            }
            i2++;
        }
    }

    public final String toString() {
        return this.f44399g;
    }
}
