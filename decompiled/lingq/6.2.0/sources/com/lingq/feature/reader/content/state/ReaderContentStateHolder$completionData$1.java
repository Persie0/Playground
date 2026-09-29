package com.lingq.feature.reader.content.state;

import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.status.WordStatus;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.fa4;
import p000.ox7;
import p000.u91;
import p000.vz1;
import p000.xfa;
import p000.xz7;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.content.state.ReaderContentStateHolder$completionData$1", m4291f = "ReaderContentStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderContentStateHolder$completionData$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f27996a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Map f27997b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2264a f27998c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderContentStateHolder$completionData$1(C2264a c2264a, Continuation continuation) {
        super(3, continuation);
        this.f27998c = c2264a;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReaderContentStateHolder$completionData$1 readerContentStateHolder$completionData$1 = new ReaderContentStateHolder$completionData$1(this.f27998c, (Continuation) obj3);
        readerContentStateHolder$completionData$1.f27996a = (List) obj;
        readerContentStateHolder$completionData$1.f27997b = (Map) obj2;
        return readerContentStateHolder$completionData$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        List list = this.f27996a;
        Map map = this.f27997b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (!list.isEmpty() && !map.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Iterator it = ((ox7) list.get(i)).f55132e.iterator();
                while (true) {
                    obj2 = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    LessonWord lessonWord = (LessonWord) map.get(vz1.m23610P(((xz7) next).f69008e, this.f27998c.m9267i()));
                    if (fa4.m11650l(lessonWord != null ? lessonWord.f19322i : null, WordStatus.New.getValue())) {
                        obj2 = next;
                        break;
                    }
                }
                xz7 xz7Var = (xz7) obj2;
                if (xz7Var != null) {
                    return new Pair(Integer.valueOf(i), Integer.valueOf(xz7Var.f69009f));
                }
            }
            xz7 xz7Var2 = (xz7) u91.m22598P0(((ox7) u91.m22597O0(list)).f55132e);
            return new Pair(Integer.valueOf(list.size() - 1), Integer.valueOf(xz7Var2 != null ? xz7Var2.f69009f : 0));
        }
        return new Pair(-1, 0);
    }
}
