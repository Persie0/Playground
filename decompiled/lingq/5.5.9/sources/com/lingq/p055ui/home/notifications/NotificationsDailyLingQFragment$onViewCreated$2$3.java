package com.lingq.p055ui.home.notifications;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.notifications.NotificationsDailyLingQFragment$onViewCreated$2$3", m19206f = "NotificationsDailyLingQFragment.kt", m19207l = {83}, m19208m = "invokeSuspend")
public final class NotificationsDailyLingQFragment$onViewCreated$2$3 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25198e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ NotificationsDailyLingQFragment f25199f;

    /* JADX INFO: renamed from: com.lingq.ui.home.notifications.NotificationsDailyLingQFragment$onViewCreated$2$3$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"", "sendNotification", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.notifications.NotificationsDailyLingQFragment$onViewCreated$2$3$1", m19206f = "NotificationsDailyLingQFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C38391 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f25200e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ NotificationsDailyLingQFragment f25201f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38391(NotificationsDailyLingQFragment notificationsDailyLingQFragment, InterfaceC9968c<? super C38391> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f25201f = notificationsDailyLingQFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C38391 c38391 = new C38391(this.f25201f, interfaceC9968c);
            c38391.f25200e = obj;
            return c38391;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C38391) mo1336a(bool, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Boolean bool = (Boolean) this.f25200e;
            if (bool != null) {
                bool.booleanValue();
                InterfaceC6727j<Object>[] interfaceC6727jArr = NotificationsDailyLingQFragment.f25179T0;
                this.f25201f.m9965v0().f45429b.setChecked(bool.booleanValue());
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsDailyLingQFragment$onViewCreated$2$3(NotificationsDailyLingQFragment notificationsDailyLingQFragment, InterfaceC9968c<? super NotificationsDailyLingQFragment$onViewCreated$2$3> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25199f = notificationsDailyLingQFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new NotificationsDailyLingQFragment$onViewCreated$2$3(this.f25199f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((NotificationsDailyLingQFragment$onViewCreated$2$3) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25198e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = NotificationsDailyLingQFragment.f25179T0;
            NotificationsDailyLingQFragment notificationsDailyLingQFragment = this.f25199f;
            NotificationsDailyLingQViewModel notificationsDailyLingQViewModelM9966w0 = notificationsDailyLingQFragment.m9966w0();
            C38391 c38391 = new C38391(notificationsDailyLingQFragment, null);
            this.f25198e = 1;
            if (C0062b.m369m0(notificationsDailyLingQViewModelM9966w0.f25209H, c38391, this) == coroutineSingletons) {
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
