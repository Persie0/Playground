package bd;

import ae.C0062b;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Looper;
import android.provider.Settings;
import android.util.AndroidRuntimeException;
import bd.AbstractC1359c;
import java.util.ArrayList;
import p233l3.AbstractC7248c;
import p233l3.C7246a;
import p233l3.C7249d;
import p233l3.C7250e;

/* JADX INFO: renamed from: bd.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1365i<S extends AbstractC1359c> extends AbstractC1368l {

    /* JADX INFO: renamed from: L */
    public static final a f8238L = new a();

    /* JADX INFO: renamed from: H */
    public final C7250e f8239H;

    /* JADX INFO: renamed from: I */
    public final C7249d f8240I;

    /* JADX INFO: renamed from: J */
    public float f8241J;

    /* JADX INFO: renamed from: K */
    public boolean f8242K;

    /* JADX INFO: renamed from: l */
    public AbstractC1369m<S> f8243l;

    /* JADX INFO: renamed from: bd.i$a */
    public class a extends AbstractC7248c {
        public a() {
            super("indicatorLevel");
        }

        @Override // p233l3.AbstractC7248c
        /* JADX INFO: renamed from: d */
        public final float mo4953d(Object obj) {
            return ((C1365i) obj).f8241J * 10000.0f;
        }

        @Override // p233l3.AbstractC7248c
        /* JADX INFO: renamed from: f */
        public final void mo4954f(float f3, Object obj) {
            C1365i c1365i = (C1365i) obj;
            c1365i.f8241J = f3 / 10000.0f;
            c1365i.invalidateSelf();
        }
    }

    public C1365i(Context context, AbstractC1359c abstractC1359c, AbstractC1369m<S> abstractC1369m) {
        super(context, abstractC1359c);
        this.f8242K = false;
        this.f8243l = abstractC1369m;
        abstractC1369m.f8258b = this;
        C7250e c7250e = new C7250e();
        this.f8239H = c7250e;
        c7250e.f40724b = 1.0f;
        c7250e.f40725c = false;
        c7250e.f40723a = Math.sqrt(50.0f);
        c7250e.f40725c = false;
        C7249d c7249d = new C7249d(this);
        this.f8240I = c7249d;
        c7249d.f40720r = c7250e;
        if (this.f8254h != 1.0f) {
            this.f8254h = 1.0f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            AbstractC1369m<S> abstractC1369m = this.f8243l;
            Rect bounds = getBounds();
            float fM4956b = m4956b();
            abstractC1369m.f8257a.mo4938a();
            abstractC1369m.mo4939a(canvas, bounds, fM4956b);
            AbstractC1369m<S> abstractC1369m2 = this.f8243l;
            Paint paint = this.f8255i;
            abstractC1369m2.mo4941c(canvas, paint);
            this.f8243l.mo4940b(canvas, paint, 0.0f, this.f8241J, C0062b.m413x0(this.f8248b.f8212c[0], this.f8256j));
            canvas.restore();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // bd.AbstractC1368l
    /* JADX INFO: renamed from: f */
    public final boolean mo4952f(boolean z10, boolean z11, boolean z12) {
        boolean zMo4952f = super.mo4952f(z10, z11, z12);
        C1357a c1357a = this.f8249c;
        ContentResolver contentResolver = this.f8247a.getContentResolver();
        c1357a.getClass();
        float f3 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f3 == 0.0f) {
            this.f8242K = true;
        } else {
            this.f8242K = false;
            float f10 = 50.0f / f3;
            C7250e c7250e = this.f8239H;
            c7250e.getClass();
            if (f10 <= 0.0f) {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
            c7250e.f40723a = Math.sqrt(f10);
            c7250e.f40725c = false;
        }
        return zMo4952f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f8243l.mo4942d();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f8243l.mo4943e();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f8240I.m14597c();
        this.f8241J = getLevel() / 10000.0f;
        invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ff  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        boolean z10 = this.f8242K;
        C7249d c7249d = this.f8240I;
        if (z10) {
            c7249d.m14597c();
            this.f8241J = i10 / 10000.0f;
            invalidateSelf();
        } else {
            c7249d.f40707b = this.f8241J * 10000.0f;
            c7249d.f40708c = true;
            float f3 = i10;
            if (c7249d.f40711f) {
                c7249d.f40721s = f3;
            } else {
                if (c7249d.f40720r == null) {
                    c7249d.f40720r = new C7250e(f3);
                }
                C7250e c7250e = c7249d.f40720r;
                double d10 = f3;
                c7250e.f40731i = d10;
                double d11 = (float) d10;
                if (d11 > Float.MAX_VALUE) {
                    throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
                }
                float f10 = c7249d.f40712g;
                if (d11 < f10) {
                    throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
                }
                double dAbs = Math.abs(c7249d.f40714i * 0.75f);
                c7250e.f40726d = dAbs;
                c7250e.f40727e = dAbs * 62.5d;
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    throw new AndroidRuntimeException("Animations may only be started on the main thread");
                }
                boolean z11 = c7249d.f40711f;
                if (!z11 && !z11) {
                    c7249d.f40711f = true;
                    if (!c7249d.f40708c) {
                        c7249d.f40707b = c7249d.f40710e.mo4953d(c7249d.f40709d);
                    }
                    float f11 = c7249d.f40707b;
                    if (f11 > Float.MAX_VALUE || f11 < f10) {
                        throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                    }
                    ThreadLocal<C7246a> threadLocal = C7246a.f40689f;
                    if (threadLocal.get() == null) {
                        threadLocal.set(new C7246a());
                    }
                    C7246a c7246a = threadLocal.get();
                    ArrayList<C7246a.b> arrayList = c7246a.f40691b;
                    if (arrayList.size() == 0) {
                        if (c7246a.f40693d == null) {
                            c7246a.f40693d = new C7246a.d(c7246a.f40692c);
                        }
                        C7246a.d dVar = c7246a.f40693d;
                        dVar.f40697b.postFrameCallback(dVar.f40698c);
                    }
                    if (!arrayList.contains(c7249d)) {
                        arrayList.add(c7249d);
                    }
                }
            }
        }
        return true;
    }
}
