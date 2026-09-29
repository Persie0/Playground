package com.lingq.shared.network.workers;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.C1244b;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import bi.AbstractC1388a;
import ci.InterfaceC2008a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.Card;
import com.lingq.shared.network.requests.RequestDataCard;
import com.squareup.moshi.C4955q;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineDispatcher;
import ni.C7793a;
import no.C7828f;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B?\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m13365d2 = {"Lcom/lingq/shared/network/workers/CardUpdateWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lci/a;", "cardRepository", "Lbi/a;", "cardDao", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lci/a;Lbi/a;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class CardUpdateWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: h */
    public final InterfaceC2008a f19176h;

    /* JADX INFO: renamed from: i */
    public final AbstractC1388a f19177i;

    /* JADX INFO: renamed from: j */
    public final CoroutineDispatcher f19178j;

    /* JADX INFO: renamed from: k */
    public final C4955q f19179k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardUpdateWorker(Context context, WorkerParameters workerParameters, InterfaceC2008a interfaceC2008a, AbstractC1388a abstractC1388a, CoroutineDispatcher coroutineDispatcher, C4955q c4955q) {
        super(context, workerParameters);
        C5207g.m11111f(context, "appContext");
        C5207g.m11111f(workerParameters, "workerParams");
        C5207g.m11111f(interfaceC2008a, "cardRepository");
        C5207g.m11111f(abstractC1388a, "cardDao");
        C5207g.m11111f(coroutineDispatcher, "dispatcher");
        C5207g.m11111f(c4955q, "moshi");
        this.f19176h = interfaceC2008a;
        this.f19177i = abstractC1388a;
        this.f19178j = coroutineDispatcher;
        this.f19179k = c4955q;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0100 A[Catch: all -> 0x0113, TryCatch #0 {all -> 0x0113, blocks: (B:13:0x0036, B:62:0x0116, B:18:0x004c, B:54:0x00fb, B:56:0x0100, B:21:0x0059, B:44:0x00c9, B:46:0x00ce, B:48:0x00d5, B:50:0x00da, B:63:0x011c, B:64:0x0124, B:28:0x0077, B:30:0x007f, B:32:0x0087, B:34:0x008f, B:36:0x0097, B:38:0x00a0, B:40:0x00a9), top: B:67:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0112 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: g */
    public final Object mo4698g(InterfaceC9968c<? super AbstractC1246d.a> interfaceC9968c) throws Throwable {
        CardUpdateWorker$doWork$1 cardUpdateWorker$doWork$1;
        String strM4707e;
        String strM4707e2;
        String strM4707e3;
        String str;
        String str2;
        CardUpdateWorker cardUpdateWorker;
        String str3;
        CardUpdateWorker cardUpdateWorker2;
        int i10;
        RequestDataCard requestDataCard;
        InterfaceC2008a interfaceC2008a;
        if (interfaceC9968c instanceof CardUpdateWorker$doWork$1) {
            cardUpdateWorker$doWork$1 = (CardUpdateWorker$doWork$1) interfaceC9968c;
            int i11 = cardUpdateWorker$doWork$1.f19186j;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cardUpdateWorker$doWork$1.f19186j = i11 - Integer.MIN_VALUE;
            } else {
                cardUpdateWorker$doWork$1 = new CardUpdateWorker$doWork$1(this, interfaceC9968c);
            }
        } else {
            cardUpdateWorker$doWork$1 = new CardUpdateWorker$doWork$1(this, interfaceC9968c);
        }
        Object objMo4979r0 = cardUpdateWorker$doWork$1.f19184h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = cardUpdateWorker$doWork$1.f19186j;
        try {
            if (i12 == 0) {
                C7499b.m14977z0(objMo4979r0);
                WorkerParameters workerParameters = this.f7829b;
                int i13 = workerParameters.f7803c;
                C1244b c1244b = workerParameters.f7802b;
                if (i13 <= 3 && (strM4707e = c1244b.m4707e("language")) != null && (strM4707e2 = c1244b.m4707e("data")) != null && (strM4707e3 = c1244b.m4707e("cardTerm")) != null) {
                    AbstractC1388a abstractC1388a = this.f19177i;
                    String strM15498b = C7793a.m15498b(strM4707e, C7793a.m15501e(strM4707e3, strM4707e));
                    cardUpdateWorker$doWork$1.f19180d = this;
                    cardUpdateWorker$doWork$1.f19181e = strM4707e;
                    cardUpdateWorker$doWork$1.f19182f = strM4707e2;
                    cardUpdateWorker$doWork$1.f19186j = 1;
                    objMo4979r0 = abstractC1388a.mo4979r0(strM15498b, cardUpdateWorker$doWork$1);
                    if (objMo4979r0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str = strM4707e;
                    str2 = strM4707e2;
                    cardUpdateWorker = this;
                }
                return new AbstractC1246d.a.C10594a();
            }
            if (i12 == 1) {
                str2 = cardUpdateWorker$doWork$1.f19182f;
                str = cardUpdateWorker$doWork$1.f19181e;
                cardUpdateWorker = cardUpdateWorker$doWork$1.f19180d;
                C7499b.m14977z0(objMo4979r0);
            } else if (i12 == 2) {
                i10 = cardUpdateWorker$doWork$1.f19183g;
                str3 = cardUpdateWorker$doWork$1.f19181e;
                cardUpdateWorker2 = cardUpdateWorker$doWork$1.f19180d;
                C7499b.m14977z0(objMo4979r0);
                requestDataCard = (RequestDataCard) objMo4979r0;
                if (requestDataCard != null) {
                    interfaceC2008a = cardUpdateWorker2.f19176h;
                    cardUpdateWorker$doWork$1.f19180d = null;
                    cardUpdateWorker$doWork$1.f19181e = null;
                    cardUpdateWorker$doWork$1.f19186j = 3;
                    if (interfaceC2008a.mo5968t(str3, i10, requestDataCard, cardUpdateWorker$doWork$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objMo4979r0);
            }
            return new AbstractC1246d.a.c();
            Card card = (Card) objMo4979r0;
            if (card == null) {
                return new AbstractC1246d.a.C10594a();
            }
            int i14 = card.f16856c;
            if (i14 == 0) {
                throw new Exception();
            }
            CoroutineDispatcher coroutineDispatcher = cardUpdateWorker.f19178j;
            CardUpdateWorker$doWork$requestDataCard$1 cardUpdateWorker$doWork$requestDataCard$1 = new CardUpdateWorker$doWork$requestDataCard$1(cardUpdateWorker, str2, null);
            cardUpdateWorker$doWork$1.f19180d = cardUpdateWorker;
            cardUpdateWorker$doWork$1.f19181e = str;
            cardUpdateWorker$doWork$1.f19182f = null;
            cardUpdateWorker$doWork$1.f19183g = i14;
            cardUpdateWorker$doWork$1.f19186j = 2;
            Object objM15574h = C7828f.m15574h(cardUpdateWorker$doWork$1, coroutineDispatcher, cardUpdateWorker$doWork$requestDataCard$1);
            if (objM15574h == coroutineSingletons) {
                return coroutineSingletons;
            }
            str3 = str;
            cardUpdateWorker2 = cardUpdateWorker;
            i10 = i14;
            objMo4979r0 = objM15574h;
            requestDataCard = (RequestDataCard) objMo4979r0;
            if (requestDataCard != null) {
                interfaceC2008a = cardUpdateWorker2.f19176h;
                cardUpdateWorker$doWork$1.f19180d = null;
                cardUpdateWorker$doWork$1.f19181e = null;
                cardUpdateWorker$doWork$1.f19186j = 3;
                if (interfaceC2008a.mo5968t(str3, i10, requestDataCard, cardUpdateWorker$doWork$1) == coroutineSingletons) {
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
