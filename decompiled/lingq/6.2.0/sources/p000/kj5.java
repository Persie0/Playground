package p000;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: loaded from: classes2.dex */
public final class kj5 extends Writer {

    /* JADX INFO: renamed from: b */
    public final StringBuilder f47394b = new StringBuilder(128);

    /* JADX INFO: renamed from: a */
    public final String f47393a = "FragmentManager";

    /* JADX INFO: renamed from: a */
    public final void m15272a() {
        StringBuilder sb = this.f47394b;
        if (sb.length() > 0) {
            Log.d(this.f47393a, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m15272a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m15272a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m15272a();
            } else {
                this.f47394b.append(c);
            }
        }
    }
}
