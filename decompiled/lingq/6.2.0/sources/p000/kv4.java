package p000;

import android.os.Bundle;
import androidx.compose.foundation.gestures.C0116v;
import androidx.compose.foundation.lazy.C0127b;
import androidx.compose.foundation.lazy.staggeredgrid.C0144d;
import androidx.compose.foundation.pager.AbstractC0150d;
import androidx.compose.foundation.pager.C0151e;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.semantics.AbstractC0426f;
import androidx.compose.runtime.C0281i;
import androidx.compose.runtime.Recomposer$State;
import androidx.datastore.core.MultiProcessDataStoreFactory;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.analytics.embedded.EmbeddedMessage;
import com.lingq.core.domain.model.offer.OfferBanner;
import com.lingq.core.domain.model.onboarding.TooltipStep;
import com.lingq.feature.library.LibraryUpdateFragment;
import com.lingq.feature.onboarding.OnboardingStartFragment;
import com.lingq.feature.onboarding.R$id;
import com.lingq.feature.onboarding.auth.login.OnboardingLoginFragment;
import com.lingq.feature.onboarding.p014v2.OnboardingPage;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kv4 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48462a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f48463b;

    public /* synthetic */ kv4(C0151e c0151e, wn8 wn8Var) {
        this.f48462a = 16;
        this.f48463b = c0151e;
    }

    /* JADX WARN: Code duplicated, block: B:237:0x0659  */
    /* JADX WARN: Code duplicated, block: B:238:0x066a  */
    /* JADX WARN: Code duplicated, block: B:240:0x066e  */
    @Override // p000.vi3
    public final Object invoke(Object obj) {
        hv4 hv4Var;
        hv4 hv4Var2;
        boolean z;
        dw4 dw4Var;
        C0357g c0357g;
        dw4 dw4Var2;
        Object value;
        ArrayList arrayList;
        ik8 ik8Var;
        sm0 sm0Var;
        float fM15944g = 1.0f;
        sm0 sm0Var2 = null;
        float f = 0.0f;
        switch (this.f48462a) {
            case 0:
                C0127b c0127b = (C0127b) this.f48463b;
                float f2 = -((Float) obj).floatValue();
                if ((f2 >= 0.0f || c0127b.mo975d()) && (f2 <= 0.0f || c0127b.mo974b())) {
                    if (Math.abs(c0127b.f2443h) > 0.5f) {
                        l54.m15816c("entered drag with non-zero pending scroll");
                    }
                    c0127b.f2439d = true;
                    float f3 = c0127b.f2443h + f2;
                    c0127b.f2443h = f3;
                    if (Math.abs(f3) > 0.5f) {
                        float f4 = c0127b.f2443h;
                        int iRound = Math.round(f4);
                        hv4 hv4VarM13485f = ((hv4) ((xc9) c0127b.f2441f).getValue()).m13485f(iRound, !c0127b.f2437b);
                        if (hv4VarM13485f == null || (hv4Var2 = c0127b.f2438c) == null) {
                            hv4Var = hv4VarM13485f;
                        } else {
                            hv4 hv4VarM13485f2 = hv4Var2.m13485f(iRound, true);
                            if (hv4VarM13485f2 != null) {
                                c0127b.f2438c = hv4VarM13485f2;
                                hv4Var = hv4VarM13485f;
                            } else {
                                hv4Var = null;
                            }
                        }
                        if (hv4Var != null) {
                            c0127b.m977g(hv4Var, c0127b.f2437b, true);
                            fa4.m11663y(c0127b.f2458w);
                            c0127b.m981k(f4 - c0127b.f2443h, hv4Var);
                        } else {
                            C0357g c0357g2 = c0127b.f2447l;
                            if (c0357g2 != null) {
                                c0357g2.m1598l();
                            }
                            c0127b.m981k(f4 - c0127b.f2443h, c0127b.m980j());
                        }
                    }
                    if (Math.abs(c0127b.f2443h) > 0.5f) {
                        f2 -= c0127b.f2443h;
                        c0127b.f2443h = 0.0f;
                    }
                    f = f2;
                }
                return Float.valueOf(-f);
            case 1:
                il8 il8Var = (il8) this.f48463b;
                return Boolean.valueOf(il8Var != null ? il8Var.mo10400b(obj) : true);
            case 2:
                e41 e41Var = (e41) this.f48463b;
                ((Integer) obj).getClass();
                return e41Var;
            case 3:
                C0144d c0144d = (C0144d) this.f48463b;
                float f5 = -((Float) obj).floatValue();
                t66 t66Var = c0144d.f2601d;
                if ((f5 >= 0.0f || c0144d.mo975d()) && (f5 <= 0.0f || c0144d.mo974b())) {
                    if (Math.abs(c0144d.f2612o) > 0.5f) {
                        l54.m15816c("entered drag with non-zero pending scroll");
                    }
                    float f6 = c0144d.f2612o + f5;
                    c0144d.f2612o = f6;
                    if (Math.abs(f6) > 0.5f) {
                        float f7 = c0144d.f2612o;
                        int iM21693T = ss5.m21693T(f7);
                        xc9 xc9Var = (xc9) t66Var;
                        dw4 dw4VarM10692f = ((dw4) xc9Var.getValue()).m10692f(iM21693T, !c0144d.f2598a);
                        if (dw4VarM10692f == null || (dw4Var2 = c0144d.f2599b) == null) {
                            z = true;
                        } else {
                            z = true;
                            dw4 dw4VarM10692f2 = dw4Var2.m10692f(iM21693T, true);
                            if (dw4VarM10692f2 != null) {
                                c0144d.f2599b = dw4VarM10692f2;
                            } else {
                                dw4Var = null;
                            }
                            if (dw4Var != null) {
                                c0144d.m1022f(dw4Var, c0144d.f2598a, z);
                                fa4.m11663y(c0144d.f2618u);
                                c0144d.m1024h(f7 - c0144d.f2612o, dw4Var);
                            } else {
                                c0357g = c0144d.f2605h;
                                if (c0357g != null) {
                                    c0357g.m1598l();
                                }
                                c0144d.m1024h(f7 - c0144d.f2612o, (dw4) xc9Var.getValue());
                            }
                        }
                        dw4Var = dw4VarM10692f;
                        if (dw4Var != null) {
                            c0144d.m1022f(dw4Var, c0144d.f2598a, z);
                            fa4.m11663y(c0144d.f2618u);
                            c0144d.m1024h(f7 - c0144d.f2612o, dw4Var);
                        } else {
                            c0357g = c0144d.f2605h;
                            if (c0357g != null) {
                                c0357g.m1598l();
                            }
                            c0144d.m1024h(f7 - c0144d.f2612o, (dw4) xc9Var.getValue());
                        }
                    }
                    if (Math.abs(c0144d.f2612o) > 0.5f) {
                        f5 -= c0144d.f2612o;
                        c0144d.f2612o = 0.0f;
                    }
                    f = f5;
                }
                return Float.valueOf(-f);
            case 4:
                LibraryUpdateFragment libraryUpdateFragment = (LibraryUpdateFragment) this.f48463b;
                w95 w95Var = (w95) obj;
                w95Var.getClass();
                libraryUpdateFragment.m9055j0(w95Var);
                return xfa.f68157a;
            case 5:
                return ((x59) ((y59) this.f48463b).f69326a.get(((Integer) obj).intValue())).mo19662a();
            case 6:
                ((b85) this.f48463b).mo3459l(((Integer) obj).intValue());
                return xfa.f68157a;
            case 7:
                ((xt9) this.f48463b).mo17646c(((gq6) obj).f41189a, p84.f55747i);
                return xfa.f68157a;
            case 8:
                w41 w41Var = (w41) this.f48463b;
                List list = (List) obj;
                list.getClass();
                C3244l c3244l = (C3244l) w41Var.f66367c;
                do {
                    value = c3244l.getValue();
                    arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (!((C3509qs) w41Var.f66366b).m20128b().contains(((EmbeddedMessage) obj2).m7035b().m7040a())) {
                            arrayList.add(obj2);
                        }
                    }
                } while (!c3244l.m15570h(value, arrayList));
                return xfa.f68157a;
            case 9:
                return MultiProcessDataStoreFactory.create$lambda$0((un1) this.f48463b, (File) obj);
            case 10:
                xp6 xp6Var = (xp6) this.f48463b;
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT * FROM OfferEntity");
                try {
                    int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e0, "id");
                    int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e0, "title");
                    int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e0, "code");
                    int iM14108v4 = AbstractC3122is.m14108v(ik8VarMo2873e0, "type");
                    int iM14108v5 = AbstractC3122is.m14108v(ik8VarMo2873e0, "visibility");
                    int iM14108v6 = AbstractC3122is.m14108v(ik8VarMo2873e0, "dateStart");
                    int iM14108v7 = AbstractC3122is.m14108v(ik8VarMo2873e0, "dateEnd");
                    int iM14108v8 = AbstractC3122is.m14108v(ik8VarMo2873e0, "dateCountdown");
                    int iM14108v9 = AbstractC3122is.m14108v(ik8VarMo2873e0, "countdownEnabled");
                    int iM14108v10 = AbstractC3122is.m14108v(ik8VarMo2873e0, "countdownEnded");
                    int iM14108v11 = AbstractC3122is.m14108v(ik8VarMo2873e0, "isActive");
                    int iM14108v12 = AbstractC3122is.m14108v(ik8VarMo2873e0, "tier");
                    int iM14108v13 = AbstractC3122is.m14108v(ik8VarMo2873e0, "ctaText");
                    int iM14108v14 = AbstractC3122is.m14108v(ik8VarMo2873e0, "androidCoupon");
                    xp6 xp6Var2 = xp6Var;
                    int iM14108v15 = AbstractC3122is.m14108v(ik8VarMo2873e0, "discount");
                    int iM14108v16 = AbstractC3122is.m14108v(ik8VarMo2873e0, "accentColorLight");
                    int iM14108v17 = AbstractC3122is.m14108v(ik8VarMo2873e0, "accentColorDark");
                    int iM14108v18 = AbstractC3122is.m14108v(ik8VarMo2873e0, "trialHeader");
                    int iM14108v19 = AbstractC3122is.m14108v(ik8VarMo2873e0, "banners");
                    ArrayList arrayList2 = new ArrayList();
                    while (ik8VarMo2873e0.mo2876a0()) {
                        int i = iM14108v12;
                        int i2 = iM14108v13;
                        int i3 = (int) ik8VarMo2873e0.getLong(iM14108v);
                        String strMo2875L = ik8VarMo2873e0.mo2875L(iM14108v2);
                        String strMo2875L2 = ik8VarMo2873e0.mo2875L(iM14108v3);
                        String strMo2875L3 = ik8VarMo2873e0.mo2875L(iM14108v4);
                        String strMo2875L4 = ik8VarMo2873e0.mo2875L(iM14108v5);
                        String strMo2875L5 = ik8VarMo2873e0.mo2875L(iM14108v6);
                        String strMo2875L6 = ik8VarMo2873e0.mo2875L(iM14108v7);
                        String strMo2875L7 = ik8VarMo2873e0.isNull(iM14108v8) ? null : ik8VarMo2873e0.mo2875L(iM14108v8);
                        boolean z2 = ((int) ik8VarMo2873e0.getLong(iM14108v9)) != 0;
                        boolean z3 = ((int) ik8VarMo2873e0.getLong(iM14108v10)) != 0;
                        boolean z4 = ((int) ik8VarMo2873e0.getLong(iM14108v11)) != 0;
                        Integer numValueOf = ik8VarMo2873e0.isNull(i) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(i));
                        String strMo2875L8 = ik8VarMo2873e0.isNull(i2) ? null : ik8VarMo2873e0.mo2875L(i2);
                        String strMo2875L9 = ik8VarMo2873e0.isNull(iM14108v14) ? null : ik8VarMo2873e0.mo2875L(iM14108v14);
                        int i4 = iM14108v15;
                        String strMo2875L10 = ik8VarMo2873e0.mo2875L(i4);
                        int i5 = iM14108v16;
                        String strMo2875L11 = ik8VarMo2873e0.mo2875L(i5);
                        iM14108v16 = i5;
                        int i6 = iM14108v17;
                        String strMo2875L12 = ik8VarMo2873e0.mo2875L(i6);
                        iM14108v17 = i6;
                        int i7 = iM14108v18;
                        String strMo2875L13 = ik8VarMo2873e0.mo2875L(i7);
                        iM14108v18 = i7;
                        int i8 = iM14108v19;
                        String strMo2875L14 = ik8VarMo2873e0.mo2875L(i8);
                        ik8Var = ik8VarMo2873e0;
                        xp6 xp6Var3 = xp6Var2;
                        try {
                            qn3 qn3Var = xp6Var3.f68495M;
                            qn3Var.getClass();
                            strMo2875L14.getClass();
                            yf4 yf4Var = (yf4) qn3Var.f57974a;
                            yf4Var.getClass();
                            arrayList2.add(new yp6(i3, strMo2875L, strMo2875L2, strMo2875L3, strMo2875L4, strMo2875L5, strMo2875L6, strMo2875L7, z2, z3, z4, numValueOf, strMo2875L8, strMo2875L9, strMo2875L10, strMo2875L11, strMo2875L12, strMo2875L13, (List) yf4Var.m10321a(strMo2875L14, new C2978ev(OfferBanner.Companion.serializer()))));
                            ik8VarMo2873e0 = ik8Var;
                            iM14108v = iM14108v;
                            iM14108v13 = i2;
                            iM14108v3 = iM14108v3;
                            iM14108v12 = i;
                            iM14108v2 = iM14108v2;
                            iM14108v15 = i4;
                            iM14108v19 = i8;
                            xp6Var2 = xp6Var3;
                        } catch (Throwable th) {
                            th = th;
                            ik8Var.close();
                            throw th;
                        }
                        break;
                    }
                    ik8VarMo2873e0.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    th = th2;
                    ik8Var = ik8VarMo2873e0;
                }
                break;
            case 11:
                OnboardingLoginFragment onboardingLoginFragment = (OnboardingLoginFragment) this.f48463b;
                vg6 vg6Var = (vg6) obj;
                vg6Var.getClass();
                if (vg6Var.equals(fi6.f39146a)) {
                    ud6 ud6VarM3244j = b34.m3244j(onboardingLoginFragment);
                    eu6.Companion.getClass();
                    ac6.Companion.getClass();
                    C2916d6 c2916d6M25538a = zb6.m25538a();
                    ud6VarM3244j.m22687d(c2916d6M25538a.f35027a, c2916d6M25538a.f35028b, null);
                } else if (vg6Var.equals(fi6.f39147b)) {
                    ud6 ud6VarM3244j2 = b34.m3244j(onboardingLoginFragment);
                    eu6.Companion.getClass();
                    ac6.Companion.getClass();
                    int i9 = R$id.actionToOnboardingLanguage;
                    Bundle bundleM18160p = omd.m18160p((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    ud6VarM3244j2.getClass();
                    ud6VarM3244j2.m22687d(i9, bundleM18160p, null);
                } else if (vg6Var.equals(gi6.f40855a)) {
                    ud6 ud6VarM3244j3 = b34.m3244j(onboardingLoginFragment);
                    eu6.Companion.getClass();
                    ac6.Companion.getClass();
                    Pair[] pairArr = new Pair[0];
                    ud6VarM3244j3.m22687d(R$id.actionToOnboardingLevel, omd.m18160p((Pair[]) Arrays.copyOf(pairArr, pairArr.length)), null);
                } else if (vg6Var.equals(ai6.f696c)) {
                    ud6 ud6VarM3244j4 = b34.m3244j(onboardingLoginFragment);
                    eu6.Companion.getClass();
                    ac6.Companion.getClass();
                    int i10 = R$id.actionToEmailLogin;
                    Bundle bundleM18160p2 = omd.m18160p((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    ud6VarM3244j4.getClass();
                    ud6VarM3244j4.m22687d(i10, bundleM18160p2, null);
                } else if (vg6Var.equals(tg6.f62255a)) {
                    b34.m3244j(onboardingLoginFragment).m22689f();
                } else if (vg6Var instanceof ug6) {
                    mbd.m16755c(onboardingLoginFragment.m2089Q(), ((ug6) vg6Var).m22727a(), null, 30);
                }
                return xfa.f68157a;
            case 12:
                OnboardingStartFragment onboardingStartFragment = (OnboardingStartFragment) this.f48463b;
                String str = (String) obj;
                str.getClass();
                mbd.m16755c(onboardingStartFragment.m2089Q(), str, null, 30);
                return xfa.f68157a;
            case 13:
                o72 o72Var = (o72) this.f48463b;
                q98 q98Var = (q98) obj;
                q98Var.getClass();
                int iM1036k = o72Var.m1036k();
                if (iM1036k == 0) {
                    fM15944g = l70.m15944g(o72Var.m1037l(), 0.0f, 1.0f);
                } else if (iM1036k == 1) {
                    fM15944g = l70.m15944g(o72Var.m1037l() + 1.0f, 0.0f, 1.0f);
                }
                q98Var.m19813c(fM15944g);
                return xfa.f68157a;
            case 14:
                Integer num = (Integer) obj;
                OnboardingPage onboardingPage = (OnboardingPage) u91.m22592J0(num.intValue(), ((lx6) this.f48463b).f50243b);
                return onboardingPage != null ? Integer.valueOf(onboardingPage.getIndex()) : num;
            case 15:
                t17 t17Var = (t17) this.f48463b;
                y64 y64Var = (y64) obj;
                y64Var.f69365a = "padding";
                y64Var.f69367c.m25511b(t17Var, "paddingValues");
                return xfa.f68157a;
            case 16:
                C0151e c0151e = (C0151e) this.f48463b;
                float fFloatValue = ((Float) obj).floatValue();
                AbstractC0150d abstractC0150d = c0151e.f2698b;
                abstractC0150d.f2687q.m21223i(abstractC0150d.m1035j(abstractC0150d.m1036k() + ss5.m21693T(abstractC0150d.m1041p() != 0 ? fFloatValue / abstractC0150d.m1041p() : 0.0f)));
                return xfa.f68157a;
            case 17:
                k73 k73Var = (k73) this.f48463b;
                tv8 tv8Var = (tv8) obj;
                if (k73Var.mo169a() > 0.0f) {
                    AbstractC0426f.m1863g(tv8Var, new tm7(k73Var.mo169a(), new h41(0.0f, 1.0f), 0));
                }
                return xfa.f68157a;
            case 18:
                ((pf1) this.f48463b).m19109y(obj);
                return xfa.f68157a;
            case 19:
                C0281i c0281i = (C0281i) this.f48463b;
                Throwable th3 = (Throwable) obj;
                CancellationException cancellationExceptionM20580a = rcd.m20580a("Recomposer effect job completed", th3);
                synchronized (c0281i.f3757d) {
                    try {
                        cd4 cd4Var = c0281i.f3758e;
                        if (cd4Var != null) {
                            c0281i.f3776w.m15571i(Recomposer$State.ShuttingDown);
                            if (c0281i.f3773t) {
                                sm0Var = c0281i.f3772s;
                                if (sm0Var != null) {
                                }
                                c0281i.f3772s = null;
                                cd4Var.mo4540r(new ui5(12, c0281i, th3));
                                sm0Var2 = sm0Var;
                            } else {
                                cd4Var.mo4537a(cancellationExceptionM20580a);
                            }
                            sm0Var = null;
                            c0281i.f3772s = null;
                            cd4Var.mo4540r(new ui5(12, c0281i, th3));
                            sm0Var2 = sm0Var;
                        } else {
                            c0281i.f3759f = cancellationExceptionM20580a;
                            c0281i.f3776w.m15571i(Recomposer$State.ShutDown);
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                if (sm0Var2 != null) {
                    sm0Var2.resumeWith(xfa.f68157a);
                }
                return xfa.f68157a;
            case 20:
                il8 il8Var2 = ((gl8) this.f48463b).f40976c;
                return Boolean.valueOf(il8Var2 != null ? il8Var2.mo10400b(obj) : true);
            case 21:
                yn8 yn8Var = (yn8) this.f48463b;
                float fFloatValue2 = ((Float) obj).floatValue();
                sc9 sc9Var = yn8Var.f70117a;
                float fM21222h = sc9Var.m21222h() + fFloatValue2 + yn8Var.f70122f;
                float fM15944g2 = l70.m15944g(fM21222h, 0.0f, yn8Var.f70121e.m21222h());
                boolean z5 = fM21222h == fM15944g2;
                float fM21222h2 = fM15944g2 - sc9Var.m21222h();
                int iRound2 = Math.round(fM21222h2);
                sc9Var.m21223i(sc9Var.m21222h() + iRound2);
                yn8Var.f70122f = fM21222h2 - iRound2;
                if (!z5) {
                    fFloatValue2 = fM21222h2;
                }
                return Float.valueOf(fFloatValue2);
            case 22:
                C0116v c0116v = (C0116v) this.f48463b;
                return new gq6(c0116v.m931c(c0116v.f2370k, ((gq6) obj).f41189a, c0116v.f2369j));
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                r89 r89Var = (r89) this.f48463b;
                yv8 yv8Var = r89Var.f58897f;
                yv8Var.getClass();
                if (!fa4.m11650l(r89Var.f58897f, yv8Var)) {
                    hi7.m13279b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                o66 o66Var = r89Var.f58896e;
                Object obj3 = r89Var.f58894c;
                if (o66Var != null) {
                    if (obj3 != null) {
                        hi7.m13279b("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    o66Var.m17811d(obj);
                } else if (obj3 == null) {
                    r89Var.f58894c = obj;
                } else {
                    o66 o66Var2 = pm8.f56484a;
                    o66 o66Var3 = new o66();
                    o66Var3.m17811d(obj3);
                    o66Var3.m17811d(obj);
                    r89Var.f58896e = o66Var3;
                    r89Var.f58894c = null;
                }
                return xfa.f68157a;
            case 24:
                return Boolean.valueOf(((List) obj).retainAll((Collection) this.f48463b));
            case 25:
                ed9 ed9Var = (ed9) this.f48463b;
                synchronized (ed9Var.f37076g) {
                    dd9 dd9Var = ed9Var.f37078i;
                    dd9Var.getClass();
                    Object obj4 = dd9Var.f35455b;
                    obj4.getClass();
                    int i11 = dd9Var.f35457d;
                    d66 d66Var = dd9Var.f35456c;
                    if (d66Var == null) {
                        d66Var = new d66();
                        dd9Var.f35456c = d66Var;
                        dd9Var.f35459f.m17261m(obj4, d66Var);
                    }
                    dd9Var.m10298b(obj, i11, obj4, d66Var);
                }
                return xfa.f68157a;
            case 26:
                C3838zm c3838zm = (C3838zm) obj;
                ((zi3) this.f48463b).invoke(((xc9) c3838zm.f71729e).getValue(), pk9.f56363h.f45443b.invoke(c3838zm.f71730f));
                return xfa.f68157a;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                mv9 mv9Var = (mv9) this.f48463b;
                float fFloatValue3 = ((Float) obj).floatValue();
                qc9 qc9Var = mv9Var.f51891a;
                float fM19861h = qc9Var.m19861h() + fFloatValue3;
                qc9 qc9Var2 = mv9Var.f51892b;
                if (fM19861h > qc9Var2.m19861h()) {
                    fFloatValue3 = qc9Var2.m19861h() - qc9Var.m19861h();
                } else if (fM19861h < 0.0f) {
                    fFloatValue3 = -qc9Var.m19861h();
                }
                qc9Var.m19862i(qc9Var.m19861h() + fFloatValue3);
                return Float.valueOf(fFloatValue3);
            case 28:
                ww9 ww9Var = (ww9) this.f48463b;
                C3378nn c3378nn = (C3378nn) obj;
                InterfaceC3190kn interfaceC3190kn = (InterfaceC3190kn) c3378nn.f52979a;
                if (interfaceC3190kn instanceof ee5) {
                    ee5 ee5Var = (ee5) interfaceC3190kn;
                    if (ee5Var.f37109b == null) {
                        return C3378nn.m17501a(c3378nn, new ee5(ee5Var.f37108a, ww9Var, ee5Var.f37110c), 0, 14);
                    }
                }
                if (!(interfaceC3190kn instanceof de5)) {
                    return c3378nn;
                }
                de5 de5Var = (de5) interfaceC3190kn;
                return de5Var.f35499b == null ? C3378nn.m17501a(c3378nn, new de5(de5Var.f35498a, ww9Var, de5Var.f35500c), 0, 14) : c3378nn;
            default:
                TooltipStep tooltipStep = (TooltipStep) this.f48463b;
                b6a b6aVar = (b6a) obj;
                b6aVar.getClass();
                return Boolean.valueOf(b6aVar.m3373c().m24947b() == tooltipStep);
        }
    }

    public /* synthetic */ kv4(Object obj, int i) {
        this.f48462a = i;
        this.f48463b = obj;
    }
}
