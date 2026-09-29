package com.lingq.p055ui.home.challenges;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.shimmer.ShimmerFrameLayout;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengesFragment$onViewCreated$5$2", m19206f = "ChallengesFragment.kt", m19207l = {166}, m19208m = "invokeSuspend")
public final class ChallengesFragment$onViewCreated$5$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23070e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ChallengesFragment f23071f;

    /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengesFragment$onViewCreated$5$2$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "isLoading", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengesFragment$onViewCreated$5$2$1", m19206f = "ChallengesFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C35211 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ boolean f23072e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ChallengesFragment f23073f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35211(ChallengesFragment challengesFragment, InterfaceC9968c<? super C35211> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f23073f = challengesFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C35211 c35211 = new C35211(this.f23073f, interfaceC9968c);
            c35211.f23072e = ((Boolean) obj).booleanValue();
            return c35211;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C35211) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            boolean z10 = this.f23072e;
            InterfaceC6727j<Object>[] interfaceC6727jArr = ChallengesFragment.f23048E0;
            ChallengesFragment challengesFragment = this.f23073f;
            ShimmerFrameLayout shimmerFrameLayout = challengesFragment.m9793p0().f44686e;
            C5207g.m11110e(shimmerFrameLayout, "binding.shimmerLayout");
            int i10 = 0;
            shimmerFrameLayout.setVisibility(z10 ? 0 : 4);
            ShimmerFrameLayout shimmerFrameLayout2 = challengesFragment.m9793p0().f44682a;
            if (shimmerFrameLayout2 != null) {
                if (!z10) {
                    i10 = 4;
                }
                shimmerFrameLayout2.setVisibility(i10);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengesFragment$onViewCreated$5$2(ChallengesFragment challengesFragment, InterfaceC9968c<? super ChallengesFragment$onViewCreated$5$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f23071f = challengesFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ChallengesFragment$onViewCreated$5$2(this.f23071f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ChallengesFragment$onViewCreated$5$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23070e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = ChallengesFragment.f23048E0;
            ChallengesFragment challengesFragment = this.f23071f;
            ChallengesViewModel challengesViewModelM9794q0 = challengesFragment.m9794q0();
            C35211 c35211 = new C35211(challengesFragment, null);
            this.f23070e = 1;
            if (C0062b.m369m0(challengesViewModelM9794q0.f23103j, c35211, this) == coroutineSingletons) {
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
