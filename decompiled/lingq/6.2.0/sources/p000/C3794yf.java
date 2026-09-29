package p000;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.material3.C0249j;
import androidx.compose.material3.C0251k;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.C0282a;
import androidx.glance.AbstractC0640a;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.feature.library.AbstractC2143d;
import com.lingq.feature.library.C2146e;
import com.lingq.feature.onboarding.OnboardingStartFragment;
import com.lingq.feature.widget.R$string;
import kotlin.jvm.internal.Ref$FloatRef;

/* JADX INFO: renamed from: yf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3794yf implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69757a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f69758b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f69759c;

    public /* synthetic */ C3794yf(int i, Object obj, Object obj2) {
        this.f69757a = i;
        this.f69758b = obj;
        this.f69759c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0037  */
    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f69757a;
        int i2 = 2;
        int i3 = 3;
        int i4 = 1;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f69759c;
        Object obj4 = this.f69758b;
        switch (i) {
            case 0:
                float fFloatValue = ((Float) obj).floatValue();
                ((C0809bg) obj4).m3692a(fFloatValue, ((Float) obj2).floatValue());
                ((Ref$FloatRef) obj3).f47715a = fFloatValue;
                return xfaVar;
            case 1:
                qm9 qm9Var = (qm9) obj;
                bk1 bk1Var = (bk1) obj2;
                return ((ht5) obj4).mo738b(qm9Var, qm9Var.mo20032J(xfaVar, new C0282a(-431986394, true, new C3794yf(i2, (C0282a) obj3, new ei0(qm9Var, bk1Var.f8631a)))), bk1Var.f8631a);
            case 2:
                C0282a c0282a = (C0282a) obj4;
                ei0 ei0Var = (ei0) obj3;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0282a.invoke(ei0Var, tj3Var, 0);
                } else {
                    tj3Var.m22102U();
                }
                return xfaVar;
            case 3:
                t17 t17Var = (t17) obj4;
                aj3 aj3Var = (aj3) obj3;
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e16 e16VarM21606S = AbstractC3584sr.m21606S(c99.m4408a(b16.f7762a, wj0.f66901c, wj0.m24001f()), t17Var);
                    sj8 sj8VarM20003a = qj8.m20003a(eh0.f37240f, nj0.f52789H, tj3Var2, 54);
                    int iHashCode = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m = tj3Var2.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM21606S);
                    se1.f60731q.getClass();
                    ui3 ui3Var = C0352b.f4299b;
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    oha.m18001g(tj3Var2, C0352b.f4303f, sj8VarM20003a);
                    oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var2, C0352b.f4305h);
                    oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
                    aj3Var.invoke(vj8.f65508a, tj3Var2, 6);
                    tj3Var2.m22139q(true);
                } else {
                    tj3Var2.m22102U();
                }
                return xfaVar;
            case 4:
                ((Integer) obj2).getClass();
                ((C0249j) obj4).m1175a((o89) obj3, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 5:
                ((Integer) obj2).getClass();
                ((C0251k) obj4).m1176a((ida) obj3, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 6:
                Context context = (Context) obj4;
                tg9 tg9Var = (tg9) obj3;
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    C0850ck c0850ck = new C0850ck(R$drawable.ic_playlist_icon);
                    String string = context.getString(R$string.lingq_playlist);
                    string.getClass();
                    vh9 vh9Var = yf1.f69766e;
                    pk9.m19367b(c0850ck, string, ((vn2) tj3Var3.m22128k(vh9Var)).f65632a, ((vn2) tj3Var3.m22128k(vh9Var)).f65651t, null, ci8.m4703P(1124166066, new rm0(tg9Var, i3), tj3Var3), tj3Var3, 1572864);
                } else {
                    tj3Var3.m22102U();
                }
                return xfaVar;
            case 7:
                v48 v48Var = (v48) obj4;
                fb9 fb9Var = (fb9) obj3;
                int iIntValue4 = ((Integer) obj).intValue();
                if (obj2 instanceof oe1) {
                    ((x66) v48Var.f64849f).m24305c((oe1) obj2);
                } else if (!(obj2 instanceof p98)) {
                    if (obj2 instanceof xj3) {
                        thb.m22036A(fb9Var, iIntValue4, obj2);
                        v48Var.m23104g((xj3) obj2);
                    } else if (obj2 instanceof x18) {
                        thb.m22036A(fb9Var, iIntValue4, obj2);
                        ((x18) obj2).m24237c();
                    }
                }
                return xfaVar;
            case 8:
                ((Integer) obj2).getClass();
                ci8.m4716b((vn2) obj4, (C0282a) obj3, (ye1) obj, pk9.m19383z(49));
                return xfaVar;
            case 9:
                zp3 zp3Var = (zp3) obj4;
                InterfaceC3624tu interfaceC3624tu = (InterfaceC3624tu) obj3;
                fb2 fb2Var = (fb2) obj;
                bk1 bk1Var2 = (bk1) obj2;
                if (bk1.m3801i(bk1Var2.f8631a) == Integer.MAX_VALUE) {
                    l54.m15814a("LazyVerticalGrid's width should be bound by parent.");
                }
                int iM3801i = bk1.m3801i(bk1Var2.f8631a);
                int[] iArrM22621m1 = u91.m22621m1(zp3Var.mo24096a(fb2Var, iM3801i, fb2Var.mo916w0(interfaceC3624tu.mo9967a())));
                int[] iArr = new int[iArrM22621m1.length];
                interfaceC3624tu.mo9968j(fb2Var, iM3801i, iArrM22621m1, LayoutDirection.Ltr, iArr);
                return new xs4(iArrM22621m1, iArr);
            case 10:
                xt4 xt4Var = (xt4) obj4;
                wt4 wt4Var = (wt4) obj3;
                ye1 ye1Var4 = (ye1) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (tj3Var4.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    yt4 yt4Var = (yt4) xt4Var.f68703b.mo0a();
                    int iMo15748e = wt4Var.f67273c;
                    Object obj5 = wt4Var.f67271a;
                    if ((iMo15748e >= yt4Var.mo15745a() || !yt4Var.mo15747c(iMo15748e).equals(obj5)) && (iMo15748e = yt4Var.mo15748e(obj5)) != -1) {
                        wt4Var.f67273c = iMo15748e;
                    }
                    int i5 = iMo15748e;
                    if (i5 != -1) {
                        tj3Var4.m22111b0(-1664741271);
                        ci8.m4719d(yt4Var, xt4Var.f68702a, i5, wt4Var.f67271a, tj3Var4, 0);
                        tj3Var4.m22139q(false);
                    } else {
                        tj3Var4.m22111b0(-1664505826);
                        tj3Var4.m22139q(false);
                    }
                    boolean zM22124i = tj3Var4.m22124i(wt4Var);
                    Object objM22097O = tj3Var4.m22097O();
                    if (zM22124i || objM22097O == we1.f66679a) {
                        objM22097O = new C0011a9(wt4Var, 25);
                        tj3Var4.m22131l0(objM22097O);
                    }
                    d32.m10041h(obj5, (vi3) objM22097O, tj3Var4);
                } else {
                    tj3Var4.m22102U();
                }
                return xfaVar;
            case 11:
                return ((bu4) obj3).mo1021a(new cu4((xt4) obj4, (qm9) obj), ((bk1) obj2).f8631a);
            case 12:
                C0282a c0282a2 = (C0282a) obj4;
                ov4 ov4Var = (ov4) obj3;
                ye1 ye1Var5 = (ye1) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (tj3Var5.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    c0282a2.invoke(ov4Var, tj3Var5, 0);
                } else {
                    tj3Var5.m22102U();
                }
                return xfaVar;
            case 13:
                ((Integer) obj2).getClass();
                AbstractC2143d.m9058b((C2146e) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 14:
                b85 b85Var = (b85) obj3;
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                LibraryItem libraryItem = ((ja5) obj4).f45341f.f45456b.f55662c;
                if (libraryItem != null) {
                    b85Var.mo3442V(libraryItem, str, str2);
                }
                return xfaVar;
            case 15:
                p04 p04Var = (p04) obj4;
                String str3 = (String) obj3;
                ye1 ye1Var6 = (ye1) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                tj3 tj3Var6 = (tj3) ye1Var6;
                if (tj3Var6.m22099R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ty3.m22351a(p04Var, str3, null, 0L, tj3Var6, 0, 12);
                } else {
                    tj3Var6.m22102U();
                }
                return xfaVar;
            case 16:
                View view = (View) obj4;
                OnboardingStartFragment onboardingStartFragment = (OnboardingStartFragment) obj3;
                ((String) obj).getClass();
                ((Bundle) obj2).getClass();
                if (view != null) {
                    view.post(new mt6(onboardingStartFragment, i4));
                }
                return xfaVar;
            case 17:
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj3;
                float fFloatValue2 = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                ref$FloatRef.f47715a += ((jv4) obj4).f46224b.mo3997a(fFloatValue2 - ref$FloatRef.f47715a);
                return xfaVar;
            case 18:
                C0282a c0282a3 = (C0282a) obj4;
                im8 im8Var = (im8) obj3;
                ye1 ye1Var7 = (ye1) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                tj3 tj3Var7 = (tj3) ye1Var7;
                if (tj3Var7.m22099R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    c0282a3.invoke(im8Var, tj3Var7, 6);
                } else {
                    tj3Var7.m22102U();
                }
                return xfaVar;
            case 19:
                Ref$FloatRef ref$FloatRef2 = (Ref$FloatRef) obj3;
                float fFloatValue3 = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                float f = ref$FloatRef2.f47715a;
                ref$FloatRef2.f47715a = ((wn8) obj4).mo3997a(fFloatValue3 - f) + f;
                return xfaVar;
            case 20:
                ((Integer) obj2).getClass();
                fa4.m11644f((e16) obj4, (C0282a) obj3, (ye1) obj, pk9.m19383z(49));
                return xfaVar;
            case 21:
                aj3 aj3Var2 = (aj3) obj4;
                ru9 ru9Var = (ru9) obj3;
                ye1 ye1Var8 = (ye1) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                tj3 tj3Var8 = (tj3) ye1Var8;
                if (tj3Var8.m22099R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    aj3Var2.invoke(ru9Var, tj3Var8, 6);
                } else {
                    tj3Var8.m22102U();
                }
                return xfaVar;
            case 22:
                pa1 pa1Var = (pa1) obj4;
                C0282a c0282a4 = (C0282a) obj3;
                ye1 ye1Var9 = (ye1) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                tj3 tj3Var9 = (tj3) ye1Var9;
                if (tj3Var9.m22099R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    ps5.m19470a(pa1Var, o36.f53770a, c49.f9485a, bea.f8444a, c0282a4, tj3Var9, 3456);
                } else {
                    tj3Var9.m22102U();
                }
                return xfaVar;
            default:
                v78 v78Var = (v78) obj4;
                C0850ck c0850ck2 = (C0850ck) obj3;
                ye1 ye1Var10 = (ye1) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    tj3 tj3Var10 = (tj3) ye1Var10;
                    if (tj3Var10.m22086D()) {
                        tj3Var10.m22102U();
                    } else {
                        AbstractC0640a.m2210a(c0850ck2, "", ci8.m4706S(mn3.f51554a, 24.0f), 0, new ea1(new j1a(v78Var)), ye1Var10, 32816, 8);
                    }
                } else {
                    AbstractC0640a.m2210a(c0850ck2, "", ci8.m4706S(mn3.f51554a, 24.0f), 0, new ea1(new j1a(v78Var)), ye1Var10, 32816, 8);
                }
                return xfaVar;
        }
    }

    public /* synthetic */ C3794yf(Object obj, int i, int i2, Object obj2) {
        this.f69757a = i2;
        this.f69758b = obj;
        this.f69759c = obj2;
    }

    public /* synthetic */ C3794yf(Ref$FloatRef ref$FloatRef, wn8 wn8Var, int i) {
        this.f69757a = i;
        this.f69759c = ref$FloatRef;
        this.f69758b = wn8Var;
    }
}
