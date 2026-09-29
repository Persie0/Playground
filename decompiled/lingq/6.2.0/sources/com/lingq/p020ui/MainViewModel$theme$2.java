package com.lingq.p020ui;

import com.lingq.core.domain.model.theme.LqTheme;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.ui.MainViewModel$theme$2", m4291f = "MainViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class MainViewModel$theme$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f34158a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2889e f34159b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$theme$2(C2889e c2889e, Continuation continuation) {
        super(2, continuation);
        this.f34159b = c2889e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MainViewModel$theme$2 mainViewModel$theme$2 = new MainViewModel$theme$2(this.f34159b, continuation);
        mainViewModel$theme$2.f34158a = obj;
        return mainViewModel$theme$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        MainViewModel$theme$2 mainViewModel$theme$2 = (MainViewModel$theme$2) create((LqTheme) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        mainViewModel$theme$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        LqTheme lqTheme = (LqTheme) this.f34158a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        this.f34159b.f34220v = lqTheme;
        return xfa.f68157a;
    }
}
