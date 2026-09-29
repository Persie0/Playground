package com.lingq.shared.network.workers;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import ci.InterfaceC2011d;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m13365d2 = {"Lcom/lingq/shared/network/workers/DictionaryDeleteWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lci/d;", "dictionaryRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lci/d;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class DictionaryDeleteWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: h */
    public final InterfaceC2011d f19213h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionaryDeleteWorker(Context context, WorkerParameters workerParameters, InterfaceC2011d interfaceC2011d) {
        super(context, workerParameters);
        C5207g.m11111f(context, "appContext");
        C5207g.m11111f(workerParameters, "workerParams");
        C5207g.m11111f(interfaceC2011d, "dictionaryRepository");
        this.f19213h = interfaceC2011d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: g */
    public final Object mo4698g(InterfaceC9968c<? super AbstractC1246d.a> interfaceC9968c) throws Throwable {
        DictionaryDeleteWorker$doWork$1 dictionaryDeleteWorker$doWork$1;
        String strM4707e;
        if (interfaceC9968c instanceof DictionaryDeleteWorker$doWork$1) {
            dictionaryDeleteWorker$doWork$1 = (DictionaryDeleteWorker$doWork$1) interfaceC9968c;
            int i10 = dictionaryDeleteWorker$doWork$1.f19216f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dictionaryDeleteWorker$doWork$1.f19216f = i10 - Integer.MIN_VALUE;
            } else {
                dictionaryDeleteWorker$doWork$1 = new DictionaryDeleteWorker$doWork$1(this, interfaceC9968c);
            }
        } else {
            dictionaryDeleteWorker$doWork$1 = new DictionaryDeleteWorker$doWork$1(this, interfaceC9968c);
        }
        Object obj = dictionaryDeleteWorker$doWork$1.f19214d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = dictionaryDeleteWorker$doWork$1.f19216f;
        try {
            if (i11 == 0) {
                C7499b.m14977z0(obj);
                WorkerParameters workerParameters = this.f7829b;
                if (workerParameters.f7803c <= 3 && (strM4707e = workerParameters.f7802b.m4707e("language")) != null) {
                    int iM4705c = workerParameters.f7802b.m4705c("pk", 0);
                    InterfaceC2011d interfaceC2011d = this.f19213h;
                    dictionaryDeleteWorker$doWork$1.f19216f = 1;
                    if (interfaceC2011d.mo6002b(iM4705c, strM4707e, dictionaryDeleteWorker$doWork$1) == coroutineSingletons) {
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
        } catch (Throwable th2) {
            th2.printStackTrace();
            return new AbstractC1246d.a.b();
        }
    }
}
