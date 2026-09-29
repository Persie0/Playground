package com.lingq.p055ui.home.language.stats;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.lingq.util.C4924a;
import dk.C5196a;
import dk.C5197b;
import dm.C5207g;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.StatsShareFragment$onViewCreated$3$3", m19206f = "StatsShareFragment.kt", m19207l = {131}, m19208m = "invokeSuspend")
public final class StatsShareFragment$onViewCreated$3$3 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24413e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ StatsShareFragment f24414f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C5197b f24415g;

    /* JADX INFO: renamed from: com.lingq.ui.home.language.stats.StatsShareFragment$onViewCreated$3$3$1 */
    @Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Pair;", "", "Ldk/a;", "", "<name for destructuring parameter 0>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.StatsShareFragment$onViewCreated$3$3$1", m19206f = "StatsShareFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C37331 extends SuspendLambda implements InterfaceC2056p<Pair<? extends List<? extends C5196a>, ? extends Boolean>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f24416e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ StatsShareFragment f24417f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ C5197b f24418g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37331(StatsShareFragment statsShareFragment, C5197b c5197b, InterfaceC9968c<? super C37331> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24417f = statsShareFragment;
            this.f24418g = c5197b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C37331 c37331 = new C37331(this.f24417f, this.f24418g, interfaceC9968c);
            c37331.f24416e = obj;
            return c37331;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Pair<? extends List<? extends C5196a>, ? extends Boolean> pair, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37331) mo1336a(pair, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Pair pair = (Pair) this.f24416e;
            List list = (List) pair.f38012a;
            boolean zBooleanValue = ((Boolean) pair.f38013b).booleanValue();
            StatsShareFragment statsShareFragment = this.f24417f;
            if (zBooleanValue) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = StatsShareFragment.f24390T0;
                ShimmerFrameLayout shimmerFrameLayout = statsShareFragment.m9921u0().f45311e;
                C5207g.m11110e(shimmerFrameLayout, "binding.shimmerLayout");
                C4924a.m10457e0(shimmerFrameLayout);
                ShimmerFrameLayout shimmerFrameLayout2 = statsShareFragment.m9921u0().f45311e;
                if (!shimmerFrameLayout2.f11711c) {
                    shimmerFrameLayout2.f11711c = true;
                    shimmerFrameLayout2.m6747b();
                }
            } else {
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = StatsShareFragment.f24390T0;
                statsShareFragment.m9921u0().f45311e.m6748c();
                ShimmerFrameLayout shimmerFrameLayout3 = statsShareFragment.m9921u0().f45311e;
                C5207g.m11110e(shimmerFrameLayout3, "binding.shimmerLayout");
                C4924a.m10442U(shimmerFrameLayout3);
            }
            this.f24418g.m4529q(list);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsShareFragment$onViewCreated$3$3(StatsShareFragment statsShareFragment, C5197b c5197b, InterfaceC9968c<? super StatsShareFragment$onViewCreated$3$3> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f24414f = statsShareFragment;
        this.f24415g = c5197b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new StatsShareFragment$onViewCreated$3$3(this.f24414f, this.f24415g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((StatsShareFragment$onViewCreated$3$3) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24413e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = StatsShareFragment.f24390T0;
            StatsShareFragment statsShareFragment = this.f24414f;
            StatsShareViewModel statsShareViewModelM9922v0 = statsShareFragment.m9922v0();
            C37331 c37331 = new C37331(statsShareFragment, this.f24415g, null);
            this.f24413e = 1;
            if (C0062b.m369m0(statsShareViewModelM9922v0.f24437L, c37331, this) == coroutineSingletons) {
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
