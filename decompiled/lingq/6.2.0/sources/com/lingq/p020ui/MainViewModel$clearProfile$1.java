package com.lingq.p020ui;

import com.lingq.core.datastore.C1369b;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.nm7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.ui.MainViewModel$clearProfile$1", m4291f = "MainViewModel.kt", m4292l = {311}, m4293m = "invokeSuspend", m4294v = 2)
final class MainViewModel$clearProfile$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f34120a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2889e f34121b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$clearProfile$1(C2889e c2889e, Continuation continuation) {
        super(2, continuation);
        this.f34121b = c2889e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainViewModel$clearProfile$1(this.f34121b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((MainViewModel$clearProfile$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f34120a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            nm7 nm7Var = this.f34121b.f34215q;
            this.f34120a = 1;
            if (((C1369b) nm7Var).m7914a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
