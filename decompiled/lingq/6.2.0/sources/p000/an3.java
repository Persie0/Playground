package p000;

import com.lingq.core.domain.model.lesson.TokenType;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class an3 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f875a;

    static {
        int[] iArr = new int[TokenType.values().length];
        try {
            iArr[TokenType.WordType.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TokenType.NewWordOrPhraseType.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f875a = iArr;
    }
}
