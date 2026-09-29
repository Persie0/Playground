package com.lingq.shared.network.workers;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.network.requests.RequestUserUpdate;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lcom/lingq/shared/network/requests/RequestUserUpdate;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.shared.network.workers.ProfileUpdateWorker$doWork$userModel$1", m19206f = "ProfileUpdateWorker.kt", m19207l = {}, m19208m = "invokeSuspend")
public final class ProfileUpdateWorker$doWork$userModel$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super RequestUserUpdate>, Object> {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ProfileUpdateWorker f19338e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f19339f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileUpdateWorker$doWork$userModel$1(ProfileUpdateWorker profileUpdateWorker, String str, InterfaceC9968c<? super ProfileUpdateWorker$doWork$userModel$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f19338e = profileUpdateWorker;
        this.f19339f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ProfileUpdateWorker$doWork$userModel$1(this.f19338e, this.f19339f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super RequestUserUpdate> interfaceC9968c) {
        return ((ProfileUpdateWorker$doWork$userModel$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        return this.f19338e.f19332j.m10563a(RequestUserUpdate.class).m10532b(this.f19339f);
    }
}
