package com.lingq.core.data.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.lingq.core.data.repository.C1302r;
import com.lingq.core.network.api.requests.RequestPlaylistCreate;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.lg5;
import p000.mg5;
import p000.og5;
import p000.sz1;
import p000.xd7;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaylistUpdateWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public final xd7 f16789g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistUpdateWorker(Context context, WorkerParameters workerParameters, xd7 xd7Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        xd7Var.getClass();
        this.f16789g = xd7Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    public final Object mo2213d(Continuation continuation) throws Throwable {
        PlaylistUpdateWorker$doWork$1 playlistUpdateWorker$doWork$1;
        String strM21787e;
        String strM21787e2;
        String strM21787e3;
        if (continuation instanceof PlaylistUpdateWorker$doWork$1) {
            playlistUpdateWorker$doWork$1 = (PlaylistUpdateWorker$doWork$1) continuation;
            int i = playlistUpdateWorker$doWork$1.f16792c;
            if ((i & Integer.MIN_VALUE) != 0) {
                playlistUpdateWorker$doWork$1.f16792c = i - Integer.MIN_VALUE;
            } else {
                playlistUpdateWorker$doWork$1 = new PlaylistUpdateWorker$doWork$1(this, (ContinuationImpl) continuation);
            }
        } else {
            playlistUpdateWorker$doWork$1 = new PlaylistUpdateWorker$doWork$1(this, (ContinuationImpl) continuation);
        }
        Object obj = playlistUpdateWorker$doWork$1.f16790a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = playlistUpdateWorker$doWork$1.f16792c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                WorkerParameters workerParameters = this.f56132b;
                int i3 = workerParameters.f7167c;
                sz1 sz1Var = workerParameters.f7166b;
                if (i3 <= 3 && (strM21787e = sz1Var.m21787e("language")) != null && (strM21787e2 = sz1Var.m21787e("playlistId")) != null && (strM21787e3 = sz1Var.m21787e("titleLanguage")) != null) {
                    String strM21787e4 = sz1Var.m21787e("title");
                    xd7 xd7Var = this.f16789g;
                    playlistUpdateWorker$doWork$1.f16792c = 1;
                    Object objM21316g = ((C1302r) xd7Var).f16537f.m21316g(strM21787e, strM21787e2, new RequestPlaylistCreate(strM21787e4, strM21787e3), playlistUpdateWorker$doWork$1);
                    if (objM21316g != coroutineSingletons) {
                        objM21316g = xfa.f68157a;
                    }
                    if (objM21316g == coroutineSingletons) {
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
