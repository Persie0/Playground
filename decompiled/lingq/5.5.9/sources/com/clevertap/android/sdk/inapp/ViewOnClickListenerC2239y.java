package com.clevertap.android.sdk.inapp;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.AbstractC0986x;
import androidx.fragment.app.C0964m;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.p051ui.C2517d;
import com.lingq.commons.p053ui.UserImportDetailType;
import com.lingq.commons.p053ui.views.NumberStepper;
import com.lingq.commons.p053ui.views.PagesIndicator;
import com.lingq.p055ui.goals.DailyGoalMetFragment;
import com.lingq.p055ui.goals.InstagramShareFragment;
import com.lingq.p055ui.goals.InstagramShareViewModel;
import com.lingq.p055ui.home.HomeViewModel;
import com.lingq.p055ui.home.WebViewFragment;
import com.lingq.p055ui.home.course.CoursePlaylistFragment;
import com.lingq.p055ui.home.language.stats.LanguageProgressUpdateFragment;
import com.lingq.p055ui.home.language.stats.LanguageStatsFragment;
import com.lingq.p055ui.home.library.LibraryAdapter;
import com.lingq.p055ui.home.library.LibraryFragment;
import com.lingq.p055ui.home.library.RepairStreakFragment;
import com.lingq.p055ui.home.notifications.NotificationsFragment;
import com.lingq.p055ui.home.playlist.PlaylistAdapter;
import com.lingq.p055ui.home.vocabulary.filter.VocabularyFilterSelectionFragment;
import com.lingq.p055ui.home.vocabulary.filter.VocabularyParentFilterViewModel;
import com.lingq.p055ui.imports.userImport.C4132a;
import com.lingq.p055ui.imports.userImport.UserImportAddCourse;
import com.lingq.p055ui.imports.userImport.UserImportFragment;
import com.lingq.p055ui.imports.userImport.UserImportSelectionFragment;
import com.lingq.p055ui.info.AbstractC4161d;
import com.lingq.p055ui.info.LessonInfoFragment;
import com.lingq.p055ui.info.LessonInfoViewModel;
import com.lingq.p055ui.lesson.ReviewType;
import com.lingq.p055ui.lesson.edit.LessonEditSentencesFragment;
import com.lingq.p055ui.lesson.edit.SentenceEditPagerFragment;
import com.lingq.p055ui.lesson.menu.LessonReviewMenuFragment;
import com.lingq.p055ui.lesson.player.LessonPlayerView;
import com.lingq.p055ui.lesson.tutorial.LessonFirstLingQCongratsFragment;
import com.lingq.p055ui.onboarding.OnboardingFragment;
import com.lingq.shared.uimodel.library.LessonInfo;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import fj.C5555p;
import km.InterfaceC6727j;
import p240ld.C7312l;
import p338qd.C8573r0;
import sh.InterfaceC9008d;
import va.C9701o;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.y */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC2239y implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11238a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f11239b;

    public /* synthetic */ ViewOnClickListenerC2239y(int i10, Object obj) {
        this.f11238a = i10;
        this.f11239b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f11238a;
        Object obj = this.f11239b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C2240z c2240z = (C2240z) obj;
                if (c2240z.f11242D0) {
                    c2240z.m6536B0();
                    return;
                }
                c2240z.f11252N0 = c2240z.f11244F0.getLayoutParams();
                c2240z.f11251M0 = c2240z.f11247I0.getLayoutParams();
                c2240z.f11250L0 = c2240z.f11249K0.getLayoutParams();
                ((ViewGroup) c2240z.f11247I0.getParent()).removeView(c2240z.f11247I0);
                ((ViewGroup) c2240z.f11244F0.getParent()).removeView(c2240z.f11244F0);
                ((ViewGroup) c2240z.f11249K0.getParent()).removeView(c2240z.f11249K0);
                c2240z.f11243E0.addContentView(c2240z.f11247I0, new ViewGroup.LayoutParams(-1, -1));
                c2240z.f11242D0 = true;
                c2240z.f11243E0.show();
                return;
            case 1:
                C2517d.m7430a((C2517d) obj);
                return;
            case 2:
                C2517d.f fVar = (C2517d.f) obj;
                int i11 = C2517d.f.f13649y;
                int iM4241d = fVar.m4241d();
                C2517d c2517d = C2517d.this;
                View view2 = c2517d.f13602U;
                if (iM4241d == 0) {
                    view2.getClass();
                    c2517d.m7435f(c2517d.f13617g, view2);
                    return;
                } else if (iM4241d != 1) {
                    c2517d.f13625k.dismiss();
                    return;
                } else {
                    view2.getClass();
                    c2517d.m7435f(c2517d.f13621i, view2);
                    return;
                }
            case 3:
                C9701o.m18202a((C9701o) obj, view);
                return;
            case 5:
                ((C7312l) obj).m14713u();
                return;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                NumberStepper numberStepper = (NumberStepper) obj;
                int i12 = NumberStepper.f16752f;
                C5207g.m11111f(numberStepper, "this$0");
                int i13 = numberStepper.f16755c;
                int i14 = numberStepper.f16756d;
                numberStepper.f16755c = i13 + i14;
                NumberStepper.InterfaceC3278a interfaceC3278a = numberStepper.f16754b;
                if (interfaceC3278a != null) {
                    interfaceC3278a.mo9357a(i14);
                }
                numberStepper.m9356a();
                return;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                PagesIndicator pagesIndicator = (PagesIndicator) obj;
                int i15 = PagesIndicator.f16758L;
                C5207g.m11111f(pagesIndicator, "this$0");
                PagesIndicator.InterfaceC3279a interfaceC3279a = pagesIndicator.f16760K;
                if (interfaceC3279a != null) {
                    interfaceC3279a.mo9358a();
                    return;
                }
                return;
            case 8:
                DailyGoalMetFragment dailyGoalMetFragment = (DailyGoalMetFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr = DailyGoalMetFragment.f22526E0;
                C5207g.m11111f(dailyGoalMetFragment, "this$0");
                AbstractC0986x<?> abstractC0986x = dailyGoalMetFragment.f6078P;
                if (!(abstractC0986x != null ? abstractC0986x.mo3810n0("android.permission.POST_NOTIFICATIONS") : false)) {
                    TextView textView = dailyGoalMetFragment.m9757n0().f44988j;
                    C5207g.m11110e(textView, "binding.tvNotifications");
                    C4924a.m10442U(textView);
                    Toast.makeText(dailyGoalMetFragment.m3578a0(), "Please enable notifications in your device's settings.", 1).show();
                    return;
                }
                C0964m c0964m = dailyGoalMetFragment.f22529C0;
                if (c0964m != null) {
                    c0964m.mo844a("android.permission.POST_NOTIFICATIONS");
                    return;
                } else {
                    C5207g.m11117l("requestPermissionLauncher");
                    throw null;
                }
            case 9:
                InstagramShareFragment instagramShareFragment = (InstagramShareFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = InstagramShareFragment.f22618V0;
                C5207g.m11111f(instagramShareFragment, "this$0");
                InstagramShareViewModel instagramShareViewModelM9764v0 = instagramShareFragment.m9764v0();
                instagramShareViewModelM9764v0.f22649e.mo14371k(instagramShareViewModelM9764v0.f22648d);
                return;
            case 10:
                WebViewFragment webViewFragment = (WebViewFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr3 = WebViewFragment.f22829S0;
                C5207g.m11111f(webViewFragment, "this$0");
                C8573r0.m16725g0(webViewFragment).m3995p();
                return;
            case 11:
                CoursePlaylistFragment coursePlaylistFragment = (CoursePlaylistFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr4 = CoursePlaylistFragment.f23761G0;
                C5207g.m11111f(coursePlaylistFragment, "this$0");
                coursePlaylistFragment.m9861p0().pause();
                C8573r0.m16725g0(coursePlaylistFragment).m3995p();
                return;
            case 12:
                LanguageProgressUpdateFragment languageProgressUpdateFragment = (LanguageProgressUpdateFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr5 = LanguageProgressUpdateFragment.f24219T0;
                C5207g.m11111f(languageProgressUpdateFragment, "this$0");
                C8573r0.m16725g0(languageProgressUpdateFragment).m3995p();
                return;
            case 13:
                LanguageStatsFragment languageStatsFragment = (LanguageStatsFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr6 = LanguageStatsFragment.f24239F0;
                C5207g.m11111f(languageStatsFragment, "this$0");
                C8573r0.m16725g0(languageStatsFragment).m3995p();
                return;
            case 14:
                LibraryAdapter libraryAdapter = (LibraryAdapter) obj;
                C5207g.m11111f(libraryAdapter, "this$0");
                libraryAdapter.f24602f.mo9802b();
                return;
            case 15:
                LibraryFragment libraryFragment = (LibraryFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr7 = LibraryFragment.f24638G0;
                C5207g.m11111f(libraryFragment, "this$0");
                libraryFragment.m9937r0().f22743S.mo16479j(HomeViewModel.AbstractC3479a.c.f22772a);
                return;
            case 16:
                RepairStreakFragment repairStreakFragment = (RepairStreakFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr8 = RepairStreakFragment.f24937S0;
                C5207g.m11111f(repairStreakFragment, "this$0");
                repairStreakFragment.m3767n0(false, false);
                return;
            case 17:
                NotificationsFragment notificationsFragment = (NotificationsFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr9 = NotificationsFragment.f25285F0;
                C5207g.m11111f(notificationsFragment, "this$0");
                C8573r0.m16725g0(notificationsFragment).m3995p();
                return;
            case 18:
                PlaylistAdapter playlistAdapter = (PlaylistAdapter) obj;
                C5207g.m11111f(playlistAdapter, "this$0");
                playlistAdapter.f25399f.mo9877c();
                return;
            case 19:
                VocabularyFilterSelectionFragment vocabularyFilterSelectionFragment = (VocabularyFilterSelectionFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr10 = VocabularyFilterSelectionFragment.f26380D0;
                C5207g.m11111f(vocabularyFilterSelectionFragment, "this$0");
                ((VocabularyParentFilterViewModel) vocabularyFilterSelectionFragment.f26383C0.getValue()).mo10046e1();
                return;
            case 20:
                UserImportAddCourse userImportAddCourse = (UserImportAddCourse) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr11 = UserImportAddCourse.f26557T0;
                C5207g.m11111f(userImportAddCourse, "this$0");
                C8573r0.m16725g0(userImportAddCourse).m3995p();
                return;
            case 21:
                UserImportFragment.m10087n0((UserImportFragment) obj);
                return;
            case 22:
                UserImportSelectionFragment userImportSelectionFragment = (UserImportSelectionFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr12 = UserImportSelectionFragment.f26680E0;
                C5207g.m11111f(userImportSelectionFragment, "this$0");
                NavController navControllerM16725g0 = C8573r0.m16725g0(userImportSelectionFragment);
                UserImportDetailType userImportDetailType = ((C4132a) userImportSelectionFragment.f26684D0.getValue()).f26837a;
                C5207g.m11111f(userImportDetailType, "userImportDetailType");
                C4924a.m10447Z(navControllerM16725g0, new C5555p(userImportDetailType));
                return;
            case 23:
                LessonInfoFragment lessonInfoFragment = (LessonInfoFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr13 = LessonInfoFragment.f26838X0;
                C5207g.m11111f(lessonInfoFragment, "this$0");
                LessonInfoViewModel lessonInfoViewModelM10099x0 = lessonInfoFragment.m10099x0();
                LessonInfo lessonInfo = (LessonInfo) lessonInfoViewModelM10099x0.f26922J.getValue();
                if (lessonInfo != null) {
                    lessonInfoViewModelM10099x0.m10103o2(new AbstractC4161d.a(lessonInfo.f21971h));
                    return;
                }
                return;
            case 24:
                LessonEditSentencesFragment lessonEditSentencesFragment = (LessonEditSentencesFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr14 = LessonEditSentencesFragment.f27923D0;
                C5207g.m11111f(lessonEditSentencesFragment, "this$0");
                lessonEditSentencesFragment.m10165o0().mo10163x1();
                return;
            case 25:
                SentenceEditPagerFragment sentenceEditPagerFragment = (SentenceEditPagerFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr15 = SentenceEditPagerFragment.f28085E0;
                C5207g.m11111f(sentenceEditPagerFragment, "this$0");
                sentenceEditPagerFragment.m10182o0().f28112f.mo9336K();
                sentenceEditPagerFragment.m10182o0().mo10163x1();
                return;
            case 26:
                LessonReviewMenuFragment lessonReviewMenuFragment = (LessonReviewMenuFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr16 = LessonReviewMenuFragment.f28270D0;
                C5207g.m11111f(lessonReviewMenuFragment, "this$0");
                lessonReviewMenuFragment.m3598r().m3627S();
                lessonReviewMenuFragment.m10185o0().m10138E2(ReviewType.Page);
                return;
            case 27:
                LessonPlayerView lessonPlayerView = (LessonPlayerView) obj;
                int i16 = LessonPlayerView.f28726c;
                C5207g.m11111f(lessonPlayerView, "this$0");
                InterfaceC9008d interfaceC9008d = lessonPlayerView.f28728b;
                if (interfaceC9008d != null) {
                    interfaceC9008d.mo9868f();
                }
                return;
            case 28:
                LessonFirstLingQCongratsFragment lessonFirstLingQCongratsFragment = (LessonFirstLingQCongratsFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr17 = LessonFirstLingQCongratsFragment.f29187S0;
                C5207g.m11111f(lessonFirstLingQCongratsFragment, "this$0");
                C8573r0.m16725g0(lessonFirstLingQCongratsFragment).m3995p();
                return;
        }
        OnboardingFragment onboardingFragment = (OnboardingFragment) obj;
        InterfaceC6727j<Object>[] interfaceC6727jArr18 = OnboardingFragment.f29401E0;
        C5207g.m11111f(onboardingFragment, "this$0");
        NavController navControllerM16725g1 = C8573r0.m16725g0(onboardingFragment);
        NavDestination navDestinationM3986g = navControllerM16725g1.m3986g();
        if (navDestinationM3986g != null && navDestinationM3986g.m4016i(R.id.actionToSignIn) != null) {
            Bundle bundle = new Bundle();
            bundle.putString("authCode", "");
            navControllerM16725g1.m3992m(R.id.actionToSignIn, bundle, null);
        }
    }
}
