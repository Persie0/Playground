package com.lingq.shared.network.workers;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.C1244b;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import ci.InterfaceC2013f;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.network.requests.RequestAppUsageStat;
import com.lingq.shared.uimodel.language.AppUsageType;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m13365d2 = {"Lcom/lingq/shared/network/workers/AppUsageUpdateWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lci/f;", "languageStatsRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lci/f;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class AppUsageUpdateWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: h */
    public final InterfaceC2013f f19152h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppUsageUpdateWorker(Context context, WorkerParameters workerParameters, InterfaceC2013f interfaceC2013f) {
        super(context, workerParameters);
        C5207g.m11111f(context, "appContext");
        C5207g.m11111f(workerParameters, "workerParams");
        C5207g.m11111f(interfaceC2013f, "languageStatsRepository");
        this.f19152h = interfaceC2013f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: g */
    public final Object mo4698g(InterfaceC9968c<? super AbstractC1246d.a> interfaceC9968c) throws Throwable {
        AppUsageUpdateWorker$doWork$1 appUsageUpdateWorker$doWork$1;
        String strM4707e;
        String strM4707e2;
        if (interfaceC9968c instanceof AppUsageUpdateWorker$doWork$1) {
            appUsageUpdateWorker$doWork$1 = (AppUsageUpdateWorker$doWork$1) interfaceC9968c;
            int i10 = appUsageUpdateWorker$doWork$1.f19155f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                appUsageUpdateWorker$doWork$1.f19155f = i10 - Integer.MIN_VALUE;
            } else {
                appUsageUpdateWorker$doWork$1 = new AppUsageUpdateWorker$doWork$1(this, interfaceC9968c);
            }
        } else {
            appUsageUpdateWorker$doWork$1 = new AppUsageUpdateWorker$doWork$1(this, interfaceC9968c);
        }
        Object obj = appUsageUpdateWorker$doWork$1.f19153d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = appUsageUpdateWorker$doWork$1.f19155f;
        try {
            if (i11 == 0) {
                C7499b.m14977z0(obj);
                WorkerParameters workerParameters = this.f7829b;
                int i12 = workerParameters.f7803c;
                C1244b c1244b = workerParameters.f7802b;
                if (i12 <= 3 && (strM4707e = c1244b.m4707e("language")) != null && (strM4707e2 = c1244b.m4707e("stat")) != null) {
                    double dM4704b = c1244b.m4704b("value");
                    RequestAppUsageStat requestAppUsageStat = new RequestAppUsageStat(null, null, null, null, 15, null);
                    if (C5207g.m11106a(strM4707e2, AppUsageType.Reading.getKey())) {
                        requestAppUsageStat.f18022a = new Double(dM4704b);
                    } else if (C5207g.m11106a(strM4707e2, AppUsageType.Listening.getKey())) {
                        requestAppUsageStat.f18023b = new Double(dM4704b);
                    } else if (C5207g.m11106a(strM4707e2, AppUsageType.Review.getKey())) {
                        requestAppUsageStat.f18024c = new Double(dM4704b);
                    }
                    InterfaceC2013f interfaceC2013f = this.f19152h;
                    appUsageUpdateWorker$doWork$1.f19155f = 1;
                    if (interfaceC2013f.mo6053n(strM4707e, requestAppUsageStat, appUsageUpdateWorker$doWork$1) == coroutineSingletons) {
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
            return new AbstractC1246d.a.C10594a();
        }
    }
}
