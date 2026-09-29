package com.lingq.p055ui.session;

import ci.InterfaceC2020m;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.C3304a;
import com.lingq.shared.domain.Resource;
import kotlin.Metadata;
import kotlin.Pair;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.session.AuthenticationViewModel$registerGoogle$1", m19206f = "AuthenticationViewModel.kt", m19207l = {287}, m19208m = "invokeSuspend")
final class AuthenticationViewModel$registerGoogle$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f30652e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AuthenticationViewModel f30653f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f30654g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f30655h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f30656i;

    /* JADX INFO: renamed from: com.lingq.ui.session.AuthenticationViewModel$registerGoogle$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/domain/Resource;", "", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.session.AuthenticationViewModel$registerGoogle$1$1", m19206f = "AuthenticationViewModel.kt", m19207l = {279, 284}, m19208m = "invokeSuspend")
    public static final class C47281 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super Resource<? extends Boolean>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f30657e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f30658f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ AuthenticationViewModel f30659g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ String f30660h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ String f30661i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ String f30662j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47281(AuthenticationViewModel authenticationViewModel, String str, String str2, String str3, InterfaceC9968c<? super C47281> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30659g = authenticationViewModel;
            this.f30660h = str;
            this.f30661i = str2;
            this.f30662j = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C47281 c47281 = new C47281(this.f30659g, this.f30660h, this.f30661i, this.f30662j, interfaceC9968c);
            c47281.f30658f = obj;
            return c47281;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super Resource<? extends Boolean>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C47281) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            InterfaceC7117d interfaceC7117d;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f30657e;
            if (i10 != 0) {
                if (i10 == 1) {
                    interfaceC7117d = (InterfaceC7117d) this.f30658f;
                    C7499b.m14977z0(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj);
                }
            }
            C7499b.m14977z0(obj);
            interfaceC7117d = (InterfaceC7117d) this.f30658f;
            InterfaceC2020m interfaceC2020m = this.f30659g.f30550d;
            this.f30658f = interfaceC7117d;
            this.f30657e = 1;
            obj = interfaceC2020m.mo6138g(this.f30660h, this.f30661i, this.f30662j, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            this.f30658f = null;
            this.f30657e = 2;
            return interfaceC7117d.mo1339r((Resource) obj, this) == coroutineSingletons ? coroutineSingletons : C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.session.AuthenticationViewModel$registerGoogle$1$2 */
    @Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/domain/Resource;", "", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.session.AuthenticationViewModel$registerGoogle$1$2", m19206f = "AuthenticationViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C47292 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super Resource<? extends Boolean>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AuthenticationViewModel f30663e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47292(AuthenticationViewModel authenticationViewModel, InterfaceC9968c<? super C47292> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30663e = authenticationViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C47292(this.f30663e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super Resource<? extends Boolean>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C47292) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f30663e.f30539Q.setValue(Resource.Status.LOADING);
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.session.AuthenticationViewModel$registerGoogle$1$a */
    public static final class C4730a implements InterfaceC7117d<Resource<? extends Boolean>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AuthenticationViewModel f30664a;

        public C4730a(AuthenticationViewModel authenticationViewModel) {
            this.f30664a = authenticationViewModel;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.flow.InterfaceC7117d
        /* JADX INFO: renamed from: r */
        public final Object mo1339r(Resource<? extends Boolean> resource, InterfaceC9968c interfaceC9968c) {
            Resource<? extends Boolean> resource2 = resource;
            AuthenticationViewModel authenticationViewModel = this.f30664a;
            authenticationViewModel.f30539Q.setValue(resource2.f17862a);
            Boolean bool = (Boolean) resource2.f17863b;
            if (bool != null) {
                authenticationViewModel.f30535M.mo14371k(new Pair(new Integer(3), Boolean.valueOf(bool.booleanValue())));
            }
            if (C3304a.m9438a(resource2)) {
                Exception exc = resource2.f17864c;
                if (exc instanceof HttpException) {
                    AuthenticationViewModel.m10326l2(authenticationViewModel, (HttpException) exc);
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthenticationViewModel$registerGoogle$1(AuthenticationViewModel authenticationViewModel, String str, String str2, String str3, InterfaceC9968c<? super AuthenticationViewModel$registerGoogle$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f30653f = authenticationViewModel;
        this.f30654g = str;
        this.f30655h = str2;
        this.f30656i = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new AuthenticationViewModel$registerGoogle$1(this.f30653f, this.f30654g, this.f30655h, this.f30656i, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((AuthenticationViewModel$registerGoogle$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30652e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            C7136q c7136q = new C7136q(new C47281(this.f30653f, this.f30654g, this.f30655h, this.f30656i, null));
            AuthenticationViewModel authenticationViewModel = this.f30653f;
            FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new C47292(authenticationViewModel, null), c7136q);
            C4730a c4730a = new C4730a(authenticationViewModel);
            this.f30652e = 1;
            if (flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.mo9539a(c4730a, this) == coroutineSingletons) {
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
