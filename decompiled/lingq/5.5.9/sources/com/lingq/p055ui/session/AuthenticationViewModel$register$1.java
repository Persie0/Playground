package com.lingq.p055ui.session;

import ci.InterfaceC2020m;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.C3304a;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.session.AuthenticationViewModel$register$1", m19206f = "AuthenticationViewModel.kt", m19207l = {227}, m19208m = "invokeSuspend")
final class AuthenticationViewModel$register$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Integer f30612H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ String f30613I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ String f30614J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ String f30615K;

    /* JADX INFO: renamed from: e */
    public int f30616e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AuthenticationViewModel f30617f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f30618g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f30619h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f30620i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f30621j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ String f30622k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ String f30623l;

    /* JADX INFO: renamed from: com.lingq.ui.session.AuthenticationViewModel$register$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/domain/Resource;", "", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.session.AuthenticationViewModel$register$1$1", m19206f = "AuthenticationViewModel.kt", m19207l = {212, 224}, m19208m = "invokeSuspend")
    public static final class C47221 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super Resource<? extends Boolean>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ String f30624H;

        /* JADX INFO: renamed from: I */
        public final /* synthetic */ Integer f30625I;

        /* JADX INFO: renamed from: J */
        public final /* synthetic */ String f30626J;

        /* JADX INFO: renamed from: K */
        public final /* synthetic */ String f30627K;

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ String f30628L;

        /* JADX INFO: renamed from: e */
        public int f30629e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f30630f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ AuthenticationViewModel f30631g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ String f30632h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ String f30633i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ String f30634j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ String f30635k;

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ String f30636l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47221(AuthenticationViewModel authenticationViewModel, String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, InterfaceC9968c<? super C47221> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30631g = authenticationViewModel;
            this.f30632h = str;
            this.f30633i = str2;
            this.f30634j = str3;
            this.f30635k = str4;
            this.f30636l = str5;
            this.f30624H = str6;
            this.f30625I = num;
            this.f30626J = str7;
            this.f30627K = str8;
            this.f30628L = str9;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C47221 c47221 = new C47221(this.f30631g, this.f30632h, this.f30633i, this.f30634j, this.f30635k, this.f30636l, this.f30624H, this.f30625I, this.f30626J, this.f30627K, this.f30628L, interfaceC9968c);
            c47221.f30630f = obj;
            return c47221;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super Resource<? extends Boolean>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C47221) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            InterfaceC7117d interfaceC7117d;
            Object objMo6136e;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f30629e;
            if (i10 != 0) {
                if (i10 == 1) {
                    InterfaceC7117d interfaceC7117d2 = (InterfaceC7117d) this.f30630f;
                    C7499b.m14977z0(obj);
                    interfaceC7117d = interfaceC7117d2;
                    objMo6136e = obj;
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj);
                }
                return C9072e.f47360a;
            }
            C7499b.m14977z0(obj);
            interfaceC7117d = (InterfaceC7117d) this.f30630f;
            InterfaceC2020m interfaceC2020m = this.f30631g.f30550d;
            String str = this.f30632h;
            String str2 = this.f30633i;
            String str3 = this.f30634j;
            String str4 = this.f30635k;
            String str5 = this.f30636l;
            String str6 = this.f30624H;
            Integer num = this.f30625I;
            String str7 = this.f30626J;
            String str8 = this.f30627K;
            String str9 = this.f30628L;
            this.f30630f = interfaceC7117d;
            this.f30629e = 1;
            objMo6136e = interfaceC2020m.mo6136e(str, str2, str3, str4, str5, str6, num, str7, str8, str9, this);
            if (objMo6136e == coroutineSingletons) {
                return coroutineSingletons;
            }
            this.f30630f = null;
            this.f30629e = 2;
            if (interfaceC7117d.mo1339r((Resource) objMo6136e, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.session.AuthenticationViewModel$register$1$2 */
    @Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/domain/Resource;", "", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.session.AuthenticationViewModel$register$1$2", m19206f = "AuthenticationViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C47232 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super Resource<? extends Boolean>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AuthenticationViewModel f30637e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47232(AuthenticationViewModel authenticationViewModel, InterfaceC9968c<? super C47232> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30637e = authenticationViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C47232(this.f30637e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super Resource<? extends Boolean>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C47232) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f30637e.f30539Q.setValue(Resource.Status.LOADING);
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.session.AuthenticationViewModel$register$1$a */
    public static final class C4724a implements InterfaceC7117d<Resource<? extends Boolean>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AuthenticationViewModel f30638a;

        public C4724a(AuthenticationViewModel authenticationViewModel) {
            this.f30638a = authenticationViewModel;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.flow.InterfaceC7117d
        /* JADX INFO: renamed from: r */
        public final Object mo1339r(Resource<? extends Boolean> resource, InterfaceC9968c interfaceC9968c) {
            Resource<? extends Boolean> resource2 = resource;
            AuthenticationViewModel authenticationViewModel = this.f30638a;
            authenticationViewModel.f30539Q.setValue(resource2.f17862a);
            Boolean bool = (Boolean) resource2.f17863b;
            if (bool != null) {
                authenticationViewModel.f30533K.mo14371k(Boolean.valueOf(bool.booleanValue()));
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
    public AuthenticationViewModel$register$1(AuthenticationViewModel authenticationViewModel, String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, InterfaceC9968c<? super AuthenticationViewModel$register$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f30617f = authenticationViewModel;
        this.f30618g = str;
        this.f30619h = str2;
        this.f30620i = str3;
        this.f30621j = str4;
        this.f30622k = str5;
        this.f30623l = str6;
        this.f30612H = num;
        this.f30613I = str7;
        this.f30614J = str8;
        this.f30615K = str9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new AuthenticationViewModel$register$1(this.f30617f, this.f30618g, this.f30619h, this.f30620i, this.f30621j, this.f30622k, this.f30623l, this.f30612H, this.f30613I, this.f30614J, this.f30615K, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((AuthenticationViewModel$register$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30616e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            C7136q c7136q = new C7136q(new C47221(this.f30617f, this.f30618g, this.f30619h, this.f30620i, this.f30621j, this.f30622k, this.f30623l, this.f30612H, this.f30613I, this.f30614J, this.f30615K, null));
            AuthenticationViewModel authenticationViewModel = this.f30617f;
            FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new C47232(authenticationViewModel, null), c7136q);
            C4724a c4724a = new C4724a(authenticationViewModel);
            this.f30616e = 1;
            if (flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.mo9539a(c4724a, this) == coroutineSingletons) {
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
