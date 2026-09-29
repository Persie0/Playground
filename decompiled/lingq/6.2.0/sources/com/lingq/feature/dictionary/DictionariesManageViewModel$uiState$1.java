package com.lingq.feature.dictionary;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.dj3;
import p000.ef2;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.dictionary.DictionariesManageViewModel$uiState$1", m4291f = "DictionariesManageViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class DictionariesManageViewModel$uiState$1 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f25759a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ List f25760b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ List f25761c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ List f25762d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ String f25763e;

    public DictionariesManageViewModel$uiState$1(Continuation continuation) {
        super(6, continuation);
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        DictionariesManageViewModel$uiState$1 dictionariesManageViewModel$uiState$1 = new DictionariesManageViewModel$uiState$1((Continuation) obj6);
        dictionariesManageViewModel$uiState$1.f25759a = zBooleanValue;
        dictionariesManageViewModel$uiState$1.f25760b = (List) obj2;
        dictionariesManageViewModel$uiState$1.f25761c = (List) obj3;
        dictionariesManageViewModel$uiState$1.f25762d = (List) obj4;
        dictionariesManageViewModel$uiState$1.f25763e = (String) obj5;
        return dictionariesManageViewModel$uiState$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.f25759a;
        List list = this.f25760b;
        List list2 = this.f25761c;
        List list3 = this.f25762d;
        String str = this.f25763e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new ef2(list, list2, list3, str, z, 32);
    }
}
