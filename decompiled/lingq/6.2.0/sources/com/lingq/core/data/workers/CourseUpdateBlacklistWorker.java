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
public final class CourseUpdateBlacklistWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public C1286b f16648g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseUpdateBlacklistWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    public final Object mo2213d(Continuation continuation) throws Throwable {
        CourseUpdateBlacklistWorker$doWork$1 courseUpdateBlacklistWorker$doWork$1;
        if (continuation instanceof CourseUpdateBlacklistWorker$doWork$1) {
            courseUpdateBlacklistWorker$doWork$1 = (CourseUpdateBlacklistWorker$doWork$1) continuation;
            int i = courseUpdateBlacklistWorker$doWork$1.f16651c;
            if ((i & Integer.MIN_VALUE) != 0) {
                courseUpdateBlacklistWorker$doWork$1.f16651c = i - Integer.MIN_VALUE;
            } else {
                courseUpdateBlacklistWorker$doWork$1 = new CourseUpdateBlacklistWorker$doWork$1(this, (ContinuationImpl) continuation);
            }
        } else {
            courseUpdateBlacklistWorker$doWork$1 = new CourseUpdateBlacklistWorker$doWork$1(this, (ContinuationImpl) continuation);
        }
        Object obj = courseUpdateBlacklistWorker$doWork$1.f16649a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = courseUpdateBlacklistWorker$doWork$1.f16651c;
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
                int iM21785c2 = sz1Var.m21785c("courseId", 0);
                String strM21787e = sz1Var.m21787e("action");
                if (strM21787e == null) {
                    return new lg5();
                }
                C1286b c1286b = this.f16648g;
                if (c1286b == null) {
                    fa4.m11636J("blacklistRepository");
                    throw null;
                }
                courseUpdateBlacklistWorker$doWork$1.f16651c = 1;
                if (c1286b.m7110l(iM21785c, iM21785c2, strM21787e, courseUpdateBlacklistWorker$doWork$1) == coroutineSingletons) {
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
