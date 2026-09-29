package p000;

import com.lingq.core.settings.ViewKeys;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class dp9 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f36009a;

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
            iArr[ViewKeys.Matching.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        f36009a = iArr;
    }
}
