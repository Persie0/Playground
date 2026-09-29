package com.lingq.shared.network.workers;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import ci.InterfaceC2008a;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m13365d2 = {"Lcom/lingq/shared/network/workers/CardReviewWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lci/a;", "cardRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lci/a;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class CardReviewWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: h */
    public final InterfaceC2008a f19172h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardReviewWorker(Context context, WorkerParameters workerParameters, InterfaceC2008a interfaceC2008a) {
        super(context, workerParameters);
        C5207g.m11111f(context, "appContext");
        C5207g.m11111f(workerParameters, "workerParams");
        C5207g.m11111f(interfaceC2008a, "cardRepository");
        this.f19172h = interfaceC2008a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: g */
    public final Object mo4698g(InterfaceC9968c<? super AbstractC1246d.a> interfaceC9968c) throws Throwable {
        CardReviewWorker$doWork$1 cardReviewWorker$doWork$1;
        String strM4707e;
        String strM4707e2;
        if (interfaceC9968c instanceof CardReviewWorker$doWork$1) {
            cardReviewWorker$doWork$1 = (CardReviewWorker$doWork$1) interfaceC9968c;
            int i10 = cardReviewWorker$doWork$1.f19175f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cardReviewWorker$doWork$1.f19175f = i10 - Integer.MIN_VALUE;
            } else {
                cardReviewWorker$doWork$1 = new CardReviewWorker$doWork$1(this, interfaceC9968c);
            }
        } else {
            cardReviewWorker$doWork$1 = new CardReviewWorker$doWork$1(this, interfaceC9968c);
        }
        Object obj = cardReviewWorker$doWork$1.f19173d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = cardReviewWorker$doWork$1.f19175f;
        try {
            if (i11 == 0) {
                C7499b.m14977z0(obj);
                WorkerParameters workerParameters = this.f7829b;
                if (workerParameters.f7803c <= 3 && (strM4707e = workerParameters.f7802b.m4707e("language")) != null && (strM4707e2 = workerParameters.f7802b.m4707e("term")) != null) {
                    int iM4705c = workerParameters.f7802b.m4705c("cardId", 0);
                    InterfaceC2008a interfaceC2008a = this.f19172h;
                    cardReviewWorker$doWork$1.f19175f = 1;
                    if (interfaceC2008a.mo5960l(iM4705c, strM4707e, strM4707e2, cardReviewWorker$doWork$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return new AbstractC1246d.a.C10594a();
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
            return new AbstractC1246d.a.c();
        } catch (Throwable th2) {
            th2.printStackTrace();
            return new AbstractC1246d.a.b();
        }
    }
}
