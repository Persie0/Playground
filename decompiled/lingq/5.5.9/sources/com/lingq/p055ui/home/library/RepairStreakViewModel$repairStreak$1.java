package com.lingq.p055ui.home.library;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.flow.StateFlowImpl;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.library.RepairStreakViewModel$repairStreak$1", m19206f = "RepairStreakViewModel.kt", m19207l = {82, 87}, m19208m = "invokeSuspend")
final class RepairStreakViewModel$repairStreak$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24999e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ RepairStreakViewModel f25000f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepairStreakViewModel$repairStreak$1(RepairStreakViewModel repairStreakViewModel, InterfaceC9968c<? super RepairStreakViewModel$repairStreak$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25000f = repairStreakViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new RepairStreakViewModel$repairStreak$1(this.f25000f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((RepairStreakViewModel$repairStreak$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24999e;
        RepairStreakViewModel repairStreakViewModel = this.f25000f;
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
        boolean zM15512e = repairStreakViewModel.f24984e.m15512e();
        StateFlowImpl stateFlowImpl = repairStreakViewModel.f24991l;
        if (zM15512e) {
            stateFlowImpl.setValue(Boolean.TRUE);
            String strMo498E1 = repairStreakViewModel.mo498E1();
            Integer num = (Integer) repairStreakViewModel.f24987h.getValue();
            int iIntValue = num != null ? num.intValue() : 1;
            this.f24999e = 1;
            obj = repairStreakViewModel.f24983d.mo6052m(iIntValue, strMo498E1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            stateFlowImpl.setValue(Boolean.FALSE);
            repairStreakViewModel.f24989j.mo16479j("Please connect to the internet");
        }
        return C9072e.f47360a;
        String str = (String) obj;
        if (str != null) {
            repairStreakViewModel.f24991l.setValue(Boolean.FALSE);
            repairStreakViewModel.f24989j.mo16479j(str);
        } else {
            AbstractChannel abstractChannel = repairStreakViewModel.f24981L;
            C9072e c9072e = C9072e.f47360a;
            this.f24999e = 2;
            if (abstractChannel.mo16480k(c9072e, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }
}
