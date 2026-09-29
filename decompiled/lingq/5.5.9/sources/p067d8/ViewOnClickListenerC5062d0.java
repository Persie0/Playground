package p067d8;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.InterfaceC2532v;
import com.google.android.exoplayer2.p051ui.C2517d;
import com.lingq.commons.p053ui.views.PagesIndicator;
import com.lingq.p055ui.goals.DailyGoalCoinsTutorialFragment;
import com.lingq.p055ui.goals.InstagramShareFragment;
import com.lingq.p055ui.home.collections.filter.CollectionsSearchFilterSelectionFragment;
import com.lingq.p055ui.home.collections.filter.CollectionsSearchParentFilterViewModel;
import com.lingq.p055ui.home.library.AbstractC3813g;
import com.lingq.p055ui.home.library.LessonPreviewFragment;
import com.lingq.p055ui.home.library.LibraryFragment;
import com.lingq.p055ui.home.menu.InviteFriendsFragment;
import com.lingq.p055ui.home.vocabulary.VocabularyFragment;
import com.lingq.p055ui.lesson.ReviewType;
import com.lingq.p055ui.lesson.menu.LessonReviewMenuFragment;
import com.lingq.p055ui.lesson.player.LessonPlayerView;
import com.lingq.p055ui.lesson.tutorial.LessonDealWithWordsFragment;
import com.lingq.p055ui.onboarding.OnboardingDailyGoalFragment;
import com.lingq.p055ui.onboarding.OnboardingLevelFragment;
import com.lingq.p055ui.onboarding.OnboardingTopicsFragment;
import com.lingq.p055ui.review.views.speaking.AudioMatchView;
import com.lingq.p055ui.session.RegisterFragment;
import com.lingq.p055ui.session.magiclink.CheckEmailFragment;
import com.lingq.p055ui.session.magiclink.EmailLoginFragment;
import com.lingq.p055ui.settings.DataStoreSettingsFragment;
import com.lingq.p055ui.token.TokenFragment;
import com.linguist.R;
import dm.C5207g;
import java.util.Set;
import km.InterfaceC6727j;
import ni.C7796d;
import p138gk.C5817g;
import p240ld.C7304d;
import p338qd.C8573r0;
import p479xa.C10134c0;
import p513yj.InterfaceC10407i;
import sh.InterfaceC9008d;
import sj.C9050i;
import tj.C9296f;
import ua.C9508q;

