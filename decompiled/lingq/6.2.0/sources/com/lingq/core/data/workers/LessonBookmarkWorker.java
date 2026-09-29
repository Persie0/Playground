package com.lingq.core.data.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.lingq.core.data.repository.C1295k;
import com.lingq.core.network.api.requests.RequestBookmarkLesson;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.d65;
import p000.lg5;
import p000.mg5;
import p000.og5;
import p000.sz1;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
public final class LessonBookmarkWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public final d65 f16714g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonBookmarkWorker(Context context, WorkerParameters workerParameters, d65 d65Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        d65Var.getClass();
        this.f16714g = d65Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    public final Object mo2213d(Continuation continuation) throws Throwable {
        LessonBookmarkWorker$doWork$1 lessonBookmarkWorker$doWork$1;
        String strM21787e;
        if (continuation instanceof LessonBookmarkWorker$doWork$1) {
            lessonBookmarkWorker$doWork$1 = (LessonBookmarkWorker$doWork$1) continuation;
            int i = lessonBookmarkWorker$doWork$1.f16717c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lessonBookmarkWorker$doWork$1.f16717c = i - Integer.MIN_VALUE;
            } else {
                lessonBookmarkWorker$doWork$1 = new LessonBookmarkWorker$doWork$1(this, (ContinuationImpl) continuation);
            }
        } else {
            lessonBookmarkWorker$doWork$1 = new LessonBookmarkWorker$doWork$1(this, (ContinuationImpl) continuation);
        }
        Object obj = lessonBookmarkWorker$doWork$1.f16715a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = lessonBookmarkWorker$doWork$1.f16717c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                WorkerParameters workerParameters = this.f56132b;
                int i3 = workerParameters.f7167c;
                sz1 sz1Var = workerParameters.f7166b;
                if (i3 <= 3 && (strM21787e = sz1Var.m21787e("language")) != null) {
                    int iM21785c = sz1Var.m21785c("lessonId", 0);
                    int iM21785c2 = sz1Var.m21785c("wordIndex", 0);
                    int iM21785c3 = sz1Var.m21785c("completedWordIndex", 0);
                    double dM21784b = sz1Var.m21784b("audioPosition");
                    String strM21787e2 = sz1Var.m21787e("timestamp");
                    if (strM21787e2 == null) {
                        return new lg5();
                    }
                    d65 d65Var = this.f16714g;
                    lessonBookmarkWorker$doWork$1.f16717c = 1;
                    C1295k c1295k = (C1295k) d65Var;
                    c1295k.getClass();
                    Object objM14901f = c1295k.f16502f.m14901f(strM21787e, new Integer(iM21785c), new RequestBookmarkLesson(iM21785c2, strM21787e2, new Integer(iM21785c3), new Double(dM21784b)), lessonBookmarkWorker$doWork$1);
                    if (objM14901f != coroutineSingletons) {
                        objM14901f = xfa.f68157a;
                    }
                    if (objM14901f == coroutineSingletons) {
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
