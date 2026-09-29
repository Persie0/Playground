package com.lingq.p055ui.session;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.snackbar.Snackbar;
import com.linguist.R;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.session.LoginFragment$onViewCreated$4$9$5", m19206f = "LoginFragment.kt", m19207l = {302}, m19208m = "invokeSuspend")
public final class LoginFragment$onViewCreated$4$9$5 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f30715e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LoginFragment f30716f;

    /* JADX INFO: renamed from: com.lingq.ui.session.LoginFragment$onViewCreated$4$9$5$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.session.LoginFragment$onViewCreated$4$9$5$1", m19206f = "LoginFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C47371 extends SuspendLambda implements InterfaceC2056p<Integer, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ int f30717e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LoginFragment f30718f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47371(LoginFragment loginFragment, InterfaceC9968c<? super C47371> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30718f = loginFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C47371 c47371 = new C47371(this.f30718f, interfaceC9968c);
            c47371.f30717e = ((Number) obj).intValue();
            return c47371;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Integer num, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C47371) mo1336a(Integer.valueOf(num.intValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            int i10 = this.f30717e;
            LoginFragment loginFragment = this.f30718f;
            String strM3600t = i10 == 204 ? loginFragment.m3600t(R.string.support_password_sent) : loginFragment.m3600t(R.string.support_email_not_registered);
            C5207g.m11110e(strM3600t, "if (it == 204) {\n       …                        }");
            InterfaceC6727j<Object>[] interfaceC6727jArr = LoginFragment.f30685J0;
            Snackbar.m8842h(loginFragment.m10335o0().f45271a, strM3600t, 0).m8844i();
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginFragment$onViewCreated$4$9$5(LoginFragment loginFragment, InterfaceC9968c<? super LoginFragment$onViewCreated$4$9$5> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f30716f = loginFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LoginFragment$onViewCreated$4$9$5(this.f30716f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LoginFragment$onViewCreated$4$9$5) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30715e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LoginFragment.f30685J0;
            LoginFragment loginFragment = this.f30716f;
            AuthenticationViewModel authenticationViewModelM10336p0 = loginFragment.m10336p0();
            C47371 c47371 = new C47371(loginFragment, null);
            this.f30715e = 1;
            if (C0062b.m369m0(authenticationViewModelM10336p0.f30548Z, c47371, this) == coroutineSingletons) {
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
