package p007a6;

import android.os.Build;
import android.util.Log;
import com.kochava.core.BuildConfig;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: a6.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0039r {

    /* JADX INFO: renamed from: g */
    public static final boolean f35g;

    /* JADX INFO: renamed from: h */
    public static final boolean f36h;

    /* JADX INFO: renamed from: i */
    public static final File f37i;

    /* JADX INFO: renamed from: j */
    public static volatile C0039r f38j;

    /* JADX INFO: renamed from: k */
    public static volatile int f39k;

    /* JADX INFO: renamed from: a */
    public final boolean f40a;

    /* JADX INFO: renamed from: b */
    public final int f41b;

    /* JADX INFO: renamed from: c */
    public final int f42c;

    /* JADX INFO: renamed from: d */
    public int f43d;

    /* JADX INFO: renamed from: e */
    public boolean f44e = true;

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f45f = new AtomicBoolean(false);

    static {
        f35g = Build.VERSION.SDK_INT < 29;
        f36h = true;
        f37i = new File("/proc/self/fd");
        f39k = -1;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00a3  */
    public C0039r() {
        boolean z10;
        boolean z11;
        if (Build.VERSION.SDK_INT == 26) {
            Iterator it = Arrays.asList("SC-04J", "SM-N935", "SM-J720", "SM-G570F", "SM-G570M", "SM-G960", "SM-G965", "SM-G935", "SM-G930", "SM-A520", "SM-A720F", "moto e5", "moto e5 play", "moto e5 plus", "moto e5 cruise", "moto g(6) forge", "moto g(6) play").iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                } else {
                    if (Build.MODEL.startsWith((String) it.next())) {
                        z10 = true;
                        break;
                    }
                }
            }
        } else {
            z10 = false;
            break;
        }
        if (!z10) {
            z11 = Build.VERSION.SDK_INT != 27 ? false : Arrays.asList("LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM").contains(Build.MODEL) ? false : true;
        }
        this.f40a = z11;
        if (Build.VERSION.SDK_INT >= 28) {
            this.f41b = BuildConfig.SDK_DEFAULT_NETWORK_TIMEOUT_MILLIS;
            this.f42c = 0;
        } else {
            this.f41b = 700;
            this.f42c = com.kochava.tracker.BuildConfig.SDK_TRUNCATE_LENGTH;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m169a(int i10, int i11, boolean z10, boolean z11) {
        boolean z12;
        if (!z10) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        }
        if (!this.f40a) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by device model");
            }
            return false;
        }
        if (!f36h) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        }
        if (f35g && !this.f45f.get()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        }
        if (z11) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        int i12 = this.f42c;
        if (i10 < i12) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because width is too small");
            }
            return false;
        }
        if (i11 < i12) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because height is too small");
            }
            return false;
        }
        synchronized (this) {
            try {
                int i13 = this.f43d + 1;
                this.f43d = i13;
                if (i13 >= 50) {
                    this.f43d = 0;
                    int length = f37i.list().length;
                    long j10 = f39k != -1 ? f39k : this.f41b;
                    boolean z13 = ((long) length) < j10;
                    this.f44e = z13;
                    if (!z13 && Log.isLoggable("Downsampler", 5)) {
                        Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + j10);
                    }
                }
                z12 = this.f44e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z12) {
            return true;
        }
        if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
        }
        return false;
    }
}
