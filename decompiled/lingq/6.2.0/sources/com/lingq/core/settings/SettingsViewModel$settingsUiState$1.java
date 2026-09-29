package com.lingq.core.settings;

import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.user.Profile;
import com.lingq.core.domain.model.user.SubscriptionDetails;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.cj3;
import p000.j09;
import p000.kz1;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.SettingsViewModel$settingsUiState$1", m4291f = "SettingsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class SettingsViewModel$settingsUiState$1 extends SuspendLambda implements cj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Profile f22700a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ SubscriptionDetails f22701b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Language f22702c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ kz1 f22703d;

    @Override // p000.cj3
    /* JADX INFO: renamed from: i */
    public final Object mo1291i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        SettingsViewModel$settingsUiState$1 settingsViewModel$settingsUiState$1 = new SettingsViewModel$settingsUiState$1(5, (Continuation) obj5);
        settingsViewModel$settingsUiState$1.f22700a = (Profile) obj;
        settingsViewModel$settingsUiState$1.f22701b = (SubscriptionDetails) obj2;
        settingsViewModel$settingsUiState$1.f22702c = (Language) obj3;
        settingsViewModel$settingsUiState$1.f22703d = (kz1) obj4;
        return settingsViewModel$settingsUiState$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Profile profile = this.f22700a;
        SubscriptionDetails subscriptionDetails = this.f22701b;
        Language language = this.f22702c;
        kz1 kz1Var = this.f22703d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new j09(profile, subscriptionDetails, language, kz1Var);
    }
}
