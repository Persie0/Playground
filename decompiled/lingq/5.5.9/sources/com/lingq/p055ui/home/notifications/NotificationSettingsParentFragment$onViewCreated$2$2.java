package com.lingq.p055ui.home.notifications;

import ae.C0062b;
import androidx.navigation.NavController;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7137r;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.notifications.NotificationSettingsParentFragment$onViewCreated$2$2", m19206f = "NotificationSettingsParentFragment.kt", m19207l = {78}, m19208m = "invokeSuspend")
public final class NotificationSettingsParentFragment$onViewCreated$2$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25167e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ NotificationSettingsParentFragment f25168f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ NavController f25169g;

    /* JADX INFO: renamed from: com.lingq.ui.home.notifications.NotificationSettingsParentFragment$onViewCreated$2$2$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.notifications.NotificationSettingsParentFragment$onViewCreated$2$2$1", m19206f = "NotificationSettingsParentFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C38311 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ boolean f25170e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ NavController f25171f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38311(NavController navController, InterfaceC9968c<? super C38311> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f25171f = navController;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C38311 c38311 = new C38311(this.f25171f, interfaceC9968c);
            c38311.f25170e = ((Boolean) obj).booleanValue();
            return c38311;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C38311) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            if (this.f25170e) {
                this.f25171f.m3995p();
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationSettingsParentFragment$onViewCreated$2$2(NavController navController, NotificationSettingsParentFragment notificationSettingsParentFragment, InterfaceC9968c interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25168f = notificationSettingsParentFragment;
        this.f25169g = navController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new NotificationSettingsParentFragment$onViewCreated$2$2(this.f25169g, this.f25168f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((NotificationSettingsParentFragment$onViewCreated$2$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25167e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7137r<Boolean> interfaceC7137rMo488d0 = ((NotificationsSettingsParentViewModel) this.f25168f.f25152Q0.getValue()).mo488d0();
            C38311 c38311 = new C38311(this.f25169g, null);
            this.f25167e = 1;
            if (C0062b.m369m0(interfaceC7137rMo488d0, c38311, this) == coroutineSingletons) {
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
