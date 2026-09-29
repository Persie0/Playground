package com.lingq.p055ui.home.notifications;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.shimmer.ShimmerFrameLayout;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.notifications.NotificationsFragment$onViewCreated$4$2", m19206f = "NotificationsFragment.kt", m19207l = {160}, m19208m = "invokeSuspend")
public final class NotificationsFragment$onViewCreated$4$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25306e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ NotificationsFragment f25307f;

    /* JADX INFO: renamed from: com.lingq.ui.home.notifications.NotificationsFragment$onViewCreated$4$2$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "isLoading", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.notifications.NotificationsFragment$onViewCreated$4$2$1", m19206f = "NotificationsFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C38661 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ boolean f25308e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ NotificationsFragment f25309f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38661(NotificationsFragment notificationsFragment, InterfaceC9968c<? super C38661> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f25309f = notificationsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C38661 c38661 = new C38661(this.f25309f, interfaceC9968c);
            c38661.f25308e = ((Boolean) obj).booleanValue();
            return c38661;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C38661) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            boolean z10 = this.f25308e;
            InterfaceC6727j<Object>[] interfaceC6727jArr = NotificationsFragment.f25285F0;
            ShimmerFrameLayout shimmerFrameLayout = this.f25309f.m9968o0().f45349b;
            C5207g.m11110e(shimmerFrameLayout, "binding.shimmerLayout");
            shimmerFrameLayout.setVisibility(z10 ? 0 : 4);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsFragment$onViewCreated$4$2(NotificationsFragment notificationsFragment, InterfaceC9968c<? super NotificationsFragment$onViewCreated$4$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25307f = notificationsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new NotificationsFragment$onViewCreated$4$2(this.f25307f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((NotificationsFragment$onViewCreated$4$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25306e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = NotificationsFragment.f25285F0;
            NotificationsFragment notificationsFragment = this.f25307f;
            NotificationsViewModel notificationsViewModelM9969p0 = notificationsFragment.m9969p0();
            C38661 c38661 = new C38661(notificationsFragment, null);
            this.f25306e = 1;
            if (C0062b.m369m0(notificationsViewModelM9969p0.f25355I, c38661, this) == coroutineSingletons) {
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
