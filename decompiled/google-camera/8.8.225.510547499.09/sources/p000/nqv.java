package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.geo.lightfield.processing.ProgressCallback;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nqv extends Handler {

    /* JADX INFO: renamed from: a */
    public final WeakReference f44091a;

    /* JADX INFO: renamed from: b */
    public float f44092b;

    /* JADX INFO: renamed from: c */
    public float f44093c;

    public nqv(ProgressCallback progressCallback, Looper looper) {
        super(looper);
        this.f44092b = 0.0f;
        this.f44093c = 0.0f;
        this.f44091a = new WeakReference(progressCallback);
    }

    /* JADX INFO: renamed from: a */
    public final void m17626a() {
        sendMessageDelayed(obtainMessage(1, 0, 0), 250L);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005b  */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        float fMax;
        if (message.what == 2) {
            removeMessages(1);
            nqw.f44094a = false;
            Looper.myLooper().quitSafely();
            return;
        }
        ProgressCallback progressCallback = (ProgressCallback) this.f44091a.get();
        if (progressCallback == null) {
            return;
        }
        if ((Float.isNaN(this.f44093c) || this.f44093c == 0.0f) && this.f44092b > 0.0f) {
            fMax = this.f44092b;
            this.f44093c = fMax;
        } else {
            float f = this.f44092b;
            if (f >= 0.99f) {
                fMax = this.f44092b;
                this.f44093c = fMax;
            } else {
                float f2 = this.f44093c;
                float f3 = ((1.0f - f) * 0.75f) + (0.05f * f);
                fMax = Math.max(f2, (f3 * f2) + (f * (1.0f - f3)));
                this.f44093c = fMax;
            }
        }
        progressCallback.setProgress(fMax);
        m17626a();
    }
}
