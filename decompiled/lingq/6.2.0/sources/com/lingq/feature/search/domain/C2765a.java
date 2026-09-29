package com.lingq.feature.search.domain;

import com.lingq.core.data.repository.C1295k;
import com.lingq.core.data.repository.C1296l;
import com.lingq.core.domain.model.library.LessonInfo;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.d65;
import p000.y95;

/* JADX INFO: renamed from: com.lingq.feature.search.domain.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2765a {

    /* JADX INFO: renamed from: a */
    public final d65 f32828a;

    /* JADX INFO: renamed from: b */
    public final y95 f32829b;

    public C2765a(d65 d65Var, y95 y95Var) {
        d65Var.getClass();
        y95Var.getClass();
        this.f32828a = d65Var;
        this.f32829b = y95Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m9673a(int i, ContinuationImpl continuationImpl) throws Throwable {
        GetSearchLessonInfoUseCase$invoke$1 getSearchLessonInfoUseCase$invoke$1;
        if (continuationImpl instanceof GetSearchLessonInfoUseCase$invoke$1) {
            getSearchLessonInfoUseCase$invoke$1 = (GetSearchLessonInfoUseCase$invoke$1) continuationImpl;
            int i2 = getSearchLessonInfoUseCase$invoke$1.f32824d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getSearchLessonInfoUseCase$invoke$1.f32824d = i2 - Integer.MIN_VALUE;
            } else {
                getSearchLessonInfoUseCase$invoke$1 = new GetSearchLessonInfoUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getSearchLessonInfoUseCase$invoke$1 = new GetSearchLessonInfoUseCase$invoke$1(this, continuationImpl);
        }
        Object objM7245C = getSearchLessonInfoUseCase$invoke$1.f32822b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = getSearchLessonInfoUseCase$invoke$1.f32824d;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM7245C);
            getSearchLessonInfoUseCase$invoke$1.f32821a = i;
            getSearchLessonInfoUseCase$invoke$1.f32824d = 1;
            objM7245C = ((C1295k) this.f32828a).m7245C(i, getSearchLessonInfoUseCase$invoke$1);
            if (objM7245C != coroutineSingletons) {
            }
        }
        if (i3 != 1) {
            if (i3 == 2) {
                AbstractC3193b.m15359b(objM7245C);
                return objM7245C;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = getSearchLessonInfoUseCase$invoke$1.f32821a;
        AbstractC3193b.m15359b(objM7245C);
        LessonInfo lessonInfo = (LessonInfo) objM7245C;
        if (lessonInfo != null) {
            return lessonInfo;
        }
        getSearchLessonInfoUseCase$invoke$1.f32821a = i;
        getSearchLessonInfoUseCase$invoke$1.f32824d = 2;
        Object objM7313h = ((C1296l) this.f32829b).m7313h(i, getSearchLessonInfoUseCase$invoke$1);
        return objM7313h == coroutineSingletons ? coroutineSingletons : objM7313h;
    }
}
