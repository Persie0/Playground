package com.lingq.feature.reader.old;

import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.status.WordStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.bj3;
import p000.c32;
import p000.fa4;
import p000.ox7;
import p000.xf0;
import p000.xfa;
import p000.yf0;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$bottomButtonState$1", m4291f = "ReaderPageViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageViewModel$bottomButtonState$1 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ ox7 f28650a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Map f28651b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Map f28652c;

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        ReaderPageViewModel$bottomButtonState$1 readerPageViewModel$bottomButtonState$1 = new ReaderPageViewModel$bottomButtonState$1(4, (Continuation) obj4);
        readerPageViewModel$bottomButtonState$1.f28650a = (ox7) obj;
        readerPageViewModel$bottomButtonState$1.f28651b = (Map) obj2;
        readerPageViewModel$bottomButtonState$1.f28652c = (Map) obj3;
        return readerPageViewModel$bottomButtonState$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ox7 ox7Var = this.f28650a;
        Map map = this.f28651b;
        Map map2 = this.f28652c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (!ox7Var.f55130c) {
            return xf0.f68147a;
        }
        int size = map.size();
        ArrayList arrayList = new ArrayList(map2.size());
        Iterator it = map2.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((LessonWord) ((Map.Entry) it.next()).getValue());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (fa4.m11650l(((LessonWord) obj2).f19322i, WordStatus.New.getValue())) {
                arrayList2.add(obj2);
            }
        }
        return new yf0(size, arrayList2.size());
    }
}
