package com.lingq.shared.network.interceptors;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$4;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.shared.network.interceptors.PostInterceptor$intercept$guid$1", m19206f = "PostInterceptor.kt", m19207l = {35}, m19208m = "invokeSuspend")
final class PostInterceptor$intercept$guid$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super String>, Object> {

    /* JADX INFO: renamed from: e */
    public int f18002e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C3313a f18003f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostInterceptor$intercept$guid$1(C3313a c3313a, InterfaceC9968c<? super PostInterceptor$intercept$guid$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f18003f = c3313a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new PostInterceptor$intercept$guid$1(this.f18003f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super String> interfaceC9968c) {
        return ((PostInterceptor$intercept$guid$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f18002e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            ProfileStoreImpl$special$$inlined$map$4 profileStoreImpl$special$$inlined$map$4Mo9623l = this.f18003f.f18007b.mo9623l();
            this.f18002e = 1;
            obj = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$4Mo9623l, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return obj;
    }
}
