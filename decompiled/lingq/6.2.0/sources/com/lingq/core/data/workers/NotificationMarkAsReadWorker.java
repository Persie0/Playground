package com.lingq.core.data.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.lingq.core.data.repository.C1300p;
import com.lingq.core.network.api.requests.RequestNotification;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.AbstractC3550rv;
import p000.C3386nv;
import p000.en6;
import p000.lg5;
import p000.mg5;
import p000.og5;
import p000.sz1;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
public final class NotificationMarkAsReadWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public final en6 f16773g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationMarkAsReadWorker(Context context, WorkerParameters workerParameters, en6 en6Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        en6Var.getClass();
        this.f16773g = en6Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    public final Object mo2213d(Continuation continuation) throws Throwable {
        NotificationMarkAsReadWorker$doWork$1 notificationMarkAsReadWorker$doWork$1;
        String strM21787e;
        int[] iArrM21786d;
        if (continuation instanceof NotificationMarkAsReadWorker$doWork$1) {
            notificationMarkAsReadWorker$doWork$1 = (NotificationMarkAsReadWorker$doWork$1) continuation;
            int i = notificationMarkAsReadWorker$doWork$1.f16776c;
            if ((i & Integer.MIN_VALUE) != 0) {
                notificationMarkAsReadWorker$doWork$1.f16776c = i - Integer.MIN_VALUE;
            } else {
                notificationMarkAsReadWorker$doWork$1 = new NotificationMarkAsReadWorker$doWork$1(this, (ContinuationImpl) continuation);
            }
        } else {
            notificationMarkAsReadWorker$doWork$1 = new NotificationMarkAsReadWorker$doWork$1(this, (ContinuationImpl) continuation);
        }
        Object obj = notificationMarkAsReadWorker$doWork$1.f16774a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = notificationMarkAsReadWorker$doWork$1.f16776c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                WorkerParameters workerParameters = this.f56132b;
                int i3 = workerParameters.f7167c;
                sz1 sz1Var = workerParameters.f7166b;
                if (i3 <= 3 && (strM21787e = sz1Var.m21787e("language")) != null && (iArrM21786d = sz1Var.m21786d("ids")) != null) {
                    en6 en6Var = this.f16773g;
                    List listM20850r0 = AbstractC3550rv.m20850r0(iArrM21786d);
                    notificationMarkAsReadWorker$doWork$1.f16776c = 1;
                    Object objM11953a = ((C1300p) en6Var).f16528b.m11953a(strM21787e, new RequestNotification(listM20850r0), notificationMarkAsReadWorker$doWork$1);
                    if (objM11953a != coroutineSingletons) {
                        objM11953a = xfa.f68157a;
                    }
                    if (objM11953a == coroutineSingletons) {
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
