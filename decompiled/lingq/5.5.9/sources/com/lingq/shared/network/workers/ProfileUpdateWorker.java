package com.lingq.shared.network.workers;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.C1244b;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import ci.InterfaceC2020m;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.network.requests.RequestUserUpdate;
import com.squareup.moshi.C4955q;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineDispatcher;
import no.C7828f;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B7\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m13365d2 = {"Lcom/lingq/shared/network/workers/ProfileUpdateWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lci/m;", "profileRepository", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lci/m;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ProfileUpdateWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: h */
    public final InterfaceC2020m f19330h;

    /* JADX INFO: renamed from: i */
    public final CoroutineDispatcher f19331i;

    /* JADX INFO: renamed from: j */
    public final C4955q f19332j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileUpdateWorker(Context context, WorkerParameters workerParameters, InterfaceC2020m interfaceC2020m, CoroutineDispatcher coroutineDispatcher, C4955q c4955q) {
        super(context, workerParameters);
        C5207g.m11111f(context, "appContext");
        C5207g.m11111f(workerParameters, "workerParams");
        C5207g.m11111f(interfaceC2020m, "profileRepository");
        C5207g.m11111f(coroutineDispatcher, "dispatcher");
        C5207g.m11111f(c4955q, "moshi");
        this.f19330h = interfaceC2020m;
        this.f19331i = coroutineDispatcher;
        this.f19332j = c4955q;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: g */
    public final Object mo4698g(InterfaceC9968c<? super AbstractC1246d.a> interfaceC9968c) throws Throwable {
        ProfileUpdateWorker$doWork$1 profileUpdateWorker$doWork$1;
        int iM4705c;
        ProfileUpdateWorker profileUpdateWorker;
        if (interfaceC9968c instanceof ProfileUpdateWorker$doWork$1) {
            profileUpdateWorker$doWork$1 = (ProfileUpdateWorker$doWork$1) interfaceC9968c;
            int i10 = profileUpdateWorker$doWork$1.f19337h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                profileUpdateWorker$doWork$1.f19337h = i10 - Integer.MIN_VALUE;
            } else {
                profileUpdateWorker$doWork$1 = new ProfileUpdateWorker$doWork$1(this, interfaceC9968c);
            }
        } else {
            profileUpdateWorker$doWork$1 = new ProfileUpdateWorker$doWork$1(this, interfaceC9968c);
        }
        Object objM15574h = profileUpdateWorker$doWork$1.f19335f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = profileUpdateWorker$doWork$1.f19337h;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    iM4705c = profileUpdateWorker$doWork$1.f19334e;
                    profileUpdateWorker = profileUpdateWorker$doWork$1.f19333d;
                    C7499b.m14977z0(objM15574h);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(objM15574h);
                }
                return new AbstractC1246d.a.c();
            }
            C7499b.m14977z0(objM15574h);
            WorkerParameters workerParameters = this.f7829b;
            int i12 = workerParameters.f7803c;
            C1244b c1244b = workerParameters.f7802b;
            if (i12 > 3) {
                return new AbstractC1246d.a.C10594a();
            }
            iM4705c = c1244b.m4705c("pk", 0);
            String strM4707e = c1244b.m4707e("user");
            if (strM4707e == null) {
                return new AbstractC1246d.a.C10594a();
            }
            CoroutineDispatcher coroutineDispatcher = this.f19331i;
            ProfileUpdateWorker$doWork$userModel$1 profileUpdateWorker$doWork$userModel$1 = new ProfileUpdateWorker$doWork$userModel$1(this, strM4707e, null);
            profileUpdateWorker$doWork$1.f19333d = this;
            profileUpdateWorker$doWork$1.f19334e = iM4705c;
            profileUpdateWorker$doWork$1.f19337h = 1;
            objM15574h = C7828f.m15574h(profileUpdateWorker$doWork$1, coroutineDispatcher, profileUpdateWorker$doWork$userModel$1);
            if (objM15574h == coroutineSingletons) {
                return coroutineSingletons;
            }
            profileUpdateWorker = this;
            RequestUserUpdate requestUserUpdate = (RequestUserUpdate) objM15574h;
            if (requestUserUpdate != null) {
                InterfaceC2020m interfaceC2020m = profileUpdateWorker.f19330h;
                profileUpdateWorker$doWork$1.f19333d = null;
                profileUpdateWorker$doWork$1.f19337h = 2;
                if (interfaceC2020m.mo6151t(iM4705c, requestUserUpdate, profileUpdateWorker$doWork$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return new AbstractC1246d.a.c();
        } catch (Throwable th2) {
            th2.printStackTrace();
            return new AbstractC1246d.a.b();
        }
    }
}
