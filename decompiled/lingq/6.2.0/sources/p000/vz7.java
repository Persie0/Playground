package p000;

import com.lingq.core.settings.ViewKeys;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class vz7 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f66141a;

    static {
        int[] iArr = new int[ViewKeys.values().length];
        try {
            iArr[ViewKeys.TokenChineseType.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ViewKeys.TokenJapaneseType.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ViewKeys.TokenChineseTraditionType.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ViewKeys.TokenCantoneseType.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ViewKeys.TokenLatinType.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f66141a = iArr;
    }
}
