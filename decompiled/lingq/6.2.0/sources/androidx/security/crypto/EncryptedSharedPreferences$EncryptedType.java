package androidx.security.crypto;

/* JADX INFO: loaded from: classes2.dex */
enum EncryptedSharedPreferences$EncryptedType {
    STRING(0),
    STRING_SET(1),
    INT(2),
    LONG(3),
    FLOAT(4),
    BOOLEAN(5);

    private final int mId;

    EncryptedSharedPreferences$EncryptedType(int i) {
        this.mId = i;
    }

    public static EncryptedSharedPreferences$EncryptedType fromId(int i) {
        if (i == 0) {
            return STRING;
        }
        if (i == 1) {
            return STRING_SET;
        }
        if (i == 2) {
            return INT;
        }
        if (i == 3) {
            return LONG;
        }
        if (i == 4) {
            return FLOAT;
        }
        if (i != 5) {
            return null;
        }
        return BOOLEAN;
    }

    public int getId() {
        return this.mId;
    }
}
