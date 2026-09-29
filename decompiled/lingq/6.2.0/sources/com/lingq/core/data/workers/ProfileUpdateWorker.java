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
public final class ProfileUpdateWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public final km7 f16801g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileUpdateWorker(Context context, WorkerParameters workerParameters, km7 km7Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        km7Var.getClass();
        this.f16801g = km7Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    public final Object mo2213d(Continuation continuation) throws Throwable {
        ProfileUpdateWorker$doWork$1 profileUpdateWorker$doWork$1;
        if (continuation instanceof ProfileUpdateWorker$doWork$1) {
            profileUpdateWorker$doWork$1 = (ProfileUpdateWorker$doWork$1) continuation;
            int i = profileUpdateWorker$doWork$1.f16804c;
            if ((i & Integer.MIN_VALUE) != 0) {
                profileUpdateWorker$doWork$1.f16804c = i - Integer.MIN_VALUE;
            } else {
                profileUpdateWorker$doWork$1 = new ProfileUpdateWorker$doWork$1(this, (ContinuationImpl) continuation);
            }
        } else {
            profileUpdateWorker$doWork$1 = new ProfileUpdateWorker$doWork$1(this, (ContinuationImpl) continuation);
        }
        Object obj = profileUpdateWorker$doWork$1.f16802a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = profileUpdateWorker$doWork$1.f16804c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                if (this.f56132b.f7167c > 3) {
                    return new lg5();
                }
                km7 km7Var = this.f16801g;
                profileUpdateWorker$doWork$1.f16804c = 1;
                if (((C1267a) km7Var).m7084m(profileUpdateWorker$doWork$1) == coroutineSingletons) {
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
        } catch (Throwable th) {
            th.printStackTrace();
            return new mg5();
        }
    }
}
