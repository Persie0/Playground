package p000;

import com.lingq.core.domain.model.settings.ReviewSettingsKeys;
import com.lingq.core.settings.ViewKeys;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i19 {

    /* JADX INFO: renamed from: a */
    public static final Set f43354a = AbstractC3550rv.m20855w0(new ViewKeys[]{ViewKeys.Flashcards, ViewKeys.ReverseFlashcards, ViewKeys.Cloze, ViewKeys.MultipleChoice, ViewKeys.Dictation, ViewKeys.Unscramble, ViewKeys.Speaking, ViewKeys.Matching});

    /* JADX INFO: renamed from: a */
    public static final ReviewSettingsKeys m13627a(ViewKeys viewKeys) {
        viewKeys.getClass();
        switch (h19.f41664a[viewKeys.ordinal()]) {
            case 1:
                return ReviewSettingsKeys.Flashcards;
            case 2:
                return ReviewSettingsKeys.ReverseFlashcards;
            case 3:
                return ReviewSettingsKeys.Cloze;
            case 4:
                return ReviewSettingsKeys.MultipleChoice;
            case 5:
                return ReviewSettingsKeys.Dictation;
            case 6:
                return ReviewSettingsKeys.Unscramble;
            case 7:
                return ReviewSettingsKeys.Speaking;
            case 8:
                return ReviewSettingsKeys.FlashcardsFrontTransliteration;
            case 9:
                return ReviewSettingsKeys.FlashcardsBackTransliteration;
            case 10:
                return ReviewSettingsKeys.ReverseFlashcardsFrontTransliteration;
            case 11:
                return ReviewSettingsKeys.ReverseFlashcardsBackTransliteration;
            case 12:
                return ReviewSettingsKeys.MultipleChoiceFrontTransliteration;
            case 13:
                return ReviewSettingsKeys.MultipleChoiceBackTransliteration;
            case 14:
                return ReviewSettingsKeys.ClozeBackTransliteration;
            case 15:
                return ReviewSettingsKeys.DictationChoiceBackTransliteration;
            default:
                return ReviewSettingsKeys.None;
        }
    }
}
