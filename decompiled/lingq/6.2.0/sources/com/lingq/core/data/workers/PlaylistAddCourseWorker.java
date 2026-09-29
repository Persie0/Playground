package com.lingq.core.data.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.lingq.core.data.repository.C1302r;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.lg5;
import p000.mg5;
import p000.og5;
import p000.xd7;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaylistAddCourseWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public final xd7 f16777g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistAddCourseWorker(Context context, WorkerParameters workerParameters, xd7 xd7Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        xd7Var.getClass();
        this.f16777g = xd7Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    public final Object mo2213d(Continuation continuation) throws Throwable {
        PlaylistAddCourseWorker$doWork$1 playlistAddCourseWorker$doWork$1;
        WorkerParameters workerParameters = this.f56132b;
        if (continuation instanceof PlaylistAddCourseWorker$doWork$1) {
            playlistAddCourseWorker$doWork$1 = (PlaylistAddCourseWorker$doWork$1) continuation;
            int i = playlistAddCourseWorker$doWork$1.f16780c;
            if ((i & Integer.MIN_VALUE) != 0) {
                playlistAddCourseWorker$doWork$1.f16780c = i - Integer.MIN_VALUE;
            } else {
                playlistAddCourseWorker$doWork$1 = new PlaylistAddCourseWorker$doWork$1(this, (ContinuationImpl) continuation);
            }
        } else {
            playlistAddCourseWorker$doWork$1 = new PlaylistAddCourseWorker$doWork$1(this, (ContinuationImpl) continuation);
        }
        Object obj = playlistAddCourseWorker$doWork$1.f16778a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = playlistAddCourseWorker$doWork$1.f16780c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                String strM21787e = workerParameters.f7166b.m21787e("language");
                if (strM21787e == null) {
                    return new lg5();
                }
                int iM21785c = workerParameters.f7166b.m21785c("coursePk", 0);
                xd7 xd7Var = this.f16777g;
                playlistAddCourseWorker$doWork$1.f16780c = 1;
                if (((C1302r) xd7Var).m7352l(iM21785c, strM21787e, playlistAddCourseWorker$doWork$1) == coroutineSingletons) {
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
