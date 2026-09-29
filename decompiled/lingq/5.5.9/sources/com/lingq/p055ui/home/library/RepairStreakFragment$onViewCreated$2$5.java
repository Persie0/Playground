package com.lingq.p055ui.home.library;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.lingq.util.C4924a;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.library.RepairStreakFragment$onViewCreated$2$5", m19206f = "RepairStreakFragment.kt", m19207l = {94}, m19208m = "invokeSuspend")
public final class RepairStreakFragment$onViewCreated$2$5 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24962e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ RepairStreakFragment f24963f;

    /* JADX INFO: renamed from: com.lingq.ui.home.library.RepairStreakFragment$onViewCreated$2$5$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "isLoading", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.RepairStreakFragment$onViewCreated$2$5$1", m19206f = "RepairStreakFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C38031 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ boolean f24964e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ RepairStreakFragment f24965f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38031(RepairStreakFragment repairStreakFragment, InterfaceC9968c<? super C38031> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24965f = repairStreakFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C38031 c38031 = new C38031(this.f24965f, interfaceC9968c);
            c38031.f24964e = ((Boolean) obj).booleanValue();
            return c38031;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C38031) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            boolean z10 = this.f24964e;
            RepairStreakFragment repairStreakFragment = this.f24965f;
            if (z10) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = RepairStreakFragment.f24937S0;
                repairStreakFragment.m9951u0().f44845g.m4935d();
                MaterialButton materialButton = repairStreakFragment.m9951u0().f44840b;
                C5207g.m11110e(materialButton, "binding.btnRepair");
                C4924a.m10442U(materialButton);
                MaterialButton materialButton2 = repairStreakFragment.m9951u0().f44839a;
                C5207g.m11110e(materialButton2, "binding.btnNotNow");
                C4924a.m10442U(materialButton2);
            } else {
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = RepairStreakFragment.f24937S0;
                CircularProgressIndicator circularProgressIndicator = repairStreakFragment.m9951u0().f44845g;
                C5207g.m11110e(circularProgressIndicator, "binding.viewProgress");
                C4924a.m10442U(circularProgressIndicator);
                MaterialButton materialButton3 = repairStreakFragment.m9951u0().f44840b;
                C5207g.m11110e(materialButton3, "binding.btnRepair");
                C4924a.m10457e0(materialButton3);
                MaterialButton materialButton4 = repairStreakFragment.m9951u0().f44839a;
                C5207g.m11110e(materialButton4, "binding.btnNotNow");
                C4924a.m10457e0(materialButton4);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepairStreakFragment$onViewCreated$2$5(RepairStreakFragment repairStreakFragment, InterfaceC9968c<? super RepairStreakFragment$onViewCreated$2$5> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f24963f = repairStreakFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new RepairStreakFragment$onViewCreated$2$5(this.f24963f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((RepairStreakFragment$onViewCreated$2$5) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24962e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = RepairStreakFragment.f24937S0;
            RepairStreakFragment repairStreakFragment = this.f24963f;
            RepairStreakViewModel repairStreakViewModelM9952v0 = repairStreakFragment.m9952v0();
            C38031 c38031 = new C38031(repairStreakFragment, null);
            this.f24962e = 1;
            if (C0062b.m369m0(repairStreakViewModelM9952v0.f24977H, c38031, this) == coroutineSingletons) {
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
