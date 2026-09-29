package p000;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.library.LibraryItemCounter;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.feature.collections.R$string;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;
import p000.wfb;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w7d {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m23806a(final f71 f71Var, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, int i) {
        vi3 vi3Var3;
        vi3 vi3Var4;
        p84 p84Var;
        zi3 zi3Var;
        ui3 ui3Var;
        ec0 ec0Var;
        int i2;
        C3549ru c3549ru;
        fc0 fc0Var;
        boolean z;
        boolean z2;
        vi3 vi3Var5;
        LibraryItemCounter libraryItemCounter;
        ui3 ui3Var2;
        zi3 zi3Var2;
        e16 e16Var;
        ui3 ui3Var3;
        boolean z3;
        ui3 ui3Var4;
        boolean z4;
        vi3 vi3Var6;
        boolean z5;
        p84 p84Var2;
        boolean z6 = f71Var.f38546g;
        LibraryItem libraryItem = f71Var.f38540a;
        LibraryItemCounter libraryItemCounter2 = f71Var.f38541b;
        C3549ru c3549ru2 = eh0.f37236b;
        fc0 fc0Var2 = nj0.f52789H;
        vi3Var.getClass();
        vi3Var2.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-149518760);
        int i3 = (tj3Var.m22124i(f71Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= tj3Var.m22124i(vi3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= tj3Var.m22124i(vi3Var2) ? 256 : 128;
        }
        if (tj3Var.m22099R(i3 & 1, (i3 & 147) != 146)) {
            int iMax = Math.max(libraryItemCounter2.f19464j, Math.max(libraryItemCounter2.f19466l, libraryItemCounter2.f19465k));
            if (iMax < 1) {
                iMax = 1;
            }
            b16 b16Var = b16.f7762a;
            e16 e16VarM21609V = AbstractC3584sr.m21609V(c99.m4412e(b16Var, 1.0f), 0.0f, ge9.m12515a(tj3Var).f38952a, 1);
            C3587su c3587su = eh0.f37238d;
            ec0 ec0Var2 = nj0.f52791J;
            bb1 bb1VarM230a = ab1.m230a(c3587su, ec0Var2, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21609V);
            se1.f60731q.getClass();
            ui3 ui3Var5 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var5);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var3 = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var3, bb1VarM230a);
            zi3 zi3Var4 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var4, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            int i4 = iMax;
            zi3 zi3Var5 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var5, numValueOf);
            vi3 vi3Var7 = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var7);
            zi3 zi3Var6 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var6, e16VarM1322c);
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            bb1 bb1VarM230a2 = ab1.m230a(c3587su, ec0Var2, tj3Var, 0);
            int i5 = i3;
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM4412e);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var5);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var3, bb1VarM230a2);
            oha.m18001g(tj3Var, zi3Var4, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var5, tj3Var, vi3Var7);
            oha.m18001g(tj3Var, zi3Var6, e16VarM1322c2);
            List list = libraryItem.f19422W;
            if (list == null) {
                list = EmptyList.f47638a;
            }
            m23809d(list, tj3Var, 0);
            String str = libraryItem.f19448t;
            p84 p84Var3 = we1.f66679a;
            if (str == null || vk9.m23391n0(str)) {
                p84Var = p84Var3;
                zi3Var = zi3Var5;
                ui3Var = ui3Var5;
                ec0Var = ec0Var2;
                i2 = i5;
                c3549ru = c3549ru2;
                fc0Var = fc0Var2;
                z = true;
                z2 = false;
                tj3Var.m22111b0(-1271810018);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-1273319749);
                e16 e16VarM10007D = d32.m10007D(pb1.m19045o(AbstractC3584sr.m21611X(b16Var, 0.0f, ge9.m12515a(tj3Var).f38952a, 0.0f, 0.0f, 13), p58.m18901i(tj3Var).f64856b), p58.m18900f(tj3Var).f55824I, ss5.f61356d);
                int i6 = i5 & 896;
                boolean zM22124i = (i6 == 256) | tj3Var.m22124i(f71Var);
                Object objM22097O = tj3Var.m22097O();
                if (zM22124i || objM22097O == p84Var3) {
                    objM22097O = new d61(vi3Var2, f71Var, 4);
                    tj3Var.m22131l0(objM22097O);
                }
                e16 e16VarM21607T = AbstractC3584sr.m21607T(AbstractC0080f.m815b(null, false, (ui3) objM22097O, e16VarM10007D, 15), ge9.m12515a(tj3Var).f38952a);
                sj8 sj8VarM20003a = qj8.m20003a(c3549ru2, fc0Var2, tj3Var, 48);
                int iHashCode3 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m3 = tj3Var.m22132m();
                e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM21607T);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var5);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var3, sj8VarM20003a);
                oha.m18001g(tj3Var, zi3Var4, l77VarM22132m3);
                AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var5, tj3Var, vi3Var7);
                oha.m18001g(tj3Var, zi3Var6, e16VarM1322c3);
                zi3Var = zi3Var5;
                ec0Var = ec0Var2;
                c3549ru = c3549ru2;
                i2 = i5;
                ui3Var = ui3Var5;
                fc0Var = fc0Var2;
                z = true;
                ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_link_s, tj3Var, 0), null, null, 0L, tj3Var, 56, 12);
                e16 e16VarM17728c = AbstractC3393o1.m17728c(1.0f, AbstractC3584sr.m21611X(b16Var, ge9.m12515a(tj3Var).f38955d, 0.0f, 0.0f, 0.0f, 14), true);
                String str2 = libraryItem.f19448t;
                if (str2 == null) {
                    str2 = "";
                }
                lw9.m16554b(str2, e16VarM17728c, 0L, null, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, p58.m18902j(tj3Var).f71408l, tj3Var, 0, 24960, 110588);
                boolean zM22124i2 = tj3Var.m22124i(f71Var) | (i6 == 256);
                Object objM22097O2 = tj3Var.m22097O();
                if (zM22124i2) {
                    p84Var2 = p84Var3;
                } else {
                    p84Var2 = p84Var3;
                    if (objM22097O2 == p84Var2) {
                    }
                    p84Var = p84Var2;
                    omd.m18141c((ui3) objM22097O2, null, false, null, null, iob.f44383c, tj3Var, 1572864, 62);
                    tj3Var = tj3Var;
                    tj3Var.m22139q(true);
                    z2 = false;
                    tj3Var.m22139q(false);
                }
                objM22097O2 = new d61(vi3Var2, f71Var, 8);
                tj3Var.m22131l0(objM22097O2);
                p84Var = p84Var2;
                omd.m18141c((ui3) objM22097O2, null, false, null, null, iob.f44383c, tj3Var, 1572864, 62);
                tj3Var = tj3Var;
                tj3Var.m22139q(true);
                z2 = false;
                tj3Var.m22139q(false);
            }
            String str3 = libraryItem.f19434f;
            if (str3 == null || (vk9.m23391n0(str3) ^ z) != z) {
                vi3Var5 = vi3Var;
                tj3Var.m22111b0(-1270239682);
                tj3Var.m22139q(z2);
            } else {
                tj3Var.m22111b0(-1271697519);
                Object objM22097O3 = tj3Var.m22097O();
                if (objM22097O3 == p84Var) {
                    objM22097O3 = AbstractC0278f.m1260j(Boolean.FALSE);
                    tj3Var.m22131l0(objM22097O3);
                }
                t66 t66Var = (t66) objM22097O3;
                e16 e16VarM21611X = AbstractC3584sr.m21611X(r19, 0.0f, ge9.m12515a(tj3Var).f38952a, 0.0f, 0.0f, 13);
                String str4 = libraryItem.f19434f;
                String str5 = str4 != null ? str4 : "";
                vx9 vx9Var = p58.m18902j(tj3Var).f71407k;
                int i7 = z6 ? Integer.MAX_VALUE : 4;
                boolean zM22124i3 = tj3Var.m22124i(f71Var);
                Object objM22097O4 = tj3Var.m22097O();
                if (zM22124i3 || objM22097O4 == p84Var) {
                    objM22097O4 = new s70(22, f71Var, t66Var);
                    tj3Var.m22131l0(objM22097O4);
                }
                tj3 tj3Var2 = tj3Var;
                boolean z7 = z2;
                lw9.m16554b(str5, e16VarM21611X, 0L, null, 0L, null, null, 0L, null, null, 0L, 2, false, i7, 0, (vi3) objM22097O4, vx9Var, tj3Var2, 0, 384, 45052);
                tj3Var = tj3Var2;
                if (((Boolean) t66Var.getValue()).booleanValue() || z6) {
                    tj3Var.m22111b0(-1270986410);
                    e16 e16VarM21611X2 = AbstractC3584sr.m21611X(b16Var, 0.0f, ge9.m12515a(tj3Var).f38955d, 0.0f, 0.0f, 13);
                    int i8 = i2;
                    boolean z8 = (tj3Var.m22124i(f71Var) ? 1 : 0) | ((i8 & 112) == 32 ? (char) 1 : z7 ? 1 : 0);
                    Object objM22097O5 = tj3Var.m22097O();
                    if (z8 != 0 || objM22097O5 == p84Var) {
                        vi3Var6 = vi3Var;
                        objM22097O5 = new d61(vi3Var6, f71Var, z7 ? 1 : 0);
                        tj3Var.m22131l0(objM22097O5);
                    } else {
                        vi3Var6 = vi3Var;
                    }
                    e16 e16VarM815b = AbstractC0080f.m815b(null, z7, (ui3) objM22097O5, e16VarM21611X2, 15);
                    i2 = i8;
                    vi3Var5 = vi3Var6;
                    lw9.m16554b(vz1.m23620a0(tj3Var, z6 ? R$string.ui_show_less : com.lingq.core.p012ui.R$string.ui_show_all), e16VarM815b, p58.m18900f(tj3Var).f55842a, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71408l, tj3Var, 0, 0, 131064);
                    tj3Var = tj3Var;
                    z5 = false;
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(-1270253570);
                    tj3Var.m22139q(z7);
                    z5 = z7 ? 1 : 0;
                    vi3Var5 = vi3Var;
                }
                tj3Var.m22139q(z5);
            }
            if (libraryItem.f19423X > 0) {
                tj3Var.m22111b0(-1270121851);
                e16 e16VarM21611X3 = AbstractC3584sr.m21611X(r19, 0.0f, ge9.m12515a(tj3Var).f38952a, 0.0f, 0.0f, 13);
                sj8 sj8VarM20003a2 = qj8.m20003a(new C3661uu(ge9.m12515a(tj3Var).f38952a, true, new gm5(28)), fc0Var, tj3Var, 48);
                int iHashCode4 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m4 = tj3Var.m22132m();
                e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var, e16VarM21611X3);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    ui3Var4 = ui3Var;
                    tj3Var.m22130l(ui3Var4);
                } else {
                    ui3Var4 = ui3Var;
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var3, sj8VarM20003a2);
                oha.m18001g(tj3Var, zi3Var4, l77VarM22132m4);
                zi3 zi3Var7 = zi3Var;
                AbstractC3393o1.m17747v(iHashCode4, tj3Var, zi3Var7, tj3Var, vi3Var7);
                oha.m18001g(tj3Var, zi3Var6, e16VarM1322c4);
                final int i9 = 0;
                tj3 tj3Var3 = tj3Var;
                zi3Var2 = zi3Var7;
                e16Var = r19;
                ui3Var2 = ui3Var4;
                fc0Var = fc0Var;
                ho9.m13414a(null, p58.m18901i(tj3Var).f64856b, p58.m18900f(tj3Var).f55856h, 0L, 0.0f, 0.0f, null, ci8.m4703P(2118397718, new zi3() { // from class: e61
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        long jM4212e;
                        int i10 = i9;
                        b16 b16Var2 = b16.f7762a;
                        xfa xfaVar = xfa.f68157a;
                        f71 f71Var2 = f71Var;
                        switch (i10) {
                            case 0:
                                ye1 ye1Var2 = (ye1) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                tj3 tj3Var4 = (tj3) ye1Var2;
                                if (!tj3Var4.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    tj3Var4.m22102U();
                                } else {
                                    zf1 zf1Var = ge9.f40637a;
                                    lw9.m16554b(vz1.m23618Z(R$string.course_premium_points, new Object[]{Integer.valueOf(f71Var2.f38540a.f19423X)}, tj3Var4), AbstractC3584sr.m21608U(b16Var2, ((fe9) tj3Var4.m22128k(zf1Var)).f38952a, ((fe9) tj3Var4.m22128k(zf1Var)).f38955d), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var4.m22128k(ps5.f56764b)).f51800b.f71408l, tj3Var4, 0, 0, 131068);
                                }
                                break;
                            case 1:
                                ye1 ye1Var3 = (ye1) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                tj3 tj3Var5 = (tj3) ye1Var3;
                                if (!tj3Var5.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    tj3Var5.m22102U();
                                } else {
                                    ty3.m22352b(AbstractC3423or.m18236U(f71Var2.f38541b.f19456b ? R$drawable.ic_heart_filled_s : R$drawable.ic_heart_s, tj3Var5, 0), null, null, 0L, tj3Var5, 56, 12);
                                }
                                break;
                            case 2:
                                boolean z9 = f71Var2.f38550k;
                                ye1 ye1Var4 = (ye1) obj;
                                int iIntValue3 = ((Integer) obj2).intValue();
                                tj3 tj3Var6 = (tj3) ye1Var4;
                                if (!tj3Var6.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                    tj3Var6.m22102U();
                                } else {
                                    ty3.m22352b(AbstractC3423or.m18236U(z9 ? R$drawable.ic_bell_filled_s : R$drawable.ic_bell_s, tj3Var6, 0), vz1.m23620a0(tj3Var6, z9 ? com.lingq.core.p012ui.R$string.course_unsubscribe : com.lingq.core.p012ui.R$string.course_subscribe), null, ((ms5) tj3Var6.m22128k(ps5.f56764b)).f51799a.f55873q, tj3Var6, 8, 4);
                                }
                                break;
                            default:
                                ye1 ye1Var5 = (ye1) obj;
                                int iIntValue4 = ((Integer) obj2).intValue();
                                tj3 tj3Var7 = (tj3) ye1Var5;
                                if (!tj3Var7.m22099R(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                                    tj3Var7.m22102U();
                                } else if (!f71Var2.f38544e) {
                                    tj3Var7.m22111b0(1277667869);
                                    y27 y27VarM18236U = AbstractC3423or.m18236U(R$drawable.ic_download, tj3Var7, 0);
                                    if (f71Var2.f38543d) {
                                        tj3Var7.m22111b0(1277896153);
                                        jM4212e = ((bx2) tj3Var7.m22128k(cx2.f34676a)).m4212e();
                                        tj3Var7.m22139q(false);
                                    } else {
                                        tj3Var7.m22111b0(1278012093);
                                        jM4212e = ((ms5) tj3Var7.m22128k(ps5.f56764b)).f51799a.f55873q;
                                        tj3Var7.m22139q(false);
                                    }
                                    ty3.m22352b(y27VarM18236U, null, null, jM4212e, tj3Var7, 56, 4);
                                    tj3Var7.m22139q(false);
                                } else {
                                    tj3Var7.m22111b0(1277401610);
                                    ((fe9) tj3Var7.m22128k(ge9.f40637a)).getClass();
                                    dn7.m10492a(c99.m4422o(b16Var2, 16.0f), 0L, 2.0f, 0L, 0, 0.0f, tj3Var7, 384, 58);
                                    tj3Var7.m22139q(false);
                                }
                                break;
                        }
                        return xfaVar;
                    }
                }, tj3Var), tj3Var3, 12582912, 121);
                tj3Var = tj3Var3;
                if (libraryItemCounter2.f19467m) {
                    fc0Var = fc0Var;
                    libraryItemCounter = libraryItemCounter2;
                    z4 = false;
                    tj3Var.m22111b0(-919266201);
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(-920085934);
                    if (f71Var.f38545f) {
                        tj3Var.m22111b0(-920052919);
                        ge9.m12515a(tj3Var).getClass();
                        libraryItemCounter = libraryItemCounter2;
                        dn7.m10492a(c99.m4422o(e16Var, 40.0f), 0L, 2.0f, 0L, 0, 0.0f, tj3Var, 384, 58);
                        tj3Var = tj3Var;
                        z4 = false;
                        tj3Var.m22139q(false);
                    } else {
                        libraryItemCounter = libraryItemCounter2;
                        tj3Var.m22111b0(-919758760);
                        boolean zM22124i4 = tj3Var.m22124i(f71Var) | ((i2 & 112) == 32);
                        Object objM22097O6 = tj3Var.m22097O();
                        if (zM22124i4 || objM22097O6 == p84Var) {
                            objM22097O6 = new d61(vi3Var5, f71Var, 1);
                            tj3Var.m22131l0(objM22097O6);
                        }
                        lw9.m16554b(vz1.m23620a0(tj3Var, R$string.purchase), AbstractC0080f.m815b(null, false, (ui3) objM22097O6, e16Var, 15), p58.m18900f(tj3Var).f55842a, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71409m, tj3Var, 0, 0, 131064);
                        tj3Var = tj3Var;
                        z4 = false;
                        tj3Var.m22139q(false);
                    }
                    tj3Var.m22139q(z4);
                }
                tj3Var.m22139q(true);
                tj3Var.m22139q(z4);
            } else {
                libraryItemCounter = libraryItemCounter2;
                ui3Var2 = ui3Var;
                zi3Var2 = zi3Var;
                e16Var = r19;
                tj3Var.m22111b0(-1268300322);
                tj3Var.m22139q(false);
            }
            e16 e16VarM21611X4 = AbstractC3584sr.m21611X(c99.m4412e(e16Var, 1.0f), 0.0f, ge9.m12515a(tj3Var).f38956e, 0.0f, 0.0f, 13);
            C3661uu c3661uu = new C3661uu(ge9.m12515a(tj3Var).f38952a, true, new gm5(28));
            fc0 fc0Var3 = nj0.f52817l;
            sj8 sj8VarM20003a3 = qj8.m20003a(c3661uu, fc0Var3, tj3Var, 48);
            int iHashCode5 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m5 = tj3Var.m22132m();
            e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var, e16VarM21611X4);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                ui3Var3 = ui3Var2;
                tj3Var.m22130l(ui3Var3);
            } else {
                ui3Var3 = ui3Var2;
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var3, sj8VarM20003a3);
            oha.m18001g(tj3Var, zi3Var4, l77VarM22132m5);
            zi3 zi3Var8 = zi3Var2;
            AbstractC3393o1.m17747v(iHashCode5, tj3Var, zi3Var8, tj3Var, vi3Var7);
            oha.m18001g(tj3Var, zi3Var6, e16VarM1322c5);
            if (1.0f <= 0.0d) {
                g54.m12362a("invalid weight; must be greater than zero");
            }
            as4 as4Var = new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            e16 e16Var2 = e16Var;
            bb1 bb1VarM230a3 = ab1.m230a(c3587su, ec0Var, tj3Var, 0);
            LibraryItemCounter libraryItemCounter3 = libraryItemCounter;
            int iHashCode6 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m6 = tj3Var.m22132m();
            e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var, as4Var);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var3);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var3, bb1VarM230a3);
            oha.m18001g(tj3Var, zi3Var4, l77VarM22132m6);
            AbstractC3393o1.m17747v(iHashCode6, tj3Var, zi3Var8, tj3Var, vi3Var7);
            oha.m18001g(tj3Var, zi3Var6, e16VarM1322c6);
            String strM23620a0 = vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.feed_words_new);
            int i10 = libraryItemCounter3.f19464j;
            float f = i4;
            ui3 ui3Var6 = ui3Var3;
            m23807b(strM23620a0, i10, i10 / f, cx2.m9917a(tj3Var).m4209b(), tj3Var, 0);
            String strM23620a1 = vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.lingq_lingqs);
            int i11 = libraryItemCounter3.f19466l;
            m23807b(strM23620a1, i11, i11 / f, cx2.m9917a(tj3Var).m4212e(), tj3Var, 0);
            String strM23620a2 = vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.stats_known_words);
            int i12 = libraryItemCounter3.f19465k;
            m23807b(strM23620a2, i12, i12 / f, cx2.m9917a(tj3Var).m4212e(), tj3Var, 0);
            tj3 tj3Var4 = tj3Var;
            lw9.m16554b(vz1.m23618Z(com.lingq.core.p012ui.R$string.content_info_totals, new Object[]{Integer.valueOf(libraryItemCounter3.f19468n), Integer.valueOf(libraryItemCounter3.f19469o)}, tj3Var), AbstractC3584sr.m21611X(e16Var2, 0.0f, ge9.m12515a(tj3Var).f38952a, 0.0f, 0.0f, 13), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71408l, tj3Var4, 0, 0, 131068);
            tj3Var4.m22139q(true);
            m23808c(f71Var, c99.m4426s(e16Var2, 136.0f), tj3Var4, (i2 & 14) | 48);
            tj3Var4.m22139q(true);
            e16 e16VarM21611X5 = AbstractC3584sr.m21611X(c99.m4412e(e16Var2, 1.0f), 0.0f, ge9.m12515a(tj3Var4).f38956e, 0.0f, 0.0f, 13);
            sj8 sj8VarM20003a4 = qj8.m20003a(c3549ru, fc0Var, tj3Var4, 48);
            int iHashCode7 = Long.hashCode(tj3Var4.f62385T);
            l77 l77VarM22132m7 = tj3Var4.m22132m();
            e16 e16VarM1322c7 = AbstractC0287b.m1322c(tj3Var4, e16VarM21611X5);
            tj3Var4.m22119f0();
            if (tj3Var4.f62384S) {
                tj3Var4.m22130l(ui3Var6);
            } else {
                tj3Var4.m22137o0();
            }
            oha.m18001g(tj3Var4, zi3Var3, sj8VarM20003a4);
            oha.m18001g(tj3Var4, zi3Var4, l77VarM22132m7);
            AbstractC3393o1.m17747v(iHashCode7, tj3Var4, zi3Var8, tj3Var4, vi3Var7);
            oha.m18001g(tj3Var4, zi3Var6, e16VarM1322c7);
            if (1.0f <= 0.0d) {
                g54.m12362a("invalid weight; must be greater than zero");
            }
            as4 as4Var2 = new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            int i13 = i2;
            int i14 = i13 & 896;
            boolean zM22124i5 = tj3Var4.m22124i(f71Var) | (i14 == 256);
            Object objM22097O7 = tj3Var4.m22097O();
            if (zM22124i5 || objM22097O7 == p84Var) {
                objM22097O7 = new d61(f71Var, vi3Var2);
                tj3Var4.m22131l0(objM22097O7);
            }
            AbstractC0231g.m1148a((ui3) objM22097O7, as4Var2, false, null, null, null, null, null, ci8.m4703P(1132143631, new se0(f71Var, 4), tj3Var4), tj3Var4, 805306368, 508);
            tj3Var = tj3Var4;
            e16 e16VarM21611X6 = AbstractC3584sr.m21611X(e16Var2, ge9.m12515a(tj3Var).f38952a, 0.0f, 0.0f, 0.0f, 14);
            sj8 sj8VarM20003a5 = qj8.m20003a(new C3661uu(ge9.m12515a(tj3Var).f38955d, true, new gm5(28)), fc0Var3, tj3Var, 0);
            int iHashCode8 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m8 = tj3Var.m22132m();
            e16 e16VarM1322c8 = AbstractC0287b.m1322c(tj3Var, e16VarM21611X6);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var6);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var3, sj8VarM20003a5);
            oha.m18001g(tj3Var, zi3Var4, l77VarM22132m8);
            AbstractC3393o1.m17747v(iHashCode8, tj3Var, zi3Var8, tj3Var, vi3Var7);
            oha.m18001g(tj3Var, zi3Var6, e16VarM1322c8);
            int i15 = i13 & 112;
            boolean zM22124i6 = tj3Var.m22124i(f71Var) | (i15 == 32);
            Object objM22097O8 = tj3Var.m22097O();
            final int i16 = 3;
            if (zM22124i6 || objM22097O8 == p84Var) {
                vi3Var3 = vi3Var;
                objM22097O8 = new d61(vi3Var3, f71Var, 3);
                tj3Var.m22131l0(objM22097O8);
            } else {
                vi3Var3 = vi3Var;
            }
            final int i17 = 1;
            m23810e((ui3) objM22097O8, ci8.m4703P(-436288926, new zi3() { // from class: e61
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    long jM4212e;
                    int i18 = i17;
                    b16 b16Var2 = b16.f7762a;
                    xfa xfaVar = xfa.f68157a;
                    f71 f71Var2 = f71Var;
                    switch (i18) {
                        case 0:
                            ye1 ye1Var2 = (ye1) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            tj3 tj3Var5 = (tj3) ye1Var2;
                            if (!tj3Var5.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                tj3Var5.m22102U();
                            } else {
                                zf1 zf1Var = ge9.f40637a;
                                lw9.m16554b(vz1.m23618Z(R$string.course_premium_points, new Object[]{Integer.valueOf(f71Var2.f38540a.f19423X)}, tj3Var5), AbstractC3584sr.m21608U(b16Var2, ((fe9) tj3Var5.m22128k(zf1Var)).f38952a, ((fe9) tj3Var5.m22128k(zf1Var)).f38955d), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var5.m22128k(ps5.f56764b)).f51800b.f71408l, tj3Var5, 0, 0, 131068);
                            }
                            break;
                        case 1:
                            ye1 ye1Var3 = (ye1) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            tj3 tj3Var6 = (tj3) ye1Var3;
                            if (!tj3Var6.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                tj3Var6.m22102U();
                            } else {
                                ty3.m22352b(AbstractC3423or.m18236U(f71Var2.f38541b.f19456b ? R$drawable.ic_heart_filled_s : R$drawable.ic_heart_s, tj3Var6, 0), null, null, 0L, tj3Var6, 56, 12);
                            }
                            break;
                        case 2:
                            boolean z9 = f71Var2.f38550k;
                            ye1 ye1Var4 = (ye1) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            tj3 tj3Var7 = (tj3) ye1Var4;
                            if (!tj3Var7.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                tj3Var7.m22102U();
                            } else {
                                ty3.m22352b(AbstractC3423or.m18236U(z9 ? R$drawable.ic_bell_filled_s : R$drawable.ic_bell_s, tj3Var7, 0), vz1.m23620a0(tj3Var7, z9 ? com.lingq.core.p012ui.R$string.course_unsubscribe : com.lingq.core.p012ui.R$string.course_subscribe), null, ((ms5) tj3Var7.m22128k(ps5.f56764b)).f51799a.f55873q, tj3Var7, 8, 4);
                            }
                            break;
                        default:
                            ye1 ye1Var5 = (ye1) obj;
                            int iIntValue4 = ((Integer) obj2).intValue();
                            tj3 tj3Var8 = (tj3) ye1Var5;
                            if (!tj3Var8.m22099R(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                                tj3Var8.m22102U();
                            } else if (!f71Var2.f38544e) {
                                tj3Var8.m22111b0(1277667869);
                                y27 y27VarM18236U = AbstractC3423or.m18236U(R$drawable.ic_download, tj3Var8, 0);
                                if (f71Var2.f38543d) {
                                    tj3Var8.m22111b0(1277896153);
                                    jM4212e = ((bx2) tj3Var8.m22128k(cx2.f34676a)).m4212e();
                                    tj3Var8.m22139q(false);
                                } else {
                                    tj3Var8.m22111b0(1278012093);
                                    jM4212e = ((ms5) tj3Var8.m22128k(ps5.f56764b)).f51799a.f55873q;
                                    tj3Var8.m22139q(false);
                                }
                                ty3.m22352b(y27VarM18236U, null, null, jM4212e, tj3Var8, 56, 4);
                                tj3Var8.m22139q(false);
                            } else {
                                tj3Var8.m22111b0(1277401610);
                                ((fe9) tj3Var8.m22128k(ge9.f40637a)).getClass();
                                dn7.m10492a(c99.m4422o(b16Var2, 16.0f), 0L, 2.0f, 0L, 0, 0.0f, tj3Var8, 384, 58);
                                tj3Var8.m22139q(false);
                            }
                            break;
                    }
                    return xfaVar;
                }
            }, tj3Var), tj3Var, 48);
            if (f71Var.f38549j) {
                tj3Var.m22111b0(-1750140364);
                boolean zM22124i7 = tj3Var.m22124i(f71Var) | (i15 == 32);
                Object objM22097O9 = tj3Var.m22097O();
                if (zM22124i7 || objM22097O9 == p84Var) {
                    objM22097O9 = new d61(vi3Var3, f71Var, 5);
                    tj3Var.m22131l0(objM22097O9);
                }
                final int i18 = 2;
                m23810e((ui3) objM22097O9, ci8.m4703P(1078191101, new zi3() { // from class: e61
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        long jM4212e;
                        int i19 = i18;
                        b16 b16Var2 = b16.f7762a;
                        xfa xfaVar = xfa.f68157a;
                        f71 f71Var2 = f71Var;
                        switch (i19) {
                            case 0:
                                ye1 ye1Var2 = (ye1) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                tj3 tj3Var5 = (tj3) ye1Var2;
                                if (!tj3Var5.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    tj3Var5.m22102U();
                                } else {
                                    zf1 zf1Var = ge9.f40637a;
                                    lw9.m16554b(vz1.m23618Z(R$string.course_premium_points, new Object[]{Integer.valueOf(f71Var2.f38540a.f19423X)}, tj3Var5), AbstractC3584sr.m21608U(b16Var2, ((fe9) tj3Var5.m22128k(zf1Var)).f38952a, ((fe9) tj3Var5.m22128k(zf1Var)).f38955d), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var5.m22128k(ps5.f56764b)).f51800b.f71408l, tj3Var5, 0, 0, 131068);
                                }
                                break;
                            case 1:
                                ye1 ye1Var3 = (ye1) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                tj3 tj3Var6 = (tj3) ye1Var3;
                                if (!tj3Var6.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    tj3Var6.m22102U();
                                } else {
                                    ty3.m22352b(AbstractC3423or.m18236U(f71Var2.f38541b.f19456b ? R$drawable.ic_heart_filled_s : R$drawable.ic_heart_s, tj3Var6, 0), null, null, 0L, tj3Var6, 56, 12);
                                }
                                break;
                            case 2:
                                boolean z9 = f71Var2.f38550k;
                                ye1 ye1Var4 = (ye1) obj;
                                int iIntValue3 = ((Integer) obj2).intValue();
                                tj3 tj3Var7 = (tj3) ye1Var4;
                                if (!tj3Var7.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                    tj3Var7.m22102U();
                                } else {
                                    ty3.m22352b(AbstractC3423or.m18236U(z9 ? R$drawable.ic_bell_filled_s : R$drawable.ic_bell_s, tj3Var7, 0), vz1.m23620a0(tj3Var7, z9 ? com.lingq.core.p012ui.R$string.course_unsubscribe : com.lingq.core.p012ui.R$string.course_subscribe), null, ((ms5) tj3Var7.m22128k(ps5.f56764b)).f51799a.f55873q, tj3Var7, 8, 4);
                                }
                                break;
                            default:
                                ye1 ye1Var5 = (ye1) obj;
                                int iIntValue4 = ((Integer) obj2).intValue();
                                tj3 tj3Var8 = (tj3) ye1Var5;
                                if (!tj3Var8.m22099R(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                                    tj3Var8.m22102U();
                                } else if (!f71Var2.f38544e) {
                                    tj3Var8.m22111b0(1277667869);
                                    y27 y27VarM18236U = AbstractC3423or.m18236U(R$drawable.ic_download, tj3Var8, 0);
                                    if (f71Var2.f38543d) {
                                        tj3Var8.m22111b0(1277896153);
                                        jM4212e = ((bx2) tj3Var8.m22128k(cx2.f34676a)).m4212e();
                                        tj3Var8.m22139q(false);
                                    } else {
                                        tj3Var8.m22111b0(1278012093);
                                        jM4212e = ((ms5) tj3Var8.m22128k(ps5.f56764b)).f51799a.f55873q;
                                        tj3Var8.m22139q(false);
                                    }
                                    ty3.m22352b(y27VarM18236U, null, null, jM4212e, tj3Var8, 56, 4);
                                    tj3Var8.m22139q(false);
                                } else {
                                    tj3Var8.m22111b0(1277401610);
                                    ((fe9) tj3Var8.m22128k(ge9.f40637a)).getClass();
                                    dn7.m10492a(c99.m4422o(b16Var2, 16.0f), 0L, 2.0f, 0L, 0, 0.0f, tj3Var8, 384, 58);
                                    tj3Var8.m22139q(false);
                                }
                                break;
                        }
                        return xfaVar;
                    }
                }, tj3Var), tj3Var, 48);
                z3 = false;
                tj3Var.m22139q(false);
            } else {
                z3 = false;
                tj3Var.m22111b0(-1748991969);
                tj3Var.m22139q(false);
            }
            boolean zM22124i8 = tj3Var.m22124i(f71Var) | (i14 == 256 ? true : z3);
            Object objM22097O10 = tj3Var.m22097O();
            if (zM22124i8 || objM22097O10 == p84Var) {
                vi3Var4 = vi3Var2;
                objM22097O10 = new d61(vi3Var4, f71Var, 6);
                tj3Var.m22131l0(objM22097O10);
            } else {
                vi3Var4 = vi3Var2;
            }
            m23810e((ui3) objM22097O10, iob.f44384d, tj3Var, 48);
            boolean zM22124i9 = tj3Var.m22124i(f71Var) | (i15 == 32 ? true : z3);
            Object objM22097O11 = tj3Var.m22097O();
            if (zM22124i9 || objM22097O11 == p84Var) {
                objM22097O11 = new d61(vi3Var3, f71Var, 7);
                tj3Var.m22131l0(objM22097O11);
            }
            m23810e((ui3) objM22097O11, ci8.m4703P(-772563942, new zi3() { // from class: e61
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    long jM4212e;
                    int i19 = i16;
                    b16 b16Var2 = b16.f7762a;
                    xfa xfaVar = xfa.f68157a;
                    f71 f71Var2 = f71Var;
                    switch (i19) {
                        case 0:
                            ye1 ye1Var2 = (ye1) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            tj3 tj3Var5 = (tj3) ye1Var2;
                            if (!tj3Var5.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                tj3Var5.m22102U();
                            } else {
                                zf1 zf1Var = ge9.f40637a;
                                lw9.m16554b(vz1.m23618Z(R$string.course_premium_points, new Object[]{Integer.valueOf(f71Var2.f38540a.f19423X)}, tj3Var5), AbstractC3584sr.m21608U(b16Var2, ((fe9) tj3Var5.m22128k(zf1Var)).f38952a, ((fe9) tj3Var5.m22128k(zf1Var)).f38955d), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var5.m22128k(ps5.f56764b)).f51800b.f71408l, tj3Var5, 0, 0, 131068);
                            }
                            break;
                        case 1:
                            ye1 ye1Var3 = (ye1) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            tj3 tj3Var6 = (tj3) ye1Var3;
                            if (!tj3Var6.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                tj3Var6.m22102U();
                            } else {
                                ty3.m22352b(AbstractC3423or.m18236U(f71Var2.f38541b.f19456b ? R$drawable.ic_heart_filled_s : R$drawable.ic_heart_s, tj3Var6, 0), null, null, 0L, tj3Var6, 56, 12);
                            }
                            break;
                        case 2:
                            boolean z9 = f71Var2.f38550k;
                            ye1 ye1Var4 = (ye1) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            tj3 tj3Var7 = (tj3) ye1Var4;
                            if (!tj3Var7.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                tj3Var7.m22102U();
                            } else {
                                ty3.m22352b(AbstractC3423or.m18236U(z9 ? R$drawable.ic_bell_filled_s : R$drawable.ic_bell_s, tj3Var7, 0), vz1.m23620a0(tj3Var7, z9 ? com.lingq.core.p012ui.R$string.course_unsubscribe : com.lingq.core.p012ui.R$string.course_subscribe), null, ((ms5) tj3Var7.m22128k(ps5.f56764b)).f51799a.f55873q, tj3Var7, 8, 4);
                            }
                            break;
                        default:
                            ye1 ye1Var5 = (ye1) obj;
                            int iIntValue4 = ((Integer) obj2).intValue();
                            tj3 tj3Var8 = (tj3) ye1Var5;
                            if (!tj3Var8.m22099R(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                                tj3Var8.m22102U();
                            } else if (!f71Var2.f38544e) {
                                tj3Var8.m22111b0(1277667869);
                                y27 y27VarM18236U = AbstractC3423or.m18236U(R$drawable.ic_download, tj3Var8, 0);
                                if (f71Var2.f38543d) {
                                    tj3Var8.m22111b0(1277896153);
                                    jM4212e = ((bx2) tj3Var8.m22128k(cx2.f34676a)).m4212e();
                                    tj3Var8.m22139q(false);
                                } else {
                                    tj3Var8.m22111b0(1278012093);
                                    jM4212e = ((ms5) tj3Var8.m22128k(ps5.f56764b)).f51799a.f55873q;
                                    tj3Var8.m22139q(false);
                                }
                                ty3.m22352b(y27VarM18236U, null, null, jM4212e, tj3Var8, 56, 4);
                                tj3Var8.m22139q(false);
                            } else {
                                tj3Var8.m22111b0(1277401610);
                                ((fe9) tj3Var8.m22128k(ge9.f40637a)).getClass();
                                dn7.m10492a(c99.m4422o(b16Var2, 16.0f), 0L, 2.0f, 0L, 0, 0.0f, tj3Var8, 384, 58);
                                tj3Var8.m22139q(false);
                            }
                            break;
                    }
                    return xfaVar;
                }
            }, tj3Var), tj3Var, 48);
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
        } else {
            vi3Var3 = vi3Var;
            vi3Var4 = vi3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2956e9(i, 8, f71Var, vi3Var3, vi3Var4);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m23807b(String str, int i, float f, long j, ye1 ye1Var, int i2) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1555889278);
        int i3 = i2 | (tj3Var.m22120g(str) ? 4 : 2) | (tj3Var.m22116e(i) ? 32 : 16) | (tj3Var.m22114d(f) ? 256 : 128) | (tj3Var.m22118f(j) ? 2048 : 1024);
        if (tj3Var.m22099R(i3 & 1, (i3 & 1171) != 1170)) {
            zf1 zf1Var = ge9.f40637a;
            float f2 = ((fe9) tj3Var.m22128k(zf1Var)).f38952a;
            b16 b16Var = b16.f7762a;
            e16 e16VarM21611X = AbstractC3584sr.m21611X(b16Var, 0.0f, f2, 0.0f, 0.0f, 13);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21611X);
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
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37242h, nj0.f52817l, tj3Var, 6);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM4412e);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            vh9 vh9Var = ps5.f56764b;
            lw9.m16554b(str, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71407k, tj3Var, i3 & 14, 0, 131070);
            lw9.m16554b(String.valueOf(i), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71407k, tj3Var, 0, 0, 131070);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
            boolean z = (i3 & 896) == 256;
            Object objM22097O = tj3Var.m22097O();
            if (z || objM22097O == we1.f66679a) {
                objM22097O = new h61(0, f);
                tj3Var.m22131l0(objM22097O);
            }
            dn7.m10494c((ui3) objM22097O, c99.m4414g(AbstractC3584sr.m21611X(c99.m4412e(b16Var, 1.0f), 0.0f, ((fe9) tj3Var.m22128k(zf1Var)).f38954c, 0.0f, 0.0f, 13), 6.0f), j, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55822G, 0, 0.0f, null, tj3Var, (i3 >> 3) & 896, 112);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new cv0(str, i, f, j, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    /* JADX INFO: renamed from: c */
    public static final void m23808c(f71 f71Var, e16 e16Var, ye1 ye1Var, int i) {
        Integer numValueOf;
        ui3 ui3Var;
        b16 b16Var;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-120688208);
        int i2 = i | (tj3Var.m22124i(f71Var) ? 4 : 2);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            LibraryItem libraryItem = f71Var.f38540a;
            String str = libraryItem.f19414O;
            if (str == null) {
                numValueOf = null;
            } else {
                int iHashCode = str.hashCode();
                if (iHashCode != -1307827859) {
                    if (iHashCode != 94630981) {
                        if (iHashCode == 812757528 && str.equals("librarian")) {
                            numValueOf = Integer.valueOf(R$drawable.ic_profile_librarian);
                        } else {
                            numValueOf = null;
                        }
                    } else if (str.equals("chief")) {
                        numValueOf = Integer.valueOf(R$drawable.ic_profile_chief_librarian);
                    } else {
                        numValueOf = null;
                    }
                } else if (str.equals("editor")) {
                    numValueOf = Integer.valueOf(R$drawable.ic_profile_editor);
                } else {
                    numValueOf = null;
                }
            }
            Integer num = numValueOf;
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21611X = AbstractC3584sr.m21611X(e16Var, 0.0f, ((fe9) tj3Var.m22128k(zf1Var)).f38957f, 0.0f, 0.0f, 13);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52817l, tj3Var, 48);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21611X);
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
            Integer numValueOf2 = Integer.valueOf(iHashCode2);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf2);
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            b16 b16Var2 = b16.f7762a;
            e16 e16VarM4422o = c99.m4422o(b16Var2, 32.0f);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode3 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM4422o);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, ht5VarM19966d);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            ss5.m21702b(libraryItem.f19413N, null, pb1.m19045o(c99.m4422o(b16Var2, 32.0f), ui8.f63972a), null, hl1.f42564a, tj3Var, 1572912, 4024);
            if (num != null) {
                tj3Var.m22111b0(1809424311);
                ui3Var = ui3Var2;
                b16Var = b16Var2;
                bq1.m4042R(AbstractC3423or.m18236U(num.intValue(), tj3Var, 0), null, c99.m4422o(ci0.f10109a.mo3727a(b16Var2, nj0.f52816k), 16.0f), null, null, 0.0f, null, tj3Var, 56, 120);
                tj3Var = tj3Var;
                tj3Var.m22139q(false);
            } else {
                ui3Var = ui3Var2;
                b16Var = b16Var2;
                tj3Var.m22111b0(1809700552);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(true);
            e16 e16VarM21611X2 = AbstractC3584sr.m21611X(b16Var, ((fe9) tj3Var.m22128k(zf1Var)).f38955d, 0.0f, 0.0f, 0.0f, 14);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
            int iHashCode4 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m3 = tj3Var.m22132m();
            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM21611X2);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m3);
            AbstractC3393o1.m17747v(iHashCode4, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c3);
            if (fa4.m11650l(libraryItem.f19435g, "private")) {
                tj3Var.m22111b0(875597188);
                tj3 tj3Var2 = tj3Var;
                lw9.m16554b(vz1.m23620a0(tj3Var, R$string.lesson_private), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71410n, tj3Var2, 0, 24960, 110590);
                tj3Var = tj3Var2;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(875041110);
                String upperCase = vz1.m23620a0(tj3Var, R$string.lesson_shared_by).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                vh9 vh9Var = ps5.f56764b;
                tj3 tj3Var3 = tj3Var;
                lw9.m16554b(upperCase, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71411o, tj3Var3, 0, 24960, 110590);
                String str2 = libraryItem.f19412M;
                if (str2 == null) {
                    str2 = "";
                }
                lw9.m16554b(str2, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, ((ms5) tj3Var3.m22128k(vh9Var)).f51800b.f71410n, tj3Var3, 0, 24960, 110590);
                tj3Var = tj3Var3;
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3598t4(f71Var, e16Var, i, 12);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m23809d(List list, ye1 ye1Var, int i) {
        int i2;
        x18 x18VarM22143u;
        g61 g61Var;
        boolean z;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1941392077);
        int i3 = 4;
        int i4 = (tj3Var.m22124i(list) ? 4 : 2) | i;
        boolean z2 = true;
        boolean z3 = false;
        if (tj3Var.m22099R(i4 & 1, (i4 & 3) != 2)) {
            if (list.isEmpty()) {
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u == null) {
                    return;
                } else {
                    g61Var = new g61(i, 0, list);
                }
            } else {
                e16 e16VarM3974s0 = bna.m3974s0(b16.f7762a, bna.m3972r0(tj3Var), true, false);
                sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38955d, true, new gm5(28)), nj0.f52817l, tj3Var, 0);
                int iHashCode = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m = tj3Var.m22132m();
                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM3974s0);
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
                tj3Var.m22111b0(1667657645);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (vk9.m23391n0(str)) {
                        z = z3;
                        tj3Var.m22111b0(-468063173);
                        tj3Var.m22139q(z);
                    } else {
                        tj3Var.m22111b0(-468470110);
                        vh9 vh9Var = ps5.f56764b;
                        long j = ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55824I;
                        si8 si8Var = ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64856b;
                        C0282a c0282aM4703P = ci8.m4703P(1579945841, new C3441oz(str, i3), tj3Var);
                        z = z3;
                        ho9.m13414a(null, si8Var, j, 0L, 0.0f, 0.0f, null, c0282aM4703P, tj3Var, 12582912, 121);
                        tj3Var.m22139q(z);
                    }
                    z3 = z;
                    z2 = true;
                    i3 = 4;
                }
                tj3Var.m22139q(z3);
                i2 = 1;
                tj3Var.m22139q(true);
            }
            x18VarM22143u.f67642d = g61Var;
        }
        i2 = 1;
        tj3Var.m22102U();
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            g61Var = new g61(i, i2, list);
            x18VarM22143u.f67642d = g61Var;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m23810e(ui3 ui3Var, C0282a c0282a, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-987049994);
        int i2 = (tj3Var.m22124i(ui3Var) ? 4 : 2) | i;
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            si8 si8VarM22753b = ui8.m22753b(((fe9) tj3Var.m22128k(ge9.f40637a)).f38955d);
            vh9 vh9Var = ps5.f56764b;
            ho9.m13414a(null, si8VarM22753b, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55824I, 0L, 0.0f, 0.0f, ci8.m4714a(1.0f, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55817B), ci8.m4703P(-68361775, new f61(ui3Var, c0282a), tj3Var), tj3Var, 12582912, 57);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new f61(ui3Var, c0282a, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:102:0x0416  */
    /* JADX WARN: Code duplicated, block: B:104:0x0422  */
    /* JADX WARN: Code duplicated, block: B:106:0x045c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0460  */
    /* JADX WARN: Code duplicated, block: B:110:0x0483  */
    /* JADX WARN: Code duplicated, block: B:111:0x048e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0498  */
    /* JADX WARN: Code duplicated, block: B:115:0x049b  */
    /* JADX WARN: Code duplicated, block: B:119:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:122:0x04de  */
    /* JADX WARN: Code duplicated, block: B:125:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:126:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:130:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:132:0x0521  */
    /* JADX WARN: Code duplicated, block: B:141:0x0565  */
    /* JADX WARN: Code duplicated, block: B:143:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:144:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:147:0x0649  */
    /* JADX WARN: Code duplicated, block: B:151:0x065c  */
    /* JADX WARN: Code duplicated, block: B:153:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:154:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:157:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:161:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:86:0x0360  */
    /* JADX WARN: Code duplicated, block: B:88:0x036c  */
    /* JADX WARN: Code duplicated, block: B:91:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:93:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:94:0x03c1  */
    /* JADX INFO: renamed from: f */
    public static final void m23811f(final f5a f5aVar, boolean z, vi3 vi3Var, ye1 ye1Var, int i) {
        x18 x18VarM22143u;
        m4a m4aVar;
        float f;
        int i2;
        zi3 zi3Var;
        zi3 zi3Var2;
        p84 p84Var;
        ui3 ui3Var;
        b16 b16Var;
        p84 p84Var2;
        p84 p84Var3;
        zi3 zi3Var3;
        zi3 zi3Var4;
        f5a f5aVar2;
        tj3 tj3Var;
        String str;
        vi3 vi3Var2;
        int i3;
        p84 p84Var4;
        b16 b16Var2;
        tj3 tj3Var2;
        int i4;
        w65 w65Var;
        zi3 zi3Var5;
        zi3 zi3Var6;
        boolean z2;
        boolean z3;
        vi3 vi3Var3;
        zi3 zi3Var7;
        Object objM22097O;
        t66 t66Var;
        int i5;
        boolean z4;
        Object objM22097O2;
        t66 t66Var2;
        tj3 tj3Var3;
        Object objM22097O3;
        boolean z5;
        Object objM22097O4;
        b16 b16Var3;
        int i6;
        int i7;
        boolean z6;
        boolean z7;
        Object objM22097O5;
        boolean z8;
        int i8;
        boolean z9;
        Object objM22097O6;
        char c;
        vi3 vi3Var4 = vi3Var;
        f5aVar.getClass();
        List list = f5aVar.f38484p;
        w65 w65Var2 = f5aVar.f38474f;
        vi3Var4.getClass();
        tj3 tj3Var4 = (tj3) ye1Var;
        tj3Var4.m22115d0(-1597087647);
        int i9 = i | (tj3Var4.m22124i(f5aVar) ? 4 : 2) | (tj3Var4.m22122h(z) ? 32 : 16) | (tj3Var4.m22124i(vi3Var4) ? 256 : 128);
        if (tj3Var4.m22099R(i9 & 1, (i9 & 147) != 146)) {
            final t31 t31Var = (t31) tj3Var4.m22128k(AbstractC0402n.f4814f);
            Object objM22097O7 = tj3Var4.m22097O();
            p84 p84Var5 = we1.f66679a;
            if (objM22097O7 == p84Var5) {
                objM22097O7 = d32.m10013K(tj3Var4);
                tj3Var4.m22131l0(objM22097O7);
            }
            final un1 un1Var = (un1) objM22097O7;
            final Context context = (Context) tj3Var4.m22128k(AbstractC0394f.f4761b);
            b16 b16Var4 = b16.f7762a;
            if (w65Var2 == null && f5aVar.f38472d) {
                tj3Var4.m22111b0(809943463);
                dn7.m10495d(c99.m4412e(b16Var4, 1.0f), 0L, 0L, 0, 0.0f, tj3Var4, 6);
                tj3Var4.m22139q(false);
                x18VarM22143u = tj3Var4.m22143u();
                if (x18VarM22143u == null) {
                    return;
                } else {
                    m4aVar = new m4a(f5aVar, z, vi3Var4, i, 1);
                }
            } else {
                tj3Var4.m22111b0(810029953);
                tj3Var4.m22139q(false);
                if (w65Var2 == null) {
                    x18VarM22143u = tj3Var4.m22143u();
                    if (x18VarM22143u == null) {
                        return;
                    } else {
                        m4aVar = new m4a(f5aVar, z, vi3Var, i, 3);
                    }
                } else {
                    Object objM22097O8 = tj3Var4.m22097O();
                    if (objM22097O8 == p84Var5) {
                        objM22097O8 = AbstractC0278f.m1260j(Boolean.FALSE);
                        tj3Var4.m22131l0(objM22097O8);
                    }
                    t66 t66Var3 = (t66) objM22097O8;
                    e16 e16VarM21609V = AbstractC3584sr.m21609V(b16Var4, ge9.m12515a(tj3Var4).f38965n, 0.0f, 2);
                    C3587su c3587su = eh0.f37238d;
                    ec0 ec0Var = nj0.f52791J;
                    bb1 bb1VarM230a = ab1.m230a(c3587su, ec0Var, tj3Var4, 0);
                    int iHashCode = Long.hashCode(tj3Var4.f62385T);
                    l77 l77VarM22132m = tj3Var4.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var4, e16VarM21609V);
                    se1.f60731q.getClass();
                    ui3 ui3Var2 = C0352b.f4299b;
                    tj3Var4.m22119f0();
                    if (tj3Var4.f62384S) {
                        tj3Var4.m22130l(ui3Var2);
                    } else {
                        tj3Var4.m22137o0();
                    }
                    zi3 zi3Var8 = C0352b.f4303f;
                    oha.m18001g(tj3Var4, zi3Var8, bb1VarM230a);
                    zi3 zi3Var9 = C0352b.f4302e;
                    oha.m18001g(tj3Var4, zi3Var9, l77VarM22132m);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    zi3 zi3Var10 = C0352b.f4304g;
                    oha.m18001g(tj3Var4, zi3Var10, numValueOf);
                    vi3 vi3Var5 = C0352b.f4305h;
                    oha.m18000f(tj3Var4, vi3Var5);
                    zi3 zi3Var11 = C0352b.f4301d;
                    oha.m18001g(tj3Var4, zi3Var11, e16VarM1322c);
                    e16 e16VarM4412e = c99.m4412e(b16Var4, 1.0f);
                    if (z) {
                        tj3Var4.m22111b0(-842180820);
                        f = ge9.m12515a(tj3Var4).f38956e;
                        tj3Var4.m22139q(false);
                    } else {
                        tj3Var4.m22111b0(-842100468);
                        f = ge9.m12515a(tj3Var4).f38955d;
                        tj3Var4.m22139q(false);
                    }
                    e16 e16VarM21611X = AbstractC3584sr.m21611X(e16VarM4412e, 0.0f, f, 0.0f, 0.0f, 13);
                    fc0 fc0Var = nj0.f52817l;
                    C3549ru c3549ru = eh0.f37236b;
                    sj8 sj8VarM20003a = qj8.m20003a(c3549ru, fc0Var, tj3Var4, 48);
                    int iHashCode2 = Long.hashCode(tj3Var4.f62385T);
                    l77 l77VarM22132m2 = tj3Var4.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var4, e16VarM21611X);
                    tj3Var4.m22119f0();
                    if (tj3Var4.f62384S) {
                        tj3Var4.m22130l(ui3Var2);
                    } else {
                        tj3Var4.m22137o0();
                    }
                    oha.m18001g(tj3Var4, zi3Var8, sj8VarM20003a);
                    oha.m18001g(tj3Var4, zi3Var9, l77VarM22132m2);
                    AbstractC3393o1.m17747v(iHashCode2, tj3Var4, zi3Var10, tj3Var4, vi3Var5);
                    as4 as4VarM10871c = e65.m10871c(tj3Var4, e16VarM1322c2, zi3Var11, 1.0f, true);
                    fc0 fc0Var2 = nj0.f52789H;
                    sj8 sj8VarM20003a2 = qj8.m20003a(c3549ru, fc0Var2, tj3Var4, 48);
                    int iHashCode3 = Long.hashCode(tj3Var4.f62385T);
                    l77 l77VarM22132m3 = tj3Var4.m22132m();
                    e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var4, as4VarM10871c);
                    tj3Var4.m22119f0();
                    if (tj3Var4.f62384S) {
                        tj3Var4.m22130l(ui3Var2);
                    } else {
                        tj3Var4.m22137o0();
                    }
                    oha.m18001g(tj3Var4, zi3Var8, sj8VarM20003a2);
                    oha.m18001g(tj3Var4, zi3Var9, l77VarM22132m3);
                    AbstractC3393o1.m17747v(iHashCode3, tj3Var4, zi3Var10, tj3Var4, vi3Var5);
                    oha.m18001g(tj3Var4, zi3Var11, e16VarM1322c3);
                    if (f5aVar.f38478j) {
                        tj3Var4.m22111b0(1242186302);
                        boolean zM22124i = ((i9 & 896) == 256) | tj3Var4.m22124i(f5aVar);
                        Object objM22097O9 = tj3Var4.m22097O();
                        if (zM22124i || objM22097O9 == p84Var5) {
                            objM22097O9 = new h4a(vi3Var, f5aVar);
                            tj3Var4.m22131l0(objM22097O9);
                        }
                        ui3Var = ui3Var2;
                        b16Var = b16Var4;
                        i2 = i9;
                        zi3Var = zi3Var8;
                        zi3Var2 = zi3Var9;
                        p84Var = p84Var5;
                        omd.m18141c((ui3) objM22097O9, AbstractC3584sr.m21611X(c99.m4422o(b16Var4, 32.0f), 0.0f, 0.0f, ge9.m12515a(tj3Var4).f38952a, 0.0f, 11), false, null, null, gqc.f41203a, tj3Var4, 1572864, 60);
                        tj3Var4.m22139q(false);
                    } else {
                        i2 = i9;
                        zi3Var = zi3Var8;
                        zi3Var2 = zi3Var9;
                        p84Var = p84Var5;
                        ui3Var = ui3Var2;
                        b16Var = b16Var4;
                        tj3Var4.m22111b0(1243017567);
                        tj3Var4.m22139q(false);
                    }
                    bb1 bb1VarM230a2 = ab1.m230a(eh0.f37240f, ec0Var, tj3Var4, 6);
                    int iHashCode4 = Long.hashCode(tj3Var4.f62385T);
                    l77 l77VarM22132m4 = tj3Var4.m22132m();
                    e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var4, b16Var);
                    tj3Var4.m22119f0();
                    if (tj3Var4.f62384S) {
                        tj3Var4.m22130l(ui3Var);
                    } else {
                        tj3Var4.m22137o0();
                    }
                    oha.m18001g(tj3Var4, zi3Var, bb1VarM230a2);
                    oha.m18001g(tj3Var4, zi3Var2, l77VarM22132m4);
                    AbstractC3393o1.m17747v(iHashCode4, tj3Var4, zi3Var10, tj3Var4, vi3Var5);
                    oha.m18001g(tj3Var4, zi3Var11, e16VarM1322c4);
                    String strMo8035b = w65Var2.mo8035b();
                    String str2 = f5aVar.f38476h;
                    List listMo8039f = w65Var2.mo8039f();
                    if (listMo8039f.isEmpty()) {
                        listMo8039f = w65Var2.mo8036c();
                    }
                    String strM17122h = AbstractC3352my.m17122h(strMo8035b, str2, listMo8039f);
                    vx9 vx9Var = p58.m18902j(tj3Var4).f71406j;
                    boolean zM22124i2 = tj3Var4.m22124i(un1Var) | tj3Var4.m22124i(t31Var) | tj3Var4.m22124i(f5aVar) | tj3Var4.m22124i(context);
                    Object objM22097O10 = tj3Var4.m22097O();
                    if (zM22124i2) {
                        p84Var2 = p84Var;
                    } else {
                        p84Var2 = p84Var;
                        if (objM22097O10 == p84Var2) {
                        }
                        p84Var3 = p84Var2;
                        zi3Var3 = zi3Var2;
                        zi3Var4 = zi3Var;
                        f5aVar2 = f5aVar;
                        lw9.m16554b(strM17122h, AbstractC0080f.m815b(null, false, (ui3) objM22097O10, b16Var, 15), 0L, null, 0L, null, null, 0L, null, null, 0L, 2, false, 3, 0, null, vx9Var, tj3Var4, 0, 24960, 110588);
                        tj3Var = tj3Var4;
                        thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38955d));
                        str = f5aVar2.f38477i;
                        if (str == null) {
                            tj3Var.m22111b0(1589513683);
                            tj3Var.m22139q(false);
                        } else {
                            tj3Var.m22111b0(1589513684);
                            lw9.m16554b(str, null, p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71407k, tj3Var, 0, 0, 131066);
                            tj3Var = tj3Var;
                            tj3Var.m22139q(false);
                        }
                        tj3Var.m22139q(true);
                        tj3Var.m22139q(true);
                        if (z) {
                            tj3Var.m22111b0(57068111);
                            i8 = i2;
                            if ((i8 & 896) == 256) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            objM22097O6 = tj3Var.m22097O();
                            if (!z9 || objM22097O6 == p84Var3) {
                                c = 2;
                                objM22097O6 = new x4a(vi3Var, 2);
                                tj3Var.m22131l0(objM22097O6);
                            } else {
                                c = 2;
                            }
                            vi3Var2 = vi3Var;
                            omd.m18141c((ui3) objM22097O6, c99.m4422o(b16Var, 32.0f), false, null, null, gqc.f41204b, tj3Var, 1572912, 60);
                            z3 = false;
                            tj3Var.m22139q(false);
                            p84Var4 = p84Var3;
                            b16Var2 = b16Var;
                            tj3Var2 = tj3Var;
                            i4 = i8;
                            w65Var = w65Var2;
                            zi3Var5 = zi3Var10;
                            zi3Var6 = zi3Var11;
                            z2 = true;
                            vi3Var3 = vi3Var5;
                            zi3Var7 = zi3Var3;
                        } else {
                            vi3Var2 = vi3Var;
                            i3 = i2;
                            if (f5aVar2.f38444B) {
                                p84Var4 = p84Var3;
                                b16Var2 = b16Var;
                                tj3Var2 = tj3Var;
                                i4 = i3;
                                w65Var = w65Var2;
                                zi3Var5 = zi3Var10;
                                zi3Var6 = zi3Var11;
                                z2 = true;
                                z3 = false;
                                vi3Var3 = vi3Var5;
                                zi3Var7 = zi3Var3;
                                tj3Var2.m22111b0(58532923);
                                tj3Var2.m22139q(false);
                            } else {
                                tj3Var.m22111b0(57551742);
                                b16 b16Var5 = b16Var;
                                e16 e16VarM21611X2 = AbstractC3584sr.m21611X(b16Var5, ge9.m12515a(tj3Var).f38955d, 0.0f, 0.0f, 0.0f, 14);
                                b16Var2 = b16Var5;
                                ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                                int iHashCode5 = Long.hashCode(tj3Var.f62385T);
                                l77 l77VarM22132m5 = tj3Var.m22132m();
                                e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var, e16VarM21611X2);
                                tj3Var.m22119f0();
                                if (tj3Var.f62384S) {
                                    tj3Var.m22130l(ui3Var);
                                } else {
                                    tj3Var.m22137o0();
                                }
                                oha.m18001g(tj3Var, zi3Var4, ht5VarM19966d);
                                oha.m18001g(tj3Var, zi3Var3, l77VarM22132m5);
                                AbstractC3393o1.m17747v(iHashCode5, tj3Var, zi3Var10, tj3Var, vi3Var5);
                                zi3Var6 = zi3Var11;
                                oha.m18001g(tj3Var, zi3Var6, e16VarM1322c5);
                                vs3 vs3Var = f5aVar2.f38463U;
                                objM22097O = tj3Var.m22097O();
                                if (objM22097O == p84Var3) {
                                    t66Var = t66Var3;
                                    objM22097O = new un7(25, t66Var);
                                    tj3Var.m22131l0(objM22097O);
                                } else {
                                    t66Var = r17;
                                }
                                ui3 ui3Var3 = (ui3) objM22097O;
                                i5 = i3 & 896;
                                if (i5 == 256) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                objM22097O2 = tj3Var.m22097O();
                                if (z4 || objM22097O2 == p84Var3) {
                                    objM22097O2 = new v4a(vi3Var2, 3);
                                    tj3Var.m22131l0(objM22097O2);
                                }
                                t66Var2 = t66Var;
                                f5aVar2 = f5aVar;
                                tj3Var3 = tj3Var;
                                i4 = i3;
                                w65Var = w65Var2;
                                m4d.m16629b(vs3Var, w65Var, ui3Var3, (vi3) objM22097O2, tj3Var3, 384);
                                vs3 vs3Var2 = f5aVar2.f38463U;
                                boolean zBooleanValue = ((Boolean) t66Var2.getValue()).booleanValue();
                                objM22097O3 = tj3Var3.m22097O();
                                if (objM22097O3 == p84Var3) {
                                    objM22097O3 = new dt6(25, t66Var2);
                                    tj3Var3.m22131l0(objM22097O3);
                                }
                                vi3 vi3Var6 = (vi3) objM22097O3;
                                if (i5 == 256) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                objM22097O4 = tj3Var3.m22097O();
                                if (z5 || objM22097O4 == p84Var3) {
                                    objM22097O4 = new ix0(vi3Var2, t66Var2, 22);
                                    tj3Var3.m22131l0(objM22097O4);
                                }
                                zi3Var5 = zi3Var10;
                                vi3Var3 = vi3Var5;
                                p84Var4 = p84Var3;
                                zi3Var4 = zi3Var4;
                                zi3Var7 = zi3Var3;
                                o4d.m17800a(vs3Var2, zBooleanValue, vi3Var6, (vi3) objM22097O4, tj3Var3, 384);
                                tj3Var2 = tj3Var3;
                                z2 = true;
                                tj3Var2.m22139q(true);
                                z3 = false;
                                tj3Var2.m22139q(false);
                            }
                        }
                        tj3Var2.m22139q(z2);
                        if (w65Var.mo8038e() <= 0 || !list.isEmpty() || (w65Var instanceof LessonCard)) {
                            tj3Var2.m22111b0(-837408308);
                            e16 e16VarM21609V2 = AbstractC3584sr.m21609V(c99.m4412e(b16Var2, 1.0f), 0.0f, ge9.m12515a(tj3Var2).f38955d, 1);
                            sj8 sj8VarM20003a3 = qj8.m20003a(c3549ru, fc0Var2, tj3Var2, 48);
                            int iHashCode6 = Long.hashCode(tj3Var2.f62385T);
                            l77 l77VarM22132m6 = tj3Var2.m22132m();
                            e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var2, e16VarM21609V2);
                            tj3Var2.m22119f0();
                            if (tj3Var2.f62384S) {
                                tj3Var2.m22130l(ui3Var);
                            } else {
                                tj3Var2.m22137o0();
                            }
                            oha.m18001g(tj3Var2, zi3Var4, sj8VarM20003a3);
                            oha.m18001g(tj3Var2, zi3Var7, l77VarM22132m6);
                            AbstractC3393o1.m17747v(iHashCode6, tj3Var2, zi3Var5, tj3Var2, vi3Var3);
                            oha.m18001g(tj3Var2, zi3Var6, e16VarM1322c6);
                            y27 y27VarM18236U = AbstractC3423or.m18236U(R$drawable.ic_coin_s, tj3Var2, 0);
                            e16 e16VarM4422o = c99.m4422o(b16Var2, 16.0f);
                            b16Var3 = b16Var2;
                            tj3 tj3Var5 = tj3Var2;
                            i6 = i4;
                            bq1.m4042R(y27VarM18236U, "Coins", e16VarM4422o, null, null, 0.0f, null, tj3Var5, 440, 120);
                            lw9.m16554b(String.valueOf(w65Var.mo8038e() + 1), AbstractC3584sr.m21611X(b16Var3, ge9.m12515a(tj3Var5).f38955d, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var5).f71410n, tj3Var5, 0, 0, 131068);
                            tj3Var4 = tj3Var5;
                            if (list.isEmpty() || (w65Var instanceof LessonCard)) {
                                tj3Var4.m22111b0(-1789190282);
                                thb.m22044c(tj3Var4, c99.m4426s(b16Var3, ge9.m12515a(tj3Var4).f38952a));
                                pb1.m19037g(0.0f, 6, 6, 0L, tj3Var4, c99.m4426s(c99.m4414g(b16Var3, 16.0f), 1.0f));
                                thb.m22044c(tj3Var4, c99.m4426s(b16Var3, ge9.m12515a(tj3Var4).f38952a));
                                e16 e16VarM4416i = c99.m4416i(b16Var3, 22.0f, 0.0f, 2);
                                i7 = 1;
                                C3661uu c3661uu = new C3661uu(ge9.m12515a(tj3Var4).f38955d, true, new gm5(28));
                                boolean zM22124i3 = tj3Var4.m22124i(f5aVar2);
                                if ((i6 & 896) == 256) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                z7 = z6 | zM22124i3;
                                objM22097O5 = tj3Var4.m22097O();
                                if (!z7 || objM22097O5 == p84Var4) {
                                    vi3Var4 = vi3Var;
                                    objM22097O5 = new hf2(f5aVar2, vi3Var4, i7);
                                    tj3Var4.m22131l0(objM22097O5);
                                } else {
                                    vi3Var4 = vi3Var;
                                }
                                z8 = true;
                                fa4.m11643d(e16VarM4416i, null, null, c3661uu, fc0Var2, null, false, null, (vi3) objM22097O5, tj3Var4, 196614, 462);
                                tj3Var4 = tj3Var4;
                                tj3Var4.m22139q(false);
                            } else {
                                tj3Var4.m22111b0(-1787037642);
                                tj3Var4.m22139q(false);
                                vi3Var4 = vi3Var;
                                z8 = true;
                            }
                            tj3Var4.m22139q(z8);
                            tj3Var4.m22139q(false);
                        } else {
                            tj3Var2.m22111b0(-834507049);
                            tj3Var2.m22139q(z3);
                            tj3Var4 = tj3Var2;
                            vi3Var4 = vi3Var2;
                            z8 = true;
                        }
                        tj3Var4.m22139q(z8);
                    }
                    objM22097O10 = new ui3() { // from class: com.lingq.core.token.d
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            wfb.m23926u(un1Var, null, null, new TokenPopupTopSectionKt$TokenPopupTopSection$3$1$1$2$2$1$1(t31Var, f5aVar, null), 3);
                            int i10 = com.lingq.core.p012ui.R$string.share_copied_clipboard;
                            Context context2 = context;
                            Toast.makeText(context2, context2.getString(i10), 0).show();
                            return xfa.f68157a;
                        }
                    };
                    tj3Var4.m22131l0(objM22097O10);
                    p84Var3 = p84Var2;
                    zi3Var3 = zi3Var2;
                    zi3Var4 = zi3Var;
                    f5aVar2 = f5aVar;
                    lw9.m16554b(strM17122h, AbstractC0080f.m815b(null, false, (ui3) objM22097O10, b16Var, 15), 0L, null, 0L, null, null, 0L, null, null, 0L, 2, false, 3, 0, null, vx9Var, tj3Var4, 0, 24960, 110588);
                    tj3Var = tj3Var4;
                    thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38955d));
                    str = f5aVar2.f38477i;
                    if (str == null) {
                        tj3Var.m22111b0(1589513683);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(1589513684);
                        lw9.m16554b(str, null, p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71407k, tj3Var, 0, 0, 131066);
                        tj3Var = tj3Var;
                        tj3Var.m22139q(false);
                    }
                    tj3Var.m22139q(true);
                    tj3Var.m22139q(true);
                    if (z) {
                        tj3Var.m22111b0(57068111);
                        i8 = i2;
                        if ((i8 & 896) == 256) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        objM22097O6 = tj3Var.m22097O();
                        if (z9) {
                            c = 2;
                            objM22097O6 = new x4a(vi3Var, 2);
                            tj3Var.m22131l0(objM22097O6);
                        } else {
                            c = 2;
                            objM22097O6 = new x4a(vi3Var, 2);
                            tj3Var.m22131l0(objM22097O6);
                        }
                        vi3Var2 = vi3Var;
                        omd.m18141c((ui3) objM22097O6, c99.m4422o(b16Var, 32.0f), false, null, null, gqc.f41204b, tj3Var, 1572912, 60);
                        z3 = false;
                        tj3Var.m22139q(false);
                        p84Var4 = p84Var3;
                        b16Var2 = b16Var;
                        tj3Var2 = tj3Var;
                        i4 = i8;
                        w65Var = w65Var2;
                        zi3Var5 = zi3Var10;
                        zi3Var6 = zi3Var11;
                        z2 = true;
                        vi3Var3 = vi3Var5;
                        zi3Var7 = zi3Var3;
                    } else {
                        vi3Var2 = vi3Var;
                        i3 = i2;
                        if (f5aVar2.f38444B) {
                            tj3Var.m22111b0(57551742);
                            b16 b16Var6 = b16Var;
                            e16 e16VarM21611X3 = AbstractC3584sr.m21611X(b16Var6, ge9.m12515a(tj3Var).f38955d, 0.0f, 0.0f, 0.0f, 14);
                            b16Var2 = b16Var6;
                            ht5 ht5VarM19966d2 = qh0.m19966d(nj0.f52808c, false);
                            int iHashCode7 = Long.hashCode(tj3Var.f62385T);
                            l77 l77VarM22132m7 = tj3Var.m22132m();
                            e16 e16VarM1322c7 = AbstractC0287b.m1322c(tj3Var, e16VarM21611X3);
                            tj3Var.m22119f0();
                            if (tj3Var.f62384S) {
                                tj3Var.m22130l(ui3Var);
                            } else {
                                tj3Var.m22137o0();
                            }
                            oha.m18001g(tj3Var, zi3Var4, ht5VarM19966d2);
                            oha.m18001g(tj3Var, zi3Var3, l77VarM22132m7);
                            AbstractC3393o1.m17747v(iHashCode7, tj3Var, zi3Var10, tj3Var, vi3Var5);
                            zi3Var6 = zi3Var11;
                            oha.m18001g(tj3Var, zi3Var6, e16VarM1322c7);
                            vs3 vs3Var3 = f5aVar2.f38463U;
                            objM22097O = tj3Var.m22097O();
                            if (objM22097O == p84Var3) {
                                t66Var = t66Var3;
                                objM22097O = new un7(25, t66Var);
                                tj3Var.m22131l0(objM22097O);
                            } else {
                                t66Var = r17;
                            }
                            ui3 ui3Var4 = (ui3) objM22097O;
                            i5 = i3 & 896;
                            if (i5 == 256) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            objM22097O2 = tj3Var.m22097O();
                            if (z4) {
                                objM22097O2 = new v4a(vi3Var2, 3);
                                tj3Var.m22131l0(objM22097O2);
                            } else {
                                objM22097O2 = new v4a(vi3Var2, 3);
                                tj3Var.m22131l0(objM22097O2);
                            }
                            t66Var2 = t66Var;
                            f5aVar2 = f5aVar;
                            tj3Var3 = tj3Var;
                            i4 = i3;
                            w65Var = w65Var2;
                            m4d.m16629b(vs3Var3, w65Var, ui3Var4, (vi3) objM22097O2, tj3Var3, 384);
                            vs3 vs3Var4 = f5aVar2.f38463U;
                            boolean zBooleanValue2 = ((Boolean) t66Var2.getValue()).booleanValue();
                            objM22097O3 = tj3Var3.m22097O();
                            if (objM22097O3 == p84Var3) {
                                objM22097O3 = new dt6(25, t66Var2);
                                tj3Var3.m22131l0(objM22097O3);
                            }
                            vi3 vi3Var7 = (vi3) objM22097O3;
                            if (i5 == 256) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            objM22097O4 = tj3Var3.m22097O();
                            if (z5) {
                                objM22097O4 = new ix0(vi3Var2, t66Var2, 22);
                                tj3Var3.m22131l0(objM22097O4);
                            } else {
                                objM22097O4 = new ix0(vi3Var2, t66Var2, 22);
                                tj3Var3.m22131l0(objM22097O4);
                            }
                            zi3Var5 = zi3Var10;
                            vi3Var3 = vi3Var5;
                            p84Var4 = p84Var3;
                            zi3Var4 = zi3Var4;
                            zi3Var7 = zi3Var3;
                            o4d.m17800a(vs3Var4, zBooleanValue2, vi3Var7, (vi3) objM22097O4, tj3Var3, 384);
                            tj3Var2 = tj3Var3;
                            z2 = true;
                            tj3Var2.m22139q(true);
                            z3 = false;
                            tj3Var2.m22139q(false);
                        } else {
                            p84Var4 = p84Var3;
                            b16Var2 = b16Var;
                            tj3Var2 = tj3Var;
                            i4 = i3;
                            w65Var = w65Var2;
                            zi3Var5 = zi3Var10;
                            zi3Var6 = zi3Var11;
                            z2 = true;
                            z3 = false;
                            vi3Var3 = vi3Var5;
                            zi3Var7 = zi3Var3;
                            tj3Var2.m22111b0(58532923);
                            tj3Var2.m22139q(false);
                        }
                    }
                    tj3Var2.m22139q(z2);
                    if (w65Var.mo8038e() <= 0) {
                        tj3Var2.m22111b0(-837408308);
                        e16 e16VarM21609V3 = AbstractC3584sr.m21609V(c99.m4412e(b16Var2, 1.0f), 0.0f, ge9.m12515a(tj3Var2).f38955d, 1);
                        sj8 sj8VarM20003a4 = qj8.m20003a(c3549ru, fc0Var2, tj3Var2, 48);
                        int iHashCode8 = Long.hashCode(tj3Var2.f62385T);
                        l77 l77VarM22132m8 = tj3Var2.m22132m();
                        e16 e16VarM1322c8 = AbstractC0287b.m1322c(tj3Var2, e16VarM21609V3);
                        tj3Var2.m22119f0();
                        if (tj3Var2.f62384S) {
                            tj3Var2.m22130l(ui3Var);
                        } else {
                            tj3Var2.m22137o0();
                        }
                        oha.m18001g(tj3Var2, zi3Var4, sj8VarM20003a4);
                        oha.m18001g(tj3Var2, zi3Var7, l77VarM22132m8);
                        AbstractC3393o1.m17747v(iHashCode8, tj3Var2, zi3Var5, tj3Var2, vi3Var3);
                        oha.m18001g(tj3Var2, zi3Var6, e16VarM1322c8);
                        y27 y27VarM18236U2 = AbstractC3423or.m18236U(R$drawable.ic_coin_s, tj3Var2, 0);
                        e16 e16VarM4422o2 = c99.m4422o(b16Var2, 16.0f);
                        b16Var3 = b16Var2;
                        tj3 tj3Var6 = tj3Var2;
                        i6 = i4;
                        bq1.m4042R(y27VarM18236U2, "Coins", e16VarM4422o2, null, null, 0.0f, null, tj3Var6, 440, 120);
                        lw9.m16554b(String.valueOf(w65Var.mo8038e() + 1), AbstractC3584sr.m21611X(b16Var3, ge9.m12515a(tj3Var6).f38955d, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var6).f71410n, tj3Var6, 0, 0, 131068);
                        tj3Var4 = tj3Var6;
                        if (list.isEmpty()) {
                            tj3Var4.m22111b0(-1789190282);
                            thb.m22044c(tj3Var4, c99.m4426s(b16Var3, ge9.m12515a(tj3Var4).f38952a));
                            pb1.m19037g(0.0f, 6, 6, 0L, tj3Var4, c99.m4426s(c99.m4414g(b16Var3, 16.0f), 1.0f));
                            thb.m22044c(tj3Var4, c99.m4426s(b16Var3, ge9.m12515a(tj3Var4).f38952a));
                            e16 e16VarM4416i2 = c99.m4416i(b16Var3, 22.0f, 0.0f, 2);
                            i7 = 1;
                            C3661uu c3661uu2 = new C3661uu(ge9.m12515a(tj3Var4).f38955d, true, new gm5(28));
                            boolean zM22124i4 = tj3Var4.m22124i(f5aVar2);
                            if ((i6 & 896) == 256) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            z7 = z6 | zM22124i4;
                            objM22097O5 = tj3Var4.m22097O();
                            if (z7) {
                                vi3Var4 = vi3Var;
                                objM22097O5 = new hf2(f5aVar2, vi3Var4, i7);
                                tj3Var4.m22131l0(objM22097O5);
                            } else {
                                vi3Var4 = vi3Var;
                                objM22097O5 = new hf2(f5aVar2, vi3Var4, i7);
                                tj3Var4.m22131l0(objM22097O5);
                            }
                            z8 = true;
                            fa4.m11643d(e16VarM4416i2, null, null, c3661uu2, fc0Var2, null, false, null, (vi3) objM22097O5, tj3Var4, 196614, 462);
                            tj3Var4 = tj3Var4;
                            tj3Var4.m22139q(false);
                        } else {
                            tj3Var4.m22111b0(-1789190282);
                            thb.m22044c(tj3Var4, c99.m4426s(b16Var3, ge9.m12515a(tj3Var4).f38952a));
                            pb1.m19037g(0.0f, 6, 6, 0L, tj3Var4, c99.m4426s(c99.m4414g(b16Var3, 16.0f), 1.0f));
                            thb.m22044c(tj3Var4, c99.m4426s(b16Var3, ge9.m12515a(tj3Var4).f38952a));
                            e16 e16VarM4416i3 = c99.m4416i(b16Var3, 22.0f, 0.0f, 2);
                            i7 = 1;
                            C3661uu c3661uu3 = new C3661uu(ge9.m12515a(tj3Var4).f38955d, true, new gm5(28));
                            boolean zM22124i5 = tj3Var4.m22124i(f5aVar2);
                            if ((i6 & 896) == 256) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            z7 = z6 | zM22124i5;
                            objM22097O5 = tj3Var4.m22097O();
                            if (z7) {
                                vi3Var4 = vi3Var;
                                objM22097O5 = new hf2(f5aVar2, vi3Var4, i7);
                                tj3Var4.m22131l0(objM22097O5);
                            } else {
                                vi3Var4 = vi3Var;
                                objM22097O5 = new hf2(f5aVar2, vi3Var4, i7);
                                tj3Var4.m22131l0(objM22097O5);
                            }
                            z8 = true;
                            fa4.m11643d(e16VarM4416i3, null, null, c3661uu3, fc0Var2, null, false, null, (vi3) objM22097O5, tj3Var4, 196614, 462);
                            tj3Var4 = tj3Var4;
                            tj3Var4.m22139q(false);
                        }
                        tj3Var4.m22139q(z8);
                        tj3Var4.m22139q(false);
                    } else {
                        tj3Var2.m22111b0(-837408308);
                        e16 e16VarM21609V4 = AbstractC3584sr.m21609V(c99.m4412e(b16Var2, 1.0f), 0.0f, ge9.m12515a(tj3Var2).f38955d, 1);
                        sj8 sj8VarM20003a5 = qj8.m20003a(c3549ru, fc0Var2, tj3Var2, 48);
                        int iHashCode9 = Long.hashCode(tj3Var2.f62385T);
                        l77 l77VarM22132m9 = tj3Var2.m22132m();
                        e16 e16VarM1322c9 = AbstractC0287b.m1322c(tj3Var2, e16VarM21609V4);
                        tj3Var2.m22119f0();
                        if (tj3Var2.f62384S) {
                            tj3Var2.m22130l(ui3Var);
                        } else {
                            tj3Var2.m22137o0();
                        }
                        oha.m18001g(tj3Var2, zi3Var4, sj8VarM20003a5);
                        oha.m18001g(tj3Var2, zi3Var7, l77VarM22132m9);
                        AbstractC3393o1.m17747v(iHashCode9, tj3Var2, zi3Var5, tj3Var2, vi3Var3);
                        oha.m18001g(tj3Var2, zi3Var6, e16VarM1322c9);
                        y27 y27VarM18236U3 = AbstractC3423or.m18236U(R$drawable.ic_coin_s, tj3Var2, 0);
                        e16 e16VarM4422o3 = c99.m4422o(b16Var2, 16.0f);
                        b16Var3 = b16Var2;
                        tj3 tj3Var7 = tj3Var2;
                        i6 = i4;
                        bq1.m4042R(y27VarM18236U3, "Coins", e16VarM4422o3, null, null, 0.0f, null, tj3Var7, 440, 120);
                        lw9.m16554b(String.valueOf(w65Var.mo8038e() + 1), AbstractC3584sr.m21611X(b16Var3, ge9.m12515a(tj3Var7).f38955d, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var7).f71410n, tj3Var7, 0, 0, 131068);
                        tj3Var4 = tj3Var7;
                        if (list.isEmpty()) {
                            tj3Var4.m22111b0(-1789190282);
                            thb.m22044c(tj3Var4, c99.m4426s(b16Var3, ge9.m12515a(tj3Var4).f38952a));
                            pb1.m19037g(0.0f, 6, 6, 0L, tj3Var4, c99.m4426s(c99.m4414g(b16Var3, 16.0f), 1.0f));
                            thb.m22044c(tj3Var4, c99.m4426s(b16Var3, ge9.m12515a(tj3Var4).f38952a));
                            e16 e16VarM4416i4 = c99.m4416i(b16Var3, 22.0f, 0.0f, 2);
                            i7 = 1;
                            C3661uu c3661uu4 = new C3661uu(ge9.m12515a(tj3Var4).f38955d, true, new gm5(28));
                            boolean zM22124i6 = tj3Var4.m22124i(f5aVar2);
                            if ((i6 & 896) == 256) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            z7 = z6 | zM22124i6;
                            objM22097O5 = tj3Var4.m22097O();
                            if (z7) {
                                vi3Var4 = vi3Var;
                                objM22097O5 = new hf2(f5aVar2, vi3Var4, i7);
                                tj3Var4.m22131l0(objM22097O5);
                            } else {
                                vi3Var4 = vi3Var;
                                objM22097O5 = new hf2(f5aVar2, vi3Var4, i7);
                                tj3Var4.m22131l0(objM22097O5);
                            }
                            z8 = true;
                            fa4.m11643d(e16VarM4416i4, null, null, c3661uu4, fc0Var2, null, false, null, (vi3) objM22097O5, tj3Var4, 196614, 462);
                            tj3Var4 = tj3Var4;
                            tj3Var4.m22139q(false);
                        } else {
                            tj3Var4.m22111b0(-1789190282);
                            thb.m22044c(tj3Var4, c99.m4426s(b16Var3, ge9.m12515a(tj3Var4).f38952a));
                            pb1.m19037g(0.0f, 6, 6, 0L, tj3Var4, c99.m4426s(c99.m4414g(b16Var3, 16.0f), 1.0f));
                            thb.m22044c(tj3Var4, c99.m4426s(b16Var3, ge9.m12515a(tj3Var4).f38952a));
                            e16 e16VarM4416i5 = c99.m4416i(b16Var3, 22.0f, 0.0f, 2);
                            i7 = 1;
                            C3661uu c3661uu5 = new C3661uu(ge9.m12515a(tj3Var4).f38955d, true, new gm5(28));
                            boolean zM22124i7 = tj3Var4.m22124i(f5aVar2);
                            if ((i6 & 896) == 256) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            z7 = z6 | zM22124i7;
                            objM22097O5 = tj3Var4.m22097O();
                            if (z7) {
                                vi3Var4 = vi3Var;
                                objM22097O5 = new hf2(f5aVar2, vi3Var4, i7);
                                tj3Var4.m22131l0(objM22097O5);
                            } else {
                                vi3Var4 = vi3Var;
                                objM22097O5 = new hf2(f5aVar2, vi3Var4, i7);
                                tj3Var4.m22131l0(objM22097O5);
                            }
                            z8 = true;
                            fa4.m11643d(e16VarM4416i5, null, null, c3661uu5, fc0Var2, null, false, null, (vi3) objM22097O5, tj3Var4, 196614, 462);
                            tj3Var4 = tj3Var4;
                            tj3Var4.m22139q(false);
                        }
                        tj3Var4.m22139q(z8);
                        tj3Var4.m22139q(false);
                    }
                    tj3Var4.m22139q(z8);
                }
            }
            x18VarM22143u.f67642d = m4aVar;
        }
        tj3Var4.m22102U();
        x18VarM22143u = tj3Var4.m22143u();
        if (x18VarM22143u != null) {
            m4aVar = new m4a(f5aVar, z, vi3Var4, i, 2);
            x18VarM22143u.f67642d = m4aVar;
        }
    }
}
