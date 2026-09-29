package mk;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.C0987y;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import bj.InterfaceC1598u;
import ci.InterfaceC2008a;
import ci.InterfaceC2009b;
import ci.InterfaceC2010c;
import ci.InterfaceC2011d;
import ci.InterfaceC2012e;
import ci.InterfaceC2013f;
import ci.InterfaceC2014g;
import ci.InterfaceC2015h;
import ci.InterfaceC2016i;
import ci.InterfaceC2017j;
import ci.InterfaceC2018k;
import ci.InterfaceC2019l;
import ci.InterfaceC2020m;
import ci.InterfaceC2021n;
import ci.InterfaceC2022o;
import ci.InterfaceC2023p;
import ci.InterfaceC2024q;
import ci.InterfaceC2025r;
import ci.InterfaceC2026s;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.common.collect.ImmutableMap;
import com.lingq.commons.controllers.InterfaceC3273a;
import com.lingq.commons.controllers.InterfaceC3275c;
import com.lingq.p055ui.MainViewModel;
import com.lingq.p055ui.goals.DailyGoalCoinsTutorialViewModel;
import com.lingq.p055ui.goals.DailyGoalMetViewModel;
import com.lingq.p055ui.goals.InstagramShareViewModel;
import com.lingq.p055ui.home.HomeViewModel;
import com.lingq.p055ui.home.challenges.ChallengeDetailsViewModel;
import com.lingq.p055ui.home.challenges.ChallengeMonthlyPromptViewModel;
import com.lingq.p055ui.home.challenges.ChallengeShareViewModel;
import com.lingq.p055ui.home.challenges.ChallengesViewModel;
import com.lingq.p055ui.home.collections.CollectionsViewModel;
import com.lingq.p055ui.home.collections.filter.CollectionsSearchFilterSelectionViewModel;
import com.lingq.p055ui.home.collections.filter.CollectionsSearchFilterViewModel;
import com.lingq.p055ui.home.collections.filter.CollectionsSearchParentFilterViewModel;
import com.lingq.p055ui.home.course.CoursePlaylistViewModel;
import com.lingq.p055ui.home.course.CourseViewModel;
import com.lingq.p055ui.home.language.LanguageSelectorViewModel;
import com.lingq.p055ui.home.language.stats.LanguageProgressUpdateViewModel;
import com.lingq.p055ui.home.language.stats.LanguageStatsViewModel;
import com.lingq.p055ui.home.language.stats.StatsShareViewModel;
import com.lingq.p055ui.home.library.LessonPreviewViewModel;
import com.lingq.p055ui.home.library.LibraryViewModel;
import com.lingq.p055ui.home.library.RepairStreakViewModel;
import com.lingq.p055ui.home.menu.InviteFriendsViewModel;
import com.lingq.p055ui.home.menu.MoreViewModel;
import com.lingq.p055ui.home.notifications.NotificationsDailyLingQViewModel;
import com.lingq.p055ui.home.notifications.NotificationsDailyLingqSelectionViewModel;
import com.lingq.p055ui.home.notifications.NotificationsSettingsParentViewModel;
import com.lingq.p055ui.home.notifications.NotificationsSettingsViewModel;
import com.lingq.p055ui.home.notifications.NotificationsViewModel;
import com.lingq.p055ui.home.playlist.PlaylistAddViewModel;
import com.lingq.p055ui.home.playlist.PlaylistViewModel;
import com.lingq.p055ui.home.playlist.PlaylistsViewModel;
import com.lingq.p055ui.home.search.SearchViewModel;
import com.lingq.p055ui.home.vocabulary.VocabularyAddViewModel;
import com.lingq.p055ui.home.vocabulary.VocabularyViewModel;
import com.lingq.p055ui.home.vocabulary.filter.VocabularyFilterSelectionViewModel;
import com.lingq.p055ui.home.vocabulary.filter.VocabularyFilterViewModel;
import com.lingq.p055ui.home.vocabulary.filter.VocabularyParentFilterViewModel;
import com.lingq.p055ui.imports.userImport.UserImportAddCourseViewModel;
import com.lingq.p055ui.imports.userImport.UserImportParentViewModel;
import com.lingq.p055ui.imports.userImport.UserImportSelectionViewModel;
import com.lingq.p055ui.imports.userImport.UserImportTextViewModel;
import com.lingq.p055ui.imports.userImport.UserImportViewModel;
import com.lingq.p055ui.info.LessonInfoViewModel;
import com.lingq.p055ui.lesson.LessonViewModel;
import com.lingq.p055ui.lesson.edit.LessonEditParentViewModel;
import com.lingq.p055ui.lesson.edit.LessonEditSentencesViewModel;
import com.lingq.p055ui.lesson.edit.SentenceEditPageViewModel;
import com.lingq.p055ui.lesson.edit.SentenceEditPagerViewModel;
import com.lingq.p055ui.lesson.menu.DatastoreLessonSettingsViewModel;
import com.lingq.p055ui.lesson.menu.LessonReviewMenuViewModel;
import com.lingq.p055ui.lesson.page.LessonPageViewModel;
import com.lingq.p055ui.lesson.player.ListeningModeViewModel;
import com.lingq.p055ui.lesson.stats.LessonCompleteViewModel;
import com.lingq.p055ui.lesson.tutorial.LessonDealWithWordsViewModel;
import com.lingq.p055ui.lesson.tutorial.LessonFirstLingQCongratsViewModel;
import com.lingq.p055ui.lesson.vocabulary.LessonVocabularyPageViewModel;
import com.lingq.p055ui.lesson.vocabulary.LessonVocabularyViewModel;
import com.lingq.p055ui.review.ReviewSessionCompleteViewModel;
import com.lingq.p055ui.review.ReviewViewModel;
import com.lingq.p055ui.review.activities.ReviewActivityMatchingViewModel;
import com.lingq.p055ui.review.activities.ReviewActivitySpeakingViewModel;
import com.lingq.p055ui.review.activities.ReviewActivityUnscrambleViewModel;
import com.lingq.p055ui.review.activities.ReviewActivityViewModel;
import com.lingq.p055ui.review.settings.DataStoreReviewSettingsViewModel;
import com.lingq.p055ui.session.AuthenticationViewModel;
import com.lingq.p055ui.session.magiclink.CheckEmailViewModel;
import com.lingq.p055ui.session.magiclink.EmailLoginViewModel;
import com.lingq.p055ui.settings.DataStoreSettingsViewModel;
import com.lingq.p055ui.settings.SettingsEditViewModel;
import com.lingq.p055ui.settings.SettingsSelectionViewModel;
import com.lingq.p055ui.token.InterfaceC4865b;
import com.lingq.p055ui.token.TokenEditViewModel;
import com.lingq.p055ui.token.TokenViewModel;
import com.lingq.p055ui.token.dictionaries.DictionariesLocaleViewModel;
import com.lingq.p055ui.token.dictionaries.DictionariesManageViewModel;
import com.lingq.p055ui.tooltips.InterfaceC4912b;
import com.lingq.p055ui.upgrade.LingQsOfferViewModel;
import com.lingq.p055ui.upgrade.UpgradeGoPremiumViewModel;
import com.lingq.player.InterfaceC3301f;
import com.lingq.player.PlayerController;
import com.lingq.shared.persistent.LingQDatabase;
import com.lingq.shared.repository.InterfaceC3324a;
import com.squareup.moshi.C4955q;
import fj.InterfaceC5547h;
import java.util.Map;
import jp.C6554v;
import ni.C7796d;
import ni.C7797e;
import no.InterfaceC7882z;
import p014aj.C0101r;
import p015ak.InterfaceC0113j;
import p076di.InterfaceC5179a;
import p076di.InterfaceC5180b;
import p076di.InterfaceC5181c;
import p076di.InterfaceC5182d;
import p097ej.C5416g;
import p204jj.InterfaceC6484e;
import p205jk.InterfaceC6515k;
import p225kk.C6704a;
import p244lh.InterfaceC7364a;
import p244lh.InterfaceC7366c;
import p244lh.InterfaceC7367d;
import p244lh.InterfaceC7368e;
import p342qh.C8626a;
import p342qh.C8627b;
import p342qh.C8628c;
import p371rl.InterfaceC8825a;
import p416uh.InterfaceC9527a;
import p416uh.InterfaceC9529c;
import p417ui.InterfaceC9530a;
import p486xh.InterfaceC10189a;
import sh.InterfaceC9010f;
import sh.InterfaceC9013i;
import th.InterfaceC9284a;

