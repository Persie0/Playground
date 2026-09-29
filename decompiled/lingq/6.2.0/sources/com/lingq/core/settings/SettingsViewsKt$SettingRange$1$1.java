package com.lingq.core.settings;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.oq7;
import p000.t66;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.SettingsViewsKt$SettingRange$1$1", m4291f = "SettingsViews.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class SettingsViewsKt$SettingRange$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zi3 f22717a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ oq7 f22718b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f22719c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsViewsKt$SettingRange$1$1(zi3 zi3Var, oq7 oq7Var, t66 t66Var, Continuation continuation) {
        super(2, continuation);
        this.f22717a = zi3Var;
        this.f22718b = oq7Var;
        this.f22719c = t66Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SettingsViewsKt$SettingRange$1$1(this.f22717a, this.f22718b, this.f22719c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        SettingsViewsKt$SettingRange$1$1 settingsViewsKt$SettingRange$1$1 = (SettingsViewsKt$SettingRange$1$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        settingsViewsKt$SettingRange$1$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        t66 t66Var = this.f22719c;
        boolean zBooleanValue = ((Boolean) t66Var.getValue()).booleanValue();
        xfa xfaVar = xfa.f68157a;
        if (!zBooleanValue) {
            return xfaVar;
        }
        oq7 oq7Var = this.f22718b;
        this.f22717a.invoke(new Integer((int) oq7Var.f54738d.m19861h()), new Integer((int) oq7Var.f54739e.m19861h()));
        t66Var.setValue(Boolean.FALSE);
        return xfaVar;
    }
}
