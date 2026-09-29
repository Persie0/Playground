package p000;

import kotlinx.serialization.json.ClassDiscriminatorMode;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class wg7 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f66796a;

    static {
        int[] iArr = new int[ClassDiscriminatorMode.values().length];
        try {
            iArr[ClassDiscriminatorMode.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ClassDiscriminatorMode.POLYMORPHIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ClassDiscriminatorMode.ALL_JSON_OBJECTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f66796a = iArr;
    }
}
