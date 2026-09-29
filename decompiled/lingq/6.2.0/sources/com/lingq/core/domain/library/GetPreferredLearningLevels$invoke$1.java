package com.lingq.core.domain.library;

import com.lingq.core.domain.model.LearningLevel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.domain.library.GetPreferredLearningLevels$invoke$1", m4291f = "GetPreferredLearningLevels.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class GetPreferredLearningLevels$invoke$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18778a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f18779b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPreferredLearningLevels$invoke$1(String str, Continuation continuation) {
        super(2, continuation);
        this.f18779b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetPreferredLearningLevels$invoke$1 getPreferredLearningLevels$invoke$1 = new GetPreferredLearningLevels$invoke$1(this.f18779b, continuation);
        getPreferredLearningLevels$invoke$1.f18778a = obj;
        return getPreferredLearningLevels$invoke$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((GetPreferredLearningLevels$invoke$1) create((Map) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Map map = (Map) this.f18778a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        Map map2 = (Map) map.get(this.f18779b);
        if (map2 == null) {
            return EmptyList.f47638a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map2.entrySet()) {
            if (((Boolean) entry.getValue()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((LearningLevel) ((Map.Entry) it.next()).getKey());
        }
        return arrayList;
    }
}
