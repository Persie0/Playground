package com.lingq.core.settings;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.SettingsScreenKt$SettingsRoute$1$1", m4291f = "SettingsScreen.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class SettingsScreenKt$SettingsRoute$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1873e f22692a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsScreenKt$SettingsRoute$1$1(C1873e c1873e, Continuation continuation) {
        super(2, continuation);
        this.f22692a = c1873e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SettingsScreenKt$SettingsRoute$1$1(this.f22692a, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        SettingsScreenKt$SettingsRoute$1$1 settingsScreenKt$SettingsRoute$1$1 = (SettingsScreenKt$SettingsRoute$1$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        settingsScreenKt$SettingsRoute$1$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        this.f22692a.f22970j.m14759a();
        return xfa.f68157a;
    }
}
