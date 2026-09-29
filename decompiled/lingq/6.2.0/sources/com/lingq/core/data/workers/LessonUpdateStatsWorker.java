package com.lingq.core.data.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.lingq.core.data.repository.C1295k;
import com.lingq.core.network.api.requests.RequestLessonUpdateStats;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.d65;
import p000.fa4;
import p000.lg5;
import p000.mg5;
import p000.og5;
import p000.sz1;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
public final class LessonUpdateStatsWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public d65 f16758g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonUpdateStatsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    public final Object mo2213d(Continuation continuation) throws Throwable {
        LessonUpdateStatsWorker$doWork$1 lessonUpdateStatsWorker$doWork$1;
        String strM21787e;
        if (continuation instanceof LessonUpdateStatsWorker$doWork$1) {
            lessonUpdateStatsWorker$doWork$1 = (LessonUpdateStatsWorker$doWork$1) continuation;
            int i = lessonUpdateStatsWorker$doWork$1.f16761c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lessonUpdateStatsWorker$doWork$1.f16761c = i - Integer.MIN_VALUE;
            } else {
                lessonUpdateStatsWorker$doWork$1 = new LessonUpdateStatsWorker$doWork$1(this, (ContinuationImpl) continuation);
            }
        } else {
            lessonUpdateStatsWorker$doWork$1 = new LessonUpdateStatsWorker$doWork$1(this, (ContinuationImpl) continuation);
        }
        Object obj = lessonUpdateStatsWorker$doWork$1.f16759a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = lessonUpdateStatsWorker$doWork$1.f16761c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                WorkerParameters workerParameters = this.f56132b;
                int i3 = workerParameters.f7167c;
                sz1 sz1Var = workerParameters.f7166b;
                if (i3 <= 3 && (strM21787e = sz1Var.m21787e("language")) != null) {
                    int iM21785c = sz1Var.m21785c("lessonId", 0);
                    double dM21784b = sz1Var.m21784b("listenTimes");
                    double dM21784b2 = sz1Var.m21784b("readTimes");
                    boolean zM21783a = sz1Var.m21783a("automatic", false);
                    String strM21787e2 = sz1Var.m21787e("creationDate");
                    d65 d65Var = this.f16758g;
                    if (d65Var == null) {
                        fa4.m11636J("lessonRepository");
                        throw null;
                    }
                    lessonUpdateStatsWorker$doWork$1.f16761c = 1;
                    Object objM14904l = ((C1295k) d65Var).f16502f.m14904l(strM21787e, new Integer(iM21785c), new RequestLessonUpdateStats(dM21784b2, dM21784b, zM21783a, strM21787e2), lessonUpdateStatsWorker$doWork$1);
                    if (objM14904l != coroutineSingletons) {
                        objM14904l = xfa.f68157a;
                    }
                    if (objM14904l == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return new lg5();
            }
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            return og5.m17981a();
        } catch (Throwable unused) {
            return new mg5();
        }
    }
}
