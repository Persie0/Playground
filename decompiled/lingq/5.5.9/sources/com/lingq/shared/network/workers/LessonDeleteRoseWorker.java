package com.lingq.shared.network.workers;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.repository.InterfaceC3324a;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m13365d2 = {"Lcom/lingq/shared/network/workers/LessonDeleteRoseWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LessonDeleteRoseWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: h */
    public InterfaceC3324a f19270h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonDeleteRoseWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C5207g.m11111f(context, "appContext");
        C5207g.m11111f(workerParameters, "workerParams");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: g */
    public final Object mo4698g(InterfaceC9968c<? super AbstractC1246d.a> interfaceC9968c) throws Throwable {
        LessonDeleteRoseWorker$doWork$1 lessonDeleteRoseWorker$doWork$1;
        WorkerParameters workerParameters = this.f7829b;
        if (interfaceC9968c instanceof LessonDeleteRoseWorker$doWork$1) {
            lessonDeleteRoseWorker$doWork$1 = (LessonDeleteRoseWorker$doWork$1) interfaceC9968c;
            int i10 = lessonDeleteRoseWorker$doWork$1.f19273f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lessonDeleteRoseWorker$doWork$1.f19273f = i10 - Integer.MIN_VALUE;
            } else {
                lessonDeleteRoseWorker$doWork$1 = new LessonDeleteRoseWorker$doWork$1(this, interfaceC9968c);
            }
        } else {
            lessonDeleteRoseWorker$doWork$1 = new LessonDeleteRoseWorker$doWork$1(this, interfaceC9968c);
        }
        Object obj = lessonDeleteRoseWorker$doWork$1.f19271d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = lessonDeleteRoseWorker$doWork$1.f19273f;
        try {
            if (i11 == 0) {
                C7499b.m14977z0(obj);
                String strM4707e = workerParameters.f7802b.m4707e("language");
                if (strM4707e == null) {
                    return new AbstractC1246d.a.C10594a();
                }
                int iM4705c = workerParameters.f7802b.m4705c("lessonId", 0);
                InterfaceC3324a interfaceC3324a = this.f19270h;
                if (interfaceC3324a == null) {
                    C5207g.m11117l("lessonRepository");
                    throw null;
                }
                lessonDeleteRoseWorker$doWork$1.f19273f = 1;
                if (interfaceC3324a.mo9491M(iM4705c, strM4707e, lessonDeleteRoseWorker$doWork$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return new AbstractC1246d.a.c();
        } catch (Throwable unused) {
            return new AbstractC1246d.a.b();
        }
    }
}
