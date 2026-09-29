package p000;

import com.lingq.core.domain.model.lesson.TokenType;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class ay7 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f7671a;

    static {
        int[] iArr = new int[TokenType.values().length];
        try {
            iArr[TokenType.CardType.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TokenType.WordType.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TokenType.NewWordOrPhraseType.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f7671a = iArr;
    }
}
