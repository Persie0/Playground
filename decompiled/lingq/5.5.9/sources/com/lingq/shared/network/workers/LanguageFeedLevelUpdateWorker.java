package com.lingq.shared.network.workers;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.C1244b;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import ci.InterfaceC2012e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import tl.C9322j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m13365d2 = {"Lcom/lingq/shared/network/workers/LanguageFeedLevelUpdateWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lci/e;", "languageRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lci/e;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LanguageFeedLevelUpdateWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: h */
    public final InterfaceC2012e f19226h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageFeedLevelUpdateWorker(Context context, WorkerParameters workerParameters, InterfaceC2012e interfaceC2012e) {
        super(context, workerParameters);
        C5207g.m11111f(context, "appContext");
        C5207g.m11111f(workerParameters, "workerParams");
        C5207g.m11111f(interfaceC2012e, "languageRepository");
        this.f19226h = interfaceC2012e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: g */
    public final Object mo4698g(InterfaceC9968c<? super AbstractC1246d.a> interfaceC9968c) throws Throwable {
        LanguageFeedLevelUpdateWorker$doWork$1 languageFeedLevelUpdateWorker$doWork$1;
        String strM4707e;
        if (interfaceC9968c instanceof LanguageFeedLevelUpdateWorker$doWork$1) {
            languageFeedLevelUpdateWorker$doWork$1 = (LanguageFeedLevelUpdateWorker$doWork$1) interfaceC9968c;
            int i10 = languageFeedLevelUpdateWorker$doWork$1.f19229f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                languageFeedLevelUpdateWorker$doWork$1.f19229f = i10 - Integer.MIN_VALUE;
            } else {
                languageFeedLevelUpdateWorker$doWork$1 = new LanguageFeedLevelUpdateWorker$doWork$1(this, interfaceC9968c);
            }
        } else {
            languageFeedLevelUpdateWorker$doWork$1 = new LanguageFeedLevelUpdateWorker$doWork$1(this, interfaceC9968c);
        }
        Object obj = languageFeedLevelUpdateWorker$doWork$1.f19227d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = languageFeedLevelUpdateWorker$doWork$1.f19229f;
        try {
            if (i11 == 0) {
                C7499b.m14977z0(obj);
                WorkerParameters workerParameters = this.f7829b;
                int i12 = workerParameters.f7803c;
                C1244b c1244b = workerParameters.f7802b;
                if (i12 <= 3 && (strM4707e = c1244b.m4707e("language")) != null) {
                    Object obj2 = c1244b.f7824a.get("levels");
                    String[] strArr = obj2 instanceof String[] ? (String[]) obj2 : null;
                    if (strArr == null) {
                        return new AbstractC1246d.a.C10594a();
                    }
                    List<String> listM17670X = C9322j.m17670X(strArr);
                    InterfaceC2012e interfaceC2012e = this.f19226h;
                    languageFeedLevelUpdateWorker$doWork$1.f19229f = 1;
                    if (interfaceC2012e.mo6034t(strM4707e, listM17670X, languageFeedLevelUpdateWorker$doWork$1) == coroutineSingletons) {
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
