package com.lingq.p055ui.session;

import ae.C0062b;
import android.content.Context;
import android.support.v4.media.session.C0166e;
import android.widget.Toast;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.network.result.ResultErrorLogin;
import com.linguist.R;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C7076b;
import mo.C7661i;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.session.LoginFragment$onViewCreated$4$9$4", m19206f = "LoginFragment.kt", m19207l = {286}, m19208m = "invokeSuspend")
public final class LoginFragment$onViewCreated$4$9$4 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f30711e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LoginFragment f30712f;

    /* JADX INFO: renamed from: com.lingq.ui.session.LoginFragment$onViewCreated$4$9$4$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultErrorLogin;", "error", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.session.LoginFragment$onViewCreated$4$9$4$1", m19206f = "LoginFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C47361 extends SuspendLambda implements InterfaceC2056p<ResultErrorLogin, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f30713e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LoginFragment f30714f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47361(LoginFragment loginFragment, InterfaceC9968c<? super C47361> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30714f = loginFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C47361 c47361 = new C47361(this.f30714f, interfaceC9968c);
            c47361.f30713e = obj;
            return c47361;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(ResultErrorLogin resultErrorLogin, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C47361) mo1336a(resultErrorLogin, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            ResultErrorLogin resultErrorLogin = (ResultErrorLogin) this.f30713e;
            if (!C5207g.m11106a(resultErrorLogin.f18417a, "Invalid token.")) {
                LoginFragment loginFragment = this.f30714f;
                Context contextM3578a0 = loginFragment.m3578a0();
                String string = C7076b.m14277B3(C7661i.m15254T2(C7661i.m15254T2(C7661i.m15254T2(resultErrorLogin.f18418b.toString(), ",", " "), "[", ""), "]", "")).toString();
                String strM3600t = loginFragment.m3600t(R.string.welcome_email_support);
                StringBuilder sb2 = new StringBuilder();
                C0166e.m777x(sb2, resultErrorLogin.f18417a, " ", string, " ");
                sb2.append(strM3600t);
                sb2.append(" support@lingq.com");
                Toast.makeText(contextM3578a0, sb2.toString(), 1).show();
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginFragment$onViewCreated$4$9$4(LoginFragment loginFragment, InterfaceC9968c<? super LoginFragment$onViewCreated$4$9$4> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f30712f = loginFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LoginFragment$onViewCreated$4$9$4(this.f30712f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LoginFragment$onViewCreated$4$9$4) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30711e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LoginFragment.f30685J0;
            LoginFragment loginFragment = this.f30712f;
            AuthenticationViewModel authenticationViewModelM10336p0 = loginFragment.m10336p0();
            C47361 c47361 = new C47361(loginFragment, null);
            this.f30711e = 1;
            if (C0062b.m369m0(authenticationViewModelM10336p0.f30546X, c47361, this) == coroutineSingletons) {
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
