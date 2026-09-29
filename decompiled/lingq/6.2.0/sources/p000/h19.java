package p000;

import com.lingq.core.settings.ViewKeys;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class h19 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f41664a;

    static {
        int[] iArr = new int[ViewKeys.values().length];
        try {
            iArr[ViewKeys.Flashcards.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ViewKeys.ReverseFlashcards.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ViewKeys.Cloze.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ViewKeys.MultipleChoice.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ViewKeys.Dictation.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ViewKeys.Unscramble.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ViewKeys.Speaking.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[ViewKeys.FlashcardsFrontTransliteration.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[ViewKeys.FlashcardsBackTransliteration.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[ViewKeys.ReverseFlashcardsFrontTransliteration.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[ViewKeys.ReverseFlashcardsBackTransliteration.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[ViewKeys.MultipleChoiceFrontTransliteration.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[ViewKeys.MultipleChoiceBackTransliteration.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[ViewKeys.ClozeBackTransliteration.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[ViewKeys.DictationChoiceBackTransliteration.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        f41664a = iArr;
    }
}
