package com.lingq.core.settings.theme;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.bj3;
import p000.c32;
import p000.mz9;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.theme.ThemeSettingsProvider$build$readingToggleSettings$1", m4291f = "ThemeSettingsState.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ThemeSettingsProvider$build$readingToggleSettings$1 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f23220a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f23221b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f23222c;

    public ThemeSettingsProvider$build$readingToggleSettings$1() {
        super(4, null);
    }

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        ThemeSettingsProvider$build$readingToggleSettings$1 themeSettingsProvider$build$readingToggleSettings$1 = new ThemeSettingsProvider$build$readingToggleSettings$1(4, (Continuation) obj4);
        themeSettingsProvider$build$readingToggleSettings$1.f23220a = zBooleanValue;
        themeSettingsProvider$build$readingToggleSettings$1.f23221b = zBooleanValue2;
        themeSettingsProvider$build$readingToggleSettings$1.f23222c = zBooleanValue3;
        return themeSettingsProvider$build$readingToggleSettings$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.f23220a;
        boolean z2 = this.f23221b;
        boolean z3 = this.f23222c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new mz9(z, z2, z3);
    }
}
