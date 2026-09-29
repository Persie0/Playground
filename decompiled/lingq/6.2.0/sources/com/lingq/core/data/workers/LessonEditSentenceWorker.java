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
public final class LessonEditSentenceWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public d65 f16730g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonEditSentenceWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    public final Object mo2213d(Continuation continuation) throws Throwable {
        LessonEditSentenceWorker$doWork$1 lessonEditSentenceWorker$doWork$1;
        String strM21787e;
        if (continuation instanceof LessonEditSentenceWorker$doWork$1) {
            lessonEditSentenceWorker$doWork$1 = (LessonEditSentenceWorker$doWork$1) continuation;
            int i = lessonEditSentenceWorker$doWork$1.f16733c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lessonEditSentenceWorker$doWork$1.f16733c = i - Integer.MIN_VALUE;
            } else {
                lessonEditSentenceWorker$doWork$1 = new LessonEditSentenceWorker$doWork$1(this, (ContinuationImpl) continuation);
            }
        } else {
            lessonEditSentenceWorker$doWork$1 = new LessonEditSentenceWorker$doWork$1(this, (ContinuationImpl) continuation);
        }
        Object obj = lessonEditSentenceWorker$doWork$1.f16731a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = lessonEditSentenceWorker$doWork$1.f16733c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                WorkerParameters workerParameters = this.f56132b;
                int i3 = workerParameters.f7167c;
                sz1 sz1Var = workerParameters.f7166b;
                if (i3 <= 3 && (strM21787e = sz1Var.m21787e("language")) != null) {
                    int iM21785c = sz1Var.m21785c("lessonId", 0);
                    int iM21785c2 = sz1Var.m21785c("sentenceIndex", 0);
                    d65 d65Var = this.f16730g;
                    if (d65Var == null) {
                        fa4.m11636J("lessonRepository");
                        throw null;
                    }
                    lessonEditSentenceWorker$doWork$1.f16733c = 1;
                    if (((C1295k) d65Var).m7268Z(iM21785c, iM21785c2, strM21787e, lessonEditSentenceWorker$doWork$1) == coroutineSingletons) {
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
        } catch (Throwable th) {
            th.printStackTrace();
            return new mg5();
        }
    }
}
