package com.lingq.feature.reader.reader;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$observeSentenceTranslationAutoShow$1", m4291f = "ReaderComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderComposeViewModel$observeSentenceTranslationAutoShow$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f30063a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f30064b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ReaderComposeViewModel$observeSentenceTranslationAutoShow$1 readerComposeViewModel$observeSentenceTranslationAutoShow$1 = new ReaderComposeViewModel$observeSentenceTranslationAutoShow$1(3, (Continuation) obj3);
        readerComposeViewModel$observeSentenceTranslationAutoShow$1.f30063a = (List) obj;
        readerComposeViewModel$observeSentenceTranslationAutoShow$1.f30064b = zBooleanValue;
        return readerComposeViewModel$observeSentenceTranslationAutoShow$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = this.f30063a;
        boolean z = this.f30064b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new Pair(list, Boolean.valueOf(z));
    }
}
