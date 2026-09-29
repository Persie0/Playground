package p000;

import androidx.compose.animation.AbstractC0054a;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.feature.chat.R$string;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b7d {
    /* JADX INFO: renamed from: a */
    public static final void m3410a(final int i, ye1 ye1Var, final ui3 ui3Var, final vi3 vi3Var, final e16 e16Var, final List list, final boolean z) {
        ui3 ui3Var2;
        tj3 tj3Var;
        x18 x18VarM22143u;
        zi3 zi3Var;
        list.getClass();
        vi3Var.getClass();
        ui3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(966558278);
        int i2 = (tj3Var2.m22124i(list) ? 4 : 2) | i | (tj3Var2.m22122h(z) ? 32 : 16) | (tj3Var2.m22124i(vi3Var) ? 256 : 128) | (tj3Var2.m22124i(ui3Var) ? 2048 : 1024);
        if ((i & 24576) == 0) {
            i2 |= tj3Var2.m22120g(e16Var) ? 16384 : 8192;
        }
        int i3 = 0;
        if (tj3Var2.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            if (z || !list.isEmpty()) {
                ui3Var2 = ui3Var;
                e16 e16VarM4412e = c99.m4412e(e16Var, 1.0f);
                ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                int iHashCode = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m = tj3Var2.m22132m();
                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM4412e);
                se1.f60731q.getClass();
                ui3 ui3Var3 = C0352b.f4299b;
                tj3Var2.m22119f0();
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var3);
                } else {
                    tj3Var2.m22137o0();
                }
                zi3 zi3Var2 = C0352b.f4303f;
                oha.m18001g(tj3Var2, zi3Var2, ht5VarM19966d);
                zi3 zi3Var3 = C0352b.f4302e;
                oha.m18001g(tj3Var2, zi3Var3, l77VarM22132m);
                Integer numValueOf = Integer.valueOf(iHashCode);
                zi3 zi3Var4 = C0352b.f4304g;
                oha.m18001g(tj3Var2, zi3Var4, numValueOf);
                vi3 vi3Var2 = C0352b.f4305h;
                oha.m18000f(tj3Var2, vi3Var2);
                zi3 zi3Var5 = C0352b.f4301d;
                oha.m18001g(tj3Var2, zi3Var5, e16VarM1322c);
                List list2 = z ? EmptyList.f47638a : list;
                b16 b16Var = b16.f7762a;
                e16 e16VarM21611X = AbstractC3584sr.m21611X(c99.m4412e(b16Var, 1.0f), 0.0f, 0.0f, 48.0f, 0.0f, 11);
                Object objM22097O = tj3Var2.m22097O();
                if (objM22097O == we1.f66679a) {
                    objM22097O = new C3013ft(9);
                    tj3Var2.m22131l0(objM22097O);
                }
                AbstractC0054a.m727b(list2, e16VarM21611X, (vi3) objM22097O, null, "chatSuggestions", null, ci8.m4703P(-1048929085, new qz0(vi3Var, i3), tj3Var2), tj3Var2, 1597872, 40);
                tj3Var = tj3Var2;
                e16 e16VarM4422o = c99.m4422o(ci0.f10109a.mo3727a(b16Var, nj0.f52813h), 32.0f);
                si8 si8Var = ui8.f63972a;
                e16 e16VarM19045o = pb1.m19045o(e16VarM4422o, si8Var);
                vh9 vh9Var = ps5.f56764b;
                e16 e16VarM815b = AbstractC0080f.m815b(null, !z, ui3Var2, r46.m20387m(e16VarM19045o, 1.0f, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55817B, si8Var), 14);
                ht5 ht5VarM19966d2 = qh0.m19966d(nj0.f52812g, false);
                int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m2 = tj3Var.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM815b);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var3);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var2, ht5VarM19966d2);
                oha.m18001g(tj3Var, zi3Var3, l77VarM22132m2);
                AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var4, tj3Var, vi3Var2);
                oha.m18001g(tj3Var, zi3Var5, e16VarM1322c2);
                p04 p04VarM17721b = xlc.f68336b;
                if (p04VarM17721b == null) {
                    o04 o04Var = new o04("Rounded.Refresh", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i4 = soa.f61116a;
                    pd9 pd9Var = new pd9(aa1.f403b);
                    f57 f57VarM17730e = AbstractC3393o1.m17730e(17.65f, 6.35f);
                    f57VarM17730e.m11548c(-1.63f, -1.63f, -3.94f, -2.57f, -6.48f, -2.31f);
                    f57VarM17730e.m11548c(-3.67f, 0.37f, -6.69f, 3.35f, -7.1f, 7.02f);
                    f57VarM17730e.m11547b(3.52f, 15.91f, 7.27f, 20.0f, 12.0f, 20.0f);
                    f57VarM17730e.m11548c(3.19f, 0.0f, 5.93f, -1.87f, 7.21f, -4.56f);
                    f57VarM17730e.m11548c(0.32f, -0.67f, -0.16f, -1.44f, -0.9f, -1.44f);
                    f57VarM17730e.m11548c(-0.37f, 0.0f, -0.72f, 0.2f, -0.88f, 0.53f);
                    f57VarM17730e.m11548c(-1.13f, 2.43f, -3.84f, 3.97f, -6.8f, 3.31f);
                    f57VarM17730e.m11548c(-2.22f, -0.49f, -4.01f, -2.3f, -4.48f, -4.52f);
                    f57VarM17730e.m11547b(5.31f, 9.44f, 8.26f, 6.0f, 12.0f, 6.0f);
                    f57VarM17730e.m11548c(1.66f, 0.0f, 3.14f, 0.69f, 4.22f, 1.78f);
                    f57VarM17730e.m11552g(-1.51f, 1.51f);
                    f57VarM17730e.m11548c(-0.63f, 0.63f, -0.19f, 1.71f, 0.7f, 1.71f);
                    f57VarM17730e.m11549d(19.0f);
                    f57VarM17730e.m11548c(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                    f57VarM17730e.m11556k(6.41f);
                    f57VarM17730e.m11548c(0.0f, -0.89f, -1.08f, -1.34f, -1.71f, -0.71f);
                    f57VarM17730e.m11552g(-0.64f, 0.65f);
                    f57VarM17730e.m11546a();
                    o04.m17720a(o04Var, f57VarM17730e.f38440a, pd9Var);
                    p04VarM17721b = o04Var.m17721b();
                    xlc.f68336b = p04VarM17721b;
                }
                ty3.m22351a(p04VarM17721b, vz1.m23620a0(tj3Var, R$string.chat_shuffle_suggestions), c99.m4422o(b16Var, 16.0f), ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55875s, tj3Var, 384, 0);
                tj3Var.m22139q(true);
                tj3Var.m22139q(true);
            } else {
                x18VarM22143u = tj3Var2.m22143u();
                if (x18VarM22143u == null) {
                    return;
                }
                final int i5 = 0;
                zi3Var = new zi3() { // from class: pz0
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        int i6 = i5;
                        xfa xfaVar = xfa.f68157a;
                        int i7 = i;
                        switch (i6) {
                            case 0:
                                ((Integer) obj2).getClass();
                                b7d.m3410a(pk9.m19383z(i7 | 1), (ye1) obj, ui3Var, vi3Var, e16Var, list, z);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                b7d.m3410a(pk9.m19383z(i7 | 1), (ye1) obj, ui3Var, vi3Var, e16Var, list, z);
                                break;
                        }
                        return xfaVar;
                    }
                };
            }
            x18VarM22143u.f67642d = zi3Var;
        }
        ui3Var2 = ui3Var;
        tj3Var = tj3Var2;
        tj3Var.m22102U();
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            final int i6 = 1;
            final ui3 ui3Var4 = ui3Var2;
            zi3Var = new zi3() { // from class: pz0
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    int i7 = i6;
                    xfa xfaVar = xfa.f68157a;
                    int i8 = i;
                    switch (i7) {
                        case 0:
                            ((Integer) obj2).getClass();
                            b7d.m3410a(pk9.m19383z(i8 | 1), (ye1) obj, ui3Var4, vi3Var, e16Var, list, z);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            b7d.m3410a(pk9.m19383z(i8 | 1), (ye1) obj, ui3Var4, vi3Var, e16Var, list, z);
                            break;
                    }
                    return xfaVar;
                }
            };
            x18VarM22143u.f67642d = zi3Var;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m3411b(e16 e16Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-378250524);
        int i2 = (tj3Var.m22120g(e16Var) ? 256 : 128) | i;
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            qh0.m19963a(x74.m24341H(pb1.m19045o(c99.m4414g(c99.m4412e(e16Var, 0.85f), 14.0f), ui8.m22753b(4.0f))), tj3Var, 0);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3456pd(i, 1, e16Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m3412c(oz0 oz0Var, ui3 ui3Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1879869946);
        int i2 = (tj3Var.m22124i(oz0Var) ? 4 : 2) | i | (tj3Var.m22124i(ui3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            si8 si8Var = ui8.f63972a;
            b16 b16Var = b16.f7762a;
            e16 e16VarM815b = AbstractC0080f.m815b(null, false, ui3Var, pb1.m19045o(b16Var, si8Var), 15);
            vh9 vh9Var = ps5.f56764b;
            e16 e16VarM21609V = AbstractC3584sr.m21609V(d32.m10007D(e16VarM815b, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55872p, ss5.f61356d), 0.0f, 5.0f, 1);
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a, true, new gm5(28)), nj0.f52817l, tj3Var, 48);
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
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            ty3.m22351a(j5d.m14303b(), null, c99.m4422o(AbstractC3584sr.m21611X(b16Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), 18.0f), ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55842a, tj3Var, 432, 0);
            String str = oz0Var.f55316a;
            if (vk9.m23391n0(str)) {
                str = oz0Var.f55317b;
            }
            lw9.m16554b(str, new as4(1.0f, true), ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55842a, null, 0L, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71407k, tj3Var, 0, 24960, 110584);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3598t4(oz0Var, i, 11, ui3Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m3413d(ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1027577539);
        if (tj3Var.m22099R(i & 1, i != 0)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM21609V = AbstractC3584sr.m21609V(b16Var, 0.0f, 5.0f, 1);
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a, true, new gm5(28)), nj0.f52817l, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21609V);
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
            ty3.m22351a(j5d.m14303b(), null, c99.m4422o(AbstractC3584sr.m21611X(b16Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), 18.0f), ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55817B, tj3Var, 432, 0);
            m3411b(new as4(1.0f, true), tj3Var, 54);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new jx0(i, 2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m3414e(AtomicReference atomicReference, String str) {
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean z = ao2.m2948a(g06.m12269c().m12272b(), str) > 0;
        atomicReference.set(Boolean.valueOf(z));
        return z;
    }
}
