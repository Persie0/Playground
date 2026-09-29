package com.lingq.p055ui.session;

import ae.C0062b;
import ci.InterfaceC2020m;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.C3304a;
import com.lingq.shared.domain.Login;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.network.result.ResultErrorLogin;
import jp.C6553u;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7136q;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC7117d;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import retrofit2.HttpException;
import sl.C9072e;
import so.AbstractC9107y;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.session.AuthenticationViewModel$login$1", m19206f = "AuthenticationViewModel.kt", m19207l = {101}, m19208m = "invokeSuspend")
final class AuthenticationViewModel$login$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f30565e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AuthenticationViewModel f30566f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f30567g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f30568h;

    /* JADX INFO: renamed from: com.lingq.ui.session.AuthenticationViewModel$login$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/domain/Resource;", "Lcom/lingq/shared/domain/Login;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.session.AuthenticationViewModel$login$1$1", m19206f = "AuthenticationViewModel.kt", m19207l = {97, 98}, m19208m = "invokeSuspend")
    public static final class C47091 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super Resource<? extends Login>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f30569e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f30570f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ AuthenticationViewModel f30571g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ String f30572h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ String f30573i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47091(AuthenticationViewModel authenticationViewModel, String str, String str2, InterfaceC9968c<? super C47091> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30571g = authenticationViewModel;
            this.f30572h = str;
            this.f30573i = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C47091 c47091 = new C47091(this.f30571g, this.f30572h, this.f30573i, interfaceC9968c);
            c47091.f30570f = obj;
            return c47091;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super Resource<? extends Login>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C47091) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            InterfaceC7117d interfaceC7117d;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f30569e;
            if (i10 != 0) {
                if (i10 == 1) {
                    interfaceC7117d = (InterfaceC7117d) this.f30570f;
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
            interfaceC7117d = (InterfaceC7117d) this.f30570f;
            InterfaceC2020m interfaceC2020m = this.f30571g.f30550d;
            this.f30570f = interfaceC7117d;
            this.f30569e = 1;
            obj = interfaceC2020m.mo6134c(this.f30572h, this.f30573i, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            this.f30570f = null;
            this.f30569e = 2;
            if (interfaceC7117d.mo1339r((Resource) obj, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.session.AuthenticationViewModel$login$1$2 */
    @Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/domain/Resource;", "Lcom/lingq/shared/domain/Login;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.session.AuthenticationViewModel$login$1$2", m19206f = "AuthenticationViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C47102 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super Resource<? extends Login>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AuthenticationViewModel f30574e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47102(AuthenticationViewModel authenticationViewModel, InterfaceC9968c<? super C47102> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30574e = authenticationViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C47102(this.f30574e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super Resource<? extends Login>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C47102) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f30574e.f30539Q.setValue(Resource.Status.LOADING);
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.session.AuthenticationViewModel$login$1$3 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/domain/Resource;", "Lcom/lingq/shared/domain/Login;", "resource", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.session.AuthenticationViewModel$login$1$3", m19206f = "AuthenticationViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C47113 extends SuspendLambda implements InterfaceC2056p<Resource<? extends Login>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f30575e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ AuthenticationViewModel f30576f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47113(AuthenticationViewModel authenticationViewModel, InterfaceC9968c<? super C47113> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30576f = authenticationViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C47113 c47113 = new C47113(this.f30576f, interfaceC9968c);
            c47113.f30575e = obj;
            return c47113;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Resource<? extends Login> resource, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C47113) mo1336a(resource, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x006d  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            AbstractC9107y abstractC9107y;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Resource resource = (Resource) this.f30575e;
            AuthenticationViewModel authenticationViewModel = this.f30576f;
            authenticationViewModel.f30539Q.setValue(resource.f17862a);
            Login login = (Login) resource.f17863b;
            if (login != null) {
                authenticationViewModel.f30531I.setValue(login);
            }
            if (C3304a.m9438a(resource)) {
                Exception exc = resource.f17864c;
                if (exc instanceof HttpException) {
                    C6553u<?> c6553u = ((HttpException) exc).f46513a;
                    String strM17355r = (c6553u == null || (abstractC9107y = c6553u.f37340c) == null) ? null : abstractC9107y.m17355r();
                    if (strM17355r != null) {
                        try {
                            ResultErrorLogin resultErrorLogin = (ResultErrorLogin) authenticationViewModel.f30556j.m10563a(ResultErrorLogin.class).m10532b(strM17355r);
                            if (resultErrorLogin == null) {
                                resultErrorLogin = new ResultErrorLogin(null, null, 3, null);
                            }
                            authenticationViewModel.f30545W.mo14371k(resultErrorLogin);
                        } catch (Exception unused) {
                            C9072e c9072e = C9072e.f47360a;
                        }
                    }
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthenticationViewModel$login$1(AuthenticationViewModel authenticationViewModel, String str, String str2, InterfaceC9968c<? super AuthenticationViewModel$login$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f30566f = authenticationViewModel;
        this.f30567g = str;
        this.f30568h = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new AuthenticationViewModel$login$1(this.f30566f, this.f30567g, this.f30568h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((AuthenticationViewModel$login$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30565e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            String str = this.f30567g;
            String str2 = this.f30568h;
            AuthenticationViewModel authenticationViewModel = this.f30566f;
            FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new C47102(authenticationViewModel, null), new C7136q(new C47091(authenticationViewModel, str, str2, null)));
            C47113 c47113 = new C47113(authenticationViewModel, null);
            this.f30565e = 1;
            if (C0062b.m369m0(flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, c47113, this) == coroutineSingletons) {
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
