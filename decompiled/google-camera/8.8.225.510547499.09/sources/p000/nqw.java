package p000;

import android.os.Looper;
import android.util.Log;
import com.google.geo.lightfield.processing.ProgressCallback;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nqw implements ProgressCallback {

    /* JADX INFO: renamed from: a */
    public static boolean f44094a = false;

    /* JADX INFO: renamed from: b */
    public final ProgressCallback f44095b;

    /* JADX INFO: renamed from: c */
    public nqv f44096c;

    /* JADX INFO: renamed from: d */
    public Looper f44097d;

    /* JADX INFO: renamed from: e */
    private float f44098e = 0.0f;

    /* JADX INFO: renamed from: f */
    private float f44099f = 1.0f;

    public nqw(ProgressCallback progressCallback) {
        this.f44095b = progressCallback;
    }

    /* JADX INFO: renamed from: a */
    public final void m17627a() {
        nqv nqvVar;
        if (!f44094a || (nqvVar = this.f44096c) == null) {
            return;
        }
        f44094a = false;
        nqvVar.sendMessage(nqvVar.obtainMessage(2));
        try {
            this.f44097d.getThread().join();
        } catch (InterruptedException e) {
            Log.e("ProgressInterpolator", e.getMessage());
        }
        this.f44096c = null;
    }

    @Override // com.google.geo.lightfield.processing.ProgressCallback
    public final void setProgress(float f) {
        nqv nqvVar = this.f44096c;
        if (nqvVar == null) {
            return;
        }
        float f2 = (f * this.f44099f) + this.f44098e;
        nqvVar.f44092b = f2;
        ProgressCallback progressCallback = (ProgressCallback) nqvVar.f44091a.get();
        if (progressCallback != null) {
            progressCallback.setProgress(nqvVar.f44093c);
        }
        if (f2 == 1.0f) {
            m17627a();
        }
    }

    @Override // com.google.geo.lightfield.processing.ProgressCallback
    public final void setRange(float f, float f2) {
        this.f44098e = f;
        this.f44099f = f2 - f;
    }

    @Override // com.google.geo.lightfield.processing.ProgressCallback
    public final boolean wasCancelled() {
        return false;
    }
}
