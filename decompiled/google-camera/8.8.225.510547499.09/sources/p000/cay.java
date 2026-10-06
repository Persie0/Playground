package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Queue;
import p021j$.p024io.DesugarInputStream;
import p021j$.p024io.InputStreamRetargetInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cay extends InputStream implements InputStreamRetargetInterface {

    /* JADX INFO: renamed from: a */
    public static final Queue f4937a = cbi.m3386g(0);

    /* JADX INFO: renamed from: b */
    public InputStream f4938b;

    /* JADX INFO: renamed from: c */
    public IOException f4939c;

    /* JADX INFO: renamed from: a */
    public final void m3370a() {
        this.f4939c = null;
        this.f4938b = null;
        Queue queue = f4937a;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f4938b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f4938b.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f4938b.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.f4938b.read();
        } catch (IOException e) {
            this.f4939c = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f4938b.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        try {
            return this.f4938b.skip(j);
        } catch (IOException e) {
            this.f4939c = e;
            throw e;
        }
    }

    @Override // java.io.InputStream, p021j$.p024io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.f4938b.read(bArr);
        } catch (IOException e) {
            this.f4939c = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f4938b.read(bArr, i, i2);
        } catch (IOException e) {
            this.f4939c = e;
            throw e;
        }
    }
}
