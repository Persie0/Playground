package com.lingq.p055ui.home.library;

import ae.C0062b;
import android.widget.TextView;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import dm.C5207g;
import java.util.Arrays;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.library.RepairStreakFragment$onViewCreated$2$1", m19206f = "RepairStreakFragment.kt", m19207l = {56}, m19208m = "invokeSuspend")
public final class RepairStreakFragment$onViewCreated$2$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24947e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ RepairStreakFragment f24948f;

    /* JADX INFO: renamed from: com.lingq.ui.home.library.RepairStreakFragment$onViewCreated$2$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"", "streak", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.RepairStreakFragment$onViewCreated$2$1$1", m19206f = "RepairStreakFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C37991 extends SuspendLambda implements InterfaceC2056p<Integer, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f24949e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ RepairStreakFragment f24950f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37991(RepairStreakFragment repairStreakFragment, InterfaceC9968c<? super C37991> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24950f = repairStreakFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C37991 c37991 = new C37991(this.f24950f, interfaceC9968c);
            c37991.f24949e = obj;
            return c37991;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Integer num, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37991) mo1336a(num, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Integer num = (Integer) this.f24949e;
            if (num != null) {
                num.intValue();
                InterfaceC6727j<Object>[] interfaceC6727jArr = RepairStreakFragment.f24937S0;
                RepairStreakFragment repairStreakFragment = this.f24950f;
                TextView textView = repairStreakFragment.m9951u0().f44843e;
                String strM3600t = repairStreakFragment.m3600t(R.string.streak_you_lost_your_n_day_streak);
                C5207g.m11110e(strM3600t, "getString(R.string.strea…u_lost_your_n_day_streak)");
                String str = String.format(strM3600t, Arrays.copyOf(new Object[]{num}, 1));
                C5207g.m11110e(str, "format(format, *args)");
                textView.setText(str);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepairStreakFragment$onViewCreated$2$1(RepairStreakFragment repairStreakFragment, InterfaceC9968c<? super RepairStreakFragment$onViewCreated$2$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f24948f = repairStreakFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new RepairStreakFragment$onViewCreated$2$1(this.f24948f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((RepairStreakFragment$onViewCreated$2$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24947e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = RepairStreakFragment.f24937S0;
            RepairStreakFragment repairStreakFragment = this.f24948f;
            RepairStreakViewModel repairStreakViewModelM9952v0 = repairStreakFragment.m9952v0();
            C37991 c37991 = new C37991(repairStreakFragment, null);
            this.f24947e = 1;
            if (C0062b.m369m0(repairStreakViewModelM9952v0.f24988i, c37991, this) == coroutineSingletons) {
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
