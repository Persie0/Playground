package com.lingq.p055ui.session;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Login;
import com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$3;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.session.AuthenticationViewModel$registeredViaSocial$1", m19206f = "AuthenticationViewModel.kt", m19207l = {308}, m19208m = "invokeSuspend")
public final class AuthenticationViewModel$registeredViaSocial$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f30665e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AuthenticationViewModel f30666f;

    /* JADX INFO: renamed from: com.lingq.ui.session.AuthenticationViewModel$registeredViaSocial$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/domain/Login;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.session.AuthenticationViewModel$registeredViaSocial$1$1", m19206f = "AuthenticationViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C47311 extends SuspendLambda implements InterfaceC2056p<Login, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f30667e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ AuthenticationViewModel f30668f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47311(AuthenticationViewModel authenticationViewModel, InterfaceC9968c<? super C47311> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30668f = authenticationViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C47311 c47311 = new C47311(this.f30668f, interfaceC9968c);
            c47311.f30667e = obj;
            return c47311;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Login login, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C47311) mo1336a(login, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f30668f.f30531I.setValue((Login) this.f30667e);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthenticationViewModel$registeredViaSocial$1(AuthenticationViewModel authenticationViewModel, InterfaceC9968c<? super AuthenticationViewModel$registeredViaSocial$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f30666f = authenticationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new AuthenticationViewModel$registeredViaSocial$1(this.f30666f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((AuthenticationViewModel$registeredViaSocial$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30665e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            AuthenticationViewModel authenticationViewModel = this.f30666f;
            ProfileStoreImpl$special$$inlined$map$3 profileStoreImpl$special$$inlined$map$3Mo9613b = authenticationViewModel.f30557k.mo9613b();
            C47311 c47311 = new C47311(authenticationViewModel, null);
            this.f30665e = 1;
            if (C0062b.m369m0(profileStoreImpl$special$$inlined$map$3Mo9613b, c47311, this) == coroutineSingletons) {
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
