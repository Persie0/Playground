package com.lingq.p055ui.home.language.stats;

import ae.C0062b;
import android.widget.TextView;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import dm.C5207g;
import java.util.Arrays;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p301oh.C8048g;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.StatsShareFragment$onViewCreated$3$1", m19206f = "StatsShareFragment.kt", m19207l = {113}, m19208m = "invokeSuspend")
public final class StatsShareFragment$onViewCreated$3$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24405e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ StatsShareFragment f24406f;

    /* JADX INFO: renamed from: com.lingq.ui.home.language.stats.StatsShareFragment$onViewCreated$3$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Pair;", "", "", "Loh/g;", "streak", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.StatsShareFragment$onViewCreated$3$1$1", m19206f = "StatsShareFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C37311 extends SuspendLambda implements InterfaceC2056p<Pair<? extends Integer, ? extends List<? extends C8048g>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f24407e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ StatsShareFragment f24408f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37311(StatsShareFragment statsShareFragment, InterfaceC9968c<? super C37311> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24408f = statsShareFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C37311 c37311 = new C37311(this.f24408f, interfaceC9968c);
            c37311.f24407e = obj;
            return c37311;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Pair<? extends Integer, ? extends List<? extends C8048g>> pair, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37311) mo1336a(pair, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Pair pair = (Pair) this.f24407e;
            if (pair != null) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = StatsShareFragment.f24390T0;
                StatsShareFragment statsShareFragment = this.f24408f;
                statsShareFragment.m9921u0().f45312f.setActiveStates((List) pair.f38013b);
                statsShareFragment.m9921u0().f45312f.m9382g();
                TextView textView = statsShareFragment.m9921u0().f45314h;
                String strM3600t = statsShareFragment.m3600t(R.string.stats_n_day_streak);
                C5207g.m11110e(strM3600t, "getString(R.string.stats_n_day_streak)");
                String str = String.format(strM3600t, Arrays.copyOf(new Object[]{pair.f38012a}, 1));
                C5207g.m11110e(str, "format(format, *args)");
                textView.setText(str);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsShareFragment$onViewCreated$3$1(StatsShareFragment statsShareFragment, InterfaceC9968c<? super StatsShareFragment$onViewCreated$3$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f24406f = statsShareFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new StatsShareFragment$onViewCreated$3$1(this.f24406f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((StatsShareFragment$onViewCreated$3$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24405e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = StatsShareFragment.f24390T0;
            StatsShareFragment statsShareFragment = this.f24406f;
            StatsShareViewModel statsShareViewModelM9922v0 = statsShareFragment.m9922v0();
            C37311 c37311 = new C37311(statsShareFragment, null);
            this.f24405e = 1;
            if (C0062b.m369m0(statsShareViewModelM9922v0.f24435J, c37311, this) == coroutineSingletons) {
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
