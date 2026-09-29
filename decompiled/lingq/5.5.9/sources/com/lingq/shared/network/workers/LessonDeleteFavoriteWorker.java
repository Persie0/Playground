package com.lingq.shared.network.workers;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import ci.InterfaceC2019l;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m13365d2 = {"Lcom/lingq/shared/network/workers/LessonDeleteFavoriteWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lci/l;", "playlistRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lci/l;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LessonDeleteFavoriteWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: h */
    public final InterfaceC2019l f19266h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonDeleteFavoriteWorker(Context context, WorkerParameters workerParameters, InterfaceC2019l interfaceC2019l) {
        super(context, workerParameters);
        C5207g.m11111f(context, "appContext");
        C5207g.m11111f(workerParameters, "workerParams");
        C5207g.m11111f(interfaceC2019l, "playlistRepository");
        this.f19266h = interfaceC2019l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: g */
    public final Object mo4698g(InterfaceC9968c<? super AbstractC1246d.a> interfaceC9968c) throws Throwable {
        LessonDeleteFavoriteWorker$doWork$1 lessonDeleteFavoriteWorker$doWork$1;
        String strM4707e;
        if (interfaceC9968c instanceof LessonDeleteFavoriteWorker$doWork$1) {
            lessonDeleteFavoriteWorker$doWork$1 = (LessonDeleteFavoriteWorker$doWork$1) interfaceC9968c;
            int i10 = lessonDeleteFavoriteWorker$doWork$1.f19269f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lessonDeleteFavoriteWorker$doWork$1.f19269f = i10 - Integer.MIN_VALUE;
            } else {
                lessonDeleteFavoriteWorker$doWork$1 = new LessonDeleteFavoriteWorker$doWork$1(this, interfaceC9968c);
            }
        } else {
            lessonDeleteFavoriteWorker$doWork$1 = new LessonDeleteFavoriteWorker$doWork$1(this, interfaceC9968c);
        }
        Object obj = lessonDeleteFavoriteWorker$doWork$1.f19267d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = lessonDeleteFavoriteWorker$doWork$1.f19269f;
        try {
            if (i11 == 0) {
                C7499b.m14977z0(obj);
                WorkerParameters workerParameters = this.f7829b;
                if (workerParameters.f7803c <= 3 && (strM4707e = workerParameters.f7802b.m4707e("language")) != null) {
                    int iM4705c = workerParameters.f7802b.m4705c("lessonId", 0);
                    InterfaceC2019l interfaceC2019l = this.f19266h;
                    lessonDeleteFavoriteWorker$doWork$1.f19269f = 1;
                    if (interfaceC2019l.mo6098D(iM4705c, strM4707e, lessonDeleteFavoriteWorker$doWork$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return new AbstractC1246d.a.C10594a();
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
            return new AbstractC1246d.a.c();
        } catch (Throwable unused) {
            return new AbstractC1246d.a.b();
        }
    }
}
