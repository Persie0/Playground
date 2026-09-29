package com.clevertap.android.sdk.inapp;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.ActivityC0979t;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import bb.C1350a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.clevertap.android.sdk.gif.GifImageView;
import com.google.android.exoplayer2.p051ui.C2517d;
import com.lingq.commons.p053ui.views.PagesIndicator;
import com.lingq.p055ui.goals.DailyGoalCoinsTutorialFragment;
import com.lingq.p055ui.goals.DailyGoalMetFragment;
import com.lingq.p055ui.home.menu.InviteFriendsFragment;
import com.lingq.p055ui.home.playlist.PlaylistAddFragment;
import com.lingq.p055ui.home.playlist.PlaylistFragment;
import com.lingq.p055ui.home.playlist.PlaylistPlayerView;
import com.lingq.p055ui.home.search.SearchFragment;
import com.lingq.p055ui.home.vocabulary.VocabularyAddFragment;
import com.lingq.p055ui.imports.userImport.UserImportParentViewModel;
import com.lingq.p055ui.imports.userImport.UserImportSelectionFragment;
import com.lingq.p055ui.imports.userImport.UserImportTextFragment;
import com.lingq.p055ui.info.InterfaceC4158a;
import com.lingq.p055ui.info.LessonInfoFragment;
import com.lingq.p055ui.lesson.edit.SentenceEditPagerFragment;
import com.lingq.p055ui.lesson.menu.DatastoreLessonSettingsFragment;
import com.lingq.p055ui.lesson.player.LessonPlayerView;
import com.lingq.p055ui.lesson.stats.LessonCompleteFragment;
import com.lingq.p055ui.lesson.tutorial.LessonDealWithWordsFragment;
import com.lingq.p055ui.lesson.tutorial.LessonFirstLingQCongratsFragment;
import com.lingq.p055ui.lesson.vocabulary.LessonVocabularyFragment;
import com.lingq.p055ui.onboarding.OnboardingFragment;
import com.lingq.p055ui.onboarding.OnboardingLanguageFragment;
import com.lingq.p055ui.review.ReviewFragment;
import com.lingq.p055ui.review.settings.DatastoreReviewSettingsFragment;
import com.lingq.p055ui.session.RegisterFragment;
import com.lingq.p055ui.settings.SettingsEditFragment;
import com.linguist.R;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlinx.coroutines.flow.StateFlowImpl;
import ni.C7797e;
import p070db.C5127g;
import p070db.C5133m;
import p152hb.C5978i0;
import p173i8.C6205a;
import p291o7.AbstractC7999i;
import p291o7.C7993c0;
import p291o7.C8004n;
import p317p7.C8201h;
import p338qd.C8573r0;
import p538zj.C10510c;
import p538zj.InterfaceC10508a;
import sh.InterfaceC9008d;
import sj.C9050i;
import va.C9701o;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.x */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC2238x implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11236a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f11237b;

    public /* synthetic */ ViewOnClickListenerC2238x(int i10, Object obj) {
        this.f11236a = i10;
        this.f11237b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Exception {
        int i10 = this.f11236a;
        Object obj = this.f11237b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C2240z c2240z = (C2240z) obj;
                int i11 = C2240z.f11241P0;
                c2240z.m6513n0(null);
                GifImageView gifImageView = c2240z.f11245G0;
                if (gifImageView != null) {
                    gifImageView.m6485c();
                }
                ActivityC0979t activityC0979tM3582e = c2240z.m3582e();
                if (activityC0979tM3582e != null) {
                    activityC0979tM3582e.finish();
                    return;
                }
                return;
            case 1:
                AbstractC7999i abstractC7999i = (AbstractC7999i) obj;
                int i12 = AbstractC7999i.f43538i;
                if (C6205a.m12742b(AbstractC7999i.class)) {
                    return;
                }
                try {
                    C5207g.m11111f(abstractC7999i, "this$0");
                    Context context = abstractC7999i.getContext();
                    if (!C6205a.m12742b(abstractC7999i)) {
                        try {
                            C8201h c8201h = new C8201h(context, (String) null);
                            String str = abstractC7999i.f43540b;
                            C8004n c8004n = C8004n.f43550a;
                            if (C7993c0.m15849b()) {
                                c8201h.m16334f(str, null);
                            }
                        } catch (Throwable th2) {
                            C6205a.m12741a(abstractC7999i, th2);
                        }
                        break;
                    }
                    View.OnClickListener onClickListener = abstractC7999i.f43542d;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    View.OnClickListener onClickListener2 = abstractC7999i.f43541c;
                    if (onClickListener2 == null) {
                        return;
                    }
                    onClickListener2.onClick(view);
                    return;
                } catch (Throwable th3) {
                    C6205a.m12741a(AbstractC7999i.class, th3);
                    return;
                }
            case 2:
                C2517d.m7430a((C2517d) obj);
                return;
            case 3:
                C9701o.m18202a((C9701o) obj, view);
                return;
            case 4:
                PagesIndicator pagesIndicator = (PagesIndicator) obj;
                int i13 = PagesIndicator.f16758L;
                C5207g.m11111f(pagesIndicator, "this$0");
                PagesIndicator.InterfaceC3279a interfaceC3279a = pagesIndicator.f16760K;
                if (interfaceC3279a != null) {
                    interfaceC3279a.mo9359b(true);
                    return;
                }
                return;
            case 5:
                DailyGoalCoinsTutorialFragment dailyGoalCoinsTutorialFragment = (DailyGoalCoinsTutorialFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr = DailyGoalCoinsTutorialFragment.f22489E0;
                C5207g.m11111f(dailyGoalCoinsTutorialFragment, "this$0");
                dailyGoalCoinsTutorialFragment.m3579b0().m3594l().m3627S();
                return;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                DailyGoalMetFragment dailyGoalMetFragment = (DailyGoalMetFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = DailyGoalMetFragment.f22526E0;
                C5207g.m11111f(dailyGoalMetFragment, "this$0");
                dailyGoalMetFragment.m3579b0().m3594l().m3627S();
                return;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                InviteFriendsFragment.m9959v0((InviteFriendsFragment) obj);
                return;
            case 8:
                PlaylistAddFragment.m9976u0((PlaylistAddFragment) obj);
                return;
            case 9:
                PlaylistFragment playlistFragment = (PlaylistFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr3 = PlaylistFragment.f25457H0;
                C5207g.m11111f(playlistFragment, "this$0");
                StateFlowImpl stateFlowImpl = playlistFragment.m9984r0().f25626r0;
                stateFlowImpl.setValue(Boolean.valueOf(!((Boolean) stateFlowImpl.getValue()).booleanValue()));
                return;
            case 10:
                PlaylistPlayerView playlistPlayerView = (PlaylistPlayerView) obj;
                int i14 = PlaylistPlayerView.f25566c;
                C5207g.m11111f(playlistPlayerView, "this$0");
                InterfaceC9008d interfaceC9008d = playlistPlayerView.f25568b;
                if (interfaceC9008d != null) {
                    interfaceC9008d.mo9864b();
                    return;
                }
                return;
            case 11:
                SearchFragment searchFragment = (SearchFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr4 = SearchFragment.f25954E0;
                C5207g.m11111f(searchFragment, "this$0");
                C8573r0.m16725g0(searchFragment).m3995p();
                return;
            case 12:
                VocabularyAddFragment vocabularyAddFragment = (VocabularyAddFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr5 = VocabularyAddFragment.f26096T0;
                C5207g.m11111f(vocabularyAddFragment, "this$0");
                C8573r0.m16725g0(vocabularyAddFragment).m3995p();
                return;
            case 13:
                UserImportSelectionFragment userImportSelectionFragment = (UserImportSelectionFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr6 = UserImportSelectionFragment.f26680E0;
                C5207g.m11111f(userImportSelectionFragment, "this$0");
                ((UserImportParentViewModel) userImportSelectionFragment.f26683C0.getValue()).mo10077K1();
                return;
            case 14:
                UserImportTextFragment userImportTextFragment = (UserImportTextFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr7 = UserImportTextFragment.f26757E0;
                C5207g.m11111f(userImportTextFragment, "this$0");
                ((UserImportParentViewModel) userImportTextFragment.f26760C0.getValue()).mo10077K1();
                return;
            case 15:
                LessonInfoFragment lessonInfoFragment = (LessonInfoFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr8 = LessonInfoFragment.f26838X0;
                C5207g.m11111f(lessonInfoFragment, "this$0");
                lessonInfoFragment.m10099x0().m10104p2(InterfaceC4158a.a.f27041a);
                return;
            case 16:
                SentenceEditPagerFragment sentenceEditPagerFragment = (SentenceEditPagerFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr9 = SentenceEditPagerFragment.f28085E0;
                C5207g.m11111f(sentenceEditPagerFragment, "this$0");
                sentenceEditPagerFragment.m10182o0().mo10162s0();
                return;
            case 17:
                DatastoreLessonSettingsFragment datastoreLessonSettingsFragment = (DatastoreLessonSettingsFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr10 = DatastoreLessonSettingsFragment.f28128T0;
                C5207g.m11111f(datastoreLessonSettingsFragment, "this$0");
                C8573r0.m16725g0(datastoreLessonSettingsFragment).m3995p();
                return;
            case 18:
                LessonPlayerView lessonPlayerView = (LessonPlayerView) obj;
                int i15 = LessonPlayerView.f28726c;
                C5207g.m11111f(lessonPlayerView, "this$0");
                InterfaceC9008d interfaceC9008d2 = lessonPlayerView.f28728b;
                if (interfaceC9008d2 != null) {
                    interfaceC9008d2.mo9870h();
                }
                return;
            case 19:
                LessonCompleteFragment lessonCompleteFragment = (LessonCompleteFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr11 = LessonCompleteFragment.f28894G0;
                C5207g.m11111f(lessonCompleteFragment, "this$0");
                C8573r0.m16725g0(lessonCompleteFragment).m3995p();
                return;
            case 20:
                LessonDealWithWordsFragment lessonDealWithWordsFragment = (LessonDealWithWordsFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr12 = LessonDealWithWordsFragment.f29086F0;
                C5207g.m11111f(lessonDealWithWordsFragment, "this$0");
                lessonDealWithWordsFragment.m10225o0().m10153z2(lessonDealWithWordsFragment.m10226p0().f29150k + 1);
                lessonDealWithWordsFragment.m3598r().m3627S();
                return;
            case 21:
                LessonFirstLingQCongratsFragment lessonFirstLingQCongratsFragment = (LessonFirstLingQCongratsFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr13 = LessonFirstLingQCongratsFragment.f29187S0;
                C5207g.m11111f(lessonFirstLingQCongratsFragment, "this$0");
                C8573r0.m16725g0(lessonFirstLingQCongratsFragment).m3995p();
                return;
            case 22:
                LessonVocabularyFragment lessonVocabularyFragment = (LessonVocabularyFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr14 = LessonVocabularyFragment.f29206D0;
                C5207g.m11111f(lessonVocabularyFragment, "this$0");
                C8573r0.m16725g0(lessonVocabularyFragment).m3995p();
                return;
            case 23:
                OnboardingFragment onboardingFragment = (OnboardingFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr15 = OnboardingFragment.f29401E0;
                C5207g.m11111f(onboardingFragment, "this$0");
                C7797e c7797e = onboardingFragment.f29404C0;
                if (c7797e == null) {
                    C5207g.m11117l("utils");
                    throw null;
                }
                if (c7797e.m15514g()) {
                    String str2 = C9050i.f47331a;
                    NavController navControllerM16725g0 = C8573r0.m16725g0(onboardingFragment);
                    Bundle bundle = new Bundle();
                    NavDestination navDestinationM3986g = navControllerM16725g0.m3986g();
                    if (navDestinationM3986g != null && navDestinationM3986g.m4016i(R.id.actionToOnboardingLanguage) != null) {
                        navControllerM16725g0.m3992m(R.id.actionToOnboardingLanguage, bundle, null);
                        return;
                    }
                } else {
                    String str3 = C9050i.f47331a;
                    C7797e c7797e2 = onboardingFragment.f29404C0;
                    if (c7797e2 == null) {
                        C5207g.m11117l("utils");
                        throw null;
                    }
                    C9050i.f47331a = c7797e2.m15510c("language_code");
                    NavController navControllerM16725g1 = C8573r0.m16725g0(onboardingFragment);
                    Bundle bundle2 = new Bundle();
                    NavDestination navDestinationM3986g2 = navControllerM16725g1.m3986g();
                    if (navDestinationM3986g2 != null && navDestinationM3986g2.m4016i(R.id.actionToOnboardingLevel) != null) {
                        navControllerM16725g1.m3992m(R.id.actionToOnboardingLevel, bundle2, null);
                    }
                }
                return;
            case 24:
                OnboardingLanguageFragment onboardingLanguageFragment = (OnboardingLanguageFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr16 = OnboardingLanguageFragment.f29407D0;
                C5207g.m11111f(onboardingLanguageFragment, "this$0");
                C8573r0.m16725g0(onboardingLanguageFragment).m3995p();
                return;
            case 25:
                ReviewFragment reviewFragment = (ReviewFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr17 = ReviewFragment.f29431E0;
                C5207g.m11111f(reviewFragment, "this$0");
                C8573r0.m16725g0(reviewFragment).m3995p();
                return;
            case 26:
                DatastoreReviewSettingsFragment datastoreReviewSettingsFragment = (DatastoreReviewSettingsFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr18 = DatastoreReviewSettingsFragment.f30337T0;
                C5207g.m11111f(datastoreReviewSettingsFragment, "this$0");
                C8573r0.m16725g0(datastoreReviewSettingsFragment).m3995p();
                return;
            case 27:
                C10510c c10510c = (C10510c) obj;
                int i16 = C10510c.f52466d;
                C5207g.m11111f(c10510c, "this$0");
                InterfaceC10508a interfaceC10508a = c10510c.f52469c;
                if (interfaceC10508a != null) {
                    interfaceC10508a.mo10294d(c10510c.getSentenceWord());
                }
                return;
            case 28:
                RegisterFragment registerFragment = (RegisterFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr19 = RegisterFragment.f30733J0;
                C5207g.m11111f(registerFragment, "this$0");
                C5978i0 c5978i0 = registerFragment.f30738E0;
                if (c5978i0 != null) {
                    C1350a.f8183b.getClass();
                    registerFragment.startActivityForResult(C5133m.m10911a(c5978i0.f35512f, ((C5127g) c5978i0.m12428k(C1350a.f8184c)).f33113b0), 9001);
                    return;
                }
                return;
            default:
                SettingsEditFragment settingsEditFragment = (SettingsEditFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr20 = SettingsEditFragment.f31006T0;
                C5207g.m11111f(settingsEditFragment, "this$0");
                C8573r0.m16725g0(settingsEditFragment).m3995p();
                return;
        }
    }
}
