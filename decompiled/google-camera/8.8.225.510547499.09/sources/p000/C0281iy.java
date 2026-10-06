package p000;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.wear.ambient.AmbientDelegate;

/* JADX INFO: renamed from: iy */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0281iy extends C0277iu {

    /* JADX INFO: renamed from: b */
    public final SeekBar f32625b;

    /* JADX INFO: renamed from: c */
    public Drawable f32626c;

    /* JADX INFO: renamed from: d */
    private ColorStateList f32627d;

    /* JADX INFO: renamed from: e */
    private PorterDuff.Mode f32628e;

    /* JADX INFO: renamed from: f */
    private boolean f32629f;

    /* JADX INFO: renamed from: g */
    private boolean f32630g;

    public C0281iy(SeekBar seekBar) {
        super(seekBar);
        this.f32627d = null;
        this.f32628e = null;
        this.f32629f = false;
        this.f32630g = false;
        this.f32625b = seekBar;
    }

    /* JADX INFO: renamed from: c */
    private final void m11888c() {
        Drawable drawable = this.f32626c;
        if (drawable != null) {
            if (this.f32629f || this.f32630g) {
                Drawable drawableMutate = drawable.mutate();
                this.f32626c = drawableMutate;
                if (this.f32629f) {
                    acv.m238g(drawableMutate, this.f32627d);
                }
                if (this.f32630g) {
                    acv.m239h(this.f32626c, this.f32628e);
                }
                if (this.f32626c.isStateful()) {
                    this.f32626c.setState(this.f32625b.getDrawableState());
                }
            }
        }
    }

    @Override // p000.C0277iu
    /* JADX INFO: renamed from: b */
    public final void mo11798b(AttributeSet attributeSet, int i) {
        super.mo11798b(attributeSet, i);
        AmbientDelegate ambientDelegateM1568D = AmbientDelegate.m1568D(this.f32625b.getContext(), attributeSet, C0193fr.f23263g, i, 0);
        SeekBar seekBar = this.f32625b;
        afn.m536c(seekBar, seekBar.getContext(), C0193fr.f23263g, attributeSet, (TypedArray) ambientDelegateM1568D.f1686b, i, 0);
        Drawable drawableM1619v = ambientDelegateM1568D.m1619v(0);
        if (drawableM1619v != null) {
            this.f32625b.setThumb(drawableM1619v);
        }
        Drawable drawableM1618u = ambientDelegateM1568D.m1618u(1);
        Drawable drawable = this.f32626c;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f32626c = drawableM1618u;
        if (drawableM1618u != null) {
            drawableM1618u.setCallback(this.f32625b);
            acw.m245b(drawableM1618u, afc.m442c(this.f32625b));
            if (drawableM1618u.isStateful()) {
                drawableM1618u.setState(this.f32625b.getDrawableState());
            }
            m11888c();
        }
        this.f32625b.invalidate();
        if (ambientDelegateM1568D.m1575A(3)) {
            this.f32628e = C0768kh.m14230a(ambientDelegateM1568D.m1613p(3, -1), this.f32628e);
            this.f32630g = true;
        }
        if (ambientDelegateM1568D.m1575A(2)) {
            this.f32627d = ambientDelegateM1568D.m1617t(2);
            this.f32629f = true;
        }
        ambientDelegateM1568D.m1622y();
        m11888c();
    }
}
