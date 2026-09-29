package mk;

import com.lingq.p055ui.StartFragment;
import com.lingq.p055ui.goals.DailyGoalCoinsTutorialFragment;
import com.lingq.p055ui.goals.DailyGoalMetFragment;
import com.lingq.p055ui.home.HomeFragment;
import com.lingq.p055ui.home.course.CourseFragment;
import com.lingq.p055ui.home.course.CoursePlaylistFragment;
import com.lingq.p055ui.home.language.stats.LanguageStatsFragment;
import com.lingq.p055ui.home.library.LibraryFragment;
import com.lingq.p055ui.home.menu.HelpFragment;
import com.lingq.p055ui.home.menu.MoreFragment;
import com.lingq.p055ui.home.playlist.PlaylistFragment;
import com.lingq.p055ui.home.vocabulary.VocabularyFragment;
import com.lingq.p055ui.lesson.LessonFragment;
import com.lingq.p055ui.lesson.menu.LessonReviewMenuFragment;
import com.lingq.p055ui.lesson.page.LessonPageFragment;
import com.lingq.p055ui.lesson.player.ListeningModeFragment;
import com.lingq.p055ui.lesson.stats.LessonCompleteFragment;
import com.lingq.p055ui.lesson.tutorial.LessonDealWithWordsFragment;
import com.lingq.p055ui.onboarding.OnboardingDailyGoalFragment;
import com.lingq.p055ui.onboarding.OnboardingFinishFragment;
import com.lingq.p055ui.onboarding.OnboardingFragment;
import com.lingq.p055ui.onboarding.OnboardingLanguageFragment;
import com.lingq.p055ui.onboarding.OnboardingLevelFragment;
import com.lingq.p055ui.onboarding.OnboardingTopicsFragment;
import com.lingq.p055ui.review.ReviewFragment;
import com.lingq.p055ui.review.ReviewSessionCompleteFragment;
import com.lingq.p055ui.review.activities.ReviewActivityFlashcardFragment;
import com.lingq.p055ui.review.activities.ReviewActivityMultiAndClozeFragment;
import com.lingq.p055ui.review.activities.ReviewActivityResultFragment;
import com.lingq.p055ui.review.settings.DatastoreReviewSettingsFragment;
import com.lingq.p055ui.session.LoginFragment;
import com.lingq.p055ui.session.RegisterFragment;
import com.lingq.p055ui.settings.DataStoreSettingsFragment;
import com.lingq.p055ui.token.TokenFragment;
import com.lingq.p055ui.token.dictionaries.DictionaryContentFragment;
import com.lingq.p055ui.upgrade.LingQsOfferFragment;
import com.lingq.p055ui.upgrade.UpgradeFragment;
import com.lingq.p055ui.upgrade.UpgradeGoPremiumFragment;
import ml.C7634a;

