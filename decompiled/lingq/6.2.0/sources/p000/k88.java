package p000;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class k88 extends Reader {

    /* JADX INFO: renamed from: a */
    public final hj0 f46863a;

    /* JADX INFO: renamed from: b */
    public final Charset f46864b;

    /* JADX INFO: renamed from: c */
    public boolean f46865c;

    /* JADX INFO: renamed from: d */
    public InputStreamReader f46866d;

    public k88(hj0 hj0Var, Charset charset) {
        hj0Var.getClass();
        charset.getClass();
        this.f46863a = hj0Var;
        this.f46864b = charset;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f46865c = true;
        InputStreamReader inputStreamReader = this.f46866d;
        if (inputStreamReader != null) {
            inputStreamReader.close();
        } else {
            this.f46863a.close();
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws IOException {
        cArr.getClass();
        if (this.f46865c) {
            v63.m23133k("Stream closed");
            return 0;
        }
        InputStreamReader inputStreamReader = this.f46866d;
        if (inputStreamReader == null) {
            hj0 hj0Var = this.f46863a;
            inputStreamReader = new InputStreamReader(hj0Var.mo480f0(), kcb.m15115f(hj0Var, this.f46864b));
            this.f46866d = inputStreamReader;
        }
        return inputStreamReader.read(cArr, i, i2);
    }
}
