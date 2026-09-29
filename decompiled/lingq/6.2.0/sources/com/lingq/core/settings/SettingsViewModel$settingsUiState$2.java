package com.lingq.core.settings;

import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.cj3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.SettingsViewModel$settingsUiState$2", m4291f = "SettingsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class SettingsViewModel$settingsUiState$2 extends SuspendLambda implements cj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f22704a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f22705b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ ViewKeys f22706c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ String f22707d;

    @Override // p000.cj3
    /* JADX INFO: renamed from: i */
    public final Object mo1291i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        SettingsViewModel$settingsUiState$2 settingsViewModel$settingsUiState$2 = new SettingsViewModel$settingsUiState$2(5, (Continuation) obj5);
        settingsViewModel$settingsUiState$2.f22704a = zBooleanValue;
        settingsViewModel$settingsUiState$2.f22705b = zBooleanValue2;
        settingsViewModel$settingsUiState$2.f22706c = (ViewKeys) obj3;
        settingsViewModel$settingsUiState$2.f22707d = (String) obj4;
        return settingsViewModel$settingsUiState$2.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.f22704a;
        boolean z2 = this.f22705b;
        ViewKeys viewKeys = this.f22706c;
        String str = this.f22707d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new Pair(new Pair(Boolean.valueOf(z), Boolean.valueOf(z2)), new Pair(viewKeys, str));
    }
}
