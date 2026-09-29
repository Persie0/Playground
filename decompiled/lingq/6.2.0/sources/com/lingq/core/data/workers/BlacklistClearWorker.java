package com.lingq.core.data.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.lingq.core.data.repository.C1286b;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.fa4;
import p000.lg5;
import p000.mg5;
import p000.og5;

/* JADX INFO: loaded from: classes2.dex */
public final class BlacklistClearWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public C1286b f16596g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlacklistClearWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    public final Object mo2213d(Continuation continuation) throws Throwable {
        BlacklistClearWorker$doWork$1 blacklistClearWorker$doWork$1;
        if (continuation instanceof BlacklistClearWorker$doWork$1) {
            blacklistClearWorker$doWork$1 = (BlacklistClearWorker$doWork$1) continuation;
            int i = blacklistClearWorker$doWork$1.f16599c;
            if ((i & Integer.MIN_VALUE) != 0) {
                blacklistClearWorker$doWork$1.f16599c = i - Integer.MIN_VALUE;
            } else {
                blacklistClearWorker$doWork$1 = new BlacklistClearWorker$doWork$1(this, (ContinuationImpl) continuation);
            }
        } else {
            blacklistClearWorker$doWork$1 = new BlacklistClearWorker$doWork$1(this, (ContinuationImpl) continuation);
        }
        Object obj = blacklistClearWorker$doWork$1.f16597a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = blacklistClearWorker$doWork$1.f16599c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                WorkerParameters workerParameters = this.f56132b;
                if (workerParameters.f7167c > 3) {
                    return new lg5();
                }
                int iM21785c = workerParameters.f7166b.m21785c("contextId", 0);
                C1286b c1286b = this.f16596g;
                if (c1286b == null) {
                    fa4.m11636J("blacklistRepository");
                    throw null;
                }
                blacklistClearWorker$doWork$1.f16599c = 1;
                if (c1286b.m7109k(iM21785c, blacklistClearWorker$doWork$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return og5.m17981a();
        } catch (Throwable unused) {
            return new mg5();
        }
    }
}
