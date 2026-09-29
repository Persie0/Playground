package com.lingq.shared.network.workers;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import ci.InterfaceC2011d;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.network.requests.RequestDictionariesOrder;
import com.squareup.moshi.C4955q;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m13365d2 = {"Lcom/lingq/shared/network/workers/DictionaryOrderWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lci/d;", "dictionaryRepository", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lci/d;Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class DictionaryOrderWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: h */
    public final InterfaceC2011d f19217h;

    /* JADX INFO: renamed from: i */
    public final C4955q f19218i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionaryOrderWorker(Context context, WorkerParameters workerParameters, InterfaceC2011d interfaceC2011d, C4955q c4955q) {
        super(context, workerParameters);
        C5207g.m11111f(context, "appContext");
        C5207g.m11111f(workerParameters, "workerParams");
        C5207g.m11111f(interfaceC2011d, "dictionaryRepository");
        C5207g.m11111f(c4955q, "moshi");
        this.f19217h = interfaceC2011d;
        this.f19218i = c4955q;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: g */
    public final Object mo4698g(InterfaceC9968c<? super AbstractC1246d.a> interfaceC9968c) throws Throwable {
        DictionaryOrderWorker$doWork$1 dictionaryOrderWorker$doWork$1;
        String strM4707e;
        String strM4707e2;
        if (interfaceC9968c instanceof DictionaryOrderWorker$doWork$1) {
            dictionaryOrderWorker$doWork$1 = (DictionaryOrderWorker$doWork$1) interfaceC9968c;
            int i10 = dictionaryOrderWorker$doWork$1.f19221f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dictionaryOrderWorker$doWork$1.f19221f = i10 - Integer.MIN_VALUE;
            } else {
                dictionaryOrderWorker$doWork$1 = new DictionaryOrderWorker$doWork$1(this, interfaceC9968c);
            }
        } else {
            dictionaryOrderWorker$doWork$1 = new DictionaryOrderWorker$doWork$1(this, interfaceC9968c);
        }
        Object obj = dictionaryOrderWorker$doWork$1.f19219d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = dictionaryOrderWorker$doWork$1.f19221f;
        try {
            if (i11 == 0) {
                C7499b.m14977z0(obj);
                WorkerParameters workerParameters = this.f7829b;
                if (workerParameters.f7803c <= 3 && (strM4707e = workerParameters.f7802b.m4707e("language")) != null && (strM4707e2 = workerParameters.f7802b.m4707e("data")) != null) {
                    RequestDictionariesOrder requestDictionariesOrder = (RequestDictionariesOrder) this.f19218i.m10563a(RequestDictionariesOrder.class).m10532b(strM4707e2);
                    if (requestDictionariesOrder != null) {
                        InterfaceC2011d interfaceC2011d = this.f19217h;
                        dictionaryOrderWorker$doWork$1.f19221f = 1;
                        if (interfaceC2011d.mo6005e(strM4707e, requestDictionariesOrder, dictionaryOrderWorker$doWork$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
