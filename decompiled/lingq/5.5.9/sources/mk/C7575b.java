package mk;

import com.google.common.collect.ImmutableSet;
import com.lingq.p055ui.MainActivity;
import ml.C7634a;
import p076di.InterfaceC5180b;

/* JADX INFO: renamed from: mk.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C7575b extends AbstractC7586e1 {

    /* JADX INFO: renamed from: a */
    public final C7633z0 f41758a;

    /* JADX INFO: renamed from: b */
    public final C7581d f41759b;

    /* JADX INFO: renamed from: c */
    public final C7575b f41760c = this;

    public C7575b(C7633z0 c7633z0, C7581d c7581d) {
        this.f41758a = c7633z0;
        this.f41759b = c7581d;
    }

    @Override // ml.C7634a.a
    /* JADX INFO: renamed from: a */
    public final C7634a.c mo15082a() {
        int i10 = ImmutableSet.f16056c;
        Object[] objArr = new Object[77];
        objArr[0] = "com.lingq.ui.session.AuthenticationViewModel";
        objArr[1] = "com.lingq.ui.home.challenges.ChallengeDetailsViewModel";
        objArr[2] = "com.lingq.ui.home.challenges.ChallengeMonthlyPromptViewModel";
        objArr[3] = "com.lingq.ui.home.challenges.ChallengeShareViewModel";
        objArr[4] = "com.lingq.ui.home.challenges.ChallengesViewModel";
        objArr[5] = "com.lingq.ui.session.magiclink.CheckEmailViewModel";
        System.arraycopy(new String[]{"com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionViewModel", "com.lingq.ui.home.collections.filter.CollectionsSearchFilterViewModel", "com.lingq.ui.home.collections.filter.CollectionsSearchParentFilterViewModel", "com.lingq.ui.home.collections.CollectionsViewModel", "com.lingq.ui.home.course.CoursePlaylistViewModel", "com.lingq.ui.home.course.CourseViewModel", "com.lingq.ui.goals.DailyGoalCoinsTutorialViewModel", "com.lingq.ui.goals.DailyGoalMetViewModel", "com.lingq.ui.review.settings.DataStoreReviewSettingsViewModel", "com.lingq.ui.settings.DataStoreSettingsViewModel", "com.lingq.ui.lesson.menu.DatastoreLessonSettingsViewModel", "com.lingq.ui.token.dictionaries.DictionariesLocaleViewModel", "com.lingq.ui.token.dictionaries.DictionariesManageViewModel", "com.lingq.ui.session.magiclink.EmailLoginViewModel", "com.lingq.ui.home.HomeViewModel", "com.lingq.ui.goals.InstagramShareViewModel", "com.lingq.ui.home.menu.InviteFriendsViewModel", "com.lingq.ui.home.language.stats.LanguageProgressUpdateViewModel", "com.lingq.ui.home.language.LanguageSelectorViewModel", "com.lingq.ui.home.language.stats.LanguageStatsViewModel", "com.lingq.ui.lesson.stats.LessonCompleteViewModel", "com.lingq.ui.lesson.tutorial.LessonDealWithWordsViewModel", "com.lingq.ui.lesson.edit.LessonEditParentViewModel", "com.lingq.ui.lesson.edit.LessonEditSentencesViewModel", "com.lingq.ui.lesson.tutorial.LessonFirstLingQCongratsViewModel", "com.lingq.ui.info.LessonInfoViewModel", "com.lingq.ui.lesson.page.LessonPageViewModel", "com.lingq.ui.home.library.LessonPreviewViewModel", "com.lingq.ui.lesson.menu.LessonReviewMenuViewModel", "com.lingq.ui.lesson.LessonViewModel", "com.lingq.ui.lesson.vocabulary.LessonVocabularyPageViewModel", "com.lingq.ui.lesson.vocabulary.LessonVocabularyViewModel", "com.lingq.ui.home.library.LibraryViewModel", "com.lingq.ui.upgrade.LingQsOfferViewModel", "com.lingq.ui.lesson.player.ListeningModeViewModel", "com.lingq.ui.MainViewModel", "com.lingq.ui.home.menu.MoreViewModel", "com.lingq.ui.home.notifications.NotificationsDailyLingQViewModel", "com.lingq.ui.home.notifications.NotificationsDailyLingqSelectionViewModel", "com.lingq.ui.home.notifications.NotificationsSettingsParentViewModel", "com.lingq.ui.home.notifications.NotificationsSettingsViewModel", "com.lingq.ui.home.notifications.NotificationsViewModel", "com.lingq.ui.home.playlist.PlaylistAddViewModel", "com.lingq.ui.home.playlist.PlaylistViewModel", "com.lingq.ui.home.playlist.PlaylistsViewModel", "com.lingq.ui.home.library.RepairStreakViewModel", "com.lingq.ui.review.activities.ReviewActivityMatchingViewModel", "com.lingq.ui.review.activities.ReviewActivitySpeakingViewModel", "com.lingq.ui.review.activities.ReviewActivityUnscrambleViewModel", "com.lingq.ui.review.activities.ReviewActivityViewModel", "com.lingq.ui.review.ReviewSessionCompleteViewModel", "com.lingq.ui.review.ReviewViewModel", "com.lingq.ui.home.search.SearchViewModel", "com.lingq.ui.lesson.edit.SentenceEditPageViewModel", "com.lingq.ui.lesson.edit.SentenceEditPagerViewModel", "com.lingq.ui.settings.SettingsEditViewModel", "com.lingq.ui.settings.SettingsSelectionViewModel", "com.lingq.ui.home.language.stats.StatsShareViewModel", "com.lingq.ui.token.TokenEditViewModel", "com.lingq.ui.token.TokenViewModel", "com.lingq.ui.upgrade.UpgradeGoPremiumViewModel", "com.lingq.ui.imports.userImport.UserImportAddCourseViewModel", "com.lingq.ui.imports.userImport.UserImportParentViewModel", "com.lingq.ui.imports.userImport.UserImportSelectionViewModel", "com.lingq.ui.imports.userImport.UserImportTextViewModel", "com.lingq.ui.imports.userImport.UserImportViewModel", "com.lingq.ui.home.vocabulary.VocabularyAddViewModel", "com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionViewModel", "com.lingq.ui.home.vocabulary.filter.VocabularyFilterViewModel", "com.lingq.ui.home.vocabulary.filter.VocabularyParentFilterViewModel", "com.lingq.ui.home.vocabulary.VocabularyViewModel"}, 0, objArr, 6, 71);
        return new C7634a.c(ImmutableSet.m9078G(77, objArr), new C7574a1(this.f41758a, this.f41759b));
    }

    @Override // sj.InterfaceC9059r
    /* JADX INFO: renamed from: b */
    public final void mo15083b() {
    }

    @Override // com.lingq.p055ui.MainActivity.InterfaceC3420a
    /* JADX INFO: renamed from: c */
    public final InterfaceC5180b mo9713c() {
        return this.f41758a.f41985j.get();
    }

    @Override // dagger.hilt.android.internal.managers.C5119f.a
    /* JADX INFO: renamed from: d */
    public final C7584e mo10899d() {
        return new C7584e(this.f41758a, this.f41759b, this.f41760c);
    }

    @Override // p302oi.InterfaceC8054e
    /* JADX INFO: renamed from: e */
    public final void mo15084e(MainActivity mainActivity) {
        C7633z0 c7633z0 = this.f41758a;
        c7633z0.f41988k.get();
        mainActivity.f22173a0 = c7633z0.f41985j.get();
        mainActivity.f22174b0 = c7633z0.f41951W0.get();
        mainActivity.f22175c0 = c7633z0.f42012s.get();
        mainActivity.f22176d0 = c7633z0.f41953X0.get();
    }
}
