package com.lingq.p055ui.home.notifications;

import ci.InterfaceC2018k;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7116c;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.notifications.NotificationsViewModel$updateNotifications$1", m19206f = "NotificationsViewModel.kt", m19207l = {109, 111, 117, 121}, m19208m = "invokeSuspend")
public final class NotificationsViewModel$updateNotifications$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25387e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f25388f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ NotificationsViewModel f25389g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ List<Integer> f25390h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsViewModel$updateNotifications$1(boolean z10, NotificationsViewModel notificationsViewModel, List<Integer> list, InterfaceC9968c<? super NotificationsViewModel$updateNotifications$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25388f = z10;
        this.f25389g = notificationsViewModel;
        this.f25390h = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new NotificationsViewModel$updateNotifications$1(this.f25388f, this.f25389g, this.f25390h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((NotificationsViewModel$updateNotifications$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0089  */
    /* JADX WARN: Code duplicated, block: B:35:0x009d  */
    /* JADX WARN: Code duplicated, block: B:37:0x009f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25387e;
        int iIntValue = 0;
        List<Integer> list = this.f25390h;
        boolean z10 = this.f25388f;
        NotificationsViewModel notificationsViewModel = this.f25389g;
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                C7499b.m14977z0(obj);
            } else if (i10 == 3) {
                C7499b.m14977z0(obj);
                Integer num = (Integer) ((Map) obj).get(notificationsViewModel.mo498E1());
                iIntValue = (num != null ? num.intValue() : 0) - list.size();
                this.f25387e = 4;
                if (notificationsViewModel.mo9328D0(iIntValue, this) == coroutineSingletons) {
                }
            } else {
                if (i10 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
        }
        C7499b.m14977z0(obj);
        if (z10) {
            InterfaceC2018k interfaceC2018k = notificationsViewModel.f25362d;
            String strMo498E1 = notificationsViewModel.mo498E1();
            this.f25387e = 1;
            if (interfaceC2018k.mo6092c(strMo498E1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            InterfaceC2018k interfaceC2018k2 = notificationsViewModel.f25362d;
            String strMo498E2 = notificationsViewModel.mo498E1();
            this.f25387e = 2;
            if (interfaceC2018k2.mo6093d(strMo498E2, list, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        if (!z10) {
            InterfaceC7116c<Map<String, Integer>> interfaceC7116cMo9678b = notificationsViewModel.f25364f.mo9678b();
            this.f25387e = 3;
            obj = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9678b, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            Integer num2 = (Integer) ((Map) obj).get(notificationsViewModel.mo498E1());
            iIntValue = (num2 != null ? num2.intValue() : 0) - list.size();
        }
        this.f25387e = 4;
        return notificationsViewModel.mo9328D0(iIntValue, this) == coroutineSingletons ? coroutineSingletons : C9072e.f47360a;
    }
}
