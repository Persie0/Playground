package com.lingq.p055ui.home;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.tooltips.TooltipStep;
import com.lingq.shared.domain.ProfileAccount;
import km.InterfaceC6727j;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.HomeFragment$onViewCreated$9$2", m19206f = "HomeFragment.kt", m19207l = {265}, m19208m = "invokeSuspend")
public final class HomeFragment$onViewCreated$9$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f22699e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ HomeFragment f22700f;

    /* JADX INFO: renamed from: com.lingq.ui.home.HomeFragment$onViewCreated$9$2$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/domain/ProfileAccount;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.HomeFragment$onViewCreated$9$2$1", m19206f = "HomeFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C34691 extends SuspendLambda implements InterfaceC2056p<ProfileAccount, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f22701e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ HomeFragment f22702f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34691(HomeFragment homeFragment, InterfaceC9968c<? super C34691> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f22702f = homeFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C34691 c34691 = new C34691(this.f22702f, interfaceC9968c);
            c34691.f22701e = obj;
            return c34691;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C34691) mo1336a(profileAccount, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            if (((ProfileAccount) this.f22701e).f17809i > 0) {
                HomeFragment homeFragment = this.f22702f;
                if (homeFragment.m9768q0().m13302d().isEmpty()) {
                    homeFragment.m9770s0().mo9723I(TooltipStep.Finished);
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFragment$onViewCreated$9$2(HomeFragment homeFragment, InterfaceC9968c<? super HomeFragment$onViewCreated$9$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f22700f = homeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new HomeFragment$onViewCreated$9$2(this.f22700f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((HomeFragment$onViewCreated$9$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f22699e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = HomeFragment.f22653M0;
            HomeFragment homeFragment = this.f22700f;
            InterfaceC7116c<ProfileAccount> interfaceC7116cMo508t1 = homeFragment.m9770s0().mo508t1();
            C34691 c34691 = new C34691(homeFragment, null);
            this.f22699e = 1;
            if (C0062b.m369m0(interfaceC7116cMo508t1, c34691, this) == coroutineSingletons) {
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
