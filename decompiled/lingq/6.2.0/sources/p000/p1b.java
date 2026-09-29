package p000;

import com.lingq.feature.reader.vocabulary.model.VocabularyType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class p1b {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f55463a;

    static {
        int[] iArr = new int[VocabularyType.values().length];
        try {
            iArr[VocabularyType.Cards.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VocabularyType.NewWords.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VocabularyType.All.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f55463a = iArr;
    }
}
