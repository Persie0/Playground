package com.lingq.core.database.dao;

import androidx.room.util.AbstractC0758a;
import com.lingq.core.database.entity.LessonBookmarkEntity;
import com.lingq.core.database.entity.LessonsSimplifiedJoin;
import com.lingq.core.database.entity.TranslationSentenceEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.bq1;
import p000.i93;
import p000.mv0;
import p000.q05;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.database.dao.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1320h extends bq1 {
    /* JADX INFO: renamed from: A0 */
    public abstract Object mo7484A0(int i, ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: B0 */
    public abstract Object mo7485B0(int i, int i2, ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: C0 */
    public abstract Object mo7486C0(int i, ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: D0 */
    public abstract i93 mo7487D0(int i);

    /* JADX INFO: renamed from: E0 */
    public abstract i93 mo7488E0(int i, List list);

    /* JADX INFO: renamed from: F0 */
    public abstract Object mo7489F0(LessonBookmarkEntity lessonBookmarkEntity, ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: G0 */
    public abstract Object mo7490G0(List list, ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: H0 */
    public abstract Object mo7491H0(List list, SuspendLambda suspendLambda);

    /* JADX INFO: renamed from: I0 */
    public abstract Object mo7492I0(LessonsSimplifiedJoin lessonsSimplifiedJoin, ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: J0 */
    public abstract Object mo7493J0(List list, SuspendLambda suspendLambda);

    /* JADX INFO: renamed from: K0 */
    public abstract Object mo7494K0(ArrayList arrayList, SuspendLambda suspendLambda);

    /* JADX INFO: renamed from: L0 */
    public abstract Object mo7495L0(List list, ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: M0 */
    public abstract Object mo7496M0(ArrayList arrayList, ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: N0 */
    public abstract Object mo7497N0(TranslationSentenceEntity translationSentenceEntity, ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: O0 */
    public abstract Object mo7498O0(List list, ContinuationImpl continuationImpl);

    /* JADX WARN: Code duplicated, block: B:33:0x0093  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: y0 */
    public final Object m7499y0(int i, ContinuationImpl continuationImpl) throws Throwable {
        LessonDao$clearLessonData$1 lessonDao$clearLessonData$1;
        Object objM2861d;
        if (continuationImpl instanceof LessonDao$clearLessonData$1) {
            lessonDao$clearLessonData$1 = (LessonDao$clearLessonData$1) continuationImpl;
            int i2 = lessonDao$clearLessonData$1.f16969d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lessonDao$clearLessonData$1.f16969d = i2 - Integer.MIN_VALUE;
            } else {
                lessonDao$clearLessonData$1 = new LessonDao$clearLessonData$1(this, continuationImpl);
            }
        } else {
            lessonDao$clearLessonData$1 = new LessonDao$clearLessonData$1(this, continuationImpl);
        }
        Object obj = lessonDao$clearLessonData$1.f16967b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = lessonDao$clearLessonData$1.f16969d;
        xfa xfaVar = xfa.f68157a;
        if (i3 == 0) {
            AbstractC3193b.m15359b(obj);
            lessonDao$clearLessonData$1.f16966a = i;
            lessonDao$clearLessonData$1.f16969d = 1;
            Object objM2861d2 = AbstractC0758a.m2861d(new mv0(i, 8), ((q05) this).f57071K, lessonDao$clearLessonData$1, false, true);
            if (objM2861d2 != coroutineSingletons) {
                objM2861d2 = xfaVar;
            }
            if (objM2861d2 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            i = lessonDao$clearLessonData$1.f16966a;
            AbstractC3193b.m15359b(obj);
        } else if (i3 == 2) {
            i = lessonDao$clearLessonData$1.f16966a;
            AbstractC3193b.m15359b(obj);
            lessonDao$clearLessonData$1.f16966a = i;
            lessonDao$clearLessonData$1.f16969d = 3;
            objM2861d = AbstractC0758a.m2861d(new mv0(i, 10), ((q05) this).f57071K, lessonDao$clearLessonData$1, false, true);
            if (objM2861d != coroutineSingletons) {
                objM2861d = xfaVar;
            }
            if (objM2861d != coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfaVar;
        lessonDao$clearLessonData$1.f16966a = i;
        lessonDao$clearLessonData$1.f16969d = 2;
        Object objM2861d3 = AbstractC0758a.m2861d(new mv0(i, 11), ((q05) this).f57071K, lessonDao$clearLessonData$1, false, true);
        if (objM2861d3 != coroutineSingletons) {
            objM2861d3 = xfaVar;
        }
        if (objM2861d3 != coroutineSingletons) {
            lessonDao$clearLessonData$1.f16966a = i;
            lessonDao$clearLessonData$1.f16969d = 3;
            objM2861d = AbstractC0758a.m2861d(new mv0(i, 10), ((q05) this).f57071K, lessonDao$clearLessonData$1, false, true);
            if (objM2861d != coroutineSingletons) {
                objM2861d = xfaVar;
            }
            if (objM2861d != coroutineSingletons) {
                return xfaVar;
            }
        }
        return coroutineSingletons;
    }

    /* JADX INFO: renamed from: z0 */
    public abstract Object mo7500z0(int i, ContinuationImpl continuationImpl);
}
