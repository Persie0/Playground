package p000;

import androidx.compose.material3.AbstractC0231g;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import java.util.ListIterator;
import java.util.WeakHashMap;
import kotlin.collections.builders.ListBuilder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fwc {

    /* JADX INFO: renamed from: a */
    public static final b37 f39822a = new b37();

    /* JADX INFO: renamed from: a */
    public static final void m12240a(final cd8 cd8Var, final vi3 vi3Var, ye1 ye1Var, final int i) {
        final vi3 vi3Var2;
        final int i2;
        e16 as4Var;
        ie8 ie8Var = cd8Var.f9939d;
        bd8 bd8Var = cd8Var.f9938c;
        bd8 bd8Var2 = cd8Var.f9937b;
        bd8 bd8Var3 = cd8Var.f9936a;
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(102730160);
        int i3 = (tj3Var.m22120g(cd8Var) ? 4 : 2) | i | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        final int i4 = 0;
        if (!tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            vi3Var2 = vi3Var;
            i2 = 1;
            tj3Var.m22102U();
        } else {
            if (bd8Var3 == null && bd8Var2 == null && bd8Var == null && ie8Var == null) {
                x18 x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3(cd8Var, vi3Var, i, i4) { // from class: gc8

                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ int f40548a;

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ cd8 f40549b;

                        /* JADX INFO: renamed from: c */
                        public final /* synthetic */ vi3 f40550c;

                        {
                            this.f40548a = i4;
                        }

                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.f40548a;
                            xfa xfaVar = xfa.f68157a;
                            vi3 vi3Var3 = this.f40550c;
                            cd8 cd8Var2 = this.f40549b;
                            ye1 ye1Var2 = (ye1) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    fwc.m12240a(cd8Var2, vi3Var3, ye1Var2, pk9.m19383z(1));
                                    break;
                                default:
                                    fwc.m12240a(cd8Var2, vi3Var3, ye1Var2, pk9.m19383z(1));
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    return;
                }
                return;
            }
            ListBuilder listBuilderM23650t = vz1.m23650t();
            if (bd8Var3 != null) {
                listBuilderM23650t.add(new fc8(bd8Var3.f8388a, bd8Var3.f8389b, bd8Var3.f8390c, bd8Var3.f8391d));
            }
            if (bd8Var2 != null) {
                listBuilderM23650t.add(new fc8(bd8Var2.f8388a, bd8Var2.f8389b, bd8Var2.f8390c, bd8Var2.f8391d));
            }
            if (bd8Var != null) {
                listBuilderM23650t.add(new fc8(bd8Var.f8388a, bd8Var.f8389b, bd8Var.f8390c, bd8Var.f8391d));
            }
            if (ie8Var != null) {
                listBuilderM23650t.add(new fc8(ie8Var.f44026b, pa8.f55894a, true, false));
                listBuilderM23650t.add(new fc8(ie8Var.f44025a, oa8.f54103a, true, true));
            }
            ListBuilder listBuilderM23635i = vz1.m23635i(listBuilderM23650t);
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            WeakHashMap weakHashMap = l6b.f49204w;
            e16 e16VarM23904F = wfb.m23904F(e16VarM4412e, ho5.m13397r(tj3Var).f49209e);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM23904F);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var, ht5VarM19966d);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf);
            vi3 vi3Var3 = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var3);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            e16 e16VarM4412e2 = c99.m4412e(ox1.m18559e(b16Var), 1.0f);
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21608U = AbstractC3584sr.m21608U(e16VarM4412e2, ((fe9) tj3Var.m22128k(zf1Var)).f38960i, ((fe9) tj3Var.m22128k(zf1Var)).f38956e);
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38955d, true, new gm5(28)), nj0.f52817l, tj3Var, 0);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM21608U);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var3);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            tj3Var.m22111b0(-2138169805);
            ListIterator listIterator = listBuilderM23635i.listIterator(0);
            while (true) {
                au3 au3Var = (au3) listIterator;
                if (!au3Var.hasNext()) {
                    break;
                }
                fc8 fc8Var = (fc8) au3Var.next();
                if (listBuilderM23635i.mo4182d() == 1) {
                    as4Var = c99.m4412e(b16Var, 1.0f);
                } else {
                    if (1.0f <= 0.0d) {
                        g54.m12362a("invalid weight; must be greater than zero");
                    }
                    as4Var = new as4(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
                }
                m12241b(fc8Var, vi3Var, as4Var, tj3Var, ((i3 << 3) & 896) | 6);
            }
            vi3Var2 = vi3Var;
            i2 = 1;
            AbstractC3393o1.m17723A(tj3Var, false, true, true);
        }
        x18 x18VarM22143u2 = tj3Var.m22143u();
        if (x18VarM22143u2 != null) {
            x18VarM22143u2.f67642d = new zi3(cd8Var, vi3Var2, i, i2) { // from class: gc8

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f40548a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ cd8 f40549b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ vi3 f40550c;

                {
                    this.f40548a = i2;
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.f40548a;
                    xfa xfaVar = xfa.f68157a;
                    vi3 vi3Var4 = this.f40550c;
                    cd8 cd8Var2 = this.f40549b;
                    ye1 ye1Var2 = (ye1) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            fwc.m12240a(cd8Var2, vi3Var4, ye1Var2, pk9.m19383z(1));
                            break;
                        default:
                            fwc.m12240a(cd8Var2, vi3Var4, ye1Var2, pk9.m19383z(1));
                            break;
                    }
                    return xfaVar;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m12241b(final fc8 fc8Var, final vi3 vi3Var, e16 e16Var, ye1 ye1Var, int i) {
        int i2;
        e16 e16Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(344450425);
        if ((i & 48) == 0) {
            i2 = (tj3Var.m22120g(fc8Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            e16Var2 = e16Var;
            i2 |= tj3Var.m22120g(e16Var2) ? 2048 : 1024;
        } else {
            e16Var2 = e16Var;
        }
        final int i3 = 0;
        final int i4 = 1;
        if (tj3Var.m22099R(i2 & 1, (i2 & 1169) != 1168)) {
            boolean z = fc8Var.f38855d;
            p84 p84Var = we1.f66679a;
            if (z) {
                tj3Var.m22111b0(845916245);
                boolean z2 = fc8Var.f38854c;
                int i5 = ((i2 & 896) == 256 ? 1 : 0) | ((i2 & 112) != 32 ? 0 : 1);
                Object objM22097O = tj3Var.m22097O();
                if (i5 != 0 || objM22097O == p84Var) {
                    objM22097O = new ui3() { // from class: hc8
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            int i6 = i3;
                            xfa xfaVar = xfa.f68157a;
                            fc8 fc8Var2 = fc8Var;
                            vi3 vi3Var2 = vi3Var;
                            switch (i6) {
                                case 0:
                                    vi3Var2.invoke(fc8Var2.f38853b);
                                    break;
                                default:
                                    vi3Var2.invoke(fc8Var2.f38853b);
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    tj3Var.m22131l0(objM22097O);
                }
                AbstractC0231g.m1148a((ui3) objM22097O, e16Var2, z2, null, null, null, null, null, ci8.m4703P(1113991364, new aj3() { // from class: ic8
                    @Override // p000.aj3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i6 = i3;
                        xfa xfaVar = xfa.f68157a;
                        fc8 fc8Var2 = fc8Var;
                        switch (i6) {
                            case 0:
                                ye1 ye1Var2 = (ye1) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                ((tj8) obj).getClass();
                                tj3 tj3Var2 = (tj3) ye1Var2;
                                if (!tj3Var2.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    tj3Var2.m22102U();
                                } else {
                                    lw9.m16554b(vz1.m23620a0(tj3Var2, fc8Var2.f38852a), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var2, 0, 0, 262142);
                                }
                                break;
                            default:
                                ye1 ye1Var3 = (ye1) obj2;
                                int iIntValue2 = ((Integer) obj3).intValue();
                                ((tj8) obj).getClass();
                                tj3 tj3Var3 = (tj3) ye1Var3;
                                if (!tj3Var3.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    tj3Var3.m22102U();
                                } else {
                                    lw9.m16554b(vz1.m23620a0(tj3Var3, fc8Var2.f38852a), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var3, 0, 0, 262142);
                                }
                                break;
                        }
                        return xfaVar;
                    }
                }, tj3Var), tj3Var, ((i2 >> 6) & 112) | 805306368, 504);
                tj3Var = tj3Var;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(846148621);
                boolean z3 = fc8Var.f38854c;
                boolean z4 = ((i2 & 112) == 32) | ((i2 & 896) == 256);
                Object objM22097O2 = tj3Var.m22097O();
                if (z4 || objM22097O2 == p84Var) {
                    objM22097O2 = new ui3() { // from class: hc8
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            int i6 = i4;
                            xfa xfaVar = xfa.f68157a;
                            fc8 fc8Var2 = fc8Var;
                            vi3 vi3Var2 = vi3Var;
                            switch (i6) {
                                case 0:
                                    vi3Var2.invoke(fc8Var2.f38853b);
                                    break;
                                default:
                                    vi3Var2.invoke(fc8Var2.f38853b);
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    tj3Var.m22131l0(objM22097O2);
                }
                AbstractC0231g.m1151d((ui3) objM22097O2, e16Var, z3, null, null, null, null, ci8.m4703P(-1603420529, new aj3() { // from class: ic8
                    @Override // p000.aj3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i6 = i4;
                        xfa xfaVar = xfa.f68157a;
                        fc8 fc8Var2 = fc8Var;
                        switch (i6) {
                            case 0:
                                ye1 ye1Var2 = (ye1) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                ((tj8) obj).getClass();
                                tj3 tj3Var2 = (tj3) ye1Var2;
                                if (!tj3Var2.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    tj3Var2.m22102U();
                                } else {
                                    lw9.m16554b(vz1.m23620a0(tj3Var2, fc8Var2.f38852a), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var2, 0, 0, 262142);
                                }
                                break;
                            default:
                                ye1 ye1Var3 = (ye1) obj2;
                                int iIntValue2 = ((Integer) obj3).intValue();
                                ((tj8) obj).getClass();
                                tj3 tj3Var3 = (tj3) ye1Var3;
                                if (!tj3Var3.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    tj3Var3.m22102U();
                                } else {
                                    lw9.m16554b(vz1.m23620a0(tj3Var3, fc8Var2.f38852a), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var3, 0, 0, 262142);
                                }
                                break;
                        }
                        return xfaVar;
                    }
                }, tj3Var), tj3Var, ((i2 >> 6) & 112) | 805306368, 504);
                tj3Var.m22139q(false);
            }
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new y35(i, 9, fc8Var, vi3Var, e16Var);
        }
    }
}
