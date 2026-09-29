package com.lingq.feature.reader.reader;

import com.lingq.core.domain.model.lesson.LessonCard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.e65;
import p000.ox7;
import p000.vz1;
import p000.xfa;
import p000.yz4;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$sentenceReviewCount$1", m4291f = "ReaderComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderComposeViewModel$sentenceReviewCount$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Map f30081a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ yz4 f30082b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReaderComposeViewModel$sentenceReviewCount$1 readerComposeViewModel$sentenceReviewCount$1 = new ReaderComposeViewModel$sentenceReviewCount$1(3, (Continuation) obj3);
        readerComposeViewModel$sentenceReviewCount$1.f30081a = (Map) obj;
        readerComposeViewModel$sentenceReviewCount$1.f30082b = (yz4) obj2;
        return readerComposeViewModel$sentenceReviewCount$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Map map = this.f30081a;
        yz4 yz4Var = this.f30082b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        int i = yz4Var.f70680n;
        List list = yz4Var.f70670d;
        int i2 = 0;
        if (i < 0 || i >= list.size()) {
            return new Integer(0);
        }
        Iterable iterable = (List) e65.m10872d(((ox7) list.get(i)).f55128a, map);
        if (iterable == null) {
            iterable = EmptyList.f47638a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : iterable) {
            if (obj2 instanceof LessonCard) {
                arrayList.add(obj2);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((LessonCard) it.next()).m8040h() && (i2 = i2 + 1) < 0) {
                    vz1.m23626d0();
                    throw null;
                }
            }
        }
        return new Integer(i2);
    }
}
