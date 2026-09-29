package p000;

import androidx.media3.common.C0713b;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class sq3 implements yo2 {

    /* JADX INFO: renamed from: a */
    public final eu8 f61223a;

    /* JADX INFO: renamed from: b */
    public String f61224b;

    /* JADX INFO: renamed from: c */
    public n8a f61225c;

    /* JADX INFO: renamed from: d */
    public rq3 f61226d;

    /* JADX INFO: renamed from: e */
    public boolean f61227e;

    /* JADX INFO: renamed from: l */
    public long f61234l;

    /* JADX INFO: renamed from: f */
    public final boolean[] f61228f = new boolean[3];

    /* JADX INFO: renamed from: g */
    public final e76 f61229g = new e76(32);

    /* JADX INFO: renamed from: h */
    public final e76 f61230h = new e76(33);

    /* JADX INFO: renamed from: i */
    public final e76 f61231i = new e76(34);

    /* JADX INFO: renamed from: j */
    public final e76 f61232j = new e76(39);

    /* JADX INFO: renamed from: k */
    public final e76 f61233k = new e76(40);

    /* JADX INFO: renamed from: m */
    public long f61235m = -9223372036854775807L;

    /* JADX INFO: renamed from: n */
    public final k47 f61236n = new k47();

    public sq3(eu8 eu8Var) {
        this.f61223a = eu8Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m21547a(int i, int i2, long j, long j2) {
        g68 g68Var = this.f61223a.f37872d;
        rq3 rq3Var = this.f61226d;
        boolean z = this.f61227e;
        if (rq3Var.f59713j && rq3Var.f59710g) {
            rq3Var.f59716m = rq3Var.f59706c;
            rq3Var.f59713j = false;
        } else if (rq3Var.f59711h || rq3Var.f59710g) {
            if (z && rq3Var.f59712i) {
                rq3Var.m20744a(i + ((int) (j - rq3Var.f59705b)));
            }
            rq3Var.f59714k = rq3Var.f59705b;
            rq3Var.f59715l = rq3Var.f59708e;
            rq3Var.f59716m = rq3Var.f59706c;
            rq3Var.f59712i = true;
        }
        if (!this.f61227e) {
            e76 e76Var = this.f61229g;
            e76Var.m10907b(i2);
            e76 e76Var2 = this.f61230h;
            e76Var2.m10907b(i2);
            e76 e76Var3 = this.f61231i;
            e76Var3.m10907b(i2);
            if (e76Var.f36813c && e76Var2.f36813c && e76Var3.f36813c) {
                String str = this.f61224b;
                int i3 = e76Var.f36815e;
                byte[] bArr = new byte[e76Var2.f36815e + i3 + e76Var3.f36815e];
                System.arraycopy(e76Var.f36814d, 0, bArr, 0, i3);
                System.arraycopy(e76Var2.f36814d, 0, bArr, e76Var.f36815e, e76Var2.f36815e);
                System.arraycopy(e76Var3.f36814d, 0, bArr, e76Var.f36815e + e76Var2.f36815e, e76Var3.f36815e);
                j76 j76VarM25801i = zuc.m25801i(e76Var2.f36814d, 3, e76Var2.f36815e, null);
                g76 g76Var = j76VarM25801i.f45149b;
                String strM16615a = g76Var != null ? m41.m16615a(g76Var.f40325a, g76Var.f40326b, g76Var.f40327c, g76Var.f40328d, g76Var.f40329e, g76Var.f40330f) : null;
                lc3 lc3Var = new lc3();
                lc3Var.f49440a = str;
                lc3Var.f49452m = ez5.m11402l("video/mp2t");
                lc3Var.f49453n = ez5.m11402l("video/hevc");
                lc3Var.f49449j = strM16615a;
                lc3Var.f49460u = j76VarM25801i.f45152e;
                lc3Var.f49461v = j76VarM25801i.f45153f;
                lc3Var.f49462w = j76VarM25801i.f45154g;
                lc3Var.f49463x = j76VarM25801i.f45155h;
                lc3Var.f49428D = new ga1(j76VarM25801i.f45158k, j76VarM25801i.f45159l, j76VarM25801i.f45160m, null, j76VarM25801i.f45150c + 8, j76VarM25801i.f45151d + 8);
                lc3Var.f49425A = j76VarM25801i.f45156i;
                lc3Var.f49455p = j76VarM25801i.f45157j;
                lc3Var.f49429E = j76VarM25801i.f45148a + 1;
                lc3Var.f49456q = Collections.singletonList(bArr);
                C0713b c0713b = new C0713b(lc3Var);
                this.f61225c.mo2537g(c0713b);
                int i4 = c0713b.f6408q;
                bna.m3987z(i4 != -1);
                g68Var.m12384c(i4);
                this.f61227e = true;
            }
        }
        e76 e76Var4 = this.f61232j;
        boolean zM10907b = e76Var4.m10907b(i2);
        k47 k47Var = this.f61236n;
        if (zM10907b) {
            k47Var.m14816K(zuc.m25806n(e76Var4.f36815e, e76Var4.f36814d), e76Var4.f36814d);
            k47Var.m14819N(5);
            g68Var.m12382a(j2, k47Var);
        }
        e76 e76Var5 = this.f61233k;
        if (e76Var5.m10907b(i2)) {
            k47Var.m14816K(zuc.m25806n(e76Var5.f36815e, e76Var5.f36814d), e76Var5.f36814d);
            k47Var.m14819N(5);
            g68Var.m12382a(j2, k47Var);
        }
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: b */
    public final void mo609b(k47 k47Var) {
        int i;
        this.f61225c.getClass();
        String str = uma.f64080a;
        while (k47Var.m14820a() > 0) {
            int i2 = k47Var.f46701b;
            int i3 = k47Var.f46702c;
            byte[] bArr = k47Var.f46700a;
            this.f61234l += (long) k47Var.m14820a();
            this.f61225c.mo2535e(k47Var.m14820a(), k47Var);
            while (i2 < i3) {
                int iM25794b = zuc.m25794b(bArr, i2, i3, this.f61228f);
                if (iM25794b == i3) {
                    m21548c(bArr, i2, i3);
                    return;
                }
                int i4 = (bArr[iM25794b + 3] & 126) >> 1;
                if (iM25794b <= 0 || bArr[iM25794b - 1] != 0) {
                    i = 3;
                } else {
                    iM25794b--;
                    i = 4;
                }
                int i5 = iM25794b;
                int i6 = i;
                int i7 = i5 - i2;
                if (i7 > 0) {
                    m21548c(bArr, i2, i5);
                }
                int i8 = i3 - i5;
                long j = this.f61234l - ((long) i8);
                m21547a(i8, i7 < 0 ? -i7 : 0, j, this.f61235m);
                m21549h(i8, i4, j, this.f61235m);
                i2 = i5 + i6;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m21548c(byte[] bArr, int i, int i2) {
        rq3 rq3Var = this.f61226d;
        if (rq3Var.f59709f) {
            int i3 = rq3Var.f59707d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                rq3Var.f59710g = (bArr[i4] & 128) != 0;
                rq3Var.f59709f = false;
            } else {
                rq3Var.f59707d = (i2 - i) + i3;
            }
        }
        if (!this.f61227e) {
            this.f61229g.m10906a(bArr, i, i2);
            this.f61230h.m10906a(bArr, i, i2);
            this.f61231i.m10906a(bArr, i, i2);
        }
        this.f61232j.m10906a(bArr, i, i2);
        this.f61233k.m10906a(bArr, i, i2);
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: d */
    public final void mo611d() {
        this.f61234l = 0L;
        this.f61235m = -9223372036854775807L;
        zuc.m25793a(this.f61228f);
        this.f61229g.m10908c();
        this.f61230h.m10908c();
        this.f61231i.m10908c();
        this.f61232j.m10908c();
        this.f61233k.m10908c();
        this.f61223a.f37872d.m12383b(0);
        rq3 rq3Var = this.f61226d;
        if (rq3Var != null) {
            rq3Var.f59709f = false;
            rq3Var.f59710g = false;
            rq3Var.f59711h = false;
            rq3Var.f59712i = false;
            rq3Var.f59713j = false;
        }
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: e */
    public final void mo612e(boolean z) {
        this.f61225c.getClass();
        String str = uma.f64080a;
        if (z) {
            this.f61223a.f37872d.m12383b(0);
            m21547a(0, 0, this.f61234l, this.f61235m);
            m21549h(0, 48, this.f61234l, this.f61235m);
        }
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: f */
    public final void mo613f(int i, long j) {
        this.f61235m = j;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: g */
    public final void mo614g(jy2 jy2Var, mca mcaVar) {
        mcaVar.m16767a();
        mcaVar.m16768b();
        this.f61224b = mcaVar.f51087e;
        mcaVar.m16768b();
        n8a n8aVarMo2555n = jy2Var.mo2555n(mcaVar.f51086d, 2);
        this.f61225c = n8aVarMo2555n;
        this.f61226d = new rq3(n8aVarMo2555n);
        this.f61223a.m11345b(jy2Var, mcaVar);
    }

    /* JADX INFO: renamed from: h */
    public final void m21549h(int i, int i2, long j, long j2) {
        rq3 rq3Var = this.f61226d;
        boolean z = this.f61227e;
        rq3Var.f59710g = false;
        rq3Var.f59711h = false;
        rq3Var.f59708e = j2;
        rq3Var.f59707d = 0;
        rq3Var.f59705b = j;
        if (i2 >= 32 && i2 != 40) {
            if (rq3Var.f59712i && !rq3Var.f59713j) {
                if (z) {
                    rq3Var.m20744a(i);
                }
                rq3Var.f59712i = false;
            }
            if ((32 <= i2 && i2 <= 35) || i2 == 39) {
                rq3Var.f59711h = !rq3Var.f59713j;
                rq3Var.f59713j = true;
            }
        }
        boolean z2 = i2 >= 16 && i2 <= 21;
        rq3Var.f59706c = z2;
        rq3Var.f59709f = z2 || i2 <= 9;
        if (!this.f61227e) {
            this.f61229g.m10909d(i2);
            this.f61230h.m10909d(i2);
            this.f61231i.m10909d(i2);
        }
        this.f61232j.m10909d(i2);
        this.f61233k.m10909d(i2);
    }
}
