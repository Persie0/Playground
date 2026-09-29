package com.lingq.feature.reader.reader;

import com.lingq.core.domain.model.lesson.LessonCard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.ox7;
import p000.u91;
import p000.v91;
import p000.vz1;
import p000.xfa;
import p000.xz7;
import p000.yz4;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$pageReviewCards$1", m4291f = "ReaderComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderComposeViewModel$pageReviewCards$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Map f30073a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ yz4 f30074b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2493a f30075c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderComposeViewModel$pageReviewCards$1(C2493a c2493a, Continuation continuation) {
        super(3, continuation);
        this.f30075c = c2493a;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReaderComposeViewModel$pageReviewCards$1 readerComposeViewModel$pageReviewCards$1 = new ReaderComposeViewModel$pageReviewCards$1(this.f30075c, (Continuation) obj3);
        readerComposeViewModel$pageReviewCards$1.f30073a = (Map) obj;
        readerComposeViewModel$pageReviewCards$1.f30074b = (yz4) obj2;
        return readerComposeViewModel$pageReviewCards$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Map map = this.f30073a;
        yz4 yz4Var = this.f30074b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        int i = yz4Var.f70680n;
        List list = yz4Var.f70670d;
        if (i < 0 || i >= list.size()) {
            return AbstractC3194a.m15360M();
        }
        List list2 = ((ox7) list.get(i)).f55132e;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            String str = ((xz7) it.next()).f69008e;
            Locale localeForLanguageTag = Locale.forLanguageTag(this.f30075c.f30206b.mo4580K1());
            localeForLanguageTag.getClass();
            arrayList.add(vz1.m23610P(str, localeForLanguageTag));
        }
        Set setM22627s1 = u91.m22627s1(arrayList);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (setM22627s1.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (((LessonCard) entry2.getValue()).m8040h() && !((LessonCard) entry2.getValue()).f19182e) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        return linkedHashMap2;
    }
}