/* JADX INFO: renamed from: d8.d0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC5062d0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f32916a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f32917b;

    public /* synthetic */ ViewOnClickListenerC5062d0(int i10, Object obj) {
        this.f32916a = i10;
        this.f32917b = obj;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f32916a;
        Object obj = this.f32917b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                DialogC5064e0 dialogC5064e0 = (DialogC5064e0) obj;
                C5207g.m11111f(dialogC5064e0, "this$0");
                dialogC5064e0.cancel();
                return;
            case 1:
                C2517d c2517d = C2517d.this;
                InterfaceC2532v interfaceC2532v = c2517d.f13573C0;
                if (interfaceC2532v != null) {
                    if (!interfaceC2532v.isCommandAvailable(29)) {
                        return;
                    }
                    C9508q trackSelectionParameters = c2517d.f13573C0.getTrackSelectionParameters();
                    InterfaceC2532v interfaceC2532v2 = c2517d.f13573C0;
                    int i11 = C10134c0.f51354a;
                    interfaceC2532v2.setTrackSelectionParameters(trackSelectionParameters.mo17949a().mo17951b(1).mo17954g(1).mo17950a());
                    c2517d.f13615f.f13655e[1] = c2517d.getResources().getString(R.string.exo_track_selection_auto);
                    c2517d.f13625k.dismiss();
                }
                return;
            case 2:
                C7304d c7304d = (C7304d) obj;
                EditText editText = c7304d.f40922i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                c7304d.m14716q();
                return;
            case 3:
                PagesIndicator pagesIndicator = (PagesIndicator) obj;
                int i12 = PagesIndicator.f16758L;
                C5207g.m11111f(pagesIndicator, "this$0");
                PagesIndicator.InterfaceC3279a interfaceC3279a = pagesIndicator.f16760K;
                if (interfaceC3279a != null) {
                    interfaceC3279a.mo9359b(false);
                    return;
                }
                return;
            case 4:
                DailyGoalCoinsTutorialFragment dailyGoalCoinsTutorialFragment = (DailyGoalCoinsTutorialFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr = DailyGoalCoinsTutorialFragment.f22489E0;
                C5207g.m11111f(dailyGoalCoinsTutorialFragment, "this$0");
                dailyGoalCoinsTutorialFragment.m3579b0().m3594l().m3627S();
                return;
            case 5:
                InstagramShareFragment instagramShareFragment = (InstagramShareFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = InstagramShareFragment.f22618V0;
                C5207g.m11111f(instagramShareFragment, "this$0");
                instagramShareFragment.m3767n0(false, false);
                return;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                CollectionsSearchFilterSelectionFragment collectionsSearchFilterSelectionFragment = (CollectionsSearchFilterSelectionFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr3 = CollectionsSearchFilterSelectionFragment.f23490D0;
                C5207g.m11111f(collectionsSearchFilterSelectionFragment, "this$0");
                ((CollectionsSearchParentFilterViewModel) collectionsSearchFilterSelectionFragment.f23493C0.getValue()).mo9842u1();
                return;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                LessonPreviewFragment.m9929n0((LessonPreviewFragment) obj);
                return;
            case 8:
                LibraryFragment libraryFragment = (LibraryFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr4 = LibraryFragment.f24638G0;
                C5207g.m11111f(libraryFragment, "this$0");
                libraryFragment.m9938s0().m9945q2(AbstractC3813g.e.f25031c);
                return;
            case 9:
                InviteFriendsFragment.m9958u0((InviteFriendsFragment) obj);
                return;
            case 10:
                VocabularyFragment vocabularyFragment = (VocabularyFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr5 = VocabularyFragment.f26133G0;
                C5207g.m11111f(vocabularyFragment, "this$0");
                vocabularyFragment.m10022q0().m10059p2();
                return;
            case 11:
                LessonReviewMenuFragment lessonReviewMenuFragment = (LessonReviewMenuFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr6 = LessonReviewMenuFragment.f28270D0;
                C5207g.m11111f(lessonReviewMenuFragment, "this$0");
                lessonReviewMenuFragment.m3598r().m3627S();
                lessonReviewMenuFragment.m10185o0().m10138E2(ReviewType.All);
                return;
            case 12:
                LessonPlayerView lessonPlayerView = (LessonPlayerView) obj;
                int i13 = LessonPlayerView.f28726c;
                C5207g.m11111f(lessonPlayerView, "this$0");
                InterfaceC9008d interfaceC9008d = lessonPlayerView.f28728b;
                if (interfaceC9008d != null) {
                    interfaceC9008d.mo9866d();
                }
                return;
            case 13:
                LessonDealWithWordsFragment lessonDealWithWordsFragment = (LessonDealWithWordsFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr7 = LessonDealWithWordsFragment.f29086F0;
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
            case 14:
                OnboardingDailyGoalFragment onboardingDailyGoalFragment = (OnboardingDailyGoalFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr8 = OnboardingDailyGoalFragment.f29358D0;
                C5207g.m11111f(onboardingDailyGoalFragment, "this$0");
                C8573r0.m16725g0(onboardingDailyGoalFragment).m3995p();
                return;
            case 15:
                OnboardingLevelFragment onboardingLevelFragment = (OnboardingLevelFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr9 = OnboardingLevelFragment.f29413D0;
                C5207g.m11111f(onboardingLevelFragment, "this$0");
                C8573r0.m16725g0(onboardingLevelFragment).m3995p();
                return;
            case 16:
                OnboardingTopicsFragment onboardingTopicsFragment = (OnboardingTopicsFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr10 = OnboardingTopicsFragment.f29419D0;
                C5207g.m11111f(onboardingTopicsFragment, "this$0");
                String str = C9050i.f47331a;
                C9296f c9296f = onboardingTopicsFragment.f29421B0;
                if (c9296f == null) {
                    C5207g.m11117l("adapter");
                    throw null;
                }
                Set<String> set = c9296f.f48018f;
                C5207g.m11111f(set, "<set-?>");
                C9050i.f47334d = set;
                NavController navControllerM16725g0 = C8573r0.m16725g0(onboardingTopicsFragment);
                Bundle bundle = new Bundle();
                NavDestination navDestinationM3986g = navControllerM16725g0.m3986g();
                if (navDestinationM3986g != null && navDestinationM3986g.m4016i(R.id.actionToOnboardingRegister) != null) {
                    navControllerM16725g0.m3992m(R.id.actionToOnboardingRegister, bundle, null);
                }
                return;
            case 17:
                AudioMatchView audioMatchView = (AudioMatchView) obj;
                int i14 = AudioMatchView.f30453N;
                C5207g.m11111f(audioMatchView, "this$0");
                InterfaceC10407i interfaceC10407i = audioMatchView.f30455M;
                if (interfaceC10407i != null) {
                    interfaceC10407i.mo10284c();
                }
                return;
            case 18:
                RegisterFragment registerFragment = (RegisterFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr11 = RegisterFragment.f30733J0;
                C5207g.m11111f(registerFragment, "this$0");
                C7796d c7796d2 = registerFragment.f30742I0;
                if (c7796d2 == null) {
                    C5207g.m11117l("analytics");
                    throw null;
                }
                c7796d2.m15505b(null, "Registration changed to login");
                NavController navControllerM16725g1 = C8573r0.m16725g0(registerFragment);
                NavDestination navDestinationM3986g2 = navControllerM16725g1.m3986g();
                if (navDestinationM3986g2 == null || navDestinationM3986g2.m4016i(R.id.actionToSignIn) == null) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("authCode", "");
                navControllerM16725g1.m3992m(R.id.actionToSignIn, bundle2, null);
                return;
            case 19:
                CheckEmailFragment.m10344n0((CheckEmailFragment) obj);
                return;
            case 20:
                EmailLoginFragment emailLoginFragment = (EmailLoginFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr12 = EmailLoginFragment.f30886C0;
                C5207g.m11111f(emailLoginFragment, "this$0");
                C8573r0.m16725g0(emailLoginFragment).m3995p();
                return;
            case 21:
                DataStoreSettingsFragment dataStoreSettingsFragment = (DataStoreSettingsFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr13 = DataStoreSettingsFragment.f30933F0;
                C5207g.m11111f(dataStoreSettingsFragment, "this$0");
                C8573r0.m16725g0(dataStoreSettingsFragment).m3995p();
                return;
            case 22:
                TokenFragment tokenFragment = (TokenFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr14 = TokenFragment.f31202R0;
                C5207g.m11111f(tokenFragment, "this$0");
                tokenFragment.m10363o0().f31399B0.mo14371k(Boolean.TRUE);
                return;
            default:
                C5817g c5817g = (C5817g) obj;
                C5207g.m11111f(c5817g, "this$0");
                c5817g.f35117f.mo10366a();
                return;
        }
    }
}
