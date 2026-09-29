package com.lingq.core.data.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.lingq.core.data.repository.C1310z;
import com.lingq.core.network.api.requests.RequestWordsUpdate;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.C3474pv;
import p000.lg5;
import p000.mg5;
import p000.og5;
import p000.s7b;
import p000.sz1;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
public final class WordUpdateIgnoreStatusWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public final s7b f16809g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WordUpdateIgnoreStatusWorker(Context context, WorkerParameters workerParameters, s7b s7bVar) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        s7bVar.getClass();
        this.f16809g = s7bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    public final Object mo2213d(Continuation continuation) throws Throwable {
        WordUpdateIgnoreStatusWorker$doWork$1 wordUpdateIgnoreStatusWorker$doWork$1;
        String strM21787e;
        if (continuation instanceof WordUpdateIgnoreStatusWorker$doWork$1) {
            wordUpdateIgnoreStatusWorker$doWork$1 = (WordUpdateIgnoreStatusWorker$doWork$1) continuation;
            int i = wordUpdateIgnoreStatusWorker$doWork$1.f16812c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wordUpdateIgnoreStatusWorker$doWork$1.f16812c = i - Integer.MIN_VALUE;
            } else {
                wordUpdateIgnoreStatusWorker$doWork$1 = new WordUpdateIgnoreStatusWorker$doWork$1(this, (ContinuationImpl) continuation);
            }
        } else {
            wordUpdateIgnoreStatusWorker$doWork$1 = new WordUpdateIgnoreStatusWorker$doWork$1(this, (ContinuationImpl) continuation);
        }
        Object obj = wordUpdateIgnoreStatusWorker$doWork$1.f16810a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = wordUpdateIgnoreStatusWorker$doWork$1.f16812c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                WorkerParameters workerParameters = this.f56132b;
                int i3 = workerParameters.f7167c;
                sz1 sz1Var = workerParameters.f7166b;
                if (i3 <= 3 && (strM21787e = sz1Var.m21787e("language")) != null) {
                    int iM21785c = sz1Var.m21785c("lessonId", 0);
                    int[] iArrM21786d = sz1Var.m21786d("wordIds");
                    if (iArrM21786d == null) {
                        return new lg5();
                    }
                    C3474pv c3474pv = new C3474pv(iArrM21786d);
                    s7b s7bVar = this.f16809g;
                    wordUpdateIgnoreStatusWorker$doWork$1.f16812c = 1;
                    C1310z c1310z = (C1310z) s7bVar;
                    c1310z.getClass();
                    RequestWordsUpdate requestWordsUpdate = new RequestWordsUpdate();
                    requestWordsUpdate.f20492b = iM21785c;
                    requestWordsUpdate.f20491a = c3474pv;
                    Object objM21894a = c1310z.f16578c.m21894a(strM21787e, requestWordsUpdate, wordUpdateIgnoreStatusWorker$doWork$1);
                    if (objM21894a != coroutineSingletons) {
                        objM21894a = xfa.f68157a;
                    }
                    if (objM21894a == coroutineSingletons) {
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
        } catch (Throwable unused) {
            return new mg5();
        }
    }
}
