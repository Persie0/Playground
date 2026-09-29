package p000;

import com.lingq.core.settings.ViewKeys;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class zz8 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f72432a;

    static {
        int[] iArr = new int[ViewKeys.values().length];
        try {
            iArr[ViewKeys.FlashcardsFrontTransliteration.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ViewKeys.FlashcardsBackTransliteration.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ViewKeys.ReverseFlashcardsFrontTransliteration.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ViewKeys.ReverseFlashcardsBackTransliteration.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ViewKeys.ClozeBackTransliteration.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ViewKeys.MultipleChoiceFrontTransliteration.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ViewKeys.MultipleChoiceBackTransliteration.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[ViewKeys.DictationChoiceBackTransliteration.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        f72432a = iArr;
    }
}
