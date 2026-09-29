package com.lingq.core.data.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.lingq.core.data.repository.C1302r;
import com.lingq.core.network.api.requests.RequestPlaylistLessonAction;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.lg5;
import p000.mg5;
import p000.og5;
import p000.se7;
import p000.sz1;
import p000.xd7;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaylistLessonActionWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public final xd7 f16785g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistLessonActionWorker(Context context, WorkerParameters workerParameters, xd7 xd7Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        xd7Var.getClass();
        this.f16785g = xd7Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    public final Object mo2213d(Continuation continuation) throws Throwable {
        PlaylistLessonActionWorker$doWork$1 playlistLessonActionWorker$doWork$1;
        String strM21787e;
        String strM21787e2;
        String strM21787e3;
        String strM21787e4;
        if (continuation instanceof PlaylistLessonActionWorker$doWork$1) {
            playlistLessonActionWorker$doWork$1 = (PlaylistLessonActionWorker$doWork$1) continuation;
            int i = playlistLessonActionWorker$doWork$1.f16788c;
            if ((i & Integer.MIN_VALUE) != 0) {
                playlistLessonActionWorker$doWork$1.f16788c = i - Integer.MIN_VALUE;
            } else {
                playlistLessonActionWorker$doWork$1 = new PlaylistLessonActionWorker$doWork$1(this, (ContinuationImpl) continuation);
            }
        } else {
            playlistLessonActionWorker$doWork$1 = new PlaylistLessonActionWorker$doWork$1(this, (ContinuationImpl) continuation);
        }
        Object obj = playlistLessonActionWorker$doWork$1.f16786a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = playlistLessonActionWorker$doWork$1.f16788c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                WorkerParameters workerParameters = this.f56132b;
                int i3 = workerParameters.f7167c;
                sz1 sz1Var = workerParameters.f7166b;
                if (i3 <= 3 && (strM21787e = sz1Var.m21787e("language")) != null && (strM21787e2 = sz1Var.m21787e("playlistId")) != null && (strM21787e3 = sz1Var.m21787e("lessonURL")) != null && (strM21787e4 = sz1Var.m21787e("action")) != null) {
                    int iM21785c = sz1Var.m21785c("position", 0);
                    xd7 xd7Var = this.f16785g;
                    Integer num = new Integer(iM21785c);
                    playlistLessonActionWorker$doWork$1.f16788c = 1;
                    se7 se7Var = ((C1302r) xd7Var).f16537f;
                    RequestPlaylistLessonAction requestPlaylistLessonAction = new RequestPlaylistLessonAction();
                    requestPlaylistLessonAction.f20417a = strM21787e3;
                    requestPlaylistLessonAction.f20418b = strM21787e4;
                    requestPlaylistLessonAction.f20419c = num;
                    Object objM21312c = se7Var.m21312c(strM21787e, strM21787e2, requestPlaylistLessonAction, playlistLessonActionWorker$doWork$1);
                    if (objM21312c != coroutineSingletons) {
                        objM21312c = xfa.f68157a;
                    }
                    if (objM21312c == coroutineSingletons) {
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
