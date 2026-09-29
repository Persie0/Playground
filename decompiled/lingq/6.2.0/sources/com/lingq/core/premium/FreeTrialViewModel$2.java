package com.lingq.core.premium;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.cl9;
import p000.dj3;
import p000.fa4;
import p000.ol7;
import p000.ph3;
import p000.pha;
import p000.pl7;
import p000.ql7;
import p000.s63;
import p000.up6;
import p000.vk9;
import p000.vz1;
import p000.wba;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.premium.FreeTrialViewModel$2", m4291f = "FreeTrialViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class FreeTrialViewModel$2 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f22325a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f22326b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ String f22327c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean f22328d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ up6 f22329e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1840b f22330f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ NumberFormat f22331g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreeTrialViewModel$2(C1840b c1840b, NumberFormat numberFormat, Continuation continuation) {
        super(6, continuation);
        this.f22330f = c1840b;
        this.f22331g = numberFormat;
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
        FreeTrialViewModel$2 freeTrialViewModel$2 = new FreeTrialViewModel$2(this.f22330f, this.f22331g, (Continuation) obj6);
        freeTrialViewModel$2.f22325a = (List) obj;
        freeTrialViewModel$2.f22326b = zBooleanValue;
        freeTrialViewModel$2.f22327c = (String) obj3;
        freeTrialViewModel$2.f22328d = zBooleanValue2;
        freeTrialViewModel$2.f22329e = (up6) obj5;
        return freeTrialViewModel$2.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:133:0x01de  */
    /* JADX WARN: Code duplicated, block: B:154:0x0231  */
    /* JADX WARN: Code duplicated, block: B:35:0x0090  */
    /* JADX WARN: Code duplicated, block: B:75:0x010e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strConcat;
        String str;
        Object next;
        ArrayList arrayList;
        long j;
        ol7 ol7Var;
        float f;
        Iterator it;
        float f2;
        Object next2;
        ol7 ol7Var2;
        String str2;
        ArrayList arrayList2;
        Object next3;
        s63 s63Var;
        ArrayList arrayList3;
        Object next4;
        Object next5;
        ArrayList arrayList4;
        Object next6;
        s63 s63Var2;
        ArrayList arrayList5;
        ArrayList arrayList6;
        NumberFormat numberFormat = this.f22331g;
        List list = this.f22325a;
        boolean z = this.f22326b;
        String str3 = this.f22327c;
        boolean z2 = this.f22328d;
        up6 up6Var = this.f22329e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C1840b c1840b = this.f22330f;
        String str4 = c1840b.f22412e;
        String str5 = c1840b.f22413f;
        pha phaVar = c1840b.f22410c;
        String strMo8574o0 = z2 ? phaVar.mo8574o0() : phaVar.mo8555K0();
        if (up6Var == null) {
            strConcat = null;
        } else {
            up6 up6Var2 = str5 != null ? up6Var : null;
            if (up6Var2 != null) {
                String strM22854b = up6Var2.m22854b();
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    loop7: while (true) {
                        if (!it2.hasNext()) {
                            strM22854b = null;
                            break;
                        }
                        ql7 ql7Var = (ql7) it2.next();
                        if (fa4.m11650l(ql7Var.f57906c, strMo8574o0) && (arrayList6 = ql7Var.f57911h) != null && !arrayList6.isEmpty()) {
                            Iterator it3 = arrayList6.iterator();
                            while (it3.hasNext()) {
                                if (((pl7) it3.next()).f56417e.contains(strM22854b.concat("-tr"))) {
                                    break loop7;
                                }
                            }
                        }
                    }
                } else {
                    strM22854b = null;
                    break;
                }
                if (strM22854b != null) {
                    strConcat = strM22854b.concat("-tr");
                } else {
                    strConcat = null;
                }
            } else {
                strConcat = null;
            }
        }
        if (fa4.m11650l(str5, "lq-basetrial")) {
            str = "lq-basetrial";
        } else {
            str = strConcat == null ? str3 : strConcat;
        }
        List list3 = list;
        Iterator it4 = list3.iterator();
        loop0: while (true) {
            if (!it4.hasNext()) {
                next = null;
                break;
            }
            next = it4.next();
            ql7 ql7Var2 = (ql7) next;
            if (fa4.m11650l(ql7Var2.f57906c, strMo8574o0) && (arrayList5 = ql7Var2.f57911h) != null && !arrayList5.isEmpty()) {
                Iterator it5 = arrayList5.iterator();
                while (it5.hasNext()) {
                    if (((pl7) it5.next()).f56417e.contains(str)) {
                        break loop0;
                    }
                }
            }
        }
        ql7 ql7Var3 = (ql7) next;
        if (ql7Var3 == null || (arrayList4 = ql7Var3.f57911h) == null) {
            arrayList = null;
        } else {
            Iterator it6 = arrayList4.iterator();
            do {
                if (!it6.hasNext()) {
                    next6 = null;
                    break;
                }
                next6 = it6.next();
            } while (!((pl7) next6).f56417e.contains(str));
            pl7 pl7Var = (pl7) next6;
            if (pl7Var == null || (s63Var2 = pl7Var.f56416d) == null) {
                arrayList = null;
            } else {
                arrayList = s63Var2.f60402a;
            }
        }
        if (arrayList != null) {
            Iterator it7 = arrayList.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    j = 0;
                    next5 = null;
                    break;
                }
                next5 = it7.next();
                ol7 ol7Var3 = (ol7) next5;
                j = 0;
                if (ol7Var3.f54545b != 0 && !fa4.m11650l(ol7Var3.f54547d, "P1W")) {
                    break;
                }
            }
            ol7Var = (ol7) next5;
        } else {
            j = 0;
            ol7Var = null;
        }
        try {
            numberFormat.setCurrency(Currency.getInstance(ol7Var != null ? ol7Var.f54546c : null));
            while (true) {
                if (!it.hasNext()) {
                    f2 = f;
                    next2 = null;
                    break;
                }
                next2 = it.next();
                f2 = f;
                if (fa4.m11650l(((ql7) next2).f57906c, phaVar.mo8551H1())) {
                    break;
                }
                f = f2;
            }
        } catch (NullPointerException unused) {
            numberFormat.setCurrency(Currency.getInstance(Locale.US));
        }
        f = 1000000.0f;
        double d = ((ol7Var != null ? ol7Var.f54545b : 0.0f) / 12.0f) / 1000000.0f;
        it = list3.iterator();
        ql7 ql7Var4 = (ql7) next2;
        if (ql7Var4 == null || (arrayList2 = ql7Var4.f57911h) == null) {
            ol7Var2 = null;
        } else {
            Iterator it8 = arrayList2.iterator();
            do {
                if (!it8.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it8.next();
            } while (!((pl7) next3).f56417e.isEmpty());
            pl7 pl7Var2 = (pl7) next3;
            if (pl7Var2 == null || (s63Var = pl7Var2.f56416d) == null || (arrayList3 = s63Var.f60402a) == null) {
                ol7Var2 = null;
            } else {
                Iterator it9 = arrayList3.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it9.next();
                    ol7 ol7Var4 = (ol7) next4;
                    if (ol7Var4.f54545b != j && !fa4.m11650l(ol7Var4.f54547d, "P1W")) {
                        break;
                    }
                }
                ol7Var2 = (ol7) next4;
            }
        }
        double d2 = (ol7Var2 != null ? ol7Var2.f54545b : 0.0f) / f2;
        boolean z3 = (str.length() <= 0 || vk9.m23380c0(str, "lq-basetrial", false) || cl9.m4842Y(str, "special-welcome", false)) ? false : true;
        boolean z4 = up6Var != null;
        String str6 = strConcat;
        double d3 = d * 12.0d;
        boolean z5 = z3;
        String str7 = numberFormat.format(d3);
        str7.getClass();
        String str8 = numberFormat.format(d);
        str8.getClass();
        if (d2 > 0.0d) {
            double d4 = d2 * 12.0d;
            if (d4 > d3) {
                str2 = numberFormat.format(d4);
            } else {
                str2 = "";
            }
        } else {
            str2 = "";
        }
        str2.getClass();
        return new ph3(str7, str8, str2, z, str, c1840b.f22414g ? vz1.m23605K(new wba(R$drawable.ic_unlock, R$string.onboarding_reminder_trial_step1_title, R$string.onboarding_reminder_trial_step1_desc, null, true, 104), new wba(R$drawable.ic_bell, R$string.onboarding_reminder_trial_step2_title, R$string.onboarding_reminder_trial_step2_desc, null, true, 8), new wba(R$drawable.ic_star, R$string.free_trial_step4_title, R$string.onboarding_reminder_trial_step3_desc, vz1.m23604J(str4), false, 96)) : vz1.m23605K(new wba(R$drawable.ic_check, R$string.free_trial_step1_title, R$string.free_trial_step1_desc, null, true, 104), new wba(R$drawable.ic_unlock, R$string.free_trial_step2_title, R$string.free_trial_step2_desc, null, true, 72), new wba(R$drawable.ic_bell, R$string.free_trial_step3_title, R$string.free_trial_step3_desc, null, false, 104), new wba(R$drawable.ic_star, R$string.free_trial_step4_title, R$string.free_trial_step4_desc, vz1.m23604J(str4), false, 96)), str6 != null || (z5 && z4));
    }
}
