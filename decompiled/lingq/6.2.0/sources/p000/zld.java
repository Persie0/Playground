package p000;

import com.google.android.gms.internal.measurement.AbstractC0965i;
import com.google.common.util.concurrent.AbstractC1112b;
import com.google.common.util.concurrent.AbstractC1120j;
import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
public final class zld implements Runnable, Closeable {

    /* JADX INFO: renamed from: a */
    public gmd f71720a;

    /* JADX INFO: renamed from: b */
    public final boolean f71721b = AbstractC3695vr.m23489G(Thread.currentThread());

    /* JADX INFO: renamed from: c */
    public boolean f71722c;

    /* JADX INFO: renamed from: d */
    public boolean f71723d;

    /* JADX INFO: renamed from: e */
    public final boolean f71724e;

    public zld(gmd gmdVar, boolean z) {
        this.f71724e = false;
        this.f71720a = gmdVar;
        this.f71724e = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m25697a(AbstractC1112b abstractC1112b) {
        if (this.f71722c) {
            C3386nv.m17633t("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
        } else if (this.f71723d) {
            C3386nv.m17633t("Signal is already attached to future");
        } else {
            this.f71723d = true;
            abstractC1112b.mo52a(this, AbstractC1120j.m6404a());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        gmd gmdVar = this.f71720a;
        try {
            this.f71720a = null;
            boolean z = this.f71723d;
            if (!z) {
                if (this.f71722c) {
                    throw new IllegalStateException("Span was already closed!");
                }
                this.f71722c = true;
                if (this.f71721b && !z) {
                    AbstractC3695vr.m23489G(Thread.currentThread());
                }
            }
            if (gmdVar != null) {
                ((AbstractC0965i) gmdVar).close();
            }
            if (this.f71724e) {
                qld.m20021b(qld.m20022c(), yld.f70046g);
            }
        } catch (Throwable th) {
            if (gmdVar != null) {
                try {
                    ((AbstractC0965i) gmdVar).close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        if (this.f71722c || !(z = this.f71723d)) {
            AbstractC3695vr.m23490H().post(ddb.f35479d);
            return;
        }
        this.f71722c = true;
        if (!this.f71721b || z) {
            return;
        }
        AbstractC3695vr.m23489G(Thread.currentThread());
    }
}
