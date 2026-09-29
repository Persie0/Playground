package com.lingq.core.settings;

import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.bj3;
import p000.c32;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.SettingsViewModel$settingsUiState$3", m4291f = "SettingsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class SettingsViewModel$settingsUiState$3 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f22708a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f22709b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Set f22710c;

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        SettingsViewModel$settingsUiState$3 settingsViewModel$settingsUiState$3 = new SettingsViewModel$settingsUiState$3(4, (Continuation) obj4);
        settingsViewModel$settingsUiState$3.f22708a = zBooleanValue;
        settingsViewModel$settingsUiState$3.f22709b = zBooleanValue2;
        settingsViewModel$settingsUiState$3.f22710c = (Set) obj3;
        return settingsViewModel$settingsUiState$3.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.f22708a;
        boolean z2 = this.f22709b;
        Set set = this.f22710c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new Triple(Boolean.valueOf(z), Boolean.valueOf(z2), set);
    }
}
