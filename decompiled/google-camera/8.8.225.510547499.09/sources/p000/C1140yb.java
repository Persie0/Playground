package p000;

import androidx.wear.ambient.AmbientDelegate;
import java.util.ArrayList;

/* JADX INFO: renamed from: yb */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class C1140yb {

    /* JADX INFO: renamed from: a */
    C1146yh f48056a = null;

    /* JADX INFO: renamed from: b */
    public float f48057b = 0.0f;

    /* JADX INFO: renamed from: c */
    final ArrayList f48058c = new ArrayList();

    /* JADX INFO: renamed from: d */
    boolean f48059d = false;

    /* JADX INFO: renamed from: e */
    public C1139ya f48060e;

    public C1140yb() {
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m19603l(C1146yh c1146yh) {
        return c1146yh.f48138l <= 1;
    }

    /* JADX INFO: renamed from: a */
    public final C1146yh m19604a(boolean[] zArr, C1146yh c1146yh) {
        int i;
        int i2 = this.f48060e.f48046a;
        C1146yh c1146yh2 = null;
        float f = 0.0f;
        for (int i3 = 0; i3 < i2; i3++) {
            float fM19597b = this.f48060e.m19597b(i3);
            if (fM19597b < 0.0f) {
                C1146yh c1146yhM19599d = this.f48060e.m19599d(i3);
                if ((zArr == null || !zArr[c1146yhM19599d.f48129c]) && c1146yhM19599d != c1146yh && (((i = c1146yhM19599d.f48140n) == 3 || i == 4) && fM19597b < f)) {
                    f = fM19597b;
                    c1146yh2 = c1146yhM19599d;
                }
            }
        }
        return c1146yh2;
    }

    /* JADX INFO: renamed from: b */
    final void m19605b(C1146yh c1146yh) {
        C1146yh c1146yh2 = this.f48056a;
        if (c1146yh2 != null) {
            this.f48060e.m19602g(c1146yh2, -1.0f);
            this.f48056a.f48130d = -1;
            this.f48056a = null;
        }
        float f = -this.f48060e.m19598c(c1146yh, true);
        this.f48056a = c1146yh;
        if (f == 1.0f) {
            return;
        }
        this.f48057b /= f;
        C1139ya c1139ya = this.f48060e;
        int i = c1139ya.f48050e;
        for (int i2 = 0; i != -1 && i2 < c1139ya.f48046a; i2++) {
            float[] fArr = c1139ya.f48049d;
            fArr[i] = fArr[i] / f;
            i = c1139ya.f48048c[i];
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m19606c(C1141yc c1141yc, C1146yh c1146yh, boolean z) {
        if (c1146yh == null || !c1146yh.f48133g) {
            return;
        }
        this.f48057b += c1146yh.f48132f * this.f48060e.m19596a(c1146yh);
        this.f48060e.m19598c(c1146yh, z);
        if (z) {
            c1146yh.m19640b(this);
        }
        if (this.f48060e.f48046a == 0) {
            this.f48059d = true;
            c1141yc.f48065d = true;
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo19607d(C1141yc c1141yc, C1140yb c1140yb, boolean z) {
        C1139ya c1139ya = this.f48060e;
        float fM19596a = c1139ya.m19596a(c1140yb.f48056a);
        c1139ya.m19598c(c1140yb.f48056a, z);
        C1139ya c1139ya2 = c1140yb.f48060e;
        int i = c1139ya2.f48046a;
        for (int i2 = 0; i2 < i; i2++) {
            C1146yh c1146yhM19599d = c1139ya2.m19599d(i2);
            c1139ya.m19600e(c1146yhM19599d, c1139ya2.m19596a(c1146yhM19599d) * fM19596a, z);
        }
        this.f48057b += c1140yb.f48057b * fM19596a;
        if (z) {
            c1140yb.f48056a.m19640b(this);
        }
        if (this.f48056a == null || this.f48060e.f48046a != 0) {
            return;
        }
        this.f48059d = true;
        c1141yc.f48065d = true;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo19608e() {
        return this.f48056a == null && this.f48057b == 0.0f && this.f48060e.f48046a == 0;
    }

    /* JADX INFO: renamed from: f */
    public final void m19609f(C1141yc c1141yc, int i) {
        this.f48060e.m19602g(c1141yc.m19636p(i), 1.0f);
        this.f48060e.m19602g(c1141yc.m19636p(i), -1.0f);
    }

    /* JADX INFO: renamed from: g */
    public final void m19610g(C1146yh c1146yh, C1146yh c1146yh2, C1146yh c1146yh3, C1146yh c1146yh4, float f) {
        this.f48060e.m19602g(c1146yh, -1.0f);
        this.f48060e.m19602g(c1146yh2, 1.0f);
        this.f48060e.m19602g(c1146yh3, f);
        this.f48060e.m19602g(c1146yh4, -f);
    }

    /* JADX INFO: renamed from: h */
    public final void m19611h(C1146yh c1146yh, C1146yh c1146yh2, C1146yh c1146yh3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.f48057b = i;
            if (z) {
                this.f48060e.m19602g(c1146yh, 1.0f);
                this.f48060e.m19602g(c1146yh2, -1.0f);
                this.f48060e.m19602g(c1146yh3, -1.0f);
                return;
            }
        }
        this.f48060e.m19602g(c1146yh, -1.0f);
        this.f48060e.m19602g(c1146yh2, 1.0f);
        this.f48060e.m19602g(c1146yh3, 1.0f);
    }

    /* JADX INFO: renamed from: i */
    public final void m19612i(C1146yh c1146yh, C1146yh c1146yh2, C1146yh c1146yh3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.f48057b = i;
            if (z) {
                this.f48060e.m19602g(c1146yh, 1.0f);
                this.f48060e.m19602g(c1146yh2, -1.0f);
                this.f48060e.m19602g(c1146yh3, 1.0f);
                return;
            }
        }
        this.f48060e.m19602g(c1146yh, -1.0f);
        this.f48060e.m19602g(c1146yh2, 1.0f);
        this.f48060e.m19602g(c1146yh3, -1.0f);
    }

    /* JADX INFO: renamed from: j */
    public final void m19613j(C1146yh c1146yh, C1146yh c1146yh2, C1146yh c1146yh3, C1146yh c1146yh4, float f) {
        this.f48060e.m19602g(c1146yh3, 0.5f);
        this.f48060e.m19602g(c1146yh4, 0.5f);
        this.f48060e.m19602g(c1146yh, -0.5f);
        this.f48060e.m19602g(c1146yh2, -0.5f);
        this.f48057b = -f;
    }

    /* JADX INFO: renamed from: k */
    public C1146yh mo19614k(boolean[] zArr) {
        return m19604a(zArr, null);
    }

    public String toString() {
        String strConcat;
        boolean z;
        String str;
        if (this.f48056a == null) {
            strConcat = "0";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("");
            C1146yh c1146yh = this.f48056a;
            sb.append(c1146yh);
            strConcat = "".concat(String.valueOf(c1146yh));
        }
        float f = this.f48057b;
        String strConcat2 = strConcat.concat(" = ");
        if (f != 0.0f) {
            strConcat2 = strConcat2 + this.f48057b;
            z = true;
        } else {
            z = false;
        }
        int i = this.f48060e.f48046a;
        for (int i2 = 0; i2 < i; i2++) {
            C1146yh c1146yhM19599d = this.f48060e.m19599d(i2);
            if (c1146yhM19599d != null) {
                float fM19597b = this.f48060e.m19597b(i2);
                if (fM19597b != 0.0f) {
                    String string = c1146yhM19599d.toString();
                    if (z) {
                        if (fM19597b > 0.0f) {
                            str = " + ";
                        } else {
                            fM19597b = -fM19597b;
                            str = " - ";
                        }
                        strConcat2 = strConcat2.concat(str);
                    } else if (fM19597b < 0.0f) {
                        fM19597b = -fM19597b;
                        strConcat2 = strConcat2.concat("- ");
                    }
                    strConcat2 = fM19597b == 1.0f ? strConcat2.concat(string) : strConcat2 + fM19597b + " " + string;
                    z = true;
                }
            }
        }
        return !z ? strConcat2.concat("0.0") : strConcat2;
    }

    public C1140yb(AmbientDelegate ambientDelegate, byte[] bArr, byte[] bArr2) {
        this.f48060e = new C1139ya(this, ambientDelegate, null, null);
    }
}
