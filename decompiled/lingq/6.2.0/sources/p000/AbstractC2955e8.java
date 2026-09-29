package p000;

import com.lingq.core.domain.model.language.LanguageProgressMetric;
import com.lingq.core.domain.stats.ActivityScore;

/* JADX INFO: renamed from: e8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC2955e8 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f36828a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f36829b;

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
        f36828a = iArr;
        int[] iArr2 = new int[LanguageProgressMetric.values().length];
        try {
            iArr2[LanguageProgressMetric.WordsOfReading.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[LanguageProgressMetric.ListeningHours.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[LanguageProgressMetric.LingQsCreated.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        f36829b = iArr2;
    }
}
