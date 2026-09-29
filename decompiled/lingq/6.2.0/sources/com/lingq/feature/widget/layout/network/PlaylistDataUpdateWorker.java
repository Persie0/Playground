package com.lingq.feature.widget.layout.network;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.fa4;
import p000.jd7;
import p000.lg5;
import p000.mg5;
import p000.og5;
import p000.sz1;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaylistDataUpdateWorker extends CoroutineWorker {
    public static final jd7 Companion = new jd7();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistDataUpdateWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    public final Object mo2213d(Continuation continuation) throws Throwable {
        PlaylistDataUpdateWorker$doWork$1 playlistDataUpdateWorker$doWork$1;
        if (continuation instanceof PlaylistDataUpdateWorker$doWork$1) {
            playlistDataUpdateWorker$doWork$1 = (PlaylistDataUpdateWorker$doWork$1) continuation;
            int i = playlistDataUpdateWorker$doWork$1.f33844c;
            if ((i & Integer.MIN_VALUE) != 0) {
                playlistDataUpdateWorker$doWork$1.f33844c = i - Integer.MIN_VALUE;
            } else {
                playlistDataUpdateWorker$doWork$1 = new PlaylistDataUpdateWorker$doWork$1(this, (ContinuationImpl) continuation);
            }
        } else {
            playlistDataUpdateWorker$doWork$1 = new PlaylistDataUpdateWorker$doWork$1(this, (ContinuationImpl) continuation);
        }
        Object obj = playlistDataUpdateWorker$doWork$1.f33842a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = playlistDataUpdateWorker$doWork$1.f33844c;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    AbstractC3193b.m15359b(obj);
                    return og5.m17981a();
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            WorkerParameters workerParameters = this.f56132b;
            int i3 = workerParameters.f7167c;
            sz1 sz1Var = workerParameters.f7166b;
            if (i3 <= 3 && sz1Var.m21787e("language") != null) {
                sz1Var.m21785c("playlistId", 0);
                if (sz1Var.m21787e("playlistName") == null) {
                    return new lg5();
                }
                fa4.m11636J("useCase");
                throw null;
            }
            return new lg5();
        } catch (Throwable th) {
            th.printStackTrace();
            return new mg5();
        }
    }
}
