package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.domain.model.library.LibraryShelf;
import com.lingq.core.domain.model.offer.BannerType;
import com.lingq.core.domain.model.offer.OfferBanner;
import com.lingq.feature.challenges.AbstractC1985e;
import com.lingq.feature.library.AbstractC2143d;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class cb5 implements bj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f9836a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ b85 f9837b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ n4b f9838c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Set f9839d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f9840e;

    public cb5(List list, b85 b85Var, n4b n4bVar, Set set, String str) {
        this.f9836a = list;
        this.f9837b = b85Var;
        this.f9838c = n4bVar;
        this.f9839d = set;
        this.f9840e = str;
    }

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        String strM8104a;
        OfferBanner offerBannerM22853a;
        OfferBanner offerBannerM22853a2;
        ft4 ft4Var = (ft4) obj;
        int iIntValue = ((Number) obj2).intValue();
        ye1 ye1Var = (ye1) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (((tj3) ye1Var).m22120g(ft4Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= ((tj3) ye1Var).m22116e(iIntValue) ? 32 : 16;
        }
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(i & 1, (i & 147) != 146)) {
            h95 h95Var = (h95) this.f9836a.get(iIntValue);
            tj3Var.m22111b0(530502096);
            boolean z = h95Var instanceof b95;
            b85 b85Var = this.f9837b;
            if (z) {
                tj3Var.m22111b0(530368857);
                AbstractC2143d.m9057a(((b95) h95Var).m3492b(), b85Var, tj3Var, 0);
                tj3Var.m22139q(false);
            } else if (fa4.m11650l(h95Var, c95.f9761b)) {
                tj3Var.m22111b0(530658800);
                vjd.m23357a(tj3Var, 0);
                tj3Var.m22139q(false);
            } else {
                boolean z2 = h95Var instanceof e95;
                b16 b16Var = b16.f7762a;
                if (z2) {
                    tj3Var.m22111b0(530813397);
                    ux5.m23003z(b16Var, ((e95) h95Var).f36877b, tj3Var, false);
                } else {
                    boolean z3 = h95Var instanceof f95;
                    p84 p84Var = we1.f66679a;
                    if (z3) {
                        tj3Var.m22111b0(530994809);
                        f95 f95Var = (f95) h95Var;
                        boolean zM22124i = tj3Var.m22124i(b85Var);
                        Object objM22097O = tj3Var.m22097O();
                        if (zM22124i || objM22097O == p84Var) {
                            objM22097O = new c82(b85Var, 4);
                            tj3Var.m22131l0(objM22097O);
                        }
                        AbstractC3584sr.m21616b(f95Var, null, (ui3) objM22097O, this.f9838c, tj3Var, 0);
                        tj3Var.m22139q(false);
                    } else if (h95Var instanceof g95) {
                        tj3Var.m22111b0(531514090);
                        g95 g95Var = (g95) h95Var;
                        sn7 sn7VarM12422b = g95Var.m12422b();
                        boolean zM12423c = g95Var.m12423c();
                        up6 up6Var = sn7VarM12422b.f61064b;
                        BannerType bannerType = !fy9.m12247b(this.f9838c) ? BannerType.LIBRARY_TABLET : BannerType.LIBRARY;
                        if (up6Var == null || (offerBannerM22853a2 = up6Var.m22853a(bannerType, sn7VarM12422b.f61065c)) == null || (strM8104a = offerBannerM22853a2.m8104a()) == null) {
                            strM8104a = (up6Var == null || (offerBannerM22853a = up6Var.m22853a(bannerType, "en")) == null) ? null : offerBannerM22853a.m8104a();
                        }
                        if (strM8104a != null) {
                            tj3Var.m22111b0(532235460);
                            e16 e16VarM21609V = AbstractC3584sr.m21609V(c99.m4412e(b16Var, 1.0f), ((fe9) tj3Var.m22128k(ge9.f40637a)).f38960i, 0.0f, 2);
                            boolean zM22124i2 = tj3Var.m22124i(b85Var);
                            Object objM22097O2 = tj3Var.m22097O();
                            if (zM22124i2 || objM22097O2 == p84Var) {
                                objM22097O2 = new za5(b85Var, 0);
                                tj3Var.m22131l0(objM22097O2);
                            }
                            ui3 ui3Var = (ui3) objM22097O2;
                            boolean zM22124i3 = tj3Var.m22124i(b85Var);
                            Object objM22097O3 = tj3Var.m22097O();
                            if (zM22124i3 || objM22097O3 == p84Var) {
                                objM22097O3 = new za5(b85Var, 1);
                                tj3Var.m22131l0(objM22097O3);
                            }
                            p9d.m18996b(e16VarM21609V, strM8104a, zM12423c, ui3Var, (ui3) objM22097O3, tj3Var, 0, 0);
                            tj3Var = tj3Var;
                            tj3Var.m22139q(false);
                        } else {
                            tj3Var.m22111b0(533089200);
                            e16 e16VarM21609V2 = AbstractC3584sr.m21609V(c99.m4412e(b16Var, 1.0f), ((fe9) tj3Var.m22128k(ge9.f40637a)).f38960i, 0.0f, 2);
                            boolean zM22124i4 = tj3Var.m22124i(b85Var);
                            Object objM22097O4 = tj3Var.m22097O();
                            if (zM22124i4 || objM22097O4 == p84Var) {
                                objM22097O4 = new za5(b85Var, 2);
                                tj3Var.m22131l0(objM22097O4);
                            }
                            n9d.m17299a(0, 0, tj3Var, (ui3) objM22097O4, e16VarM21609V2);
                            tj3Var.m22139q(false);
                        }
                        tj3Var.m22139q(false);
                    } else if (h95Var instanceof a95) {
                        tj3Var.m22111b0(533771882);
                        e16 e16VarM21609V3 = AbstractC3584sr.m21609V(c99.m4412e(b16Var, 1.0f), ((fe9) tj3Var.m22128k(ge9.f40637a)).f38960i, 0.0f, 2);
                        ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                        int iHashCode = Long.hashCode(tj3Var.f62385T);
                        l77 l77VarM22132m = tj3Var.m22132m();
                        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21609V3);
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
                        ws1 ws1VarM189b = ((a95) h95Var).m189b();
                        boolean zM22124i5 = tj3Var.m22124i(b85Var);
                        Object objM22097O5 = tj3Var.m22097O();
                        if (zM22124i5 || objM22097O5 == p84Var) {
                            objM22097O5 = new za5(b85Var, 3);
                            tj3Var.m22131l0(objM22097O5);
                        }
                        ui3 ui3Var3 = (ui3) objM22097O5;
                        boolean zM22124i6 = tj3Var.m22124i(b85Var);
                        Object objM22097O6 = tj3Var.m22097O();
                        if (zM22124i6 || objM22097O6 == p84Var) {
                            objM22097O6 = new za5(b85Var, 4);
                            tj3Var.m22131l0(objM22097O6);
                        }
                        AbstractC1985e.m8850b(ws1VarM189b, ui3Var3, (ui3) objM22097O6, null, tj3Var, 0);
                        boolean zM22124i7 = tj3Var.m22124i(b85Var);
                        Object objM22097O7 = tj3Var.m22097O();
                        if (zM22124i7 || objM22097O7 == p84Var) {
                            objM22097O7 = new za5(b85Var, 5);
                            tj3Var.m22131l0(objM22097O7);
                        }
                        omd.m18141c((ui3) objM22097O7, c99.m4422o(ci0.f10109a.mo3727a(b16Var, nj0.f52810e), 32.0f), false, null, null, wfb.f66769e, tj3Var, 1572864, 60);
                        tj3Var = tj3Var;
                        tj3Var.m22139q(true);
                        tj3Var.m22139q(false);
                    } else {
                        if (!(h95Var instanceof d95)) {
                            throw ux5.m23001x(tj3Var, 294207635, false);
                        }
                        tj3Var.m22111b0(535454283);
                        d95 d95Var = (d95) h95Var;
                        y59 y59Var = d95Var.f35218c;
                        LibraryShelf libraryShelf = d95Var.f35217b;
                        x85 x85Var = new x85(libraryShelf.f19498f, libraryShelf);
                        boolean zM22124i8 = tj3Var.m22124i(b85Var) | tj3Var.m22120g(h95Var);
                        Object objM22097O8 = tj3Var.m22097O();
                        if (zM22124i8 || objM22097O8 == p84Var) {
                            objM22097O8 = new cm1(4, b85Var, d95Var);
                            tj3Var.m22131l0(objM22097O8);
                        }
                        vi3 vi3Var = (vi3) objM22097O8;
                        boolean zM22124i9 = tj3Var.m22124i(b85Var);
                        Object objM22097O9 = tj3Var.m22097O();
                        if (zM22124i9 || objM22097O9 == p84Var) {
                            objM22097O9 = new ab5(b85Var, 0);
                            tj3Var.m22131l0(objM22097O9);
                        }
                        vi3 vi3Var2 = (vi3) objM22097O9;
                        boolean zM22124i10 = tj3Var.m22124i(b85Var);
                        Object objM22097O10 = tj3Var.m22097O();
                        if (zM22124i10 || objM22097O10 == p84Var) {
                            objM22097O10 = new ab5(b85Var, 1);
                            tj3Var.m22131l0(objM22097O10);
                        }
                        xwc.m24760d(x85Var, vi3Var, vi3Var2, (vi3) objM22097O10, tj3Var, 0, 0);
                        Set set = this.f9839d;
                        boolean zM22120g = tj3Var.m22120g(h95Var) | tj3Var.m22124i(set) | tj3Var.m22124i(b85Var);
                        Object objM22097O11 = tj3Var.m22097O();
                        if (zM22120g || objM22097O11 == p84Var) {
                            objM22097O11 = new bb5(set, d95Var, b85Var);
                            tj3Var.m22131l0(objM22097O11);
                        }
                        AbstractC2143d.m9060d(AbstractC3184kh.m15198E((vi3) objM22097O11), y59Var, b85Var, d95Var.f35219d.equals(this.f9840e), tj3Var, 0);
                        tj3Var.m22139q(false);
                    }
                }
            }
            tj3Var.m22139q(false);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }
}
