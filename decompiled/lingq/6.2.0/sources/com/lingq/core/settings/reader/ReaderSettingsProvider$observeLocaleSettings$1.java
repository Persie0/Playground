package com.lingq.core.settings.reader;

import com.lingq.core.domain.model.user.Profile;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.reader.ReaderSettingsProvider$observeLocaleSettings$1", m4291f = "ReaderSettingsProvider.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderSettingsProvider$observeLocaleSettings$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f23036a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Profile f23037b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReaderSettingsProvider$observeLocaleSettings$1 readerSettingsProvider$observeLocaleSettings$1 = new ReaderSettingsProvider$observeLocaleSettings$1(3, (Continuation) obj3);
        readerSettingsProvider$observeLocaleSettings$1.f23036a = (List) obj;
        readerSettingsProvider$observeLocaleSettings$1.f23037b = (Profile) obj2;
        return readerSettingsProvider$observeLocaleSettings$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        List list = this.f23036a;
        Profile profile = this.f23037b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (profile == null) {
            profile = null;
        }
        if (profile == null || (obj2 = profile.f19669r) == null) {
            obj2 = EmptyList.f47638a;
        }
        return new Pair(list, obj2);
    }
}
