package com.lingq.p055ui.lesson.vocabulary;

import ae.C0062b;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import ci.InterfaceC2008a;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.token.InterfaceC4865b;
import com.lingq.p055ui.token.TokenData;
import com.lingq.p055ui.token.TokenEditData;
import com.lingq.shared.repository.InterfaceC3324a;
import com.lingq.shared.uimodel.token.TokenMeaning;
import com.lingq.shared.uimodel.token.TokenRelatedPhrase;
import com.lingq.util.C4924a;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7133n;
import kotlinx.coroutines.flow.InterfaceC7137r;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import li.C7374a;
import ni.C7794b;
import no.C7828f;
import no.InterfaceC7882z;
import p225kk.C6715l;
import p244lh.InterfaceC7367d;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/lesson/vocabulary/LessonVocabularyViewModel;", "Landroidx/lifecycle/h0;", "Lcom/lingq/ui/token/b;", "Llh/d;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LessonVocabularyViewModel extends AbstractC1036h0 implements InterfaceC4865b, InterfaceC7367d {

    /* JADX INFO: renamed from: d */
    public final InterfaceC3324a f29341d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2008a f29342e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC4865b f29343f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC7367d f29344g;

    /* JADX INFO: renamed from: h */
    public final int f29345h;

    /* JADX INFO: renamed from: i */
    public final C7138s f29346i;

    /* JADX INFO: renamed from: j */
    public final C7134o f29347j;

    /* JADX INFO: renamed from: k */
    public final StateFlowImpl f29348k;

    /* JADX INFO: renamed from: l */
    public final C7135p f29349l;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.vocabulary.LessonVocabularyViewModel$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.vocabulary.LessonVocabularyViewModel$1", m19206f = "LessonVocabularyViewModel.kt", m19207l = {44}, m19208m = "invokeSuspend")
    final class C44941 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f29350e;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.vocabulary.LessonVocabularyViewModel$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lli/a;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.vocabulary.LessonVocabularyViewModel$1$1", m19206f = "LessonVocabularyViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<List<? extends C7374a>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f29352e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ LessonVocabularyViewModel f29353f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LessonVocabularyViewModel lessonVocabularyViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f29353f = lessonVocabularyViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f29353f, interfaceC9968c);
                anonymousClass1.f29352e = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<? extends C7374a> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                this.f29353f.f29348k.setValue((List) this.f29352e);
                return C9072e.f47360a;
            }
        }

        public C44941(InterfaceC9968c<? super C44941> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return LessonVocabularyViewModel.this.new C44941(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C44941) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f29350e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                LessonVocabularyViewModel lessonVocabularyViewModel = LessonVocabularyViewModel.this;
                InterfaceC7116c<List<C7374a>> interfaceC7116cMo5962n = lessonVocabularyViewModel.f29342e.mo5962n(lessonVocabularyViewModel.f29345h);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(lessonVocabularyViewModel, null);
                this.f29350e = 1;
                if (C0062b.m369m0(interfaceC7116cMo5962n, anonymousClass1, this) == coroutineSingletons) {
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

    public LessonVocabularyViewModel(InterfaceC3324a interfaceC3324a, InterfaceC2008a interfaceC2008a, CoroutineDispatcher coroutineDispatcher, ExecutorC7177a executorC7177a, InterfaceC4865b interfaceC4865b, InterfaceC7367d interfaceC7367d, C1024c0 c1024c0) {
        C5207g.m11111f(interfaceC3324a, "lessonRepository");
        C5207g.m11111f(interfaceC2008a, "cardRepository");
        C5207g.m11111f(interfaceC4865b, "tokenControllerDelegate");
        C5207g.m11111f(interfaceC7367d, "milestonesControllerDelegate");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f29341d = interfaceC3324a;
        this.f29342e = interfaceC2008a;
        this.f29343f = interfaceC4865b;
        this.f29344g = interfaceC7367d;
        Integer num = (Integer) c1024c0.m3929b("lessonId");
        this.f29345h = num != null ? num.intValue() : 0;
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f29346i = c7138sM10448a;
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        this.f29347j = C0062b.m341d2(c7138sM10448a, interfaceC7882zM16767w0, startedWhileSubscribed);
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(null);
        this.f29348k = stateFlowImplM14379a;
        this.f29349l = C0062b.m353h2(stateFlowImplM14379a, C8573r0.m16767w0(this), startedWhileSubscribed, null);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C44941(null), 3);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: A1 */
    public final void mo10025A1() {
        this.f29343f.mo10025A1();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: D */
    public final InterfaceC7137r<TokenEditData> mo10026D() {
        return this.f29343f.mo10026D();
    }

    @Override // p244lh.InterfaceC7367d
    /* JADX INFO: renamed from: D1 */
    public final void mo9321D1(List<C7794b> list) {
        this.f29344g.mo9321D1(list);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: H0 */
    public final InterfaceC7137r<String> mo10027H0() {
        return this.f29343f.mo10027H0();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: I0 */
    public final void mo10028I0(TokenRelatedPhrase tokenRelatedPhrase, int i10, int i11, int i12) {
        this.f29343f.mo10028I0(tokenRelatedPhrase, i10, i11, i12);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: L0 */
    public final InterfaceC7137r<String> mo10029L0() {
        return this.f29343f.mo10029L0();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: N0 */
    public final void mo10030N0(String str) {
        this.f29343f.mo10030N0(str);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: N1 */
    public final InterfaceC7137r<TokenData> mo10031N1() {
        return this.f29343f.mo10031N1();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: P1 */
    public final void mo10032P1(int i10) {
        this.f29343f.mo10032P1(i10);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: Q1 */
    public final void mo10033Q1(boolean z10, boolean z11) {
        this.f29343f.mo10033Q1(z10, z11);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: S */
    public final InterfaceC7137r<Integer> mo10034S() {
        return this.f29343f.mo10034S();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: U1 */
    public final InterfaceC7137r<TokenData> mo10035U1() {
        return this.f29343f.mo10035U1();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: V */
    public final InterfaceC7137r<TokenRelatedPhrase> mo10036V() {
        return this.f29343f.mo10036V();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: V0 */
    public final void mo10037V0(TokenMeaning tokenMeaning) {
        this.f29343f.mo10037V0(tokenMeaning);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: W1 */
    public final InterfaceC7137r<C9072e> mo10038W1() {
        return this.f29343f.mo10038W1();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: Y */
    public final InterfaceC7137r<TokenData> mo10039Y() {
        return this.f29343f.mo10039Y();
    }

    @Override // p244lh.InterfaceC7367d
    /* JADX INFO: renamed from: a */
    public final InterfaceC7133n<Boolean> mo9322a() {
        return this.f29344g.mo9322a();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: b */
    public final void mo10041b() {
        this.f29343f.mo10041b();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: b2 */
    public final InterfaceC7137r<C9072e> mo10042b2() {
        return this.f29343f.mo10042b2();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: c1 */
    public final InterfaceC7137r<Boolean> mo10043c1() {
        return this.f29343f.mo10043c1();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: d2 */
    public final InterfaceC7137r<C9072e> mo10044d2() {
        return this.f29343f.mo10044d2();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: e0 */
    public final void mo10045e0() {
        this.f29343f.mo10045e0();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: f2 */
    public final void mo10048f2(TokenData tokenData) {
        this.f29343f.mo10048f2(tokenData);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: g */
    public final void mo10049g() {
        this.f29343f.mo10049g();
    }

    @Override // p244lh.InterfaceC7367d
    /* JADX INFO: renamed from: h2 */
    public final void mo9324h2(C7794b c7794b) {
        this.f29344g.mo9324h2(c7794b);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: j */
    public final InterfaceC7137r<C9072e> mo10051j() {
        return this.f29343f.mo10051j();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: l */
    public final InterfaceC7137r<C9072e> mo10053l() {
        return this.f29343f.mo10053l();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: m */
    public final InterfaceC7137r<TokenMeaning> mo10054m() {
        return this.f29343f.mo10054m();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: o0 */
    public final void mo10057o0(TokenMeaning tokenMeaning, String str) {
        this.f29343f.mo10057o0(tokenMeaning, str);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: q1 */
    public final InterfaceC7137r<Pair<TokenMeaning, String>> mo10060q1() {
        return this.f29343f.mo10060q1();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: r */
    public final void mo10062r(String str) {
        this.f29343f.mo10062r(str);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: t0 */
    public final void mo10064t0(TokenData tokenData) {
        C5207g.m11111f(tokenData, "updateTokenData");
        this.f29343f.mo10064t0(tokenData);
    }

    @Override // p244lh.InterfaceC7367d
    /* JADX INFO: renamed from: w1 */
    public final InterfaceC7116c<C7794b> mo9325w1() {
        return this.f29344g.mo9325w1();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: z */
    public final void mo10065z() {
        this.f29343f.mo10065z();
    }
}
