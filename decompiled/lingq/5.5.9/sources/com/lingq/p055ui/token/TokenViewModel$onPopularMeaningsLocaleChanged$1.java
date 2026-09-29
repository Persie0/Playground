package com.lingq.p055ui.token;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C6753d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.StateFlowImpl;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$onPopularMeaningsLocaleChanged$1", m19206f = "TokenViewModel.kt", m19207l = {1357, 1359, 1361}, m19208m = "invokeSuspend")
final class TokenViewModel$onPopularMeaningsLocaleChanged$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public StateFlowImpl f31614e;

    /* JADX INFO: renamed from: f */
    public int f31615f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ TokenViewModel f31616g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f31617h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenViewModel$onPopularMeaningsLocaleChanged$1(TokenViewModel tokenViewModel, String str, InterfaceC9968c<? super TokenViewModel$onPopularMeaningsLocaleChanged$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31616g = tokenViewModel;
        this.f31617h = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new TokenViewModel$onPopularMeaningsLocaleChanged$1(this.f31616g, this.f31617h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TokenViewModel$onPopularMeaningsLocaleChanged$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0077 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        StateFlowImpl stateFlowImpl;
        Object objM14360a;
        StateFlowImpl stateFlowImpl2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31615f;
        String str = this.f31617h;
        TokenViewModel tokenViewModel = this.f31616g;
        if (i10 != 0) {
            if (i10 == 1) {
                C7499b.m14977z0(obj);
            } else if (i10 == 2) {
                C7499b.m14977z0(obj);
                stateFlowImpl = tokenViewModel.f31465q0;
                InterfaceC7116c<Profile> interfaceC7116cMo504j1 = tokenViewModel.mo504j1();
                this.f31614e = stateFlowImpl;
                this.f31615f = 3;
                objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo504j1, this);
                if (objM14360a == coroutineSingletons) {
                    return coroutineSingletons;
                }
                stateFlowImpl2 = stateFlowImpl;
                obj = objM14360a;
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                stateFlowImpl2 = this.f31614e;
                C7499b.m14977z0(obj);
            }
            stateFlowImpl2.setValue(new Pair(((Profile) obj).f17798r, str));
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        InterfaceC7116c<Map<String, String>> interfaceC7116cMo9677a = tokenViewModel.f31405H.mo9677a();
        this.f31615f = 1;
        obj = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9677a, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        LinkedHashMap linkedHashMapM13467T0 = C6753d.m13467T0((Map) obj);
        linkedHashMapM13467T0.put(tokenViewModel.mo498E1(), str);
        this.f31615f = 2;
        if (tokenViewModel.f31405H.mo9680d(linkedHashMapM13467T0, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        stateFlowImpl = tokenViewModel.f31465q0;
        InterfaceC7116c<Profile> interfaceC7116cMo504j2 = tokenViewModel.mo504j1();
        this.f31614e = stateFlowImpl;
        this.f31615f = 3;
        objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo504j2, this);
        if (objM14360a == coroutineSingletons) {
            return coroutineSingletons;
        }
        stateFlowImpl2 = stateFlowImpl;
        obj = objM14360a;
        stateFlowImpl2.setValue(new Pair(((Profile) obj).f17798r, str));
        return C9072e.f47360a;
    }
}
