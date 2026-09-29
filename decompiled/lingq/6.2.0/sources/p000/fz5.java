package p000;

import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class fz5 {

    /* JADX INFO: renamed from: h */
    public static fz5 f39954h;

    /* JADX INFO: renamed from: a */
    public final LayoutDirection f39955a;

    /* JADX INFO: renamed from: b */
    public final vx9 f39956b;

    /* JADX INFO: renamed from: c */
    public final ib2 f39957c;

    /* JADX INFO: renamed from: d */
    public final wa3 f39958d;

    /* JADX INFO: renamed from: e */
    public final vx9 f39959e;

    /* JADX INFO: renamed from: f */
    public float f39960f = Float.NaN;

    /* JADX INFO: renamed from: g */
    public float f39961g = Float.NaN;

    public fz5(LayoutDirection layoutDirection, vx9 vx9Var, ib2 ib2Var, wa3 wa3Var) {
        this.f39955a = layoutDirection;
        this.f39956b = vx9Var;
        this.f39957c = ib2Var;
        this.f39958d = wa3Var;
        this.f39959e = vz1.m23615W(vx9Var, layoutDirection);
    }

    /* JADX INFO: renamed from: a */
    public final long m12251a(int i, long j) {
        int iM3802j;
        float f = this.f39961g;
        float f2 = this.f39960f;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            String str = gz5.f41549a;
            long jM10424b = dk1.m10424b(0, 0, 0, 0, 15);
            vx9 vx9Var = this.f39959e;
            ib2 ib2Var = this.f39957c;
            float fM16239b = AbstractC3584sr.m21628h(str, vx9Var, jM10424b, ib2Var, this.f39958d, 1, 96).m16239b();
            float fM16239b2 = AbstractC3584sr.m21628h(gz5.f41550b, this.f39959e, dk1.m10424b(0, 0, 0, 0, 15), ib2Var, this.f39958d, 2, 96).m16239b() - fM16239b;
            this.f39961g = fM16239b;
            this.f39960f = fM16239b2;
            f2 = fM16239b2;
            f = fM16239b;
        }
        if (i != 1) {
            int iRound = Math.round((f2 * (i - 1)) + f);
            iM3802j = iRound >= 0 ? iRound : 0;
            int iM3800h = bk1.m3800h(j);
            if (iM3802j > iM3800h) {
                iM3802j = iM3800h;
            }
        } else {
            iM3802j = bk1.m3802j(j);
        }
        return dk1.m10423a(bk1.m3803k(j), bk1.m3801i(j), iM3802j, bk1.m3800h(j));
    }
}
