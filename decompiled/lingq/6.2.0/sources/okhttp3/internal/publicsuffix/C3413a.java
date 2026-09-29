package okhttp3.internal.publicsuffix;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import okio.ByteString;
import p000.AbstractC3584sr;
import p000.C2927dg;
import p000.e18;
import p000.f64;
import p000.fa4;
import p000.r46;
import p000.u87;
import p000.v63;

/* JADX INFO: renamed from: okhttp3.internal.publicsuffix.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C3413a {

    /* JADX INFO: renamed from: c */
    public ByteString f54505c;

    /* JADX INFO: renamed from: d */
    public ByteString f54506d;

    /* JADX INFO: renamed from: e */
    public IOException f54507e;

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f54503a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public final CountDownLatch f54504b = new CountDownLatch(1);

    /* JADX INFO: renamed from: f */
    public final String f54508f = "PublicSuffixDatabase.list";

    /* JADX WARN: Code duplicated, block: B:28:0x0034 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final void m18064a() {
        AtomicBoolean atomicBoolean = this.f54503a;
        if (atomicBoolean.get()) {
            this.f54504b.await();
        } else {
            boolean z = false;
            if (atomicBoolean.compareAndSet(false, true)) {
                while (true) {
                    try {
                        try {
                            m18067d();
                            break;
                        } catch (InterruptedIOException unused) {
                            Thread.interrupted();
                            z = true;
                        } catch (IOException e) {
                            this.f54507e = e;
                            if (z) {
                            }
                        }
                    } catch (Throwable th) {
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            } else {
                try {
                    this.f54504b.await();
                } catch (InterruptedException unused2) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        if (this.f54505c != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Unable to load " + ((Object) this.f54508f) + " resource.");
        illegalStateException.initCause(this.f54507e);
        throw illegalStateException;
    }

    /* JADX INFO: renamed from: b */
    public final ByteString m18065b() {
        ByteString byteString = this.f54505c;
        if (byteString != null) {
            return byteString;
        }
        fa4.m11636J("bytes");
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public final ByteString m18066c() {
        ByteString byteString = this.f54506d;
        if (byteString != null) {
            return byteString;
        }
        fa4.m11636J("exceptionBytes");
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final void m18067d() {
        try {
            C2927dg c2927dg = u87.f63590a;
            C2927dg c2927dg2 = u87.f63590a;
            f64 f64VarM20369L = null;
            if (c2927dg2 == null) {
                c2927dg2 = null;
            }
            Context context = c2927dg2 != null ? c2927dg2.f35577c : null;
            AssetManager assets = context != null ? context.getAssets() : null;
            if (assets != null) {
                InputStream inputStreamOpen = assets.open(this.f54508f);
                inputStreamOpen.getClass();
                f64VarM20369L = r46.m20369L(inputStreamOpen);
            } else if (Build.FINGERPRINT == null) {
                v63.m23133k("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            } else {
                v63.m23133k("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
            }
            e18 e18Var = new e18(f64VarM20369L);
            try {
                ByteString byteStringMo497s = e18Var.mo497s(e18Var.readInt());
                ByteString byteStringMo497s2 = e18Var.mo497s(e18Var.readInt());
                e18Var.close();
                synchronized (this) {
                    byteStringMo497s.getClass();
                    this.f54505c = byteStringMo497s;
                    byteStringMo497s2.getClass();
                    this.f54506d = byteStringMo497s2;
                }
                this.f54504b.countDown();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3584sr.m21646y(e18Var, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            this.f54504b.countDown();
            throw th3;
        }
    }
}
