package p000;

import androidx.wear.ambient.AmbientDelegate;
import java.util.Arrays;

/* JADX INFO: renamed from: yg */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1145yg extends C1140yb {

    /* JADX INFO: renamed from: f */
    public int f48123f;

    /* JADX INFO: renamed from: g */
    final C1144yf f48124g;

    /* JADX INFO: renamed from: h */
    private C1146yh[] f48125h;

    /* JADX INFO: renamed from: i */
    private C1146yh[] f48126i;

    public C1145yg(AmbientDelegate ambientDelegate, byte[] bArr, byte[] bArr2) {
        super(ambientDelegate, null, null);
        this.f48125h = new C1146yh[128];
        this.f48126i = new C1146yh[128];
        this.f48123f = 0;
        this.f48124g = new C1144yf(this);
    }

    @Override // p000.C1140yb
    /* JADX INFO: renamed from: d */
    public final void mo19607d(C1141yc c1141yc, C1140yb c1140yb, boolean z) {
        C1146yh c1146yh = c1140yb.f48056a;
        if (c1146yh == null) {
            return;
        }
        C1139ya c1139ya = c1140yb.f48060e;
        int i = c1139ya.f48046a;
        for (int i2 = 0; i2 < i; i2++) {
            C1146yh c1146yhM19599d = c1139ya.m19599d(i2);
            float fM19597b = c1139ya.m19597b(i2);
            C1144yf c1144yf = this.f48124g;
            c1144yf.f48121a = c1146yhM19599d;
            if (c1144yf.f48121a.f48128b) {
                boolean z2 = true;
                for (int i3 = 0; i3 < 9; i3++) {
                    float[] fArr = c1144yf.f48121a.f48135i;
                    float f = fArr[i3] + (c1146yh.f48135i[i3] * fM19597b);
                    fArr[i3] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        c1144yf.f48121a.f48135i[i3] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    c1144yf.f48122b.m19638n(c1144yf.f48121a);
                }
            } else {
                for (int i4 = 0; i4 < 9; i4++) {
                    float f2 = c1146yh.f48135i[i4];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fM19597b;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        c1144yf.f48121a.f48135i[i4] = f3;
                    } else {
                        c1144yf.f48121a.f48135i[i4] = 0.0f;
                    }
                }
                m19637m(c1146yhM19599d);
            }
            this.f48057b += c1140yb.f48057b * fM19597b;
        }
        m19638n(c1146yh);
    }

    @Override // p000.C1140yb
    /* JADX INFO: renamed from: e */
    public final boolean mo19608e() {
        return this.f48123f == 0;
    }

    @Override // p000.C1140yb
    /* JADX INFO: renamed from: k */
    public final C1146yh mo19614k(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f48123f; i2++) {
            C1146yh[] c1146yhArr = this.f48125h;
            C1146yh c1146yh = c1146yhArr[i2];
            if (!zArr[c1146yh.f48129c]) {
                C1144yf c1144yf = this.f48124g;
                c1144yf.f48121a = c1146yh;
                int i3 = 8;
                if (i != -1) {
                    C1146yh c1146yh2 = c1146yhArr[i];
                    while (i3 >= 0) {
                        float f = c1146yh2.f48135i[i3];
                        float f2 = c1144yf.f48121a.f48135i[i3];
                        if (f2 != f) {
                            if (f2 >= f) {
                                break;
                            }
                            i = i2;
                            break;
                            break;
                        }
                        i3--;
                    }
                } else {
                    while (i3 >= 0) {
                        float f3 = c1144yf.f48121a.f48135i[i3];
                        if (f3 > 0.0f) {
                            break;
                        }
                        if (f3 < 0.0f) {
                            i = i2;
                            break;
                        }
                        i3--;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f48125h[i];
    }

    /* JADX INFO: renamed from: m */
    public final void m19637m(C1146yh c1146yh) {
        int i;
        int i2 = this.f48123f + 1;
        C1146yh[] c1146yhArr = this.f48125h;
        int length = c1146yhArr.length;
        if (i2 > length) {
            C1146yh[] c1146yhArr2 = (C1146yh[]) Arrays.copyOf(c1146yhArr, length + length);
            this.f48125h = c1146yhArr2;
            int length2 = c1146yhArr2.length;
            this.f48126i = (C1146yh[]) Arrays.copyOf(c1146yhArr2, length2 + length2);
        }
        C1146yh[] c1146yhArr3 = this.f48125h;
        int i3 = this.f48123f;
        c1146yhArr3[i3] = c1146yh;
        int i4 = i3 + 1;
        this.f48123f = i4;
        if (i4 > 1 && c1146yhArr3[i4 - 1].f48129c > c1146yh.f48129c) {
            int i5 = 0;
            while (true) {
                i = this.f48123f;
                if (i5 >= i) {
                    break;
                }
                this.f48126i[i5] = this.f48125h[i5];
                i5++;
            }
            Arrays.sort(this.f48126i, 0, i, new C1143ye(0));
            for (int i6 = 0; i6 < this.f48123f; i6++) {
                this.f48125h[i6] = this.f48126i[i6];
            }
        }
        c1146yh.f48128b = true;
        c1146yh.m19639a(this);
    }

    /* JADX INFO: renamed from: n */
    public final void m19638n(C1146yh c1146yh) {
        int i = 0;
        while (i < this.f48123f) {
            if (this.f48125h[i] == c1146yh) {
                while (true) {
                    int i2 = this.f48123f - 1;
                    if (i >= i2) {
                        this.f48123f = i2;
                        c1146yh.f48128b = false;
                        return;
                    } else {
                        C1146yh[] c1146yhArr = this.f48125h;
                        int i3 = i + 1;
                        c1146yhArr[i] = c1146yhArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // p000.C1140yb
    public final String toString() {
        String str = " goal -> (" + this.f48057b + ") : ";
        for (int i = 0; i < this.f48123f; i++) {
            this.f48124g.f48121a = this.f48125h[i];
            str = str + this.f48124g + " ";
        }
        return str;
    }
}
