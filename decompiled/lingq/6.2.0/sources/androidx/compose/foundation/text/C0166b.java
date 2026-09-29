package androidx.compose.foundation.text;

import androidx.compose.foundation.relocation.C0154a;
import androidx.compose.foundation.text.selection.C0205f;
import androidx.compose.p002ui.layout.AbstractC0334a;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import p000.AbstractC3423or;
import p000.C2951e4;
import p000.C3386nv;
import p000.C3419on;
import p000.a5b;
import p000.aa4;
import p000.aq4;
import p000.bk1;
import p000.cx9;
import p000.dk1;
import p000.fa4;
import p000.fb2;
import p000.ht5;
import p000.it5;
import p000.jc9;
import p000.jt5;
import p000.l70;
import p000.lda;
import p000.mq6;
import p000.nw4;
import p000.qw9;
import p000.rw9;
import p000.sw9;
import p000.un1;
import p000.ut9;
import p000.vi3;
import p000.vv9;
import p000.vx9;
import p000.w41;
import p000.w46;
import p000.wa3;
import p000.wfb;
import p000.xc9;
import p000.xj2;
import p000.xwc;
import p000.yw4;

/* JADX INFO: renamed from: androidx.compose.foundation.text.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0166b implements ht5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ yw4 f2839a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0205f f2840b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a5b f2841c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ un1 f2842d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ vi3 f2843e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ vv9 f2844f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ mq6 f2845g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ fb2 f2846h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0154a f2847i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f2848j;

    public C0166b(yw4 yw4Var, C0205f c0205f, a5b a5bVar, un1 un1Var, vi3 vi3Var, vv9 vv9Var, mq6 mq6Var, fb2 fb2Var, C0154a c0154a, int i) {
        this.f2839a = yw4Var;
        this.f2840b = c0205f;
        this.f2841c = a5bVar;
        this.f2842d = un1Var;
        this.f2843e = vi3Var;
        this.f2844f = vv9Var;
        this.f2845g = mq6Var;
        this.f2846h = fb2Var;
        this.f2847i = c0154a;
        this.f2848j = i;
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: a */
    public final int mo737a(aa4 aa4Var, List list, int i) {
        yw4 yw4Var = this.f2839a;
        yw4Var.f70569a.m22911a(aa4Var.getLayoutDirection());
        w41 w41Var = yw4Var.f70569a.f64349j;
        if (w41Var != null) {
            return xwc.m24773k(w41Var.mo13026c());
        }
        C3386nv.m17633t("layoutIntrinsics must be called first");
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x024a  */
    /* JADX WARN: Code duplicated, block: B:104:0x0251  */
    /* JADX WARN: Code duplicated, block: B:105:0x025d  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:96:0x0224  */
    /* JADX WARN: Code duplicated, block: B:99:0x022f  */
    @Override // p000.ht5
    /* JADX INFO: renamed from: b */
    public final it5 mo738b(jt5 jt5Var, List list, long j) {
        rw9 rw9Var;
        LayoutDirection layoutDirection;
        rw9 rw9Var2;
        rw9 rw9Var3;
        C0166b c0166b;
        int iM24773k;
        aq4 aq4Var;
        C0205f c0205f;
        C3419on c3419on;
        qw9 qw9Var;
        yw4 yw4Var = this.f2839a;
        jc9 jc9VarM16139y = lda.m16139y();
        vi3 vi3VarMo3163e = jc9VarM16139y != null ? jc9VarM16139y.mo3163e() : null;
        jc9 jc9VarM16106F = lda.m16106F(jc9VarM16139y);
        try {
            sw9 sw9VarM25363d = yw4Var.m25363d();
            lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
            rw9 rw9Var4 = sw9VarM25363d != null ? sw9VarM25363d.f61519a : null;
            ut9 ut9Var = yw4Var.f70569a;
            LayoutDirection layoutDirection2 = jt5Var.getLayoutDirection();
            int i = ut9Var.f64345f;
            boolean z = ut9Var.f64344e;
            int i2 = ut9Var.f64342c;
            if (rw9Var4 != null) {
                w46 w46Var = rw9Var4.f59976b;
                qw9 qw9Var2 = rw9Var4.f59975a;
                C3419on c3419on2 = ut9Var.f64340a;
                vx9 vx9Var = ut9Var.f64341b;
                List list2 = ut9Var.f64348i;
                fb2 fb2Var = ut9Var.f64346g;
                wa3 wa3Var = ut9Var.f64347h;
                rw9 rw9Var5 = rw9Var4;
                if (!w46Var.f66376a.mo13024a()) {
                    C3419on c3419on3 = qw9Var2.f58295a;
                    long j2 = qw9Var2.f58304j;
                    if (fa4.m11650l(c3419on3, c3419on2) && qw9Var2.f58296b.m23587d(vx9Var) && fa4.m11650l(qw9Var2.f58297c, list2) && qw9Var2.f58298d == i2 && qw9Var2.f58299e == z && qw9Var2.f58300f == i && fa4.m11650l(qw9Var2.f58301g, fb2Var)) {
                        layoutDirection = layoutDirection2;
                        if (qw9Var2.f58302h == layoutDirection && fa4.m11650l(qw9Var2.f58303i, wa3Var) && bk1.m3803k(j) == bk1.m3803k(j2) && ((!z && i != 2) || (bk1.m3801i(j) == bk1.m3801i(j2) && bk1.m3800h(j) == bk1.m3800h(j2)))) {
                            rw9Var = rw9Var5;
                            rw9Var2 = new rw9(new qw9(qw9Var2.f58295a, ut9Var.f64341b, qw9Var2.f58297c, qw9Var2.f58298d, qw9Var2.f58299e, qw9Var2.f58300f, qw9Var2.f58301g, qw9Var2.f58302h, qw9Var2.f58303i, j), w46Var, dk1.m10426d(j, (((long) xwc.m24773k(w46Var.f66380e)) & 4294967295L) | (((long) xwc.m24773k(w46Var.f66379d)) << 32)));
                        }
                    } else {
                        j = j;
                        rw9Var = rw9Var5;
                        layoutDirection = layoutDirection2;
                    }
                    long j3 = rw9Var2.f59977c;
                    Integer numValueOf = Integer.valueOf((int) (j3 >> 32));
                    Integer numValueOf2 = Integer.valueOf((int) (j3 & 4294967295L));
                    int iIntValue = numValueOf.intValue();
                    int iIntValue2 = numValueOf2.intValue();
                    rw9Var3 = rw9Var;
                    if (fa4.m11650l(rw9Var3, rw9Var2)) {
                        c0166b = this;
                    } else {
                        if (sw9VarM25363d != null) {
                            aq4Var = sw9VarM25363d.f61521c;
                        } else {
                            aq4Var = null;
                        }
                        ((xc9) yw4Var.f70577i).setValue(new sw9(rw9Var2, aq4Var));
                        yw4Var.f70584p = false;
                        c0166b = this;
                        c0205f = c0166b.f2840b;
                        if (c0205f.m1111l() && c0205f.m1110k() && ((nw4) c0166b.f2841c).m17655b() && cx9.m9921c(((cx9) ((xc9) yw4Var.f70567A).getValue()).f34694a) && cx9.m9921c(((cx9) ((xc9) yw4Var.f70568B).getValue()).f34694a) && yw4Var.m25361b()) {
                            if (rw9Var3 != null || (qw9Var = rw9Var3.f59975a) == null) {
                                c3419on = null;
                            } else {
                                c3419on = qw9Var.f58295a;
                            }
                            if (!fa4.m11650l(c3419on, rw9Var2.f59975a.f58295a)) {
                                wfb.m23926u(c0166b.f2842d, null, null, new CoreTextFieldKt$CoreTextField$8$1$1$2$measure$1(c0205f, c0166b.f2847i, null), 3);
                            }
                        }
                        c0166b.f2843e.invoke(rw9Var2);
                        AbstractC0176d.m1074g(yw4Var, c0166b.f2844f, c0166b.f2845g);
                    }
                    if (c0166b.f2848j == 1) {
                        iM24773k = xwc.m24773k(rw9Var2.f59976b.m23741b(0));
                    } else {
                        iM24773k = 0;
                    }
                    ((xc9) yw4Var.f70575g).setValue(new xj2(c0166b.f2846h.mo905T(iM24773k)));
                    return jt5Var.mo9895M0(iIntValue, iIntValue2, AbstractC3194a.m15365R(new Pair(AbstractC0334a.f4179a, Integer.valueOf(Math.round(rw9Var2.f59978d))), new Pair(AbstractC0334a.f4180b, Integer.valueOf(Math.round(rw9Var2.f59979e)))), new C2951e4(29));
                }
                layoutDirection = layoutDirection2;
                rw9Var = rw9Var5;
            } else {
                j = j;
                rw9Var = rw9Var4;
                layoutDirection = layoutDirection2;
            }
            ut9Var.m22911a(layoutDirection);
            int iM3803k = bk1.m3803k(j);
            int iM3801i = ((z || i == 2) && bk1.m3797e(j)) ? bk1.m3801i(j) : Integer.MAX_VALUE;
            int i3 = (z || i != 2) ? i2 : 1;
            if (iM3803k != iM3801i) {
                w41 w41Var = ut9Var.f64349j;
                if (w41Var == null) {
                    C3386nv.m17633t("layoutIntrinsics must be called first");
                    return null;
                }
                iM3801i = l70.m15945h(xwc.m24773k(w41Var.mo13026c()), iM3803k, iM3801i);
            }
            w41 w41Var2 = ut9Var.f64349j;
            if (w41Var2 == null) {
                C3386nv.m17633t("layoutIntrinsics must be called first");
                return null;
            }
            w46 w46Var2 = new w46(w41Var2, AbstractC3423or.m18278s(0, iM3801i, 0, bk1.m3800h(j)), i3, ut9Var.f64345f);
            rw9Var2 = new rw9(new qw9(ut9Var.f64340a, ut9Var.f64341b, ut9Var.f64348i, ut9Var.f64342c, ut9Var.f64344e, ut9Var.f64345f, ut9Var.f64346g, layoutDirection, ut9Var.f64347h, j), w46Var2, dk1.m10426d(j, (((long) xwc.m24773k(w46Var2.f66379d)) << 32) | (((long) xwc.m24773k(w46Var2.f66380e)) & 4294967295L)));
            long j4 = rw9Var2.f59977c;
            Integer numValueOf3 = Integer.valueOf((int) (j4 >> 32));
            Integer numValueOf4 = Integer.valueOf((int) (j4 & 4294967295L));
            int iIntValue3 = numValueOf3.intValue();
            int iIntValue4 = numValueOf4.intValue();
            rw9Var3 = rw9Var;
            if (fa4.m11650l(rw9Var3, rw9Var2)) {
                if (sw9VarM25363d != null) {
                    aq4Var = sw9VarM25363d.f61521c;
                } else {
                    aq4Var = null;
                }
                ((xc9) yw4Var.f70577i).setValue(new sw9(rw9Var2, aq4Var));
                yw4Var.f70584p = false;
                c0166b = this;
                c0205f = c0166b.f2840b;
                if (c0205f.m1111l()) {
                    if (rw9Var3 != null) {
                        c3419on = null;
                    } else {
                        c3419on = null;
                    }
                    if (!fa4.m11650l(c3419on, rw9Var2.f59975a.f58295a)) {
                        wfb.m23926u(c0166b.f2842d, null, null, new CoreTextFieldKt$CoreTextField$8$1$1$2$measure$1(c0205f, c0166b.f2847i, null), 3);
                    }
                }
                c0166b.f2843e.invoke(rw9Var2);
                AbstractC0176d.m1074g(yw4Var, c0166b.f2844f, c0166b.f2845g);
            } else {
                c0166b = this;
            }
            if (c0166b.f2848j == 1) {
                iM24773k = xwc.m24773k(rw9Var2.f59976b.m23741b(0));
            } else {
                iM24773k = 0;
            }
            ((xc9) yw4Var.f70575g).setValue(new xj2(c0166b.f2846h.mo905T(iM24773k)));
            return jt5Var.mo9895M0(iIntValue3, iIntValue4, AbstractC3194a.m15365R(new Pair(AbstractC0334a.f4179a, Integer.valueOf(Math.round(rw9Var2.f59978d))), new Pair(AbstractC0334a.f4180b, Integer.valueOf(Math.round(rw9Var2.f59979e)))), new C2951e4(29));
        } catch (Throwable th) {
            lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
            throw th;
        }
    }
}
