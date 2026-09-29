package com.lingq.p055ui.home.notifications;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p014aj.C0096m;
import p260m8.C7499b;
import p278nh.C7785l;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.notifications.NotificationsDailyLingqSelectionFragment$onViewCreated$3$1", m19206f = "NotificationsDailyLingqSelectionFragment.kt", m19207l = {63}, m19208m = "invokeSuspend")
public final class NotificationsDailyLingqSelectionFragment$onViewCreated$3$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25246e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ NotificationsDailyLingqSelectionFragment f25247f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0096m f25248g;

    /* JADX INFO: renamed from: com.lingq.ui.home.notifications.NotificationsDailyLingqSelectionFragment$onViewCreated$3$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lnh/l;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.notifications.NotificationsDailyLingqSelectionFragment$onViewCreated$3$1$1", m19206f = "NotificationsDailyLingqSelectionFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C38491 extends SuspendLambda implements InterfaceC2056p<List<? extends C7785l>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f25249e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ C0096m f25250f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38491(C0096m c0096m, InterfaceC9968c<? super C38491> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f25250f = c0096m;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C38491 c38491 = new C38491(this.f25250f, interfaceC9968c);
            c38491.f25249e = obj;
            return c38491;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends C7785l> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C38491) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f25250f.m4529q((List) this.f25249e);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsDailyLingqSelectionFragment$onViewCreated$3$1(C0096m c0096m, NotificationsDailyLingqSelectionFragment notificationsDailyLingqSelectionFragment, InterfaceC9968c interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25247f = notificationsDailyLingqSelectionFragment;
        this.f25248g = c0096m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new NotificationsDailyLingqSelectionFragment$onViewCreated$3$1(this.f25248g, this.f25247f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((NotificationsDailyLingqSelectionFragment$onViewCreated$3$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25246e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            NotificationsDailyLingqSelectionViewModel notificationsDailyLingqSelectionViewModel = (NotificationsDailyLingqSelectionViewModel) this.f25247f.f25233B0.getValue();
            C38491 c38491 = new C38491(this.f25248g, null);
            this.f25246e = 1;
            if (C0062b.m369m0(notificationsDailyLingqSelectionViewModel.f25272j, c38491, this) == coroutineSingletons) {
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
