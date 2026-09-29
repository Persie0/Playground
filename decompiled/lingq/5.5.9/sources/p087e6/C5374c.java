package p087e6;

import ae.C0062b;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.ArrayList;

/* JADX INFO: renamed from: e6.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5374c extends Drawable implements C5377f.b, Animatable {

    /* JADX INFO: renamed from: a */
    public final a f33757a;

    /* JADX INFO: renamed from: b */
    public boolean f33758b;

    /* JADX INFO: renamed from: c */
    public boolean f33759c;

    /* JADX INFO: renamed from: d */
    public boolean f33760d;

    /* JADX INFO: renamed from: e */
    public boolean f33761e;

    /* JADX INFO: renamed from: f */
    public int f33762f;

    /* JADX INFO: renamed from: g */
    public final int f33763g;

    /* JADX INFO: renamed from: h */
    public boolean f33764h;

    /* JADX INFO: renamed from: i */
    public Paint f33765i;

    /* JADX INFO: renamed from: j */
    public Rect f33766j;

    /* JADX INFO: renamed from: e6.c$a */
    public static final class a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public final C5377f f33767a;

        public a(C5377f c5377f) {
            this.f33767a = c5377f;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new C5374c(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new C5374c(this);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C5374c() {
        throw null;
    }

    public C5374c(a aVar) {
        this.f33761e = true;
        this.f33763g = -1;
        C0062b.m345f0(aVar);
        this.f33757a = aVar;
    }

    @Override // p087e6.C5377f.b
    /* JADX INFO: renamed from: a */
    public final void mo11546a() {
        Object obj;
        Drawable.Callback callback = getCallback();
        while (true) {
            obj = callback;
            if (!(obj instanceof Drawable)) {
                break;
            } else {
                callback = ((Drawable) obj).getCallback();
            }
        }
        if (obj == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        C5377f c5377f = this.f33757a.f33767a;
        C5377f.a aVar = c5377f.f33777i;
        if ((aVar != null ? aVar.f33787e : -1) == c5377f.f33769a.mo16584d() - 1) {
            this.f33762f++;
        }
        int i10 = this.f33763g;
        if (i10 != -1 && this.f33762f >= i10) {
            stop();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final void m11547b() {
        C0062b.m339d0("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f33760d);
        a aVar = this.f33757a;
        if (aVar.f33767a.f33769a.mo16584d() == 1) {
            invalidateSelf();
            return;
        }
        if (this.f33758b) {
            return;
        }
        this.f33758b = true;
        C5377f c5377f = aVar.f33767a;
        if (c5377f.f33778j) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        ArrayList arrayList = c5377f.f33771c;
        if (arrayList.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !c5377f.f33774f) {
            c5377f.f33774f = true;
            c5377f.f33778j = false;
            c5377f.m11548a();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f33760d) {
            return;
        }
        if (this.f33764h) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f33766j == null) {
                this.f33766j = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f33766j);
            this.f33764h = false;
        }
        C5377f c5377f = this.f33757a.f33767a;
        C5377f.a aVar = c5377f.f33777i;
        Bitmap bitmap = aVar != null ? aVar.f33789g : c5377f.f33780l;
        if (this.f33766j == null) {
            this.f33766j = new Rect();
        }
        Rect rect = this.f33766j;
        if (this.f33765i == null) {
            this.f33765i = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f33765i);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f33757a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f33757a.f33767a.f33785q;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f33757a.f33767a.f33784p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f33758b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f33764h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.f33765i == null) {
            this.f33765i = new Paint(2);
        }
        this.f33765i.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f33765i == null) {
            this.f33765i = new Paint(2);
        }
        this.f33765i.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        C0062b.m339d0("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f33760d);
        this.f33761e = z10;
        if (!z10) {
            this.f33758b = false;
            C5377f c5377f = this.f33757a.f33767a;
            ArrayList arrayList = c5377f.f33771c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                c5377f.f33774f = false;
            }
        } else if (this.f33759c) {
            m11547b();
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f33759c = true;
        this.f33762f = 0;
        if (this.f33761e) {
            m11547b();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f33759c = false;
        this.f33758b = false;
        C5377f c5377f = this.f33757a.f33767a;
        ArrayList arrayList = c5377f.f33771c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            c5377f.f33774f = false;
        }
    }
}
