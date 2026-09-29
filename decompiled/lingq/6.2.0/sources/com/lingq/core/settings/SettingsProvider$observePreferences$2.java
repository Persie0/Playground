package com.lingq.core.settings;

import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.bj3;
import p000.c32;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.SettingsProvider$observePreferences$2", m4291f = "SettingsProvider.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class SettingsProvider$observePreferences$2 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f22687a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Map f22688b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f22689c;

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        SettingsProvider$observePreferences$2 settingsProvider$observePreferences$2 = new SettingsProvider$observePreferences$2(4, (Continuation) obj4);
        settingsProvider$observePreferences$2.f22687a = zBooleanValue;
        settingsProvider$observePreferences$2.f22688b = (Map) obj2;
        settingsProvider$observePreferences$2.f22689c = zBooleanValue2;
        return settingsProvider$observePreferences$2.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.f22687a;
        Map map = this.f22688b;
        boolean z2 = this.f22689c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new Triple(Boolean.valueOf(z), map, Boolean.valueOf(z2));
    }
}
