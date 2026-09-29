package com.lingq.p055ui.home.notifications;

import ae.C0062b;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.StateFlowImpl;
import p203ji.C6479a;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.notifications.NotificationsViewModel$observableNotifications$1", m19206f = "NotificationsViewModel.kt", m19207l = {95}, m19208m = "invokeSuspend")
final class NotificationsViewModel$observableNotifications$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25382e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ NotificationsViewModel f25383f;

    /* JADX INFO: renamed from: com.lingq.ui.home.notifications.NotificationsViewModel$observableNotifications$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lji/a;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.notifications.NotificationsViewModel$observableNotifications$1$1", m19206f = "NotificationsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C38841 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super List<? extends C6479a>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ NotificationsViewModel f25384e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38841(NotificationsViewModel notificationsViewModel, InterfaceC9968c<? super C38841> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f25384e = notificationsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C38841(this.f25384e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super List<? extends C6479a>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C38841) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            NotificationsViewModel notificationsViewModel = this.f25384e;
            StateFlowImpl stateFlowImpl = notificationsViewModel.f25354H;
            boolean z10 = true;
            if (((Number) notificationsViewModel.f25358L.getValue()).intValue() != 1) {
                z10 = false;
            }
            stateFlowImpl.setValue(Boolean.valueOf(z10));
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.notifications.NotificationsViewModel$observableNotifications$1$2 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lji/a;", "notifications", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.notifications.NotificationsViewModel$observableNotifications$1$2", m19206f = "NotificationsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C38852 extends SuspendLambda implements InterfaceC2056p<List<? extends C6479a>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f25385e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ NotificationsViewModel f25386f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38852(NotificationsViewModel notificationsViewModel, InterfaceC9968c<? super C38852> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f25386f = notificationsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C38852 c38852 = new C38852(this.f25386f, interfaceC9968c);
            c38852.f25385e = obj;
            return c38852;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends C6479a> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C38852) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List list = (List) this.f25385e;
            NotificationsViewModel notificationsViewModel = this.f25386f;
            notificationsViewModel.f25360N.setValue(list);
            notificationsViewModel.f25354H.setValue(Boolean.valueOf(!((Boolean) notificationsViewModel.f25356J.getValue()).booleanValue() && list.isEmpty()));
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsViewModel$observableNotifications$1(NotificationsViewModel notificationsViewModel, InterfaceC9968c<? super NotificationsViewModel$observableNotifications$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f25383f = notificationsViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((NotificationsViewModel$observableNotifications$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new NotificationsViewModel$observableNotifications$1(this.f25383f, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25382e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            NotificationsViewModel notificationsViewModel = this.f25383f;
            FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new C38841(notificationsViewModel, null), notificationsViewModel.f25362d.mo6090a(notificationsViewModel.mo498E1(), ((Number) notificationsViewModel.f25358L.getValue()).intValue() * 20));
            C38852 c38852 = new C38852(notificationsViewModel, null);
            this.f25382e = 1;
            if (C0062b.m369m0(flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, c38852, this) == coroutineSingletons) {
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
