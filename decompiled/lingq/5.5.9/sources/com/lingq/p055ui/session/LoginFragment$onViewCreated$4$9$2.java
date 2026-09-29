package com.lingq.p055ui.session;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Login;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ni.C7796d;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.session.LoginFragment$onViewCreated$4$9$2", m19206f = "LoginFragment.kt", m19207l = {266}, m19208m = "invokeSuspend")
public final class LoginFragment$onViewCreated$4$9$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f30703e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LoginFragment f30704f;

    /* JADX INFO: renamed from: com.lingq.ui.session.LoginFragment$onViewCreated$4$9$2$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/domain/Login;", "login", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.session.LoginFragment$onViewCreated$4$9$2$1", m19206f = "LoginFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C47341 extends SuspendLambda implements InterfaceC2056p<Login, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f30705e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LoginFragment f30706f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47341(LoginFragment loginFragment, InterfaceC9968c<? super C47341> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30706f = loginFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C47341 c47341 = new C47341(this.f30706f, interfaceC9968c);
            c47341.f30705e = obj;
            return c47341;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Login login, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C47341) mo1336a(login, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Login login = (Login) this.f30705e;
            String str = login != null ? login.f17773b : null;
            if (!(str == null || str.length() == 0)) {
                LoginFragment loginFragment = this.f30706f;
                C7796d c7796d = loginFragment.f30693H0;
                if (c7796d == null) {
                    C5207g.m11117l("analytics");
                    throw null;
                }
                c7796d.m15505b(null, "Login");
                loginFragment.m10336p0().m10329n2();
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginFragment$onViewCreated$4$9$2(LoginFragment loginFragment, InterfaceC9968c<? super LoginFragment$onViewCreated$4$9$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f30704f = loginFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LoginFragment$onViewCreated$4$9$2(this.f30704f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LoginFragment$onViewCreated$4$9$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30703e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LoginFragment.f30685J0;
            LoginFragment loginFragment = this.f30704f;
            AuthenticationViewModel authenticationViewModelM10336p0 = loginFragment.m10336p0();
            C47341 c47341 = new C47341(loginFragment, null);
            this.f30703e = 1;
            if (C0062b.m369m0(authenticationViewModelM10336p0.f30532J, c47341, this) == coroutineSingletons) {
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
