package com.lingq.p055ui.home.notifications;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.language.UserLanguage;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.notifications.NotificationsDailyLingQViewModel$getDailyLingqSettings$1", m19206f = "NotificationsDailyLingQViewModel.kt", m19207l = {52}, m19208m = "invokeSuspend")
final class NotificationsDailyLingQViewModel$getDailyLingqSettings$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25221e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ NotificationsDailyLingQViewModel f25222f;

    /* JADX INFO: renamed from: com.lingq.ui.home.notifications.NotificationsDailyLingQViewModel$getDailyLingqSettings$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserLanguage;", "userLanguage", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.notifications.NotificationsDailyLingQViewModel$getDailyLingqSettings$1$1", m19206f = "NotificationsDailyLingQViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C38461 extends SuspendLambda implements InterfaceC2056p<UserLanguage, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f25223e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ NotificationsDailyLingQViewModel f25224f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38461(NotificationsDailyLingQViewModel notificationsDailyLingQViewModel, InterfaceC9968c<? super C38461> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f25224f = notificationsDailyLingQViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C38461 c38461 = new C38461(this.f25224f, interfaceC9968c);
            c38461.f25223e = obj;
            return c38461;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(UserLanguage userLanguage, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C38461) mo1336a(userLanguage, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            UserLanguage userLanguage = (UserLanguage) this.f25223e;
            if (userLanguage != null) {
                NotificationsDailyLingQViewModel notificationsDailyLingQViewModel = this.f25224f;
                notificationsDailyLingQViewModel.f25214h.setValue(new Integer(userLanguage.f21739n));
                notificationsDailyLingQViewModel.f25216j.setValue(Boolean.valueOf(C5207g.m11106a(userLanguage.f21740o, "on")));
                notificationsDailyLingQViewModel.f25218l.setValue(Boolean.valueOf(C5207g.m11106a(userLanguage.f21741p, "on")));
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsDailyLingQViewModel$getDailyLingqSettings$1(NotificationsDailyLingQViewModel notificationsDailyLingQViewModel, InterfaceC9968c<? super NotificationsDailyLingQViewModel$getDailyLingqSettings$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25222f = notificationsDailyLingQViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new NotificationsDailyLingQViewModel$getDailyLingqSettings$1(this.f25222f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((NotificationsDailyLingQViewModel$getDailyLingqSettings$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25221e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            NotificationsDailyLingQViewModel notificationsDailyLingQViewModel = this.f25222f;
            InterfaceC7116c<UserLanguage> interfaceC7116cMo6036v = notificationsDailyLingQViewModel.f25210d.mo6036v(notificationsDailyLingQViewModel.f25213g.f248a);
            C38461 c38461 = new C38461(notificationsDailyLingQViewModel, null);
            this.f25221e = 1;
            if (C0062b.m369m0(interfaceC7116cMo6036v, c38461, this) == coroutineSingletons) {
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
