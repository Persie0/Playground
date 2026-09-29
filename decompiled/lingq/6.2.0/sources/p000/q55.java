package p000;

import com.lingq.feature.library.preview.TranscriptionGateState;
import com.lingq.feature.library.preview.VirtualLessonImportMode;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class q55 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f57292a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f57293b;

    static {
        int[] iArr = new int[VirtualLessonImportMode.values().length];
        try {
            iArr[VirtualLessonImportMode.AUDIOLESS_VIRTUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VirtualLessonImportMode.AUDIO_VIRTUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VirtualLessonImportMode.EXTERNAL_PREVIEW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f57292a = iArr;
        int[] iArr2 = new int[TranscriptionGateState.values().length];
        try {
            iArr2[TranscriptionGateState.AVAILABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[TranscriptionGateState.PREMIUM_REQUIRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[TranscriptionGateState.LIMIT_EXCEEDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[TranscriptionGateState.INSUFFICIENT_BALANCE.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        f57293b = iArr2;
    }
}
