package bd;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import bd.AbstractC1359c;
import p185j.AbstractC6392b;

/* JADX INFO: renamed from: bd.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1370n<S extends AbstractC1359c> extends AbstractC1368l {

    /* JADX INFO: renamed from: H */
    public AbstractC6392b f8259H;

    /* JADX INFO: renamed from: l */
    public AbstractC1369m<S> f8260l;

    public C1370n(Context context, AbstractC1359c abstractC1359c, AbstractC1369m<S> abstractC1369m, AbstractC6392b abstractC6392b) {
        super(context, abstractC1359c);
        this.f8260l = abstractC1369m;
        abstractC1369m.f8258b = this;
        this.f8259H = abstractC6392b;
        abstractC6392b.f36836a = this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(rect)) {
            return;
        }
        canvas.save();
        AbstractC1369m<S> abstractC1369m = this.f8260l;
        Rect bounds = getBounds();
        float fM4956b = m4956b();
        abstractC1369m.f8257a.mo4938a();
        abstractC1369m.mo4939a(canvas, bounds, fM4956b);
        AbstractC1369m<S> abstractC1369m2 = this.f8260l;
        Paint paint = this.f8255i;
        abstractC1369m2.mo4941c(canvas, paint);
        int i10 = 0;
        while (true) {
            AbstractC6392b abstractC6392b = this.f8259H;
            int[] iArr = (int[]) abstractC6392b.f36838c;
            if (i10 >= iArr.length) {
                canvas.restore();
                return;
            }
            AbstractC1369m<S> abstractC1369m3 = this.f8260l;
            float[] fArr = (float[]) abstractC6392b.f36837b;
            int i11 = i10 * 2;
            abstractC1369m3.mo4940b(canvas, paint, fArr[i11], fArr[i11 + 1], iArr[i10]);
            i10++;
        }
    }

    @Override // bd.AbstractC1368l
    /* JADX INFO: renamed from: f */
    public final boolean mo4952f(boolean z10, boolean z11, boolean z12) {
        boolean zMo4952f = super.mo4952f(z10, z11, z12);
        if (!isRunning()) {
            this.f8259H.mo4945c();
        }
        C1357a c1357a = this.f8249c;
        ContentResolver contentResolver = this.f8247a.getContentResolver();
        c1357a.getClass();
        Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (z10) {
            if (z12) {
                this.f8259H.mo4949i();
            }
        }
        return zMo4952f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f8260l.mo4942d();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f8260l.mo4943e();
    }
}
