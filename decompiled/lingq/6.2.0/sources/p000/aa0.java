package p000;

import androidx.room.RoomDatabase$JournalMode;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class aa0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f402a;

    static {
        int[] iArr = new int[RoomDatabase$JournalMode.values().length];
        try {
            iArr[RoomDatabase$JournalMode.TRUNCATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RoomDatabase$JournalMode.WRITE_AHEAD_LOGGING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f402a = iArr;
    }
}
