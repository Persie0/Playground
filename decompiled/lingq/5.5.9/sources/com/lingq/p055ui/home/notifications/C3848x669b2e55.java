package com.lingq.p055ui.home.notifications;

import androidx.fragment.app.C0980t0;
import androidx.fragment.app.Fragment;
import androidx.view.C1052r;
import androidx.view.Lifecycle;
import androidx.view.RepeatOnLifecycleKt;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.C7828f;
import no.InterfaceC7882z;
import p014aj.C0096m;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: renamed from: com.lingq.ui.home.notifications.NotificationsDailyLingqSelectionFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.notifications.NotificationsDailyLingqSelectionFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1", m19206f = "NotificationsDailyLingqSelectionFragment.kt", m19207l = {119}, m19208m = "invokeSuspend")
public final class C3848x669b2e55 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25238e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Fragment f25239f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Lifecycle.State f25240g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ NotificationsDailyLingqSelectionFragment f25241h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0096m f25242i;

    /* JADX INFO: renamed from: com.lingq.ui.home.notifications.NotificationsDailyLingqSelectionFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1, reason: invalid class name */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.notifications.NotificationsDailyLingqSelectionFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1", m19206f = "NotificationsDailyLingqSelectionFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f25243e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ NotificationsDailyLingqSelectionFragment f25244f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ C0096m f25245g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C0096m c0096m, NotificationsDailyLingqSelectionFragment notificationsDailyLingqSelectionFragment, InterfaceC9968c interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f25244f = notificationsDailyLingqSelectionFragment;
            this.f25245g = c0096m;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f25245g, this.f25244f, interfaceC9968c);
            anonymousClass1.f25243e = obj;
            return anonymousClass1;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((AnonymousClass1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            InterfaceC7882z interfaceC7882z = (InterfaceC7882z) this.f25243e;
            C0096m c0096m = this.f25245g;
            NotificationsDailyLingqSelectionFragment notificationsDailyLingqSelectionFragment = this.f25244f;
            C7828f.m15570d(interfaceC7882z, null, null, new NotificationsDailyLingqSelectionFragment$onViewCreated$3$1(c0096m, notificationsDailyLingqSelectionFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new NotificationsDailyLingqSelectionFragment$onViewCreated$3$2(notificationsDailyLingqSelectionFragment, null), 3);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3848x669b2e55(Fragment fragment, Lifecycle.State state, InterfaceC9968c interfaceC9968c, NotificationsDailyLingqSelectionFragment notificationsDailyLingqSelectionFragment, C0096m c0096m) {
        super(2, interfaceC9968c);
        this.f25239f = fragment;
        this.f25240g = state;
        this.f25241h = notificationsDailyLingqSelectionFragment;
        this.f25242i = c0096m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new C3848x669b2e55(this.f25239f, this.f25240g, interfaceC9968c, this.f25241h, this.f25242i);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((C3848x669b2e55) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25238e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            C0980t0 c0980t0M3601v = this.f25239f.m3601v();
            c0980t0M3601v.m3813c();
            C1052r c1052r = c0980t0M3601v.f6415d;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f25242i, this.f25241h, null);
            this.f25238e = 1;
            if (RepeatOnLifecycleKt.m3906b(c1052r, this.f25240g, anonymousClass1, this) == coroutineSingletons) {
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
