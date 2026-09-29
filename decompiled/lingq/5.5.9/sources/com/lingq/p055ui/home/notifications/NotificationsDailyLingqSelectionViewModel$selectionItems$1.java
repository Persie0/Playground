package com.lingq.p055ui.home.notifications;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p278nh.C7785l;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lnh/l;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.notifications.NotificationsDailyLingqSelectionViewModel$selectionItems$1", m19206f = "NotificationsDailyLingqSelectionViewModel.kt", m19207l = {34}, m19208m = "invokeSuspend")
final class NotificationsDailyLingqSelectionViewModel$selectionItems$1 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super List<? extends C7785l>>, List<? extends C7785l>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25279e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f25280f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ List f25281g;

    public NotificationsDailyLingqSelectionViewModel$selectionItems$1(InterfaceC9968c<? super NotificationsDailyLingqSelectionViewModel$selectionItems$1> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super List<? extends C7785l>> interfaceC7117d, List<? extends C7785l> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        NotificationsDailyLingqSelectionViewModel$selectionItems$1 notificationsDailyLingqSelectionViewModel$selectionItems$1 = new NotificationsDailyLingqSelectionViewModel$selectionItems$1(interfaceC9968c);
        notificationsDailyLingqSelectionViewModel$selectionItems$1.f25280f = interfaceC7117d;
        notificationsDailyLingqSelectionViewModel$selectionItems$1.f25281g = list;
        return notificationsDailyLingqSelectionViewModel$selectionItems$1.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25279e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f25280f;
            List list = this.f25281g;
            this.f25280f = null;
            this.f25279e = 1;
            if (interfaceC7117d.mo1339r(list, this) == coroutineSingletons) {
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
