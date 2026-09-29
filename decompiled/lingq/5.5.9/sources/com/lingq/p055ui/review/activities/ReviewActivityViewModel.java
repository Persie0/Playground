package com.lingq.p055ui.review.activities;

import ae.C0062b;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import ci.InterfaceC2008a;
import ci.InterfaceC2024q;
import ci.InterfaceC2025r;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.controllers.InterfaceC3275c;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.uimodel.LocalTextToSpeechVoice;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.util.C4924a;
import com.lingq.util.CoroutineJobManager;
import dm.C5207g;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import no.C7828f;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p225kk.C6715l;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/review/activities/ReviewActivityViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "Lcom/lingq/commons/controllers/c;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ReviewActivityViewModel extends AbstractC1036h0 implements InterfaceC0113j, InterfaceC3275c {

    /* JADX INFO: renamed from: H */
    public final StateFlowImpl f30150H;

    /* JADX INFO: renamed from: I */
    public final C7135p f30151I;

    /* JADX INFO: renamed from: J */
    public final StateFlowImpl f30152J;

    /* JADX INFO: renamed from: K */
    public final C7135p f30153K;

    /* JADX INFO: renamed from: L */
    public final C7138s f30154L;

    /* JADX INFO: renamed from: M */
    public final C7134o f30155M;

    /* JADX INFO: renamed from: N */
    public final StateFlowImpl f30156N;

    /* JADX INFO: renamed from: O */
    public final C7135p f30157O;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2008a f30158d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2025r f30159e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2024q f30160f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC3275c f30161g;

    /* JADX INFO: renamed from: h */
    public final CoroutineDispatcher f30162h;

    /* JADX INFO: renamed from: i */
    public final CoroutineJobManager f30163i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC0113j f30164j;

    /* JADX INFO: renamed from: k */
    public final int f30165k;

    /* JADX INFO: renamed from: l */
    public final String f30166l;

    /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivityViewModel$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivityViewModel$1", m19206f = "ReviewActivityViewModel.kt", m19207l = {67, 68}, m19208m = "invokeSuspend")
    final class C46591 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f30167e;

        /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivityViewModel$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivityViewModel$1$1", m19206f = "ReviewActivityViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Integer, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ int f30169e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ ReviewActivityViewModel f30170f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ReviewActivityViewModel reviewActivityViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f30170f = reviewActivityViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f30170f, interfaceC9968c);
                anonymousClass1.f30169e = ((Number) obj).intValue();
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Integer num, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(Integer.valueOf(num.intValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                this.f30170f.f30156N.setValue(Boolean.valueOf(this.f30169e > 0));
                return C9072e.f47360a;
            }
        }

        public C46591(InterfaceC9968c<? super C46591> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return ReviewActivityViewModel.this.new C46591(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C46591) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f30167e;
            ReviewActivityViewModel reviewActivityViewModel = ReviewActivityViewModel.this;
            if (i10 != 0) {
                if (i10 == 1) {
                    C7499b.m14977z0(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj);
                }
                return C9072e.f47360a;
            }
            C7499b.m14977z0(obj);
            InterfaceC2024q interfaceC2024q = reviewActivityViewModel.f30160f;
            String strMo498E1 = reviewActivityViewModel.mo498E1();
            this.f30167e = 1;
            obj = interfaceC2024q.mo6170a(strMo498E1);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(reviewActivityViewModel, null);
            this.f30167e = 2;
            if (C0062b.m369m0((InterfaceC7116c) obj, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return C9072e.f47360a;
        }
    }

    public ReviewActivityViewModel(InterfaceC2008a interfaceC2008a, InterfaceC2025r interfaceC2025r, InterfaceC2024q interfaceC2024q, InterfaceC3275c interfaceC3275c, CoroutineDispatcher coroutineDispatcher, ExecutorC7177a executorC7177a, CoroutineJobManager coroutineJobManager, InterfaceC0113j interfaceC0113j, C1024c0 c1024c0) {
        C5207g.m11111f(interfaceC2008a, "cardRepository");
        C5207g.m11111f(interfaceC2025r, "vocabularyRepository");
        C5207g.m11111f(interfaceC2024q, "ttsRepository");
        C5207g.m11111f(interfaceC3275c, "ttsController");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f30158d = interfaceC2008a;
        this.f30159e = interfaceC2025r;
        this.f30160f = interfaceC2024q;
        this.f30161g = interfaceC3275c;
        this.f30162h = executorC7177a;
        this.f30163i = coroutineJobManager;
        this.f30164j = interfaceC0113j;
        Integer num = (Integer) c1024c0.m3929b("lessonId");
        this.f30165k = num != null ? num.intValue() : -1;
        String str = (String) c1024c0.m3929b("currentCard");
        str = str == null ? "" : str;
        this.f30166l = str;
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(null);
        this.f30150H = stateFlowImplM14379a;
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        this.f30151I = C0062b.m353h2(stateFlowImplM14379a, interfaceC7882zM16767w0, startedWhileSubscribed, null);
        Resource.f17861d.getClass();
        Resource.Status status = Resource.Status.EMPTY;
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a(new Resource(status, null, null));
        this.f30152J = stateFlowImplM14379a2;
        this.f30153K = C0062b.m353h2(stateFlowImplM14379a2, C8573r0.m16767w0(this), startedWhileSubscribed, new Resource(status, null, null));
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f30154L = c7138sM10448a;
        this.f30155M = C0062b.m341d2(c7138sM10448a, C8573r0.m16767w0(this), startedWhileSubscribed);
        StateFlowImpl stateFlowImplM14379a3 = C7120g.m14379a(null);
        this.f30156N = stateFlowImplM14379a3;
        this.f30157O = C0062b.m353h2(stateFlowImplM14379a3, C8573r0.m16767w0(this), startedWhileSubscribed, null);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C46591(null), 3);
        if (str.length() > 0) {
            C7828f.m15570d(C8573r0.m16767w0(this), null, null, new ReviewActivityViewModel$fetchCard$1(this, null), 3);
        } else {
            c7138sM10448a.mo14371k(C9072e.f47360a);
        }
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f30164j.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f30164j.mo497B0(interfaceC9968c);
    }

    @Override // com.lingq.commons.controllers.InterfaceC3275c
    /* JADX INFO: renamed from: E0 */
    public final void mo9335E0(String str, Set<String> set) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(set, "text");
        this.f30161g.mo9335E0(str, set);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f30164j.mo498E1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f30164j.mo499J(profile, interfaceC9968c);
    }

    @Override // com.lingq.commons.controllers.InterfaceC3275c
    /* JADX INFO: renamed from: K */
    public final void mo9336K() {
        this.f30161g.mo9336K();
    }

    @Override // com.lingq.commons.controllers.InterfaceC3275c
    /* JADX INFO: renamed from: M1 */
    public final void mo9337M1(int i10, double d10, Double d11, float f3) {
        this.f30161g.mo9337M1(i10, d10, d11, f3);
    }

    @Override // com.lingq.commons.controllers.InterfaceC3275c
    /* JADX INFO: renamed from: O1 */
    public final void mo9338O1(String str) {
        C5207g.m11111f(str, "language");
        this.f30161g.mo9338O1(str);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f30164j.mo500P();
    }

    @Override // com.lingq.commons.controllers.InterfaceC3275c
    /* JADX INFO: renamed from: c */
    public final InterfaceC7116c<Long> mo9339c() {
        return this.f30161g.mo9339c();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f30164j.mo501d(str, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f30164j;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f30164j.mo503f1(interfaceC9968c);
    }

    @Override // com.lingq.commons.controllers.InterfaceC3275c
    /* JADX INFO: renamed from: h0 */
    public final Object mo9342h0(String str, InterfaceC9968c<? super List<LocalTextToSpeechVoice>> interfaceC9968c) {
        return this.f30161g.mo9342h0(str, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f30164j.mo504j1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f30164j.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f30164j.mo506l1();
    }

    @Override // com.lingq.commons.controllers.InterfaceC3275c
    /* JADX INFO: renamed from: o */
    public final void mo9343o(String str, String str2, boolean z10, float f3) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "text");
        this.f30161g.mo9343o(str, str2, z10, f3);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f30164j.mo507p1();
    }

    @Override // com.lingq.commons.controllers.InterfaceC3275c
    /* JADX INFO: renamed from: t */
    public final InterfaceC7116c<Boolean> mo9344t() {
        return this.f30161g.mo9344t();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f30164j.mo508t1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f30164j.mo509w0();
    }
}
