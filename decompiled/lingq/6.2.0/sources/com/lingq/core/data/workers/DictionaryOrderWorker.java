package com.lingq.core.data.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.lingq.core.data.repository.C1292h;
import com.lingq.core.network.api.requests.RequestDictionariesOrder;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.df4;
import p000.lg5;
import p000.mg5;
import p000.og5;
import p000.sz1;
import p000.xf2;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
public final class DictionaryOrderWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public final xf2 f16660g;

    /* JADX INFO: renamed from: h */
    public final df4 f16661h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionaryOrderWorker(Context context, WorkerParameters workerParameters, xf2 xf2Var, df4 df4Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        xf2Var.getClass();
        df4Var.getClass();
        this.f16660g = xf2Var;
        this.f16661h = df4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    public final Object mo2213d(Continuation continuation) throws Throwable {
        DictionaryOrderWorker$doWork$1 dictionaryOrderWorker$doWork$1;
        String strM21787e;
        String strM21787e2;
        if (continuation instanceof DictionaryOrderWorker$doWork$1) {
            dictionaryOrderWorker$doWork$1 = (DictionaryOrderWorker$doWork$1) continuation;
            int i = dictionaryOrderWorker$doWork$1.f16664c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dictionaryOrderWorker$doWork$1.f16664c = i - Integer.MIN_VALUE;
            } else {
                dictionaryOrderWorker$doWork$1 = new DictionaryOrderWorker$doWork$1(this, (ContinuationImpl) continuation);
            }
        } else {
            dictionaryOrderWorker$doWork$1 = new DictionaryOrderWorker$doWork$1(this, (ContinuationImpl) continuation);
        }
        Object obj = dictionaryOrderWorker$doWork$1.f16662a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = dictionaryOrderWorker$doWork$1.f16664c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                WorkerParameters workerParameters = this.f56132b;
                int i3 = workerParameters.f7167c;
                sz1 sz1Var = workerParameters.f7166b;
                if (i3 <= 3 && (strM21787e = sz1Var.m21787e("language")) != null && (strM21787e2 = sz1Var.m21787e("data")) != null) {
                    df4 df4Var = this.f16661h;
                    df4Var.getClass();
                    RequestDictionariesOrder requestDictionariesOrder = (RequestDictionariesOrder) df4Var.m10321a(strM21787e2, RequestDictionariesOrder.Companion.serializer());
                    xf2 xf2Var = this.f16660g;
                    List list = requestDictionariesOrder.f20356a;
                    if (list == null) {
                        list = EmptyList.f47638a;
                    }
                    dictionaryOrderWorker$doWork$1.f16664c = 1;
                    C1292h c1292h = (C1292h) xf2Var;
                    c1292h.getClass();
                    RequestDictionariesOrder requestDictionariesOrder2 = new RequestDictionariesOrder();
                    requestDictionariesOrder2.f20356a = list;
                    Object objM25111c = c1292h.f16485d.m25111c(strM21787e, requestDictionariesOrder2, dictionaryOrderWorker$doWork$1);
                    if (objM25111c != coroutineSingletons) {
                        objM25111c = xfa.f68157a;
                    }
                    if (objM25111c == coroutineSingletons) {
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
