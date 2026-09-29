package com.lingq.shared.network.workers;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import th.InterfaceC9284a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m13365d2 = {"Lcom/lingq/shared/network/workers/LessonReportWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lth/a;", "reportDelegate", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lth/a;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LessonReportWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: h */
    public final InterfaceC9284a f19286h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonReportWorker(Context context, WorkerParameters workerParameters, InterfaceC9284a interfaceC9284a) {
        super(context, workerParameters);
        C5207g.m11111f(context, "appContext");
        C5207g.m11111f(workerParameters, "workerParams");
        C5207g.m11111f(interfaceC9284a, "reportDelegate");
        this.f19286h = interfaceC9284a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: g */
    public final Object mo4698g(InterfaceC9968c<? super AbstractC1246d.a> interfaceC9968c) throws Throwable {
        LessonReportWorker$doWork$1 lessonReportWorker$doWork$1;
        String strM4707e;
        String strM4707e2;
        if (interfaceC9968c instanceof LessonReportWorker$doWork$1) {
            lessonReportWorker$doWork$1 = (LessonReportWorker$doWork$1) interfaceC9968c;
            int i10 = lessonReportWorker$doWork$1.f19289f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lessonReportWorker$doWork$1.f19289f = i10 - Integer.MIN_VALUE;
            } else {
                lessonReportWorker$doWork$1 = new LessonReportWorker$doWork$1(this, interfaceC9968c);
            }
        } else {
            lessonReportWorker$doWork$1 = new LessonReportWorker$doWork$1(this, interfaceC9968c);
        }
        LessonReportWorker$doWork$1 lessonReportWorker$doWork$2 = lessonReportWorker$doWork$1;
        Object obj = lessonReportWorker$doWork$2.f19287d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = lessonReportWorker$doWork$2.f19289f;
        try {
            if (i11 == 0) {
                C7499b.m14977z0(obj);
                WorkerParameters workerParameters = this.f7829b;
                if (workerParameters.f7803c <= 3 && (strM4707e = workerParameters.f7802b.m4707e("language")) != null && (strM4707e2 = workerParameters.f7802b.m4707e("scope")) != null) {
                    String strM4707e3 = workerParameters.f7802b.m4707e("reason");
                    int iM4705c = workerParameters.f7802b.m4705c("lessonId", 0);
                    InterfaceC9284a interfaceC9284a = this.f19286h;
                    lessonReportWorker$doWork$2.f19289f = 1;
                    if (interfaceC9284a.mo9830W(strM4707e, iM4705c, strM4707e2, strM4707e3, lessonReportWorker$doWork$2) == coroutineSingletons) {
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
