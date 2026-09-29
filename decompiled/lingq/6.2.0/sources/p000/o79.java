package p000;

import androidx.media3.decoder.DecoderException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o79 implements k32 {

    /* JADX INFO: renamed from: a */
    public final n79 f53943a;

    /* JADX INFO: renamed from: e */
    public final m32[] f53947e;

    /* JADX INFO: renamed from: f */
    public final n32[] f53948f;

    /* JADX INFO: renamed from: g */
    public int f53949g;

    /* JADX INFO: renamed from: h */
    public int f53950h;

    /* JADX INFO: renamed from: i */
    public m32 f53951i;

    /* JADX INFO: renamed from: j */
    public DecoderException f53952j;

    /* JADX INFO: renamed from: k */
    public boolean f53953k;

    /* JADX INFO: renamed from: l */
    public boolean f53954l;

    /* JADX INFO: renamed from: b */
    public final Object f53944b = new Object();

    /* JADX INFO: renamed from: m */
    public long f53955m = -9223372036854775807L;

    /* JADX INFO: renamed from: c */
    public final ArrayDeque f53945c = new ArrayDeque();

    /* JADX INFO: renamed from: d */
    public final ArrayDeque f53946d = new ArrayDeque();

    public o79(m32[] m32VarArr, n32[] n32VarArr) {
        this.f53947e = m32VarArr;
        this.f53949g = m32VarArr.length;
        for (int i = 0; i < this.f53949g; i++) {
            this.f53947e[i] = mo11041g();
        }
        this.f53948f = n32VarArr;
        this.f53950h = n32VarArr.length;
        for (int i2 = 0; i2 < this.f53950h; i2++) {
            this.f53948f[i2] = mo11042h();
        }
        n79 n79Var = new n79(this);
        this.f53943a = n79Var;
        n79Var.start();
    }

    @Override // p000.k32
    /* JADX INFO: renamed from: a */
    public final void mo14782a() {
        synchronized (this.f53944b) {
            this.f53954l = true;
            this.f53944b.notify();
        }
        try {
            this.f53943a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // p000.k32
    /* JADX INFO: renamed from: b */
    public final void mo14783b(long j) {
        synchronized (this.f53944b) {
            try {
                bna.m3987z(this.f53949g == this.f53947e.length || this.f53953k);
                this.f53955m = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.k32
    /* JADX INFO: renamed from: e */
    public final Object mo14785e() {
        m32 m32Var;
        synchronized (this.f53944b) {
            try {
                DecoderException decoderException = this.f53952j;
                if (decoderException != null) {
                    throw decoderException;
                }
                bna.m3987z(this.f53951i == null);
                int i = this.f53949g;
                if (i == 0) {
                    m32Var = null;
                } else {
                    m32[] m32VarArr = this.f53947e;
                    int i2 = i - 1;
                    this.f53949g = i2;
                    m32Var = m32VarArr[i2];
                }
                this.f53951i = m32Var;
            } catch (Throwable th) {
                throw th;
            }
        }
        return m32Var;
    }

    @Override // p000.k32
    public final void flush() {
        synchronized (this.f53944b) {
            try {
                this.f53953k = true;
                m32 m32Var = this.f53951i;
                if (m32Var != null) {
                    m32Var.mo16607k();
                    m32[] m32VarArr = this.f53947e;
                    int i = this.f53949g;
                    this.f53949g = i + 1;
                    m32VarArr[i] = m32Var;
                    this.f53951i = null;
                }
                while (!this.f53945c.isEmpty()) {
                    m32 m32Var2 = (m32) this.f53945c.removeFirst();
                    m32Var2.mo16607k();
                    m32[] m32VarArr2 = this.f53947e;
                    int i2 = this.f53949g;
                    this.f53949g = i2 + 1;
                    m32VarArr2[i2] = m32Var2;
                }
                while (!this.f53946d.isEmpty()) {
                    ((n32) this.f53946d.removeFirst()).mo10292m();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract m32 mo11041g();

    /* JADX INFO: renamed from: h */
    public abstract n32 mo11042h();

    /* JADX INFO: renamed from: i */
    public abstract DecoderException mo11043i(Throwable th);

    /* JADX INFO: renamed from: j */
    public abstract DecoderException mo11044j(m32 m32Var, n32 n32Var, boolean z);

    /* JADX INFO: renamed from: k */
    public final boolean m17831k() {
        boolean z;
        DecoderException decoderExceptionMo11043i;
        synchronized (this.f53944b) {
            while (!this.f53954l) {
                try {
                    if (!this.f53945c.isEmpty() && this.f53950h > 0) {
                        break;
                    }
                    this.f53944b.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f53954l) {
                return false;
            }
            m32 m32Var = (m32) this.f53945c.removeFirst();
            n32[] n32VarArr = this.f53948f;
            int i = this.f53950h - 1;
            this.f53950h = i;
            n32 n32Var = n32VarArr[i];
            boolean z2 = this.f53953k;
            this.f53953k = false;
            if (m32Var.m3751d(4)) {
                n32Var.f8576b = 4 | n32Var.f8576b;
            } else {
                n32Var.f52260c = m32Var.f50502g;
                if (m32Var.m3751d(134217728)) {
                    n32Var.f8576b = 134217728 | n32Var.f8576b;
                }
                long j = m32Var.f50502g;
                synchronized (this.f53944b) {
                    long j2 = this.f53955m;
                    z = j2 == -9223372036854775807L || j >= j2;
                }
                if (!z) {
                    n32Var.f52261d = true;
                }
                try {
                    decoderExceptionMo11043i = mo11044j(m32Var, n32Var, z2);
                } catch (OutOfMemoryError e) {
                    decoderExceptionMo11043i = mo11043i(e);
                } catch (RuntimeException e2) {
                    decoderExceptionMo11043i = mo11043i(e2);
                }
                if (decoderExceptionMo11043i != null) {
                    synchronized (this.f53944b) {
                        this.f53952j = decoderExceptionMo11043i;
                    }
                    return false;
                }
            }
            synchronized (this.f53944b) {
                try {
                    if (this.f53953k || n32Var.f52261d) {
                        n32Var.mo10292m();
                    } else {
                        this.f53946d.addLast(n32Var);
                    }
                    m32Var.mo16607k();
                    m32[] m32VarArr = this.f53947e;
                    int i2 = this.f53949g;
                    this.f53949g = i2 + 1;
                    m32VarArr[i2] = m32Var;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: l */
    public /* bridge */ dd0 m17832l() {
        return (dd0) mo14784d();
    }

    @Override // p000.k32
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final n32 mo14784d() {
        synchronized (this.f53944b) {
            try {
                DecoderException decoderException = this.f53952j;
                if (decoderException != null) {
                    throw decoderException;
                }
                if (this.f53946d.isEmpty()) {
                    return null;
                }
                return (n32) this.f53946d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.k32
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void mo14786f(m32 m32Var) {
        synchronized (this.f53944b) {
            try {
                DecoderException decoderException = this.f53952j;
                if (decoderException != null) {
                    throw decoderException;
                }
                bna.m3969q(m32Var == this.f53951i);
                this.f53945c.addLast(m32Var);
                if (!this.f53945c.isEmpty() && this.f53950h > 0) {
                    this.f53944b.notify();
                }
                this.f53951i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m17835o(n32 n32Var) {
        synchronized (this.f53944b) {
            n32Var.mo10291k();
            n32[] n32VarArr = this.f53948f;
            int i = this.f53950h;
            this.f53950h = i + 1;
            n32VarArr[i] = n32Var;
            if (!this.f53945c.isEmpty() && this.f53950h > 0) {
                this.f53944b.notify();
            }
        }
    }
}
