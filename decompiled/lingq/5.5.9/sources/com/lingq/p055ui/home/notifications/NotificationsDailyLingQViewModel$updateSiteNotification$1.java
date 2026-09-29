package com.lingq.p055ui.home.notifications;

import ci.InterfaceC2012e;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.notifications.NotificationsDailyLingQViewModel$updateSiteNotification$1", m19206f = "NotificationsDailyLingQViewModel.kt", m19207l = {75}, m19208m = "invokeSuspend")
final class NotificationsDailyLingQViewModel$updateSiteNotification$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25228e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ NotificationsDailyLingQViewModel f25229f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean f25230g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsDailyLingQViewModel$updateSiteNotification$1(NotificationsDailyLingQViewModel notificationsDailyLingQViewModel, boolean z10, InterfaceC9968c<? super NotificationsDailyLingQViewModel$updateSiteNotification$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25229f = notificationsDailyLingQViewModel;
        this.f25230g = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new NotificationsDailyLingQViewModel$updateSiteNotification$1(this.f25229f, this.f25230g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((NotificationsDailyLingQViewModel$updateSiteNotification$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25228e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            NotificationsDailyLingQViewModel notificationsDailyLingQViewModel = this.f25229f;
            InterfaceC2012e interfaceC2012e = notificationsDailyLingQViewModel.f25210d;
            String str = notificationsDailyLingQViewModel.f25213g.f248a;
            this.f25228e = 1;
            if (interfaceC2012e.mo6022h(str, this.f25230g, this) == coroutineSingletons) {
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
