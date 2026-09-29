package com.lingq.core.data.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.lingq.core.data.repository.C1287c;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.ao0;
import p000.lg5;
import p000.mg5;
import p000.og5;
import p000.sz1;

/* JADX INFO: loaded from: classes2.dex */
public final class CardCreateWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public final ao0 f16604g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardCreateWorker(Context context, WorkerParameters workerParameters, ao0 ao0Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        ao0Var.getClass();
        this.f16604g = ao0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    public final Object mo2213d(Continuation continuation) throws Throwable {
        CardCreateWorker$doWork$1 cardCreateWorker$doWork$1;
        String strM21787e;
        String strM21787e2;
        if (continuation instanceof CardCreateWorker$doWork$1) {
            cardCreateWorker$doWork$1 = (CardCreateWorker$doWork$1) continuation;
            int i = cardCreateWorker$doWork$1.f16607c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cardCreateWorker$doWork$1.f16607c = i - Integer.MIN_VALUE;
            } else {
                cardCreateWorker$doWork$1 = new CardCreateWorker$doWork$1(this, (ContinuationImpl) continuation);
            }
        } else {
            cardCreateWorker$doWork$1 = new CardCreateWorker$doWork$1(this, (ContinuationImpl) continuation);
        }
        Object obj = cardCreateWorker$doWork$1.f16605a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cardCreateWorker$doWork$1.f16607c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                WorkerParameters workerParameters = this.f56132b;
                int i3 = workerParameters.f7167c;
                sz1 sz1Var = workerParameters.f7166b;
                if (i3 <= 3 && (strM21787e = sz1Var.m21787e("language")) != null && (strM21787e2 = sz1Var.m21787e("term")) != null) {
                    int iM21785c = sz1Var.m21785c("lessonId", -1);
                    ao0 ao0Var = this.f16604g;
                    cardCreateWorker$doWork$1.f16607c = 1;
                    if (((C1287c) ao0Var).m7127q(iM21785c, strM21787e, strM21787e2, cardCreateWorker$doWork$1) == coroutineSingletons) {
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
