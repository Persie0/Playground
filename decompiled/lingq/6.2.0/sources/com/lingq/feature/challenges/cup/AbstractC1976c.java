package com.lingq.feature.challenges.cup;

import android.content.Context;
import androidx.compose.animation.AbstractC0072k;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.material3.C0232g0;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.runtime.internal.C0282a;
import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.core.domain.model.cup.CupPrizeSource;
import com.lingq.feature.challenges.R$string;
import com.lingq.feature.challenges.cup.AbstractC1976c;
import com.lingq.feature.challenges.cup.data.CupLeaderboardTab;
import com.lingq.feature.challenges.cup.data.CupPhase;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import kotlin.Result;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.FunctionReference;
import p000.AbstractC3352my;
import p000.AbstractC3393o1;
import p000.AbstractC3584sr;
import p000.C2956e9;
import p000.C3180kd;
import p000.C3187kk;
import p000.C3341mn;
import p000.C3357n2;
import p000.C3368nd;
import p000.C3386nv;
import p000.C3419on;
import p000.C3441oz;
import p000.C3456pd;
import p000.C3485q5;
import p000.C3522r4;
import p000.C3598t4;
import p000.C3661uu;
import p000.C3836zk;
import p000.aa1;
import p000.ab1;
import p000.aj3;
import p000.as4;
import p000.au3;
import p000.b16;
import p000.b34;
import p000.bb1;
import p000.bc3;
import p000.bna;
import p000.c81;
import p000.c99;
import p000.ci8;
import p000.cu1;
import p000.d32;
import p000.d7d;
import p000.db1;
import p000.dh9;
import p000.dq0;
import p000.du1;
import p000.dua;
import p000.e16;
import p000.e65;
import p000.ec0;
import p000.eq0;
import p000.eu1;
import p000.f7d;
import p000.f91;
import p000.fad;
import p000.fe9;
import p000.fu1;
import p000.fy9;
import p000.fz1;
import p000.g54;
import p000.g61;
import p000.ge9;
import p000.gm5;
import p000.gr3;
import p000.gu1;
import p000.he9;
import p000.hpb;
import p000.ht5;
import p000.hu1;
import p000.hv1;
import p000.ik0;
import p000.ju1;
import p000.jv1;
import p000.kg9;
import p000.ks9;
import p000.l77;
import p000.lv1;
import p000.lw1;
import p000.lw9;
import p000.ms5;
import p000.mw1;
import p000.nj0;
import p000.oha;
import p000.or1;
import p000.ot1;
import p000.ow1;
import p000.ox1;
import p000.p58;
import p000.p84;
import p000.pb1;
import p000.pfa;
import p000.pk9;
import p000.ps5;
import p000.qe0;
import p000.qh0;
import p000.qj8;
import p000.qt1;
import p000.qw1;
import p000.r46;
import p000.r7d;
import p000.r9d;
import p000.ru1;
import p000.rw1;
import p000.se1;
import p000.si5;
import p000.sj8;
import p000.ss5;
import p000.t9a;
import p000.te0;
import p000.tj3;
import p000.tw1;
import p000.ty3;
import p000.ui3;
import p000.ui8;
import p000.ux5;
import p000.v9d;
import p000.vh9;
import p000.vi3;
import p000.vv1;
import p000.vx9;
import p000.vz1;
import p000.wb3;
import p000.we1;
import p000.x17;
import p000.x18;
import p000.xs1;
import p000.xwc;
import p000.y38;
import p000.ye1;
import p000.zf1;
import p000.zi3;
import p000.zp0;

