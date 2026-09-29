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
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
public final class LessonDeleteRoseWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public d65 f16726g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonDeleteRoseWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    public final Object mo2213d(Continuation continuation) throws Throwable {
        LessonDeleteRoseWorker$doWork$1 lessonDeleteRoseWorker$doWork$1;
        WorkerParameters workerParameters = this.f56132b;
        if (continuation instanceof LessonDeleteRoseWorker$doWork$1) {
            lessonDeleteRoseWorker$doWork$1 = (LessonDeleteRoseWorker$doWork$1) continuation;
            int i = lessonDeleteRoseWorker$doWork$1.f16729c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lessonDeleteRoseWorker$doWork$1.f16729c = i - Integer.MIN_VALUE;
            } else {
                lessonDeleteRoseWorker$doWork$1 = new LessonDeleteRoseWorker$doWork$1(this, (ContinuationImpl) continuation);
            }
        } else {
            lessonDeleteRoseWorker$doWork$1 = new LessonDeleteRoseWorker$doWork$1(this, (ContinuationImpl) continuation);
        }
        Object obj = lessonDeleteRoseWorker$doWork$1.f16727a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = lessonDeleteRoseWorker$doWork$1.f16729c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                String strM21787e = workerParameters.f7166b.m21787e("language");
                if (strM21787e == null) {
                    return new lg5();
                }
                int iM21785c = workerParameters.f7166b.m21785c("lessonId", 0);
                d65 d65Var = this.f16726g;
                if (d65Var == null) {
                    fa4.m11636J("lessonRepository");
                    throw null;
                }
                lessonDeleteRoseWorker$doWork$1.f16729c = 1;
                Object objM14891C = ((C1295k) d65Var).f16502f.m14891C(strM21787e, new Integer(iM21785c), lessonDeleteRoseWorker$doWork$1);
                if (objM14891C != coroutineSingletons) {
                    objM14891C = xfa.f68157a;
                }
                if (objM14891C == coroutineSingletons) {
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
