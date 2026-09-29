package com.lingq.p055ui.session.magiclink;

import ae.C0062b;
import ci.InterfaceC2020m;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.C3304a;
import com.lingq.shared.domain.Resource;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7136q;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC7117d;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.session.magiclink.EmailLoginViewModel$requestEmailLogin$1", m19206f = "EmailLoginViewModel.kt", m19207l = {45}, m19208m = "invokeSuspend")
final class EmailLoginViewModel$requestEmailLogin$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f30922e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ EmailLoginViewModel f30923f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f30924g;

    /* JADX INFO: renamed from: com.lingq.ui.session.magiclink.EmailLoginViewModel$requestEmailLogin$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/domain/Resource;", "", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.session.magiclink.EmailLoginViewModel$requestEmailLogin$1$1", m19206f = "EmailLoginViewModel.kt", m19207l = {41, 42}, m19208m = "invokeSuspend")
    public static final class C47611 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super Resource<? extends Boolean>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f30925e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f30926f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ EmailLoginViewModel f30927g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ String f30928h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47611(EmailLoginViewModel emailLoginViewModel, String str, InterfaceC9968c<? super C47611> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30927g = emailLoginViewModel;
            this.f30928h = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C47611 c47611 = new C47611(this.f30927g, this.f30928h, interfaceC9968c);
            c47611.f30926f = obj;
            return c47611;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super Resource<? extends Boolean>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C47611) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            InterfaceC7117d interfaceC7117d;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f30925e;
            if (i10 != 0) {
                if (i10 == 1) {
                    interfaceC7117d = (InterfaceC7117d) this.f30926f;
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
            interfaceC7117d = (InterfaceC7117d) this.f30926f;
            InterfaceC2020m interfaceC2020m = this.f30927g.f30914d;
            this.f30926f = interfaceC7117d;
            this.f30925e = 1;
            obj = interfaceC2020m.mo6145n(this.f30928h, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            this.f30926f = null;
            this.f30925e = 2;
            if (interfaceC7117d.mo1339r((Resource) obj, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.session.magiclink.EmailLoginViewModel$requestEmailLogin$1$2 */
    @Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/domain/Resource;", "", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.session.magiclink.EmailLoginViewModel$requestEmailLogin$1$2", m19206f = "EmailLoginViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C47622 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super Resource<? extends Boolean>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ EmailLoginViewModel f30929e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47622(EmailLoginViewModel emailLoginViewModel, InterfaceC9968c<? super C47622> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30929e = emailLoginViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C47622(this.f30929e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super Resource<? extends Boolean>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C47622) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f30929e.f30916f.setValue(Resource.Status.LOADING);
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.session.magiclink.EmailLoginViewModel$requestEmailLogin$1$3 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/domain/Resource;", "", "resource", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.session.magiclink.EmailLoginViewModel$requestEmailLogin$1$3", m19206f = "EmailLoginViewModel.kt", m19207l = {49, 51, 56}, m19208m = "invokeSuspend")
    public static final class C47633 extends SuspendLambda implements InterfaceC2056p<Resource<? extends Boolean>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f30930e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f30931f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ EmailLoginViewModel f30932g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47633(EmailLoginViewModel emailLoginViewModel, InterfaceC9968c<? super C47633> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30932g = emailLoginViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C47633 c47633 = new C47633(this.f30932g, interfaceC9968c);
            c47633.f30931f = obj;
            return c47633;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Resource<? extends Boolean> resource, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C47633) mo1336a(resource, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            Resource resource;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f30930e;
            EmailLoginViewModel emailLoginViewModel = this.f30932g;
            if (i10 != 0) {
                if (i10 == 1 || i10 == 2) {
                    resource = (Resource) this.f30931f;
                    C7499b.m14977z0(obj);
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj);
                }
                return C9072e.f47360a;
            }
            C7499b.m14977z0(obj);
            resource = (Resource) this.f30931f;
            emailLoginViewModel.f30916f.setValue(resource.f17862a);
            Boolean bool = (Boolean) resource.f17863b;
            if (bool != null) {
                if (bool.booleanValue()) {
                    C7138s c7138s = emailLoginViewModel.f30920j;
                    C9072e c9072e = C9072e.f47360a;
                    this.f30931f = resource;
                    this.f30930e = 1;
                    if (c7138s.mo1339r(c9072e, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    C7138s c7138s2 = emailLoginViewModel.f30918h;
                    C9072e c9072e2 = C9072e.f47360a;
                    this.f30931f = resource;
                    this.f30930e = 2;
                    if (c7138s2.mo1339r(c9072e2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            if (C3304a.m9438a(resource)) {
                C7138s c7138s3 = emailLoginViewModel.f30918h;
                C9072e c9072e3 = C9072e.f47360a;
                this.f30931f = null;
                this.f30930e = 3;
                if (c7138s3.mo1339r(c9072e3, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailLoginViewModel$requestEmailLogin$1(EmailLoginViewModel emailLoginViewModel, String str, InterfaceC9968c<? super EmailLoginViewModel$requestEmailLogin$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f30923f = emailLoginViewModel;
        this.f30924g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new EmailLoginViewModel$requestEmailLogin$1(this.f30923f, this.f30924g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((EmailLoginViewModel$requestEmailLogin$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30922e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            String str = this.f30924g;
            EmailLoginViewModel emailLoginViewModel = this.f30923f;
            FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new C47622(emailLoginViewModel, null), new C7136q(new C47611(emailLoginViewModel, str, null)));
            C47633 c47633 = new C47633(emailLoginViewModel, null);
            this.f30922e = 1;
            if (C0062b.m369m0(flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, c47633, this) == coroutineSingletons) {
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
