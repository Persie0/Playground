package com.lingq.core.settings.theme;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.nz9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.theme.ThemeSettingsViewModel$3", m4291f = "ThemeSettingsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ThemeSettingsViewModel$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f23223a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1883c f23224b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeSettingsViewModel$3(C1883c c1883c, Continuation continuation) {
        super(2, continuation);
        this.f23224b = c1883c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ThemeSettingsViewModel$3 themeSettingsViewModel$3 = new ThemeSettingsViewModel$3(this.f23224b, continuation);
        themeSettingsViewModel$3.f23223a = obj;
        return themeSettingsViewModel$3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ThemeSettingsViewModel$3 themeSettingsViewModel$3 = (ThemeSettingsViewModel$3) create((nz9) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        themeSettingsViewModel$3.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        nz9 nz9Var = (nz9) this.f23223a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        this.f23224b.f23313n.m15571i(nz9Var);
        return xfa.f68157a;
    }
}
