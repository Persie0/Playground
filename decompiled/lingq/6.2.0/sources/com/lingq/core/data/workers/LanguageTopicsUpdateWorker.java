package com.lingq.core.data.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.lingq.core.data.repository.C1293i;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.AbstractC3550rv;
import p000.C3386nv;
import p000.lg5;
import p000.lm4;
import p000.mg5;
import p000.og5;
import p000.sz1;

/* JADX INFO: loaded from: classes2.dex */
public final class LanguageTopicsUpdateWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public final lm4 f16698g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageTopicsUpdateWorker(Context context, WorkerParameters workerParameters, lm4 lm4Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        lm4Var.getClass();
        this.f16698g = lm4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    public final Object mo2213d(Continuation continuation) throws Throwable {
        LanguageTopicsUpdateWorker$doWork$1 languageTopicsUpdateWorker$doWork$1;
        String strM21787e;
        String[] strArrM21788f;
        if (continuation instanceof LanguageTopicsUpdateWorker$doWork$1) {
            languageTopicsUpdateWorker$doWork$1 = (LanguageTopicsUpdateWorker$doWork$1) continuation;
            int i = languageTopicsUpdateWorker$doWork$1.f16701c;
            if ((i & Integer.MIN_VALUE) != 0) {
                languageTopicsUpdateWorker$doWork$1.f16701c = i - Integer.MIN_VALUE;
            } else {
                languageTopicsUpdateWorker$doWork$1 = new LanguageTopicsUpdateWorker$doWork$1(this, (ContinuationImpl) continuation);
            }
        } else {
            languageTopicsUpdateWorker$doWork$1 = new LanguageTopicsUpdateWorker$doWork$1(this, (ContinuationImpl) continuation);
        }
        Object obj = languageTopicsUpdateWorker$doWork$1.f16699a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = languageTopicsUpdateWorker$doWork$1.f16701c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                WorkerParameters workerParameters = this.f56132b;
                int i3 = workerParameters.f7167c;
                sz1 sz1Var = workerParameters.f7166b;
                if (i3 <= 3 && (strM21787e = sz1Var.m21787e("language")) != null && (strArrM21788f = sz1Var.m21788f("topics")) != null) {
                    lm4 lm4Var = this.f16698g;
                    Set setM20855w0 = AbstractC3550rv.m20855w0(strArrM21788f);
                    languageTopicsUpdateWorker$doWork$1.f16701c = 1;
                    if (((C1293i) lm4Var).m7213j(strM21787e, setM20855w0, languageTopicsUpdateWorker$doWork$1) == coroutineSingletons) {
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
