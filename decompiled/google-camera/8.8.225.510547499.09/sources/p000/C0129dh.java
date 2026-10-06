package p000;

import java.io.Writer;

/* JADX INFO: renamed from: dh */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0129dh extends Writer {

    /* JADX INFO: renamed from: a */
    private final StringBuilder f11016a = new StringBuilder(128);

    /* JADX INFO: renamed from: a */
    private final void m6140a() {
        if (this.f11016a.length() > 0) {
            this.f11016a.toString();
            StringBuilder sb = this.f11016a;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m6140a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m6140a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m6140a();
            } else {
                this.f11016a.append(c);
            }
        }
    }
}
