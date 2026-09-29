package com.lingq.p055ui.home.challenges;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengesFragment$onViewCreated$5$1", m19206f = "ChallengesFragment.kt", m19207l = {158}, m19208m = "invokeSuspend")
public final class ChallengesFragment$onViewCreated$5$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23066e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ChallengesFragment f23067f;

    /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengesFragment$onViewCreated$5$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u001e\u0010\u0003\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Pair;", "", "Lcom/lingq/ui/home/challenges/ChallengesAdapter$b;", "allChallenges", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengesFragment$onViewCreated$5$1$1", m19206f = "ChallengesFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C35201 extends SuspendLambda implements InterfaceC2056p<Pair<? extends List<? extends ChallengesAdapter.AbstractC3515b>, ? extends List<? extends ChallengesAdapter.AbstractC3515b>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f23068e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ChallengesFragment f23069f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35201(ChallengesFragment challengesFragment, InterfaceC9968c<? super C35201> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f23069f = challengesFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C35201 c35201 = new C35201(this.f23069f, interfaceC9968c);
            c35201.f23068e = obj;
            return c35201;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Pair<? extends List<? extends ChallengesAdapter.AbstractC3515b>, ? extends List<? extends ChallengesAdapter.AbstractC3515b>> pair, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C35201) mo1336a(pair, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Pair pair = (Pair) this.f23068e;
            List list = (List) pair.f38012a;
            List list2 = (List) pair.f38013b;
            ChallengesFragment challengesFragment = this.f23069f;
            ChallengesAdapter challengesAdapter = challengesFragment.f23051C0;
            if (challengesAdapter == null) {
                C5207g.m11117l("challengesAdapter");
                throw null;
            }
            challengesAdapter.m4529q(list);
            ChallengesAdapter challengesAdapter2 = challengesFragment.f23052D0;
            if (challengesAdapter2 != null) {
                challengesAdapter2.m4529q(list2);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengesFragment$onViewCreated$5$1(ChallengesFragment challengesFragment, InterfaceC9968c<? super ChallengesFragment$onViewCreated$5$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f23067f = challengesFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ChallengesFragment$onViewCreated$5$1(this.f23067f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ChallengesFragment$onViewCreated$5$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23066e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = ChallengesFragment.f23048E0;
            ChallengesFragment challengesFragment = this.f23067f;
            ChallengesViewModel challengesViewModelM9794q0 = challengesFragment.m9794q0();
            C35201 c35201 = new C35201(challengesFragment, null);
            this.f23066e = 1;
            if (C0062b.m369m0(challengesViewModelM9794q0.f23096L, c35201, this) == coroutineSingletons) {
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
