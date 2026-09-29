package p000;

import com.lingq.core.domain.model.lesson.LessonProcessingStatus;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class zz4 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f72421a;

    static {
        int[] iArr = new int[LessonProcessingStatus.values().length];
        try {
            iArr[LessonProcessingStatus.AI.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LessonProcessingStatus.AI_SPLITTING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LessonProcessingStatus.GENERATE_TTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LessonProcessingStatus.TIMESTAMPS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[LessonProcessingStatus.TRANSCRIBE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[LessonProcessingStatus.IMPORT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[LessonProcessingStatus.DOWNLOAD_AUDIO.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[LessonProcessingStatus.TRANSLATIONS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[LessonProcessingStatus.NORMALIZE.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[LessonProcessingStatus.EDIT_TEXT.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[LessonProcessingStatus.ERROR.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        f72421a = iArr;
    }
}
