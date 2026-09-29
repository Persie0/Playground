package com.lingq.core.premium.delegate;

import android.os.Bundle;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.data.profile.C1267a;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import org.joda.time.DateTime;
import p000.C3386nv;
import p000.c32;
import p000.km7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.premium.delegate.UpgradeDelegateImpl$offer$1", m4291f = "UpgradeDelegate.kt", m4292l = {491}, m4293m = "invokeSuspend", m4294v = 2)
final class UpgradeDelegateImpl$offer$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22448a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1845b f22449b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f22450c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeDelegateImpl$offer$1(C1845b c1845b, int i, Continuation continuation) {
        super(2, continuation);
        this.f22449b = c1845b;
        this.f22450c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UpgradeDelegateImpl$offer$1(this.f22449b, this.f22450c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((UpgradeDelegateImpl$offer$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        C1845b c1845b = this.f22449b;
        C3244l c3244l = c1845b.f22464D;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22448a;
        int i2 = this.f22450c;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, new Pair(Boolean.TRUE, new Integer(i2))));
            km7 km7Var = c1845b.f22477b;
            long jMo18366b = new DateTime().mo18366b() / 1000;
            this.f22448a = 1;
            obj = ((C1267a) km7Var).m7075d(i2, jMo18366b, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        do {
            value2 = c3244l.getValue();
        } while (!c3244l.m15570h(value2, new Pair(Boolean.FALSE, new Integer(i2))));
        xfa xfaVar = xfa.f68157a;
        if (!zBooleanValue) {
            c1845b.f22468H.mo4677k(xfaVar);
            return xfaVar;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("LingQs Added", i2);
        ((C1240a) c1845b.f22478c).m7025f("Add More LingQs", bundle);
        c1845b.f22466F.mo4677k(new Integer(i2));
        return xfaVar;
    }
}
