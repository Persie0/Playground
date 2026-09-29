package com.lingq.core.data.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.lingq.core.data.repository.C1294j;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.lg5;
import p000.og5;
import p000.oo4;
import p000.sz1;

/* JADX INFO: loaded from: classes2.dex */
public final class AppUsageUpdateWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public final oo4 f16592g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppUsageUpdateWorker(Context context, WorkerParameters workerParameters, oo4 oo4Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        oo4Var.getClass();
        this.f16592g = oo4Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    public final Object mo2213d(Continuation continuation) throws Throwable {
        AppUsageUpdateWorker$doWork$1 appUsageUpdateWorker$doWork$1;
        String strM21787e;
        String strM21787e2;
        if (continuation instanceof AppUsageUpdateWorker$doWork$1) {
            appUsageUpdateWorker$doWork$1 = (AppUsageUpdateWorker$doWork$1) continuation;
            int i = appUsageUpdateWorker$doWork$1.f16595c;
            if ((i & Integer.MIN_VALUE) != 0) {
                appUsageUpdateWorker$doWork$1.f16595c = i - Integer.MIN_VALUE;
            } else {
                appUsageUpdateWorker$doWork$1 = new AppUsageUpdateWorker$doWork$1(this, (ContinuationImpl) continuation);
            }
        } else {
            appUsageUpdateWorker$doWork$1 = new AppUsageUpdateWorker$doWork$1(this, (ContinuationImpl) continuation);
        }
        AppUsageUpdateWorker$doWork$1 appUsageUpdateWorker$doWork$2 = appUsageUpdateWorker$doWork$1;
        Object obj = appUsageUpdateWorker$doWork$2.f16593a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = appUsageUpdateWorker$doWork$2.f16595c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                WorkerParameters workerParameters = this.f56132b;
                int i3 = workerParameters.f7167c;
                sz1 sz1Var = workerParameters.f7166b;
                if (i3 <= 3 && (strM21787e = sz1Var.m21787e("language")) != null && (strM21787e2 = sz1Var.m21787e("stat")) != null) {
                    double dM21784b = sz1Var.m21784b("value");
                    Integer num = new Integer(sz1Var.m21785c("lessonId", -1));
                    Integer num2 = num.intValue() > 0 ? num : null;
                    oo4 oo4Var = this.f16592g;
                    appUsageUpdateWorker$doWork$2.f16595c = 1;
                    if (((C1294j) oo4Var).m7241o(strM21787e, strM21787e2, dM21784b, num2, appUsageUpdateWorker$doWork$2) == coroutineSingletons) {
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
            return new lg5();
        }
    }
}
