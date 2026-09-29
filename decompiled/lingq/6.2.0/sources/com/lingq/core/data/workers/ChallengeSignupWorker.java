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
import p000.sz1;

/* JADX INFO: loaded from: classes2.dex */
public final class ChallengeSignupWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public final or0 f16624g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeSignupWorker(Context context, WorkerParameters workerParameters, or0 or0Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        or0Var.getClass();
        this.f16624g = or0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    public final Object mo2213d(Continuation continuation) throws Throwable {
        ChallengeSignupWorker$doWork$1 challengeSignupWorker$doWork$1;
        String strM21787e;
        String strM21787e2;
        if (continuation instanceof ChallengeSignupWorker$doWork$1) {
            challengeSignupWorker$doWork$1 = (ChallengeSignupWorker$doWork$1) continuation;
            int i = challengeSignupWorker$doWork$1.f16627c;
            if ((i & Integer.MIN_VALUE) != 0) {
                challengeSignupWorker$doWork$1.f16627c = i - Integer.MIN_VALUE;
            } else {
                challengeSignupWorker$doWork$1 = new ChallengeSignupWorker$doWork$1(this, (ContinuationImpl) continuation);
            }
        } else {
            challengeSignupWorker$doWork$1 = new ChallengeSignupWorker$doWork$1(this, (ContinuationImpl) continuation);
        }
        Object obj = challengeSignupWorker$doWork$1.f16625a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = challengeSignupWorker$doWork$1.f16627c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                WorkerParameters workerParameters = this.f56132b;
                int i3 = workerParameters.f7167c;
                sz1 sz1Var = workerParameters.f7166b;
                if (i3 <= 3 && (strM21787e = sz1Var.m21787e("language")) != null && (strM21787e2 = sz1Var.m21787e("challengeCode")) != null && sz1Var.m21787e("challengeType") != null && sz1Var.m21787e("metric") != null) {
                    or0 or0Var = this.f16624g;
                    challengeSignupWorker$doWork$1.f16627c = 1;
                    if (((C1288d) or0Var).m7143j(strM21787e, strM21787e2, challengeSignupWorker$doWork$1) == coroutineSingletons) {
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