/* JADX INFO: renamed from: com.lingq.feature.challenges.cup.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1976c {
    /* JADX INFO: renamed from: a */
    public static final void m8818a(tw1 tw1Var, e16 e16Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-342298906);
        int i2 = (tj3Var.m22124i(tw1Var) ? 4 : 2) | i | 48;
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            C0282a c0282aM4703P = ci8.m4703P(1476167992, new lw1(tw1Var, 3), tj3Var);
            b16 b16Var = b16.f7762a;
            r9d.m20479a(b16Var, c0282aM4703P, tj3Var, 54, 0);
            e16Var = b16Var;
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ow1(tw1Var, e16Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8819b(final lv1 lv1Var, final vi3 vi3Var, final vi3 vi3Var2, final e16 e16Var, ye1 ye1Var, final int i) {
        lv1 lv1Var2;
        vi3 vi3Var3;
        vi3 vi3Var4;
        x18 x18VarM22143u;
        zi3 zi3Var;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-774636915);
        int i2 = i | (tj3Var.m22124i(lv1Var) ? 4 : 2) | (tj3Var.m22124i(vi3Var) ? 32 : 16) | (tj3Var.m22124i(vi3Var2) ? 256 : 128) | (tj3Var.m22120g(e16Var) ? 2048 : 1024);
        if (tj3Var.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            if (fy9.m12248c(t9a.m21912b(tj3Var))) {
                tj3Var.m22111b0(-348648557);
                m8823f(lv1Var, vi3Var, vi3Var2, e16Var, tj3Var, i2 & 8190);
                tj3Var.m22139q(false);
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u == null) {
                    return;
                }
                final int i3 = 0;
                zi3Var = new zi3(lv1Var, vi3Var, vi3Var2, e16Var, i, i3) { // from class: kv1

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ int f48453a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ lv1 f48454b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ vi3 f48455c;

                    /* JADX INFO: renamed from: d */
                    public final /* synthetic */ vi3 f48456d;

                    /* JADX INFO: renamed from: e */
                    public final /* synthetic */ e16 f48457e;

                    {
                        this.f48453a = i3;
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        int i4 = this.f48453a;
                        xfa xfaVar = xfa.f68157a;
                        switch (i4) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iM19383z = pk9.m19383z(1);
                                AbstractC1976c.m8819b(this.f48454b, this.f48455c, this.f48456d, this.f48457e, (ye1) obj, iM19383z);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iM19383z2 = pk9.m19383z(1);
                                AbstractC1976c.m8819b(this.f48454b, this.f48455c, this.f48456d, this.f48457e, (ye1) obj, iM19383z2);
                                break;
                        }
                        return xfaVar;
                    }
                };
            } else {
                lv1Var2 = lv1Var;
                vi3Var3 = vi3Var;
                vi3Var4 = vi3Var2;
                tj3Var.m22111b0(-348523627);
                tj3Var.m22139q(false);
                kg9 kg9Var = new kg9(360.0f);
                e16 e16VarM4412e = c99.m4412e(ox1.m18559e(c99.m4431x(e16Var)), 1.0f);
                zf1 zf1Var = ge9.f40637a;
                e16 e16VarM21609V = AbstractC3584sr.m21609V(e16VarM4412e, ((fe9) tj3Var.m22128k(zf1Var)).f38960i, 0.0f, 2);
                float f = ((fe9) tj3Var.m22128k(zf1Var)).f38957f;
                C3661uu c3661uu = new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38957f, true, new gm5(28));
                x17 x17VarM21622e = AbstractC3584sr.m21622e(0.0f, ((fe9) tj3Var.m22128k(zf1Var)).f38957f, 1);
                boolean zM22124i = tj3Var.m22124i(lv1Var2) | ((i2 & 896) == 256) | ((i2 & 112) == 32);
                Object objM22097O = tj3Var.m22097O();
                if (zM22124i || objM22097O == we1.f66679a) {
                    objM22097O = new C3485q5(lv1Var2, vi3Var4, vi3Var3, 10);
                    tj3Var.m22131l0(objM22097O);
                }
                xwc.m24758c(kg9Var, e16VarM21609V, null, x17VarM21622e, f, c3661uu, null, false, null, (vi3) objM22097O, tj3Var, 0, 916);
            }
            x18VarM22143u.f67642d = zi3Var;
        }
        lv1Var2 = lv1Var;
        vi3Var3 = vi3Var;
        vi3Var4 = vi3Var2;
        tj3Var.m22102U();
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            final int i4 = 1;
            final lv1 lv1Var3 = lv1Var2;
            final vi3 vi3Var5 = vi3Var3;
            final vi3 vi3Var6 = vi3Var4;
            zi3Var = new zi3(lv1Var3, vi3Var5, vi3Var6, e16Var, i, i4) { // from class: kv1

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f48453a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ lv1 f48454b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ vi3 f48455c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ vi3 f48456d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ e16 f48457e;

                {
                    this.f48453a = i4;
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.f48453a;
                    xfa xfaVar = xfa.f68157a;
                    switch (i5) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iM19383z = pk9.m19383z(1);
                            AbstractC1976c.m8819b(this.f48454b, this.f48455c, this.f48456d, this.f48457e, (ye1) obj, iM19383z);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iM19383z2 = pk9.m19383z(1);
                            AbstractC1976c.m8819b(this.f48454b, this.f48455c, this.f48456d, this.f48457e, (ye1) obj, iM19383z2);
                            break;
                    }
                    return xfaVar;
                }
            };
            x18VarM22143u.f67642d = zi3Var;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m8820c(C1977d c1977d, vi3 vi3Var, ye1 ye1Var, int i) {
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(92902451);
        int i2 = i | 2 | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                dua duaVarM21396a = si5.m21396a(tj3Var);
                if (duaVarM21396a == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                c1977d = (C1977d) pfa.m19114d(y38.m24933a(C1977d.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var);
            } else {
                tj3Var.m22102U();
            }
            int i3 = i2 & (-15);
            C1977d c1977d2 = c1977d;
            tj3Var.m22140r();
            qt1 qt1Var = (qt1) AbstractC0711a.m2513c(c1977d2.f24690h, tj3Var).getValue();
            boolean zM22124i = tj3Var.m22124i(c1977d2);
            Object objM22097O = tj3Var.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                CupDailyPrizeScreenKt$CupDailyPrizeRoute$1$1 cupDailyPrizeScreenKt$CupDailyPrizeRoute$1$1 = new CupDailyPrizeScreenKt$CupDailyPrizeRoute$1$1(1, c1977d2, C1977d.class, "handleAction", "handleAction(Lcom/lingq/feature/challenges/cup/data/CupDailyPrizeAction;)V", 0);
                tj3Var.m22131l0(cupDailyPrizeScreenKt$CupDailyPrizeRoute$1$1);
                objM22097O = cupDailyPrizeScreenKt$CupDailyPrizeRoute$1$1;
            }
            m8821d(qt1Var, (vi3) ((FunctionReference) objM22097O), vi3Var, tj3Var, (i3 << 3) & 896);
            c1977d = c1977d2;
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3598t4(c1977d, i, 25, vi3Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m8821d(qt1 qt1Var, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var;
        String strM23620a0;
        qt1Var.getClass();
        vi3Var.getClass();
        vi3Var2.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-709073128);
        if ((i & 6) == 0) {
            i2 = (tj3Var2.m22124i(qt1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var2) ? 256 : 128;
        }
        int i3 = 0;
        if (tj3Var2.m22099R(i2 & 1, (i2 & 147) != 146)) {
            Object objM22097O = tj3Var2.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = new C0232g0();
                tj3Var2.m22131l0(objM22097O);
            }
            C0232g0 c0232g0 = (C0232g0) objM22097O;
            if (qt1Var.f58180f != null) {
                tj3Var2.m22111b0(1480532544);
                strM23620a0 = vz1.m23620a0(tj3Var2, R$string.cup_claim_error);
                tj3Var2.m22139q(false);
            } else {
                tj3Var2.m22111b0(-1348086875);
                tj3Var2.m22139q(false);
                strM23620a0 = null;
            }
            String strM23620a1 = vz1.m23620a0(tj3Var2, R$string.cup_prize_claimed_celebrate);
            int i4 = i2 & 112;
            boolean zM22120g = tj3Var2.m22120g(strM23620a0) | (i4 == 32);
            Object objM22097O2 = tj3Var2.m22097O();
            if (zM22120g || objM22097O2 == p84Var) {
                objM22097O2 = new CupDailyPrizeScreenKt$CupDailyPrizeScreen$1$1(strM23620a0, c0232g0, vi3Var, null);
                tj3Var2.m22131l0(objM22097O2);
            }
            d32.m10047k(tj3Var2, (zi3) objM22097O2, strM23620a0);
            Boolean boolValueOf = Boolean.valueOf(qt1Var.f58179e);
            boolean zM22124i = tj3Var2.m22124i(qt1Var) | tj3Var2.m22120g(strM23620a1) | (i4 == 32);
            Object objM22097O3 = tj3Var2.m22097O();
            if (zM22124i || objM22097O3 == p84Var) {
                CupDailyPrizeScreenKt$CupDailyPrizeScreen$2$1 cupDailyPrizeScreenKt$CupDailyPrizeScreen$2$1 = new CupDailyPrizeScreenKt$CupDailyPrizeScreen$2$1(qt1Var, c0232g0, strM23620a1, vi3Var, null);
                tj3Var2.m22131l0(cupDailyPrizeScreenKt$CupDailyPrizeScreen$2$1);
                objM22097O3 = cupDailyPrizeScreenKt$CupDailyPrizeScreen$2$1;
            }
            d32.m10047k(tj3Var2, (zi3) objM22097O3, boolValueOf);
            tj3Var = tj3Var2;
            b34.m3232b(null, ci8.m4703P(-1260737580, new dq0(vi3Var2, 19), tj3Var2), null, ci8.m4703P(-1525385070, new ot1(c0232g0, i3), tj3Var2), null, 0, 0L, 0L, null, ci8.m4703P(1364677929, new C3180kd(10, qt1Var, vi3Var), tj3Var2), tj3Var, 805309488, 501);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2956e9(i, 13, qt1Var, vi3Var, vi3Var2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m8822e(final lv1 lv1Var, final vi3 vi3Var, final e16 e16Var, ye1 ye1Var, final int i) {
        int i2;
        final lv1 lv1Var2;
        final vi3 vi3Var2;
        final e16 e16Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1310800935);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22124i(lv1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22120g(e16Var) ? 256 : 128;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            ru1 ru1Var = lv1Var.f50177h;
            if (ru1Var == null) {
                x18 x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    final int i3 = 0;
                    x18VarM22143u.f67642d = new zi3() { // from class: iv1
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = i3;
                            xfa xfaVar = xfa.f68157a;
                            int i5 = i;
                            e16 e16Var3 = e16Var;
                            vi3 vi3Var3 = vi3Var;
                            lv1 lv1Var3 = lv1Var;
                            ye1 ye1Var2 = (ye1) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    AbstractC1976c.m8822e(lv1Var3, vi3Var3, e16Var3, ye1Var2, pk9.m19383z(i5 | 1));
                                    break;
                                default:
                                    AbstractC1976c.m8822e(lv1Var3, vi3Var3, e16Var3, ye1Var2, pk9.m19383z(i5 | 1));
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    return;
                }
                return;
            }
            vi3Var2 = vi3Var;
            lv1Var2 = lv1Var;
            boolean z = false;
            e16Var2 = e16Var;
            if ((i2 & 112) == 32) {
                z = true;
            }
            Object objM22097O = tj3Var.m22097O();
            if (z || objM22097O == we1.f66679a) {
                objM22097O = new hv1(vi3Var2, 11);
                tj3Var.m22131l0(objM22097O);
            }
            ui3 ui3Var = (ui3) objM22097O;
            m8828k(e16Var2, ci8.m4703P(-187429971, new jv1(lv1Var2, ru1Var, vi3Var2, ui3Var), tj3Var), ci8.m4703P(-5696722, new jv1(ru1Var, lv1Var2, ui3Var, vi3Var2), tj3Var), tj3Var, ((i2 >> 6) & 14) | 432);
        } else {
            lv1Var2 = lv1Var;
            vi3Var2 = vi3Var;
            e16Var2 = e16Var;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u2 = tj3Var.m22143u();
        if (x18VarM22143u2 != null) {
            final int i4 = 1;
            x18VarM22143u2.f67642d = new zi3() { // from class: iv1
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    xfa xfaVar = xfa.f68157a;
                    int i6 = i;
                    e16 e16Var3 = e16Var2;
                    vi3 vi3Var3 = vi3Var2;
                    lv1 lv1Var3 = lv1Var2;
                    ye1 ye1Var2 = (ye1) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            AbstractC1976c.m8822e(lv1Var3, vi3Var3, e16Var3, ye1Var2, pk9.m19383z(i6 | 1));
                            break;
                        default:
                            AbstractC1976c.m8822e(lv1Var3, vi3Var3, e16Var3, ye1Var2, pk9.m19383z(i6 | 1));
                            break;
                    }
                    return xfaVar;
                }
            };
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m8823f(final lv1 lv1Var, vi3 vi3Var, vi3 vi3Var2, e16 e16Var, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-324888039);
        final int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22124i(lv1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(vi3Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22120g(e16Var) ? 2048 : 1024;
        }
        int i4 = i2;
        final int i5 = 0;
        final int i6 = 1;
        if (tj3Var.m22099R(i4 & 1, (i4 & 1171) != 1170)) {
            int i7 = i4 & 896;
            boolean z = i7 == 256;
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (z || objM22097O == p84Var) {
                objM22097O = new f91(vi3Var2, 26);
                tj3Var.m22131l0(objM22097O);
            }
            final ui3 ui3Var = (ui3) objM22097O;
            boolean z2 = i7 == 256;
            Object objM22097O2 = tj3Var.m22097O();
            if (z2 || objM22097O2 == p84Var) {
                objM22097O2 = new f91(vi3Var2, 27);
                tj3Var.m22131l0(objM22097O2);
            }
            ui3 ui3Var2 = (ui3) objM22097O2;
            boolean z3 = i7 == 256;
            Object objM22097O3 = tj3Var.m22097O();
            if (z3 || objM22097O3 == p84Var) {
                objM22097O3 = new te0(vi3Var2, 8);
                tj3Var.m22131l0(objM22097O3);
            }
            C0282a c0282aM4703P = ci8.m4703P(-998854336, new ik0(lv1Var, ui3Var2, (vi3) objM22097O3, 13), tj3Var);
            C0282a c0282aM4703P2 = ci8.m4703P(90727159, new qe0(vi3Var, 7), tj3Var);
            CupPhase cupPhase = lv1Var.f50170a;
            CupPhase cupPhase2 = CupPhase.Finished;
            if (cupPhase == cupPhase2 && lv1Var.f50171b) {
                tj3Var.m22111b0(1315239689);
                int i8 = i4 >> 3;
                m8822e(lv1Var, vi3Var2, e16Var, tj3Var, (i4 & 14) | (i8 & 112) | (i8 & 896));
                tj3Var.m22139q(false);
            } else {
                int i9 = 14;
                if (cupPhase == cupPhase2) {
                    tj3Var.m22111b0(1315242876);
                    m8828k(e16Var, ci8.m4703P(-2083812914, new aj3() { // from class: fv1
                        @Override // p000.aj3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i10 = i5;
                            xfa xfaVar = xfa.f68157a;
                            ui3 ui3Var3 = ui3Var;
                            lv1 lv1Var2 = lv1Var;
                            db1 db1Var = (db1) obj;
                            ye1 ye1Var2 = (ye1) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            switch (i10) {
                                case 0:
                                    db1Var.getClass();
                                    tj3 tj3Var2 = (tj3) ye1Var2;
                                    if (!tj3Var2.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        tj3Var2.m22102U();
                                    } else {
                                        rv1.m20857b(lv1Var2.f50172c, lv1Var2.f50170a, null, tj3Var2, 0);
                                        rv1.m20862g(0, tj3Var2, ui3Var3, null);
                                    }
                                    break;
                                case 1:
                                    db1Var.getClass();
                                    tj3 tj3Var3 = (tj3) ye1Var2;
                                    if (!tj3Var3.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        tj3Var3.m22102U();
                                    } else {
                                        rv1.m20857b(lv1Var2.f50172c, lv1Var2.f50170a, null, tj3Var3, 0);
                                        rv1.m20862g(0, tj3Var3, ui3Var3, null);
                                    }
                                    break;
                                default:
                                    db1Var.getClass();
                                    tj3 tj3Var4 = (tj3) ye1Var2;
                                    if (!tj3Var4.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        tj3Var4.m22102U();
                                    } else {
                                        rv1.m20857b(lv1Var2.f50172c, lv1Var2.f50170a, null, tj3Var4, 0);
                                        if (lv1Var2.f50176g == null) {
                                            tj3Var4.m22111b0(-502872118);
                                        } else {
                                            tj3Var4.m22111b0(-502872117);
                                            rv1.m20862g(0, tj3Var4, ui3Var3, null);
                                        }
                                        tj3Var4.m22139q(false);
                                    }
                                    break;
                            }
                            return xfaVar;
                        }
                    }, tj3Var), c0282aM4703P, tj3Var, ((i4 >> 9) & 14) | 432);
                    tj3Var.m22139q(false);
                } else if (cupPhase == CupPhase.LiveJoined) {
                    tj3Var.m22111b0(1315252303);
                    m8828k(e16Var, ci8.m4703P(1918768557, new C3357n2((Object) lv1Var, vi3Var2, (Object) ui3Var, (Object) vi3Var, 3), tj3Var), c0282aM4703P, tj3Var, ((i4 >> 9) & 14) | 432);
                    tj3Var.m22139q(false);
                } else if (cupPhase == CupPhase.LiveNotJoined) {
                    tj3Var.m22111b0(1315280662);
                    m8828k(e16Var, ci8.m4703P(1626382732, new ik0((Object) lv1Var, (Object) c0282aM4703P2, ui3Var, i9), tj3Var), c0282aM4703P, tj3Var, ((i4 >> 9) & 14) | 432);
                    tj3Var.m22139q(false);
                } else if (cupPhase == CupPhase.LiveSpectator) {
                    tj3Var.m22111b0(1315290364);
                    m8828k(e16Var, ci8.m4703P(1333996907, new aj3() { // from class: fv1
                        @Override // p000.aj3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i10 = i6;
                            xfa xfaVar = xfa.f68157a;
                            ui3 ui3Var3 = ui3Var;
                            lv1 lv1Var2 = lv1Var;
                            db1 db1Var = (db1) obj;
                            ye1 ye1Var2 = (ye1) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            switch (i10) {
                                case 0:
                                    db1Var.getClass();
                                    tj3 tj3Var2 = (tj3) ye1Var2;
                                    if (!tj3Var2.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        tj3Var2.m22102U();
                                    } else {
                                        rv1.m20857b(lv1Var2.f50172c, lv1Var2.f50170a, null, tj3Var2, 0);
                                        rv1.m20862g(0, tj3Var2, ui3Var3, null);
                                    }
                                    break;
                                case 1:
                                    db1Var.getClass();
                                    tj3 tj3Var3 = (tj3) ye1Var2;
                                    if (!tj3Var3.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        tj3Var3.m22102U();
                                    } else {
                                        rv1.m20857b(lv1Var2.f50172c, lv1Var2.f50170a, null, tj3Var3, 0);
                                        rv1.m20862g(0, tj3Var3, ui3Var3, null);
                                    }
                                    break;
                                default:
                                    db1Var.getClass();
                                    tj3 tj3Var4 = (tj3) ye1Var2;
                                    if (!tj3Var4.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        tj3Var4.m22102U();
                                    } else {
                                        rv1.m20857b(lv1Var2.f50172c, lv1Var2.f50170a, null, tj3Var4, 0);
                                        if (lv1Var2.f50176g == null) {
                                            tj3Var4.m22111b0(-502872118);
                                        } else {
                                            tj3Var4.m22111b0(-502872117);
                                            rv1.m20862g(0, tj3Var4, ui3Var3, null);
                                        }
                                        tj3Var4.m22139q(false);
                                    }
                                    break;
                            }
                            return xfaVar;
                        }
                    }, tj3Var), c0282aM4703P, tj3Var, ((i4 >> 9) & 14) | 432);
                    tj3Var.m22139q(false);
                } else if (cupPhase == CupPhase.PreCup) {
                    tj3Var.m22111b0(1315299075);
                    m8828k(e16Var, ci8.m4703P(1041611082, new aj3() { // from class: fv1
                        @Override // p000.aj3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i10 = i3;
                            xfa xfaVar = xfa.f68157a;
                            ui3 ui3Var3 = ui3Var;
                            lv1 lv1Var2 = lv1Var;
                            db1 db1Var = (db1) obj;
                            ye1 ye1Var2 = (ye1) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            switch (i10) {
                                case 0:
                                    db1Var.getClass();
                                    tj3 tj3Var2 = (tj3) ye1Var2;
                                    if (!tj3Var2.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        tj3Var2.m22102U();
                                    } else {
                                        rv1.m20857b(lv1Var2.f50172c, lv1Var2.f50170a, null, tj3Var2, 0);
                                        rv1.m20862g(0, tj3Var2, ui3Var3, null);
                                    }
                                    break;
                                case 1:
                                    db1Var.getClass();
                                    tj3 tj3Var3 = (tj3) ye1Var2;
                                    if (!tj3Var3.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        tj3Var3.m22102U();
                                    } else {
                                        rv1.m20857b(lv1Var2.f50172c, lv1Var2.f50170a, null, tj3Var3, 0);
                                        rv1.m20862g(0, tj3Var3, ui3Var3, null);
                                    }
                                    break;
                                default:
                                    db1Var.getClass();
                                    tj3 tj3Var4 = (tj3) ye1Var2;
                                    if (!tj3Var4.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        tj3Var4.m22102U();
                                    } else {
                                        rv1.m20857b(lv1Var2.f50172c, lv1Var2.f50170a, null, tj3Var4, 0);
                                        if (lv1Var2.f50176g == null) {
                                            tj3Var4.m22111b0(-502872118);
                                        } else {
                                            tj3Var4.m22111b0(-502872117);
                                            rv1.m20862g(0, tj3Var4, ui3Var3, null);
                                        }
                                        tj3Var4.m22139q(false);
                                    }
                                    break;
                            }
                            return xfaVar;
                        }
                    }, tj3Var), hpb.f42759h, tj3Var, ((i4 >> 9) & 14) | 432);
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(1315308090);
                    m8828k(e16Var, ci8.m4703P(602322670, new C3180kd(13, lv1Var, c0282aM4703P2), tj3Var), hpb.f42760i, tj3Var, ((i4 >> 9) & 14) | 432);
                    tj3Var.m22139q(false);
                }
            }
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3522r4(lv1Var, vi3Var, vi3Var2, e16Var, i, 7);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m8824g(C1980g c1980g, vi3 vi3Var, ye1 ye1Var, int i) {
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1307166604);
        int i2 = i | 2 | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                dua duaVarM21396a = si5.m21396a(tj3Var);
                if (duaVarM21396a == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                c1980g = (C1980g) pfa.m19114d(y38.m24933a(C1980g.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var);
            } else {
                tj3Var.m22102U();
            }
            int i3 = i2 & (-15);
            C1980g c1980g2 = c1980g;
            tj3Var.m22140r();
            lv1 lv1Var = (lv1) AbstractC0711a.m2513c(c1980g2.f24719o, tj3Var).getValue();
            boolean zM22124i = tj3Var.m22124i(c1980g2);
            Object objM22097O = tj3Var.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                CupScreenKt$CupRoute$1$1 cupScreenKt$CupRoute$1$1 = new CupScreenKt$CupRoute$1$1(1, c1980g2, C1980g.class, "handleAction", "handleAction(Lcom/lingq/feature/challenges/cup/data/CupScreenAction;)V", 0);
                tj3Var.m22131l0(cupScreenKt$CupRoute$1$1);
                objM22097O = cupScreenKt$CupRoute$1$1;
            }
            m8825h(lv1Var, (vi3) ((FunctionReference) objM22097O), vi3Var, tj3Var, (i3 << 3) & 896);
            c1980g = c1980g2;
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3598t4(c1980g, i, 26, vi3Var);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m8825h(lv1 lv1Var, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var;
        String strM23620a0;
        lv1Var.getClass();
        vi3Var.getClass();
        vi3Var2.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1687241591);
        if ((i & 6) == 0) {
            i2 = (tj3Var2.m22124i(lv1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var2) ? 256 : 128;
        }
        int i3 = 1;
        if (tj3Var2.m22099R(i2 & 1, (i2 & 147) != 146)) {
            Object objM22097O = tj3Var2.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = new C0232g0();
                tj3Var2.m22131l0(objM22097O);
            }
            C0232g0 c0232g0 = (C0232g0) objM22097O;
            hu1 hu1Var = lv1Var.f50181l;
            if (hu1Var == null) {
                tj3Var2.m22111b0(612206320);
                tj3Var2.m22139q(false);
                strM23620a0 = null;
            } else {
                tj3Var2.m22111b0(612206321);
                if (hu1Var instanceof fu1) {
                    tj3Var2.m22111b0(1631893436);
                    strM23620a0 = vz1.m23618Z(R$string.cup_welcome, new Object[]{AbstractC3352my.m17093L((Context) tj3Var2.m22128k(AbstractC0394f.f4761b), ((fu1) hu1Var).f39637a)}, tj3Var2);
                    tj3Var2.m22139q(false);
                } else if (hu1Var.equals(cu1.f34535a)) {
                    tj3Var2.m22111b0(1631898101);
                    strM23620a0 = vz1.m23620a0(tj3Var2, R$string.cup_already_joined);
                    tj3Var2.m22139q(false);
                } else if (hu1Var.equals(gu1.f41321a)) {
                    tj3Var2.m22111b0(1631900500);
                    strM23620a0 = vz1.m23620a0(tj3Var2, R$string.cup_signup_closed);
                    tj3Var2.m22139q(false);
                } else if (hu1Var.equals(eu1.f37854a)) {
                    tj3Var2.m22111b0(1631902769);
                    strM23620a0 = vz1.m23620a0(tj3Var2, R$string.cup_join_error);
                    tj3Var2.m22139q(false);
                } else {
                    if (!hu1Var.equals(du1.f36235a)) {
                        throw ux5.m23001x(tj3Var2, 1631892115, false);
                    }
                    tj3Var2.m22111b0(1631904978);
                    strM23620a0 = vz1.m23620a0(tj3Var2, R$string.cup_claim_error);
                    tj3Var2.m22139q(false);
                }
                tj3Var2.m22139q(false);
            }
            String strM23620a1 = vz1.m23620a0(tj3Var2, R$string.cup_prize_claimed_celebrate);
            int i4 = i2 & 112;
            boolean zM22120g = (i4 == 32) | tj3Var2.m22120g(strM23620a0);
            Object objM22097O2 = tj3Var2.m22097O();
            if (zM22120g || objM22097O2 == p84Var) {
                objM22097O2 = new CupScreenKt$CupScreen$1$1(strM23620a0, c0232g0, vi3Var, null);
                tj3Var2.m22131l0(objM22097O2);
            }
            d32.m10047k(tj3Var2, (zi3) objM22097O2, strM23620a0);
            Boolean boolValueOf = Boolean.valueOf(lv1Var.f50180k);
            boolean zM22124i = tj3Var2.m22124i(lv1Var) | tj3Var2.m22120g(strM23620a1) | (i4 == 32);
            Object objM22097O3 = tj3Var2.m22097O();
            if (zM22124i || objM22097O3 == p84Var) {
                CupScreenKt$CupScreen$2$1 cupScreenKt$CupScreen$2$1 = new CupScreenKt$CupScreen$2$1(lv1Var, c0232g0, strM23620a1, vi3Var, null);
                tj3Var2.m22131l0(cupScreenKt$CupScreen$2$1);
                objM22097O3 = cupScreenKt$CupScreen$2$1;
            }
            d32.m10047k(tj3Var2, (zi3) objM22097O3, boolValueOf);
            b34.m3232b(null, ci8.m4703P(1340013619, new dq0(vi3Var2, 21), tj3Var2), null, ci8.m4703P(-2007915791, new ot1(c0232g0, i3), tj3Var2), null, 0, 0L, 0L, null, ci8.m4703P(-1038478200, new ik0(lv1Var, vi3Var, vi3Var2, 17), tj3Var2), tj3Var2, 805309488, 501);
            tj3Var = tj3Var2;
            vv1 vv1Var = lv1Var.f50178i;
            if (vv1Var == null) {
                tj3Var.m22111b0(613943219);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(613943220);
                v9d.m23199a(vv1Var, vi3Var, tj3Var, i4);
                tj3Var.m22139q(false);
            }
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2956e9(i, 15, lv1Var, vi3Var, vi3Var2);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m8826i(C1979f c1979f, vi3 vi3Var, ye1 ye1Var, int i) {
        C1979f c1979f2;
        int i2;
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1481781388);
        int i3 = i | 2 | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        int i4 = 0;
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                dua duaVarM21396a = si5.m21396a(tj3Var);
                if (duaVarM21396a == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    c1979f2 = (C1979f) pfa.m19114d(y38.m24933a(C1979f.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var);
                    i2 = i3 & (-15);
                }
            } else {
                tj3Var.m22102U();
                i2 = i3 & (-15);
                c1979f2 = c1979f;
            }
            tj3Var.m22140r();
            tw1 tw1Var = (tw1) AbstractC0711a.m2513c(c1979f2.f24705g, tj3Var).getValue();
            boolean zM22124i = tj3Var.m22124i(c1979f2);
            Object objM22097O = tj3Var.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                CupTeamLeaderboardScreenKt$CupTeamLeaderboardRoute$1$1 cupTeamLeaderboardScreenKt$CupTeamLeaderboardRoute$1$1 = new CupTeamLeaderboardScreenKt$CupTeamLeaderboardRoute$1$1(1, c1979f2, C1979f.class, "handleAction", "handleAction(Lcom/lingq/feature/challenges/cup/data/CupTeamLeaderboardAction;)V", 0);
                tj3Var.m22131l0(cupTeamLeaderboardScreenKt$CupTeamLeaderboardRoute$1$1);
                objM22097O = cupTeamLeaderboardScreenKt$CupTeamLeaderboardRoute$1$1;
            }
            m8827j(tw1Var, (vi3) ((FunctionReference) objM22097O), vi3Var, tj3Var, (i2 << 3) & 896);
        } else {
            tj3Var.m22102U();
            c1979f2 = c1979f;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new rw1(c1979f2, i, i4, vi3Var);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m8827j(tw1 tw1Var, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var;
        tw1Var.getClass();
        vi3Var.getClass();
        vi3Var2.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-962841585);
        if ((i & 6) == 0) {
            i2 = (tj3Var2.m22124i(tw1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var2) ? 256 : 128;
        }
        if (tj3Var2.m22099R(i2 & 1, (i2 & 147) != 146)) {
            tj3Var = tj3Var2;
            b34.m3232b(null, ci8.m4703P(1842110419, new dq0(vi3Var2, 24), tj3Var2), null, null, null, 0, 0L, 0L, null, ci8.m4703P(-88653346, new ik0(tw1Var, vi3Var, vi3Var2, 20), tj3Var2), tj3Var, 805306416, 509);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2956e9(i, 17, tw1Var, vi3Var, vi3Var2);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m8828k(e16 e16Var, C0282a c0282a, C0282a c0282a2, ye1 ye1Var, int i) {
        int i2;
        aj3 aj3Var;
        ui3 ui3Var;
        C0282a c0282a3 = c0282a2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1945189125);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(c0282a) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(c0282a3) ? 256 : 128;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            e16 e16VarM3912B0 = bna.m3912B0(e16Var, bna.m3972r0(tj3Var), false, 14);
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21608U = AbstractC3584sr.m21608U(e16VarM3912B0, ((fe9) tj3Var.m22128k(zf1Var)).f38960i, ((fe9) tj3Var.m22128k(zf1Var)).f38957f);
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38957f, true, new gm5(28)), nj0.f52817l, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21608U);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf);
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            if (1.5f <= 0.0d) {
                g54.m12362a("invalid weight; must be greater than zero");
            }
            as4 as4Var = new as4(1.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.5f, true);
            int i3 = i2;
            C3661uu c3661uu = new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38957f, true, new gm5(28));
            int i4 = (i3 << 6) & 7168;
            ec0 ec0Var = nj0.f52791J;
            bb1 bb1VarM230a = ab1.m230a(c3661uu, ec0Var, tj3Var, 0);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, as4Var);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                ui3Var = ui3Var2;
                tj3Var.m22130l(ui3Var);
            } else {
                ui3Var = ui3Var2;
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            Object objValueOf = Integer.valueOf(((i4 >> 6) & 112) | 6);
            Object obj = db1.f35347a;
            c0282a.invoke(obj, tj3Var, objValueOf);
            tj3Var.m22139q(true);
            if (1.0f <= 0.0d) {
                g54.m12362a("invalid weight; must be greater than zero");
            }
            as4 as4Var2 = new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            int i5 = (i3 << 3) & 7168;
            bb1 bb1VarM230a2 = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38957f, true, new gm5(28)), ec0Var, tj3Var, 0);
            int iHashCode3 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m3 = tj3Var.m22132m();
            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, as4Var2);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a2);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m3);
            AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c3);
            aj3 aj3Var2 = c0282a2;
            aj3Var2.invoke(obj, tj3Var, Integer.valueOf(((i5 >> 6) & 112) | 6));
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
            aj3Var = aj3Var2;
        } else {
            tj3Var.m22102U();
            aj3Var = c0282a3;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2956e9(i, 16, e16Var, c0282a, aj3Var);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m8829l(ju1 ju1Var, ye1 ye1Var, int i) {
        int i2;
        String strM23618Z;
        Object failure;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-758768752);
        int i3 = i | (tj3Var.m22120g(ju1Var) ? 4 : 2);
        if (tj3Var.m22099R(i3 & 1, (i3 & 3) != 2)) {
            e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
            zf1 zf1Var = ge9.f40637a;
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38956e, true, new gm5(28)), nj0.f52817l, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4412e);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf);
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var);
            zi3 zi3Var4 = C0352b.f4301d;
            as4 as4VarM10871c = e65.m10871c(tj3Var, e16VarM1322c, zi3Var4, 1.0f, true);
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38955d, true, new gm5(28)), nj0.f52791J, tj3Var, 0);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, as4VarM10871c);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            boolean z = ju1Var.f46154c;
            int i4 = ju1Var.f46155d;
            if (z) {
                tj3Var.m22111b0(1035654213);
                strM23618Z = vz1.m23618Z(R$string.cup_history_multiplier, new Object[]{Integer.valueOf(i4), r9d.m20486h(ju1Var.f46156e, tj3Var)}, tj3Var);
                i2 = 0;
                tj3Var.m22139q(false);
            } else {
                i2 = 0;
                tj3Var.m22111b0(1035754405);
                strM23618Z = vz1.m23618Z(R$string.cup_flat_gift_short, new Object[]{Integer.valueOf(i4)}, tj3Var);
                tj3Var.m22139q(false);
            }
            vh9 vh9Var = ps5.f56764b;
            vx9 vx9Var = ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71404h;
            lw9.m16554b(strM23618Z, null, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55873q, null, 0L, null, bc3.f8324j, 0L, null, null, 0L, 0, false, 0, 0, null, vx9Var, tj3Var, 1572864, 0, 131002);
            m8830m(ju1Var.f46157f, tj3Var, i2);
            tj3Var.m22139q(true);
            String str = ju1Var.f46152a;
            try {
                failure = LocalDate.parse(str).format(DateTimeFormatter.ofPattern("EEE · d", Locale.getDefault()));
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Object obj = str;
            if (!(failure instanceof Result.Failure)) {
                obj = failure;
            }
            vh9 vh9Var2 = ps5.f56764b;
            lw9.m16554b((String) obj, null, ((ms5) tj3Var.m22128k(vh9Var2)).f51799a.f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var2)).f51800b.f71406j, tj3Var, 0, 0, 131066);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3368nd(ju1Var, i, 20);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m8830m(boolean z, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1749312983);
        int i3 = (tj3Var.m22122h(z) ? 4 : 2) | i;
        if (tj3Var.m22099R(i3 & 1, (i3 & 3) != 2)) {
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38955d, true, new gm5(28)), nj0.f52789H, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            b16 b16Var = b16.f7762a;
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, b16Var);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            ty3.m22351a(z ? f7d.m11590a() : r7d.m20438b(), null, c99.m4422o(b16Var, 20.0f), z ? xs1.f68608a : xs1.f68631x, tj3Var, 432, 0);
            i2 = 1;
            lw9.m16554b(vz1.m23620a0(tj3Var, z ? R$string.cup_claimed_label : R$string.cup_prize_missed), null, z ? xs1.f68608a : xs1.f68631x, null, 0L, null, z ? bc3.f8323i : bc3.f8321g, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71406j, tj3Var, 0, 0, 131002);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            i2 = 1;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new c81(i, i2, z);
        }
    }

    /* JADX INFO: renamed from: n */
    public static final void m8831n(fz1 fz1Var, ye1 ye1Var, int i) {
        fz1 fz1Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-81282124);
        int i2 = i | (tj3Var.m22120g(fz1Var) ? 4 : 2);
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            zf1 zf1Var = ge9.f40637a;
            C3661uu c3661uu = new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38956e, true, new gm5(28));
            ec0 ec0Var = nj0.f52791J;
            bb1 bb1VarM230a = ab1.m230a(c3661uu, ec0Var, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            b16 b16Var = b16.f7762a;
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, b16Var);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf);
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            String upperCase = vz1.m23620a0(tj3Var, R$string.cup_how_today_works).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            lw9.m16554b(upperCase, null, xs1.f68608a, null, 0L, null, bc3.f8323i, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71404h, tj3Var, 1573248, 0, 131002);
            tj3Var = tj3Var;
            bb1 bb1VarM230a2 = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38956e, true, new gm5(28)), ec0Var, tj3Var, 0);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, b16Var);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a2);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            tj3Var.m22111b0(1216403657);
            tj3Var.m22111b0(-1637860255);
            ListBuilder listBuilderM23650t = vz1.m23650t();
            fz1Var2 = fz1Var;
            listBuilderM23650t.add(fad.m11683f(fz1Var2, tj3Var));
            if (!fz1Var2.f39946b) {
                tj3Var.m22111b0(-964665180);
                listBuilderM23650t.add(vz1.m23620a0(tj3Var, R$string.cup_how_works_flat_line));
                tj3Var.m22139q(false);
            } else if (fz1Var2.f39948d == CupPrizeSource.All) {
                tj3Var.m22111b0(-964662029);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-964661301);
                listBuilderM23650t.add(vz1.m23620a0(tj3Var, R$string.cup_how_works_multiplier_line2));
                tj3Var.m22139q(false);
            }
            listBuilderM23650t.add(vz1.m23620a0(tj3Var, R$string.cup_how_works_counts));
            ListBuilder listBuilderM23635i = vz1.m23635i(listBuilderM23650t);
            tj3Var.m22139q(false);
            ListIterator listIterator = listBuilderM23635i.listIterator(0);
            while (true) {
                au3 au3Var = (au3) listIterator;
                if (!au3Var.hasNext()) {
                    break;
                } else {
                    m8839v((String) au3Var.next(), tj3Var, 0);
                }
            }
            AbstractC3393o1.m17723A(tj3Var, false, true, true);
        } else {
            fz1Var2 = fz1Var;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3368nd(fz1Var2, i, 19);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final void m8832o(List list, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(221215916);
        int i2 = 2;
        int i3 = (tj3Var.m22124i(list) ? 4 : 2) | i;
        if (tj3Var.m22099R(i3 & 1, (i3 & 3) != 2)) {
            r9d.m20479a(null, ci8.m4703P(2007585022, new eq0(i2, list), tj3Var), tj3Var, 48, 1);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new g61(i, i2, list);
        }
    }

    /* JADX INFO: renamed from: p */
    public static final void m8833p(int i, int i2, ye1 ye1Var, e16 e16Var) {
        e16 e16Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1554229428);
        int i3 = i2 | (tj3Var.m22116e(i) ? 4 : 2) | 48;
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a, true, new gm5(28)), nj0.f52792K, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4412e);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            tj3Var.m22111b0(-1565448510);
            C3341mn c3341mn = new C3341mn();
            c3341mn.m16929d(vz1.m23620a0(tj3Var, R$string.cup_rankings_prefix));
            c3341mn.m16929d(" ");
            tj3Var.m22111b0(-1565444308);
            int iM16932g = c3341mn.m16932g(new he9(xs1.f68608a, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
            try {
                c3341mn.m16929d(vz1.m23620a0(tj3Var, R$string.cup_rankings_accent));
                c3341mn.m16931f(iM16932g);
                tj3Var.m22139q(false);
                C3419on c3419onM16933h = c3341mn.m16933h();
                tj3Var.m22139q(false);
                vh9 vh9Var = ps5.f56764b;
                lw9.m16555c(c3419onM16933h, null, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55873q, null, 0L, null, bc3.f8324j, 0L, new ks9(3), 0L, 0, false, 0, 0, null, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71399c, tj3Var, 1572864, 0, 261050);
                lw9.m16554b(vz1.m23618Z(R$string.cup_leaderboard_subtitle, new Object[]{Integer.valueOf(i)}, tj3Var), null, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55875s, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71406j, tj3Var, 0, 0, 130042);
                tj3Var = tj3Var;
                tj3Var.m22139q(true);
                e16Var2 = b16Var;
            } catch (Throwable th) {
                c3341mn.m16931f(iM16932g);
                throw th;
            }
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zp0(i, i2, e16Var2);
        }
    }

    /* JADX INFO: renamed from: q */
    public static final void m8834q(CupLeaderboardTab cupLeaderboardTab, vi3 vi3Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(481339780);
        int i2 = (tj3Var.m22116e(cupLeaderboardTab.ordinal()) ? 4 : 2) | i | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        int i3 = 1;
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            boolean z = cupLeaderboardTab == CupLeaderboardTab.Global;
            e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
            zf1 zf1Var = ge9.f40637a;
            pk9.m19366a(AbstractC3584sr.m21607T(d32.m10007D(pb1.m19045o(e16VarM4412e, ui8.m22753b(((fe9) tj3Var.m22128k(zf1Var)).f38956e)), ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55821F, ss5.f61356d), ((fe9) tj3Var.m22128k(zf1Var)).f38955d), null, ci8.m4703P(-1731715858, new C3187kk(z, vi3Var, i3), tj3Var), tj3Var, 3072);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3598t4(cupLeaderboardTab, i, 29, vi3Var);
        }
    }

    /* JADX INFO: renamed from: r */
    public static final void m8835r(e16 e16Var, ye1 ye1Var, int i) {
        tj3 tj3Var;
        e16 e16Var2;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1275053553);
        int i2 = i | 6;
        if (tj3Var2.m22099R(i2 & 1, (i2 & 3) != 2)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM21609V = AbstractC3584sr.m21609V(c99.m4412e(b16Var, 1.0f), ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38956e, 0.0f, 2);
            String strM17734i = AbstractC3393o1.m17734i("* ", vz1.m23620a0(tj3Var2, R$string.cup_rankings_normalization_note));
            vh9 vh9Var = ps5.f56764b;
            tj3Var = tj3Var2;
            lw9.m16554b(strM17734i, e16VarM21609V, ((ms5) tj3Var2.m22128k(vh9Var)).f51799a.f55875s, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(vh9Var)).f51800b.f71408l, tj3Var, 0, 0, 130040);
            e16Var2 = b16Var;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3456pd(i, 5, e16Var2);
        }
    }

    /* JADX INFO: renamed from: s */
    public static final void m8836s(int i, ye1 ye1Var, ui3 ui3Var, e16 e16Var, String str, boolean z) {
        long j;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1832132035);
        int i2 = i | (tj3Var.m22120g(str) ? 4 : 2) | (tj3Var.m22122h(z) ? 32 : 16) | (tj3Var.m22124i(ui3Var) ? 256 : 128) | (tj3Var.m22120g(e16Var) ? 2048 : 1024);
        if (tj3Var.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            if (z) {
                tj3Var.m22111b0(-600860854);
                j = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55873q;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-600796436);
                j = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55816A;
                tj3Var.m22139q(false);
            }
            dh9 dh9VarM785b = AbstractC0072k.m785b(j, null, "cupTabTextColor", tj3Var, 384, 10);
            e16 e16VarM21609V = AbstractC3584sr.m21609V(AbstractC0080f.m814a(e16Var, null, null, false, null, ui3Var, 28), 0.0f, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38956e, 1);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21609V);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            lw9.m16554b(str, null, ((aa1) dh9VarM785b.getValue()).f414a, null, 0L, null, z ? bc3.f8323i : bc3.f8321g, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var, i2 & 14, 0, 129978);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new qw1(str, z, ui3Var, e16Var, i);
        }
    }

    /* JADX INFO: renamed from: t */
    public static final void m8837t(tw1 tw1Var, vi3 vi3Var, e16 e16Var, ye1 ye1Var, int i) {
        e16 e16Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1524735697);
        int i2 = 2;
        int i3 = (tj3Var.m22124i(tw1Var) ? 4 : 2) | i | (tj3Var.m22124i(vi3Var) ? 32 : 16) | 384;
        if (tj3Var.m22099R(i3 & 1, (i3 & 147) != 146)) {
            C0282a c0282aM4703P = ci8.m4703P(-1245377729, new mw1(tw1Var, vi3Var, i2), tj3Var);
            b16 b16Var = b16.f7762a;
            r9d.m20479a(b16Var, c0282aM4703P, tj3Var, 54, 0);
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3836zk(tw1Var, vi3Var, e16Var2, i, 11);
        }
    }

    /* JADX INFO: renamed from: u */
    public static final void m8838u(e16 e16Var, ye1 ye1Var, int i) {
        tj3 tj3Var;
        e16 e16Var2;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(394150198);
        int i2 = i | 6;
        if (tj3Var2.m22099R(i2 & 1, (i2 & 3) != 2)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM21609V = AbstractC3584sr.m21609V(c99.m4412e(b16Var, 1.0f), ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38956e, 0.0f, 2);
            String strM23620a0 = vz1.m23620a0(tj3Var2, R$string.cup_teams_ranking_footer);
            vh9 vh9Var = ps5.f56764b;
            tj3Var = tj3Var2;
            lw9.m16554b(strM23620a0, e16VarM21609V, ((ms5) tj3Var2.m22128k(vh9Var)).f51799a.f55875s, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(vh9Var)).f51800b.f71407k, tj3Var, 0, 0, 130040);
            e16Var2 = b16Var;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3456pd(i, 6, e16Var2);
        }
    }

    /* JADX INFO: renamed from: v */
    public static final void m8839v(String str, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-376730300);
        int i2 = i | (tj3Var.m22120g(str) ? 4 : 2);
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            zf1 zf1Var = ge9.f40637a;
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38957f, true, new gm5(28)), nj0.f52789H, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4412e);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            ((fe9) tj3Var.m22128k(zf1Var)).getClass();
            ty3.m22351a(d7d.m10143a(), null, c99.m4422o(b16Var, 24.0f), xs1.f68608a, tj3Var, 3120, 0);
            as4 as4Var = new as4(1.0f, true);
            vh9 vh9Var = ps5.f56764b;
            lw9.m16554b(str, as4Var, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71406j, tj3Var, i2 & 14, 0, 131064);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3441oz(str, i, 7);
        }
    }

    /* JADX INFO: renamed from: w */
    public static final void m8840w(tw1 tw1Var, e16 e16Var, ye1 ye1Var, int i) {
        int i2;
        e16 e16Var2;
        boolean z;
        String strM23618Z;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1051527984);
        int i3 = i | (tj3Var.m22124i(tw1Var) ? 4 : 2) | 48;
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM21608U = AbstractC3584sr.m21608U(r46.m20387m(d32.m10007D(pb1.m19045o(c99.m4412e(b16Var, 1.0f), ui8.m22753b(ge9.m12515a(tj3Var).f38957f)), p58.m18900f(tj3Var).f55825J, ss5.f61356d), 1.0f, p58.m18900f(tj3Var).f55817B, ui8.m22753b(ge9.m12515a(tj3Var).f38957f)), ge9.m12515a(tj3Var).f38959h, ge9.m12515a(tj3Var).f38958g);
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(ge9.m12515a(tj3Var).f38956e, true, new gm5(28)), nj0.f52792K, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21608U);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            String upperCase = vz1.m23620a0(tj3Var, R$string.cup_global_rank_label).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            i2 = 1;
            lw9.m16554b(upperCase, null, p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71410n, tj3Var, 0, 0, 131066);
            Object obj = tw1Var.f62984h;
            if (obj == null) {
                obj = "–";
            }
            lw9.m16554b(AbstractC3393o1.m17733h(obj, "#"), null, xs1.f68608a, null, 0L, new wb3(1), null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71398b, tj3Var, 384, 0, 131034);
            Integer num = tw1Var.f62985i;
            if (num == null) {
                tj3Var.m22111b0(1357777041);
                z = false;
                tj3Var.m22139q(false);
                strM23618Z = null;
            } else {
                z = false;
                tj3Var.m22111b0(1357777042);
                strM23618Z = vz1.m23618Z(R$string.cup_places_to_top, new Object[]{Integer.valueOf(num.intValue())}, tj3Var);
                tj3Var.m22139q(false);
            }
            if (strM23618Z == null) {
                tj3Var.m22111b0(736538272);
                strM23618Z = vz1.m23620a0(tj3Var, R$string.cup_in_top_50);
            } else {
                tj3Var.m22111b0(736535389);
            }
            tj3Var.m22139q(z);
            lw9.m16554b(strM23618Z, null, p58.m18900f(tj3Var).f55873q, null, 0L, null, bc3.f8323i, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71404h, tj3Var, 1572864, 0, 129978);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
            e16Var2 = b16Var;
        } else {
            i2 = 1;
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ow1(tw1Var, e16Var2, i, i2);
        }
    }
}
