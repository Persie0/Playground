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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.notifications.NotificationsDailyLingQFragment$onViewCreated$2$1", m19206f = "NotificationsDailyLingQFragment.kt", m19207l = {67}, m19208m = "invokeSuspend")
public final class NotificationsDailyLingQFragment$onViewCreated$2$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25190e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ NotificationsDailyLingQFragment f25191f;

    /* JADX INFO: renamed from: com.lingq.ui.home.notifications.NotificationsDailyLingQFragment$onViewCreated$2$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"", "count", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.notifications.NotificationsDailyLingQFragment$onViewCreated$2$1$1", m19206f = "NotificationsDailyLingQFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C38371 extends SuspendLambda implements InterfaceC2056p<Integer, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f25192e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ NotificationsDailyLingQFragment f25193f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38371(NotificationsDailyLingQFragment notificationsDailyLingQFragment, InterfaceC9968c<? super C38371> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f25193f = notificationsDailyLingQFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C38371 c38371 = new C38371(this.f25193f, interfaceC9968c);
            c38371.f25192e = obj;
            return c38371;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Integer num, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C38371) mo1336a(num, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Integer num = (Integer) this.f25192e;
            if (num != null) {
                num.intValue();
                InterfaceC6727j<Object>[] interfaceC6727jArr = NotificationsDailyLingQFragment.f25179T0;
                this.f25193f.m9965v0().f45430c.setText(num.toString());
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsDailyLingQFragment$onViewCreated$2$1(NotificationsDailyLingQFragment notificationsDailyLingQFragment, InterfaceC9968c<? super NotificationsDailyLingQFragment$onViewCreated$2$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25191f = notificationsDailyLingQFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new NotificationsDailyLingQFragment$onViewCreated$2$1(this.f25191f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((NotificationsDailyLingQFragment$onViewCreated$2$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25190e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = NotificationsDailyLingQFragment.f25179T0;
            NotificationsDailyLingQFragment notificationsDailyLingQFragment = this.f25191f;
            NotificationsDailyLingQViewModel notificationsDailyLingQViewModelM9966w0 = notificationsDailyLingQFragment.m9966w0();
            C38371 c38371 = new C38371(notificationsDailyLingQFragment, null);
            this.f25190e = 1;
            if (C0062b.m369m0(notificationsDailyLingQViewModelM9966w0.f25215i, c38371, this) == coroutineSingletons) {
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
