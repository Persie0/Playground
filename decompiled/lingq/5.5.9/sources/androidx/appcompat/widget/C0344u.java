package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.linguist.R;
import p058d.C4999a;
import p329q2.C8488a;
import p471x2.C10029b0;

/* JADX INFO: renamed from: androidx.appcompat.widget.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0344u extends C0334p {

    /* JADX INFO: renamed from: d */
    public final SeekBar f1337d;

    /* JADX INFO: renamed from: e */
    public Drawable f1338e;

    /* JADX INFO: renamed from: f */
    public ColorStateList f1339f;

    /* JADX INFO: renamed from: g */
    public PorterDuff.Mode f1340g;

    /* JADX INFO: renamed from: h */
    public boolean f1341h;

    /* JADX INFO: renamed from: i */
    public boolean f1342i;

    public C0344u(SeekBar seekBar) {
        super(seekBar);
        this.f1339f = null;
        this.f1340g = null;
        this.f1341h = false;
        this.f1342i = false;
        this.f1337d = seekBar;
    }

    @Override // androidx.appcompat.widget.C0334p
    /* JADX INFO: renamed from: a */
    public final void mo1254a(AttributeSet attributeSet, int i10) {
        super.mo1254a(attributeSet, R.attr.seekBarStyle);
        SeekBar seekBar = this.f1337d;
        Context context = seekBar.getContext();
        int[] iArr = C4999a.f32593g;
        C0300b1 c0300b1M1111m = C0300b1.m1111m(context, attributeSet, iArr, R.attr.seekBarStyle);
        C10029b0.m18657m(seekBar, seekBar.getContext(), iArr, attributeSet, c0300b1M1111m.f1134b, R.attr.seekBarStyle);
        Drawable drawableM1117f = c0300b1M1111m.m1117f(0);
        if (drawableM1117f != null) {
            seekBar.setThumb(drawableM1117f);
        }
        Drawable drawableM1116e = c0300b1M1111m.m1116e(1);
        Drawable drawable = this.f1338e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f1338e = drawableM1116e;
        if (drawableM1116e != null) {
            drawableM1116e.setCallback(seekBar);
            C8488a.c.m16573b(drawableM1116e, C10029b0.e.m18686d(seekBar));
            if (drawableM1116e.isStateful()) {
                drawableM1116e.setState(seekBar.getDrawableState());
            }
            m1268c();
        }
        seekBar.invalidate();
        if (c0300b1M1111m.m1123l(3)) {
            this.f1340g = C0311f0.m1188c(c0300b1M1111m.m1119h(3, -1), this.f1340g);
            this.f1342i = true;
        }
        if (c0300b1M1111m.m1123l(2)) {
            this.f1339f = c0300b1M1111m.m1113b(2);
            this.f1341h = true;
        }
        c0300b1M1111m.m1124n();
        m1268c();
    }

    /* JADX INFO: renamed from: c */
    public final void m1268c() {
        Drawable drawable = this.f1338e;
        if (drawable != null) {
            if (this.f1341h || this.f1342i) {
                Drawable drawableMutate = drawable.mutate();
                this.f1338e = drawableMutate;
                if (this.f1341h) {
                    C8488a.b.m16570h(drawableMutate, this.f1339f);
                }
                if (this.f1342i) {
                    C8488a.b.m16571i(this.f1338e, this.f1340g);
                }
                if (this.f1338e.isStateful()) {
                    this.f1338e.setState(this.f1337d.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1269d(Canvas canvas) {
        if (this.f1338e != null) {
            SeekBar seekBar = this.f1337d;
            int max = seekBar.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1338e.getIntrinsicWidth();
                int intrinsicHeight = this.f1338e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1338e.setBounds(-i10, -i11, i10, i11);
                float width = ((seekBar.getWidth() - seekBar.getPaddingLeft()) - seekBar.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(seekBar.getPaddingLeft(), seekBar.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f1338e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
