package p000;

import androidx.sqlite.p006db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class zg3 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f71531a;

    static {
        int[] iArr = new int[FrameworkSQLiteOpenHelper$OpenHelper$CallbackName.values().length];
        try {
            iArr[FrameworkSQLiteOpenHelper$OpenHelper$CallbackName.ON_CONFIGURE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FrameworkSQLiteOpenHelper$OpenHelper$CallbackName.ON_CREATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FrameworkSQLiteOpenHelper$OpenHelper$CallbackName.ON_UPGRADE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[FrameworkSQLiteOpenHelper$OpenHelper$CallbackName.ON_DOWNGRADE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[FrameworkSQLiteOpenHelper$OpenHelper$CallbackName.ON_OPEN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f71531a = iArr;
    }
}
