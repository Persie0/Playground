package com.lingq.core.data.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.lingq.core.data.repository.C1302r;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.lg5;
import p000.mg5;
import p000.og5;
import p000.sz1;
import p000.xd7;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
public final class LessonDeleteFavoriteWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public final xd7 f16722g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonDeleteFavoriteWorker(Context context, WorkerParameters workerParameters, xd7 xd7Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        xd7Var.getClass();
        this.f16722g = xd7Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    public final Object mo2213d(Continuation continuation) throws Throwable {
        LessonDeleteFavoriteWorker$doWork$1 lessonDeleteFavoriteWorker$doWork$1;
        String strM21787e;
        if (continuation instanceof LessonDeleteFavoriteWorker$doWork$1) {
            lessonDeleteFavoriteWorker$doWork$1 = (LessonDeleteFavoriteWorker$doWork$1) continuation;
            int i = lessonDeleteFavoriteWorker$doWork$1.f16725c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lessonDeleteFavoriteWorker$doWork$1.f16725c = i - Integer.MIN_VALUE;
            } else {
                lessonDeleteFavoriteWorker$doWork$1 = new LessonDeleteFavoriteWorker$doWork$1(this, (ContinuationImpl) continuation);
            }
        } else {
            lessonDeleteFavoriteWorker$doWork$1 = new LessonDeleteFavoriteWorker$doWork$1(this, (ContinuationImpl) continuation);
        }
        Object obj = lessonDeleteFavoriteWorker$doWork$1.f16723a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = lessonDeleteFavoriteWorker$doWork$1.f16725c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                WorkerParameters workerParameters = this.f56132b;
                int i3 = workerParameters.f7167c;
                sz1 sz1Var = workerParameters.f7166b;
                if (i3 <= 3 && (strM21787e = sz1Var.m21787e("language")) != null) {
                    int iM21785c = sz1Var.m21785c("lessonId", 0);
                    xd7 xd7Var = this.f16722g;
                    lessonDeleteFavoriteWorker$doWork$1.f16725c = 1;
                    Object objM21319j = ((C1302r) xd7Var).f16537f.m21319j(strM21787e, new Integer(iM21785c), lessonDeleteFavoriteWorker$doWork$1);
                    if (objM21319j != coroutineSingletons) {
                        objM21319j = xfa.f68157a;
                    }
                    if (objM21319j == coroutineSingletons) {
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
