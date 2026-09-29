package p000;

import android.content.Context;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.AbstractC0278f;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.library.LibraryItemCounter;
import com.lingq.core.domain.model.library.LibraryLessonAudioDownload;
import com.lingq.core.domain.model.onboarding.HighlightType;
import com.lingq.core.domain.model.onboarding.TooltipStep;
import com.lingq.core.p012ui.ImageSize;
import com.lingq.core.p012ui.R$string;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d8d {
    /* JADX INFO: renamed from: a */
    public static final void m10161a(final g81 g81Var, final vi3 vi3Var, ye1 ye1Var, int i) {
        tj3 tj3Var;
        final boolean z;
        final boolean z2;
        float fM15944g;
        String str;
        int i2;
        vi3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-255568125);
        int i3 = (tj3Var2.m22124i(g81Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= tj3Var2.m22124i(vi3Var) ? 32 : 16;
        }
        if (tj3Var2.m22099R(i3 & 1, (i3 & 19) != 18)) {
            Object objM22097O = tj3Var2.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var2.m22131l0(objM22097O);
            }
            final t66 t66Var = (t66) objM22097O;
            final LibraryItem libraryItem = g81Var.f40371a;
            final LibraryItemCounter libraryItemCounter = g81Var.f40372b;
            Float f = libraryItemCounter != null ? libraryItemCounter.f19457c : null;
            final boolean z3 = (libraryItemCounter == null || libraryItemCounter.f19460f || libraryItem.f19423X <= 0) ? false : true;
            final boolean z4 = libraryItemCounter != null && libraryItemCounter.f19460f;
            LibraryLessonAudioDownload libraryLessonAudioDownload = g81Var.f40373c;
            final boolean z5 = libraryLessonAudioDownload != null && !libraryLessonAudioDownload.f19476b && 1 <= (i2 = libraryLessonAudioDownload.f19477c) && i2 < 100;
            if (libraryLessonAudioDownload == null || !libraryLessonAudioDownload.f19476b) {
                z = true;
                z2 = false;
            } else {
                z = true;
                z2 = true;
            }
            String str2 = libraryItem.f19424Y;
            if (str2 == null || vk9.m23391n0(str2) || ((str = libraryItem.f19425Z) != null && !vk9.m23391n0(str))) {
                z = false;
            }
            int i4 = i3;
            Float f2 = f;
            final String strM14422e = jfa.m14422e(libraryItem.f19409J, libraryItem.f19436h, ImageSize.Medium);
            if (fa4.m11650l(libraryItem.f19445q, Boolean.TRUE)) {
                fM15944g = 1.0f;
            } else {
                fM15944g = 0.0f;
                if (f2 != null) {
                    fM15944g = l70.m15944g(f2.floatValue() / 100.0f, 0.0f, 1.0f);
                }
            }
            e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
            boolean z6 = (i4 & 112) == 32;
            Object objM22097O2 = tj3Var2.m22097O();
            if (z6 || objM22097O2 == p84Var) {
                objM22097O2 = new C3353mz(vi3Var, 17);
                tj3Var2.m22131l0(objM22097O2);
            }
            final float f3 = fM15944g;
            tj3Var = tj3Var2;
            r46.m20380e(e16VarM4412e, null, null, null, (ui3) objM22097O2, ci8.m4703P(1041613196, new aj3() { // from class: d81
                /* JADX WARN: Code duplicated, block: B:120:0x0665  */
                @Override // p000.aj3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    LibraryItem libraryItem2;
                    String str3;
                    b16 b16Var;
                    fc0 fc0Var;
                    boolean z7;
                    d81 d81Var;
                    boolean z8;
                    LibraryItem libraryItem3;
                    LibraryItemCounter libraryItemCounter2;
                    vi3 vi3Var2;
                    boolean z9;
                    float f4;
                    float f5;
                    boolean z10;
                    d81 d81Var2;
                    p84 p84Var2;
                    vi3 vi3Var3;
                    LibraryItem libraryItem4;
                    boolean z11;
                    boolean zM22120g;
                    Object objM22097O3;
                    String strM23620a0;
                    boolean z12 = g81Var.f40374d;
                    ye1 ye1Var2 = (ye1) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((db1) obj).getClass();
                    tj3 tj3Var3 = (tj3) ye1Var2;
                    if (tj3Var3.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                        float f6 = ge9.m12515a(tj3Var3).f38956e;
                        float f7 = ge9.m12515a(tj3Var3).f38957f;
                        b16 b16Var2 = b16.f7762a;
                        e16 e16VarM21611X = AbstractC3584sr.m21611X(b16Var2, f6, f7, 0.0f, 0.0f, 12);
                        C3587su c3587su = eh0.f37238d;
                        ec0 ec0Var = nj0.f52791J;
                        bb1 bb1VarM230a = ab1.m230a(c3587su, ec0Var, tj3Var3, 0);
                        int iHashCode = Long.hashCode(tj3Var3.f62385T);
                        l77 l77VarM22132m = tj3Var3.m22132m();
                        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, e16VarM21611X);
                        se1.f60731q.getClass();
                        ui3 ui3Var = C0352b.f4299b;
                        tj3Var3.m22119f0();
                        if (tj3Var3.f62384S) {
                            tj3Var3.m22130l(ui3Var);
                        } else {
                            tj3Var3.m22137o0();
                        }
                        zi3 zi3Var = C0352b.f4303f;
                        oha.m18001g(tj3Var3, zi3Var, bb1VarM230a);
                        zi3 zi3Var2 = C0352b.f4302e;
                        oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        zi3 zi3Var3 = C0352b.f4304g;
                        oha.m18001g(tj3Var3, zi3Var3, numValueOf);
                        vi3 vi3Var4 = C0352b.f4305h;
                        oha.m18000f(tj3Var3, vi3Var4);
                        zi3 zi3Var4 = C0352b.f4301d;
                        oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c);
                        C3661uu c3661uu = new C3661uu(ge9.m12515a(tj3Var3).f38952a, true, new gm5(28));
                        fc0 fc0Var2 = nj0.f52817l;
                        sj8 sj8VarM20003a = qj8.m20003a(c3661uu, fc0Var2, tj3Var3, 48);
                        int iHashCode2 = Long.hashCode(tj3Var3.f62385T);
                        l77 l77VarM22132m2 = tj3Var3.m22132m();
                        e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var3, b16Var2);
                        tj3Var3.m22119f0();
                        if (tj3Var3.f62384S) {
                            tj3Var3.m22130l(ui3Var);
                        } else {
                            tj3Var3.m22137o0();
                        }
                        oha.m18001g(tj3Var3, zi3Var, sj8VarM20003a);
                        oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m2);
                        AbstractC3393o1.m17747v(iHashCode2, tj3Var3, zi3Var3, tj3Var3, vi3Var4);
                        oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c2);
                        LibraryItem libraryItem5 = libraryItem;
                        String str4 = libraryItem5.f19433e;
                        String str5 = libraryItem5.f19433e;
                        Integer num = libraryItem5.f19437i;
                        ss5.m21702b(strM14422e, str4, pb1.m19045o(c99.m4422o(b16Var2, 92.0f), p58.m18901i(tj3Var3).f64857c), null, hl1.f42564a, tj3Var3, 1572864, 4024);
                        if (1.0f <= 0.0d) {
                            g54.m12362a("invalid weight; must be greater than zero");
                        }
                        as4 as4Var = new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                        bb1 bb1VarM230a2 = ab1.m230a(c3587su, ec0Var, tj3Var3, 0);
                        int iHashCode3 = Long.hashCode(tj3Var3.f62385T);
                        l77 l77VarM22132m3 = tj3Var3.m22132m();
                        e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var3, as4Var);
                        tj3Var3.m22119f0();
                        if (tj3Var3.f62384S) {
                            tj3Var3.m22130l(ui3Var);
                        } else {
                            tj3Var3.m22137o0();
                        }
                        oha.m18001g(tj3Var3, zi3Var, bb1VarM230a2);
                        oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m3);
                        AbstractC3393o1.m17747v(iHashCode3, tj3Var3, zi3Var3, tj3Var3, vi3Var4);
                        oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c3);
                        lw9.m16554b(str5 == null ? "" : str5, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, p58.m18902j(tj3Var3).f71405i, tj3Var3, 0, 24960, 110590);
                        tj3 tj3Var4 = tj3Var3;
                        if (z12) {
                            tj3Var4.m22111b0(494328579);
                            String str6 = libraryItem5.f19442n;
                            if (str6 == null) {
                                str6 = "";
                            }
                            libraryItem2 = libraryItem5;
                            lw9.m16554b(str6, null, p58.m18900f(tj3Var4).f55875s, null, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, p58.m18902j(tj3Var4).f71408l, tj3Var4, 0, 24960, 110586);
                            tj3Var4 = tj3Var4;
                            tj3Var4.m22139q(false);
                        } else {
                            libraryItem2 = libraryItem5;
                            tj3Var4.m22111b0(494691558);
                            tj3Var4.m22139q(false);
                        }
                        e16 e16VarM21611X2 = AbstractC3584sr.m21611X(b16Var2, 0.0f, ge9.m12515a(tj3Var4).f38955d, 0.0f, 0.0f, 13);
                        C3661uu c3661uu2 = new C3661uu(ge9.m12515a(tj3Var4).f38952a, true, new gm5(28));
                        fc0 fc0Var3 = nj0.f52789H;
                        sj8 sj8VarM20003a2 = qj8.m20003a(c3661uu2, fc0Var3, tj3Var4, 48);
                        int iHashCode4 = Long.hashCode(tj3Var4.f62385T);
                        l77 l77VarM22132m4 = tj3Var4.m22132m();
                        e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var4, e16VarM21611X2);
                        tj3Var4.m22119f0();
                        if (tj3Var4.f62384S) {
                            tj3Var4.m22130l(ui3Var);
                        } else {
                            tj3Var4.m22137o0();
                        }
                        oha.m18001g(tj3Var4, zi3Var, sj8VarM20003a2);
                        oha.m18001g(tj3Var4, zi3Var2, l77VarM22132m4);
                        AbstractC3393o1.m17747v(iHashCode4, tj3Var4, zi3Var3, tj3Var4, vi3Var4);
                        oha.m18001g(tj3Var4, zi3Var4, e16VarM1322c4);
                        boolean z13 = z;
                        if (z13) {
                            tj3Var4.m22111b0(1782420527);
                            sj8 sj8VarM20003a3 = qj8.m20003a(new C3661uu(ge9.m12515a(tj3Var4).f38954c, true, new gm5(28)), fc0Var3, tj3Var4, 48);
                            int iHashCode5 = Long.hashCode(tj3Var4.f62385T);
                            l77 l77VarM22132m5 = tj3Var4.m22132m();
                            e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var4, b16Var2);
                            tj3Var4.m22119f0();
                            str3 = "";
                            if (tj3Var4.f62384S) {
                                tj3Var4.m22130l(ui3Var);
                            } else {
                                tj3Var4.m22137o0();
                            }
                            oha.m18001g(tj3Var4, zi3Var, sj8VarM20003a3);
                            oha.m18001g(tj3Var4, zi3Var2, l77VarM22132m5);
                            AbstractC3393o1.m17747v(iHashCode5, tj3Var4, zi3Var3, tj3Var4, vi3Var4);
                            oha.m18001g(tj3Var4, zi3Var4, e16VarM1322c5);
                            z7 = z13;
                            fc0Var = fc0Var3;
                            b16Var = b16Var2;
                            ty3.m22351a(qad.m19843e(), null, wq1.m24108d(tj3Var4, b16Var2, 16.0f), p58.m18900f(tj3Var4).f55875s, tj3Var4, 48, 0);
                            if ((num != null ? num.intValue() : 0) > 0) {
                                tj3Var4.m22111b0(807335521);
                                tj3Var4.m22139q(false);
                                strM23620a0 = y02.m24809g((num != null ? num.intValue() : 0L) * 1000);
                            } else {
                                tj3Var4.m22111b0(807475672);
                                strM23620a0 = vz1.m23620a0(tj3Var4, R$string.ui_video);
                                tj3Var4.m22139q(false);
                            }
                            tj3 tj3Var5 = tj3Var4;
                            lw9.m16554b(strM23620a0, null, p58.m18900f(tj3Var4).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var4).f71408l, tj3Var5, 0, 0, 131066);
                            tj3Var4 = tj3Var5;
                            tj3Var4.m22139q(true);
                            tj3Var4.m22139q(false);
                        } else {
                            str3 = "";
                            b16Var = b16Var2;
                            fc0Var = fc0Var3;
                            z7 = z13;
                            if ((num != null ? num.intValue() : 0) > 0) {
                                tj3Var4.m22111b0(1783715924);
                                sj8 sj8VarM20003a4 = qj8.m20003a(new C3661uu(ge9.m12515a(tj3Var4).f38954c, true, new gm5(28)), fc0Var, tj3Var4, 48);
                                int iHashCode6 = Long.hashCode(tj3Var4.f62385T);
                                l77 l77VarM22132m6 = tj3Var4.m22132m();
                                e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var4, b16Var);
                                tj3Var4.m22119f0();
                                if (tj3Var4.f62384S) {
                                    tj3Var4.m22130l(ui3Var);
                                } else {
                                    tj3Var4.m22137o0();
                                }
                                oha.m18001g(tj3Var4, zi3Var, sj8VarM20003a4);
                                oha.m18001g(tj3Var4, zi3Var2, l77VarM22132m6);
                                AbstractC3393o1.m17747v(iHashCode6, tj3Var4, zi3Var3, tj3Var4, vi3Var4);
                                oha.m18001g(tj3Var4, zi3Var4, e16VarM1322c6);
                                p04 p04VarM17721b = xed.f68144a;
                                if (p04VarM17721b == null) {
                                    o04 o04Var = new o04("Outlined.Headphones", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                    int i5 = soa.f61116a;
                                    pd9 pd9Var = new pd9(aa1.f403b);
                                    f57 f57VarM17730e = AbstractC3393o1.m17730e(12.0f, 3.0f);
                                    f57VarM17730e.m11548c(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
                                    f57VarM17730e.m11557l(7.0f);
                                    f57VarM17730e.m11548c(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                                    f57VarM17730e.m11550e(4.0f);
                                    f57VarM17730e.m11557l(-8.0f);
                                    f57VarM17730e.m11549d(5.0f);
                                    f57VarM17730e.m11557l(-1.0f);
                                    f57VarM17730e.m11548c(0.0f, -3.87f, 3.13f, -7.0f, 7.0f, -7.0f);
                                    f57VarM17730e.m11555j(7.0f, 3.13f, 7.0f, 7.0f);
                                    f57VarM17730e.m11557l(1.0f);
                                    f57VarM17730e.m11550e(-4.0f);
                                    f57VarM17730e.m11557l(8.0f);
                                    f57VarM17730e.m11550e(4.0f);
                                    f57VarM17730e.m11548c(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                                    f57VarM17730e.m11557l(-7.0f);
                                    f57VarM17730e.m11547b(21.0f, 7.03f, 16.97f, 3.0f, 12.0f, 3.0f);
                                    f57VarM17730e.m11546a();
                                    f57VarM17730e.m11553h(7.0f, 15.0f);
                                    f57VarM17730e.m11557l(4.0f);
                                    f57VarM17730e.m11549d(5.0f);
                                    f57VarM17730e.m11557l(-4.0f);
                                    f57VarM17730e.m11549d(7.0f);
                                    f57VarM17730e.m11546a();
                                    f57VarM17730e.m11553h(19.0f, 19.0f);
                                    f57VarM17730e.m11550e(-2.0f);
                                    f57VarM17730e.m11557l(-4.0f);
                                    f57VarM17730e.m11550e(2.0f);
                                    f57VarM17730e.m11556k(19.0f);
                                    f57VarM17730e.m11546a();
                                    o04.m17720a(o04Var, f57VarM17730e.f38440a, pd9Var);
                                    p04VarM17721b = o04Var.m17721b();
                                    xed.f68144a = p04VarM17721b;
                                }
                                ty3.m22351a(p04VarM17721b, null, wq1.m24108d(tj3Var4, b16Var, 16.0f), p58.m18900f(tj3Var4).f55875s, tj3Var4, 48, 0);
                                tj3 tj3Var6 = tj3Var4;
                                lw9.m16554b(y02.m24809g((num != null ? num.intValue() : 0L) * 1000), null, p58.m18900f(tj3Var4).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var4).f71408l, tj3Var6, 0, 0, 131066);
                                tj3Var4 = tj3Var6;
                                tj3Var4.m22139q(true);
                                tj3Var4.m22139q(false);
                            } else {
                                tj3Var4.m22111b0(1784721130);
                                tj3Var4.m22139q(false);
                            }
                        }
                        if (z3) {
                            tj3Var4.m22111b0(1784790911);
                            tj3 tj3Var7 = tj3Var4;
                            d81Var = this;
                            ho9.m13414a(null, ui8.f63972a, p58.m18900f(tj3Var4).f55856h, 0L, 0.0f, 0.0f, null, ci8.m4703P(-539886517, new C3368nd(libraryItem2, 10), tj3Var4), tj3Var7, 12582912, 121);
                            tj3Var4 = tj3Var7;
                            z8 = false;
                            tj3Var4.m22139q(false);
                        } else {
                            d81Var = this;
                            z8 = false;
                            tj3Var4.m22111b0(1785539530);
                            tj3Var4.m22139q(false);
                        }
                        tj3Var4.m22139q(true);
                        tj3Var4.m22139q(true);
                        ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, z8);
                        int iHashCode7 = Long.hashCode(tj3Var4.f62385T);
                        l77 l77VarM22132m7 = tj3Var4.m22132m();
                        e16 e16VarM1322c7 = AbstractC0287b.m1322c(tj3Var4, b16Var);
                        tj3Var4.m22119f0();
                        if (tj3Var4.f62384S) {
                            tj3Var4.m22130l(ui3Var);
                        } else {
                            tj3Var4.m22137o0();
                        }
                        oha.m18001g(tj3Var4, zi3Var, ht5VarM19966d);
                        oha.m18001g(tj3Var4, zi3Var2, l77VarM22132m7);
                        AbstractC3393o1.m17747v(iHashCode7, tj3Var4, zi3Var3, tj3Var4, vi3Var4);
                        oha.m18001g(tj3Var4, zi3Var4, e16VarM1322c7);
                        Object objM22097O4 = tj3Var4.m22097O();
                        t66 t66Var2 = t66Var;
                        p84 p84Var3 = we1.f66679a;
                        if (objM22097O4 == p84Var3) {
                            objM22097O4 = new C3799yk(8, t66Var2);
                            tj3Var4.m22131l0(objM22097O4);
                        }
                        b16 b16Var3 = b16Var;
                        e16 e16VarM21611X3 = AbstractC3584sr.m21611X(b16Var3, 0.0f, 0.0f, ge9.m12515a(tj3Var4).f38956e, 0.0f, 11);
                        vf0 vf0VarM4714a = ci8.m4714a(1.0f, p58.m18900f(tj3Var4).f55816A);
                        tj3 tj3Var8 = tj3Var4;
                        omd.m18141c((ui3) objM22097O4, c99.m4422o(r46.m20388n(e16VarM21611X3, vf0VarM4714a.f65300a, vf0VarM4714a.f65301b, ui8.f63972a), 24.0f), false, null, null, nob.f53080a, tj3Var8, 1572870, 60);
                        tj3 tj3Var9 = tj3Var8;
                        boolean zBooleanValue = ((Boolean) t66Var2.getValue()).booleanValue();
                        LibraryItemCounter libraryItemCounter3 = libraryItemCounter;
                        vi3 vi3Var5 = vi3Var;
                        if (zBooleanValue) {
                            tj3Var9.m22111b0(1059834763);
                            String str7 = str5 == null ? str3 : str5;
                            Object objM22097O5 = tj3Var9.m22097O();
                            if (objM22097O5 == p84Var3) {
                                objM22097O5 = new C3799yk(9, t66Var2);
                                tj3Var9.m22131l0(objM22097O5);
                            }
                            ui3 ui3Var2 = (ui3) objM22097O5;
                            if (libraryItemCounter3 == null || !libraryItemCounter3.f19456b) {
                                libraryItem4 = libraryItem2;
                                if (!fa4.m11650l(libraryItem4.f19451w, Boolean.TRUE)) {
                                    z11 = false;
                                }
                                d05 d05Var = new d05(z11, libraryItem4.m8090e(), libraryItemCounter3 == null && libraryItemCounter3.f19460f, true, !z12, 480);
                                zM22120g = tj3Var9.m22120g(vi3Var5);
                                objM22097O3 = tj3Var9.m22097O();
                                if (zM22120g || objM22097O3 == p84Var3) {
                                    objM22097O3 = new ix0(vi3Var5, t66Var2, 2);
                                    tj3Var9.m22131l0(objM22097O3);
                                }
                                libraryItem3 = libraryItem4;
                                rid.m20672a(str7, ui3Var2, d05Var, (vi3) objM22097O3, tj3Var9, 48);
                                tj3Var9 = tj3Var9;
                                tj3Var9.m22139q(false);
                            } else {
                                libraryItem4 = libraryItem2;
                            }
                            z11 = true;
                            d05 d05Var2 = new d05(z11, libraryItem4.m8090e(), libraryItemCounter3 == null && libraryItemCounter3.f19460f, true, !z12, 480);
                            zM22120g = tj3Var9.m22120g(vi3Var5);
                            objM22097O3 = tj3Var9.m22097O();
                            if (zM22120g) {
                                objM22097O3 = new ix0(vi3Var5, t66Var2, 2);
                                tj3Var9.m22131l0(objM22097O3);
                            } else {
                                objM22097O3 = new ix0(vi3Var5, t66Var2, 2);
                                tj3Var9.m22131l0(objM22097O3);
                            }
                            libraryItem3 = libraryItem4;
                            rid.m20672a(str7, ui3Var2, d05Var2, (vi3) objM22097O3, tj3Var9, 48);
                            tj3Var9 = tj3Var9;
                            tj3Var9.m22139q(false);
                        } else {
                            libraryItem3 = libraryItem2;
                            tj3Var9.m22111b0(1062428502);
                            tj3Var9.m22139q(false);
                        }
                        tj3Var9.m22139q(true);
                        tj3Var9.m22139q(true);
                        float f8 = f3;
                        if (f8 > 0.0f) {
                            tj3Var9.m22111b0(1639898444);
                            boolean zM22114d = tj3Var9.m22114d(f8);
                            Object objM22097O6 = tj3Var9.m22097O();
                            if (zM22114d || objM22097O6 == p84Var3) {
                                objM22097O6 = new gj9(0, f8);
                                tj3Var9.m22131l0(objM22097O6);
                            }
                            tj3 tj3Var10 = tj3Var9;
                            vi3Var2 = vi3Var5;
                            libraryItemCounter2 = libraryItemCounter3;
                            dn7.m10494c((ui3) objM22097O6, AbstractC3584sr.m21611X(c99.m4412e(b16Var3, 1.0f), 0.0f, ge9.m12515a(tj3Var9).f38955d, ge9.m12515a(tj3Var9).f38956e, 0.0f, 9), 0L, 0L, 0, 0.0f, null, tj3Var10, 0, 124);
                            tj3Var9 = tj3Var10;
                            z9 = false;
                            tj3Var9.m22139q(false);
                        } else {
                            libraryItemCounter2 = libraryItemCounter3;
                            vi3Var2 = vi3Var5;
                            z9 = false;
                            tj3Var9.m22111b0(1640267468);
                            tj3Var9.m22139q(false);
                        }
                        e16 e16VarM4412e2 = c99.m4412e(b16Var3, 1.0f);
                        if (libraryItem3.m8090e()) {
                            tj3Var9.m22111b0(1640445687);
                            f4 = ge9.m12515a(tj3Var9).f38952a;
                            tj3Var9.m22139q(z9);
                        } else {
                            tj3Var9.m22111b0(1640536052);
                            f4 = ge9.m12515a(tj3Var9).f38954c;
                            tj3Var9.m22139q(z9);
                        }
                        float f9 = f4;
                        if (libraryItem3.m8090e()) {
                            tj3Var9.m22111b0(330020571);
                            float f10 = ge9.m12515a(tj3Var9).f38956e;
                            tj3Var9.m22139q(z9);
                            f5 = f10;
                        } else {
                            tj3Var9.m22111b0(330020984);
                            tj3Var9.m22139q(z9);
                            f5 = 0.0f;
                        }
                        e16 e16VarM21611X4 = AbstractC3584sr.m21611X(e16VarM4412e2, 0.0f, f9, 0.0f, f5, 5);
                        fc0 fc0Var4 = fc0Var;
                        sj8 sj8VarM20003a5 = qj8.m20003a(eh0.f37236b, fc0Var4, tj3Var9, 48);
                        int iHashCode8 = Long.hashCode(tj3Var9.f62385T);
                        l77 l77VarM22132m8 = tj3Var9.m22132m();
                        e16 e16VarM1322c8 = AbstractC0287b.m1322c(tj3Var9, e16VarM21611X4);
                        tj3Var9.m22119f0();
                        if (tj3Var9.f62384S) {
                            tj3Var9.m22130l(ui3Var);
                        } else {
                            tj3Var9.m22137o0();
                        }
                        oha.m18001g(tj3Var9, zi3Var, sj8VarM20003a5);
                        oha.m18001g(tj3Var9, zi3Var2, l77VarM22132m8);
                        AbstractC3393o1.m17747v(iHashCode8, tj3Var9, zi3Var3, tj3Var9, vi3Var4);
                        oha.m18001g(tj3Var9, zi3Var4, e16VarM1322c8);
                        vi3 vi3Var6 = vi3Var2;
                        if (1.0f <= 0.0d) {
                            g54.m12362a("invalid weight; must be greater than zero");
                        }
                        as4 as4Var2 = new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                        sj8 sj8VarM20003a6 = qj8.m20003a(new C3661uu(ge9.m12515a(tj3Var9).f38952a, true, new gm5(28)), fc0Var4, tj3Var9, 48);
                        int iHashCode9 = Long.hashCode(tj3Var9.f62385T);
                        l77 l77VarM22132m9 = tj3Var9.m22132m();
                        e16 e16VarM1322c9 = AbstractC0287b.m1322c(tj3Var9, as4Var2);
                        tj3Var9.m22119f0();
                        if (tj3Var9.f62384S) {
                            tj3Var9.m22130l(ui3Var);
                        } else {
                            tj3Var9.m22137o0();
                        }
                        oha.m18001g(tj3Var9, zi3Var, sj8VarM20003a6);
                        oha.m18001g(tj3Var9, zi3Var2, l77VarM22132m9);
                        AbstractC3393o1.m17747v(iHashCode9, tj3Var9, zi3Var3, tj3Var9, vi3Var4);
                        oha.m18001g(tj3Var9, zi3Var4, e16VarM1322c9);
                        d8d.m10162b(libraryItemCounter2 != null ? libraryItemCounter2.f19464j : 0, cx2.m9917a(tj3Var9).m4209b(), tj3Var9, 0);
                        d8d.m10162b(libraryItemCounter2 != null ? libraryItemCounter2.f19466l : 0, cx2.m9917a(tj3Var9).m4212e(), tj3Var9, 0);
                        tj3 tj3Var11 = tj3Var9;
                        lw9.m16554b(ux5.m22989l("· ", (int) libraryItem3.f19416Q, "%"), null, cx2.m9917a(tj3Var9).m4215h(), null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var9).f71408l, tj3Var11, 0, 0, 131066);
                        tj3 tj3Var12 = tj3Var11;
                        tj3Var12.m22139q(true);
                        if (libraryItem3.m8090e()) {
                            z10 = true;
                            tj3Var12.m22111b0(-456470457);
                            tj3Var12.m22139q(false);
                        } else {
                            tj3Var12.m22111b0(-458561593);
                            sj8 sj8VarM20003a7 = qj8.m20003a(eh0.f37237c, fc0Var2, tj3Var12, 6);
                            int iHashCode10 = Long.hashCode(tj3Var12.f62385T);
                            l77 l77VarM22132m10 = tj3Var12.m22132m();
                            e16 e16VarM1322c10 = AbstractC0287b.m1322c(tj3Var12, b16Var3);
                            tj3Var12.m22119f0();
                            if (tj3Var12.f62384S) {
                                tj3Var12.m22130l(ui3Var);
                            } else {
                                tj3Var12.m22137o0();
                            }
                            oha.m18001g(tj3Var12, zi3Var, sj8VarM20003a7);
                            oha.m18001g(tj3Var12, zi3Var2, l77VarM22132m10);
                            AbstractC3393o1.m17747v(iHashCode10, tj3Var12, zi3Var3, tj3Var12, vi3Var4);
                            oha.m18001g(tj3Var12, zi3Var4, e16VarM1322c10);
                            if (z7) {
                                d81Var2 = this;
                                p84Var2 = r0;
                                vi3Var3 = vi3Var6;
                                tj3Var12.m22111b0(-1708598746);
                                tj3Var12.m22139q(false);
                            } else {
                                tj3Var12.m22111b0(-1709799035);
                                vi3Var3 = vi3Var6;
                                boolean zM22120g2 = tj3Var12.m22120g(vi3Var3);
                                Object objM22097O7 = tj3Var12.m22097O();
                                if (zM22120g2) {
                                    p84Var2 = r0;
                                } else {
                                    p84Var2 = p84Var3;
                                    if (objM22097O7 == p84Var2) {
                                    }
                                    d81Var2 = this;
                                    omd.m18141c((ui3) objM22097O7, null, false, null, null, ci8.m4703P(-207301469, new e81(z5, z2), tj3Var12), tj3Var12, 1572864, 62);
                                    tj3Var12 = tj3Var12;
                                    tj3Var12.m22139q(false);
                                }
                                objM22097O7 = new C3353mz(vi3Var3, 18);
                                tj3Var12.m22131l0(objM22097O7);
                                d81Var2 = this;
                                omd.m18141c((ui3) objM22097O7, null, false, null, null, ci8.m4703P(-207301469, new e81(z5, z2), tj3Var12), tj3Var12, 1572864, 62);
                                tj3Var12 = tj3Var12;
                                tj3Var12.m22139q(false);
                            }
                            boolean zM22120g3 = tj3Var12.m22120g(vi3Var3);
                            Object objM22097O8 = tj3Var12.m22097O();
                            if (zM22120g3 || objM22097O8 == p84Var2) {
                                objM22097O8 = new C3353mz(vi3Var3, 16);
                                tj3Var12.m22131l0(objM22097O8);
                            }
                            tj3 tj3Var13 = tj3Var12;
                            omd.m18141c((ui3) objM22097O8, null, false, null, null, ci8.m4703P(-41507362, new c81(0, z4), tj3Var12), tj3Var13, 1572864, 62);
                            tj3Var12 = tj3Var13;
                            z10 = true;
                            tj3Var12.m22139q(true);
                            tj3Var12.m22139q(false);
                        }
                        tj3Var12.m22139q(z10);
                        tj3Var12.m22139q(z10);
                    } else {
                        tj3Var3.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var2), tj3Var, 196614, 14);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3709w4(g81Var, i, 5, vi3Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m10162b(int i, long j, ye1 ye1Var, int i2) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-441645774);
        int i3 = i2 | (tj3Var.m22116e(i) ? 4 : 2) | (tj3Var.m22118f(j) ? 32 : 16);
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            zf1 zf1Var = ge9.f40637a;
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38955d, true, new gm5(28)), nj0.f52789H, tj3Var, 48);
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
            ((fe9) tj3Var.m22128k(zf1Var)).getClass();
            e16 e16VarM4426s = c99.m4426s(b16Var, 20.0f);
            ((fe9) tj3Var.m22128k(zf1Var)).getClass();
            e16 e16VarM4414g = c99.m4414g(e16VarM4426s, 12.0f);
            vh9 vh9Var = ps5.f56764b;
            ho9.m13414a(e16VarM4414g, ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64859e, j, 0L, 0.0f, 0.0f, null, nob.f53081b, tj3Var, ((i3 << 3) & 896) | 12582912, 120);
            lw9.m16554b(String.valueOf(i), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71408l, tj3Var, 0, 0, 131070);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new b81(i, i2, 0, j);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final p6a m10163c(TooltipStep tooltipStep, Context context, int i) {
        tooltipStep.getClass();
        context.getClass();
        switch (w6a.f66459a[tooltipStep.ordinal()]) {
            case 1:
                return new p6a("Start", null, null, 14);
            case 2:
                String string = context.getString(R$string.tooltips_start_with_this_lesson);
                string.getClass();
                return new p6a(string, null, HighlightType.Focus, 6);
            case 3:
                String string2 = context.getString(R$string.tooltips_tap_to_see_meaning);
                string2.getClass();
                return new p6a(string2, null, HighlightType.Nothing, 6);
            case 4:
                String string3 = context.getString(R$string.tooltips_tap_to_make_lingq);
                string3.getClass();
                return new p6a(string3, null, HighlightType.Hand, 6);
            case 5:
                String string4 = context.getString(R$string.tooltips_lingq_created);
                string4.getClass();
                return new p6a(string4, null, HighlightType.Incentive, 6);
            case 6:
                String string5 = context.getString(R$string.tooltips_word_more);
                string5.getClass();
                return new p6a(string5, null, HighlightType.Hand, 6);
            case 7:
                String string6 = context.getString(R$string.tooltips_lingq_created_more);
                string6.getClass();
                return new p6a(string6, null, HighlightType.Hand, 6);
            case 8:
                return new p6a(null, null, HighlightType.Indicator, 3);
            case 9:
                String string7 = context.getString(R$string.tooltips_play_audio_listen);
                string7.getClass();
                return new p6a(string7, null, HighlightType.Indicator, 6);
            case 10:
                String string8 = i < 2 ? context.getString(R$string.tooltips_sentence) : "";
                string8.getClass();
                return new p6a(string8, null, HighlightType.Incentive, 6);
            case 11:
                String string9 = context.getString(R$string.tooltips_sentence_page);
                string9.getClass();
                return new p6a(string9, null, HighlightType.HandSwipe, 6);
            case 12:
                String string10 = context.getString(R$string.tooltips_sentence_listen);
                string10.getClass();
                return new p6a(string10, null, HighlightType.Incentive, 6);
            case 13:
                return new p6a(null, null, HighlightType.Indicator, 3);
            case 14:
                String string11 = context.getString(R$string.tooltips_review_menu);
                string11.getClass();
                return new p6a(string11, null, HighlightType.Incentive, 6);
            case 15:
                String string12 = context.getString(R$string.tooltips_blue_words_turn_white);
                string12.getClass();
                return new p6a(string12, vz1.m23627e(context.getString(R$string.tooltips_blue_words_turn_white_substring_blue_words_turn_white)), null, 12);
            case 16:
                return new p6a(null, null, HighlightType.HandSwipe, 3);
            case 17:
                return new p6a(null, null, HighlightType.Incentive, 3);
            case 18:
                String string13 = context.getString(R$string.tooltips_status_update);
                string13.getClass();
                return new p6a(string13, null, null, 14);
            case 19:
                String string14 = context.getString(R$string.tooltips_known_word);
                string14.getClass();
                return new p6a(string14, null, HighlightType.Incentive, 6);
            case 20:
                return new p6a(null, null, HighlightType.HandSwipeTopDown, 3);
            case 21:
                String string15 = context.getString(R$string.tooltips_popup_expanded);
                string15.getClass();
                return new p6a(string15, null, null, 14);
            case 22:
                String string16 = context.getString(R$string.tooltips_check_dictionary);
                string16.getClass();
                return new p6a(string16, vz1.m23627e(context.getString(R$string.tooltips_check_dictionary_substring_check_a_dictionary)), null, 12);
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                String string17 = context.getString(R$string.tooltips_gray_shading);
                string17.getClass();
                return new p6a(string17, vz1.m23627e(context.getString(R$string.tooltips_gray_shading_substring_tap_again), context.getString(R$string.tooltips_gray_shading_substring_phrases)), null, 12);
            case 24:
                String string18 = context.getString(R$string.tooltips_visit_academy);
                string18.getClass();
                return new p6a(string18, null, null, 14);
            case 25:
                String string19 = context.getString(R$string.lingq_import_lesson);
                string19.getClass();
                return new p6a(string19, null, null, 14);
            case 26:
                String string20 = context.getString(R$string.tooltips_complete);
                string20.getClass();
                return new p6a(string20, null, null, 14);
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                return new p6a("Finished", null, null, 14);
            default:
                gm5.m12750e();
                return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m10164d(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        switch (w6a.f66459a[tooltipStep.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
            case 10:
            case 11:
            case 15:
            case 16:
            case 17:
            case 19:
            case 26:
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                return false;
            case 6:
            case 7:
            case 9:
            case 12:
            case 13:
            case 14:
            case 18:
            case 20:
            case 21:
            case 22:
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
            case 24:
            case 25:
                return true;
            default:
                gm5.m12750e();
                return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m10165e(TooltipStep tooltipStep, int i) {
        tooltipStep.getClass();
        switch (w6a.f66459a[tooltipStep.ordinal()]) {
            case 5:
                return i <= 1;
            case 6:
                return i >= 2;
            case 7:
                return i >= 4;
            case 8:
                return i >= 14;
            case 9:
            case 11:
            case 14:
            case 15:
            case 18:
            case 19:
            case 21:
            default:
                return true;
            case 10:
                return i >= 3;
            case 12:
                return i >= 6;
            case 13:
                return i >= 8;
            case 16:
                return i >= 10;
            case 17:
                return i >= 12;
            case 20:
                return i >= 7;
            case 22:
                return i >= 15;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return i >= 17;
        }
    }
}
