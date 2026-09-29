package com.lingq.core.data.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.lingq.core.data.repository.C1292h;
import com.lingq.core.network.api.requests.RequestDictionariesAdd;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.lg5;
import p000.mg5;
import p000.og5;
import p000.sz1;
import p000.xf2;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
public final class DictionaryAddWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public final xf2 f16652g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionaryAddWorker(Context context, WorkerParameters workerParameters, xf2 xf2Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        xf2Var.getClass();
        this.f16652g = xf2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    public final Object mo2213d(Continuation continuation) throws Throwable {
        DictionaryAddWorker$doWork$1 dictionaryAddWorker$doWork$1;
        String strM21787e;
        if (continuation instanceof DictionaryAddWorker$doWork$1) {
            dictionaryAddWorker$doWork$1 = (DictionaryAddWorker$doWork$1) continuation;
            int i = dictionaryAddWorker$doWork$1.f16655c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dictionaryAddWorker$doWork$1.f16655c = i - Integer.MIN_VALUE;
            } else {
                dictionaryAddWorker$doWork$1 = new DictionaryAddWorker$doWork$1(this, (ContinuationImpl) continuation);
            }
        } else {
            dictionaryAddWorker$doWork$1 = new DictionaryAddWorker$doWork$1(this, (ContinuationImpl) continuation);
        }
        Object obj = dictionaryAddWorker$doWork$1.f16653a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = dictionaryAddWorker$doWork$1.f16655c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                WorkerParameters workerParameters = this.f56132b;
                int i3 = workerParameters.f7167c;
                sz1 sz1Var = workerParameters.f7166b;
                if (i3 <= 3 && (strM21787e = sz1Var.m21787e("language")) != null) {
                    int iM21785c = sz1Var.m21785c("id", 0);
                    xf2 xf2Var = this.f16652g;
                    dictionaryAddWorker$doWork$1.f16655c = 1;
                    C1292h c1292h = (C1292h) xf2Var;
                    c1292h.getClass();
                    RequestDictionariesAdd requestDictionariesAdd = new RequestDictionariesAdd();
                    requestDictionariesAdd.f20354a = iM21785c;
                    Object objM25113e = c1292h.f16485d.m25113e(strM21787e, requestDictionariesAdd, dictionaryAddWorker$doWork$1);
                    if (objM25113e != coroutineSingletons) {
                        objM25113e = xfa.f68157a;
                    }
                    if (objM25113e == coroutineSingletons) {
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
