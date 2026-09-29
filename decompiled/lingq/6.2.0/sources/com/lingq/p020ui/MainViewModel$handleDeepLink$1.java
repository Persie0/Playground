package com.lingq.p020ui;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.aj3;
import p000.c32;
import p000.s32;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.ui.MainViewModel$handleDeepLink$1", m4291f = "MainViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class MainViewModel$handleDeepLink$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ String f34122a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f34123b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2889e f34124c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$handleDeepLink$1(C2889e c2889e, Continuation continuation) {
        super(3, continuation);
        this.f34124c = c2889e;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        MainViewModel$handleDeepLink$1 mainViewModel$handleDeepLink$1 = new MainViewModel$handleDeepLink$1(this.f34124c, (Continuation) obj3);
        mainViewModel$handleDeepLink$1.f34122a = (String) obj;
        mainViewModel$handleDeepLink$1.f34123b = zBooleanValue;
        return mainViewModel$handleDeepLink$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        String str = this.f34122a;
        boolean z = this.f34123b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (str == null) {
            return null;
        }
        C3244l c3244l = this.f34124c.f34196F;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, null));
        return new s32(str, z);
    }
}
