package p000;

import com.lingq.core.domain.model.review.ReviewType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class t08 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f61725a;

    static {
        int[] iArr = new int[ReviewType.values().length];
        try {
            iArr[ReviewType.Page.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ReviewType.SrsDue.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ReviewType.All.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ReviewType.VocabularyPhrases.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ReviewType.VocabularySRS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ReviewType.VocabularyAll.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ReviewType.Integrated.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[ReviewType.IntegratedWord.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        f61725a = iArr;
    }
}
