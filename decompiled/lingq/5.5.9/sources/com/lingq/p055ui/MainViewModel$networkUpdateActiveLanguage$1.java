package com.lingq.p055ui;

import ci.InterfaceC2020m;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.network.requests.RequestUserUpdate;
import com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$1;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import no.InterfaceC7882z;
import p076di.InterfaceC5180b;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.MainViewModel$networkUpdateActiveLanguage$1", m19206f = "MainViewModel.kt", m19207l = {426, 428, 431}, m19208m = "invokeSuspend")
final class MainViewModel$networkUpdateActiveLanguage$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public Object f22338e;

    /* JADX INFO: renamed from: f */
    public int f22339f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f22340g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ MainViewModel f22341h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$networkUpdateActiveLanguage$1(MainViewModel mainViewModel, String str, InterfaceC9968c interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f22340g = str;
        this.f22341h = mainViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new MainViewModel$networkUpdateActiveLanguage$1(this.f22341h, this.f22340g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((MainViewModel$networkUpdateActiveLanguage$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0093 A[RETURN] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        RequestUserUpdate requestUserUpdate;
        Profile profile;
        InterfaceC5180b interfaceC5180b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f22339f;
        String str = this.f22340g;
        MainViewModel mainViewModel = this.f22341h;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    requestUserUpdate = (RequestUserUpdate) this.f22338e;
                    C7499b.m14977z0(obj);
                } else if (i10 == 2) {
                    profile = (Profile) this.f22338e;
                    C7499b.m14977z0(obj);
                    profile.getClass();
                    C5207g.m11111f(str, "<set-?>");
                    profile.f17795o = str;
                    interfaceC5180b = mainViewModel.f22289g;
                    this.f22338e = null;
                    this.f22339f = 3;
                    if (interfaceC5180b.mo9620i(profile, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj);
                }
                mainViewModel.f22290g0.mo14371k(C9072e.f47360a);
                return C9072e.f47360a;
            }
            C7499b.m14977z0(obj);
            requestUserUpdate = new RequestUserUpdate();
            requestUserUpdate.f18223b = str;
            ProfileStoreImpl$special$$inlined$map$1 profileStoreImpl$special$$inlined$map$1Mo9619h = mainViewModel.f22289g.mo9619h();
            this.f22338e = requestUserUpdate;
            this.f22339f = 1;
            obj = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$1Mo9619h, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            Profile profile2 = (Profile) obj;
            InterfaceC2020m interfaceC2020m = mainViewModel.f22283d;
            int i11 = profile2.f17781a;
            this.f22338e = profile2;
            this.f22339f = 2;
            if (interfaceC2020m.mo6151t(i11, requestUserUpdate, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            profile = profile2;
            profile.getClass();
            C5207g.m11111f(str, "<set-?>");
            profile.f17795o = str;
            interfaceC5180b = mainViewModel.f22289g;
            this.f22338e = null;
            this.f22339f = 3;
            if (interfaceC5180b.mo9620i(profile, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            mainViewModel.f22290g0.mo14371k(C9072e.f47360a);
            return C9072e.f47360a;
        } catch (Exception unused) {
            mainViewModel.f22290g0.mo14371k(C9072e.f47360a);
        }
    }
}
