package com.lingq.core.data.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.lingq.core.data.repository.C1286b;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.fa4;
import p000.lg5;
import p000.mg5;
import p000.og5;
import p000.sz1;

/* JADX INFO: loaded from: classes2.dex */
public final class LessonUpdateBlacklistSourceWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public C1286b f16754g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonUpdateBlacklistSourceWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    public final Object mo2213d(Continuation continuation) throws Throwable {
        LessonUpdateBlacklistSourceWorker$doWork$1 lessonUpdateBlacklistSourceWorker$doWork$1;
        String strM21787e;
        if (continuation instanceof LessonUpdateBlacklistSourceWorker$doWork$1) {
            lessonUpdateBlacklistSourceWorker$doWork$1 = (LessonUpdateBlacklistSourceWorker$doWork$1) continuation;
            int i = lessonUpdateBlacklistSourceWorker$doWork$1.f16757c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lessonUpdateBlacklistSourceWorker$doWork$1.f16757c = i - Integer.MIN_VALUE;
            } else {
                lessonUpdateBlacklistSourceWorker$doWork$1 = new LessonUpdateBlacklistSourceWorker$doWork$1(this, (ContinuationImpl) continuation);
            }
        } else {
            lessonUpdateBlacklistSourceWorker$doWork$1 = new LessonUpdateBlacklistSourceWorker$doWork$1(this, (ContinuationImpl) continuation);
        }
        Object obj = lessonUpdateBlacklistSourceWorker$doWork$1.f16755a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = lessonUpdateBlacklistSourceWorker$doWork$1.f16757c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                WorkerParameters workerParameters = this.f56132b;
                int i3 = workerParameters.f7167c;
                sz1 sz1Var = workerParameters.f7166b;
                if (i3 > 3) {
                    return new lg5();
                }
                int iM21785c = sz1Var.m21785c("contextId", 0);
                String strM21787e2 = sz1Var.m21787e("source");
                if (strM21787e2 != null && (strM21787e = sz1Var.m21787e("action")) != null) {
                    C1286b c1286b = this.f16754g;
                    if (c1286b == null) {
                        fa4.m11636J("blacklistRepository");
                        throw null;
                    }
                    lessonUpdateBlacklistSourceWorker$doWork$1.f16757c = 1;
                    if (c1286b.m7111m(iM21785c, strM21787e2, strM21787e, lessonUpdateBlacklistSourceWorker$doWork$1) == coroutineSingletons) {
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
