package p000;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class cuh implements kba {

    /* JADX INFO: renamed from: a */
    private HandlerThread f9631a;

    /* JADX INFO: renamed from: b */
    private Handler f9632b;

    /* JADX INFO: renamed from: c */
    private juy f9633c;

    /* JADX INFO: renamed from: d */
    private boolean f9634d = false;

    /* JADX INFO: renamed from: e */
    private final Object f9635e = new Object();

    /* JADX INFO: renamed from: f */
    private final cwd f9636f;

    public cuh(cwd cwdVar, byte[] bArr) {
        this.f9636f = cwdVar;
    }

    /* JADX INFO: renamed from: c */
    private final void m5524c() {
        synchronized (this.f9635e) {
            if (this.f9634d) {
                return;
            }
            HandlerThread handlerThread = new HandlerThread("CamcorderCameraHandler");
            this.f9631a = handlerThread;
            handlerThread.start();
            this.f9632b = jvh.m13557e(this.f9631a.getLooper());
            this.f9633c = new juy(this.f9632b);
            this.f9636f.m5657d(cum.CAPTURE_SESSION).m13537d(this);
            this.f9634d = true;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Handler m5525a() {
        m5524c();
        Handler handler = this.f9632b;
        handler.getClass();
        return handler;
    }

    /* JADX INFO: renamed from: b */
    public final juy m5526b() {
        m5524c();
        juy juyVar = this.f9633c;
        juyVar.getClass();
        return juyVar;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f9635e) {
            if (this.f9634d) {
                HandlerThread handlerThread = this.f9631a;
                if (handlerThread != null) {
                    handlerThread.quit();
                }
                this.f9631a = null;
                this.f9632b = null;
                this.f9633c = null;
                this.f9634d = false;
            }
        }
    }
}
