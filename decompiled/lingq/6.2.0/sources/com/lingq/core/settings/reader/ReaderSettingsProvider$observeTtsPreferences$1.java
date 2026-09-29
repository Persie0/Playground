package com.lingq.core.settings.reader;

import com.lingq.core.domain.model.user.Profile;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.rz7;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.reader.ReaderSettingsProvider$observeTtsPreferences$1", m4291f = "ReaderSettingsProvider.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderSettingsProvider$observeTtsPreferences$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ rz7 f23049a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Profile f23050b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReaderSettingsProvider$observeTtsPreferences$1 readerSettingsProvider$observeTtsPreferences$1 = new ReaderSettingsProvider$observeTtsPreferences$1(3, (Continuation) obj3);
        readerSettingsProvider$observeTtsPreferences$1.f23049a = (rz7) obj;
        readerSettingsProvider$observeTtsPreferences$1.f23050b = (Profile) obj2;
        return readerSettingsProvider$observeTtsPreferences$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        rz7 rz7Var = this.f23049a;
        Profile profile = this.f23050b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (profile == null) {
            profile = null;
        }
        String str = profile != null ? profile.f19666o : null;
        if (str == null) {
            str = "";
        }
        return new Pair(rz7Var, str);
    }
}
