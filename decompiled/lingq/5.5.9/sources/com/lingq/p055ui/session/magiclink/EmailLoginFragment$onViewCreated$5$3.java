package com.lingq.p055ui.session.magiclink;

import ae.C0062b;
import androidx.navigation.NavController;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.util.C4924a;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p032bk.C1606c;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.session.magiclink.EmailLoginFragment$onViewCreated$5$3", m19206f = "EmailLoginFragment.kt", m19207l = {104}, m19208m = "invokeSuspend")
public final class EmailLoginFragment$onViewCreated$5$3 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f30905e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ EmailLoginFragment f30906f;

    /* JADX INFO: renamed from: com.lingq.ui.session.magiclink.EmailLoginFragment$onViewCreated$5$3$1 */
    @Metadata(m13364d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "it", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.session.magiclink.EmailLoginFragment$onViewCreated$5$3$1", m19206f = "EmailLoginFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C47601 extends SuspendLambda implements InterfaceC2056p<C9072e, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ EmailLoginFragment f30907e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47601(EmailLoginFragment emailLoginFragment, InterfaceC9968c<? super C47601> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30907e = emailLoginFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C47601(this.f30907e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(C9072e c9072e, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C47601) mo1336a(c9072e, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            EmailLoginFragment emailLoginFragment = this.f30907e;
            NavController navControllerM16725g0 = C8573r0.m16725g0(emailLoginFragment);
            InterfaceC6727j<Object>[] interfaceC6727jArr = EmailLoginFragment.f30886C0;
            C4924a.m10447Z(navControllerM16725g0, new C1606c(String.valueOf(emailLoginFragment.m10347o0().f45182b.getText())));
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailLoginFragment$onViewCreated$5$3(EmailLoginFragment emailLoginFragment, InterfaceC9968c<? super EmailLoginFragment$onViewCreated$5$3> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f30906f = emailLoginFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new EmailLoginFragment$onViewCreated$5$3(this.f30906f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((EmailLoginFragment$onViewCreated$5$3) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30905e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = EmailLoginFragment.f30886C0;
            EmailLoginFragment emailLoginFragment = this.f30906f;
            EmailLoginViewModel emailLoginViewModelM10348p0 = emailLoginFragment.m10348p0();
            C47601 c47601 = new C47601(emailLoginFragment, null);
            this.f30905e = 1;
            if (C0062b.m369m0(emailLoginViewModelM10348p0.f30921k, c47601, this) == coroutineSingletons) {
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
