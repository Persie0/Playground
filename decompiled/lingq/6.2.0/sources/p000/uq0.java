package p000;

import android.os.Bundle;
import com.lingq.core.domain.model.onboarding.TooltipStep;
import com.lingq.core.premium.FreeTrialFragment;
import com.lingq.core.settings.review.ReviewSettingsFragment;
import com.lingq.core.token.TokenParentFragment;
import com.lingq.core.web.WebViewFragment;
import com.lingq.feature.challenges.ChallengeDetailsFragment;
import com.lingq.feature.challenges.ChallengeShareFragment;
import com.lingq.feature.collections.CollectionFragment;
import com.lingq.feature.imports.UserImportFragment;
import com.lingq.feature.karaoke.KaraokeFragment;
import com.lingq.feature.lessoninfo.LessonInfoFragment;
import com.lingq.feature.library.yir.YearInReviewFragment;
import com.lingq.feature.onboarding.auth.login.magiclink.CheckEmailFragment;
import com.lingq.feature.reader.old.ReaderFragment;
import com.lingq.feature.reader.old.settings.LessonReviewMenuFragment;
import com.lingq.feature.reader.old.tutorial.LessonDealWithWordsFragment;
import com.lingq.feature.reader.old.vocabulary.LessonVocabularyFragment;
import com.lingq.feature.reader.reader.ReaderComposeFragment;
import com.lingq.feature.reader.stats.p019ui.all.LessonCompleteAllWordsFragment;
import com.lingq.feature.reader.stats.p019ui.lingqs.LessonCompleteVocabularyFragment;
import com.lingq.feature.reader.stats.p019ui.words.LessonCompleteDealBlueFragment;
import com.lingq.feature.search.search.SearchFragment;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class uq0 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64205a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f64206b;

    public /* synthetic */ uq0(Object obj, int i) {
        this.f64205a = i;
        this.f64206b = obj;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f64205a;
        Object obj = this.f64206b;
        switch (i) {
            case 0:
                ChallengeDetailsFragment challengeDetailsFragment = (ChallengeDetailsFragment) obj;
                Bundle bundle = challengeDetailsFragment.f5695f;
                if (bundle != null) {
                    return bundle;
                }
                v63.m23148z("Fragment ", challengeDetailsFragment, " has null arguments");
                return null;
            case 1:
                ChallengeShareFragment challengeShareFragment = (ChallengeShareFragment) obj;
                Bundle bundle2 = challengeShareFragment.f5695f;
                if (bundle2 != null) {
                    return bundle2;
                }
                v63.m23148z("Fragment ", challengeShareFragment, " has null arguments");
                return null;
            case 2:
                CheckEmailFragment checkEmailFragment = (CheckEmailFragment) obj;
                Bundle bundle3 = checkEmailFragment.f5695f;
                if (bundle3 != null) {
                    return bundle3;
                }
                v63.m23148z("Fragment ", checkEmailFragment, " has null arguments");
                return null;
            case 3:
                CollectionFragment collectionFragment = (CollectionFragment) obj;
                Bundle bundle4 = collectionFragment.f5695f;
                if (bundle4 != null) {
                    return bundle4;
                }
                v63.m23148z("Fragment ", collectionFragment, " has null arguments");
                return null;
            case 4:
                FreeTrialFragment freeTrialFragment = (FreeTrialFragment) obj;
                Bundle bundle5 = freeTrialFragment.f5695f;
                if (bundle5 != null) {
                    return bundle5;
                }
                v63.m23148z("Fragment ", freeTrialFragment, " has null arguments");
                return null;
            case 5:
                KaraokeFragment karaokeFragment = (KaraokeFragment) obj;
                Bundle bundle6 = karaokeFragment.f5695f;
                if (bundle6 != null) {
                    return bundle6;
                }
                v63.m23148z("Fragment ", karaokeFragment, " has null arguments");
                return null;
            case 6:
                LessonCompleteAllWordsFragment lessonCompleteAllWordsFragment = (LessonCompleteAllWordsFragment) obj;
                Bundle bundle7 = lessonCompleteAllWordsFragment.f5695f;
                if (bundle7 != null) {
                    return bundle7;
                }
                v63.m23148z("Fragment ", lessonCompleteAllWordsFragment, " has null arguments");
                return null;
            case 7:
                LessonCompleteDealBlueFragment lessonCompleteDealBlueFragment = (LessonCompleteDealBlueFragment) obj;
                Bundle bundle8 = lessonCompleteDealBlueFragment.f5695f;
                if (bundle8 != null) {
                    return bundle8;
                }
                v63.m23148z("Fragment ", lessonCompleteDealBlueFragment, " has null arguments");
                return null;
            case 8:
                LessonCompleteVocabularyFragment lessonCompleteVocabularyFragment = (LessonCompleteVocabularyFragment) obj;
                Bundle bundle9 = lessonCompleteVocabularyFragment.f5695f;
                if (bundle9 != null) {
                    return bundle9;
                }
                v63.m23148z("Fragment ", lessonCompleteVocabularyFragment, " has null arguments");
                return null;
            case 9:
                LessonDealWithWordsFragment lessonDealWithWordsFragment = (LessonDealWithWordsFragment) obj;
                Bundle bundle10 = lessonDealWithWordsFragment.f5695f;
                if (bundle10 != null) {
                    return bundle10;
                }
                v63.m23148z("Fragment ", lessonDealWithWordsFragment, " has null arguments");
                return null;
            case 10:
                LessonInfoFragment lessonInfoFragment = (LessonInfoFragment) obj;
                Bundle bundle11 = lessonInfoFragment.f5695f;
                if (bundle11 != null) {
                    return bundle11;
                }
                v63.m23148z("Fragment ", lessonInfoFragment, " has null arguments");
                return null;
            case 11:
                bh4[] bh4VarArr = LessonReviewMenuFragment.f29427G0;
                ((LessonReviewMenuFragment) obj).m9346T0().mo8742L(TooltipStep.ReviewMenu);
                return xfa.f68157a;
            case 12:
                LessonVocabularyFragment lessonVocabularyFragment = (LessonVocabularyFragment) obj;
                Bundle bundle12 = lessonVocabularyFragment.f5695f;
                if (bundle12 != null) {
                    return bundle12;
                }
                v63.m23148z("Fragment ", lessonVocabularyFragment, " has null arguments");
                return null;
            case 13:
                ReaderComposeFragment readerComposeFragment = (ReaderComposeFragment) obj;
                Bundle bundle13 = readerComposeFragment.f5695f;
                if (bundle13 != null) {
                    return bundle13;
                }
                v63.m23148z("Fragment ", readerComposeFragment, " has null arguments");
                return null;
            case 14:
                ReaderFragment readerFragment = (ReaderFragment) obj;
                Bundle bundle14 = readerFragment.f5695f;
                if (bundle14 != null) {
                    return bundle14;
                }
                v63.m23148z("Fragment ", readerFragment, " has null arguments");
                return null;
            case 15:
                ReviewSettingsFragment reviewSettingsFragment = (ReviewSettingsFragment) obj;
                Bundle bundle15 = reviewSettingsFragment.f5695f;
                if (bundle15 != null) {
                    return bundle15;
                }
                v63.m23148z("Fragment ", reviewSettingsFragment, " has null arguments");
                return null;
            case 16:
                SearchFragment searchFragment = (SearchFragment) obj;
                Bundle bundle16 = searchFragment.f5695f;
                if (bundle16 != null) {
                    return bundle16;
                }
                v63.m23148z("Fragment ", searchFragment, " has null arguments");
                return null;
            case 17:
                return Float.valueOf(((Number) ((Pair) obj).f47624b).floatValue() / 100.0f);
            case 18:
                TokenParentFragment tokenParentFragment = (TokenParentFragment) obj;
                Bundle bundle17 = tokenParentFragment.f5695f;
                if (bundle17 != null) {
                    return bundle17;
                }
                v63.m23148z("Fragment ", tokenParentFragment, " has null arguments");
                return null;
            case 19:
                UserImportFragment userImportFragment = (UserImportFragment) obj;
                Bundle bundle18 = userImportFragment.f5695f;
                if (bundle18 != null) {
                    return bundle18;
                }
                v63.m23148z("Fragment ", userImportFragment, " has null arguments");
                return null;
            case 20:
                WebViewFragment webViewFragment = (WebViewFragment) obj;
                Bundle bundle19 = webViewFragment.f5695f;
                if (bundle19 != null) {
                    return bundle19;
                }
                v63.m23148z("Fragment ", webViewFragment, " has null arguments");
                return null;
            default:
                YearInReviewFragment yearInReviewFragment = (YearInReviewFragment) obj;
                Bundle bundle20 = yearInReviewFragment.f5695f;
                if (bundle20 != null) {
                    return bundle20;
                }
                v63.m23148z("Fragment ", yearInReviewFragment, " has null arguments");
                return null;
        }
    }
}
