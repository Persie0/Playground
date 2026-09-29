package com.lingq.p055ui.home.notifications;

import ci.InterfaceC2018k;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.StateFlowImpl;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.notifications.NotificationsViewModel$networkGetNotifications$1", m19206f = "NotificationsViewModel.kt", m19207l = {133, 138}, m19208m = "invokeSuspend")
final class NotificationsViewModel$networkGetNotifications$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25380e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ NotificationsViewModel f25381f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsViewModel$networkGetNotifications$1(NotificationsViewModel notificationsViewModel, InterfaceC9968c<? super NotificationsViewModel$networkGetNotifications$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f25381f = notificationsViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((NotificationsViewModel$networkGetNotifications$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new NotificationsViewModel$networkGetNotifications$1(this.f25381f, interfaceC9968c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25380e;
        NotificationsViewModel notificationsViewModel = this.f25381f;
        boolean z10 = true;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    C7499b.m14977z0(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj);
                }
                return C9072e.f47360a;
            }
            C7499b.m14977z0(obj);
            InterfaceC2018k interfaceC2018k = notificationsViewModel.f25362d;
            String strMo498E1 = notificationsViewModel.mo498E1();
            int iIntValue = ((Number) notificationsViewModel.f25358L.getValue()).intValue();
            this.f25380e = 1;
            obj = interfaceC2018k.mo6091b(iIntValue, strMo498E1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            Pair pair = (Pair) obj;
            int iIntValue2 = ((Number) pair.f38012a).intValue();
            int iIntValue3 = ((Number) pair.f38013b).intValue();
            StateFlowImpl stateFlowImpl = notificationsViewModel.f25356J;
            if (iIntValue2 != 0 || ((Number) notificationsViewModel.f25358L.getValue()).intValue() != 1) {
                z10 = false;
            }
            stateFlowImpl.setValue(Boolean.valueOf(z10));
            this.f25380e = 2;
            if (notificationsViewModel.mo9328D0(iIntValue3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } catch (Exception unused) {
        }
        return C9072e.f47360a;
    }
}
