package com.lingq.core.settings;

import com.lingq.core.domain.model.theme.LqTheme;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.q29;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.SettingsProvider$observePreferences$3", m4291f = "SettingsProvider.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class SettingsProvider$observePreferences$3 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Pair f22690a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Triple f22691b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SettingsProvider$observePreferences$3 settingsProvider$observePreferences$3 = new SettingsProvider$observePreferences$3(3, (Continuation) obj3);
        settingsProvider$observePreferences$3.f22690a = (Pair) obj;
        settingsProvider$observePreferences$3.f22691b = (Triple) obj2;
        return settingsProvider$observePreferences$3.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Pair pair = this.f22690a;
        Triple triple = this.f22691b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new q29((LqTheme) pair.f47623a, (String) pair.f47624b, ((Boolean) triple.f47633a).booleanValue(), (Map) triple.f47634b, ((Boolean) triple.f47635c).booleanValue());
    }
}
