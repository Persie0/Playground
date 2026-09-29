package com.lingq.p055ui.home.language.stats;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p225kk.C6716m;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.StatsShareFragment$onViewCreated$3$2", m19206f = "StatsShareFragment.kt", m19207l = {124}, m19208m = "invokeSuspend")
public final class StatsShareFragment$onViewCreated$3$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24409e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ StatsShareFragment f24410f;

    /* JADX INFO: renamed from: com.lingq.ui.home.language.stats.StatsShareFragment$onViewCreated$3$2$1 */
    @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Pair;", "", "", "<name for destructuring parameter 0>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.StatsShareFragment$onViewCreated$3$2$1", m19206f = "StatsShareFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C37321 extends SuspendLambda implements InterfaceC2056p<Pair<? extends Integer, ? extends String>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f24411e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ StatsShareFragment f24412f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37321(StatsShareFragment statsShareFragment, InterfaceC9968c<? super C37321> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24412f = statsShareFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C37321 c37321 = new C37321(this.f24412f, interfaceC9968c);
            c37321.f24411e = obj;
            return c37321;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Pair<? extends Integer, ? extends String> pair, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37321) mo1336a(pair, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Pair pair = (Pair) this.f24411e;
            int iIntValue = ((Number) pair.f38012a).intValue();
            String str = (String) pair.f38013b;
            List<Integer> list = C6716m.f37937a;
            InterfaceC6727j<Object>[] interfaceC6727jArr = StatsShareFragment.f24390T0;
            StatsShareFragment statsShareFragment = this.f24412f;
            C6716m.m13326k(statsShareFragment.m9921u0().f45308b, str, 2.0f);
            statsShareFragment.m9921u0().f45313g.setText(String.valueOf(iIntValue));
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsShareFragment$onViewCreated$3$2(StatsShareFragment statsShareFragment, InterfaceC9968c<? super StatsShareFragment$onViewCreated$3$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f24410f = statsShareFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new StatsShareFragment$onViewCreated$3$2(this.f24410f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((StatsShareFragment$onViewCreated$3$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24409e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = StatsShareFragment.f24390T0;
            StatsShareFragment statsShareFragment = this.f24410f;
            StatsShareViewModel statsShareViewModelM9922v0 = statsShareFragment.m9922v0();
            C37321 c37321 = new C37321(statsShareFragment, null);
            this.f24409e = 1;
            if (C0062b.m369m0(statsShareViewModelM9922v0.f24447l, c37321, this) == coroutineSingletons) {
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
