package p000;

import com.lingq.feature.vocabulary.data.VocabularyContentFilter;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class oya {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f55311a;

    static {
        int[] iArr = new int[VocabularyContentFilter.values().length];
        try {
            iArr[VocabularyContentFilter.All.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VocabularyContentFilter.Phrases.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VocabularyContentFilter.SrsDue.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f55311a = iArr;
    }
}
