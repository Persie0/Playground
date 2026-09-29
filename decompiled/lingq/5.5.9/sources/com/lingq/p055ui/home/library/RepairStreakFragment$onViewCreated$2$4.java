package com.lingq.p055ui.home.library;

import ae.C0062b;
import android.widget.RelativeLayout;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.library.RepairStreakFragment$onViewCreated$2$4", m19206f = "RepairStreakFragment.kt", m19207l = {87}, m19208m = "invokeSuspend")
public final class RepairStreakFragment$onViewCreated$2$4 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24958e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ RepairStreakFragment f24959f;

    /* JADX INFO: renamed from: com.lingq.ui.home.library.RepairStreakFragment$onViewCreated$2$4$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "error", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.RepairStreakFragment$onViewCreated$2$4$1", m19206f = "RepairStreakFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C38021 extends SuspendLambda implements InterfaceC2056p<String, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f24960e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ RepairStreakFragment f24961f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38021(RepairStreakFragment repairStreakFragment, InterfaceC9968c<? super C38021> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24961f = repairStreakFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C38021 c38021 = new C38021(this.f24961f, interfaceC9968c);
            c38021.f24960e = obj;
            return c38021;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C38021) mo1336a(str, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            String str = (String) this.f24960e;
            InterfaceC6727j<Object>[] interfaceC6727jArr = RepairStreakFragment.f24937S0;
            RepairStreakFragment repairStreakFragment = this.f24961f;
            RelativeLayout relativeLayout = repairStreakFragment.m9951u0().f44844f;
            C5207g.m11110e(relativeLayout, "binding.viewError");
            C4924a.m10457e0(relativeLayout);
            repairStreakFragment.m9951u0().f44841c.setText(str);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepairStreakFragment$onViewCreated$2$4(RepairStreakFragment repairStreakFragment, InterfaceC9968c<? super RepairStreakFragment$onViewCreated$2$4> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f24959f = repairStreakFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new RepairStreakFragment$onViewCreated$2$4(this.f24959f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((RepairStreakFragment$onViewCreated$2$4) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24958e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = RepairStreakFragment.f24937S0;
            RepairStreakFragment repairStreakFragment = this.f24959f;
            RepairStreakViewModel repairStreakViewModelM9952v0 = repairStreakFragment.m9952v0();
            C38021 c38021 = new C38021(repairStreakFragment, null);
            this.f24958e = 1;
            if (C0062b.m369m0(repairStreakViewModelM9952v0.f24990k, c38021, this) == coroutineSingletons) {
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
