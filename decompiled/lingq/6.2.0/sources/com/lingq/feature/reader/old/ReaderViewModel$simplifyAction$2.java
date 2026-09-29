package com.lingq.feature.reader.old;

import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.domain.model.LearningLevel;
import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.domain.model.lesson.LessonProcessingStatus;
import com.lingq.core.domain.model.lesson.LessonSimplifiedOf;
import com.lingq.core.domain.model.lesson.LessonStatus;
import com.lingq.core.domain.model.lesson.LessonsSimplified;
import com.lingq.core.domain.model.library.LessonInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.dj3;
import p000.fa4;
import p000.lda;
import p000.ox7;
import p000.qw4;
import p000.r79;
import p000.t79;
import p000.v79;
import p000.x79;
import p000.xfa;
import p000.z79;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$simplifyAction$2", m4291f = "ReaderViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$simplifyAction$2 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Lesson f29082a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ List f29083b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ LessonInfo f29084c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ LessonsSimplified f29085d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Integer f29086e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2412n f29087f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$simplifyAction$2(C2412n c2412n, Continuation continuation) {
        super(6, continuation);
        this.f29087f = c2412n;
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        ReaderViewModel$simplifyAction$2 readerViewModel$simplifyAction$2 = new ReaderViewModel$simplifyAction$2(this.f29087f, (Continuation) obj6);
        readerViewModel$simplifyAction$2.f29082a = (Lesson) obj;
        readerViewModel$simplifyAction$2.f29083b = (List) obj2;
        readerViewModel$simplifyAction$2.f29084c = (LessonInfo) obj3;
        readerViewModel$simplifyAction$2.f29085d = (LessonsSimplified) obj4;
        readerViewModel$simplifyAction$2.f29086e = (Integer) obj5;
        return readerViewModel$simplifyAction$2.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        if (r0 <= 3000) goto L55;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Integer num;
        Lesson lesson = this.f29082a;
        List list = this.f29083b;
        LessonInfo lessonInfo = this.f29084c;
        LessonsSimplified lessonsSimplified = this.f29085d;
        Integer num2 = this.f29086e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        LessonSimplifiedOf lessonSimplifiedOf = lesson.f19137G;
        if (lessonSimplifiedOf != null) {
            num = new Integer(lessonSimplifiedOf.f19266c);
        } else {
            num = lessonsSimplified != null ? lessonsSimplified.f19330b : null;
        }
        LessonSimplifiedOf lessonSimplifiedOf2 = lesson.f19138H;
        if (lessonSimplifiedOf2 != null) {
            num2 = new Integer(lessonSimplifiedOf2.f19266c);
        }
        if (num2 != null) {
            return new x79(num2.intValue());
        }
        if (lessonInfo == null) {
            String str = lesson.f19159r;
            Iterator it = list.iterator();
            int size = 0;
            while (it.hasNext()) {
                size += ((ox7) it.next()).f55132e.size();
            }
            if (str != null) {
                LearningLevel.Companion.getClass();
                if (qw4.m20189b(str) > LearningLevel.Beginner2.ordinal()) {
                }
            }
            return r79.f58859a;
        }
        String str2 = lessonInfo.f19370f;
        LessonStatus lessonStatus = LessonStatus.INACESSIBLE_I;
        if (!fa4.m11650l(str2, lessonStatus.getValue())) {
            LessonStatus lessonStatus2 = LessonStatus.INACESSIBLE;
            if (!fa4.m11650l(str2, lessonStatus2.getValue())) {
                String str3 = lessonInfo.f19361Q;
                LessonProcessingStatus lessonProcessingStatus = LessonProcessingStatus.AI;
                if (!fa4.m11650l(str3, lessonProcessingStatus.getValue())) {
                    if (!fa4.m11650l(lessonSimplifiedOf != null ? lessonSimplifiedOf.f19265b : null, lessonProcessingStatus.getValue())) {
                        if (!fa4.m11650l(lessonSimplifiedOf != null ? lessonSimplifiedOf.f19264a : null, lessonStatus.getValue())) {
                            if (!fa4.m11650l(lessonSimplifiedOf != null ? lessonSimplifiedOf.f19264a : null, lessonStatus2.getValue()) && (lessonsSimplified == null || !lessonsSimplified.f19331c)) {
                                if (num != null) {
                                    return new z79(num.intValue());
                                }
                            }
                        }
                    }
                }
            }
        }
        if (num != null) {
            C2412n c2412n = this.f29087f;
            AbstractC1263a.m7047b(lda.m16103C(c2412n), c2412n.f29301O, "update simplify lesson", new ReaderViewModel$updateSimplifyLesson$1(c2412n, null));
        }
        return v79.f64982a;
        return t79.f61954a;
    }
}
