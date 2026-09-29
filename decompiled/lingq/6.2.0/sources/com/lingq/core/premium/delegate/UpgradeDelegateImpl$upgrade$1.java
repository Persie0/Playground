package com.lingq.core.premium.delegate;

import android.os.Bundle;
import com.android.billingclient.api.Purchase;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.data.LqAnalyticsValues$UpgradeTier;
import com.lingq.core.data.profile.C1267a;
import com.lingq.core.domain.model.user.Profile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import org.joda.time.DateTime;
import p000.AbstractC3393o1;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.cma;
import p000.fa4;
import p000.g9a;
import p000.gm5;
import p000.hm5;
import p000.hy3;
import p000.km7;
import p000.ol7;
import p000.ph2;
import p000.pk9;
import p000.pl7;
import p000.ql7;
import p000.r43;
import p000.s63;
import p000.t62;
import p000.u91;
import p000.uha;
import p000.um5;
import p000.un1;
import p000.ux5;
import p000.v18;
import p000.v72;
import p000.vk9;
import p000.xfa;
import p000.xm5;
import p000.ym5;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.premium.delegate.UpgradeDelegateImpl$upgrade$1", m4291f = "UpgradeDelegate.kt", m4292l = {403, 405, 414, 421}, m4293m = "invokeSuspend", m4294v = 2)
final class UpgradeDelegateImpl$upgrade$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22451a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1845b f22452b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v18 f22453c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Purchase f22454d;

    /* JADX INFO: renamed from: com.lingq.core.premium.delegate.UpgradeDelegateImpl$upgrade$1$5 */
    @c32(m4290c = "com.lingq.core.premium.delegate.UpgradeDelegateImpl$upgrade$1$5", m4291f = "UpgradeDelegate.kt", m4292l = {422, 423}, m4293m = "invokeSuspend", m4294v = 2)
    final class C18435 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f22455a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1845b f22456b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18435(C1845b c1845b, Continuation continuation) {
            super(2, continuation);
            this.f22456b = c1845b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C18435(this.f22456b, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C18435) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
        
            if (r5.f22456b.f22479d.mo4578J(r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f22455a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                this.f22455a = 1;
                if (AbstractC3208a.m15437d(500L, this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
            this.f22455a = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeDelegateImpl$upgrade$1(C1845b c1845b, v18 v18Var, Purchase purchase, Continuation continuation) {
        super(2, continuation);
        this.f22452b = c1845b;
        this.f22453c = v18Var;
        this.f22454d = purchase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UpgradeDelegateImpl$upgrade$1(this.f22452b, this.f22453c, this.f22454d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((UpgradeDelegateImpl$upgrade$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:114:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x010a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:55:0x010f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0136 A[EDGE_INSN: B:64:0x0136->B:65:0x0138 BREAK  A[LOOP:3: B:31:0x00b4->B:66:0x013b]] */
    /* JADX WARN: Code duplicated, block: B:69:0x016b  */
    /* JADX WARN: Code duplicated, block: B:71:0x017d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0184  */
    /* JADX WARN: Code duplicated, block: B:74:0x0190  */
    /* JADX WARN: Code duplicated, block: B:75:0x0197  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:78:0x01aa  */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0230, code lost:
    
        if (p000.wfb.m23905G(r3, r2, r20) == r6) goto L93;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7068I;
        Object value;
        Object value2;
        Object value3;
        Object objM15541t;
        String str;
        List list;
        Bundle bundleM12429f;
        String value4;
        pl7 pl7Var;
        Iterator it;
        Object next;
        s63 s63Var;
        ArrayList arrayList;
        ol7 ol7Var;
        Object next2;
        Object value5;
        C3244l c3244l;
        Object value6;
        Purchase purchase;
        C3244l c3244l2;
        Object value7;
        C1845b c1845b = this.f22452b;
        hm5 hm5Var = c1845b.f22478c;
        cma cmaVar = c1845b.f22479d;
        C3244l c3244l3 = c1845b.f22462B;
        C3244l c3244l4 = c1845b.f22497v;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22451a;
        v18 v18Var = this.f22453c;
        char c = 4;
        char c2 = 3;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            while (true) {
                Object value8 = c3244l3.getValue();
                ((Boolean) value8).getClass();
                if (c3244l3.m15570h(value8, Boolean.TRUE)) {
                    break;
                }
                c2 = c2;
                c = c;
            }
            km7 km7Var = c1845b.f22477b;
            this.f22451a = 1;
            objM7068I = ((C1267a) km7Var).m7068I(v18Var, this);
            if (objM7068I != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
            objM7068I = obj;
        } else {
            if (i == 2) {
                AbstractC3193b.m15359b(obj);
                objM15541t = obj;
                List list2 = (List) ((C3244l) c1845b.f22491p.f9311a).getValue();
                String str2 = ((Profile) objM15541t).f19666o;
                String str3 = (String) c1845b.f22486k.getValue();
                String str4 = (String) c1845b.f22488m.getValue();
                hm5Var.getClass();
                str = v18Var.f64702c;
                ux5.m22974A(str2, str3, str4);
                list = list2;
                double d = 0.0d;
                String str5 = "";
                if (list != null && !list.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            ql7 ql7Var = (ql7) it2.next();
                            String str6 = ql7Var.f57906c;
                            ArrayList arrayList2 = ql7Var.f57911h;
                            if (fa4.m11650l(str6, str)) {
                                if (arrayList2 != null) {
                                    Iterator it3 = arrayList2.iterator();
                                    do {
                                        if (!it3.hasNext()) {
                                            next2 = null;
                                            break;
                                        }
                                        next2 = it3.next();
                                    } while (!((pl7) next2).f56417e.contains(str4));
                                    pl7Var = (pl7) next2;
                                    if (pl7Var == null) {
                                        if (arrayList2 != null) {
                                            it = arrayList2.iterator();
                                            do {
                                                if (it.hasNext()) {
                                                    next = null;
                                                    break;
                                                }
                                                next = it.next();
                                            } while (!((pl7) next).f56417e.isEmpty());
                                            pl7Var = (pl7) next;
                                        } else {
                                            pl7Var = null;
                                        }
                                    }
                                } else if (arrayList2 != null) {
                                    it = arrayList2.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it.next();
                                    } while (!((pl7) next).f56417e.isEmpty());
                                    pl7Var = (pl7) next;
                                } else {
                                    pl7Var = null;
                                }
                                if (pl7Var != null && (s63Var = pl7Var.f56416d) != null && (arrayList = s63Var.f60402a) != null && (ol7Var = (ol7) u91.m22591I0(arrayList)) != null) {
                                    double d2 = ol7Var.f54545b / 1000000.0f;
                                    String str7 = ol7Var.f54546c;
                                    str7.getClass();
                                    str5 = str7;
                                    d = d2;
                                    break;
                                }
                                break;
                            }
                        }
                        break;
                        break;
                    }
                }
                break;
                String str8 = str5;
                bundleM12429f = g9a.m12429f("Upgrade client", "android");
                bundleM12429f.putString("Upgrade date", hy3.f43148E.m14766a(new DateTime()));
                bundleM12429f.putString("Upgrade language", str2);
                bundleM12429f.putString("Attempted prior action", str3);
                bundleM12429f.putString("Payment platform", "Google");
                if (str != null) {
                    bundleM12429f.putString("Product Id", str);
                    if (vk9.m23380c0(str, PremiumPackages.PremiumMonth.getValue(), false)) {
                        value4 = LqAnalyticsValues$UpgradeTier.OneMonthPremium.getValue();
                    } else if (vk9.m23380c0(str, PremiumPackages.PremiumSixMonths.getValue(), false)) {
                        value4 = LqAnalyticsValues$UpgradeTier.SixMonthPremium.getValue();
                    } else if (vk9.m23380c0(str, PremiumPackages.PremiumOneYear.getValue(), false)) {
                        value4 = LqAnalyticsValues$UpgradeTier.TwelveMonthPremium.getValue();
                    } else {
                        value4 = LqAnalyticsValues$UpgradeTier.OneMonthPremium.getValue();
                    }
                    bundleM12429f.putString("Upgrade tier", value4);
                }
                bundleM12429f.putString("Amount paid", String.valueOf(d));
                bundleM12429f.putString("Currency", str8);
                bundleM12429f.putString("Coupon", str4);
                ((C1240a) hm5Var).m7025f("Upgrade confirmed", bundleM12429f);
                r43.m20289a().m20290b(new Exception(AbstractC3393o1.m17734i("Upgraded successfully ", v18Var.f64700a)));
                this.f22451a = 3;
                if (cmaVar.mo4597w0(this) != coroutineSingletons) {
                    do {
                        value5 = c3244l3.getValue();
                        ((Boolean) value5).getClass();
                    } while (!c3244l3.m15570h(value5, Boolean.FALSE));
                    c3244l = c1845b.f22501z;
                    do {
                        value6 = c3244l.getValue();
                        purchase = this.f22454d;
                    } while (!c3244l.m15570h(value6, purchase));
                    c3244l2 = c1845b.f22499x;
                    do {
                        value7 = c3244l2.getValue();
                    } while (!c3244l2.m15570h(value7, purchase));
                    v72 v72Var = ph2.f56212a;
                    t62 t62Var = t62.f61909c;
                    C18435 c18435 = new C18435(c1845b, null);
                    this.f22451a = 4;
                }
                return coroutineSingletons;
            }
            if (i == 3) {
                AbstractC3193b.m15359b(obj);
                do {
                    value5 = c3244l3.getValue();
                    ((Boolean) value5).getClass();
                } while (!c3244l3.m15570h(value5, Boolean.FALSE));
                c3244l = c1845b.f22501z;
                do {
                    value6 = c3244l.getValue();
                    purchase = this.f22454d;
                } while (!c3244l.m15570h(value6, purchase));
                c3244l2 = c1845b.f22499x;
                do {
                    value7 = c3244l2.getValue();
                } while (!c3244l2.m15570h(value7, purchase));
                v72 v72Var2 = ph2.f56212a;
                t62 t62Var2 = t62.f61909c;
                C18435 c18436 = new C18435(c1845b, null);
                this.f22451a = 4;
            } else {
                if (i != 4) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
        }
        return xfa.f68157a;
        ym5 ym5Var = (ym5) objM7068I;
        ym5Var.getClass();
        if (ym5Var instanceof xm5) {
            c83 c83VarMo4574C1 = cmaVar.mo4574C1();
            this.f22451a = 2;
            objM15541t = AbstractC3224d.m15541t(c83VarMo4574C1, this);
            if (objM15541t != coroutineSingletons) {
                List list3 = (List) ((C3244l) c1845b.f22491p.f9311a).getValue();
                String str9 = ((Profile) objM15541t).f19666o;
                String str10 = (String) c1845b.f22486k.getValue();
                String str11 = (String) c1845b.f22488m.getValue();
                hm5Var.getClass();
                str = v18Var.f64702c;
                ux5.m22974A(str9, str10, str11);
                list = list3;
                double d3 = 0.0d;
                String str12 = "";
                if (list != null) {
                    break;
                    break;
                }
                break;
                break;
                String str13 = str12;
                bundleM12429f = g9a.m12429f("Upgrade client", "android");
                bundleM12429f.putString("Upgrade date", hy3.f43148E.m14766a(new DateTime()));
                bundleM12429f.putString("Upgrade language", str9);
                bundleM12429f.putString("Attempted prior action", str10);
                bundleM12429f.putString("Payment platform", "Google");
                if (str != null) {
                    bundleM12429f.putString("Product Id", str);
                    if (vk9.m23380c0(str, PremiumPackages.PremiumMonth.getValue(), false)) {
                        value4 = LqAnalyticsValues$UpgradeTier.OneMonthPremium.getValue();
                    } else if (vk9.m23380c0(str, PremiumPackages.PremiumSixMonths.getValue(), false)) {
                        value4 = LqAnalyticsValues$UpgradeTier.SixMonthPremium.getValue();
                    } else if (vk9.m23380c0(str, PremiumPackages.PremiumOneYear.getValue(), false)) {
                        value4 = LqAnalyticsValues$UpgradeTier.TwelveMonthPremium.getValue();
                    } else {
                        value4 = LqAnalyticsValues$UpgradeTier.OneMonthPremium.getValue();
                    }
                    bundleM12429f.putString("Upgrade tier", value4);
                }
                bundleM12429f.putString("Amount paid", String.valueOf(d3));
                bundleM12429f.putString("Currency", str13);
                bundleM12429f.putString("Coupon", str11);
                ((C1240a) hm5Var).m7025f("Upgrade confirmed", bundleM12429f);
                r43.m20289a().m20290b(new Exception(AbstractC3393o1.m17734i("Upgraded successfully ", v18Var.f64700a)));
                this.f22451a = 3;
                if (cmaVar.mo4597w0(this) != coroutineSingletons) {
                    do {
                        value5 = c3244l3.getValue();
                        ((Boolean) value5).getClass();
                    } while (!c3244l3.m15570h(value5, Boolean.FALSE));
                    c3244l = c1845b.f22501z;
                    do {
                        value6 = c3244l.getValue();
                        purchase = this.f22454d;
                    } while (!c3244l.m15570h(value6, purchase));
                    c3244l2 = c1845b.f22499x;
                    do {
                        value7 = c3244l2.getValue();
                    } while (!c3244l2.m15570h(value7, purchase));
                    v72 v72Var3 = ph2.f56212a;
                    t62 t62Var3 = t62.f61909c;
                    C18435 c18437 = new C18435(c1845b, null);
                    this.f22451a = 4;
                }
            }
            return coroutineSingletons;
        }
        if (ym5Var instanceof um5) {
            ((C1240a) hm5Var).m7025f("Upgrade error occurred", null);
            uha uhaVar = (uha) pk9.m19373k(ym5Var);
            if (uhaVar instanceof uha) {
                do {
                    value3 = c3244l4.getValue();
                    ((Boolean) value3).getClass();
                } while (!c3244l4.m15570h(value3, Boolean.TRUE));
            } else {
                if (uhaVar != null) {
                    gm5.m12750e();
                    return null;
                }
                do {
                    value2 = c3244l4.getValue();
                    ((Boolean) value2).getClass();
                } while (!c3244l4.m15570h(value2, Boolean.TRUE));
            }
        } else {
            ((C1240a) hm5Var).m7025f("Upgrade error occurred", null);
            do {
                value = c3244l4.getValue();
                ((Boolean) value).getClass();
            } while (!c3244l4.m15570h(value, Boolean.TRUE));
        }
        return xfa.f68157a;
    }
}