/* JADX INFO: renamed from: mk.b1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7577b1 extends AbstractC7601j1 {

    /* JADX INFO: renamed from: A */
    public a f41762A;

    /* JADX INFO: renamed from: B */
    public a f41763B;

    /* JADX INFO: renamed from: C */
    public a f41764C;

    /* JADX INFO: renamed from: D */
    public a f41765D;

    /* JADX INFO: renamed from: E */
    public a f41766E;

    /* JADX INFO: renamed from: F */
    public a f41767F;

    /* JADX INFO: renamed from: G */
    public a f41768G;

    /* JADX INFO: renamed from: H */
    public a f41769H;

    /* JADX INFO: renamed from: I */
    public a f41770I;

    /* JADX INFO: renamed from: J */
    public a f41771J;

    /* JADX INFO: renamed from: K */
    public a f41772K;

    /* JADX INFO: renamed from: L */
    public a f41773L;

    /* JADX INFO: renamed from: M */
    public a f41774M;

    /* JADX INFO: renamed from: N */
    public a f41775N;

    /* JADX INFO: renamed from: O */
    public a f41776O;

    /* JADX INFO: renamed from: P */
    public a f41777P;

    /* JADX INFO: renamed from: Q */
    public a f41778Q;

    /* JADX INFO: renamed from: R */
    public a f41779R;

    /* JADX INFO: renamed from: S */
    public a f41780S;

    /* JADX INFO: renamed from: T */
    public a f41781T;

    /* JADX INFO: renamed from: U */
    public a f41782U;

    /* JADX INFO: renamed from: V */
    public a f41783V;

    /* JADX INFO: renamed from: W */
    public a f41784W;

    /* JADX INFO: renamed from: X */
    public a f41785X;

    /* JADX INFO: renamed from: Y */
    public a f41786Y;

    /* JADX INFO: renamed from: Z */
    public a f41787Z;

    /* JADX INFO: renamed from: a */
    public final C1024c0 f41788a;

    /* JADX INFO: renamed from: a0 */
    public a f41789a0;

    /* JADX INFO: renamed from: b */
    public a f41790b;

    /* JADX INFO: renamed from: b0 */
    public a f41791b0;

    /* JADX INFO: renamed from: c */
    public a f41792c;

    /* JADX INFO: renamed from: c0 */
    public a f41793c0;

    /* JADX INFO: renamed from: d */
    public a f41794d;

    /* JADX INFO: renamed from: d0 */
    public a f41795d0;

    /* JADX INFO: renamed from: e */
    public a f41796e;

    /* JADX INFO: renamed from: e0 */
    public a f41797e0;

    /* JADX INFO: renamed from: f */
    public a f41798f;

    /* JADX INFO: renamed from: f0 */
    public a f41799f0;

    /* JADX INFO: renamed from: g */
    public a f41800g;

    /* JADX INFO: renamed from: g0 */
    public a f41801g0;

    /* JADX INFO: renamed from: h */
    public a f41802h;

    /* JADX INFO: renamed from: h0 */
    public a f41803h0;

    /* JADX INFO: renamed from: i */
    public a f41804i;

    /* JADX INFO: renamed from: i0 */
    public a f41805i0;

    /* JADX INFO: renamed from: j */
    public a f41806j;

    /* JADX INFO: renamed from: j0 */
    public a f41807j0;

    /* JADX INFO: renamed from: k */
    public a f41808k;

    /* JADX INFO: renamed from: k0 */
    public a f41809k0;

    /* JADX INFO: renamed from: l */
    public a f41810l;

    /* JADX INFO: renamed from: l0 */
    public a f41811l0;

    /* JADX INFO: renamed from: m */
    public a f41812m;

    /* JADX INFO: renamed from: m0 */
    public a f41813m0;

    /* JADX INFO: renamed from: n */
    public a f41814n;

    /* JADX INFO: renamed from: n0 */
    public a f41815n0;

    /* JADX INFO: renamed from: o */
    public a f41816o;

    /* JADX INFO: renamed from: o0 */
    public a f41817o0;

    /* JADX INFO: renamed from: p */
    public a f41818p;

    /* JADX INFO: renamed from: p0 */
    public a f41819p0;

    /* JADX INFO: renamed from: q */
    public a f41820q;

    /* JADX INFO: renamed from: q0 */
    public a f41821q0;

    /* JADX INFO: renamed from: r */
    public a f41822r;

    /* JADX INFO: renamed from: r0 */
    public a f41823r0;

    /* JADX INFO: renamed from: s */
    public a f41824s;

    /* JADX INFO: renamed from: s0 */
    public a f41825s0;

    /* JADX INFO: renamed from: t */
    public a f41826t;

    /* JADX INFO: renamed from: t0 */
    public a f41827t0;

    /* JADX INFO: renamed from: u */
    public a f41828u;

    /* JADX INFO: renamed from: u0 */
    public a f41829u0;

    /* JADX INFO: renamed from: v */
    public a f41830v;

    /* JADX INFO: renamed from: v0 */
    public a f41831v0;

    /* JADX INFO: renamed from: w */
    public a f41832w;

    /* JADX INFO: renamed from: w0 */
    public a f41833w0;

    /* JADX INFO: renamed from: x */
    public a f41834x;

    /* JADX INFO: renamed from: x0 */
    public a f41835x0;

    /* JADX INFO: renamed from: y */
    public a f41836y;

    /* JADX INFO: renamed from: y0 */
    public a f41837y0;

    /* JADX INFO: renamed from: z */
    public a f41838z;

    /* JADX INFO: renamed from: z0 */
    public a f41839z0;

    /* JADX INFO: renamed from: mk.b1$a */
    public static final class a<T> implements InterfaceC8825a<T> {

        /* JADX INFO: renamed from: a */
        public final C7633z0 f41840a;

        /* JADX INFO: renamed from: b */
        public final C7577b1 f41841b;

        /* JADX INFO: renamed from: c */
        public final int f41842c;

        public a(C7633z0 c7633z0, C7577b1 c7577b1, int i10) {
            this.f41840a = c7633z0;
            this.f41841b = c7577b1;
            this.f41842c = i10;
        }

        @Override // p371rl.InterfaceC8825a
        public final T get() {
            C7577b1 c7577b1 = this.f41841b;
            C7633z0 c7633z0 = this.f41840a;
            int i10 = this.f41842c;
            switch (i10) {
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    return (T) new AuthenticationViewModel((InterfaceC2020m) c7633z0.f41939Q0.get(), (InterfaceC2012e) c7633z0.f41968d0.get(), (InterfaceC2015h) c7633z0.f41990k1.get(), (InterfaceC2011d) c7633z0.f41952X.get(), C8627b.m16853a(), (InterfaceC7882z) c7633z0.f41955Y0.get(), (C6554v) c7633z0.f42000o.get(), (C4955q) c7633z0.f41982i.get(), (C6704a) c7633z0.f41951W0.get(), (InterfaceC5180b) c7633z0.f41985j.get(), (C7797e) c7633z0.f41988k.get(), (InterfaceC0113j) c7633z0.f41975f1.get(), c7577b1.f41788a);
                case 1:
                    return (T) new ChallengeDetailsViewModel((InterfaceC2009b) c7633z0.f41926K.get(), C8626a.m16851b(), (C7796d) c7633z0.f42012s.get(), (InterfaceC5180b) c7633z0.f41985j.get(), C8627b.m16853a(), (InterfaceC0113j) c7633z0.f41975f1.get(), (InterfaceC6515k) c7633z0.f41993l1.get(), c7577b1.f41788a);
                case 2:
                    return (T) new ChallengeMonthlyPromptViewModel((InterfaceC2017j) c7633z0.f41913F0.get(), C8627b.m16853a(), (InterfaceC0113j) c7633z0.f41975f1.get(), c7577b1.f41788a);
                case 3:
                    return (T) new ChallengeShareViewModel((InterfaceC2009b) c7633z0.f41926K.get(), C8627b.m16853a(), (InterfaceC0113j) c7633z0.f41975f1.get(), c7577b1.f41788a);
                case 4:
                    return (T) new ChallengesViewModel((InterfaceC2009b) c7633z0.f41926K.get(), C8626a.m16851b(), C8627b.m16853a(), (InterfaceC0113j) c7633z0.f41975f1.get(), c7577b1.f41788a);
                case 5:
                    return (T) new CheckEmailViewModel((InterfaceC2020m) c7633z0.f41939Q0.get(), C8627b.m16853a(), c7577b1.f41788a);
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    return (T) new CollectionsSearchFilterSelectionViewModel((InterfaceC5182d) c7633z0.f42009r.get(), (InterfaceC3324a) c7633z0.f41998n0.get(), C8627b.m16853a(), C8626a.m16851b(), (InterfaceC0113j) c7633z0.f41975f1.get(), c7577b1.f41788a);
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    return (T) new CollectionsSearchFilterViewModel((InterfaceC5182d) c7633z0.f42009r.get(), (InterfaceC0113j) c7633z0.f41975f1.get(), c7577b1.f41788a);
                case 8:
                    return (T) new CollectionsSearchParentFilterViewModel((InterfaceC9530a) c7633z0.f41996m1.get(), c7577b1.f41788a);
                case 9:
                    return (T) new CollectionsViewModel((InterfaceC3324a) c7633z0.f41998n0.get(), (InterfaceC2010c) c7633z0.f41934O.get(), (InterfaceC2014g) c7633z0.f41953X0.get(), C8628c.m16854a(), C8627b.m16853a(), C8626a.m16851b(), (InterfaceC5182d) c7633z0.f42009r.get(), (InterfaceC5180b) c7633z0.f41985j.get(), (InterfaceC5179a) c7633z0.f41965c0.get(), (C7797e) c7633z0.f41988k.get(), (InterfaceC0113j) c7633z0.f41975f1.get(), (InterfaceC9530a) c7633z0.f41996m1.get(), (InterfaceC9527a) c7633z0.f41972e1.get(), (InterfaceC9284a) c7633z0.f41942S.get(), (InterfaceC4912b) c7633z0.f41999n1.get(), c7577b1.f41788a);
                case 10:
                    return (T) new CoursePlaylistViewModel((InterfaceC2019l) c7633z0.f42018u.get(), (InterfaceC2014g) c7633z0.f41953X0.get(), (InterfaceC2024q) c7633z0.f41969d1.get(), (InterfaceC5180b) c7633z0.f41985j.get(), (InterfaceC5182d) c7633z0.f42009r.get(), C8627b.m16853a(), C8626a.m16851b(), (PlayerController) c7633z0.f41981h1.get(), (InterfaceC0113j) c7633z0.f41975f1.get(), (InterfaceC3301f) c7633z0.f41960a1.get(), (InterfaceC9013i) c7633z0.f41957Z0.get(), (InterfaceC9527a) c7633z0.f41972e1.get(), (InterfaceC6515k) c7633z0.f41993l1.get(), c7577b1.f41788a);
                case 11:
                    return (T) new CourseViewModel((InterfaceC2010c) c7633z0.f41934O.get(), (InterfaceC3324a) c7633z0.f41998n0.get(), (InterfaceC2014g) c7633z0.f41953X0.get(), (InterfaceC5180b) c7633z0.f41985j.get(), C8627b.m16853a(), C8626a.m16851b(), (InterfaceC0113j) c7633z0.f41975f1.get(), (InterfaceC3301f) c7633z0.f41960a1.get(), (InterfaceC9527a) c7633z0.f41972e1.get(), (InterfaceC9284a) c7633z0.f41942S.get(), (InterfaceC4912b) c7633z0.f41999n1.get(), c7577b1.f41788a);
                case 12:
                    return (T) new DailyGoalCoinsTutorialViewModel((InterfaceC2016i) c7633z0.f41901B0.get(), C8627b.m16853a(), (InterfaceC0113j) c7633z0.f41975f1.get(), (InterfaceC7367d) c7633z0.f42002o1.get(), (InterfaceC4912b) c7633z0.f41999n1.get(), c7577b1.f41788a);
                case 13:
                    return (T) new DailyGoalMetViewModel((InterfaceC2016i) c7633z0.f41901B0.get(), C8627b.m16853a(), (InterfaceC0113j) c7633z0.f41975f1.get(), (InterfaceC7367d) c7633z0.f42002o1.get(), (InterfaceC4912b) c7633z0.f41999n1.get(), c7577b1.f41788a);
                case 14:
                    return (T) new DataStoreReviewSettingsViewModel((InterfaceC2024q) c7633z0.f41969d1.get(), (InterfaceC5181c) c7633z0.f41984i1.get(), C8627b.m16853a(), (InterfaceC0113j) c7633z0.f41975f1.get(), c7577b1.f41788a);
                case 15:
                    return (T) new DataStoreSettingsViewModel((InterfaceC2012e) c7633z0.f41968d0.get(), C8627b.m16853a(), (InterfaceC5179a) c7633z0.f41965c0.get(), (PlayerController) c7633z0.f41981h1.get(), (InterfaceC2019l) c7633z0.f42018u.get(), (C6704a) c7633z0.f41951W0.get(), (C7797e) c7633z0.f41988k.get(), C7633z0.m15173g0(c7633z0), (InterfaceC0113j) c7633z0.f41975f1.get(), (InterfaceC4912b) c7633z0.f41999n1.get(), c7577b1.f41788a);
                case 16:
                    return (T) new DatastoreLessonSettingsViewModel((InterfaceC2020m) c7633z0.f41939Q0.get(), (InterfaceC2015h) c7633z0.f41990k1.get(), (InterfaceC2024q) c7633z0.f41969d1.get(), (InterfaceC5179a) c7633z0.f41965c0.get(), (InterfaceC5180b) c7633z0.f41985j.get(), (InterfaceC3275c) c7633z0.f41987j1.get(), (C7796d) c7633z0.f42012s.get(), C8626a.m16850a(c7633z0.f41958a), C8627b.m16853a(), (InterfaceC0113j) c7633z0.f41975f1.get(), c7577b1.f41788a);
                case 17:
                    return (T) new DictionariesLocaleViewModel((InterfaceC2008a) c7633z0.f41906D.get(), (InterfaceC2012e) c7633z0.f41968d0.get(), C8627b.m16853a(), (InterfaceC0113j) c7633z0.f41975f1.get(), c7577b1.f41788a);
                case 18:
                    return (T) new DictionariesManageViewModel((InterfaceC2015h) c7633z0.f41990k1.get(), (InterfaceC2011d) c7633z0.f41952X.get(), (InterfaceC0113j) c7633z0.f41975f1.get(), C8627b.m16853a(), C8626a.m16851b());
                case 19:
                    return (T) new EmailLoginViewModel((InterfaceC2020m) c7633z0.f41939Q0.get(), C8627b.m16853a());
                case 20:
                    return (T) new HomeViewModel((InterfaceC2020m) c7633z0.f41939Q0.get(), (InterfaceC2012e) c7633z0.f41968d0.get(), (InterfaceC2015h) c7633z0.f41990k1.get(), (InterfaceC2011d) c7633z0.f41952X.get(), (InterfaceC2014g) c7633z0.f41953X0.get(), (InterfaceC2019l) c7633z0.f42018u.get(), (InterfaceC5182d) c7633z0.f42009r.get(), (InterfaceC5179a) c7633z0.f41965c0.get(), (LingQDatabase) c7633z0.f41964c.get(), (InterfaceC3275c) c7633z0.f41987j1.get(), (InterfaceC3273a) c7633z0.f42005p1.get(), C8627b.m16853a(), (InterfaceC7882z) c7633z0.f41955Y0.get(), (InterfaceC0113j) c7633z0.f41975f1.get(), (InterfaceC9013i) c7633z0.f41957Z0.get(), (InterfaceC6515k) c7633z0.f41993l1.get(), (PlayerController) c7633z0.f41981h1.get(), (InterfaceC7368e) c7633z0.f42008q1.get(), (InterfaceC4912b) c7633z0.f41999n1.get(), c7577b1.f41788a);
                case 21:
                    return (T) new InstagramShareViewModel(c7577b1.f41788a);
                case 22:
                    return (T) new InviteFriendsViewModel((InterfaceC2021n) c7633z0.f42017t1.get(), (InterfaceC5180b) c7633z0.f41985j.get());
                case 23:
                    return (T) new LanguageProgressUpdateViewModel((InterfaceC2013f) c7633z0.f42030y.get(), (InterfaceC0113j) c7633z0.f41975f1.get(), c7577b1.f41788a);
                case 24:
                    return (T) new LanguageSelectorViewModel((InterfaceC2012e) c7633z0.f41968d0.get(), C8626a.m16850a(c7633z0.f41958a), (InterfaceC0113j) c7633z0.f41975f1.get(), c7577b1.f41788a);
                case 25:
                    return (T) new LanguageStatsViewModel((InterfaceC2013f) c7633z0.f42030y.get(), (InterfaceC2009b) c7633z0.f41926K.get(), (InterfaceC0113j) c7633z0.f41975f1.get(), (InterfaceC5179a) c7633z0.f41965c0.get(), (InterfaceC5182d) c7633z0.f42009r.get(), C8627b.m16853a(), C8626a.m16851b(), c7577b1.f41788a);
                case 26:
                    return (T) new LessonCompleteViewModel((InterfaceC3324a) c7633z0.f41998n0.get(), (InterfaceC2019l) c7633z0.f42018u.get(), (InterfaceC2013f) c7633z0.f42030y.get(), (InterfaceC2014g) c7633z0.f41953X0.get(), (InterfaceC5180b) c7633z0.f41985j.get(), C8626a.m16850a(c7633z0.f41958a), C8627b.m16853a(), C8626a.m16851b(), (InterfaceC5179a) c7633z0.f41965c0.get(), (InterfaceC0113j) c7633z0.f41975f1.get(), c7577b1.f41788a);
                case 27:
                    return (T) new LessonDealWithWordsViewModel((InterfaceC4912b) c7633z0.f41999n1.get(), (InterfaceC2026s) c7633z0.f41945T0.get(), (InterfaceC2008a) c7633z0.f41906D.get(), (InterfaceC2023p) c7633z0.f42026w1.get(), (C7796d) c7633z0.f42012s.get(), (C6704a) c7633z0.f41951W0.get(), (InterfaceC5179a) c7633z0.f41965c0.get(), (InterfaceC0113j) c7633z0.f41975f1.get(), (InterfaceC4865b) c7633z0.f42029x1.get(), c7577b1.f41788a);
                case 28:
                    return (T) new LessonEditParentViewModel((InterfaceC3324a) c7633z0.f41998n0.get(), (InterfaceC0113j) c7633z0.f41975f1.get(), (InterfaceC6484e) c7633z0.f42032y1.get(), c7577b1.f41788a);
                case 29:
                    return (T) new LessonEditSentencesViewModel((InterfaceC3324a) c7633z0.f41998n0.get(), (InterfaceC0113j) c7633z0.f41975f1.get(), (InterfaceC6484e) c7633z0.f42032y1.get(), c7577b1.f41788a);
                case 30:
                    return (T) new LessonFirstLingQCongratsViewModel((InterfaceC4912b) c7633z0.f41999n1.get(), c7577b1.f41788a);
                case 31:
                    return (T) new LessonInfoViewModel((InterfaceC3324a) c7633z0.f41998n0.get(), (InterfaceC2014g) c7633z0.f41953X0.get(), (InterfaceC2019l) c7633z0.f42018u.get(), (InterfaceC2010c) c7633z0.f41934O.get(), (InterfaceC5182d) c7633z0.f42009r.get(), (InterfaceC5180b) c7633z0.f41985j.get(), C8627b.m16853a(), C8626a.m16851b(), (InterfaceC0113j) c7633z0.f41975f1.get(), (InterfaceC9527a) c7633z0.f41972e1.get(), c7577b1.f41788a);
                case 32:
                    return (T) new LessonPageViewModel((InterfaceC2008a) c7633z0.f41906D.get(), (InterfaceC2026s) c7633z0.f41945T0.get(), (InterfaceC3324a) c7633z0.f41998n0.get(), C8626a.m16851b(), (InterfaceC3275c) c7633z0.f41987j1.get(), (InterfaceC5179a) c7633z0.f41965c0.get(), (InterfaceC7882z) c7633z0.f41955Y0.get(), C8626a.m16852c(), (InterfaceC0113j) c7633z0.f41975f1.get(), (InterfaceC4912b) c7633z0.f41999n1.get(), c7577b1.f41788a);
                case 33:
                    return (T) new LessonPreviewViewModel((InterfaceC3324a) c7633z0.f41998n0.get(), (InterfaceC5180b) c7633z0.f41985j.get(), (C7796d) c7633z0.f42012s.get(), (InterfaceC0113j) c7633z0.f41975f1.get(), (InterfaceC6515k) c7633z0.f41993l1.get(), c7577b1.f41788a);
                case 34:
                    return (T) new LessonReviewMenuViewModel((InterfaceC4912b) c7633z0.f41999n1.get(), c7577b1.f41788a);
                case 35:
                    return (T) new LessonViewModel((InterfaceC3324a) c7633z0.f41998n0.get(), (InterfaceC2019l) c7633z0.f42018u.get(), (InterfaceC2008a) c7633z0.f41906D.get(), (InterfaceC2026s) c7633z0.f41945T0.get(), (InterfaceC2013f) c7633z0.f42030y.get(), (InterfaceC2024q) c7633z0.f41969d1.get(), (InterfaceC2014g) c7633z0.f41953X0.get(), (InterfaceC2016i) c7633z0.f41901B0.get(), (InterfaceC5179a) c7633z0.f41965c0.get(), (InterfaceC5180b) c7633z0.f41985j.get(), (InterfaceC5182d) c7633z0.f42009r.get(), (C6704a) c7633z0.f41951W0.get(), (InterfaceC3275c) c7633z0.f41987j1.get(), (PlayerController) c7633z0.f41981h1.get(), (C7796d) c7633z0.f42012s.get(), (C4955q) c7633z0.f41982i.get(), C8628c.m16854a(), C8627b.m16853a(), C8626a.m16851b(), (InterfaceC7882z) c7633z0.f41955Y0.get(), (InterfaceC0113j) c7633z0.f41975f1.get(), (InterfaceC4865b) c7633z0.f42029x1.get(), (InterfaceC3301f) c7633z0.f41960a1.get(), (InterfaceC9013i) c7633z0.f41957Z0.get(), (InterfaceC9010f) c7633z0.f42035z1.get(), (InterfaceC9527a) c7633z0.f41972e1.get(), (InterfaceC7367d) c7633z0.f42002o1.get(), (InterfaceC7366c) c7633z0.f41899A1.get(), (InterfaceC6515k) c7633z0.f41993l1.get(), (InterfaceC4912b) c7633z0.f41999n1.get(), (InterfaceC7364a) c7633z0.f41978g1.get(), c7577b1.f41788a);
                case 36:
                    return (T) new LessonVocabularyPageViewModel((InterfaceC2008a) c7633z0.f41906D.get(), (InterfaceC2026s) c7633z0.f41945T0.get(), (InterfaceC2013f) c7633z0.f42030y.get(), (InterfaceC2023p) c7633z0.f42026w1.get(), C8626a.m16851b(), C8628c.m16854a(), C8627b.m16853a(), (InterfaceC0113j) c7633z0.f41975f1.get(), (InterfaceC7366c) c7633z0.f41899A1.get(), c7577b1.f41788a);
                case 37:
                    return (T) new LessonVocabularyViewModel((InterfaceC3324a) c7633z0.f41998n0.get(), (InterfaceC2008a) c7633z0.f41906D.get(), C8628c.m16854a(), C8627b.m16853a(), (InterfaceC4865b) c7633z0.f42029x1.get(), (InterfaceC7367d) c7633z0.f42002o1.get(), c7577b1.f41788a);
                case 38:
                    return (T) new LibraryViewModel((InterfaceC3324a) c7633z0.f41998n0.get(), (InterfaceC2010c) c7633z0.f41934O.get(), (InterfaceC2014g) c7633z0.f41953X0.get(), (InterfaceC2013f) c7633z0.f42030y.get(), (InterfaceC2016i) c7633z0.f41901B0.get(), (InterfaceC2017j) c7633z0.f41913F0.get(), (InterfaceC2009b) c7633z0.f41926K.get(), (InterfaceC2012e) c7633z0.f41968d0.get(), (InterfaceC5182d) c7633z0.f42009r.get(), (InterfaceC5180b) c7633z0.f41985j.get(), (InterfaceC5179a) c7633z0.f41965c0.get(), (C7797e) c7633z0.f41988k.get(), C8628c.m16854a(), C8627b.m16853a(), C8626a.m16851b(), (InterfaceC0113j) c7633z0.f41975f1.get(), (InterfaceC9284a) c7633z0.f41942S.get(), (InterfaceC4912b) c7633z0.f41999n1.get(), (InterfaceC7368e) c7633z0.f42008q1.get(), c7577b1.f41788a);
                case 39:
                    return (T) new LingQsOfferViewModel((InterfaceC2020m) c7633z0.f41939Q0.get(), (C7796d) c7633z0.f42012s.get(), (InterfaceC0113j) c7633z0.f41975f1.get(), (InterfaceC6515k) c7633z0.f41993l1.get(), c7577b1.f41788a);
                case 40:
                    return (T) new ListeningModeViewModel((InterfaceC3324a) c7633z0.f41998n0.get(), (PlayerController) c7633z0.f41981h1.get(), (InterfaceC5182d) c7633z0.f42009r.get(), C8627b.m16853a(), (InterfaceC0113j) c7633z0.f41975f1.get(), (InterfaceC3301f) c7633z0.f41960a1.get(), (InterfaceC9010f) c7633z0.f42035z1.get(), (InterfaceC7364a) c7633z0.f41978g1.get(), (InterfaceC4912b) c7633z0.f41999n1.get(), c7577b1.f41788a);
                case 41:
                    return (T) new MainViewModel((InterfaceC2020m) c7633z0.f41939Q0.get(), (InterfaceC2012e) c7633z0.f41968d0.get(), (InterfaceC5179a) c7633z0.f41965c0.get(), (InterfaceC5180b) c7633z0.f41985j.get(), (C7797e) c7633z0.f41988k.get(), (C7796d) c7633z0.f42012s.get(), (C4955q) c7633z0.f41982i.get(), (InterfaceC2014g) c7633z0.f41953X0.get(), (LingQDatabase) c7633z0.f41964c.get(), (InterfaceC7882z) c7633z0.f41955Y0.get(), C8627b.m16853a(), (InterfaceC0113j) c7633z0.f41975f1.get(), (InterfaceC4912b) c7633z0.f41999n1.get(), (InterfaceC9013i) c7633z0.f41957Z0.get(), (InterfaceC7368e) c7633z0.f42008q1.get(), (InterfaceC3273a) c7633z0.f42005p1.get(), (InterfaceC10189a) c7633z0.f41991l.get());
                case 42:
                    return (T) new MoreViewModel((InterfaceC0113j) c7633z0.f41975f1.get(), (InterfaceC7368e) c7633z0.f42008q1.get(), c7577b1.f41788a);
                case 43:
                    return (T) new NotificationsDailyLingQViewModel((InterfaceC2012e) c7633z0.f41968d0.get(), C8627b.m16853a(), (InterfaceC0113j) c7633z0.f41975f1.get(), c7577b1.f41788a);
                case 44:
                    return (T) new NotificationsDailyLingqSelectionViewModel((InterfaceC2012e) c7633z0.f41968d0.get(), C8627b.m16853a(), (InterfaceC0113j) c7633z0.f41975f1.get(), c7577b1.f41788a);
                case 45:
                    return (T) new NotificationsSettingsParentViewModel(new C0101r(), c7577b1.f41788a);
                case 46:
                    return (T) new NotificationsSettingsViewModel((InterfaceC0113j) c7633z0.f41975f1.get());
                case 47:
                    return (T) new NotificationsViewModel((InterfaceC2018k) c7633z0.f41925J0.get(), C8626a.m16851b(), (InterfaceC5182d) c7633z0.f42009r.get(), C8627b.m16853a(), (InterfaceC0113j) c7633z0.f41975f1.get(), new C0101r(), (InterfaceC7368e) c7633z0.f42008q1.get());
                case 48:
                    return (T) new PlaylistAddViewModel((InterfaceC2019l) c7633z0.f42018u.get(), C8627b.m16853a(), (InterfaceC0113j) c7633z0.f41975f1.get(), (InterfaceC1598u) c7633z0.f41902B1.get(), c7577b1.f41788a);
                case 49:
                    return (T) new PlaylistViewModel((InterfaceC2019l) c7633z0.f42018u.get(), (InterfaceC3324a) c7633z0.f41998n0.get(), (InterfaceC2010c) c7633z0.f41934O.get(), (InterfaceC2014g) c7633z0.f41953X0.get(), (InterfaceC2024q) c7633z0.f41969d1.get(), C8627b.m16853a(), C8628c.m16854a(), C8626a.m16851b(), (InterfaceC5179a) c7633z0.f41965c0.get(), (InterfaceC5182d) c7633z0.f42009r.get(), (InterfaceC5180b) c7633z0.f41985j.get(), (PlayerController) c7633z0.f41981h1.get(), (C6704a) c7633z0.f41951W0.get(), (InterfaceC0113j) c7633z0.f41975f1.get(), (InterfaceC3301f) c7633z0.f41960a1.get(), (InterfaceC9013i) c7633z0.f41957Z0.get(), (InterfaceC9527a) c7633z0.f41972e1.get(), (InterfaceC1598u) c7633z0.f41902B1.get(), (InterfaceC6515k) c7633z0.f41993l1.get(), c7577b1.f41788a);
                case 50:
                    return (T) new PlaylistsViewModel((InterfaceC2019l) c7633z0.f42018u.get(), C8627b.m16853a(), (InterfaceC1598u) c7633z0.f41902B1.get(), (InterfaceC0113j) c7633z0.f41975f1.get(), (InterfaceC6515k) c7633z0.f41993l1.get(), c7577b1.f41788a);
                case 51:
                    return (T) new RepairStreakViewModel((InterfaceC5182d) c7633z0.f42009r.get(), (InterfaceC2013f) c7633z0.f42030y.get(), (C7797e) c7633z0.f41988k.get(), C8627b.m16853a(), (InterfaceC0113j) c7633z0.f41975f1.get(), c7577b1.f41788a);
                case 52:
                    return (T) new ReviewActivityMatchingViewModel((InterfaceC2008a) c7633z0.f41906D.get(), (InterfaceC2024q) c7633z0.f41969d1.get(), (InterfaceC3275c) c7633z0.f41987j1.get(), C8628c.m16854a(), C8627b.m16853a(), C8626a.m16851b(), (InterfaceC0113j) c7633z0.f41975f1.get(), c7577b1.f41788a);
                case 53:
                    return (T) new ReviewActivitySpeakingViewModel((InterfaceC3324a) c7633z0.f41998n0.get(), (InterfaceC2024q) c7633z0.f41969d1.get(), (InterfaceC3275c) c7633z0.f41987j1.get(), (InterfaceC5179a) c7633z0.f41965c0.get(), C8628c.m16854a(), C8627b.m16853a(), C8626a.m16851b(), (InterfaceC0113j) c7633z0.f41975f1.get(), c7577b1.f41788a);
                case 54:
                    return (T) new ReviewActivityUnscrambleViewModel((InterfaceC3324a) c7633z0.f41998n0.get(), (InterfaceC2024q) c7633z0.f41969d1.get(), (InterfaceC3275c) c7633z0.f41987j1.get(), C8628c.m16854a(), C8627b.m16853a(), C8626a.m16851b(), (InterfaceC0113j) c7633z0.f41975f1.get(), c7577b1.f41788a);
                case 55:
                    return (T) new ReviewActivityViewModel((InterfaceC2008a) c7633z0.f41906D.get(), (InterfaceC2025r) c7633z0.f41908D1.get(), (InterfaceC2024q) c7633z0.f41969d1.get(), (InterfaceC3275c) c7633z0.f41987j1.get(), C8628c.m16854a(), C8627b.m16853a(), C8626a.m16851b(), (InterfaceC0113j) c7633z0.f41975f1.get(), c7577b1.f41788a);
                case 56:
                    return (T) new ReviewSessionCompleteViewModel((InterfaceC2008a) c7633z0.f41906D.get(), (InterfaceC0113j) c7633z0.f41975f1.get(), c7577b1.f41788a);
                case 57:
                    return (T) new ReviewViewModel((InterfaceC2025r) c7633z0.f41908D1.get(), (InterfaceC2008a) c7633z0.f41906D.get(), (InterfaceC2024q) c7633z0.f41969d1.get(), C8627b.m16853a(), (InterfaceC5179a) c7633z0.f41965c0.get(), (InterfaceC5181c) c7633z0.f41984i1.get(), (C6704a) c7633z0.f41951W0.get(), (C7796d) c7633z0.f42012s.get(), (InterfaceC0113j) c7633z0.f41975f1.get(), (InterfaceC4865b) c7633z0.f42029x1.get(), (InterfaceC7364a) c7633z0.f41978g1.get(), c7577b1.f41788a);
                case 58:
                    return (T) new SearchViewModel(C8626a.m16851b(), (InterfaceC3324a) c7633z0.f41998n0.get(), (InterfaceC2022o) c7633z0.f41917G1.get(), (InterfaceC2014g) c7633z0.f41953X0.get(), C8627b.m16853a(), (InterfaceC0113j) c7633z0.f41975f1.get(), (InterfaceC9284a) c7633z0.f41942S.get(), c7577b1.f41788a);
                case 59:
                    return (T) new SentenceEditPageViewModel((InterfaceC3324a) c7633z0.f41998n0.get(), (InterfaceC2015h) c7633z0.f41990k1.get(), C8627b.m16853a(), (InterfaceC3275c) c7633z0.f41987j1.get(), (InterfaceC0113j) c7633z0.f41975f1.get(), (InterfaceC6484e) c7633z0.f42032y1.get(), c7577b1.f41788a);
                case 60:
                    return (T) new SentenceEditPagerViewModel((InterfaceC3324a) c7633z0.f41998n0.get(), (InterfaceC2015h) c7633z0.f41990k1.get(), C8627b.m16853a(), (InterfaceC3275c) c7633z0.f41987j1.get(), (InterfaceC0113j) c7633z0.f41975f1.get(), (InterfaceC6484e) c7633z0.f42032y1.get(), c7577b1.f41788a);
                case 61:
                    return (T) new SettingsEditViewModel((InterfaceC5181c) c7633z0.f41984i1.get(), C8627b.m16853a(), c7577b1.f41788a, (InterfaceC0113j) c7633z0.f41975f1.get());
                case 62:
                    return (T) new SettingsSelectionViewModel((InterfaceC2020m) c7633z0.f41939Q0.get(), (InterfaceC2012e) c7633z0.f41968d0.get(), (InterfaceC2015h) c7633z0.f41990k1.get(), (InterfaceC2024q) c7633z0.f41969d1.get(), (InterfaceC3275c) c7633z0.f41987j1.get(), (InterfaceC5179a) c7633z0.f41965c0.get(), (InterfaceC5180b) c7633z0.f41985j.get(), C8626a.m16850a(c7633z0.f41958a), (InterfaceC7882z) c7633z0.f41955Y0.get(), C8627b.m16853a(), c7577b1.f41788a, (InterfaceC0113j) c7633z0.f41975f1.get(), (InterfaceC9529c) c7633z0.f41920H1.get());
                case 63:
                    return (T) new StatsShareViewModel((InterfaceC2013f) c7633z0.f42030y.get(), (InterfaceC5179a) c7633z0.f41965c0.get(), C8627b.m16853a(), (InterfaceC0113j) c7633z0.f41975f1.get(), C8626a.m16851b());
                case 64:
                    return (T) new TokenEditViewModel((InterfaceC4865b) c7633z0.f42029x1.get());
                case 65:
                    return (T) new TokenViewModel((InterfaceC2008a) c7633z0.f41906D.get(), (InterfaceC2026s) c7633z0.f41945T0.get(), (InterfaceC2023p) c7633z0.f42026w1.get(), (InterfaceC2011d) c7633z0.f41952X.get(), (InterfaceC2015h) c7633z0.f41990k1.get(), (InterfaceC2012e) c7633z0.f41968d0.get(), (InterfaceC2024q) c7633z0.f41969d1.get(), (InterfaceC0113j) c7633z0.f41975f1.get(), (InterfaceC4865b) c7633z0.f42029x1.get(), (InterfaceC4912b) c7633z0.f41999n1.get(), (InterfaceC7366c) c7633z0.f41899A1.get(), (C6704a) c7633z0.f41951W0.get(), (InterfaceC5179a) c7633z0.f41965c0.get(), (InterfaceC5182d) c7633z0.f42009r.get(), C8627b.m16853a(), (InterfaceC7882z) c7633z0.f41955Y0.get(), c7577b1.f41788a);
                case 66:
                    return (T) new UpgradeGoPremiumViewModel((InterfaceC0113j) c7633z0.f41975f1.get(), (InterfaceC6515k) c7633z0.f41993l1.get(), c7577b1.f41788a);
                case 67:
                    return (T) new UserImportAddCourseViewModel(C8627b.m16853a(), c7577b1.f41788a, (InterfaceC5547h) c7633z0.f41923I1.get());
                case 68:
                    return (T) new UserImportParentViewModel((InterfaceC5547h) c7633z0.f41923I1.get(), (InterfaceC0113j) c7633z0.f41975f1.get());
                case 69:
                    return (T) new UserImportSelectionViewModel(C8626a.m16850a(c7633z0.f41958a), (InterfaceC2010c) c7633z0.f41934O.get(), C8627b.m16853a(), (InterfaceC5547h) c7633z0.f41923I1.get(), (InterfaceC0113j) c7633z0.f41975f1.get(), c7577b1.f41788a);
                case 70:
                    return (T) new UserImportTextViewModel((InterfaceC5547h) c7633z0.f41923I1.get(), (InterfaceC0113j) c7633z0.f41975f1.get(), c7577b1.f41788a);
                case 71:
                    return (T) new UserImportViewModel((InterfaceC3324a) c7633z0.f41998n0.get(), (InterfaceC5180b) c7633z0.f41985j.get(), (InterfaceC5547h) c7633z0.f41923I1.get(), (C7796d) c7633z0.f42012s.get(), (InterfaceC6515k) c7633z0.f41993l1.get(), (InterfaceC0113j) c7633z0.f41975f1.get(), c7577b1.f41788a);
                case 72:
                    return (T) new VocabularyAddViewModel((InterfaceC2026s) c7633z0.f41945T0.get(), (InterfaceC0113j) c7633z0.f41975f1.get(), C8627b.m16853a(), c7577b1.f41788a);
                case 73:
                    return (T) new VocabularyFilterSelectionViewModel((InterfaceC5182d) c7633z0.f42009r.get(), (InterfaceC2010c) c7633z0.f41934O.get(), (InterfaceC3324a) c7633z0.f41998n0.get(), (InterfaceC2012e) c7633z0.f41968d0.get(), (InterfaceC2014g) c7633z0.f41953X0.get(), C8627b.m16853a(), (InterfaceC0113j) c7633z0.f41975f1.get(), c7577b1.f41788a);
                case 74:
                    return (T) new VocabularyFilterViewModel((InterfaceC5182d) c7633z0.f42009r.get(), (InterfaceC0113j) c7633z0.f41975f1.get());
                case 75:
                    return (T) new VocabularyParentFilterViewModel(new C5416g(), c7577b1.f41788a);
                case 76:
                    return (T) new VocabularyViewModel((InterfaceC2008a) c7633z0.f41906D.get(), (InterfaceC2025r) c7633z0.f41908D1.get(), new C5416g(), (InterfaceC4865b) c7633z0.f42029x1.get(), (InterfaceC0113j) c7633z0.f41975f1.get(), C8626a.m16851b(), (InterfaceC5182d) c7633z0.f42009r.get(), (C7797e) c7633z0.f41988k.get(), C8627b.m16853a(), c7577b1.f41788a);
                default:
                    throw new AssertionError(i10);
            }
        }
    }

    public C7577b1(C7633z0 c7633z0, C7581d c7581d, C1024c0 c1024c0) {
        this.f41788a = c1024c0;
        this.f41790b = new a(c7633z0, this, 0);
        this.f41792c = new a(c7633z0, this, 1);
        this.f41794d = new a(c7633z0, this, 2);
        this.f41796e = new a(c7633z0, this, 3);
        this.f41798f = new a(c7633z0, this, 4);
        this.f41800g = new a(c7633z0, this, 5);
        this.f41802h = new a(c7633z0, this, 6);
        this.f41804i = new a(c7633z0, this, 7);
        this.f41806j = new a(c7633z0, this, 8);
        this.f41808k = new a(c7633z0, this, 9);
        this.f41810l = new a(c7633z0, this, 10);
        this.f41812m = new a(c7633z0, this, 11);
        this.f41814n = new a(c7633z0, this, 12);
        this.f41816o = new a(c7633z0, this, 13);
        this.f41818p = new a(c7633z0, this, 14);
        this.f41820q = new a(c7633z0, this, 15);
        this.f41822r = new a(c7633z0, this, 16);
        this.f41824s = new a(c7633z0, this, 17);
        this.f41826t = new a(c7633z0, this, 18);
        this.f41828u = new a(c7633z0, this, 19);
        this.f41830v = new a(c7633z0, this, 20);
        this.f41832w = new a(c7633z0, this, 21);
        this.f41834x = new a(c7633z0, this, 22);
        this.f41836y = new a(c7633z0, this, 23);
        this.f41838z = new a(c7633z0, this, 24);
        this.f41762A = new a(c7633z0, this, 25);
        this.f41763B = new a(c7633z0, this, 26);
        this.f41764C = new a(c7633z0, this, 27);
        this.f41765D = new a(c7633z0, this, 28);
        this.f41766E = new a(c7633z0, this, 29);
        this.f41767F = new a(c7633z0, this, 30);
        this.f41768G = new a(c7633z0, this, 31);
        this.f41769H = new a(c7633z0, this, 32);
        this.f41770I = new a(c7633z0, this, 33);
        this.f41771J = new a(c7633z0, this, 34);
        this.f41772K = new a(c7633z0, this, 35);
        this.f41773L = new a(c7633z0, this, 36);
        this.f41774M = new a(c7633z0, this, 37);
        this.f41775N = new a(c7633z0, this, 38);
        this.f41776O = new a(c7633z0, this, 39);
        this.f41777P = new a(c7633z0, this, 40);
        this.f41778Q = new a(c7633z0, this, 41);
        this.f41779R = new a(c7633z0, this, 42);
        this.f41780S = new a(c7633z0, this, 43);
        this.f41781T = new a(c7633z0, this, 44);
        this.f41782U = new a(c7633z0, this, 45);
        this.f41783V = new a(c7633z0, this, 46);
        this.f41784W = new a(c7633z0, this, 47);
        this.f41785X = new a(c7633z0, this, 48);
        this.f41786Y = new a(c7633z0, this, 49);
        this.f41787Z = new a(c7633z0, this, 50);
        this.f41789a0 = new a(c7633z0, this, 51);
        this.f41791b0 = new a(c7633z0, this, 52);
        this.f41793c0 = new a(c7633z0, this, 53);
        this.f41795d0 = new a(c7633z0, this, 54);
        this.f41797e0 = new a(c7633z0, this, 55);
        this.f41799f0 = new a(c7633z0, this, 56);
        this.f41801g0 = new a(c7633z0, this, 57);
        this.f41803h0 = new a(c7633z0, this, 58);
        this.f41805i0 = new a(c7633z0, this, 59);
        this.f41807j0 = new a(c7633z0, this, 60);
        this.f41809k0 = new a(c7633z0, this, 61);
        this.f41811l0 = new a(c7633z0, this, 62);
        this.f41813m0 = new a(c7633z0, this, 63);
        this.f41815n0 = new a(c7633z0, this, 64);
        this.f41817o0 = new a(c7633z0, this, 65);
        this.f41819p0 = new a(c7633z0, this, 66);
        this.f41821q0 = new a(c7633z0, this, 67);
        this.f41823r0 = new a(c7633z0, this, 68);
        this.f41825s0 = new a(c7633z0, this, 69);
        this.f41827t0 = new a(c7633z0, this, 70);
        this.f41829u0 = new a(c7633z0, this, 71);
        this.f41831v0 = new a(c7633z0, this, 72);
        this.f41833w0 = new a(c7633z0, this, 73);
        this.f41835x0 = new a(c7633z0, this, 74);
        this.f41837y0 = new a(c7633z0, this, 75);
        this.f41839z0 = new a(c7633z0, this, 76);
    }

    @Override // ml.C7636c.b
    /* JADX INFO: renamed from: a */
    public final Map<String, InterfaceC8825a<AbstractC1036h0>> mo15086a() {
        C0987y.m3820b("expectedSize", 77);
        ImmutableMap.C3148a c3148a = new ImmutableMap.C3148a(77);
        c3148a.m9076b("com.lingq.ui.session.AuthenticationViewModel", this.f41790b);
        c3148a.m9076b("com.lingq.ui.home.challenges.ChallengeDetailsViewModel", this.f41792c);
        c3148a.m9076b("com.lingq.ui.home.challenges.ChallengeMonthlyPromptViewModel", this.f41794d);
        c3148a.m9076b("com.lingq.ui.home.challenges.ChallengeShareViewModel", this.f41796e);
        c3148a.m9076b("com.lingq.ui.home.challenges.ChallengesViewModel", this.f41798f);
        c3148a.m9076b("com.lingq.ui.session.magiclink.CheckEmailViewModel", this.f41800g);
        c3148a.m9076b("com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionViewModel", this.f41802h);
        c3148a.m9076b("com.lingq.ui.home.collections.filter.CollectionsSearchFilterViewModel", this.f41804i);
        c3148a.m9076b("com.lingq.ui.home.collections.filter.CollectionsSearchParentFilterViewModel", this.f41806j);
        c3148a.m9076b("com.lingq.ui.home.collections.CollectionsViewModel", this.f41808k);
        c3148a.m9076b("com.lingq.ui.home.course.CoursePlaylistViewModel", this.f41810l);
        c3148a.m9076b("com.lingq.ui.home.course.CourseViewModel", this.f41812m);
        c3148a.m9076b("com.lingq.ui.goals.DailyGoalCoinsTutorialViewModel", this.f41814n);
        c3148a.m9076b("com.lingq.ui.goals.DailyGoalMetViewModel", this.f41816o);
        c3148a.m9076b("com.lingq.ui.review.settings.DataStoreReviewSettingsViewModel", this.f41818p);
        c3148a.m9076b("com.lingq.ui.settings.DataStoreSettingsViewModel", this.f41820q);
        c3148a.m9076b("com.lingq.ui.lesson.menu.DatastoreLessonSettingsViewModel", this.f41822r);
        c3148a.m9076b("com.lingq.ui.token.dictionaries.DictionariesLocaleViewModel", this.f41824s);
        c3148a.m9076b("com.lingq.ui.token.dictionaries.DictionariesManageViewModel", this.f41826t);
        c3148a.m9076b("com.lingq.ui.session.magiclink.EmailLoginViewModel", this.f41828u);
        c3148a.m9076b("com.lingq.ui.home.HomeViewModel", this.f41830v);
        c3148a.m9076b("com.lingq.ui.goals.InstagramShareViewModel", this.f41832w);
        c3148a.m9076b("com.lingq.ui.home.menu.InviteFriendsViewModel", this.f41834x);
        c3148a.m9076b("com.lingq.ui.home.language.stats.LanguageProgressUpdateViewModel", this.f41836y);
        c3148a.m9076b("com.lingq.ui.home.language.LanguageSelectorViewModel", this.f41838z);
        c3148a.m9076b("com.lingq.ui.home.language.stats.LanguageStatsViewModel", this.f41762A);
        c3148a.m9076b("com.lingq.ui.lesson.stats.LessonCompleteViewModel", this.f41763B);
        c3148a.m9076b("com.lingq.ui.lesson.tutorial.LessonDealWithWordsViewModel", this.f41764C);
        c3148a.m9076b("com.lingq.ui.lesson.edit.LessonEditParentViewModel", this.f41765D);
        c3148a.m9076b("com.lingq.ui.lesson.edit.LessonEditSentencesViewModel", this.f41766E);
        c3148a.m9076b("com.lingq.ui.lesson.tutorial.LessonFirstLingQCongratsViewModel", this.f41767F);
        c3148a.m9076b("com.lingq.ui.info.LessonInfoViewModel", this.f41768G);
        c3148a.m9076b("com.lingq.ui.lesson.page.LessonPageViewModel", this.f41769H);
        c3148a.m9076b("com.lingq.ui.home.library.LessonPreviewViewModel", this.f41770I);
        c3148a.m9076b("com.lingq.ui.lesson.menu.LessonReviewMenuViewModel", this.f41771J);
        c3148a.m9076b("com.lingq.ui.lesson.LessonViewModel", this.f41772K);
        c3148a.m9076b("com.lingq.ui.lesson.vocabulary.LessonVocabularyPageViewModel", this.f41773L);
        c3148a.m9076b("com.lingq.ui.lesson.vocabulary.LessonVocabularyViewModel", this.f41774M);
        c3148a.m9076b("com.lingq.ui.home.library.LibraryViewModel", this.f41775N);
        c3148a.m9076b("com.lingq.ui.upgrade.LingQsOfferViewModel", this.f41776O);
        c3148a.m9076b("com.lingq.ui.lesson.player.ListeningModeViewModel", this.f41777P);
        c3148a.m9076b("com.lingq.ui.MainViewModel", this.f41778Q);
        c3148a.m9076b("com.lingq.ui.home.menu.MoreViewModel", this.f41779R);
        c3148a.m9076b("com.lingq.ui.home.notifications.NotificationsDailyLingQViewModel", this.f41780S);
        c3148a.m9076b("com.lingq.ui.home.notifications.NotificationsDailyLingqSelectionViewModel", this.f41781T);
        c3148a.m9076b("com.lingq.ui.home.notifications.NotificationsSettingsParentViewModel", this.f41782U);
        c3148a.m9076b("com.lingq.ui.home.notifications.NotificationsSettingsViewModel", this.f41783V);
        c3148a.m9076b("com.lingq.ui.home.notifications.NotificationsViewModel", this.f41784W);
        c3148a.m9076b("com.lingq.ui.home.playlist.PlaylistAddViewModel", this.f41785X);
        c3148a.m9076b("com.lingq.ui.home.playlist.PlaylistViewModel", this.f41786Y);
        c3148a.m9076b("com.lingq.ui.home.playlist.PlaylistsViewModel", this.f41787Z);
        c3148a.m9076b("com.lingq.ui.home.library.RepairStreakViewModel", this.f41789a0);
        c3148a.m9076b("com.lingq.ui.review.activities.ReviewActivityMatchingViewModel", this.f41791b0);
        c3148a.m9076b("com.lingq.ui.review.activities.ReviewActivitySpeakingViewModel", this.f41793c0);
        c3148a.m9076b("com.lingq.ui.review.activities.ReviewActivityUnscrambleViewModel", this.f41795d0);
        c3148a.m9076b("com.lingq.ui.review.activities.ReviewActivityViewModel", this.f41797e0);
        c3148a.m9076b("com.lingq.ui.review.ReviewSessionCompleteViewModel", this.f41799f0);
        c3148a.m9076b("com.lingq.ui.review.ReviewViewModel", this.f41801g0);
        c3148a.m9076b("com.lingq.ui.home.search.SearchViewModel", this.f41803h0);
        c3148a.m9076b("com.lingq.ui.lesson.edit.SentenceEditPageViewModel", this.f41805i0);
        c3148a.m9076b("com.lingq.ui.lesson.edit.SentenceEditPagerViewModel", this.f41807j0);
        c3148a.m9076b("com.lingq.ui.settings.SettingsEditViewModel", this.f41809k0);
        c3148a.m9076b("com.lingq.ui.settings.SettingsSelectionViewModel", this.f41811l0);
        c3148a.m9076b("com.lingq.ui.home.language.stats.StatsShareViewModel", this.f41813m0);
        c3148a.m9076b("com.lingq.ui.token.TokenEditViewModel", this.f41815n0);
        c3148a.m9076b("com.lingq.ui.token.TokenViewModel", this.f41817o0);
        c3148a.m9076b("com.lingq.ui.upgrade.UpgradeGoPremiumViewModel", this.f41819p0);
        c3148a.m9076b("com.lingq.ui.imports.userImport.UserImportAddCourseViewModel", this.f41821q0);
        c3148a.m9076b("com.lingq.ui.imports.userImport.UserImportParentViewModel", this.f41823r0);
        c3148a.m9076b("com.lingq.ui.imports.userImport.UserImportSelectionViewModel", this.f41825s0);
        c3148a.m9076b("com.lingq.ui.imports.userImport.UserImportTextViewModel", this.f41827t0);
        c3148a.m9076b("com.lingq.ui.imports.userImport.UserImportViewModel", this.f41829u0);
        c3148a.m9076b("com.lingq.ui.home.vocabulary.VocabularyAddViewModel", this.f41831v0);
        c3148a.m9076b("com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionViewModel", this.f41833w0);
        c3148a.m9076b("com.lingq.ui.home.vocabulary.filter.VocabularyFilterViewModel", this.f41835x0);
        c3148a.m9076b("com.lingq.ui.home.vocabulary.filter.VocabularyParentFilterViewModel", this.f41837y0);
        c3148a.m9076b("com.lingq.ui.home.vocabulary.VocabularyViewModel", this.f41839z0);
        return c3148a.m9075a();
    }
}
