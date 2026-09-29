package com.lingq.core.data.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.lingq.core.data.repository.C1293i;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.lg5;
import p000.lm4;
import p000.mg5;
import p000.og5;
import p000.sz1;

/* JADX INFO: loaded from: classes2.dex */
public final class LanguageSiteNotificationUpdateWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public final lm4 f16694g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageSiteNotificationUpdateWorker(Context context, WorkerParameters workerParameters, lm4 lm4Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        lm4Var.getClass();
        this.f16694g = lm4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    public final Object mo2213d(Continuation continuation) throws Throwable {
        LanguageSiteNotificationUpdateWorker$doWork$1 languageSiteNotificationUpdateWorker$doWork$1;
        String strM21787e;
        String strM21787e2;
        if (continuation instanceof LanguageSiteNotificationUpdateWorker$doWork$1) {
            languageSiteNotificationUpdateWorker$doWork$1 = (LanguageSiteNotificationUpdateWorker$doWork$1) continuation;
            int i = languageSiteNotificationUpdateWorker$doWork$1.f16697c;
            if ((i & Integer.MIN_VALUE) != 0) {
                languageSiteNotificationUpdateWorker$doWork$1.f16697c = i - Integer.MIN_VALUE;
            } else {
                languageSiteNotificationUpdateWorker$doWork$1 = new LanguageSiteNotificationUpdateWorker$doWork$1(this, (ContinuationImpl) continuation);
            }
        } else {
            languageSiteNotificationUpdateWorker$doWork$1 = new LanguageSiteNotificationUpdateWorker$doWork$1(this, (ContinuationImpl) continuation);
        }
        Object obj = languageSiteNotificationUpdateWorker$doWork$1.f16695a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = languageSiteNotificationUpdateWorker$doWork$1.f16697c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                WorkerParameters workerParameters = this.f56132b;
                int i3 = workerParameters.f7167c;
                sz1 sz1Var = workerParameters.f7166b;
                if (i3 <= 3 && (strM21787e = sz1Var.m21787e("language")) != null && (strM21787e2 = sz1Var.m21787e("lotd")) != null) {
                    lm4 lm4Var = this.f16694g;
                    languageSiteNotificationUpdateWorker$doWork$1.f16697c = 1;
                    if (((C1293i) lm4Var).m7212i(strM21787e, strM21787e2, languageSiteNotificationUpdateWorker$doWork$1) == coroutineSingletons) {
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
