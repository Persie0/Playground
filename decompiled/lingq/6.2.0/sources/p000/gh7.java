package p000;

import androidx.room.Transactor$SQLiteTransactionType;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class gh7 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f40822a;

    static {
        int[] iArr = new int[Transactor$SQLiteTransactionType.values().length];
        try {
            iArr[Transactor$SQLiteTransactionType.DEFERRED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Transactor$SQLiteTransactionType.IMMEDIATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Transactor$SQLiteTransactionType.EXCLUSIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f40822a = iArr;
    }
}
