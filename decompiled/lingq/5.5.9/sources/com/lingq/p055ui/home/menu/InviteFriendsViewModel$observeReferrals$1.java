package com.lingq.p055ui.home.menu;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.UserReferral;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.menu.InviteFriendsViewModel$observeReferrals$1", m19206f = "InviteFriendsViewModel.kt", m19207l = {77}, m19208m = "invokeSuspend")
final class InviteFriendsViewModel$observeReferrals$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25100e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InviteFriendsViewModel f25101f;

    /* JADX INFO: renamed from: com.lingq.ui.home.menu.InviteFriendsViewModel$observeReferrals$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/UserReferral;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.menu.InviteFriendsViewModel$observeReferrals$1$1", m19206f = "InviteFriendsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C38221 extends SuspendLambda implements InterfaceC2056p<List<? extends UserReferral>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f25102e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ InviteFriendsViewModel f25103f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38221(InviteFriendsViewModel inviteFriendsViewModel, InterfaceC9968c<? super C38221> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f25103f = inviteFriendsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C38221 c38221 = new C38221(this.f25103f, interfaceC9968c);
            c38221.f25102e = obj;
            return c38221;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends UserReferral> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C38221) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f25103f.f25080I.setValue((List) this.f25102e);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteFriendsViewModel$observeReferrals$1(InviteFriendsViewModel inviteFriendsViewModel, InterfaceC9968c<? super InviteFriendsViewModel$observeReferrals$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25101f = inviteFriendsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new InviteFriendsViewModel$observeReferrals$1(this.f25101f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((InviteFriendsViewModel$observeReferrals$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25100e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InviteFriendsViewModel inviteFriendsViewModel = this.f25101f;
            InterfaceC7116c<List<UserReferral>> interfaceC7116cMo6154b = inviteFriendsViewModel.f25082d.mo6154b();
            C38221 c38221 = new C38221(inviteFriendsViewModel, null);
            this.f25100e = 1;
            if (C0062b.m369m0(interfaceC7116cMo6154b, c38221, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
