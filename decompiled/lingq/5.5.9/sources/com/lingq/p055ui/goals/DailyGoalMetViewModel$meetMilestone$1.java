package com.lingq.p055ui.goals;

import ci.InterfaceC2016i;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.UserMilestone;
import com.lingq.shared.util.DailyGoalMet;
import com.lingq.util.C4924a;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.goals.DailyGoalMetViewModel$meetMilestone$1", m19206f = "DailyGoalMetViewModel.kt", m19207l = {126, 127}, m19208m = "invokeSuspend")
final class DailyGoalMetViewModel$meetMilestone$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public DailyGoalMetViewModel f22615e;

    /* JADX INFO: renamed from: f */
    public int f22616f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ DailyGoalMetViewModel f22617g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DailyGoalMetViewModel$meetMilestone$1(DailyGoalMetViewModel dailyGoalMetViewModel, InterfaceC9968c<? super DailyGoalMetViewModel$meetMilestone$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f22617g = dailyGoalMetViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new DailyGoalMetViewModel$meetMilestone$1(this.f22617g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((DailyGoalMetViewModel$meetMilestone$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007a A[RETURN] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        DailyGoalMetViewModel dailyGoalMetViewModel;
        String str;
        InterfaceC2016i interfaceC2016i;
        String strMo498E1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f22616f;
        try {
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                dailyGoalMetViewModel = this.f22617g;
                DailyGoalMet dailyGoalMet = (DailyGoalMet) dailyGoalMetViewModel.f22611k.getValue();
                if (dailyGoalMet == null || (str = dailyGoalMet.f22151f) == null) {
                    UserMilestone userMilestone = (UserMilestone) dailyGoalMetViewModel.f22592H.getValue();
                    str = userMilestone != null ? userMilestone.f21627b : null;
                }
                if (str != null) {
                    InterfaceC2016i interfaceC2016i2 = dailyGoalMetViewModel.f22604d;
                    String strMo498E2 = dailyGoalMetViewModel.mo498E1();
                    String strM10456e = C4924a.m10456e();
                    this.f22615e = dailyGoalMetViewModel;
                    this.f22616f = 1;
                    if (interfaceC2016i2.mo6081b(strMo498E2, str, strM10456e, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC2016i = dailyGoalMetViewModel.f22604d;
                    strMo498E1 = dailyGoalMetViewModel.mo498E1();
                    this.f22615e = null;
                    this.f22616f = 2;
                    if (interfaceC2016i.mo6083d(strMo498E1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else if (i10 == 1) {
                dailyGoalMetViewModel = this.f22615e;
                C7499b.m14977z0(obj);
                interfaceC2016i = dailyGoalMetViewModel.f22604d;
                strMo498E1 = dailyGoalMetViewModel.mo498E1();
                this.f22615e = null;
                this.f22616f = 2;
                if (interfaceC2016i.mo6083d(strMo498E1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
        } catch (Exception unused) {
        }
        return C9072e.f47360a;
    }
}
