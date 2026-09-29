package com.lingq.core.data.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.lingq.core.data.profile.C1267a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.km7;
import p000.lg5;
import p000.mg5;
import p000.og5;

/* JADX INFO: loaded from: classes2.dex */
public final class LanguageUpdateWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public final km7 f16702g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageUpdateWorker(Context context, WorkerParameters workerParameters, km7 km7Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        km7Var.getClass();
        this.f16702g = km7Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    public final Object mo2213d(Continuation continuation) throws Throwable {
        LanguageUpdateWorker$doWork$1 languageUpdateWorker$doWork$1;
        String strM21787e;
        if (continuation instanceof LanguageUpdateWorker$doWork$1) {
            languageUpdateWorker$doWork$1 = (LanguageUpdateWorker$doWork$1) continuation;
            int i = languageUpdateWorker$doWork$1.f16705c;
            if ((i & Integer.MIN_VALUE) != 0) {
                languageUpdateWorker$doWork$1.f16705c = i - Integer.MIN_VALUE;
            } else {
                languageUpdateWorker$doWork$1 = new LanguageUpdateWorker$doWork$1(this, (ContinuationImpl) continuation);
            }
        } else {
            languageUpdateWorker$doWork$1 = new LanguageUpdateWorker$doWork$1(this, (ContinuationImpl) continuation);
        }
        Object obj = languageUpdateWorker$doWork$1.f16703a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = languageUpdateWorker$doWork$1.f16705c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                WorkerParameters workerParameters = this.f56132b;
                if (workerParameters.f7167c <= 3 && (strM21787e = workerParameters.f7166b.m21787e("language")) != null) {
                    km7 km7Var = this.f16702g;
                    languageUpdateWorker$doWork$1.f16705c = 1;
                    if (((C1267a) km7Var).m7083l(strM21787e, languageUpdateWorker$doWork$1) == coroutineSingletons) {
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
