package com.lingq.core.settings;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.bj3;
import p000.c32;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.ReaderSettingsViewModel$state$1", m4291f = "ReaderSettingsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderSettingsViewModel$state$1 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ ViewKeys f22626a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ List f22627b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Integer f22628c;

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        ReaderSettingsViewModel$state$1 readerSettingsViewModel$state$1 = new ReaderSettingsViewModel$state$1(4, (Continuation) obj4);
        readerSettingsViewModel$state$1.f22626a = (ViewKeys) obj;
        readerSettingsViewModel$state$1.f22627b = (List) obj2;
        readerSettingsViewModel$state$1.f22628c = (Integer) obj3;
        return readerSettingsViewModel$state$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ViewKeys viewKeys = this.f22626a;
        List list = this.f22627b;
        Integer num = this.f22628c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new Triple(viewKeys, list, num);
    }
}
