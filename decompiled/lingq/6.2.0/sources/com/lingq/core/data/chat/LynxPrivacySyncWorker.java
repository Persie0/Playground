package com.lingq.core.data.chat;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.lingq.core.data.repository.C1289e;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.lg5;
import p000.mg5;
import p000.og5;
import p000.sz1;
import p000.tn5;
import p000.xm5;
import p000.ym5;
import p000.zw0;

/* JADX INFO: loaded from: classes2.dex */
public final class LynxPrivacySyncWorker extends CoroutineWorker {
    public static final tn5 Companion = new tn5();

    /* JADX INFO: renamed from: g */
    public final zw0 f14403g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxPrivacySyncWorker(Context context, WorkerParameters workerParameters, zw0 zw0Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        zw0Var.getClass();
        this.f14403g = zw0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        if (r8 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0093, code lost:
    
        if (r8 == r1) goto L38;
     */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo2213d(Continuation continuation) throws Throwable {
        LynxPrivacySyncWorker$doWork$1 lynxPrivacySyncWorker$doWork$1;
        String strM21787e;
        String strM21787e2;
        ym5 ym5Var;
        if (continuation instanceof LynxPrivacySyncWorker$doWork$1) {
            lynxPrivacySyncWorker$doWork$1 = (LynxPrivacySyncWorker$doWork$1) continuation;
            int i = lynxPrivacySyncWorker$doWork$1.f14406c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lynxPrivacySyncWorker$doWork$1.f14406c = i - Integer.MIN_VALUE;
            } else {
                lynxPrivacySyncWorker$doWork$1 = new LynxPrivacySyncWorker$doWork$1(this, (ContinuationImpl) continuation);
            }
        } else {
            lynxPrivacySyncWorker$doWork$1 = new LynxPrivacySyncWorker$doWork$1(this, (ContinuationImpl) continuation);
        }
        Object objM7171u = lynxPrivacySyncWorker$doWork$1.f14404a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = lynxPrivacySyncWorker$doWork$1.f14406c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM7171u);
            WorkerParameters workerParameters = this.f56132b;
            int i3 = workerParameters.f7167c;
            sz1 sz1Var = workerParameters.f7166b;
            if (i3 <= 3 && (strM21787e = sz1Var.m21787e("language")) != null && (strM21787e2 = sz1Var.m21787e("setting")) != null) {
                boolean zM21783a = sz1Var.m21783a("enabled", true);
                boolean zEquals = strM21787e2.equals("memory");
                zw0 zw0Var = this.f14403g;
                if (zEquals) {
                    lynxPrivacySyncWorker$doWork$1.f14406c = 1;
                    objM7171u = ((C1289e) zw0Var).m7172v(strM21787e, zM21783a, lynxPrivacySyncWorker$doWork$1);
                } else {
                    if (!strM21787e2.equals("data_improvement")) {
                        return new lg5();
                    }
                    lynxPrivacySyncWorker$doWork$1.f14406c = 2;
                    objM7171u = ((C1289e) zw0Var).m7171u(strM21787e, zM21783a, lynxPrivacySyncWorker$doWork$1);
                }
                return coroutineSingletons;
            }
            return new lg5();
        }
        if (i2 == 1) {
            AbstractC3193b.m15359b(objM7171u);
            ym5Var = (ym5) objM7171u;
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM7171u);
            ym5Var = (ym5) objM7171u;
        }
        return ym5Var instanceof xm5 ? og5.m17981a() : new mg5();
    }
}
