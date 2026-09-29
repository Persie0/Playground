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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.notifications.NotificationsDailyLingQFragment$onViewCreated$2$2", m19206f = "NotificationsDailyLingQFragment.kt", m19207l = {75}, m19208m = "invokeSuspend")
public final class NotificationsDailyLingQFragment$onViewCreated$2$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25194e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ NotificationsDailyLingQFragment f25195f;

    /* JADX INFO: renamed from: com.lingq.ui.home.notifications.NotificationsDailyLingQFragment$onViewCreated$2$2$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"", "sendEmail", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.notifications.NotificationsDailyLingQFragment$onViewCreated$2$2$1", m19206f = "NotificationsDailyLingQFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C38381 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f25196e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ NotificationsDailyLingQFragment f25197f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38381(NotificationsDailyLingQFragment notificationsDailyLingQFragment, InterfaceC9968c<? super C38381> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f25197f = notificationsDailyLingQFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C38381 c38381 = new C38381(this.f25197f, interfaceC9968c);
            c38381.f25196e = obj;
            return c38381;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C38381) mo1336a(bool, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Boolean bool = (Boolean) this.f25196e;
            if (bool != null) {
                bool.booleanValue();
                InterfaceC6727j<Object>[] interfaceC6727jArr = NotificationsDailyLingQFragment.f25179T0;
                this.f25197f.m9965v0().f45428a.setChecked(bool.booleanValue());
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsDailyLingQFragment$onViewCreated$2$2(NotificationsDailyLingQFragment notificationsDailyLingQFragment, InterfaceC9968c<? super NotificationsDailyLingQFragment$onViewCreated$2$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25195f = notificationsDailyLingQFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new NotificationsDailyLingQFragment$onViewCreated$2$2(this.f25195f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((NotificationsDailyLingQFragment$onViewCreated$2$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25194e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = NotificationsDailyLingQFragment.f25179T0;
            NotificationsDailyLingQFragment notificationsDailyLingQFragment = this.f25195f;
            NotificationsDailyLingQViewModel notificationsDailyLingQViewModelM9966w0 = notificationsDailyLingQFragment.m9966w0();
            C38381 c38381 = new C38381(notificationsDailyLingQFragment, null);
            this.f25194e = 1;
            if (C0062b.m369m0(notificationsDailyLingQViewModelM9966w0.f25217k, c38381, this) == coroutineSingletons) {
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
