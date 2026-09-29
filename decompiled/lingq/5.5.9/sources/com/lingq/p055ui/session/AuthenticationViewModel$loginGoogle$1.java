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
@InterfaceC10224c(m19205c = "com.lingq.ui.session.AuthenticationViewModel$loginGoogle$1", m19206f = "AuthenticationViewModel.kt", m19207l = {184}, m19208m = "invokeSuspend")
final class AuthenticationViewModel$loginGoogle$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f30587e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AuthenticationViewModel f30588f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f30589g;

    /* JADX INFO: renamed from: com.lingq.ui.session.AuthenticationViewModel$loginGoogle$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/domain/Resource;", "Lcom/lingq/shared/domain/Login;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.session.AuthenticationViewModel$loginGoogle$1$1", m19206f = "AuthenticationViewModel.kt", m19207l = {180, 181}, m19208m = "invokeSuspend")
    public static final class C47151 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super Resource<? extends Login>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f30590e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f30591f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ AuthenticationViewModel f30592g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ String f30593h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47151(AuthenticationViewModel authenticationViewModel, String str, InterfaceC9968c<? super C47151> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30592g = authenticationViewModel;
            this.f30593h = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C47151 c47151 = new C47151(this.f30592g, this.f30593h, interfaceC9968c);
            c47151.f30591f = obj;
            return c47151;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super Resource<? extends Login>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C47151) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            InterfaceC7117d interfaceC7117d;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f30590e;
            if (i10 != 0) {
                if (i10 == 1) {
                    interfaceC7117d = (InterfaceC7117d) this.f30591f;
                    C7499b.m14977z0(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj);
                }
            }
            C7499b.m14977z0(obj);
            interfaceC7117d = (InterfaceC7117d) this.f30591f;
            InterfaceC2020m interfaceC2020m = this.f30592g.f30550d;
            this.f30591f = interfaceC7117d;
            this.f30590e = 1;
            obj = interfaceC2020m.mo6137f(this.f30593h, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            this.f30591f = null;
            this.f30590e = 2;
            return interfaceC7117d.mo1339r((Resource) obj, this) == coroutineSingletons ? coroutineSingletons : C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.session.AuthenticationViewModel$loginGoogle$1$2 */
    @Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/domain/Resource;", "Lcom/lingq/shared/domain/Login;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.session.AuthenticationViewModel$loginGoogle$1$2", m19206f = "AuthenticationViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C47162 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super Resource<? extends Login>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AuthenticationViewModel f30594e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47162(AuthenticationViewModel authenticationViewModel, InterfaceC9968c<? super C47162> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30594e = authenticationViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C47162(this.f30594e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super Resource<? extends Login>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C47162) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f30594e.f30539Q.setValue(Resource.Status.LOADING);
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.session.AuthenticationViewModel$loginGoogle$1$3 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/domain/Resource;", "Lcom/lingq/shared/domain/Login;", "resource", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.session.AuthenticationViewModel$loginGoogle$1$3", m19206f = "AuthenticationViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C47173 extends SuspendLambda implements InterfaceC2056p<Resource<? extends Login>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f30595e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ AuthenticationViewModel f30596f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47173(AuthenticationViewModel authenticationViewModel, InterfaceC9968c<? super C47173> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30596f = authenticationViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C47173 c47173 = new C47173(this.f30596f, interfaceC9968c);
            c47173.f30595e = obj;
            return c47173;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Resource<? extends Login> resource, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C47173) mo1336a(resource, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Resource resource = (Resource) this.f30595e;
            AuthenticationViewModel authenticationViewModel = this.f30596f;
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
    public AuthenticationViewModel$loginGoogle$1(AuthenticationViewModel authenticationViewModel, String str, InterfaceC9968c<? super AuthenticationViewModel$loginGoogle$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f30588f = authenticationViewModel;
        this.f30589g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new AuthenticationViewModel$loginGoogle$1(this.f30588f, this.f30589g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((AuthenticationViewModel$loginGoogle$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30587e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            String str = this.f30589g;
            AuthenticationViewModel authenticationViewModel = this.f30588f;
            FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new C47162(authenticationViewModel, null), new C7136q(new C47151(authenticationViewModel, str, null)));
            C47173 c47173 = new C47173(authenticationViewModel, null);
            this.f30587e = 1;
            if (C0062b.m369m0(flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, c47173, this) == coroutineSingletons) {
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
