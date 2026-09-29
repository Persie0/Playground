package com.lingq.p055ui.session;

import ae.C0062b;
import ci.InterfaceC2020m;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.C3304a;
import com.lingq.shared.domain.Login;
import com.lingq.shared.domain.Resource;
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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.session.AuthenticationViewModel$loginFacebook$1", m19206f = "AuthenticationViewModel.kt", m19207l = {163}, m19208m = "invokeSuspend")
final class AuthenticationViewModel$loginFacebook$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f30577e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AuthenticationViewModel f30578f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f30579g;

    /* JADX INFO: renamed from: com.lingq.ui.session.AuthenticationViewModel$loginFacebook$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/domain/Resource;", "Lcom/lingq/shared/domain/Login;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.session.AuthenticationViewModel$loginFacebook$1$1", m19206f = "AuthenticationViewModel.kt", m19207l = {159, 160}, m19208m = "invokeSuspend")
    public static final class C47121 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super Resource<? extends Login>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f30580e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f30581f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ AuthenticationViewModel f30582g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ String f30583h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47121(AuthenticationViewModel authenticationViewModel, String str, InterfaceC9968c<? super C47121> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30582g = authenticationViewModel;
            this.f30583h = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C47121 c47121 = new C47121(this.f30582g, this.f30583h, interfaceC9968c);
            c47121.f30581f = obj;
            return c47121;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super Resource<? extends Login>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C47121) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            InterfaceC7117d interfaceC7117d;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f30580e;
            if (i10 != 0) {
                if (i10 == 1) {
                    interfaceC7117d = (InterfaceC7117d) this.f30581f;
                    C7499b.m14977z0(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj);
                }
            }
            C7499b.m14977z0(obj);
            interfaceC7117d = (InterfaceC7117d) this.f30581f;
            InterfaceC2020m interfaceC2020m = this.f30582g.f30550d;
            this.f30581f = interfaceC7117d;
            this.f30580e = 1;
            obj = interfaceC2020m.mo6132a(this.f30583h, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            this.f30581f = null;
            this.f30580e = 2;
            return interfaceC7117d.mo1339r((Resource) obj, this) == coroutineSingletons ? coroutineSingletons : C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.session.AuthenticationViewModel$loginFacebook$1$2 */
    @Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/domain/Resource;", "Lcom/lingq/shared/domain/Login;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.session.AuthenticationViewModel$loginFacebook$1$2", m19206f = "AuthenticationViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C47132 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super Resource<? extends Login>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AuthenticationViewModel f30584e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47132(AuthenticationViewModel authenticationViewModel, InterfaceC9968c<? super C47132> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30584e = authenticationViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C47132(this.f30584e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super Resource<? extends Login>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C47132) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f30584e.f30539Q.setValue(Resource.Status.LOADING);
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.session.AuthenticationViewModel$loginFacebook$1$3 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/domain/Resource;", "Lcom/lingq/shared/domain/Login;", "resource", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.session.AuthenticationViewModel$loginFacebook$1$3", m19206f = "AuthenticationViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C47143 extends SuspendLambda implements InterfaceC2056p<Resource<? extends Login>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f30585e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ AuthenticationViewModel f30586f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47143(AuthenticationViewModel authenticationViewModel, InterfaceC9968c<? super C47143> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30586f = authenticationViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C47143 c47143 = new C47143(this.f30586f, interfaceC9968c);
            c47143.f30585e = obj;
            return c47143;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Resource<? extends Login> resource, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C47143) mo1336a(resource, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Resource resource = (Resource) this.f30585e;
            AuthenticationViewModel authenticationViewModel = this.f30586f;
            authenticationViewModel.f30539Q.setValue(resource.f17862a);
            Login login = (Login) resource.f17863b;
            if (login != null) {
                authenticationViewModel.f30531I.setValue(login);
            }
            if (C3304a.m9438a(resource)) {
                boolean z10 = resource.f17864c instanceof HttpException;
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthenticationViewModel$loginFacebook$1(AuthenticationViewModel authenticationViewModel, String str, InterfaceC9968c<? super AuthenticationViewModel$loginFacebook$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f30578f = authenticationViewModel;
        this.f30579g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new AuthenticationViewModel$loginFacebook$1(this.f30578f, this.f30579g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((AuthenticationViewModel$loginFacebook$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30577e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            String str = this.f30579g;
            AuthenticationViewModel authenticationViewModel = this.f30578f;
            FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new C47132(authenticationViewModel, null), new C7136q(new C47121(authenticationViewModel, str, null)));
            C47143 c47143 = new C47143(authenticationViewModel, null);
            this.f30577e = 1;
            if (C0062b.m369m0(flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, c47143, this) == coroutineSingletons) {
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
