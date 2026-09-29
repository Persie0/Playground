package androidx.fragment.app;

import android.util.Log;
import com.kochava.tracker.BuildConfig;
import java.io.Writer;

/* JADX INFO: renamed from: androidx.fragment.app.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0982u0 extends Writer {

    /* JADX INFO: renamed from: b */
    public final StringBuilder f6425b = new StringBuilder(BuildConfig.SDK_TRUNCATE_LENGTH);

    /* JADX INFO: renamed from: a */
    public final String f6424a = "FragmentManager";

    /* JADX INFO: renamed from: a */
    public final void m3815a() {
        StringBuilder sb2 = this.f6425b;
        if (sb2.length() > 0) {
            Log.d(this.f6424a, sb2.toString());
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m3815a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m3815a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                m3815a();
            } else {
                this.f6425b.append(c10);
            }
        }
    }
}
