package com.lingq.core.settings;

import com.lingq.core.domain.model.theme.LqTheme;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.SettingsProvider$observePreferences$1", m4291f = "SettingsProvider.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class SettingsProvider$observePreferences$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ LqTheme f22685a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ String f22686b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SettingsProvider$observePreferences$1 settingsProvider$observePreferences$1 = new SettingsProvider$observePreferences$1(3, (Continuation) obj3);
        settingsProvider$observePreferences$1.f22685a = (LqTheme) obj;
        settingsProvider$observePreferences$1.f22686b = (String) obj2;
        return settingsProvider$observePreferences$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        LqTheme lqTheme = this.f22685a;
        String str = this.f22686b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new Pair(lqTheme, str);
    }
}
