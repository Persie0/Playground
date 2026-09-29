package p000;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class lzc implements Closeable {

    /* JADX INFO: renamed from: f */
    public static final HashMap f50364f = new HashMap();

    /* JADX INFO: renamed from: a */
    public int f50365a;

    /* JADX INFO: renamed from: b */
    public long f50366b;

    /* JADX INFO: renamed from: c */
    public long f50367c;

    /* JADX INFO: renamed from: d */
    public long f50368d = 2147483647L;

    /* JADX INFO: renamed from: e */
    public long f50369e = -2147483648L;

    public lzc(String str) {
    }

    /* JADX INFO: renamed from: a */
    public void mo10760a() {
        this.f50366b = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    /* JADX INFO: renamed from: b */
    public void mo10761b(long j) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j2 = this.f50367c;
        if (j2 != 0 && jElapsedRealtimeNanos - j2 >= 1000000) {
            this.f50365a = 0;
            this.f50366b = 0L;
            this.f50368d = 2147483647L;
            this.f50369e = -2147483648L;
        }
        this.f50367c = jElapsedRealtimeNanos;
        this.f50365a++;
        this.f50368d = Math.min(this.f50368d, j);
        this.f50369e = Math.max(this.f50369e, j);
        if (this.f50365a % 50 == 0) {
            Locale locale = Locale.US;
            a3d.m80r();
        }
        if (this.f50365a % 500 == 0) {
            this.f50365a = 0;
            this.f50366b = 0L;
            this.f50368d = 2147483647L;
            this.f50369e = -2147483648L;
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo10762c(long j) {
        mo10761b((SystemClock.elapsedRealtimeNanos() / 1000) - j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j = this.f50366b;
        if (j != 0) {
            mo10762c(j);
        } else {
            C3386nv.m17633t("Did you forget to call start()?");
        }
    }
}
