package com.lingq.feature.reader.video;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.qx8;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$observeSentenceTranslationSetting$3", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderVideoComposeViewModel$observeSentenceTranslationSetting$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2583a f31240a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderVideoComposeViewModel$observeSentenceTranslationSetting$3(C2583a c2583a, Continuation continuation) {
        super(2, continuation);
        this.f31240a = c2583a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderVideoComposeViewModel$observeSentenceTranslationSetting$3(this.f31240a, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        ReaderVideoComposeViewModel$observeSentenceTranslationSetting$3 readerVideoComposeViewModel$observeSentenceTranslationSetting$3 = (ReaderVideoComposeViewModel$observeSentenceTranslationSetting$3) create(bool, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerVideoComposeViewModel$observeSentenceTranslationSetting$3.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        LinkedHashMap linkedHashMap;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C3244l c3244l = this.f31240a.f31375h.f28149e;
        do {
            value = c3244l.getValue();
            Map map = (Map) value;
            linkedHashMap = new LinkedHashMap(AbstractC3194a.m15363P(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), qx8.m20194a((qx8) entry.getValue(), false, false, null, null, null, false, 62));
            }
        } while (!c3244l.m15570h(value, linkedHashMap));
        return xfa.f68157a;
    }
}
