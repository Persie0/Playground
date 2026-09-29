package p000;

import com.lingq.core.domain.model.language.LanguageProgressMetric;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class jha {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f45553a;

    static {
        int[] iArr = new int[LanguageProgressMetric.values().length];
        try {
            iArr[LanguageProgressMetric.ListeningHours.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LanguageProgressMetric.WordsOfReading.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LanguageProgressMetric.WrittenWords.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LanguageProgressMetric.SpeakingHours.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f45553a = iArr;
    }
}
