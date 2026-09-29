package com.lingq.p055ui.home.library;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.p053ui.views.StreakActivityLevelView;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.library.RepairStreakFragment$onViewCreated$2$2", m19206f = "RepairStreakFragment.kt", m19207l = {67}, m19208m = "invokeSuspend")
public final class RepairStreakFragment$onViewCreated$2$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24951e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ RepairStreakFragment f24952f;

    /* JADX INFO: renamed from: com.lingq.ui.home.library.RepairStreakFragment$onViewCreated$2$2$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u001e\u0010\u0002\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Triple;", "", "<name for destructuring parameter 0>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.RepairStreakFragment$onViewCreated$2$2$1", m19206f = "RepairStreakFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C38001 extends SuspendLambda implements InterfaceC2056p<Triple<? extends Integer, ? extends Integer, ? extends Integer>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f24953e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ RepairStreakFragment f24954f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38001(RepairStreakFragment repairStreakFragment, InterfaceC9968c<? super C38001> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24954f = repairStreakFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C38001 c38001 = new C38001(this.f24954f, interfaceC9968c);
            c38001.f24953e = obj;
            return c38001;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Triple<? extends Integer, ? extends Integer, ? extends Integer> triple, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C38001) mo1336a(triple, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Triple triple = (Triple) this.f24953e;
            Integer num = (Integer) triple.f38021a;
            Integer num2 = (Integer) triple.f38022b;
            Integer num3 = (Integer) triple.f38023c;
            if (num != null) {
                num.intValue();
                if (num3 != null) {
                    num3.intValue();
                    InterfaceC6727j<Object>[] interfaceC6727jArr = RepairStreakFragment.f24937S0;
                    StreakActivityLevelView streakActivityLevelView = this.f24954f.m9951u0().f44846h;
                    C5207g.m11110e(streakActivityLevelView, "binding.viewStreakActivityLevel");
                    int iIntValue = num.intValue();
                    int iIntValue2 = num2 != null ? num2.intValue() : 0;
                    int iIntValue3 = num3.intValue();
                    int i10 = StreakActivityLevelView.f16812e;
                    streakActivityLevelView.m9375a(iIntValue, iIntValue2, iIntValue3, true);
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepairStreakFragment$onViewCreated$2$2(RepairStreakFragment repairStreakFragment, InterfaceC9968c<? super RepairStreakFragment$onViewCreated$2$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f24952f = repairStreakFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new RepairStreakFragment$onViewCreated$2$2(this.f24952f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((RepairStreakFragment$onViewCreated$2$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24951e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = RepairStreakFragment.f24937S0;
            RepairStreakFragment repairStreakFragment = this.f24952f;
            RepairStreakViewModel repairStreakViewModelM9952v0 = repairStreakFragment.m9952v0();
            C38001 c38001 = new C38001(repairStreakFragment, null);
            this.f24951e = 1;
            if (C0062b.m369m0(repairStreakViewModelM9952v0.f24980K, c38001, this) == coroutineSingletons) {
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
