package com.amplitude.core;

import com.amplitude.android.C0879a;
import com.amplitude.android.C0880b;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.bl2;
import p000.c32;
import p000.dj9;
import p000.iz3;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.core.Amplitude$build$built$1", m4291f = "Amplitude.kt", m4292l = {181}, m4293m = "invokeSuspend")
final class Amplitude$build$built$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f11004a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0903a f11005b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0903a f11006c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Amplitude$build$built$1(AbstractC0903a abstractC0903a, AbstractC0903a abstractC0903a2, Continuation continuation) {
        super(2, continuation);
        this.f11005b = abstractC0903a;
        this.f11006c = abstractC0903a2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Amplitude$build$built$1(this.f11005b, this.f11006c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((Amplitude$build$built$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC0903a abstractC0903a = this.f11005b;
        C0880b c0880b = abstractC0903a.f11016a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f11004a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            dj9 dj9Var = c0880b.f10801n;
            AbstractC0903a abstractC0903a2 = this.f11006c;
            abstractC0903a.f11024i = dj9Var.mo10416e(abstractC0903a2);
            C0879a c0879a = (C0879a) abstractC0903a;
            C0880b c0880b2 = c0879a.f11016a;
            iz3 iz3Var = new iz3(c0880b2.f10792e, c0880b2.f10788a, c0880b2.f10802o, c0880b2.m5061a(), "identity", c0880b2.f10794g.m5104a(c0879a));
            c0880b.f10802o.getClass();
            abstractC0903a.f11025j = new bl2(iz3Var);
            this.f11004a = 1;
            if (C0879a.m5059m((C0879a) abstractC0903a2, iz3Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return Boolean.TRUE;
    }
}
