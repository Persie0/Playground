package com.lingq.shared.network.workers;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import ci.InterfaceC2019l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.network.requests.RequestPlaylistCreate;
import com.squareup.moshi.C4955q;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m13365d2 = {"Lcom/lingq/shared/network/workers/AddPlaylistWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lci/l;", "playlistRepository", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lci/l;Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class AddPlaylistWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: h */
    public final InterfaceC2019l f19147h;

    /* JADX INFO: renamed from: i */
    public final C4955q f19148i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPlaylistWorker(Context context, WorkerParameters workerParameters, InterfaceC2019l interfaceC2019l, C4955q c4955q) {
        super(context, workerParameters);
        C5207g.m11111f(context, "appContext");
        C5207g.m11111f(workerParameters, "workerParams");
        C5207g.m11111f(interfaceC2019l, "playlistRepository");
        C5207g.m11111f(c4955q, "moshi");
        this.f19147h = interfaceC2019l;
        this.f19148i = c4955q;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: g */
    public final Object mo4698g(InterfaceC9968c<? super AbstractC1246d.a> interfaceC9968c) throws Throwable {
        AddPlaylistWorker$doWork$1 addPlaylistWorker$doWork$1;
        String strM4707e;
        String strM4707e2;
        if (interfaceC9968c instanceof AddPlaylistWorker$doWork$1) {
            addPlaylistWorker$doWork$1 = (AddPlaylistWorker$doWork$1) interfaceC9968c;
            int i10 = addPlaylistWorker$doWork$1.f19151f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                addPlaylistWorker$doWork$1.f19151f = i10 - Integer.MIN_VALUE;
            } else {
                addPlaylistWorker$doWork$1 = new AddPlaylistWorker$doWork$1(this, interfaceC9968c);
            }
        } else {
            addPlaylistWorker$doWork$1 = new AddPlaylistWorker$doWork$1(this, interfaceC9968c);
        }
        AddPlaylistWorker$doWork$1 addPlaylistWorker$doWork$2 = addPlaylistWorker$doWork$1;
        Object obj = addPlaylistWorker$doWork$2.f19149d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = addPlaylistWorker$doWork$2.f19151f;
        try {
            if (i11 == 0) {
                C7499b.m14977z0(obj);
                WorkerParameters workerParameters = this.f7829b;
                if (workerParameters.f7803c <= 3 && (strM4707e = workerParameters.f7802b.m4707e("language")) != null && (strM4707e2 = workerParameters.f7802b.m4707e("data")) != null) {
                    Integer num = new Integer(workerParameters.f7802b.m4705c("itemId", -1));
                    Integer num2 = num.intValue() != -1 ? num : null;
                    String strM4707e3 = workerParameters.f7802b.m4707e("itemURL");
                    RequestPlaylistCreate requestPlaylistCreate = (RequestPlaylistCreate) this.f19148i.m10563a(RequestPlaylistCreate.class).m10532b(strM4707e2);
                    if (requestPlaylistCreate != null) {
                        InterfaceC2019l interfaceC2019l = this.f19147h;
                        addPlaylistWorker$doWork$2.f19151f = 1;
                        if (interfaceC2019l.mo6131z(strM4707e, requestPlaylistCreate, num2, strM4707e3, addPlaylistWorker$doWork$2) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
