package com.lingq.feature.reader.reader;

import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$observeSentenceTranslationAutoShow$2", m4291f = "ReaderComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderComposeViewModel$observeSentenceTranslationAutoShow$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f30065a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2493a f30066b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderComposeViewModel$observeSentenceTranslationAutoShow$2(C2493a c2493a, Continuation continuation) {
        super(2, continuation);
        this.f30066b = c2493a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReaderComposeViewModel$observeSentenceTranslationAutoShow$2 readerComposeViewModel$observeSentenceTranslationAutoShow$2 = new ReaderComposeViewModel$observeSentenceTranslationAutoShow$2(this.f30066b, continuation);
        readerComposeViewModel$observeSentenceTranslationAutoShow$2.f30065a = obj;
        return readerComposeViewModel$observeSentenceTranslationAutoShow$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReaderComposeViewModel$observeSentenceTranslationAutoShow$2 readerComposeViewModel$observeSentenceTranslationAutoShow$2 = (ReaderComposeViewModel$observeSentenceTranslationAutoShow$2) create((Pair) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerComposeViewModel$observeSentenceTranslationAutoShow$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Pair pair = (Pair) this.f30065a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        List list = (List) pair.f47623a;
        if (((Boolean) pair.f47624b).booleanValue()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f30066b.f30221k.m9275d(((Number) it.next()).intValue());
            }
        }
        return xfa.f68157a;
    }
}
