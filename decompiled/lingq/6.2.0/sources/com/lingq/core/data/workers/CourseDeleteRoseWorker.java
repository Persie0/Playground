package com.lingq.core.data.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.lingq.core.data.repository.C1290f;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.lg5;
import p000.mg5;
import p000.og5;
import p000.xfa;
import p000.xo1;

/* JADX INFO: loaded from: classes2.dex */
public final class CourseDeleteRoseWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public final xo1 f16628g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseDeleteRoseWorker(Context context, WorkerParameters workerParameters, xo1 xo1Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        xo1Var.getClass();
        this.f16628g = xo1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    public final Object mo2213d(Continuation continuation) throws Throwable {
        CourseDeleteRoseWorker$doWork$1 courseDeleteRoseWorker$doWork$1;
        WorkerParameters workerParameters = this.f56132b;
        if (continuation instanceof CourseDeleteRoseWorker$doWork$1) {
            courseDeleteRoseWorker$doWork$1 = (CourseDeleteRoseWorker$doWork$1) continuation;
            int i = courseDeleteRoseWorker$doWork$1.f16631c;
            if ((i & Integer.MIN_VALUE) != 0) {
                courseDeleteRoseWorker$doWork$1.f16631c = i - Integer.MIN_VALUE;
            } else {
                courseDeleteRoseWorker$doWork$1 = new CourseDeleteRoseWorker$doWork$1(this, (ContinuationImpl) continuation);
            }
        } else {
            courseDeleteRoseWorker$doWork$1 = new CourseDeleteRoseWorker$doWork$1(this, (ContinuationImpl) continuation);
        }
        Object obj = courseDeleteRoseWorker$doWork$1.f16629a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = courseDeleteRoseWorker$doWork$1.f16631c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                String strM21787e = workerParameters.f7166b.m21787e("language");
                if (strM21787e == null) {
                    return new lg5();
                }
                int iM21785c = workerParameters.f7166b.m21785c("collectionId", 0);
                xo1 xo1Var = this.f16628g;
                courseDeleteRoseWorker$doWork$1.f16631c = 1;
                Object objM25716k = ((C1290f) xo1Var).f16477e.m25716k(strM21787e, new Integer(iM21785c), courseDeleteRoseWorker$doWork$1);
                if (objM25716k != coroutineSingletons) {
                    objM25716k = xfa.f68157a;
                }
                if (objM25716k == coroutineSingletons) {
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
