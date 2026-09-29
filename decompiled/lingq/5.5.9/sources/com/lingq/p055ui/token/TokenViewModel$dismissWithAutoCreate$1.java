package com.lingq.p055ui.token;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$11;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$dismissWithAutoCreate$1", m19206f = "TokenViewModel.kt", m19207l = {1240}, m19208m = "invokeSuspend")
final class TokenViewModel$dismissWithAutoCreate$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31536e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TokenViewModel f31537f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean f31538g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenViewModel$dismissWithAutoCreate$1(TokenViewModel tokenViewModel, boolean z10, InterfaceC9968c<? super TokenViewModel$dismissWithAutoCreate$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31537f = tokenViewModel;
        this.f31538g = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new TokenViewModel$dismissWithAutoCreate$1(this.f31537f, this.f31538g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TokenViewModel$dismissWithAutoCreate$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31536e;
        TokenViewModel tokenViewModel = this.f31537f;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            PreferenceStoreImpl$special$$inlined$map$11 preferenceStoreImpl$special$$inlined$map$11Mo9603r = tokenViewModel.f31459l.mo9603r();
            this.f31536e = 1;
            obj = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$11Mo9603r, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        if (((Boolean) obj).booleanValue() && tokenViewModel.f31429T.f34366a.f31181g == TokenControllerType.Lesson) {
            TokenViewModel.m10373q2(tokenViewModel, true);
        } else {
            InterfaceC4865b.a.m10388a(tokenViewModel, this.f31538g, 2);
        }
        return C9072e.f47360a;
    }
}
