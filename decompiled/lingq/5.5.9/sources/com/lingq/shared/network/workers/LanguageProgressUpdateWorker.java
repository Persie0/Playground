package com.lingq.shared.network.workers;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.C1244b;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import ci.InterfaceC2013f;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.network.requests.RequestLanguageProgress;
import com.lingq.shared.uimodel.language.LanguageProgressUpdate;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m13365d2 = {"Lcom/lingq/shared/network/workers/LanguageProgressUpdateWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lci/f;", "languageStatsRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lci/f;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LanguageProgressUpdateWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: h */
    public final InterfaceC2013f f19234h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageProgressUpdateWorker(Context context, WorkerParameters workerParameters, InterfaceC2013f interfaceC2013f) {
        super(context, workerParameters);
        C5207g.m11111f(context, "appContext");
        C5207g.m11111f(workerParameters, "workerParams");
        C5207g.m11111f(interfaceC2013f, "languageStatsRepository");
        this.f19234h = interfaceC2013f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: g */
    public final Object mo4698g(InterfaceC9968c<? super AbstractC1246d.a> interfaceC9968c) throws Throwable {
        LanguageProgressUpdateWorker$doWork$1 languageProgressUpdateWorker$doWork$1;
        String strM4707e;
        String strM4707e2;
        if (interfaceC9968c instanceof LanguageProgressUpdateWorker$doWork$1) {
            languageProgressUpdateWorker$doWork$1 = (LanguageProgressUpdateWorker$doWork$1) interfaceC9968c;
            int i10 = languageProgressUpdateWorker$doWork$1.f19237f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                languageProgressUpdateWorker$doWork$1.f19237f = i10 - Integer.MIN_VALUE;
            } else {
                languageProgressUpdateWorker$doWork$1 = new LanguageProgressUpdateWorker$doWork$1(this, interfaceC9968c);
            }
        } else {
            languageProgressUpdateWorker$doWork$1 = new LanguageProgressUpdateWorker$doWork$1(this, interfaceC9968c);
        }
        Object obj = languageProgressUpdateWorker$doWork$1.f19235d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = languageProgressUpdateWorker$doWork$1.f19237f;
        try {
            if (i11 == 0) {
                C7499b.m14977z0(obj);
                WorkerParameters workerParameters = this.f7829b;
                int i12 = workerParameters.f7803c;
                C1244b c1244b = workerParameters.f7802b;
                if (i12 <= 3 && (strM4707e = c1244b.m4707e("language")) != null && (strM4707e2 = c1244b.m4707e("stat")) != null) {
                    double dM4704b = c1244b.m4704b("value");
                    RequestLanguageProgress requestLanguageProgress = new RequestLanguageProgress();
                    if (C5207g.m11106a(strM4707e2, LanguageProgressUpdate.HoursListening.getKey())) {
                        requestLanguageProgress.f18091a = new Double(dM4704b);
                    } else if (C5207g.m11106a(strM4707e2, LanguageProgressUpdate.WordsReading.getKey())) {
                        requestLanguageProgress.f18094d = new Integer((int) dM4704b);
                    } else if (C5207g.m11106a(strM4707e2, LanguageProgressUpdate.WordsWriting.getKey())) {
                        requestLanguageProgress.f18093c = new Integer((int) dM4704b);
                    } else if (C5207g.m11106a(strM4707e2, LanguageProgressUpdate.HoursSpeaking.getKey())) {
                        requestLanguageProgress.f18092b = new Double(dM4704b);
                    }
                    InterfaceC2013f interfaceC2013f = this.f19234h;
                    languageProgressUpdateWorker$doWork$1.f19237f = 1;
                    if (interfaceC2013f.mo6049j(strM4707e, requestLanguageProgress, languageProgressUpdateWorker$doWork$1) == coroutineSingletons) {
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
