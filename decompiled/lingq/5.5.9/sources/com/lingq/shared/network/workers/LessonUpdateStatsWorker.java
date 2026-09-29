package com.lingq.shared.network.workers;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.C1244b;
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
@Metadata(m13364d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m13365d2 = {"Lcom/lingq/shared/network/workers/LessonUpdateStatsWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LessonUpdateStatsWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: h */
    public InterfaceC3324a f19294h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonUpdateStatsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C5207g.m11111f(context, "appContext");
        C5207g.m11111f(workerParameters, "workerParams");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: g */
    public final Object mo4698g(InterfaceC9968c<? super AbstractC1246d.a> interfaceC9968c) throws Throwable {
        LessonUpdateStatsWorker$doWork$1 lessonUpdateStatsWorker$doWork$1;
        String strM4707e;
        if (interfaceC9968c instanceof LessonUpdateStatsWorker$doWork$1) {
            lessonUpdateStatsWorker$doWork$1 = (LessonUpdateStatsWorker$doWork$1) interfaceC9968c;
            int i10 = lessonUpdateStatsWorker$doWork$1.f19297f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lessonUpdateStatsWorker$doWork$1.f19297f = i10 - Integer.MIN_VALUE;
            } else {
                lessonUpdateStatsWorker$doWork$1 = new LessonUpdateStatsWorker$doWork$1(this, interfaceC9968c);
            }
        } else {
            lessonUpdateStatsWorker$doWork$1 = new LessonUpdateStatsWorker$doWork$1(this, interfaceC9968c);
        }
        LessonUpdateStatsWorker$doWork$1 lessonUpdateStatsWorker$doWork$2 = lessonUpdateStatsWorker$doWork$1;
        Object obj = lessonUpdateStatsWorker$doWork$2.f19295d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = lessonUpdateStatsWorker$doWork$2.f19297f;
        try {
            if (i11 == 0) {
                C7499b.m14977z0(obj);
                WorkerParameters workerParameters = this.f7829b;
                int i12 = workerParameters.f7803c;
                C1244b c1244b = workerParameters.f7802b;
                if (i12 <= 3 && (strM4707e = c1244b.m4707e("language")) != null) {
                    int iM4705c = c1244b.m4705c("lessonId", 0);
                    double dM4704b = c1244b.m4704b("listenTimes");
                    double dM4704b2 = c1244b.m4704b("readTimes");
                    Object obj2 = c1244b.f7824a.get("automatic");
                    boolean zBooleanValue = obj2 instanceof Boolean ? ((Boolean) obj2).booleanValue() : false;
                    InterfaceC3324a interfaceC3324a = this.f19294h;
                    if (interfaceC3324a == null) {
                        C5207g.m11117l("lessonRepository");
                        throw null;
                    }
                    boolean z10 = zBooleanValue;
                    lessonUpdateStatsWorker$doWork$2.f19297f = 1;
                    if (interfaceC3324a.mo9495Q(dM4704b, dM4704b2, iM4705c, strM4707e, lessonUpdateStatsWorker$doWork$2, z10) == coroutineSingletons) {
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
