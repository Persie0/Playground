package com.lingq.core.data.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.lingq.core.data.repository.C1287c;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.network.api.requests.RequestDataCard;
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
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
public final class CardDeleteWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public final ao0 f16608g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDeleteWorker(Context context, WorkerParameters workerParameters, ao0 ao0Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        ao0Var.getClass();
        this.f16608g = ao0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    public final Object mo2213d(Continuation continuation) throws Throwable {
        CardDeleteWorker$doWork$1 cardDeleteWorker$doWork$1;
        String strM21787e;
        if (continuation instanceof CardDeleteWorker$doWork$1) {
            cardDeleteWorker$doWork$1 = (CardDeleteWorker$doWork$1) continuation;
            int i = cardDeleteWorker$doWork$1.f16611c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cardDeleteWorker$doWork$1.f16611c = i - Integer.MIN_VALUE;
            } else {
                cardDeleteWorker$doWork$1 = new CardDeleteWorker$doWork$1(this, (ContinuationImpl) continuation);
            }
        } else {
            cardDeleteWorker$doWork$1 = new CardDeleteWorker$doWork$1(this, (ContinuationImpl) continuation);
        }
        Object obj = cardDeleteWorker$doWork$1.f16609a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cardDeleteWorker$doWork$1.f16611c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                WorkerParameters workerParameters = this.f56132b;
                int i3 = workerParameters.f7167c;
                sz1 sz1Var = workerParameters.f7166b;
                if (i3 <= 3 && (strM21787e = sz1Var.m21787e("language")) != null) {
                    int iM21785c = sz1Var.m21785c("cardId", -1);
                    int iM21785c2 = sz1Var.m21785c("status", CardStatus.Ignored.getValue());
                    String strM21787e2 = sz1Var.m21787e("term");
                    if (strM21787e2 == null) {
                        return new lg5();
                    }
                    ao0 ao0Var = this.f16608g;
                    cardDeleteWorker$doWork$1.f16611c = 1;
                    Object objM4911g = ((C1287c) ao0Var).f16456e.m4911g(strM21787e, new Integer(iM21785c), new RequestDataCard(strM21787e2, null, iM21785c2, null, null, null, null, null, null), cardDeleteWorker$doWork$1);
                    if (objM4911g != coroutineSingletons) {
                        objM4911g = xfa.f68157a;
                    }
                    if (objM4911g == coroutineSingletons) {
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
