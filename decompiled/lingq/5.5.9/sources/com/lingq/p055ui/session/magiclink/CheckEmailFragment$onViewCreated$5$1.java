package com.lingq.p055ui.session.magiclink;

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
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.session.magiclink.CheckEmailFragment$onViewCreated$5$1", m19206f = "CheckEmailFragment.kt", m19207l = {104}, m19208m = "invokeSuspend")
public final class CheckEmailFragment$onViewCreated$5$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f30856e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CheckEmailFragment f30857f;

    /* JADX INFO: renamed from: com.lingq.ui.session.magiclink.CheckEmailFragment$onViewCreated$5$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/domain/Resource$Status;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.session.magiclink.CheckEmailFragment$onViewCreated$5$1$1", m19206f = "CheckEmailFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C47511 extends SuspendLambda implements InterfaceC2056p<Resource.Status, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f30858e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ CheckEmailFragment f30859f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47511(CheckEmailFragment checkEmailFragment, InterfaceC9968c<? super C47511> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30859f = checkEmailFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C47511 c47511 = new C47511(this.f30859f, interfaceC9968c);
            c47511.f30858e = obj;
            return c47511;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Resource.Status status, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C47511) mo1336a(status, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Resource.Status status = (Resource.Status) this.f30858e;
            Resource.Status status2 = Resource.Status.LOADING;
            CheckEmailFragment checkEmailFragment = this.f30859f;
            if (status == status2) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = CheckEmailFragment.f30844E0;
                RelativeLayout relativeLayout = checkEmailFragment.m10345o0().f44828c;
                C5207g.m11110e(relativeLayout, "binding.progressLayout");
                C4924a.m10457e0(relativeLayout);
            } else {
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = CheckEmailFragment.f30844E0;
                RelativeLayout relativeLayout2 = checkEmailFragment.m10345o0().f44828c;
                C5207g.m11110e(relativeLayout2, "binding.progressLayout");
                C4924a.m10442U(relativeLayout2);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckEmailFragment$onViewCreated$5$1(CheckEmailFragment checkEmailFragment, InterfaceC9968c<? super CheckEmailFragment$onViewCreated$5$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f30857f = checkEmailFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CheckEmailFragment$onViewCreated$5$1(this.f30857f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CheckEmailFragment$onViewCreated$5$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30856e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = CheckEmailFragment.f30844E0;
            CheckEmailFragment checkEmailFragment = this.f30857f;
            CheckEmailViewModel checkEmailViewModel = (CheckEmailViewModel) checkEmailFragment.f30846B0.getValue();
            C47511 c47511 = new C47511(checkEmailFragment, null);
            this.f30856e = 1;
            if (C0062b.m369m0(checkEmailViewModel.f30874h, c47511, this) == coroutineSingletons) {
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
