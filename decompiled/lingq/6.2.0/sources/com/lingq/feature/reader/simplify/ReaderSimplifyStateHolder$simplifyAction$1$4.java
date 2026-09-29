package com.lingq.feature.reader.simplify;

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
import p000.ox7;
import p000.pg9;
import p000.q79;
import p000.qw4;
import p000.s79;
import p000.u79;
import p000.w79;
import p000.wfb;
import p000.xfa;
import p000.y79;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.simplify.ReaderSimplifyStateHolder$simplifyAction$1$4", m4291f = "ReaderSimplifyStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderSimplifyStateHolder$simplifyAction$1$4 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Lesson f30447a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ List f30448b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ LessonInfo f30449c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ LessonsSimplified f30450d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Integer f30451e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2518a f30452f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderSimplifyStateHolder$simplifyAction$1$4(C2518a c2518a, Continuation continuation) {
        super(6, continuation);
        this.f30452f = c2518a;
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        ReaderSimplifyStateHolder$simplifyAction$1$4 readerSimplifyStateHolder$simplifyAction$1$4 = new ReaderSimplifyStateHolder$simplifyAction$1$4(this.f30452f, (Continuation) obj6);
        readerSimplifyStateHolder$simplifyAction$1$4.f30447a = (Lesson) obj;
        readerSimplifyStateHolder$simplifyAction$1$4.f30448b = (List) obj2;
        readerSimplifyStateHolder$simplifyAction$1$4.f30449c = (LessonInfo) obj3;
        readerSimplifyStateHolder$simplifyAction$1$4.f30450d = (LessonsSimplified) obj4;
        readerSimplifyStateHolder$simplifyAction$1$4.f30451e = (Integer) obj5;
        return readerSimplifyStateHolder$simplifyAction$1$4.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r0 <= 3000) goto L63;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Integer num;
        Lesson lesson = this.f30447a;
        List list = this.f30448b;
        LessonInfo lessonInfo = this.f30449c;
        LessonsSimplified lessonsSimplified = this.f30450d;
        Integer num2 = this.f30451e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        LessonSimplifiedOf lessonSimplifiedOf = lesson.f19137G;
        if (lessonSimplifiedOf != null) {
            num = new Integer(lessonSimplifiedOf.f19266c);
        } else {
            num = lessonsSimplified != null ? lessonsSimplified.f19330b : null;
        }
        if (num2 != null) {
            return new w79(num2.intValue());
        }
        if (lessonInfo == null && lessonsSimplified == null && lessonSimplifiedOf == null) {
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
            return q79.f57353a;
        }
        String str2 = lessonInfo != null ? lessonInfo.f19370f : null;
        LessonStatus lessonStatus = LessonStatus.INACESSIBLE_I;
        if (!fa4.m11650l(str2, lessonStatus.getValue())) {
            String str3 = lessonInfo != null ? lessonInfo.f19370f : null;
            LessonStatus lessonStatus2 = LessonStatus.INACESSIBLE;
            if (!fa4.m11650l(str3, lessonStatus2.getValue())) {
                String str4 = lessonInfo != null ? lessonInfo.f19361Q : null;
                LessonProcessingStatus lessonProcessingStatus = LessonProcessingStatus.AI;
                if (!fa4.m11650l(str4, lessonProcessingStatus.getValue())) {
                    if (!fa4.m11650l(lessonSimplifiedOf != null ? lessonSimplifiedOf.f19265b : null, lessonProcessingStatus.getValue())) {
                        if (!fa4.m11650l(lessonSimplifiedOf != null ? lessonSimplifiedOf.f19264a : null, lessonStatus.getValue())) {
                            if (!fa4.m11650l(lessonSimplifiedOf != null ? lessonSimplifiedOf.f19264a : null, lessonStatus2.getValue()) && (lessonsSimplified == null || !lessonsSimplified.f19331c)) {
                                if (num != null) {
                                    return new y79(num.intValue());
                                }
                            }
                        }
                    }
                }
            }
        }
        if (num != null) {
            int iIntValue = num.intValue();
            C2518a c2518a = this.f30452f;
            pg9 pg9Var = c2518a.f30505n;
            if (pg9Var == null || !pg9Var.mo4538b()) {
                c2518a.f30505n = wfb.m23926u(c2518a.f30501j, null, null, new ReaderSimplifyStateHolder$startSimplifyPolling$1(c2518a, iIntValue, null), 3);
            }
        }
        return u79.f63521a;
        return s79.f60490a;
    }
}
