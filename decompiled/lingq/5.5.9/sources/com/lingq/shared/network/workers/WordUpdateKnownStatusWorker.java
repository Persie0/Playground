package com.lingq.shared.network.workers;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.C1244b;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import ci.InterfaceC2026s;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.network.requests.RequestWordsUpdate;
import dm.C5207g;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import tl.AbstractC9313a;
import tl.C9321i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m13365d2 = {"Lcom/lingq/shared/network/workers/WordUpdateKnownStatusWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lci/s;", "tokenRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lci/s;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class WordUpdateKnownStatusWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: h */
    public final InterfaceC2026s f19344h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WordUpdateKnownStatusWorker(Context context, WorkerParameters workerParameters, InterfaceC2026s interfaceC2026s) {
        super(context, workerParameters);
        C5207g.m11111f(context, "appContext");
        C5207g.m11111f(workerParameters, "workerParams");
        C5207g.m11111f(interfaceC2026s, "tokenRepository");
        this.f19344h = interfaceC2026s;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: g */
    public final Object mo4698g(InterfaceC9968c<? super AbstractC1246d.a> interfaceC9968c) throws Throwable {
        WordUpdateKnownStatusWorker$doWork$1 wordUpdateKnownStatusWorker$doWork$1;
        String strM4707e;
        if (interfaceC9968c instanceof WordUpdateKnownStatusWorker$doWork$1) {
            wordUpdateKnownStatusWorker$doWork$1 = (WordUpdateKnownStatusWorker$doWork$1) interfaceC9968c;
            int i10 = wordUpdateKnownStatusWorker$doWork$1.f19347f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                wordUpdateKnownStatusWorker$doWork$1.f19347f = i10 - Integer.MIN_VALUE;
            } else {
                wordUpdateKnownStatusWorker$doWork$1 = new WordUpdateKnownStatusWorker$doWork$1(this, interfaceC9968c);
            }
        } else {
            wordUpdateKnownStatusWorker$doWork$1 = new WordUpdateKnownStatusWorker$doWork$1(this, interfaceC9968c);
        }
        Object obj = wordUpdateKnownStatusWorker$doWork$1.f19345d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = wordUpdateKnownStatusWorker$doWork$1.f19347f;
        try {
            if (i11 == 0) {
                C7499b.m14977z0(obj);
                WorkerParameters workerParameters = this.f7829b;
                int i12 = workerParameters.f7803c;
                C1244b c1244b = workerParameters.f7802b;
                if (i12 <= 3 && (strM4707e = c1244b.m4707e("language")) != null) {
                    int iM4705c = c1244b.m4705c("lessonId", 0);
                    int[] iArrM4706d = c1244b.m4706d("wordIds");
                    if (iArrM4706d == null) {
                        return new AbstractC1246d.a.C10594a();
                    }
                    C9321i c9321i = new C9321i(iArrM4706d);
                    ArrayList arrayList = new ArrayList();
                    AbstractC9313a.b bVar = new AbstractC9313a.b();
                    while (bVar.hasNext()) {
                        arrayList.add(new Integer(((Number) bVar.next()).intValue()));
                    }
                    RequestWordsUpdate requestWordsUpdate = new RequestWordsUpdate();
                    requestWordsUpdate.f18236b = iM4705c;
                    requestWordsUpdate.f18235a = arrayList;
                    InterfaceC2026s interfaceC2026s = this.f19344h;
                    wordUpdateKnownStatusWorker$doWork$1.f19347f = 1;
                    if (interfaceC2026s.mo6195e(strM4707e, requestWordsUpdate, wordUpdateKnownStatusWorker$doWork$1) == coroutineSingletons) {
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
