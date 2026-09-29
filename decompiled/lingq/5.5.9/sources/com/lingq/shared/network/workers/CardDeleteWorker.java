package com.lingq.shared.network.workers;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.C1244b;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import ci.InterfaceC2008a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.network.requests.RequestDataCard;
import com.squareup.moshi.C4955q;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineDispatcher;
import no.C7828f;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B7\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m13365d2 = {"Lcom/lingq/shared/network/workers/CardDeleteWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lci/a;", "cardRepository", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lci/a;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class CardDeleteWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: h */
    public final InterfaceC2008a f19161h;

    /* JADX INFO: renamed from: i */
    public final CoroutineDispatcher f19162i;

    /* JADX INFO: renamed from: j */
    public final C4955q f19163j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDeleteWorker(Context context, WorkerParameters workerParameters, InterfaceC2008a interfaceC2008a, CoroutineDispatcher coroutineDispatcher, C4955q c4955q) {
        super(context, workerParameters);
        C5207g.m11111f(context, "appContext");
        C5207g.m11111f(workerParameters, "workerParams");
        C5207g.m11111f(interfaceC2008a, "cardRepository");
        C5207g.m11111f(coroutineDispatcher, "dispatcher");
        C5207g.m11111f(c4955q, "moshi");
        this.f19161h = interfaceC2008a;
        this.f19162i = coroutineDispatcher;
        this.f19163j = c4955q;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: g */
    public final Object mo4698g(InterfaceC9968c<? super AbstractC1246d.a> interfaceC9968c) throws Throwable {
        CardDeleteWorker$doWork$1 cardDeleteWorker$doWork$1;
        String strM4707e;
        String str;
        int i10;
        CardDeleteWorker cardDeleteWorker;
        if (interfaceC9968c instanceof CardDeleteWorker$doWork$1) {
            cardDeleteWorker$doWork$1 = (CardDeleteWorker$doWork$1) interfaceC9968c;
            int i11 = cardDeleteWorker$doWork$1.f19169i;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cardDeleteWorker$doWork$1.f19169i = i11 - Integer.MIN_VALUE;
            } else {
                cardDeleteWorker$doWork$1 = new CardDeleteWorker$doWork$1(this, interfaceC9968c);
            }
        } else {
            cardDeleteWorker$doWork$1 = new CardDeleteWorker$doWork$1(this, interfaceC9968c);
        }
        Object objM15574h = cardDeleteWorker$doWork$1.f19167g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = cardDeleteWorker$doWork$1.f19169i;
        try {
            if (i12 != 0) {
                if (i12 == 1) {
                    i10 = cardDeleteWorker$doWork$1.f19166f;
                    str = cardDeleteWorker$doWork$1.f19165e;
                    cardDeleteWorker = cardDeleteWorker$doWork$1.f19164d;
                    C7499b.m14977z0(objM15574h);
                } else {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(objM15574h);
                }
                return new AbstractC1246d.a.c();
            }
            C7499b.m14977z0(objM15574h);
            WorkerParameters workerParameters = this.f7829b;
            int i13 = workerParameters.f7803c;
            C1244b c1244b = workerParameters.f7802b;
            if (i13 <= 3 && (strM4707e = c1244b.m4707e("language")) != null) {
                int iM4705c = c1244b.m4705c("cardId", 0);
                String strM4707e2 = c1244b.m4707e("data");
                if (strM4707e2 == null) {
                    return new AbstractC1246d.a.C10594a();
                }
                CoroutineDispatcher coroutineDispatcher = this.f19162i;
                CardDeleteWorker$doWork$requestDataCard$1 cardDeleteWorker$doWork$requestDataCard$1 = new CardDeleteWorker$doWork$requestDataCard$1(this, strM4707e2, null);
                cardDeleteWorker$doWork$1.f19164d = this;
                cardDeleteWorker$doWork$1.f19165e = strM4707e;
                cardDeleteWorker$doWork$1.f19166f = iM4705c;
                cardDeleteWorker$doWork$1.f19169i = 1;
                objM15574h = C7828f.m15574h(cardDeleteWorker$doWork$1, coroutineDispatcher, cardDeleteWorker$doWork$requestDataCard$1);
                if (objM15574h == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str = strM4707e;
                i10 = iM4705c;
                cardDeleteWorker = this;
            }
            return new AbstractC1246d.a.C10594a();
            RequestDataCard requestDataCard = (RequestDataCard) objM15574h;
            if (requestDataCard != null) {
                InterfaceC2008a interfaceC2008a = cardDeleteWorker.f19161h;
                cardDeleteWorker$doWork$1.f19164d = null;
                cardDeleteWorker$doWork$1.f19165e = null;
                cardDeleteWorker$doWork$1.f19169i = 2;
                if (interfaceC2008a.mo5968t(str, i10, requestDataCard, cardDeleteWorker$doWork$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return new AbstractC1246d.a.c();
        } catch (Throwable th2) {
            th2.printStackTrace();
            return new AbstractC1246d.a.b();
        }
    }
}
