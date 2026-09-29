package com.lingq.feature.widget.streak;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.lingq.core.data.repository.C1294j;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.do7;
import p000.h0a;
import p000.j4b;
import p000.ky1;
import p000.lg5;
import p000.mg5;
import p000.og5;
import p000.oo4;
import p000.sm5;

/* JADX INFO: loaded from: classes2.dex */
public final class StreakDataUpdateWorker extends CoroutineWorker {
    public static final C2870a Companion = new C2870a();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreakDataUpdateWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    public final Object mo2213d(Continuation continuation) throws Throwable {
        StreakDataUpdateWorker$doWork$1 streakDataUpdateWorker$doWork$1;
        if (continuation instanceof StreakDataUpdateWorker$doWork$1) {
            streakDataUpdateWorker$doWork$1 = (StreakDataUpdateWorker$doWork$1) continuation;
            int i = streakDataUpdateWorker$doWork$1.f33867c;
            if ((i & Integer.MIN_VALUE) != 0) {
                streakDataUpdateWorker$doWork$1.f33867c = i - Integer.MIN_VALUE;
            } else {
                streakDataUpdateWorker$doWork$1 = new StreakDataUpdateWorker$doWork$1(this, (ContinuationImpl) continuation);
            }
        } else {
            streakDataUpdateWorker$doWork$1 = new StreakDataUpdateWorker$doWork$1(this, (ContinuationImpl) continuation);
        }
        Object obj = streakDataUpdateWorker$doWork$1.f33865a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = streakDataUpdateWorker$doWork$1.f33867c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                WorkerParameters workerParameters = this.f56132b;
                if (workerParameters.f7167c > 3) {
                    return new lg5();
                }
                Context context = this.f56131a;
                context.getClass();
                j4b j4bVar = (j4b) do7.m10537m(context, j4b.class);
                String strM21787e = workerParameters.f7166b.m21787e("language");
                if (strM21787e == null) {
                    return new lg5();
                }
                oo4 oo4Var = (oo4) ((ky1) j4bVar).f48650U.get();
                streakDataUpdateWorker$doWork$1.f33867c = 1;
                if (((C1294j) oo4Var).m7233g(strM21787e, streakDataUpdateWorker$doWork$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return og5.m17981a();
        } catch (Throwable th) {
            sm5.Companion.getClass();
            h0a.f41641a.mo11432c(th);
            return new mg5();
        }
    }
}
