package com.lingq.p055ui.session.magiclink;

import ae.C0062b;
import android.widget.RelativeLayout;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
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
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.session.magiclink.EmailLoginFragment$onViewCreated$5$1", m19206f = "EmailLoginFragment.kt", m19207l = {ModuleDescriptor.MODULE_VERSION}, m19208m = "invokeSuspend")
public final class EmailLoginFragment$onViewCreated$5$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f30898e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ EmailLoginFragment f30899f;

    /* JADX INFO: renamed from: com.lingq.ui.session.magiclink.EmailLoginFragment$onViewCreated$5$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/domain/Resource$Status;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.session.magiclink.EmailLoginFragment$onViewCreated$5$1$1", m19206f = "EmailLoginFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C47581 extends SuspendLambda implements InterfaceC2056p<Resource.Status, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f30900e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ EmailLoginFragment f30901f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47581(EmailLoginFragment emailLoginFragment, InterfaceC9968c<? super C47581> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30901f = emailLoginFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C47581 c47581 = new C47581(this.f30901f, interfaceC9968c);
            c47581.f30900e = obj;
            return c47581;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Resource.Status status, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C47581) mo1336a(status, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Resource.Status status = (Resource.Status) this.f30900e;
            Resource.Status status2 = Resource.Status.LOADING;
            EmailLoginFragment emailLoginFragment = this.f30901f;
            if (status == status2) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = EmailLoginFragment.f30886C0;
                RelativeLayout relativeLayout = emailLoginFragment.m10347o0().f45183c;
                C5207g.m11110e(relativeLayout, "binding.progressLayout");
                C4924a.m10457e0(relativeLayout);
            } else {
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = EmailLoginFragment.f30886C0;
                RelativeLayout relativeLayout2 = emailLoginFragment.m10347o0().f45183c;
                C5207g.m11110e(relativeLayout2, "binding.progressLayout");
                C4924a.m10442U(relativeLayout2);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailLoginFragment$onViewCreated$5$1(EmailLoginFragment emailLoginFragment, InterfaceC9968c<? super EmailLoginFragment$onViewCreated$5$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f30899f = emailLoginFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new EmailLoginFragment$onViewCreated$5$1(this.f30899f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((EmailLoginFragment$onViewCreated$5$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30898e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = EmailLoginFragment.f30886C0;
            EmailLoginFragment emailLoginFragment = this.f30899f;
            EmailLoginViewModel emailLoginViewModelM10348p0 = emailLoginFragment.m10348p0();
            C47581 c47581 = new C47581(emailLoginFragment, null);
            this.f30898e = 1;
            if (C0062b.m369m0(emailLoginViewModelM10348p0.f30917g, c47581, this) == coroutineSingletons) {
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
