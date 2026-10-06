package p000;

import android.content.Context;
import android.os.Environment;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum krm {
    DCIM,
    PICTURES,
    MOVIES,
    APP_DATA,
    f37067e;

    /* JADX INFO: renamed from: a */
    public final File m14771a(Context context) {
        switch (this) {
            case DCIM:
                return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
            case PICTURES:
                return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
            case MOVIES:
                return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES);
            case APP_DATA:
                return context.getFilesDir();
            case f37067e:
                return context.getCacheDir();
            default:
                throw new IllegalStateException("Unknown MediaDirectory ".concat(toString()));
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m14772b() {
        switch (this) {
            case DCIM:
            case PICTURES:
            case MOVIES:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m14773c(String str) {
        switch (this) {
            case DCIM:
                return kxk.m15012e(str) || kxk.m15013f(str);
            case PICTURES:
                return kxk.m15012e(str);
            case MOVIES:
                return kxk.m15013f(str);
            case APP_DATA:
            case f37067e:
                return true;
            default:
                return false;
        }
    }
}
