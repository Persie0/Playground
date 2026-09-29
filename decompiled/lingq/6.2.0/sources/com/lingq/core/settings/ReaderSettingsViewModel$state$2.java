package com.lingq.core.settings;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.cj3;
import p000.sz7;
import p000.u91;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.ReaderSettingsViewModel$state$2", m4291f = "ReaderSettingsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderSettingsViewModel$state$2 extends SuspendLambda implements cj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f22629a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ List f22630b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ List f22631c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Triple f22632d;

    @Override // p000.cj3
    /* JADX INFO: renamed from: i */
    public final Object mo1291i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ReaderSettingsViewModel$state$2 readerSettingsViewModel$state$2 = new ReaderSettingsViewModel$state$2(5, (Continuation) obj5);
        readerSettingsViewModel$state$2.f22629a = (List) obj;
        readerSettingsViewModel$state$2.f22630b = (List) obj2;
        readerSettingsViewModel$state$2.f22631c = (List) obj3;
        readerSettingsViewModel$state$2.f22632d = (Triple) obj4;
        return readerSettingsViewModel$state$2.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = this.f22629a;
        List list2 = this.f22630b;
        List list3 = this.f22631c;
        Triple triple = this.f22632d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new sz7(u91.m22603U0(list3, u91.m22603U0(list2, list)), (ViewKeys) triple.f47633a, (List) triple.f47634b, (Integer) triple.f47635c);
    }
}
