package com.lingq.core.data.repository;

import com.lingq.core.database.dao.AbstractC1320h;
import com.lingq.core.database.entity.LessonEntity;
import com.lingq.core.database.entity.LessonsSimplifiedJoin;
import com.lingq.core.domain.model.lesson.LessonProcessingStatus;
import com.lingq.core.domain.model.lesson.LessonStatus;
import com.lingq.core.network.api.result.ResultLesson;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.esc;
import p000.fa4;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl$syncLessonSimplify$2", m4291f = "LessonRepositoryImpl.kt", m4292l = {2096, 2098}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonRepositoryImpl$syncLessonSimplify$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f15559a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1295k f15560b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ResultLesson f15561c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f15562d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$syncLessonSimplify$2(C1295k c1295k, ResultLesson resultLesson, int i, Continuation continuation) {
        super(1, continuation);
        this.f15560b = c1295k;
        this.f15561c = resultLesson;
        this.f15562d = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LessonRepositoryImpl$syncLessonSimplify$2(this.f15560b, this.f15561c, this.f15562d, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((LessonRepositoryImpl$syncLessonSimplify$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        if (r0.mo7492I0(r9, r8) == r1) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC1320h abstractC1320h = this.f15560b.f16498b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f15559a;
        boolean z = true;
        ResultLesson resultLesson = this.f15561c;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            LessonEntity lessonEntityM11330b = esc.m11330b(resultLesson);
            this.f15559a = 1;
            if (abstractC1320h.mo4095v0(lessonEntityM11330b, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        int i2 = resultLesson.f20968a;
        String str = resultLesson.f20986j;
        Integer num = new Integer(i2);
        if (!fa4.m11650l(resultLesson.f21001q0, LessonProcessingStatus.AI.getValue()) && !fa4.m11650l(str, LessonStatus.INACESSIBLE_I.getValue()) && !fa4.m11650l(str, LessonStatus.INACESSIBLE.getValue())) {
            z = false;
        }
        LessonsSimplifiedJoin lessonsSimplifiedJoin = new LessonsSimplifiedJoin(this.f15562d, num, z);
        this.f15559a = 2;
    }
}
