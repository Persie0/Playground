package com.lingq.p020ui;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.ui.MainViewModel$intentData$1", m4291f = "MainViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class MainViewModel$intentData$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2889e f34125a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f34126b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$intentData$1(C2889e c2889e, String str, Continuation continuation) {
        super(2, continuation);
        this.f34125a = c2889e;
        this.f34126b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainViewModel$intentData$1(this.f34125a, this.f34126b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        MainViewModel$intentData$1 mainViewModel$intentData$1 = (MainViewModel$intentData$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        mainViewModel$intentData$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C3244l c3244l = this.f34125a.f34196F;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, this.f34126b));
        return xfa.f68157a;
    }
}
