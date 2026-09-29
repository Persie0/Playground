package com.lingq.p055ui.home.notifications;

import ae.C0062b;
import androidx.navigation.NavController;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.util.C4924a;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7137r;
import no.InterfaceC7882z;
import p014aj.C0094k;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.notifications.NotificationSettingsParentFragment$onViewCreated$2$1", m19206f = "NotificationSettingsParentFragment.kt", m19207l = {68}, m19208m = "invokeSuspend")
public final class NotificationSettingsParentFragment$onViewCreated$2$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25162e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ NotificationSettingsParentFragment f25163f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ NavController f25164g;

    /* JADX INFO: renamed from: com.lingq.ui.home.notifications.NotificationSettingsParentFragment$onViewCreated$2$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "code", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.notifications.NotificationSettingsParentFragment$onViewCreated$2$1$1", m19206f = "NotificationSettingsParentFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C38301 extends SuspendLambda implements InterfaceC2056p<String, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f25165e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ NavController f25166f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38301(NavController navController, InterfaceC9968c<? super C38301> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f25166f = navController;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C38301 c38301 = new C38301(this.f25166f, interfaceC9968c);
            c38301.f25165e = obj;
            return c38301;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C38301) mo1336a(str, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            String str = (String) this.f25165e;
            C5207g.m11111f(str, "code");
            C4924a.m10447Z(this.f25166f, new C0094k(str));
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationSettingsParentFragment$onViewCreated$2$1(NavController navController, NotificationSettingsParentFragment notificationSettingsParentFragment, InterfaceC9968c interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25163f = notificationSettingsParentFragment;
        this.f25164g = navController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new NotificationSettingsParentFragment$onViewCreated$2$1(this.f25164g, this.f25163f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((NotificationSettingsParentFragment$onViewCreated$2$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25162e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7137r<String> interfaceC7137rMo489m1 = ((NotificationsSettingsParentViewModel) this.f25163f.f25152Q0.getValue()).mo489m1();
            C38301 c38301 = new C38301(this.f25164g, null);
            this.f25162e = 1;
            if (C0062b.m369m0(interfaceC7137rMo489m1, c38301, this) == coroutineSingletons) {
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
