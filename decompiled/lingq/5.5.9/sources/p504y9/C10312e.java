package p504y9;

import android.media.MediaCodec;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;
import p479xa.C10136e;

/* JADX INFO: renamed from: y9.e */
/* JADX INFO: loaded from: classes.dex */
public final class C10312e {

    /* JADX INFO: renamed from: g */
    public static final ArrayDeque<a> f51843g = new ArrayDeque<>();

    /* JADX INFO: renamed from: h */
    public static final Object f51844h = new Object();

    /* JADX INFO: renamed from: a */
    public final MediaCodec f51845a;

    /* JADX INFO: renamed from: b */
    public final HandlerThread f51846b;

    /* JADX INFO: renamed from: c */
    public HandlerC10311d f51847c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference<RuntimeException> f51848d;

    /* JADX INFO: renamed from: e */
    public final C10136e f51849e;

    /* JADX INFO: renamed from: f */
    public boolean f51850f;

    /* JADX INFO: renamed from: y9.e$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f51851a;

        /* JADX INFO: renamed from: b */
        public int f51852b;

        /* JADX INFO: renamed from: c */
        public int f51853c;

        /* JADX INFO: renamed from: d */
        public final MediaCodec.CryptoInfo f51854d = new MediaCodec.CryptoInfo();

        /* JADX INFO: renamed from: e */
        public long f51855e;

        /* JADX INFO: renamed from: f */
        public int f51856f;
    }

    public C10312e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        C10136e c10136e = new C10136e();
        this.f51845a = mediaCodec;
        this.f51846b = handlerThread;
        this.f51849e = c10136e;
        this.f51848d = new AtomicReference<>();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final void m19314a() {
        if (this.f51850f) {
            try {
                HandlerC10311d handlerC10311d = this.f51847c;
                handlerC10311d.getClass();
                handlerC10311d.removeCallbacksAndMessages(null);
                C10136e c10136e = this.f51849e;
                synchronized (c10136e) {
                    c10136e.f51371a = false;
                }
                HandlerC10311d handlerC10311d2 = this.f51847c;
                handlerC10311d2.getClass();
                handlerC10311d2.obtainMessage(2).sendToTarget();
                synchronized (c10136e) {
                    while (!c10136e.f51371a) {
                        c10136e.wait();
                    }
                }
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m19315b() {
        RuntimeException andSet = this.f51848d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }
}
