package com.lingq.core.premium.delegate;

import com.lingq.core.domain.model.user.FreeTrialDetails;
import com.lingq.core.domain.model.user.SubscriptionDetails;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import org.joda.time.DateTime;
import p000.c32;
import p000.dj3;
import p000.e4b;
import p000.pl7;
import p000.ql7;
import p000.t22;
import p000.up6;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.premium.delegate.UpgradeDelegateImpl$4", m4291f = "UpgradeDelegate.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class UpgradeDelegateImpl$4 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f22440a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f22441b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f22442c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ SubscriptionDetails f22443d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ up6 f22444e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1845b f22445f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeDelegateImpl$4(C1845b c1845b, Continuation continuation) {
        super(6, continuation);
        this.f22445f = c1845b;
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        UpgradeDelegateImpl$4 upgradeDelegateImpl$4 = new UpgradeDelegateImpl$4(this.f22445f, (Continuation) obj6);
        upgradeDelegateImpl$4.f22440a = (List) obj;
        upgradeDelegateImpl$4.f22441b = zBooleanValue;
        upgradeDelegateImpl$4.f22442c = zBooleanValue2;
        upgradeDelegateImpl$4.f22443d = (SubscriptionDetails) obj4;
        upgradeDelegateImpl$4.f22444e = (up6) obj5;
        return upgradeDelegateImpl$4.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        pl7 pl7Var;
        Object next;
        String str;
        C1845b c1845b = this.f22445f;
        e4b e4bVar = c1845b.f22480e;
        List list = this.f22440a;
        boolean z = this.f22441b;
        boolean z2 = this.f22442c;
        SubscriptionDetails subscriptionDetails = this.f22443d;
        up6 up6Var = this.f22444e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        FreeTrialDetails freeTrialDetails = subscriptionDetails.f19843k;
        Object obj2 = null;
        boolean z3 = true;
        boolean z4 = ((freeTrialDetails != null ? freeTrialDetails.f19636b : null) == null && (freeTrialDetails == null || (str = freeTrialDetails.f19635a) == null || str.length() <= 0)) ? false : true;
        if (freeTrialDetails != null && z4) {
            z3 = false;
        }
        C3244l c3244l = c1845b.f22472L;
        do {
            value = c3244l.getValue();
            ((Boolean) value).getClass();
        } while (!c3244l.m15570h(value, Boolean.valueOf(z3)));
        String strM22854b = up6Var != null ? up6Var.m22854b() : "";
        if (z && strM22854b.length() > 0) {
            list.getClass();
            return (z3 && C1845b.m8579a(strM22854b.concat("-tr"), list)) ? strM22854b.concat("-tr") : strM22854b;
        }
        if (z2) {
            DateTime dateTime = new DateTime();
            DateTime dateTimeM22769b = e4bVar.mo8581S().m22769b();
            AtomicReference atomicReference = t22.f61763a;
            if (dateTime.mo18366b() > dateTimeM22769b.mo18366b() && dateTime.m22364c(e4bVar.mo8581S().m22768a())) {
                list.getClass();
                return (z3 && C1845b.m8579a("special-welcome".concat("-tr"), list)) ? "special-welcome-tr" : "special-welcome";
            }
        } else if (z3) {
            for (Object obj3 : list) {
                ArrayList arrayList = ((ql7) obj3).f57911h;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!((pl7) next).m19388c().contains("lq-basetrial"));
                    pl7Var = (pl7) next;
                } else {
                    pl7Var = null;
                }
                if (pl7Var != null) {
                    obj2 = obj3;
                    break;
                }
            }
            if (((ql7) obj2) != null) {
                return "lq-basetrial";
            }
        }
        return "";
    }
}
