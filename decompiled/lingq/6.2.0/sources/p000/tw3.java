package p000;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.TimeZone;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: classes.dex */
public final class tw3 implements id9 {

    /* JADX INFO: renamed from: H */
    public IOException f62993H;

    /* JADX INFO: renamed from: a */
    public final int f62994a;

    /* JADX INFO: renamed from: b */
    public final mw3 f62995b;

    /* JADX INFO: renamed from: c */
    public final w4b f62996c;

    /* JADX INFO: renamed from: d */
    public long f62997d;

    /* JADX INFO: renamed from: e */
    public long f62998e;

    /* JADX INFO: renamed from: f */
    public final ArrayDeque f62999f;

    /* JADX INFO: renamed from: g */
    public boolean f63000g;

    /* JADX INFO: renamed from: h */
    public final rw3 f63001h;

    /* JADX INFO: renamed from: i */
    public final qw3 f63002i;

    /* JADX INFO: renamed from: j */
    public final sw3 f63003j;

    /* JADX INFO: renamed from: k */
    public final sw3 f63004k;

    /* JADX INFO: renamed from: l */
    public ErrorCode f63005l;

    public tw3(int i, mw3 mw3Var, boolean z, boolean z2, qr3 qr3Var) {
        mw3Var.getClass();
        this.f62994a = i;
        this.f62995b = mw3Var;
        this.f62996c = new w4b(i);
        this.f62998e = mw3Var.f51918M.m12993a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f62999f = arrayDeque;
        this.f63001h = new rw3(this, mw3Var.f51917L.m12993a(), z2);
        this.f63002i = new qw3(this, z);
        this.f63003j = new sw3(this);
        this.f63004k = new sw3(this);
        if (qr3Var == null) {
            if (m22323h()) {
                return;
            }
            C3386nv.m17633t("remotely-initiated streams should have headers");
            throw null;
        }
        if (m22323h()) {
            C3386nv.m17633t("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(qr3Var);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001c  */
    /* JADX INFO: renamed from: a */
    public final void m22317a() {
        boolean z;
        boolean zM22324i;
        TimeZone timeZone = kcb.f47051a;
        synchronized (this) {
            try {
                rw3 rw3Var = this.f63001h;
                if (rw3Var.f59956b || !rw3Var.f59959e) {
                    z = false;
                } else {
                    qw3 qw3Var = this.f63002i;
                    if (qw3Var.f58273a || qw3Var.f58275c) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                zM22324i = m22324i();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            m22319d(ErrorCode.CANCEL, null);
        } else {
            if (zM22324i) {
                return;
            }
            this.f62995b.m17067c(this.f62994a);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m22318b() throws IOException {
        qw3 qw3Var = this.f63002i;
        if (qw3Var.f58275c) {
            v63.m23133k("stream closed");
            return;
        }
        if (qw3Var.f58273a) {
            v63.m23133k("stream finished");
            return;
        }
        if (m22322g() != null) {
            IOException iOException = this.f62993H;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCodeM22322g = m22322g();
            errorCodeM22322g.getClass();
            throw new StreamResetException(errorCodeM22322g);
        }
    }

    @Override // p000.id9
    /* JADX INFO: renamed from: c */
    public final yd9 mo13795c() {
        return this.f63001h;
    }

    /* JADX INFO: renamed from: d */
    public final void m22319d(ErrorCode errorCode, IOException iOException) {
        errorCode.getClass();
        if (m22320e(errorCode, iOException)) {
            mw3 mw3Var = this.f62995b;
            mw3Var.getClass();
            mw3Var.f51923R.m22966q(this.f62994a, errorCode);
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m22320e(ErrorCode errorCode, IOException iOException) {
        TimeZone timeZone = kcb.f47051a;
        synchronized (this) {
            if (m22322g() != null) {
                return false;
            }
            this.f63005l = errorCode;
            this.f62993H = iOException;
            notifyAll();
            if (this.f63001h.f59956b && this.f63002i.f58273a) {
                return false;
            }
            this.f62995b.m17067c(this.f62994a);
            return true;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m22321f(ErrorCode errorCode) {
        errorCode.getClass();
        if (m22320e(errorCode, null)) {
            this.f62995b.m17071q(this.f62994a, errorCode);
        }
    }

    /* JADX INFO: renamed from: g */
    public final ErrorCode m22322g() {
        ErrorCode errorCode;
        synchronized (this) {
            errorCode = this.f63005l;
        }
        return errorCode;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m22323h() {
        boolean z = (this.f62994a & 1) == 1;
        this.f62995b.getClass();
        return true == z;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m22324i() {
        synchronized (this) {
            try {
                if (m22322g() != null) {
                    return false;
                }
                rw3 rw3Var = this.f63001h;
                if (rw3Var.f59956b || rw3Var.f59959e) {
                    qw3 qw3Var = this.f63002i;
                    if ((qw3Var.f58273a || qw3Var.f58275c) && this.f63000g) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m22325j(qr3 qr3Var, boolean z) {
        boolean zM22324i;
        qr3Var.getClass();
        TimeZone timeZone = kcb.f47051a;
        synchronized (this) {
            try {
                if (this.f63000g && qr3Var.m20121d(":status") == null && qr3Var.m20121d(":method") == null) {
                    this.f63001h.getClass();
                } else {
                    this.f63000g = true;
                    this.f62999f.add(qr3Var);
                }
                if (z) {
                    this.f63001h.f59956b = true;
                }
                zM22324i = m22324i();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zM22324i) {
            return;
        }
        this.f62995b.m17067c(this.f62994a);
    }

    @Override // p000.id9
    /* JADX INFO: renamed from: n */
    public final t89 mo13796n() {
        return this.f63002i;
    }
}
