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
public final class CardUpdateWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public final ao0 f16616g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardUpdateWorker(Context context, WorkerParameters workerParameters, ao0 ao0Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        ao0Var.getClass();
        this.f16616g = ao0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    public final Object mo2213d(Continuation continuation) throws Throwable {
        CardUpdateWorker$doWork$1 cardUpdateWorker$doWork$1;
        String strM21787e;
        String strM21787e2;
        if (continuation instanceof CardUpdateWorker$doWork$1) {
            cardUpdateWorker$doWork$1 = (CardUpdateWorker$doWork$1) continuation;
            int i = cardUpdateWorker$doWork$1.f16619c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cardUpdateWorker$doWork$1.f16619c = i - Integer.MIN_VALUE;
            } else {
                cardUpdateWorker$doWork$1 = new CardUpdateWorker$doWork$1(this, (ContinuationImpl) continuation);
            }
        } else {
            cardUpdateWorker$doWork$1 = new CardUpdateWorker$doWork$1(this, (ContinuationImpl) continuation);
        }
        CardUpdateWorker$doWork$1 cardUpdateWorker$doWork$2 = cardUpdateWorker$doWork$1;
        Object obj = cardUpdateWorker$doWork$2.f16617a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cardUpdateWorker$doWork$2.f16619c;
        Integer num = null;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                WorkerParameters workerParameters = this.f56132b;
                int i3 = workerParameters.f7167c;
                sz1 sz1Var = workerParameters.f7166b;
                if (i3 <= 3 && (strM21787e = sz1Var.m21787e("language")) != null && (strM21787e2 = sz1Var.m21787e("term")) != null) {
                    int iM21785c = sz1Var.m21785c("lessonId", -1);
                    String strM21787e3 = sz1Var.m21787e("creationDate");
                    ao0 ao0Var = this.f16616g;
                    if (iM21785c != -1) {
                        num = new Integer(iM21785c);
                    }
                    cardUpdateWorker$doWork$2.f16619c = 1;
                    if (((C1287c) ao0Var).m7129s(strM21787e, strM21787e2, num, strM21787e3, cardUpdateWorker$doWork$2) == coroutineSingletons) {
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