/* JADX INFO: renamed from: mk.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C7587f extends AbstractC7592g1 {

    /* JADX INFO: renamed from: a */
    public final C7633z0 f41855a;

    /* JADX INFO: renamed from: b */
    public final C7575b f41856b;

    public C7587f(C7633z0 c7633z0, C7575b c7575b) {
        this.f41855a = c7633z0;
        this.f41856b = c7575b;
    }

    @Override // sj.InterfaceC9054m
    /* JADX INFO: renamed from: A */
    public final void mo15088A(OnboardingFragment onboardingFragment) {
        C7633z0 c7633z0 = this.f41855a;
        onboardingFragment.f29403B0 = c7633z0.f42012s.get();
        onboardingFragment.f29404C0 = c7633z0.f41988k.get();
        c7633z0.f41951W0.get();
        onboardingFragment.f29405D0 = c7633z0.f41965c0.get();
    }

    @Override // sj.InterfaceC9057p
    /* JADX INFO: renamed from: A0 */
    public final void mo15089A0(OnboardingTopicsFragment onboardingTopicsFragment) {
        onboardingTopicsFragment.f29422C0 = this.f41855a.f42012s.get();
    }

    @Override // p343qi.InterfaceC8629a
    /* JADX INFO: renamed from: B */
    public final void mo15090B(DailyGoalCoinsTutorialFragment dailyGoalCoinsTutorialFragment) {
        C7633z0 c7633z0 = this.f41855a;
        dailyGoalCoinsTutorialFragment.f22492C0 = c7633z0.f42012s.get();
        dailyGoalCoinsTutorialFragment.f22493D0 = c7633z0.f41951W0.get();
    }

    @Override // p512yi.InterfaceC10388p
    /* JADX INFO: renamed from: B0 */
    public final void mo15091B0() {
    }

    @Override // p369rj.InterfaceC8819d
    /* JADX INFO: renamed from: C */
    public final void mo15092C() {
    }

    @Override // p368ri.InterfaceC8815g
    /* JADX INFO: renamed from: C0 */
    public final void mo15093C0() {
    }

    @Override // p512yi.InterfaceC10376d0
    /* JADX INFO: renamed from: D */
    public final void mo15094D() {
    }

    @Override // p537zi.InterfaceC10495e
    /* JADX INFO: renamed from: D0 */
    public final void mo15095D0(HelpFragment helpFragment) {
        C7633z0 c7633z0 = this.f41855a;
        helpFragment.f25035B0 = c7633z0.f42012s.get();
        helpFragment.f25036C0 = c7633z0.f41988k.get();
    }

    @Override // p224kj.InterfaceC6703e
    /* JADX INFO: renamed from: E */
    public final void mo13298E(LessonReviewMenuFragment lessonReviewMenuFragment) {
        this.f41855a.f41951W0.get();
        lessonReviewMenuFragment.getClass();
    }

    @Override // sj.InterfaceC9055n
    /* JADX INFO: renamed from: E0 */
    public final void mo15096E0(OnboardingLanguageFragment onboardingLanguageFragment) {
        onboardingLanguageFragment.f29410C0 = this.f41855a.f42012s.get();
    }

    @Override // si.InterfaceC9034r
    /* JADX INFO: renamed from: F */
    public final void mo15097F() {
    }

    @Override // p417ui.InterfaceC9535f
    /* JADX INFO: renamed from: F0 */
    public final void mo15098F0() {
    }

    @Override // fk.InterfaceC5571m
    /* JADX INFO: renamed from: G */
    public final void mo11802G() {
    }

    @Override // p205jk.InterfaceC6512h
    /* JADX INFO: renamed from: G0 */
    public final void mo13099G0(UpgradeFragment upgradeFragment) {
        C7633z0 c7633z0 = this.f41855a;
        upgradeFragment.f31985D0 = c7633z0.f42012s.get();
        upgradeFragment.f31986E0 = c7633z0.f41951W0.get();
    }

    @Override // p438vj.InterfaceC9751k
    /* JADX INFO: renamed from: H */
    public final void mo15099H(ReviewActivityResultFragment reviewActivityResultFragment) {
        C7633z0 c7633z0 = this.f41855a;
        reviewActivityResultFragment.f29930E0 = c7633z0.f41965c0.get();
        reviewActivityResultFragment.f29931F0 = c7633z0.f41984i1.get();
    }

    @Override // p015ak.InterfaceC0109f
    /* JADX INFO: renamed from: H0 */
    public final void mo493H0(LoginFragment loginFragment) {
        C7633z0 c7633z0 = this.f41855a;
        loginFragment.f30692G0 = c7633z0.f41988k.get();
        loginFragment.f30693H0 = c7633z0.f42012s.get();
        loginFragment.f30694I0 = c7633z0.f41951W0.get();
        c7633z0.f41982i.get();
    }

    @Override // p344qj.InterfaceC8640e
    /* JADX INFO: renamed from: I */
    public final void mo15100I() {
    }

    @Override // p032bk.InterfaceC1605b
    /* JADX INFO: renamed from: I0 */
    public final void mo5254I0() {
    }

    @Override // p245lj.InterfaceC7384e
    /* JADX INFO: renamed from: J */
    public final void mo14780J(LessonPageFragment lessonPageFragment) {
        C7633z0 c7633z0 = this.f41855a;
        c7633z0.f42012s.get();
        lessonPageFragment.getClass();
        lessonPageFragment.f28346J0 = c7633z0.f41951W0.get();
    }

    @Override // p048cj.InterfaceC2031e
    /* JADX INFO: renamed from: J0 */
    public final void mo6203J0() {
    }

    @Override // p512yi.InterfaceC10395w
    /* JADX INFO: renamed from: K */
    public final void mo15101K(LibraryFragment libraryFragment) {
        C7633z0 c7633z0 = this.f41855a;
        libraryFragment.f24644F0 = c7633z0.f41988k.get();
        c7633z0.f41951W0.get();
    }

    @Override // sj.InterfaceC9051j
    /* JADX INFO: renamed from: K0 */
    public final void mo15102K0(OnboardingDailyGoalFragment onboardingDailyGoalFragment) {
        onboardingDailyGoalFragment.f29361C0 = this.f41855a.f42012s.get();
    }

    @Override // p343qi.InterfaceC8635g
    /* JADX INFO: renamed from: L */
    public final void mo15103L() {
    }

    @Override // p369rj.InterfaceC8820e
    /* JADX INFO: renamed from: L0 */
    public final void mo15104L0() {
    }

    @Override // p487xi.InterfaceC10197e
    /* JADX INFO: renamed from: M */
    public final void mo15105M() {
    }

    @Override // p097ej.InterfaceC5420k
    /* JADX INFO: renamed from: M0 */
    public final void mo11580M0() {
    }

    @Override // p137gj.InterfaceC5809e
    /* JADX INFO: renamed from: N */
    public final void mo12223N() {
    }

    @Override // p324pj.InterfaceC8397c
    /* JADX INFO: renamed from: N0 */
    public final void mo15106N0(LessonCompleteFragment lessonCompleteFragment) {
        C7633z0 c7633z0 = this.f41855a;
        lessonCompleteFragment.f28899E0 = c7633z0.f41951W0.get();
        lessonCompleteFragment.f28900F0 = c7633z0.f42012s.get();
    }

    @Override // p537zi.InterfaceC10504n
    /* JADX INFO: renamed from: O */
    public final void mo15107O(MoreFragment moreFragment) {
        C7633z0 c7633z0 = this.f41855a;
        c7633z0.f41988k.get();
        moreFragment.getClass();
        moreFragment.f25108D0 = c7633z0.f42012s.get();
    }

    @Override // p438vj.InterfaceC9748h
    /* JADX INFO: renamed from: O0 */
    public final void mo15108O0() {
    }

    @Override // fj.InterfaceC5552m
    /* JADX INFO: renamed from: P */
    public final void mo11793P() {
    }

    @Override // p343qi.InterfaceC8630b
    /* JADX INFO: renamed from: Q */
    public final void mo15109Q(DailyGoalMetFragment dailyGoalMetFragment) {
        dailyGoalMetFragment.f22530D0 = this.f41855a.f42012s.get();
    }

    @Override // fj.InterfaceC5556q
    /* JADX INFO: renamed from: R */
    public final void mo11795R() {
    }

    @Override // p487xi.InterfaceC10210r
    /* JADX INFO: renamed from: S */
    public final void mo15110S() {
    }

    @Override // fk.InterfaceC5564f
    /* JADX INFO: renamed from: T */
    public final void mo11800T() {
    }

    @Override // dj.InterfaceC5189g
    /* JADX INFO: renamed from: U */
    public final void mo10968U() {
    }

    @Override // p438vj.InterfaceC9747g
    /* JADX INFO: renamed from: V */
    public final void mo15111V(ReviewActivityFlashcardFragment reviewActivityFlashcardFragment) {
        reviewActivityFlashcardFragment.f29779D0 = this.f41855a.f41984i1.get();
    }

    @Override // p438vj.InterfaceC9750j
    /* JADX INFO: renamed from: W */
    public final void mo15112W(ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment) {
        reviewActivityMultiAndClozeFragment.f29879G0 = this.f41855a.f41965c0.get();
    }

    @Override // p417ui.InterfaceC9537h
    /* JADX INFO: renamed from: X */
    public final void mo15113X() {
    }

    @Override // p344qj.InterfaceC8639d
    /* JADX INFO: renamed from: Y */
    public final void mo15114Y(LessonDealWithWordsFragment lessonDealWithWordsFragment) {
        C7633z0 c7633z0 = this.f41855a;
        lessonDealWithWordsFragment.f29090D0 = c7633z0.f41951W0.get();
        lessonDealWithWordsFragment.f29091E0 = c7633z0.f42012s.get();
    }

    @Override // sj.InterfaceC9053l
    /* JADX INFO: renamed from: Z */
    public final void mo15115Z(OnboardingFinishFragment onboardingFinishFragment) {
        C7633z0 c7633z0 = this.f41855a;
        onboardingFinishFragment.f29369E0 = c7633z0.f42012s.get();
        onboardingFinishFragment.f29370F0 = c7633z0.f41951W0.get();
        onboardingFinishFragment.f29371G0 = c7633z0.f41988k.get();
        onboardingFinishFragment.f29372H0 = c7633z0.f41985j.get();
        onboardingFinishFragment.f29373I0 = c7633z0.f41965c0.get();
    }

    @Override // ml.C7634a.b
    /* JADX INFO: renamed from: a */
    public final C7634a.c mo15116a() {
        return this.f41856b.mo15082a();
    }

    @Override // fj.InterfaceC5545f
    /* JADX INFO: renamed from: a0 */
    public final void mo11792a0() {
    }

    @Override // p097ej.InterfaceC5419j
    /* JADX INFO: renamed from: b */
    public final void mo11579b() {
    }

    @Override // p418uj.InterfaceC9551k
    /* JADX INFO: renamed from: b0 */
    public final void mo15117b0() {
    }

    @Override // hk.InterfaceC6074e
    /* JADX INFO: renamed from: c */
    public final void mo12504c(DictionaryContentFragment dictionaryContentFragment) {
        dictionaryContentFragment.f31862W0 = this.f41855a.f41987j1.get();
    }

    @Override // p438vj.InterfaceC9754n
    /* JADX INFO: renamed from: c0 */
    public final void mo15118c0() {
    }

    @Override // p418uj.InterfaceC9550j
    /* JADX INFO: renamed from: d */
    public final void mo15119d(ReviewSessionCompleteFragment reviewSessionCompleteFragment) {
        reviewSessionCompleteFragment.f29535E0 = this.f41855a.f42012s.get();
    }

    @Override // si.InterfaceC9022f
    /* JADX INFO: renamed from: d0 */
    public final void mo15120d0() {
    }

    @Override // p204jj.InterfaceC6504y
    /* JADX INFO: renamed from: e */
    public final void mo13090e() {
    }

    @Override // p224kj.InterfaceC6699a
    /* JADX INFO: renamed from: e0 */
    public final void mo13295e0() {
    }

    @Override // p438vj.InterfaceC9753m
    /* JADX INFO: renamed from: f */
    public final void mo15121f() {
    }

    @Override // p205jk.InterfaceC6509e
    /* JADX INFO: renamed from: f0 */
    public final void mo13098f0(LingQsOfferFragment lingQsOfferFragment) {
        C7633z0 c7633z0 = this.f41855a;
        c7633z0.f42012s.get();
        lingQsOfferFragment.getClass();
        c7633z0.f41951W0.get();
    }

    @Override // p488xj.InterfaceC10211a
    /* JADX INFO: renamed from: g */
    public final void mo15122g(DatastoreReviewSettingsFragment datastoreReviewSettingsFragment) {
        this.f41855a.f42012s.get();
        datastoreReviewSettingsFragment.getClass();
    }

    @Override // fj.InterfaceC5558s
    /* JADX INFO: renamed from: g0 */
    public final void mo11796g0() {
    }

    @Override // vi.InterfaceC9738m
    /* JADX INFO: renamed from: h */
    public final void mo15123h(CoursePlaylistFragment coursePlaylistFragment) {
        C7633z0 c7633z0 = this.f41855a;
        coursePlaylistFragment.f23767F0 = c7633z0.f41981h1.get();
        c7633z0.f42012s.get();
    }

    @Override // p014aj.InterfaceC0095l
    /* JADX INFO: renamed from: h0 */
    public final void mo484h0() {
    }

    @Override // sj.InterfaceC9056o
    /* JADX INFO: renamed from: i */
    public final void mo15124i(OnboardingLevelFragment onboardingLevelFragment) {
        onboardingLevelFragment.f29416C0 = this.f41855a.f42012s.get();
    }

    @Override // p032bk.InterfaceC1607d
    /* JADX INFO: renamed from: i0 */
    public final void mo5255i0() {
    }

    @Override // p204jj.InterfaceC6503x
    /* JADX INFO: renamed from: j */
    public final void mo13089j() {
    }

    @Override // p160hj.InterfaceC6063i
    /* JADX INFO: renamed from: j0 */
    public final void mo12501j0(LessonFragment lessonFragment) {
        C7633z0 c7633z0 = this.f41855a;
        c7633z0.f41982i.get();
        lessonFragment.getClass();
        lessonFragment.f27062I0 = c7633z0.f42012s.get();
        lessonFragment.f27063J0 = c7633z0.f41965c0.get();
        lessonFragment.f27064K0 = c7633z0.f41951W0.get();
        lessonFragment.f27065L0 = c7633z0.f41981h1.get();
    }

    @Override // vi.InterfaceC9731f
    /* JADX INFO: renamed from: k */
    public final void mo15125k(CourseFragment courseFragment) {
        courseFragment.f23677G0 = this.f41855a.f41981h1.get();
    }

    @Override // p204jj.InterfaceC6487h
    /* JADX INFO: renamed from: k0 */
    public final void mo13087k0() {
    }

    @Override // dj.InterfaceC5193k
    /* JADX INFO: renamed from: l */
    public final void mo10969l(VocabularyFragment vocabularyFragment) {
        vocabularyFragment.f26139F0 = this.f41855a.f41951W0.get();
    }

    @Override // ck.InterfaceC2037f
    /* JADX INFO: renamed from: l0 */
    public final void mo6208l0() {
    }

    @Override // p418uj.InterfaceC9549i
    /* JADX INFO: renamed from: m */
    public final void mo15126m(ReviewFragment reviewFragment) {
        C7633z0 c7633z0 = this.f41855a;
        reviewFragment.f29435D0 = c7633z0.f42012s.get();
        c7633z0.f41982i.get();
    }

    @Override // p204jj.InterfaceC6489j
    /* JADX INFO: renamed from: m0 */
    public final void mo13088m0() {
    }

    @Override // fk.InterfaceC5569k
    /* JADX INFO: renamed from: n */
    public final void mo11801n(TokenFragment tokenFragment) {
        C7633z0 c7633z0 = this.f41855a;
        tokenFragment.f31217O0 = c7633z0.f41965c0.get();
        tokenFragment.f31218P0 = c7633z0.f41987j1.get();
        tokenFragment.f31219Q0 = c7633z0.f42012s.get();
    }

    @Override // p303oj.InterfaceC8064g
    /* JADX INFO: renamed from: n0 */
    public final void mo15127n0(ListeningModeFragment listeningModeFragment) {
        C7633z0 c7633z0 = this.f41855a;
        listeningModeFragment.f28733D0 = c7633z0.f42012s.get();
        listeningModeFragment.f28734E0 = c7633z0.f41981h1.get();
    }

    @Override // ck.InterfaceC2032a
    /* JADX INFO: renamed from: o */
    public final void mo6204o(DataStoreSettingsFragment dataStoreSettingsFragment) {
        dataStoreSettingsFragment.f30938E0 = this.f41855a.f41988k.get();
    }

    @Override // p014aj.InterfaceC0097n
    /* JADX INFO: renamed from: o0 */
    public final void mo485o0() {
    }

    @Override // bj.InterfaceC1578a0
    /* JADX INFO: renamed from: p */
    public final void mo5242p() {
    }

    @Override // p368ri.InterfaceC8813e
    /* JADX INFO: renamed from: p0 */
    public final void mo15128p0(HomeFragment homeFragment) {
        C7633z0 c7633z0 = this.f41855a;
        homeFragment.f22659F0 = c7633z0.f41988k.get();
        homeFragment.f22660G0 = c7633z0.f42012s.get();
        homeFragment.f22661H0 = c7633z0.f41965c0.get();
        homeFragment.f22662I0 = c7633z0.f41951W0.get();
        homeFragment.f22663J0 = c7633z0.f41981h1.get();
        homeFragment.f22664K0 = c7633z0.f41985j.get();
        homeFragment.f22665L0 = c7633z0.f42009r.get();
    }

    @Override // hk.InterfaceC6071b
    /* JADX INFO: renamed from: q */
    public final void mo12502q() {
    }

    @Override // p417ui.InterfaceC9534e
    /* JADX INFO: renamed from: q0 */
    public final void mo15129q0() {
    }

    @Override // hk.InterfaceC6072c
    /* JADX INFO: renamed from: r */
    public final void mo12503r() {
    }

    @Override // p302oi.InterfaceC8057h
    /* JADX INFO: renamed from: r0 */
    public final void mo15130r0(StartFragment startFragment) {
        C7633z0 c7633z0 = this.f41855a;
        startFragment.f22377E0 = c7633z0.f41951W0.get();
        startFragment.f22378F0 = c7633z0.f41985j.get();
        startFragment.f22379G0 = c7633z0.f42012s.get();
    }

    @Override // p461wi.InterfaceC9952b
    /* JADX INFO: renamed from: s */
    public final void mo15131s() {
    }

    @Override // p014aj.InterfaceC0090g
    /* JADX INFO: renamed from: s0 */
    public final void mo477s0() {
    }

    @Override // p487xi.InterfaceC10209q
    /* JADX INFO: renamed from: t */
    public final void mo15132t(LanguageStatsFragment languageStatsFragment) {
        C7633z0 c7633z0 = this.f41855a;
        languageStatsFragment.f24243D0 = c7633z0.f42009r.get();
        languageStatsFragment.f24244E0 = c7633z0.f41981h1.get();
    }

    @Override // si.InterfaceC9027k
    /* JADX INFO: renamed from: t0 */
    public final void mo15133t0() {
    }

    @Override // p400ti.InterfaceC9289d
    /* JADX INFO: renamed from: u */
    public final void mo15134u() {
    }

    @Override // p537zi.InterfaceC10499i
    /* JADX INFO: renamed from: u0 */
    public final void mo15135u0() {
    }

    @Override // bj.InterfaceC1587j
    /* JADX INFO: renamed from: v */
    public final void mo5245v() {
    }

    @Override // ck.InterfaceC2039h
    /* JADX INFO: renamed from: v0 */
    public final void mo6209v0() {
    }

    @Override // p097ej.InterfaceC5418i
    /* JADX INFO: renamed from: w */
    public final void mo11578w() {
    }

    @Override // p205jk.InterfaceC6513i
    /* JADX INFO: renamed from: w0 */
    public final void mo13100w0(UpgradeGoPremiumFragment upgradeGoPremiumFragment) {
        C7633z0 c7633z0 = this.f41855a;
        upgradeGoPremiumFragment.f32017C0 = c7633z0.f42012s.get();
        c7633z0.f41951W0.get();
    }

    @Override // si.InterfaceC9037u
    /* JADX INFO: renamed from: x */
    public final void mo15136x() {
    }

    @Override // p014aj.InterfaceC0103t
    /* JADX INFO: renamed from: x0 */
    public final void mo490x0() {
    }

    @Override // p015ak.InterfaceC0112i
    /* JADX INFO: renamed from: y */
    public final void mo495y(RegisterFragment registerFragment) {
        C7633z0 c7633z0 = this.f41855a;
        registerFragment.f30740G0 = c7633z0.f41951W0.get();
        registerFragment.f30741H0 = c7633z0.f41988k.get();
        registerFragment.f30742I0 = c7633z0.f42012s.get();
    }

    @Override // p014aj.InterfaceC0099p
    /* JADX INFO: renamed from: y0 */
    public final void mo486y0() {
    }

    @Override // fj.InterfaceC5554o
    /* JADX INFO: renamed from: z */
    public final void mo11794z() {
    }

    @Override // bj.InterfaceC1593p
    /* JADX INFO: renamed from: z0 */
    public final void mo5246z0(PlaylistFragment playlistFragment) {
        C7633z0 c7633z0 = this.f41855a;
        c7633z0.f41988k.get();
        playlistFragment.getClass();
        c7633z0.f42012s.get();
        playlistFragment.f25464G0 = c7633z0.f41981h1.get();
        c7633z0.f41982i.get();
    }
}
