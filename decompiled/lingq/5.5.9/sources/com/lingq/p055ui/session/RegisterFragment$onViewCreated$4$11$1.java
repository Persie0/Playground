package com.lingq.p055ui.session;

import ae.C0062b;
import android.widget.RelativeLayout;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Resource;
import com.lingq.util.C4924a;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import ph.C8287g1;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.session.RegisterFragment$onViewCreated$4$11$1", m19206f = "RegisterFragment.kt", m19207l = {266}, m19208m = "invokeSuspend")
public final class RegisterFragment$onViewCreated$4$11$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f30749e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ RegisterFragment f30750f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C8287g1 f30751g;

    /* JADX INFO: renamed from: com.lingq.ui.session.RegisterFragment$onViewCreated$4$11$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/domain/Resource$Status;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.session.RegisterFragment$onViewCreated$4$11$1$1", m19206f = "RegisterFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C47431 extends SuspendLambda implements InterfaceC2056p<Resource.Status, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f30752e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ C8287g1 f30753f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47431(C8287g1 c8287g1, InterfaceC9968c<? super C47431> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30753f = c8287g1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C47431 c47431 = new C47431(this.f30753f, interfaceC9968c);
            c47431.f30752e = obj;
            return c47431;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Resource.Status status, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C47431) mo1336a(status, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Resource.Status status = (Resource.Status) this.f30752e;
            Resource.Status status2 = Resource.Status.LOADING;
            C8287g1 c8287g1 = this.f30753f;
            if (status == status2) {
                RelativeLayout relativeLayout = c8287g1.f44799c;
                C5207g.m11110e(relativeLayout, "progressLayout");
                C4924a.m10457e0(relativeLayout);
            } else {
                RelativeLayout relativeLayout2 = c8287g1.f44799c;
                C5207g.m11110e(relativeLayout2, "progressLayout");
                C4924a.m10442U(relativeLayout2);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterFragment$onViewCreated$4$11$1(C8287g1 c8287g1, RegisterFragment registerFragment, InterfaceC9968c interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f30750f = registerFragment;
        this.f30751g = c8287g1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new RegisterFragment$onViewCreated$4$11$1(this.f30751g, this.f30750f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((RegisterFragment$onViewCreated$4$11$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30749e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = RegisterFragment.f30733J0;
            AuthenticationViewModel authenticationViewModelM10343q0 = this.f30750f.m10343q0();
            C47431 c47431 = new C47431(this.f30751g, null);
            this.f30749e = 1;
            if (C0062b.m369m0(authenticationViewModelM10343q0.f30540R, c47431, this) == coroutineSingletons) {
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
