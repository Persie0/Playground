package p000;

import android.os.Build;
import android.os.IBinder;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zk0 {

    /* JADX INFO: renamed from: a */
    public static final UUID f71668a;

    /* JADX INFO: renamed from: b */
    public static final UUID f71669b;

    /* JADX INFO: renamed from: c */
    public static final UUID f71670c;

    /* JADX INFO: renamed from: d */
    public static final UUID f71671d;

    /* JADX INFO: renamed from: e */
    public static final UUID f71672e;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            IBinder.getSuggestedMaxIpcSizeBytes();
        }
        f71668a = new UUID(0L, 0L);
        f71669b = new UUID(1186680826959645954L, -5988876978535335093L);
        f71670c = new UUID(-2129748144642739255L, 8654423357094679310L);
        f71671d = new UUID(-1301668207276963122L, -6645017420763422227L);
        f71672e = new UUID(-7348484286925749626L, -6083546864340672619L);
    }
}
