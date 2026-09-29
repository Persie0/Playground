package com.lingq.feature.dictionary;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.bj3;
import p000.c32;
import p000.le2;
import p000.ma3;
import p000.u91;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.dictionary.DictionariesLocaleViewModel$uiState$1", m4291f = "DictionariesLocaleViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class DictionariesLocaleViewModel$uiState$1 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f25715a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ List f25716b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f25717c;

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        DictionariesLocaleViewModel$uiState$1 dictionariesLocaleViewModel$uiState$1 = new DictionariesLocaleViewModel$uiState$1(4, (Continuation) obj4);
        dictionariesLocaleViewModel$uiState$1.f25715a = zBooleanValue;
        dictionariesLocaleViewModel$uiState$1.f25716b = (List) obj2;
        dictionariesLocaleViewModel$uiState$1.f25717c = zBooleanValue2;
        return dictionariesLocaleViewModel$uiState$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.f25715a;
        List list = this.f25716b;
        boolean z2 = this.f25717c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new le2(u91.m22614f1(list, new ma3(14)), z, z2);
    }
}
