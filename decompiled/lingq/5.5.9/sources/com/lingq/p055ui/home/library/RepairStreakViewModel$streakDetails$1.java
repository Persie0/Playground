package com.lingq.p055ui.home.library;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004* \u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u00002\u001e\u0010\u0003\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lkotlin/Triple;", "", "streakDetails", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.library.RepairStreakViewModel$streakDetails$1", m19206f = "RepairStreakViewModel.kt", m19207l = {52}, m19208m = "invokeSuspend")
final class RepairStreakViewModel$streakDetails$1 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super Triple<? extends Integer, ? extends Integer, ? extends Integer>>, Triple<? extends Integer, ? extends Integer, ? extends Integer>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25001e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f25002f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Triple f25003g;

    public RepairStreakViewModel$streakDetails$1(InterfaceC9968c<? super RepairStreakViewModel$streakDetails$1> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super Triple<? extends Integer, ? extends Integer, ? extends Integer>> interfaceC7117d, Triple<? extends Integer, ? extends Integer, ? extends Integer> triple, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        RepairStreakViewModel$streakDetails$1 repairStreakViewModel$streakDetails$1 = new RepairStreakViewModel$streakDetails$1(interfaceC9968c);
        repairStreakViewModel$streakDetails$1.f25002f = interfaceC7117d;
        repairStreakViewModel$streakDetails$1.f25003g = triple;
        return repairStreakViewModel$streakDetails$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25001e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f25002f;
            Triple triple = this.f25003g;
            Triple triple2 = new Triple(triple.f38021a, triple.f38022b, triple.f38023c);
            this.f25002f = null;
            this.f25001e = 1;
            if (interfaceC7117d.mo1339r(triple2, this) == coroutineSingletons) {
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
