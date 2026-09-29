package com.lingq.core.data.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.lingq.core.data.repository.C1298n;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.lg5;
import p000.mg5;
import p000.og5;
import p000.sz1;
import p000.xfa;
import p000.xy5;

/* JADX INFO: loaded from: classes2.dex */
public final class MilestoneMetWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public final xy5 f16762g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MilestoneMetWorker(Context context, WorkerParameters workerParameters, xy5 xy5Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        xy5Var.getClass();
        this.f16762g = xy5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    public final Object mo2213d(Continuation continuation) throws Throwable {
        MilestoneMetWorker$doWork$1 milestoneMetWorker$doWork$1;
        String strM21787e;
        String strM21787e2;
        if (continuation instanceof MilestoneMetWorker$doWork$1) {
            milestoneMetWorker$doWork$1 = (MilestoneMetWorker$doWork$1) continuation;
            int i = milestoneMetWorker$doWork$1.f16765c;
            if ((i & Integer.MIN_VALUE) != 0) {
                milestoneMetWorker$doWork$1.f16765c = i - Integer.MIN_VALUE;
            } else {
                milestoneMetWorker$doWork$1 = new MilestoneMetWorker$doWork$1(this, (ContinuationImpl) continuation);
            }
        } else {
            milestoneMetWorker$doWork$1 = new MilestoneMetWorker$doWork$1(this, (ContinuationImpl) continuation);
        }
        Object obj = milestoneMetWorker$doWork$1.f16763a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = milestoneMetWorker$doWork$1.f16765c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                WorkerParameters workerParameters = this.f56132b;
                int i3 = workerParameters.f7167c;
                sz1 sz1Var = workerParameters.f7166b;
                if (i3 <= 3 && (strM21787e = sz1Var.m21787e("language")) != null && (strM21787e2 = sz1Var.m21787e("slug")) != null) {
                    xy5 xy5Var = this.f16762g;
                    milestoneMetWorker$doWork$1.f16765c = 1;
                    Object objM25383b = ((C1298n) xy5Var).f16521b.m25383b(strM21787e, strM21787e2, milestoneMetWorker$doWork$1);
                    if (objM25383b != coroutineSingletons) {
                        objM25383b = xfa.f68157a;
                    }
                    if (objM25383b == coroutineSingletons) {
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
