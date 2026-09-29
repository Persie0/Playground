package p000;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class yf9 {

    /* JADX INFO: renamed from: p */
    public static final sn2 f69777p = new sn2(1);

    /* JADX INFO: renamed from: q */
    public static final sn2 f69778q = new sn2(2);

    /* JADX INFO: renamed from: r */
    public static final sn2 f69779r = new sn2(3);

    /* JADX INFO: renamed from: s */
    public static final sn2 f69780s = new sn2(4);

    /* JADX INFO: renamed from: t */
    public static final sn2 f69781t = new sn2(5);

    /* JADX INFO: renamed from: u */
    public static final sn2 f69782u = new sn2(0);

    /* JADX INFO: renamed from: a */
    public float f69783a;

    /* JADX INFO: renamed from: b */
    public float f69784b;

    /* JADX INFO: renamed from: c */
    public boolean f69785c;

    /* JADX INFO: renamed from: d */
    public final Object f69786d;

    /* JADX INFO: renamed from: e */
    public final AbstractC3184kh f69787e;

    /* JADX INFO: renamed from: f */
    public boolean f69788f;

    /* JADX INFO: renamed from: g */
    public float f69789g;

    /* JADX INFO: renamed from: h */
    public float f69790h;

    /* JADX INFO: renamed from: i */
    public long f69791i;

    /* JADX INFO: renamed from: j */
    public float f69792j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f69793k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f69794l;

    /* JADX INFO: renamed from: m */
    public zf9 f69795m;

    /* JADX INFO: renamed from: n */
    public float f69796n;

    /* JADX INFO: renamed from: o */
    public boolean f69797o;

    public yf9(Object obj, AbstractC3184kh abstractC3184kh) {
        this.f69783a = 0.0f;
        this.f69784b = Float.MAX_VALUE;
        this.f69785c = false;
        this.f69788f = false;
        this.f69789g = Float.MAX_VALUE;
        this.f69790h = -3.4028235E38f;
        this.f69791i = 0L;
        this.f69793k = new ArrayList();
        this.f69794l = new ArrayList();
        this.f69786d = obj;
        this.f69787e = abstractC3184kh;
        if (abstractC3184kh == f69779r || abstractC3184kh == f69780s || abstractC3184kh == f69781t) {
            this.f69792j = 0.1f;
        } else if (abstractC3184kh == f69782u) {
            this.f69792j = 0.00390625f;
        } else if (abstractC3184kh == f69777p || abstractC3184kh == f69778q) {
            this.f69792j = 0.002f;
        } else {
            this.f69792j = 1.0f;
        }
        this.f69795m = null;
        this.f69796n = Float.MAX_VALUE;
        this.f69797o = false;
    }

    /* JADX INFO: renamed from: b */
    public static C3727wm m25116b() {
        ThreadLocal threadLocal = C3727wm.f67032i;
        if (threadLocal.get() == null) {
            threadLocal.set(new C3727wm(new b64(6)));
        }
        return (C3727wm) threadLocal.get();
    }

    /* JADX INFO: renamed from: a */
    public final void m25117a(float f) {
        if (this.f69788f) {
            this.f69796n = f;
            return;
        }
        if (this.f69795m == null) {
            this.f69795m = new zf9(f);
        }
        zf9 zf9Var = this.f69795m;
        double d = f;
        zf9Var.f71503i = d;
        double d2 = (float) d;
        if (d2 > this.f69789g) {
            C3386nv.m17636w("Final position of the spring cannot be greater than the max value.");
            return;
        }
        if (d2 < this.f69790h) {
            C3386nv.m17636w("Final position of the spring cannot be less than the min value.");
            return;
        }
        double dAbs = Math.abs(this.f69792j * 0.75f);
        zf9Var.f71498d = dAbs;
        zf9Var.f71499e = dAbs * 62.5d;
        b64 b64Var = m25116b().f67037e;
        b64Var.getClass();
        if (Thread.currentThread() != ((Looper) b64Var.f8007b).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z = this.f69788f;
        if (z || z) {
            return;
        }
        this.f69788f = true;
        if (!this.f69785c) {
            this.f69784b = this.f69787e.mo11328u(this.f69786d);
        }
        float f2 = this.f69784b;
        if (f2 > this.f69789g || f2 < this.f69790h) {
            C3386nv.m17626m("Starting value need to be in between min value and max value");
            return;
        }
        C3727wm c3727wmM25116b = m25116b();
        ArrayList arrayList = c3727wmM25116b.f67034b;
        if (arrayList.size() == 0) {
            ((Choreographer) c3727wmM25116b.f67037e.f8006a).postFrameCallback(new ChoreographerFrameCallbackC3690vm(c3727wmM25116b.f67036d));
            if (Build.VERSION.SDK_INT >= 33) {
                c3727wmM25116b.f67039g = ValueAnimator.getDurationScale();
                if (c3727wmM25116b.f67040h == null) {
                    c3727wmM25116b.f67040h = new C3156jq((Object) c3727wmM25116b, false);
                }
                c3727wmM25116b.f67040h.m14593G();
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    /* JADX INFO: renamed from: c */
    public final void m25118c(float f) {
        if (f > 0.0f) {
            this.f69792j = f;
        } else {
            C3386nv.m17626m("Minimum visible change must be positive.");
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m25119d(float f) {
        ArrayList arrayList;
        this.f69787e.mo11327H(this.f69786d, f);
        int i = 0;
        while (true) {
            arrayList = this.f69794l;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                y9a y9aVar = (y9a) arrayList.get(i);
                float f2 = this.f69784b;
                raa raaVar = y9aVar.f69522g;
                long jMax = Math.max(-1L, Math.min(raaVar.f35326X + 1, Math.round(f2)));
                raaVar.mo10193N(jMax, y9aVar.f69516a);
                y9aVar.f69516a = jMax;
            }
            i++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m25120e() {
        if (this.f69795m.f71496b <= 0.0d) {
            C3386nv.m17636w("Spring animations can only come to an end when there is damping");
            return;
        }
        b64 b64Var = m25116b().f67037e;
        b64Var.getClass();
        if (Thread.currentThread() != ((Looper) b64Var.f8007b).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f69788f) {
            this.f69797o = true;
        }
    }

    public yf9(o73 o73Var) {
        this.f69783a = 0.0f;
        this.f69784b = Float.MAX_VALUE;
        this.f69785c = false;
        this.f69788f = false;
        this.f69789g = Float.MAX_VALUE;
        this.f69790h = -3.4028235E38f;
        this.f69791i = 0L;
        this.f69793k = new ArrayList();
        this.f69794l = new ArrayList();
        this.f69786d = null;
        this.f69787e = new tn2(o73Var);
        this.f69792j = 1.0f;
        this.f69795m = null;
        this.f69796n = Float.MAX_VALUE;
        this.f69797o = false;
    }
}
