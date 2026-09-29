package com.lingq.core.data.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.lingq.core.data.repository.C1306v;
import com.lingq.core.network.api.requests.RequestHintUpdate;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.df4;
import p000.lg5;
import p000.mg5;
import p000.nn1;
import p000.og5;
import p000.sz1;
import p000.w3a;
import p000.wfb;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
public final class HintUpdateWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public final w3a f16665g;

    /* JADX INFO: renamed from: h */
    public final nn1 f16666h;

    /* JADX INFO: renamed from: i */
    public final df4 f16667i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HintUpdateWorker(Context context, WorkerParameters workerParameters, w3a w3aVar, nn1 nn1Var, df4 df4Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        w3aVar.getClass();
        nn1Var.getClass();
        df4Var.getClass();
        this.f16665g = w3aVar;
        this.f16666h = nn1Var;
        this.f16667i = df4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        if (r11 == r1) goto L35;
     */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo2213d(Continuation continuation) throws Throwable {
        HintUpdateWorker$doWork$1 hintUpdateWorker$doWork$1;
        int iM21785c;
        if (continuation instanceof HintUpdateWorker$doWork$1) {
            hintUpdateWorker$doWork$1 = (HintUpdateWorker$doWork$1) continuation;
            int i = hintUpdateWorker$doWork$1.f16671d;
            if ((i & Integer.MIN_VALUE) != 0) {
                hintUpdateWorker$doWork$1.f16671d = i - Integer.MIN_VALUE;
            } else {
                hintUpdateWorker$doWork$1 = new HintUpdateWorker$doWork$1(this, (ContinuationImpl) continuation);
            }
        } else {
            hintUpdateWorker$doWork$1 = new HintUpdateWorker$doWork$1(this, (ContinuationImpl) continuation);
        }
        Object objM23905G = hintUpdateWorker$doWork$1.f16669b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = hintUpdateWorker$doWork$1.f16671d;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    iM21785c = hintUpdateWorker$doWork$1.f16668a;
                    AbstractC3193b.m15359b(objM23905G);
                } else {
                    if (i2 != 2) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(objM23905G);
                }
                return og5.m17981a();
            }
            AbstractC3193b.m15359b(objM23905G);
            WorkerParameters workerParameters = this.f56132b;
            int i3 = workerParameters.f7167c;
            sz1 sz1Var = workerParameters.f7166b;
            if (i3 > 3) {
                return new lg5();
            }
            iM21785c = sz1Var.m21785c("id", 0);
            String strM21787e = sz1Var.m21787e("data");
            if (strM21787e == null) {
                return new lg5();
            }
            nn1 nn1Var = this.f16666h;
            HintUpdateWorker$doWork$requestHintUpdate$1 hintUpdateWorker$doWork$requestHintUpdate$1 = new HintUpdateWorker$doWork$requestHintUpdate$1(this, strM21787e, null);
            hintUpdateWorker$doWork$1.f16668a = iM21785c;
            hintUpdateWorker$doWork$1.f16671d = 1;
            objM23905G = wfb.m23905G(hintUpdateWorker$doWork$requestHintUpdate$1, nn1Var, hintUpdateWorker$doWork$1);
            if (objM23905G == coroutineSingletons) {
            }
            return coroutineSingletons;
            RequestHintUpdate requestHintUpdate = (RequestHintUpdate) objM23905G;
            w3a w3aVar = this.f16665g;
            String str = requestHintUpdate.f20367b;
            String str2 = requestHintUpdate.f20366a;
            Integer num = requestHintUpdate.f20370e;
            hintUpdateWorker$doWork$1.f16668a = iM21785c;
            hintUpdateWorker$doWork$1.f16671d = 2;
            C1306v c1306v = (C1306v) w3aVar;
            c1306v.getClass();
            Object objM24255b = c1306v.f16560b.m24255b(new Integer(iM21785c), new RequestHintUpdate(str2, str, (String) null, (Boolean) null, num, 4), hintUpdateWorker$doWork$1);
            if (objM24255b != coroutineSingletons) {
                objM24255b = xfa.f68157a;
            }
        } catch (Throwable unused) {
            return new mg5();
        }
    }
}
