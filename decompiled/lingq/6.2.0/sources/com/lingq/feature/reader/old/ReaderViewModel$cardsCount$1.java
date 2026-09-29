package com.lingq.feature.reader.old;

import com.lingq.core.domain.model.lesson.LessonCard;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$cardsCount$1", m4291f = "ReaderViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$cardsCount$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Map f28915a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Map f28916b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReaderViewModel$cardsCount$1 readerViewModel$cardsCount$1 = new ReaderViewModel$cardsCount$1(3, (Continuation) obj3);
        readerViewModel$cardsCount$1.f28915a = (Map) obj;
        readerViewModel$cardsCount$1.f28916b = (Map) obj2;
        return readerViewModel$cardsCount$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Map map = this.f28915a;
        Map map2 = this.f28916b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((LessonCard) entry.getValue()).m8040h()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        int size = linkedHashMap.size();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : map2.entrySet()) {
            if (((LessonCard) entry2.getValue()).m8040h()) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        return new Integer(linkedHashMap2.size() + size);
    }
}
