package com.lingq.p055ui.session;

import ae.C0062b;
import ci.InterfaceC2020m;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Resource;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.InterfaceC7116c;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.session.AuthenticationViewModel$recoverPassword$1", m19206f = "AuthenticationViewModel.kt", m19207l = {415, 415}, m19208m = "invokeSuspend")
final class AuthenticationViewModel$recoverPassword$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f30607e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AuthenticationViewModel f30608f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f30609g;

    /* JADX INFO: renamed from: com.lingq.ui.session.AuthenticationViewModel$recoverPassword$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/domain/Resource;", "", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.session.AuthenticationViewModel$recoverPassword$1$1", m19206f = "AuthenticationViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C47211 extends SuspendLambda implements InterfaceC2056p<Resource<? extends Integer>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f30610e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ AuthenticationViewModel f30611f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47211(AuthenticationViewModel authenticationViewModel, InterfaceC9968c<? super C47211> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30611f = authenticationViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C47211 c47211 = new C47211(this.f30611f, interfaceC9968c);
            c47211.f30610e = obj;
            return c47211;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Resource<? extends Integer> resource, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C47211) mo1336a(resource, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Resource resource = (Resource) this.f30610e;
            C7138s c7138s = this.f30611f.f30547Y;
            Object num = new Integer(-1);
            C5207g.m11111f(resource, "<this>");
            Object obj2 = resource.f17863b;
            if (obj2 != null) {
                num = obj2;
            }
            c7138s.mo14371k(num);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthenticationViewModel$recoverPassword$1(AuthenticationViewModel authenticationViewModel, String str, InterfaceC9968c<? super AuthenticationViewModel$recoverPassword$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f30608f = authenticationViewModel;
        this.f30609g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new AuthenticationViewModel$recoverPassword$1(this.f30608f, this.f30609g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((AuthenticationViewModel$recoverPassword$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30607e;
        AuthenticationViewModel authenticationViewModel = this.f30608f;
        if (i10 != 0) {
            if (i10 == 1) {
                C7499b.m14977z0(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        InterfaceC2020m interfaceC2020m = authenticationViewModel.f30550d;
        this.f30607e = 1;
        obj = interfaceC2020m.mo6152u(this.f30609g);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        C47211 c47211 = new C47211(authenticationViewModel, null);
        this.f30607e = 2;
        if (C0062b.m369m0((InterfaceC7116c) obj, c47211, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }
}
