package com.lingq.p055ui.home.notifications;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.List;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.notifications.NotificationsSettingsFragment$onViewCreated$4$1", m19206f = "NotificationsSettingsFragment.kt", m19207l = {71}, m19208m = "invokeSuspend")
public final class NotificationsSettingsFragment$onViewCreated$4$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25339e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ NotificationsSettingsFragment f25340f;

    /* JADX INFO: renamed from: com.lingq.ui.home.notifications.NotificationsSettingsFragment$onViewCreated$4$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/ui/home/notifications/b$a;", "challenges", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.notifications.NotificationsSettingsFragment$onViewCreated$4$1$1", m19206f = "NotificationsSettingsFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C38741 extends SuspendLambda implements InterfaceC2056p<List<? extends C3887b.a>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f25341e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ NotificationsSettingsFragment f25342f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38741(NotificationsSettingsFragment notificationsSettingsFragment, InterfaceC9968c<? super C38741> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f25342f = notificationsSettingsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C38741 c38741 = new C38741(this.f25342f, interfaceC9968c);
            c38741.f25341e = obj;
            return c38741;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends C3887b.a> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C38741) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List list = (List) this.f25341e;
            C3887b c3887b = this.f25342f.f25330C0;
            if (c3887b != null) {
                c3887b.m4529q(list);
                return C9072e.f47360a;
            }
            C5207g.m11117l("notificationsSettingsAdapter");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsSettingsFragment$onViewCreated$4$1(NotificationsSettingsFragment notificationsSettingsFragment, InterfaceC9968c<? super NotificationsSettingsFragment$onViewCreated$4$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25340f = notificationsSettingsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new NotificationsSettingsFragment$onViewCreated$4$1(this.f25340f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((NotificationsSettingsFragment$onViewCreated$4$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25339e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            NotificationsSettingsFragment notificationsSettingsFragment = this.f25340f;
            NotificationsSettingsViewModel notificationsSettingsViewModel = (NotificationsSettingsViewModel) notificationsSettingsFragment.f25329B0.getValue();
            C38741 c38741 = new C38741(notificationsSettingsFragment, null);
            this.f25339e = 1;
            if (C0062b.m369m0(notificationsSettingsViewModel.f25351e, c38741, this) == coroutineSingletons) {
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
