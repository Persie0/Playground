package com.lingq.core.premium.delegate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.aj3;
import p000.c32;
import p000.pl7;
import p000.ql7;
import p000.up6;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.premium.delegate.UpgradeDelegateImpl$1", m4291f = "UpgradeDelegate.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class UpgradeDelegateImpl$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f22432a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ up6 f22433b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1845b f22434c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeDelegateImpl$1(C1845b c1845b, Continuation continuation) {
        super(3, continuation);
        this.f22434c = c1845b;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        UpgradeDelegateImpl$1 upgradeDelegateImpl$1 = new UpgradeDelegateImpl$1(this.f22434c, (Continuation) obj3);
        upgradeDelegateImpl$1.f22432a = (List) obj;
        upgradeDelegateImpl$1.f22433b = (up6) obj2;
        xfa xfaVar = xfa.f68157a;
        upgradeDelegateImpl$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        List list;
        Object next;
        Object value2;
        Object next2;
        pl7 pl7Var;
        Object next3;
        pl7 pl7Var2;
        Object next4;
        List list2 = this.f22432a;
        up6 up6Var = this.f22433b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        String strM22854b = up6Var != null ? up6Var.m22854b() : "";
        C1845b c1845b = this.f22434c;
        C3244l c3244l = c1845b.f22492q;
        do {
            value = c3244l.getValue();
            ((Boolean) value).getClass();
            list = list2;
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                ArrayList arrayList = ((ql7) next).f57911h;
                if (arrayList != null) {
                    Iterator it2 = arrayList.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next4 = null;
                            break;
                        }
                        next4 = it2.next();
                    } while (!((pl7) next4).m19388c().contains(strM22854b));
                    pl7Var2 = (pl7) next4;
                } else {
                    pl7Var2 = null;
                }
            } while (pl7Var2 == null);
        } while (!c3244l.m15570h(value, Boolean.valueOf(next != null)));
        C3244l c3244l2 = c1845b.f22494s;
        do {
            value2 = c3244l2.getValue();
            ((Boolean) value2).getClass();
            Iterator it3 = list.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
                ArrayList arrayList2 = ((ql7) next2).f57911h;
                if (arrayList2 != null) {
                    Iterator it4 = arrayList2.iterator();
                    do {
                        if (!it4.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it4.next();
                    } while (!((pl7) next3).m19388c().contains("special-welcome"));
                    pl7Var = (pl7) next3;
                } else {
                    pl7Var = null;
                }
            } while (pl7Var == null);
        } while (!c3244l2.m15570h(value2, Boolean.valueOf(next2 != null)));
        return xfa.f68157a;
    }
}
