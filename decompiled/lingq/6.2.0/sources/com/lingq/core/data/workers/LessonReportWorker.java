package com.lingq.core.data.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.lg5;
import p000.m68;
import p000.mg5;
import p000.og5;
import p000.sz1;

/* JADX INFO: loaded from: classes2.dex */
public final class LessonReportWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public final m68 f16742g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonReportWorker(Context context, WorkerParameters workerParameters, m68 m68Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        m68Var.getClass();
        this.f16742g = m68Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    public final Object mo2213d(Continuation continuation) throws Throwable {
        LessonReportWorker$doWork$1 lessonReportWorker$doWork$1;
        String strM21787e;
        String strM21787e2;
        if (continuation instanceof LessonReportWorker$doWork$1) {
            lessonReportWorker$doWork$1 = (LessonReportWorker$doWork$1) continuation;
            int i = lessonReportWorker$doWork$1.f16745c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lessonReportWorker$doWork$1.f16745c = i - Integer.MIN_VALUE;
            } else {
                lessonReportWorker$doWork$1 = new LessonReportWorker$doWork$1(this, (ContinuationImpl) continuation);
            }
        } else {
            lessonReportWorker$doWork$1 = new LessonReportWorker$doWork$1(this, (ContinuationImpl) continuation);
        }
        LessonReportWorker$doWork$1 lessonReportWorker$doWork$2 = lessonReportWorker$doWork$1;
        Object obj = lessonReportWorker$doWork$2.f16743a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = lessonReportWorker$doWork$2.f16745c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                WorkerParameters workerParameters = this.f56132b;
                int i3 = workerParameters.f7167c;
                sz1 sz1Var = workerParameters.f7166b;
                if (i3 <= 3 && (strM21787e = sz1Var.m21787e("language")) != null && (strM21787e2 = sz1Var.m21787e("scope")) != null) {
                    String strM21787e3 = sz1Var.m21787e("reason");
                    int iM21785c = sz1Var.m21785c("lessonId", 0);
                    m68 m68Var = this.f16742g;
                    lessonReportWorker$doWork$2.f16745c = 1;
                    if (m68Var.mo8941V(strM21787e, iM21785c, strM21787e2, strM21787e3, lessonReportWorker$doWork$2) == coroutineSingletons) {
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
