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
public final class CourseSubscribeWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public final xo1 f16640g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseSubscribeWorker(Context context, WorkerParameters workerParameters, xo1 xo1Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        xo1Var.getClass();
        this.f16640g = xo1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    public final Object mo2213d(Continuation continuation) throws Throwable {
        CourseSubscribeWorker$doWork$1 courseSubscribeWorker$doWork$1;
        WorkerParameters workerParameters = this.f56132b;
        if (continuation instanceof CourseSubscribeWorker$doWork$1) {
            courseSubscribeWorker$doWork$1 = (CourseSubscribeWorker$doWork$1) continuation;
            int i = courseSubscribeWorker$doWork$1.f16643c;
            if ((i & Integer.MIN_VALUE) != 0) {
                courseSubscribeWorker$doWork$1.f16643c = i - Integer.MIN_VALUE;
            } else {
                courseSubscribeWorker$doWork$1 = new CourseSubscribeWorker$doWork$1(this, (ContinuationImpl) continuation);
            }
        } else {
            courseSubscribeWorker$doWork$1 = new CourseSubscribeWorker$doWork$1(this, (ContinuationImpl) continuation);
        }
        Object obj = courseSubscribeWorker$doWork$1.f16641a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = courseSubscribeWorker$doWork$1.f16643c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                String strM21787e = workerParameters.f7166b.m21787e("language");
                if (strM21787e == null) {
                    return new lg5();
                }
                int iM21785c = workerParameters.f7166b.m21785c("collectionId", 0);
                xo1 xo1Var = this.f16640g;
                courseSubscribeWorker$doWork$1.f16643c = 1;
                Object objM25710e = ((C1290f) xo1Var).f16477e.m25710e(strM21787e, new Integer(iM21785c), courseSubscribeWorker$doWork$1);
                if (objM25710e != coroutineSingletons) {
                    objM25710e = xfa.f68157a;
                }
                if (objM25710e == coroutineSingletons) {
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
