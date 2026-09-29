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
@Metadata(m13364d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m13365d2 = {"Lcom/lingq/shared/network/workers/LessonSaveRemoveWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LessonSaveRemoveWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: h */
    public InterfaceC3324a f19290h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonSaveRemoveWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C5207g.m11111f(context, "appContext");
        C5207g.m11111f(workerParameters, "workerParams");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: g */
    public final Object mo4698g(InterfaceC9968c<? super AbstractC1246d.a> interfaceC9968c) throws Throwable {
        LessonSaveRemoveWorker$doWork$1 lessonSaveRemoveWorker$doWork$1;
        if (interfaceC9968c instanceof LessonSaveRemoveWorker$doWork$1) {
            lessonSaveRemoveWorker$doWork$1 = (LessonSaveRemoveWorker$doWork$1) interfaceC9968c;
            int i10 = lessonSaveRemoveWorker$doWork$1.f19293f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lessonSaveRemoveWorker$doWork$1.f19293f = i10 - Integer.MIN_VALUE;
            } else {
                lessonSaveRemoveWorker$doWork$1 = new LessonSaveRemoveWorker$doWork$1(this, interfaceC9968c);
            }
        } else {
            lessonSaveRemoveWorker$doWork$1 = new LessonSaveRemoveWorker$doWork$1(this, interfaceC9968c);
        }
        Object obj = lessonSaveRemoveWorker$doWork$1.f19291d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = lessonSaveRemoveWorker$doWork$1.f19293f;
        try {
            if (i11 == 0) {
                C7499b.m14977z0(obj);
                WorkerParameters workerParameters = this.f7829b;
                int i12 = workerParameters.f7803c;
                C1244b c1244b = workerParameters.f7802b;
                if (i12 > 3) {
                    return new AbstractC1246d.a.C10594a();
                }
                int iM4705c = c1244b.m4705c("lessonId", 0);
                int iM4705c2 = c1244b.m4705c("contextId", 0);
                Object obj2 = c1244b.f7824a.get("save");
                boolean zBooleanValue = obj2 instanceof Boolean ? ((Boolean) obj2).booleanValue() : false;
                InterfaceC3324a interfaceC3324a = this.f19290h;
                if (interfaceC3324a == null) {
                    C5207g.m11117l("lessonRepository");
                    throw null;
                }
                lessonSaveRemoveWorker$doWork$1.f19293f = 1;
                if (interfaceC3324a.mo9493O(iM4705c2, iM4705c, zBooleanValue, lessonSaveRemoveWorker$doWork$1) == coroutineSingletons) {
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
