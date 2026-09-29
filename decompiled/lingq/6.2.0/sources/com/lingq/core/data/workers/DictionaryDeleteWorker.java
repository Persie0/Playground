package com.lingq.core.data.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.lingq.core.data.repository.C1292h;
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
public final class DictionaryDeleteWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public final xf2 f16656g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionaryDeleteWorker(Context context, WorkerParameters workerParameters, xf2 xf2Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        xf2Var.getClass();
        this.f16656g = xf2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    public final Object mo2213d(Continuation continuation) throws Throwable {
        DictionaryDeleteWorker$doWork$1 dictionaryDeleteWorker$doWork$1;
        String strM21787e;
        if (continuation instanceof DictionaryDeleteWorker$doWork$1) {
            dictionaryDeleteWorker$doWork$1 = (DictionaryDeleteWorker$doWork$1) continuation;
            int i = dictionaryDeleteWorker$doWork$1.f16659c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dictionaryDeleteWorker$doWork$1.f16659c = i - Integer.MIN_VALUE;
            } else {
                dictionaryDeleteWorker$doWork$1 = new DictionaryDeleteWorker$doWork$1(this, (ContinuationImpl) continuation);
            }
        } else {
            dictionaryDeleteWorker$doWork$1 = new DictionaryDeleteWorker$doWork$1(this, (ContinuationImpl) continuation);
        }
        Object obj = dictionaryDeleteWorker$doWork$1.f16657a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = dictionaryDeleteWorker$doWork$1.f16659c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                WorkerParameters workerParameters = this.f56132b;
                int i3 = workerParameters.f7167c;
                sz1 sz1Var = workerParameters.f7166b;
                if (i3 <= 3 && (strM21787e = sz1Var.m21787e("language")) != null) {
                    int iM21785c = sz1Var.m21785c("pk", 0);
                    xf2 xf2Var = this.f16656g;
                    dictionaryDeleteWorker$doWork$1.f16659c = 1;
                    Object objM25109a = ((C1292h) xf2Var).f16485d.m25109a(strM21787e, new Integer(iM21785c), dictionaryDeleteWorker$doWork$1);
                    if (objM25109a != coroutineSingletons) {
                        objM25109a = xfa.f68157a;
                    }
                    if (objM25109a == coroutineSingletons) {
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
