package com.lingq.p055ui.session.magiclink;

import ae.C0062b;
import ci.InterfaceC2020m;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.session.magiclink.CheckEmailViewModel$resendMessage$1", m19206f = "CheckEmailViewModel.kt", m19207l = {44}, m19208m = "invokeSuspend")
final class CheckEmailViewModel$resendMessage$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f30877e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CheckEmailViewModel f30878f;

    /* JADX INFO: renamed from: com.lingq.ui.session.magiclink.CheckEmailViewModel$resendMessage$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/domain/Resource;", "", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.session.magiclink.CheckEmailViewModel$resendMessage$1$1", m19206f = "CheckEmailViewModel.kt", m19207l = {40, 41}, m19208m = "invokeSuspend")
    public static final class C47531 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super Resource<? extends Boolean>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f30879e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f30880f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ CheckEmailViewModel f30881g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47531(CheckEmailViewModel checkEmailViewModel, InterfaceC9968c<? super C47531> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30881g = checkEmailViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C47531 c47531 = new C47531(this.f30881g, interfaceC9968c);
            c47531.f30880f = obj;
            return c47531;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super Resource<? extends Boolean>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C47531) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            InterfaceC7117d interfaceC7117d;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f30879e;
            if (i10 != 0) {
                if (i10 == 1) {
                    interfaceC7117d = (InterfaceC7117d) this.f30880f;
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
            interfaceC7117d = (InterfaceC7117d) this.f30880f;
            CheckEmailViewModel checkEmailViewModel = this.f30881g;
            InterfaceC2020m interfaceC2020m = checkEmailViewModel.f30870d;
            String str = checkEmailViewModel.f30872f.f9096a;
            this.f30880f = interfaceC7117d;
            this.f30879e = 1;
            obj = interfaceC2020m.mo6145n(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            this.f30880f = null;
            this.f30879e = 2;
            if (interfaceC7117d.mo1339r((Resource) obj, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.session.magiclink.CheckEmailViewModel$resendMessage$1$2 */
    @Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/domain/Resource;", "", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.session.magiclink.CheckEmailViewModel$resendMessage$1$2", m19206f = "CheckEmailViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C47542 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super Resource<? extends Boolean>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ CheckEmailViewModel f30882e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47542(CheckEmailViewModel checkEmailViewModel, InterfaceC9968c<? super C47542> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30882e = checkEmailViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C47542(this.f30882e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super Resource<? extends Boolean>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C47542) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f30882e.f30873g.setValue(Resource.Status.LOADING);
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.session.magiclink.CheckEmailViewModel$resendMessage$1$3 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/domain/Resource;", "", "resource", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.session.magiclink.CheckEmailViewModel$resendMessage$1$3", m19206f = "CheckEmailViewModel.kt", m19207l = {48}, m19208m = "invokeSuspend")
    public static final class C47553 extends SuspendLambda implements InterfaceC2056p<Resource<? extends Boolean>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f30883e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f30884f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ CheckEmailViewModel f30885g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47553(CheckEmailViewModel checkEmailViewModel, InterfaceC9968c<? super C47553> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30885g = checkEmailViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C47553 c47553 = new C47553(this.f30885g, interfaceC9968c);
            c47553.f30884f = obj;
            return c47553;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Resource<? extends Boolean> resource, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C47553) mo1336a(resource, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f30883e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                Resource resource = (Resource) this.f30884f;
                CheckEmailViewModel checkEmailViewModel = this.f30885g;
                checkEmailViewModel.f30873g.setValue(resource.f17862a);
                Boolean bool = (Boolean) resource.f17863b;
                if (bool != null && bool.booleanValue()) {
                    C7138s c7138s = checkEmailViewModel.f30875i;
                    C9072e c9072e = C9072e.f47360a;
                    this.f30883e = 1;
                    if (c7138s.mo1339r(c9072e, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckEmailViewModel$resendMessage$1(CheckEmailViewModel checkEmailViewModel, InterfaceC9968c<? super CheckEmailViewModel$resendMessage$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f30878f = checkEmailViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CheckEmailViewModel$resendMessage$1(this.f30878f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CheckEmailViewModel$resendMessage$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30877e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            CheckEmailViewModel checkEmailViewModel = this.f30878f;
            FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new C47542(checkEmailViewModel, null), new C7136q(new C47531(checkEmailViewModel, null)));
            C47553 c47553 = new C47553(checkEmailViewModel, null);
            this.f30877e = 1;
            if (C0062b.m369m0(flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, c47553, this) == coroutineSingletons) {
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
