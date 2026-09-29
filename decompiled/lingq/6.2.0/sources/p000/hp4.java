package p000;

import com.lingq.core.domain.model.language.LanguageProgressMetric;
import com.lingq.core.domain.stats.ActivityScore;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class hp4 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f42734a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f42735b;

    static {
        int[] iArr = new int[ActivityScore.values().length];
        try {
            iArr[ActivityScore.Attention.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ActivityScore.Ok.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ActivityScore.Almost.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ActivityScore.Great.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f42734a = iArr;
        int[] iArr2 = new int[LanguageProgressMetric.values().length];
        try {
            iArr2[LanguageProgressMetric.ListeningHours.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[LanguageProgressMetric.WordsOfReading.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[LanguageProgressMetric.WrittenWords.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[LanguageProgressMetric.SpeakingHours.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        f42735b = iArr2;
    }
}
