package p000;

import com.lingq.core.domain.model.lesson.LessonProcessingStatus;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class jw7 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f46319a;

    static {
        int[] iArr = new int[LessonProcessingStatus.values().length];
        try {
            iArr[LessonProcessingStatus.AI.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LessonProcessingStatus.TRANSCRIBE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LessonProcessingStatus.DOWNLOAD_AUDIO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LessonProcessingStatus.TRANSLATIONS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[LessonProcessingStatus.NORMALIZE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[LessonProcessingStatus.EDIT_TEXT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[LessonProcessingStatus.GENERATE_TTS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[LessonProcessingStatus.ERROR.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[LessonProcessingStatus.TIMESTAMPS.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[LessonProcessingStatus.IMPORT.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[LessonProcessingStatus.AI_SPLITTING.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        f46319a = iArr;
    }
}
