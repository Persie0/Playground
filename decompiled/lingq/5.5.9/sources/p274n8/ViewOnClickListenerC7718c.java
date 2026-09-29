package p274n8;

import android.os.Build;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.AbstractC0986x;
import androidx.fragment.app.C0964m;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.login.DeviceAuthDialog;
import com.facebook.login.widget.ToolTipPopup;
import com.google.android.exoplayer2.InterfaceC2532v;
import com.google.android.exoplayer2.p051ui.C2517d;
import com.google.android.material.button.MaterialButton;
import com.lingq.commons.p053ui.views.NumberStepper;
import com.lingq.p055ui.goals.InstagramShareFragment;
import com.lingq.p055ui.goals.InstagramShareViewModel;
import com.lingq.p055ui.home.HomeViewModel;
import com.lingq.p055ui.home.challenges.ChallengeDetailAdapter;
import com.lingq.p055ui.home.challenges.ChallengeDetailsFragment;
import com.lingq.p055ui.home.challenges.ChallengeShareFragment;
import com.lingq.p055ui.home.challenges.ChallengeShareViewModel;
import com.lingq.p055ui.home.challenges.ChallengesMonthlyPromptFragment;
import com.lingq.p055ui.home.collections.CollectionsFragment;
import com.lingq.p055ui.home.language.LanguageSelectorFragment;
import com.lingq.p055ui.home.library.CollectionsAdapter;
import com.lingq.p055ui.home.library.LessonPreviewFragment;
import com.lingq.p055ui.home.menu.InviteFriendsFragment;
import com.lingq.p055ui.home.notifications.NotificationsDailyLingqSelectionFragment;
import com.lingq.p055ui.home.notifications.NotificationsSettingsFragment;
import com.lingq.p055ui.home.notifications.NotificationsSettingsParentViewModel;
import com.lingq.p055ui.home.playlist.PlaylistAdapter;
import com.lingq.p055ui.home.playlist.PlaylistPlayerView;
import com.lingq.p055ui.home.playlist.PlaylistsAdapter;
import com.lingq.p055ui.home.vocabulary.VocabularyAdapter;
import com.lingq.p055ui.home.vocabulary.VocabularyFragment;
import com.lingq.p055ui.home.vocabulary.filter.VocabularyFilterSelectionFragment;
import com.lingq.p055ui.home.vocabulary.filter.VocabularyFilterSelectionViewModel;
import com.lingq.p055ui.lesson.ReviewType;
import com.lingq.p055ui.lesson.menu.LessonReviewMenuFragment;
import com.lingq.p055ui.lesson.stats.LessonCompleteFragment;
import com.lingq.p055ui.lesson.tutorial.LessonDealWithWordsFragment;
import com.lingq.p055ui.onboarding.OnboardingTopicsFragment;
import com.lingq.p055ui.review.ReviewFragment;
import com.lingq.p055ui.review.views.speaking.AudioMatchView;
import com.lingq.p055ui.session.DialogInterfaceOnClickListenerC4749a;
import com.lingq.p055ui.session.LoginFragment;
import com.lingq.p055ui.upgrade.UpgradeReason;
import com.lingq.shared.uimodel.challenge.ChallengeDetail;
import com.lingq.shared.uimodel.challenge.ChallengeSocialSettings;
import com.lingq.shared.uimodel.challenge.ChallengeSocialSettingsType;
import com.lingq.shared.uimodel.vocabulary.VocabularySearchQuery;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import dm.C5212l;
import java.util.Collection;
import km.InterfaceC6727j;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.StateFlowImpl;
import ni.C7796d;
import p173i8.C6205a;
import p240ld.C7320t;
import p254m2.C7472a;
import p338qd.C8573r0;
import p343qi.DialogInterfaceOnClickListenerC8634f;
import p513yj.InterfaceC10407i;
import ph.C8352r2;
import sh.InterfaceC9008d;
import tc.C9249b;

