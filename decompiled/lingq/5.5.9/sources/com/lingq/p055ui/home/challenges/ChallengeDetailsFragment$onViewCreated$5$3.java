package com.lingq.p055ui.home.challenges;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.util.C4924a;
import dm.C5207g;
import kh.C6676c;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeDetailsFragment$onViewCreated$5$3", m19206f = "ChallengeDetailsFragment.kt", m19207l = {133}, m19208m = "invokeSuspend")
public final class ChallengeDetailsFragment$onViewCreated$5$3 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f22880e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ChallengeDetailsFragment f22881f;

    /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailsFragment$onViewCreated$5$3$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Pair;", "", "<name for destructuring parameter 0>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeDetailsFragment$onViewCreated$5$3$1", m19206f = "ChallengeDetailsFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C34891 extends SuspendLambda implements InterfaceC2056p<Pair<? extends String, ? extends String>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f22882e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ChallengeDetailsFragment f22883f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34891(ChallengeDetailsFragment challengeDetailsFragment, InterfaceC9968c<? super C34891> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f22883f = challengeDetailsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C34891 c34891 = new C34891(this.f22883f, interfaceC9968c);
            c34891.f22882e = obj;
            return c34891;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Pair<? extends String, ? extends String> pair, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C34891) mo1336a(pair, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Pair pair = (Pair) this.f22882e;
            String str = (String) pair.f38012a;
            String str2 = (String) pair.f38013b;
            C5207g.m11111f(str, "challengeCode");
            C5207g.m11111f(str2, "title");
            C4924a.m10447Z(C8573r0.m16725g0(this.f22883f), new C6676c(str, str2));
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeDetailsFragment$onViewCreated$5$3(ChallengeDetailsFragment challengeDetailsFragment, InterfaceC9968c<? super ChallengeDetailsFragment$onViewCreated$5$3> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f22881f = challengeDetailsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ChallengeDetailsFragment$onViewCreated$5$3(this.f22881f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ChallengeDetailsFragment$onViewCreated$5$3) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f22880e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = ChallengeDetailsFragment.f22857E0;
            ChallengeDetailsFragment challengeDetailsFragment = this.f22881f;
            ChallengeDetailsViewModel challengeDetailsViewModelM9785q0 = challengeDetailsFragment.m9785q0();
            C34891 c34891 = new C34891(challengeDetailsFragment, null);
            this.f22880e = 1;
            if (C0062b.m369m0(challengeDetailsViewModelM9785q0.f22891H, c34891, this) == coroutineSingletons) {
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
