package com.lingq.p055ui.onboarding;

import ae.C0062b;
import android.os.Bundle;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.MainViewModel;
import com.lingq.p055ui.session.AuthenticationViewModel;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$1;
import com.lingq.shared.uimodel.LearningLevel;
import com.linguist.R;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.random.Random;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import ni.C7796d;
import ni.C7797e;
import no.InterfaceC7882z;
import org.joda.time.DateTime;
import p076di.InterfaceC5180b;
import p260m8.C7499b;
import p338qd.C8573r0;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sj.C9050i;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.onboarding.OnboardingFinishFragment$onViewCreated$6$2", m19206f = "OnboardingFinishFragment.kt", m19207l = {115}, m19208m = "invokeSuspend")
public final class OnboardingFinishFragment$onViewCreated$6$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29386e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ OnboardingFinishFragment f29387f;

    /* JADX INFO: renamed from: com.lingq.ui.onboarding.OnboardingFinishFragment$onViewCreated$6$2$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/domain/Resource;", "", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.onboarding.OnboardingFinishFragment$onViewCreated$6$2$1", m19206f = "OnboardingFinishFragment.kt", m19207l = {132}, m19208m = "invokeSuspend")
    public static final class C45001 extends SuspendLambda implements InterfaceC2056p<Resource<? extends Boolean>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f29388e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f29389f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ OnboardingFinishFragment f29390g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45001(OnboardingFinishFragment onboardingFinishFragment, InterfaceC9968c<? super C45001> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f29390g = onboardingFinishFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C45001 c45001 = new C45001(this.f29390g, interfaceC9968c);
            c45001.f29389f = obj;
            return c45001;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Resource<? extends Boolean> resource, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C45001) mo1336a(resource, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Code duplicated, block: B:69:0x0253  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            String str;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f29388e;
            boolean z10 = true;
            OnboardingFinishFragment onboardingFinishFragment = this.f29390g;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                if (C5207g.m11106a(((Resource) this.f29389f).f17863b, Boolean.TRUE)) {
                    InterfaceC6727j<Object>[] interfaceC6727jArr = OnboardingFinishFragment.f29364J0;
                    onboardingFinishFragment.m10237p0().m10332q2(C9050i.f47331a, C9050i.f47333c);
                    if (!C9050i.f47334d.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("topics", C6752c.m13430X(C9050i.f47334d, null, null, null, null, 63));
                        onboardingFinishFragment.m10235n0().m15505b(bundle, "Topics Chosen");
                        onboardingFinishFragment.m10237p0().m10333r2(C9050i.f47331a, C9050i.f47334d);
                    }
                    InterfaceC5180b interfaceC5180b = onboardingFinishFragment.f29372H0;
                    if (interfaceC5180b == null) {
                        C5207g.m11117l("profileStore");
                        throw null;
                    }
                    ProfileStoreImpl$special$$inlined$map$1 profileStoreImpl$special$$inlined$map$1Mo9619h = interfaceC5180b.mo9619h();
                    this.f29388e = 1;
                    obj = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$1Mo9619h, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return C9072e.f47360a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
            C7796d c7796dM10235n0 = onboardingFinishFragment.m10235n0();
            int i11 = ((Profile) obj).f17781a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i11);
            c7796dM10235n0.m15506c(sb2.toString());
            String string = onboardingFinishFragment.m10236o0().f37891b.getString("registerData2", "");
            if (string == null) {
                string = "";
            }
            if (string.length() > 0) {
                String string2 = onboardingFinishFragment.m10236o0().f37891b.getString("registerData2", "");
                if (string2 == null) {
                    string2 = "";
                }
                C7797e c7797e = onboardingFinishFragment.f29371G0;
                if (c7797e == null) {
                    C5207g.m11117l("utils");
                    throw null;
                }
                if (!c7797e.m15513f()) {
                    Bundle bundle2 = new Bundle();
                    String str2 = C9050i.f47331a;
                    bundle2.putString("Registration client", "android");
                    bundle2.putString("Registration date", new DateTime().toString());
                    bundle2.putString("Registration language", str2);
                    bundle2.putString("Registration method", string2);
                    bundle2.putString("Referral code", C9050i.f47335e);
                    String str3 = C9050i.f47332b;
                    if (!C5207g.m11106a(str3, LearningLevel.Beginner1.getServerName())) {
                        if (C5207g.m11106a(str3, LearningLevel.Intermediate1.getServerName())) {
                            str = "Intermediate 1";
                        } else if (C5207g.m11106a(str3, LearningLevel.Advanced1.getServerName())) {
                            str = "Advanced 1";
                        }
                        bundle2.putString("Registration level", str);
                        onboardingFinishFragment.m10235n0().m15505b(bundle2, "new_user");
                    }
                    str = "Beginner 1";
                    bundle2.putString("Registration level", str);
                    onboardingFinishFragment.m10235n0().m15505b(bundle2, "new_user");
                }
                onboardingFinishFragment.m10236o0().m13310l("");
            }
            if (onboardingFinishFragment.m10236o0().m13299a().length() != 0) {
                z10 = false;
            }
            if (z10) {
                String str4 = (String) C6752c.m13440h0(C9000b.m17252r("Control", "UpgradeTest"), Random.f38128a);
                onboardingFinishFragment.m10236o0().m13303e(str4);
                onboardingFinishFragment.m10235n0().m15507d("And_Upgrade_23_05_08", str4);
            }
            ((MainViewModel) onboardingFinishFragment.f29366B0.getValue()).m9739o2();
            onboardingFinishFragment.m10235n0().m15505b(null, "session_started");
            if (onboardingFinishFragment.m10237p0().mo502f0()) {
                NavController navControllerM16725g0 = C8573r0.m16725g0(onboardingFinishFragment);
                Bundle bundle3 = new Bundle();
                NavDestination navDestinationM3986g = navControllerM16725g0.m3986g();
                if (navDestinationM3986g != null && navDestinationM3986g.m4016i(R.id.actionToHome) != null) {
                    navControllerM16725g0.m3992m(R.id.actionToHome, bundle3, null);
                }
            } else {
                NavController navControllerM16725g1 = C8573r0.m16725g0(onboardingFinishFragment);
                NavDestination navDestinationM3986g2 = navControllerM16725g1.m3986g();
                if (navDestinationM3986g2 != null && navDestinationM3986g2.m4016i(R.id.actionToUpgrade) != null) {
                    Bundle bundle4 = new Bundle();
                    bundle4.putString("attemptedAction", "First Time App Open");
                    bundle4.putString("offer", "");
                    navControllerM16725g1.m3992m(R.id.actionToUpgrade, bundle4, null);
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingFinishFragment$onViewCreated$6$2(OnboardingFinishFragment onboardingFinishFragment, InterfaceC9968c<? super OnboardingFinishFragment$onViewCreated$6$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29387f = onboardingFinishFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new OnboardingFinishFragment$onViewCreated$6$2(this.f29387f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((OnboardingFinishFragment$onViewCreated$6$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29386e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = OnboardingFinishFragment.f29364J0;
            OnboardingFinishFragment onboardingFinishFragment = this.f29387f;
            AuthenticationViewModel authenticationViewModelM10237p0 = onboardingFinishFragment.m10237p0();
            C45001 c45001 = new C45001(onboardingFinishFragment, null);
            this.f29386e = 1;
            if (C0062b.m369m0(authenticationViewModelM10237p0.f30538P, c45001, this) == coroutineSingletons) {
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
