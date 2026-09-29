package com.lingq.core.data.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.lingq.core.data.repository.C1295k;
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

/* JADX INFO: loaded from: classes2.dex */
public final class LessonSaveRemoveWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public d65 f16746g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonSaveRemoveWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    public final Object mo2213d(Continuation continuation) throws Throwable {
        LessonSaveRemoveWorker$doWork$1 lessonSaveRemoveWorker$doWork$1;
        if (continuation instanceof LessonSaveRemoveWorker$doWork$1) {
            lessonSaveRemoveWorker$doWork$1 = (LessonSaveRemoveWorker$doWork$1) continuation;
            int i = lessonSaveRemoveWorker$doWork$1.f16749c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lessonSaveRemoveWorker$doWork$1.f16749c = i - Integer.MIN_VALUE;
            } else {
                lessonSaveRemoveWorker$doWork$1 = new LessonSaveRemoveWorker$doWork$1(this, (ContinuationImpl) continuation);
            }
        } else {
            lessonSaveRemoveWorker$doWork$1 = new LessonSaveRemoveWorker$doWork$1(this, (ContinuationImpl) continuation);
        }
        Object obj = lessonSaveRemoveWorker$doWork$1.f16747a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = lessonSaveRemoveWorker$doWork$1.f16749c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                WorkerParameters workerParameters = this.f56132b;
                int i3 = workerParameters.f7167c;
                sz1 sz1Var = workerParameters.f7166b;
                if (i3 > 3) {
                    return new lg5();
                }
                int iM21785c = sz1Var.m21785c("lessonId", 0);
                int iM21785c2 = sz1Var.m21785c("contextId", 0);
                boolean zM21783a = sz1Var.m21783a("save", false);
                d65 d65Var = this.f16746g;
                if (d65Var == null) {
                    fa4.m11636J("lessonRepository");
                    throw null;
                }
                lessonSaveRemoveWorker$doWork$1.f16749c = 1;
                if (((C1295k) d65Var).m7267Y(iM21785c2, iM21785c, zM21783a, lessonSaveRemoveWorker$doWork$1) == coroutineSingletons) {
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
        } catch (Throwable unused) {
            return new mg5();
        }
    }
}
