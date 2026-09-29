package com.lingq.core.data.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.lingq.core.data.repository.C1296l;
import com.lingq.core.network.api.requests.RequestShelfPinUpdate;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.ca5;
import p000.lg5;
import p000.mg5;
import p000.og5;
import p000.sz1;
import p000.xfa;
import p000.y95;

/* JADX INFO: loaded from: classes2.dex */
public final class ShelfUpdatePinnedWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public final y95 f16805g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShelfUpdatePinnedWorker(Context context, WorkerParameters workerParameters, y95 y95Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        y95Var.getClass();
        this.f16805g = y95Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    public final Object mo2213d(Continuation continuation) throws Throwable {
        ShelfUpdatePinnedWorker$doWork$1 shelfUpdatePinnedWorker$doWork$1;
        String strM21787e;
        String strM21787e2;
        Object objM4464e;
        if (continuation instanceof ShelfUpdatePinnedWorker$doWork$1) {
            shelfUpdatePinnedWorker$doWork$1 = (ShelfUpdatePinnedWorker$doWork$1) continuation;
            int i = shelfUpdatePinnedWorker$doWork$1.f16808c;
            if ((i & Integer.MIN_VALUE) != 0) {
                shelfUpdatePinnedWorker$doWork$1.f16808c = i - Integer.MIN_VALUE;
            } else {
                shelfUpdatePinnedWorker$doWork$1 = new ShelfUpdatePinnedWorker$doWork$1(this, (ContinuationImpl) continuation);
            }
        } else {
            shelfUpdatePinnedWorker$doWork$1 = new ShelfUpdatePinnedWorker$doWork$1(this, (ContinuationImpl) continuation);
        }
        Object obj = shelfUpdatePinnedWorker$doWork$1.f16806a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = shelfUpdatePinnedWorker$doWork$1.f16808c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                WorkerParameters workerParameters = this.f56132b;
                int i3 = workerParameters.f7167c;
                sz1 sz1Var = workerParameters.f7166b;
                if (i3 <= 3 && (strM21787e = sz1Var.m21787e("language")) != null && (strM21787e2 = sz1Var.m21787e("shelfCode")) != null) {
                    boolean zM21783a = sz1Var.m21783a("pin", false);
                    y95 y95Var = this.f16805g;
                    shelfUpdatePinnedWorker$doWork$1.f16808c = 1;
                    C1296l c1296l = (C1296l) y95Var;
                    c1296l.getClass();
                    Object obj2 = xfa.f68157a;
                    RequestShelfPinUpdate requestShelfPinUpdate = new RequestShelfPinUpdate(strM21787e2);
                    ca5 ca5Var = c1296l.f16512b;
                    if (zM21783a) {
                        objM4464e = ca5Var.m4470k(strM21787e, requestShelfPinUpdate, shelfUpdatePinnedWorker$doWork$1);
                        if (objM4464e == coroutineSingletons) {
                            obj2 = objM4464e;
                        }
                    } else {
                        objM4464e = ca5Var.m4464e(strM21787e, requestShelfPinUpdate, shelfUpdatePinnedWorker$doWork$1);
                        if (objM4464e == coroutineSingletons) {
                            obj2 = objM4464e;
                        }
                    }
                    if (obj2 == coroutineSingletons) {
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
