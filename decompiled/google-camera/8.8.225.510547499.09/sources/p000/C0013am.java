package p000;

import com.google.android.apps.camera.app.silentfeedback.p004ip.TVkaNXnfP;
import com.google.android.libraries.camera.jni.graphics.bVLS.aJFPpVSaoDO;
import java.util.HashSet;

/* JADX INFO: renamed from: am */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0013am {

    /* JADX INFO: renamed from: a */
    final C0014an f671a;

    /* JADX INFO: renamed from: b */
    C0013am f672b;

    /* JADX INFO: renamed from: f */
    public C0012al f676f;

    /* JADX INFO: renamed from: g */
    final int f677g;

    /* JADX INFO: renamed from: c */
    public int f673c = 0;

    /* JADX INFO: renamed from: d */
    int f674d = -1;

    /* JADX INFO: renamed from: h */
    public int f678h = 1;

    /* JADX INFO: renamed from: i */
    public int f679i = 1;

    /* JADX INFO: renamed from: e */
    public int f675e = 0;

    public C0013am(C0014an c0014an, int i) {
        this.f671a = c0014an;
        this.f677g = i;
    }

    /* JADX INFO: renamed from: f */
    private final String m926f(HashSet hashSet) {
        String strConcat;
        if (!hashSet.add(this)) {
            return TVkaNXnfP.kXtoT;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("null:");
        sb.append(C0121d.m5783e(this.f677g));
        C0013am c0013am = this.f672b;
        if (c0013am != null) {
            strConcat = aJFPpVSaoDO.jCt.concat(c0013am.m926f(hashSet));
        } else {
            strConcat = "";
        }
        sb.append(strConcat);
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public final int m927a() {
        C0013am c0013am;
        if (this.f671a.f788K == 8) {
            return 0;
        }
        int i = this.f674d;
        return (i < 0 || (c0013am = this.f672b) == null || c0013am.f671a.f788K != 8) ? this.f673c : i;
    }

    /* JADX INFO: renamed from: b */
    public final void m928b() {
        this.f672b = null;
        this.f673c = 0;
        this.f674d = -1;
        this.f678h = 2;
        this.f675e = 0;
        this.f679i = 1;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m929c() {
        return this.f672b != null;
    }

    /* JADX INFO: renamed from: d */
    public final void m930d(C0013am c0013am, int i, int i2, int i3, int i4, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (c0013am == null) {
            this.f672b = null;
            this.f673c = 0;
            this.f674d = -1;
            this.f678h = 1;
            this.f675e = 2;
            return;
        }
        if (!z) {
            int i5 = c0013am.f677g;
            int i6 = this.f677g;
            if (i5 != i6) {
                switch (i6 - 1) {
                    case 1:
                    case 3:
                        if (i5 == 2) {
                            z2 = true;
                        } else if (i5 == 4) {
                            i5 = 4;
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!(c0013am.f671a instanceof C0043ap)) {
                            z4 = z2;
                        } else if (!z2 && i5 != 8) {
                            z4 = false;
                        }
                        if (!z4) {
                        }
                        break;
                    case 2:
                    case 4:
                        if (i5 == 3) {
                            z3 = true;
                        } else if (i5 == 5) {
                            i5 = 5;
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!(c0013am.f671a instanceof C0043ap)) {
                            z4 = z3;
                        } else if (!z3 && i5 != 9) {
                            z4 = false;
                        }
                        if (!z4) {
                        }
                        break;
                    case 6:
                        if (i5 == 6 || i5 == 8 || i5 == 9) {
                        }
                        break;
                }
                return;
            }
            if (i6 == 7) {
                return;
            }
            if (i6 == 6 && (!c0013am.f671a.m1004r() || !this.f671a.m1004r())) {
                return;
            }
        }
        this.f672b = c0013am;
        if (i > 0) {
            this.f673c = i;
        } else {
            this.f673c = 0;
        }
        this.f674d = i2;
        this.f678h = i3;
        this.f675e = i4;
    }

    /* JADX INFO: renamed from: e */
    public final void m931e() {
        C0012al c0012al = this.f676f;
        if (c0012al == null) {
            this.f676f = new C0012al(1);
        } else {
            c0012al.m892b();
        }
    }

    public final String toString() {
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        sb.append("null:");
        sb.append(C0121d.m5783e(this.f677g));
        C0013am c0013am = this.f672b;
        sb.append(c0013am != null ? " connected to ".concat(c0013am.m926f(hashSet)) : "");
        return sb.toString();
    }
}
