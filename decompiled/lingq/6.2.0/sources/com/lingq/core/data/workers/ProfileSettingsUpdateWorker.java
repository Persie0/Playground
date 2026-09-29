package com.lingq.core.data.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.df4;
import p000.km7;
import p000.lg5;
import p000.mg5;
import p000.nn1;
import p000.og5;
import p000.wfb;

/* JADX INFO: loaded from: classes2.dex */
public final class ProfileSettingsUpdateWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public final km7 f16793g;

    /* JADX INFO: renamed from: h */
    public final nn1 f16794h;

    /* JADX INFO: renamed from: i */
    public final df4 f16795i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileSettingsUpdateWorker(Context context, WorkerParameters workerParameters, km7 km7Var, nn1 nn1Var, df4 df4Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        km7Var.getClass();
        nn1Var.getClass();
        df4Var.getClass();
        this.f16793g = km7Var;
        this.f16794h = nn1Var;
        this.f16795i = df4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
    
        if (((com.lingq.core.data.profile.C1267a) r7).m7081j((com.lingq.core.domain.model.user.ProfileSettings) r8, r0) == r1) goto L31;
     */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo2213d(Continuation continuation) throws Throwable {
        ProfileSettingsUpdateWorker$doWork$1 profileSettingsUpdateWorker$doWork$1;
        String strM21787e;
        if (continuation instanceof ProfileSettingsUpdateWorker$doWork$1) {
            profileSettingsUpdateWorker$doWork$1 = (ProfileSettingsUpdateWorker$doWork$1) continuation;
            int i = profileSettingsUpdateWorker$doWork$1.f16798c;
            if ((i & Integer.MIN_VALUE) != 0) {
                profileSettingsUpdateWorker$doWork$1.f16798c = i - Integer.MIN_VALUE;
            } else {
                profileSettingsUpdateWorker$doWork$1 = new ProfileSettingsUpdateWorker$doWork$1(this, (ContinuationImpl) continuation);
            }
        } else {
            profileSettingsUpdateWorker$doWork$1 = new ProfileSettingsUpdateWorker$doWork$1(this, (ContinuationImpl) continuation);
        }
        Object objM23905G = profileSettingsUpdateWorker$doWork$1.f16796a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = profileSettingsUpdateWorker$doWork$1.f16798c;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
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
            if (workerParameters.f7167c <= 3 && (strM21787e = workerParameters.f7166b.m21787e("settings")) != null) {
                nn1 nn1Var = this.f16794h;
                ProfileSettingsUpdateWorker$doWork$profileSettings$1 profileSettingsUpdateWorker$doWork$profileSettings$1 = new ProfileSettingsUpdateWorker$doWork$profileSettings$1(this, strM21787e, null);
                profileSettingsUpdateWorker$doWork$1.f16798c = 1;
                objM23905G = wfb.m23905G(profileSettingsUpdateWorker$doWork$profileSettings$1, nn1Var, profileSettingsUpdateWorker$doWork$1);
                if (objM23905G == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            return new lg5();
            km7 km7Var = this.f16793g;
            profileSettingsUpdateWorker$doWork$1.f16798c = 2;
        } catch (Throwable th) {
            th.printStackTrace();
            return new mg5();
        }
    }
}
