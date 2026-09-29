package p000;

import com.airbnb.lottie.parser.moshi.JsonReader$Token;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class ng4 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f52705a;

    static {
        int[] iArr = new int[JsonReader$Token.values().length];
        f52705a = iArr;
        try {
            iArr[JsonReader$Token.NUMBER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f52705a[JsonReader$Token.BEGIN_ARRAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f52705a[JsonReader$Token.BEGIN_OBJECT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
