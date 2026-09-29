package androidx.security.crypto;

/* JADX INFO: renamed from: androidx.security.crypto.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0759a {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f7050a;

    static {
        int[] iArr = new int[EncryptedSharedPreferences$EncryptedType.values().length];
        f7050a = iArr;
        try {
            iArr[EncryptedSharedPreferences$EncryptedType.STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f7050a[EncryptedSharedPreferences$EncryptedType.INT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f7050a[EncryptedSharedPreferences$EncryptedType.LONG.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f7050a[EncryptedSharedPreferences$EncryptedType.FLOAT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f7050a[EncryptedSharedPreferences$EncryptedType.BOOLEAN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f7050a[EncryptedSharedPreferences$EncryptedType.STRING_SET.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
