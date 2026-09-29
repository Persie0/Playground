package com.lingq.p055ui.home.menu;

import ae.C0062b;
import androidx.view.AbstractC1036h0;
import ci.InterfaceC2021n;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$1;
import com.lingq.util.C4924a;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import no.C7828f;
import no.InterfaceC7882z;
import p076di.InterfaceC5180b;
import p225kk.C6715l;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/ui/home/menu/InviteFriendsViewModel;", "Landroidx/lifecycle/h0;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class InviteFriendsViewModel extends AbstractC1036h0 {

    /* JADX INFO: renamed from: H */
    public final C7135p f25079H;

    /* JADX INFO: renamed from: I */
    public final StateFlowImpl f25080I;

    /* JADX INFO: renamed from: J */
    public final C7135p f25081J;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2021n f25082d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5180b f25083e;

    /* JADX INFO: renamed from: f */
    public final StateFlowImpl f25084f;

    /* JADX INFO: renamed from: g */
    public final C7135p f25085g;

    /* JADX INFO: renamed from: h */
    public final C7138s f25086h;

    /* JADX INFO: renamed from: i */
    public final C7134o f25087i;

    /* JADX INFO: renamed from: j */
    public final C7138s f25088j;

    /* JADX INFO: renamed from: k */
    public final C7134o f25089k;

    /* JADX INFO: renamed from: l */
    public final C7135p f25090l;

    /* JADX INFO: renamed from: com.lingq.ui.home.menu.InviteFriendsViewModel$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.menu.InviteFriendsViewModel$1", m19206f = "InviteFriendsViewModel.kt", m19207l = {67}, m19208m = "invokeSuspend")
    public static final class C38211 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public StateFlowImpl f25091e;

        /* JADX INFO: renamed from: f */
        public int f25092f;

        public C38211(InterfaceC9968c<? super C38211> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return InviteFriendsViewModel.this.new C38211(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C38211) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            StateFlowImpl stateFlowImpl;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f25092f;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                InviteFriendsViewModel inviteFriendsViewModel = InviteFriendsViewModel.this;
                StateFlowImpl stateFlowImpl2 = inviteFriendsViewModel.f25084f;
                ProfileStoreImpl$special$$inlined$map$1 profileStoreImpl$special$$inlined$map$1Mo9619h = inviteFriendsViewModel.f25083e.mo9619h();
                this.f25091e = stateFlowImpl2;
                this.f25092f = 1;
                obj = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$1Mo9619h, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                stateFlowImpl = stateFlowImpl2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                stateFlowImpl = this.f25091e;
                C7499b.m14977z0(obj);
            }
            stateFlowImpl.setValue("https://www.lingq.com/?referral=" + ((Profile) obj).f17783c);
            return C9072e.f47360a;
        }
    }

    public InviteFriendsViewModel(InterfaceC2021n interfaceC2021n, InterfaceC5180b interfaceC5180b) {
        C5207g.m11111f(interfaceC2021n, "repository");
        C5207g.m11111f(interfaceC5180b, "profileStore");
        this.f25082d = interfaceC2021n;
        this.f25083e = interfaceC5180b;
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a("");
        this.f25084f = stateFlowImplM14379a;
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        this.f25085g = C0062b.m353h2(stateFlowImplM14379a, interfaceC7882zM16767w0, startedWhileSubscribed, "");
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f25086h = c7138sM10448a;
        this.f25087i = C0062b.m303R(c7138sM10448a);
        C7138s c7138sM10448a2 = C4924a.m10448a();
        this.f25088j = c7138sM10448a2;
        this.f25089k = C0062b.m303R(c7138sM10448a2);
        this.f25090l = C0062b.m353h2(interfaceC5180b.mo9618g(), C8573r0.m16767w0(this), startedWhileSubscribed, 0);
        this.f25079H = C0062b.m353h2(interfaceC5180b.mo9614c(), C8573r0.m16767w0(this), startedWhileSubscribed, 0);
        EmptyList emptyList = EmptyList.f38032a;
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a(emptyList);
        this.f25080I = stateFlowImplM14379a2;
        this.f25081J = C0062b.m353h2(stateFlowImplM14379a2, C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C38211(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new InviteFriendsViewModel$observeReferrals$1(this, null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new InviteFriendsViewModel$fetchReferrals$1(this, null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new InviteFriendsViewModel$fetchReferralStats$1(this, null), 3);
    }
}
