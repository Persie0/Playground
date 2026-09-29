package com.lingq.feature.reader.video.state;

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
import p000.e37;
import p000.fa4;
import p000.q7b;
import p000.u91;
import p000.vz1;
import p000.xfa;
import p000.xz7;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.state.VideoContentStateHolder$completionData$1", m4291f = "VideoContentStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class VideoContentStateHolder$completionData$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f31461a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Map f31462b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2595a f31463c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoContentStateHolder$completionData$1(C2595a c2595a, Continuation continuation) {
        super(3, continuation);
        this.f31463c = c2595a;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        VideoContentStateHolder$completionData$1 videoContentStateHolder$completionData$1 = new VideoContentStateHolder$completionData$1(this.f31463c, (Continuation) obj3);
        videoContentStateHolder$completionData$1.f31461a = (List) obj;
        videoContentStateHolder$completionData$1.f31462b = (Map) obj2;
        return videoContentStateHolder$completionData$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        xz7 xz7Var;
        Object obj2;
        List list = this.f31461a;
        Map map = this.f31462b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        int i = 0;
        if (!list.isEmpty() && !map.isEmpty()) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Iterator it = ((e37) list.get(i2)).f36655d.iterator();
                while (true) {
                    obj2 = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    LessonWord lessonWord = (LessonWord) map.get(vz1.m23610P(((q7b) next).f57357a.f69008e, this.f31463c.m9521c()));
                    if (fa4.m11650l(lessonWord != null ? lessonWord.f19322i : null, WordStatus.New.getValue())) {
                        obj2 = next;
                        break;
                    }
                }
                q7b q7bVar = (q7b) obj2;
                if (q7bVar != null) {
                    return new Pair(Integer.valueOf(i2), Integer.valueOf(q7bVar.f57357a.f69009f));
                }
            }
            q7b q7bVar2 = (q7b) u91.m22598P0(((e37) u91.m22597O0(list)).f36655d);
            Integer numValueOf = Integer.valueOf(list.size() - 1);
            if (q7bVar2 != null && (xz7Var = q7bVar2.f57357a) != null) {
                i = xz7Var.f69009f;
            }
            return new Pair(numValueOf, Integer.valueOf(i));
        }
        return new Pair(-1, 0);
    }
}
