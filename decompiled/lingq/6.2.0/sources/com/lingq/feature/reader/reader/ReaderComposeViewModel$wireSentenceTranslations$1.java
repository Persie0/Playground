package com.lingq.feature.reader.reader;

import com.lingq.feature.reader.content.C2260a;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.xfa;
import p000.yz4;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$wireSentenceTranslations$1", m4291f = "ReaderComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderComposeViewModel$wireSentenceTranslations$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f30142a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2493a f30143b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderComposeViewModel$wireSentenceTranslations$1(C2493a c2493a, Continuation continuation) {
        super(2, continuation);
        this.f30143b = c2493a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReaderComposeViewModel$wireSentenceTranslations$1 readerComposeViewModel$wireSentenceTranslations$1 = new ReaderComposeViewModel$wireSentenceTranslations$1(this.f30143b, continuation);
        readerComposeViewModel$wireSentenceTranslations$1.f30142a = obj;
        return readerComposeViewModel$wireSentenceTranslations$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReaderComposeViewModel$wireSentenceTranslations$1 readerComposeViewModel$wireSentenceTranslations$1 = (ReaderComposeViewModel$wireSentenceTranslations$1) create((Map) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerComposeViewModel$wireSentenceTranslations$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Map map = (Map) this.f30142a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2260a c2260a = this.f30143b.f30212e;
        c2260a.getClass();
        map.getClass();
        C3244l c3244l = c2260a.f27949o;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, yz4.m25387a((yz4) value, null, null, null, null, null, null, false, null, false, false, null, null, null, 0, 0, false, map, null, false, false, null, 0, false, 8323071)));
        return xfa.f68157a;
    }
}
