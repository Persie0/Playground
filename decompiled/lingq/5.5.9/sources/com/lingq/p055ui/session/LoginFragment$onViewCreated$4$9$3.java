package com.lingq.p055ui.session;

import ae.C0062b;
import android.os.Bundle;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Resource;
import com.linguist.R;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ni.C7796d;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.session.LoginFragment$onViewCreated$4$9$3", m19206f = "LoginFragment.kt", m19207l = {277}, m19208m = "invokeSuspend")
public final class LoginFragment$onViewCreated$4$9$3 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f30707e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LoginFragment f30708f;

    /* JADX INFO: renamed from: com.lingq.ui.session.LoginFragment$onViewCreated$4$9$3$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/domain/Resource;", "", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.session.LoginFragment$onViewCreated$4$9$3$1", m19206f = "LoginFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C47351 extends SuspendLambda implements InterfaceC2056p<Resource<? extends Boolean>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f30709e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LoginFragment f30710f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47351(LoginFragment loginFragment, InterfaceC9968c<? super C47351> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30710f = loginFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C47351 c47351 = new C47351(this.f30710f, interfaceC9968c);
            c47351.f30709e = obj;
            return c47351;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Resource<? extends Boolean> resource, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C47351) mo1336a(resource, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x004d  */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            if (C5207g.m11106a(((Resource) this.f30709e).f17863b, Boolean.TRUE)) {
                LoginFragment loginFragment = this.f30710f;
                C7796d c7796d = loginFragment.f30693H0;
                if (c7796d == null) {
                    C5207g.m11117l("analytics");
                    throw null;
                }
                c7796d.m15505b(null, "session_started");
                NavController navControllerM16725g0 = C8573r0.m16725g0(loginFragment);
                Bundle bundle = new Bundle();
                NavDestination navDestinationM3986g = navControllerM16725g0.m3986g();
                if (navDestinationM3986g != null && navDestinationM3986g.m4016i(R.id.actionToHomeFragment) != null) {
                    navControllerM16725g0.m3992m(R.id.actionToHomeFragment, bundle, null);
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginFragment$onViewCreated$4$9$3(LoginFragment loginFragment, InterfaceC9968c<? super LoginFragment$onViewCreated$4$9$3> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f30708f = loginFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LoginFragment$onViewCreated$4$9$3(this.f30708f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LoginFragment$onViewCreated$4$9$3) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30707e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LoginFragment.f30685J0;
            LoginFragment loginFragment = this.f30708f;
            AuthenticationViewModel authenticationViewModelM10336p0 = loginFragment.m10336p0();
            C47351 c47351 = new C47351(loginFragment, null);
            this.f30707e = 1;
            if (C0062b.m369m0(authenticationViewModelM10336p0.f30538P, c47351, this) == coroutineSingletons) {
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
