package p000;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes.dex */
public final class ou2 extends vc3 {

    /* JADX INFO: renamed from: b */
    public final long f54994b;

    /* JADX INFO: renamed from: c */
    public final boolean f54995c;

    /* JADX INFO: renamed from: d */
    public boolean f54996d;

    /* JADX INFO: renamed from: e */
    public long f54997e;

    /* JADX INFO: renamed from: f */
    public boolean f54998f;

    /* JADX INFO: renamed from: g */
    public boolean f54999g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C3552rx f55000h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ou2(C3552rx c3552rx, t89 t89Var, long j, boolean z) {
        super(t89Var);
        t89Var.getClass();
        this.f55000h = c3552rx;
        this.f54994b = j;
        this.f54995c = z;
        this.f54998f = z;
    }

    @Override // p000.vc3, p000.t89
    /* JADX INFO: renamed from: X */
    public final void mo471X(aj0 aj0Var, long j) throws IOException {
        if (this.f54999g) {
            C3386nv.m17633t("closed");
            return;
        }
        long j2 = this.f54994b;
        if (j2 != -1 && this.f54997e + j > j2) {
            StringBuilder sbM22996s = ux5.m22996s(j2, "expected ", " bytes but received ");
            sbM22996s.append(this.f54997e + j);
            throw new ProtocolException(sbM22996s.toString());
        }
        try {
            if (this.f54998f) {
                this.f54998f = false;
            }
            this.f65181a.mo471X(aj0Var, j);
            this.f54997e += j;
        } catch (IOException e) {
            IOException iOExceptionM18513a = m18513a(e);
            iOExceptionM18513a.getClass();
            throw iOExceptionM18513a;
        }
    }

    /* JADX INFO: renamed from: a */
    public final IOException m18513a(IOException iOException) {
        if (this.f54996d) {
            return iOException;
        }
        this.f54996d = true;
        return C3552rx.m20966b(this.f55000h, this.f54995c, iOException, 4);
    }

    @Override // p000.vc3, p000.t89, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f54999g) {
            return;
        }
        this.f54999g = true;
        long j = this.f54994b;
        if (j != -1 && this.f54997e != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            m18513a(null);
        } catch (IOException e) {
            IOException iOExceptionM18513a = m18513a(e);
            iOExceptionM18513a.getClass();
            throw iOExceptionM18513a;
        }
    }

    @Override // p000.vc3, p000.t89, java.io.Flushable
    public final void flush() throws IOException {
        try {
            super.flush();
        } catch (IOException e) {
            IOException iOExceptionM18513a = m18513a(e);
            iOExceptionM18513a.getClass();
            throw iOExceptionM18513a;
        }
    }
}