/* JADX INFO: renamed from: n8.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC7718c implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42251a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f42252b;

    public /* synthetic */ ViewOnClickListenerC7718c(int i10, Object obj) {
        this.f42251a = i10;
        this.f42252b = obj;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        ChallengeSocialSettingsType challengeSocialSettingsType;
        int i10 = this.f42251a;
        int i11 = 0;
        Object obj = this.f42252b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                DeviceAuthDialog deviceAuthDialog = (DeviceAuthDialog) obj;
                int i12 = DeviceAuthDialog.f11572W0;
                C5207g.m11111f(deviceAuthDialog, "this$0");
                deviceAuthDialog.m6695x0();
                return;
            case 1:
                ToolTipPopup toolTipPopup = (ToolTipPopup) obj;
                if (C6205a.m12742b(ToolTipPopup.class)) {
                    return;
                }
                try {
                    C5207g.m11111f(toolTipPopup, "this$0");
                    toolTipPopup.m6743a();
                    return;
                } catch (Throwable th2) {
                    C6205a.m12741a(ToolTipPopup.class, th2);
                    return;
                }
            case 2:
                C2517d c2517d = C2517d.this;
                InterfaceC2532v interfaceC2532v = c2517d.f13573C0;
                if (interfaceC2532v != null && interfaceC2532v.isCommandAvailable(29)) {
                    c2517d.f13573C0.setTrackSelectionParameters(c2517d.f13573C0.getTrackSelectionParameters().mo17949a().mo17951b(3).mo17952e().mo17950a());
                    c2517d.f13625k.dismiss();
                }
                return;
            case 3:
                C7320t c7320t = (C7320t) obj;
                EditText editText = c7320t.f41001f;
                if (editText == null) {
                    return;
                }
                int selectionEnd = editText.getSelectionEnd();
                EditText editText2 = c7320t.f41001f;
                if (editText2 != null && (editText2.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    i11 = 1;
                }
                if (i11 != 0) {
                    c7320t.f41001f.setTransformationMethod(null);
                } else {
                    c7320t.f41001f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    c7320t.f41001f.setSelection(selectionEnd);
                }
                c7320t.m14716q();
                return;
            case 4:
                NumberStepper numberStepper = (NumberStepper) obj;
                int i13 = NumberStepper.f16752f;
                C5207g.m11111f(numberStepper, "this$0");
                int i14 = numberStepper.f16755c;
                int i15 = numberStepper.f16756d;
                int i16 = i14 - i15;
                numberStepper.f16755c = i16;
                if (i16 < 0) {
                    numberStepper.f16755c = 0;
                }
                NumberStepper.InterfaceC3278a interfaceC3278a = numberStepper.f16754b;
                if (interfaceC3278a != null) {
                    interfaceC3278a.mo9357a(-i15);
                }
                numberStepper.m9356a();
                return;
            case 5:
                InstagramShareFragment instagramShareFragment = (InstagramShareFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr = InstagramShareFragment.f22618V0;
                C5207g.m11111f(instagramShareFragment, "this$0");
                if (Build.VERSION.SDK_INT >= 29) {
                    InstagramShareViewModel instagramShareViewModelM9764v0 = instagramShareFragment.m9764v0();
                    instagramShareViewModelM9764v0.f22651g.mo14371k(instagramShareViewModelM9764v0.f22648d);
                    return;
                }
                if (C7472a.m14841a(instagramShareFragment.m3578a0(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                    InstagramShareViewModel instagramShareViewModelM9764v1 = instagramShareFragment.m9764v0();
                    instagramShareViewModelM9764v1.f22651g.mo14371k(instagramShareViewModelM9764v1.f22648d);
                    return;
                }
                AbstractC0986x<?> abstractC0986x = instagramShareFragment.f6078P;
                if (!(abstractC0986x != null ? abstractC0986x.mo3810n0("android.permission.WRITE_EXTERNAL_STORAGE") : false)) {
                    C0964m c0964m = instagramShareFragment.f22623U0;
                    if (c0964m != null) {
                        c0964m.mo844a("android.permission.WRITE_EXTERNAL_STORAGE");
                        return;
                    } else {
                        C5207g.m11117l("requestPermissionLauncher");
                        throw null;
                    }
                }
                C9249b c9249b = new C9249b(instagramShareFragment.m3578a0());
                c9249b.setTitle(instagramShareFragment.m3600t(R.string.share_image_permission_title));
                c9249b.f599a.f579f = instagramShareFragment.m3600t(R.string.share_image_permission_desc);
                c9249b.m17612e(instagramShareFragment.m3600t(R.string.ui_ok), new DialogInterfaceOnClickListenerC8634f(i11, instagramShareFragment));
                c9249b.m17610c(instagramShareFragment.m3600t(R.string.ui_cancel), null);
                c9249b.m876a();
                return;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                ChallengeDetailAdapter.AbstractC3481a abstractC3481a = (ChallengeDetailAdapter.AbstractC3481a) obj;
                C5207g.m11111f(abstractC3481a, "$holder");
                C8352r2 c8352r2 = ((ChallengeDetailAdapter.AbstractC3481a.a) abstractC3481a).f22836u;
                c8352r2.f45197f.setMaxLines(Integer.MAX_VALUE);
                MaterialButton materialButton = c8352r2.f45193b;
                C5207g.m11110e(materialButton, "holder.binding.btnShowAll");
                C4924a.m10442U(materialButton);
                return;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                ChallengeDetailsFragment.m9782n0((ChallengeDetailsFragment) obj);
                return;
            case 8:
                ChallengeShareFragment challengeShareFragment = (ChallengeShareFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = ChallengeShareFragment.f22987T0;
                C5207g.m11111f(challengeShareFragment, "this$0");
                ChallengeShareViewModel challengeShareViewModelM9790u0 = challengeShareFragment.m9790u0();
                ChallengeDetail challengeDetail = (ChallengeDetail) challengeShareViewModelM9790u0.f23027J.getValue();
                if (challengeDetail != null) {
                    C7138s c7138s = challengeShareViewModelM9790u0.f23036k;
                    ChallengeSocialSettings challengeSocialSettings = challengeDetail.f21645m;
                    if (challengeSocialSettings == null || (challengeSocialSettingsType = challengeSocialSettings.f21654b) == null || (str = challengeSocialSettingsType.f21661a) == null) {
                        str = "";
                    }
                    c7138s.mo14371k(new Pair(challengeDetail.f21642j, str));
                }
                return;
            case 9:
                ChallengesMonthlyPromptFragment challengesMonthlyPromptFragment = (ChallengesMonthlyPromptFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr3 = ChallengesMonthlyPromptFragment.f23080T0;
                C5207g.m11111f(challengesMonthlyPromptFragment, "this$0");
                C4924a.m10447Z(C8573r0.m16725g0(challengesMonthlyPromptFragment), C5212l.m11171o());
                return;
            case 10:
                CollectionsFragment collectionsFragment = (CollectionsFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr4 = CollectionsFragment.f23142F0;
                C5207g.m11111f(collectionsFragment, "this$0");
                C8573r0.m16725g0(collectionsFragment).m3995p();
                return;
            case 11:
                LanguageSelectorFragment languageSelectorFragment = (LanguageSelectorFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr5 = LanguageSelectorFragment.f24170U0;
                C5207g.m11111f(languageSelectorFragment, "this$0");
                C8573r0.m16725g0(languageSelectorFragment).m3995p();
                return;
            case 12:
                CollectionsAdapter collectionsAdapter = (CollectionsAdapter) obj;
                C5207g.m11111f(collectionsAdapter, "this$0");
                collectionsAdapter.f24478f.mo9816p();
                return;
            case 13:
                LessonPreviewFragment lessonPreviewFragment = (LessonPreviewFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr6 = LessonPreviewFragment.f24530D0;
                C5207g.m11111f(lessonPreviewFragment, "this$0");
                C8573r0.m16725g0(lessonPreviewFragment).m3995p();
                return;
            case 14:
                InviteFriendsFragment inviteFriendsFragment = (InviteFriendsFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr7 = InviteFriendsFragment.f25038T0;
                C5207g.m11111f(inviteFriendsFragment, "this$0");
                C8573r0.m16725g0(inviteFriendsFragment).m3995p();
                return;
            case 15:
                NotificationsDailyLingqSelectionFragment notificationsDailyLingqSelectionFragment = (NotificationsDailyLingqSelectionFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr8 = NotificationsDailyLingqSelectionFragment.f25231D0;
                C5207g.m11111f(notificationsDailyLingqSelectionFragment, "this$0");
                ((NotificationsSettingsParentViewModel) notificationsDailyLingqSelectionFragment.f25234C0.getValue()).mo487c0();
                return;
            case 16:
                NotificationsSettingsFragment notificationsSettingsFragment = (NotificationsSettingsFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr9 = NotificationsSettingsFragment.f25327D0;
                C5207g.m11111f(notificationsSettingsFragment, "this$0");
                C8573r0.m16725g0(notificationsSettingsFragment).m3995p();
                return;
            case 17:
                PlaylistAdapter playlistAdapter = (PlaylistAdapter) obj;
                C5207g.m11111f(playlistAdapter, "this$0");
                playlistAdapter.f25399f.mo9880f();
                return;
            case 18:
                PlaylistPlayerView playlistPlayerView = (PlaylistPlayerView) obj;
                int i17 = PlaylistPlayerView.f25566c;
                C5207g.m11111f(playlistPlayerView, "this$0");
                InterfaceC9008d interfaceC9008d = playlistPlayerView.f25568b;
                if (interfaceC9008d != null) {
                    interfaceC9008d.mo9870h();
                    return;
                }
                return;
            case 19:
                PlaylistsAdapter playlistsAdapter = (PlaylistsAdapter) obj;
                C5207g.m11111f(playlistsAdapter, "this$0");
                playlistsAdapter.f25854f.mo10001b();
                return;
            case 20:
                VocabularyAdapter vocabularyAdapter = (VocabularyAdapter) obj;
                C5207g.m11111f(vocabularyAdapter, "this$0");
                VocabularyAdapter.InterfaceC3990d interfaceC3990d = vocabularyAdapter.f26081j;
                if (interfaceC3990d != null) {
                    interfaceC3990d.mo10015a();
                }
                return;
            case 21:
                VocabularyFragment vocabularyFragment = (VocabularyFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr10 = VocabularyFragment.f26133G0;
                C5207g.m11111f(vocabularyFragment, "this$0");
                if (!vocabularyFragment.m10022q0().mo506l1() && !vocabularyFragment.m10022q0().mo502f0()) {
                    ((HomeViewModel) vocabularyFragment.f26136C0.getValue()).mo9771A(UpgradeReason.LIMIT_WORDS);
                    return;
                }
                NavController navControllerM16725g0 = C8573r0.m16725g0(vocabularyFragment);
                Bundle bundle = new Bundle();
                NavDestination navDestinationM3986g = navControllerM16725g0.m3986g();
                if (navDestinationM3986g == null || navDestinationM3986g.m4016i(R.id.actionToAddVocabulary) == null) {
                    return;
                }
                navControllerM16725g0.m3992m(R.id.actionToAddVocabulary, bundle, null);
                return;
            case 22:
                VocabularyFilterSelectionFragment vocabularyFilterSelectionFragment = (VocabularyFilterSelectionFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr11 = VocabularyFilterSelectionFragment.f26380D0;
                C5207g.m11111f(vocabularyFilterSelectionFragment, "this$0");
                VocabularyFilterSelectionViewModel vocabularyFilterSelectionViewModelM10071o0 = vocabularyFilterSelectionFragment.m10071o0();
                EmptyList emptyList = EmptyList.f38032a;
                StateFlowImpl stateFlowImpl = vocabularyFilterSelectionViewModelM10071o0.f26431P;
                stateFlowImpl.setValue(emptyList);
                VocabularySearchQuery vocabularySearchQuery = (VocabularySearchQuery) vocabularyFilterSelectionViewModelM10071o0.f26435T.getValue();
                if (vocabularySearchQuery != null) {
                    vocabularySearchQuery.f22133g = C6752c.m13454v0((Collection) stateFlowImpl.getValue());
                    vocabularyFilterSelectionViewModelM10071o0.m10073m2(vocabularySearchQuery);
                    return;
                }
                return;
            case 23:
                LessonReviewMenuFragment lessonReviewMenuFragment = (LessonReviewMenuFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr12 = LessonReviewMenuFragment.f28270D0;
                C5207g.m11111f(lessonReviewMenuFragment, "this$0");
                lessonReviewMenuFragment.m3598r().m3627S();
                lessonReviewMenuFragment.m10185o0().m10138E2(ReviewType.SrsDue);
                return;
            case 24:
                LessonCompleteFragment lessonCompleteFragment = (LessonCompleteFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr13 = LessonCompleteFragment.f28894G0;
                C5207g.m11111f(lessonCompleteFragment, "this$0");
                NavController navControllerM16725g1 = C8573r0.m16725g0(lessonCompleteFragment);
                Bundle bundle2 = new Bundle();
                NavDestination navDestinationM3986g2 = navControllerM16725g1.m3986g();
                if (navDestinationM3986g2 == null || navDestinationM3986g2.m4016i(R.id.actionToStats) == null) {
                    return;
                }
                navControllerM16725g1.m3992m(R.id.actionToStats, bundle2, null);
                return;
            case 25:
                LessonDealWithWordsFragment lessonDealWithWordsFragment = (LessonDealWithWordsFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr14 = LessonDealWithWordsFragment.f29086F0;
                C5207g.m11111f(lessonDealWithWordsFragment, "this$0");
                C7796d c7796d = lessonDealWithWordsFragment.f29091E0;
                if (c7796d == null) {
                    C5207g.m11117l("analytics");
                    throw null;
                }
                c7796d.m15505b(null, "Go Back");
                if (lessonDealWithWordsFragment.m10226p0().f29150k != -1) {
                    lessonDealWithWordsFragment.m10225o0().f27398G1.mo14371k(Integer.valueOf(lessonDealWithWordsFragment.m10226p0().f29150k));
                }
                lessonDealWithWordsFragment.m3598r().m3627S();
                return;
            case 26:
                OnboardingTopicsFragment onboardingTopicsFragment = (OnboardingTopicsFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr15 = OnboardingTopicsFragment.f29419D0;
                C5207g.m11111f(onboardingTopicsFragment, "this$0");
                C8573r0.m16725g0(onboardingTopicsFragment).m3995p();
                return;
            case 27:
                ReviewFragment reviewFragment = (ReviewFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr16 = ReviewFragment.f29431E0;
                C5207g.m11111f(reviewFragment, "this$0");
                reviewFragment.m10240o0().m10266z2();
                return;
            case 28:
                AudioMatchView audioMatchView = (AudioMatchView) obj;
                int i18 = AudioMatchView.f30453N;
                C5207g.m11111f(audioMatchView, "this$0");
                InterfaceC10407i interfaceC10407i = audioMatchView.f30455M;
                if (interfaceC10407i != null) {
                    interfaceC10407i.mo10283b();
                    return;
                }
                return;
            default:
                LoginFragment loginFragment = (LoginFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr17 = LoginFragment.f30685J0;
                C5207g.m11111f(loginFragment, "this$0");
                C9249b c9249b2 = new C9249b(loginFragment.m3578a0());
                c9249b2.setTitle(loginFragment.m3600t(R.string.welcome_forgot_password));
                View viewInflate = View.inflate(loginFragment.m3578a0(), R.layout.dialog_forgot_password, null);
                c9249b2.setView(viewInflate);
                c9249b2.m17612e(loginFragment.m3600t(R.string.activities_submit_answer), new DialogInterfaceOnClickListenerC4749a(loginFragment, i11, viewInflate));
                c9249b2.m17610c(loginFragment.m3600t(R.string.ui_cancel), null);
                c9249b2.m876a();
                return;
        }
    }
}
