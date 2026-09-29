package com.lingq.p055ui;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Login;
import com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$3;
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
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lcom/lingq/shared/domain/Login;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.MainActivity$handleDeeplink$loginData$1", m19206f = "MainActivity.kt", m19207l = {369}, m19208m = "invokeSuspend")
public final class MainActivity$handleDeeplink$loginData$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super Login>, Object> {

    /* JADX INFO: renamed from: e */
    public int f22183e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ MainActivity f22184f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$handleDeeplink$loginData$1(MainActivity mainActivity, InterfaceC9968c<? super MainActivity$handleDeeplink$loginData$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f22184f = mainActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new MainActivity$handleDeeplink$loginData$1(this.f22184f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super Login> interfaceC9968c) {
        return ((MainActivity$handleDeeplink$loginData$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f22183e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            ProfileStoreImpl$special$$inlined$map$3 profileStoreImpl$special$$inlined$map$3Mo9613b = this.f22184f.m9707O().mo9613b();
            this.f22183e = 1;
            obj = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$3Mo9613b, this);
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
