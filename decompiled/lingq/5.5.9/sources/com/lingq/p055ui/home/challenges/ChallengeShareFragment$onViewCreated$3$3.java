package com.lingq.p055ui.home.challenges;

import ae.C0062b;
import android.os.Bundle;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.goals.InstagramShareFragment;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeShareFragment$onViewCreated$3$3", m19206f = "ChallengeShareFragment.kt", m19207l = {99}, m19208m = "invokeSuspend")
public final class ChallengeShareFragment$onViewCreated$3$3 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23006e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ChallengeShareFragment f23007f;

    /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeShareFragment$onViewCreated$3$3$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Pair;", "", "<name for destructuring parameter 0>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeShareFragment$onViewCreated$3$3$1", m19206f = "ChallengeShareFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C35081 extends SuspendLambda implements InterfaceC2056p<Pair<? extends String, ? extends String>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f23008e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ChallengeShareFragment f23009f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35081(ChallengeShareFragment challengeShareFragment, InterfaceC9968c<? super C35081> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f23009f = challengeShareFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C35081 c35081 = new C35081(this.f23009f, interfaceC9968c);
            c35081.f23008e = obj;
            return c35081;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Pair<? extends String, ? extends String> pair, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C35081) mo1336a(pair, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Pair pair = (Pair) this.f23008e;
            String str = (String) pair.f38012a;
            String str2 = (String) pair.f38013b;
            InstagramShareFragment instagramShareFragment = new InstagramShareFragment();
            Bundle bundle = new Bundle();
            bundle.putString("imageUrl", str);
            bundle.putString("title", str2);
            instagramShareFragment.m3583e0(bundle);
            instagramShareFragment.mo3772s0(this.f23009f.m3594l(), "instagramShareFragment");
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeShareFragment$onViewCreated$3$3(ChallengeShareFragment challengeShareFragment, InterfaceC9968c<? super ChallengeShareFragment$onViewCreated$3$3> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f23007f = challengeShareFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ChallengeShareFragment$onViewCreated$3$3(this.f23007f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ChallengeShareFragment$onViewCreated$3$3) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23006e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = ChallengeShareFragment.f22987T0;
            ChallengeShareFragment challengeShareFragment = this.f23007f;
            ChallengeShareViewModel challengeShareViewModelM9790u0 = challengeShareFragment.m9790u0();
            C35081 c35081 = new C35081(challengeShareFragment, null);
            this.f23006e = 1;
            if (C0062b.m369m0(challengeShareViewModelM9790u0.f23037l, c35081, this) == coroutineSingletons) {
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
