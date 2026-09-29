package p233l3;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import bd.C1365i;

/* JADX INFO: renamed from: l3.d */
/* JADX INFO: loaded from: classes.dex */
public final class C7249d extends AbstractC7247b<C7249d> {

    /* JADX INFO: renamed from: r */
    public C7250e f40720r;

    /* JADX INFO: renamed from: s */
    public float f40721s;

    /* JADX INFO: renamed from: t */
    public boolean f40722t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7249d(Object obj) {
        super(obj);
        C1365i.a aVar = C1365i.f8238L;
        this.f40720r = null;
        this.f40721s = Float.MAX_VALUE;
        this.f40722t = false;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final void m14597c() {
        if (!(this.f40720r.f40724b > 0.0d)) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f40711f) {
            this.f40722t = true;
        }
    }
}
