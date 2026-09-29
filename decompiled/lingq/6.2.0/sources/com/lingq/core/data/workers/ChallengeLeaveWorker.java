package com.lingq.core.data.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.lingq.core.data.repository.C1288d;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.lg5;
import p000.mg5;
import p000.og5;
import p000.or0;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
public final class ChallengeLeaveWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public final or0 f16620g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeLeaveWorker(Context context, WorkerParameters workerParameters, or0 or0Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        or0Var.getClass();
        this.f16620g = or0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    public final Object mo2213d(Continuation continuation) throws Throwable {
        ChallengeLeaveWorker$doWork$1 challengeLeaveWorker$doWork$1;
        String strM21787e;
        if (continuation instanceof ChallengeLeaveWorker$doWork$1) {
            challengeLeaveWorker$doWork$1 = (ChallengeLeaveWorker$doWork$1) continuation;
            int i = challengeLeaveWorker$doWork$1.f16623c;
            if ((i & Integer.MIN_VALUE) != 0) {
                challengeLeaveWorker$doWork$1.f16623c = i - Integer.MIN_VALUE;
            } else {
                challengeLeaveWorker$doWork$1 = new ChallengeLeaveWorker$doWork$1(this, (ContinuationImpl) continuation);
            }
        } else {
            challengeLeaveWorker$doWork$1 = new ChallengeLeaveWorker$doWork$1(this, (ContinuationImpl) continuation);
        }
        Object obj = challengeLeaveWorker$doWork$1.f16621a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = challengeLeaveWorker$doWork$1.f16623c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                WorkerParameters workerParameters = this.f56132b;
                if (workerParameters.f7167c <= 3 && (strM21787e = workerParameters.f7166b.m21787e("challengeCode")) != null) {
                    or0 or0Var = this.f16620g;
                    challengeLeaveWorker$doWork$1.f16623c = 1;
                    Object objM21657b = ((C1288d) or0Var).f16465b.m21657b(strM21787e, challengeLeaveWorker$doWork$1);
                    if (objM21657b != coroutineSingletons) {
                        objM21657b = xfa.f68157a;
                    }
                    if (objM21657b == coroutineSingletons) {
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
