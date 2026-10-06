package p000;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: renamed from: ju */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0754ju extends ToggleButton {

    /* JADX INFO: renamed from: a */
    private final C0266ij f34811a;

    /* JADX INFO: renamed from: b */
    private final C0749jp f34812b;

    /* JADX INFO: renamed from: c */
    private aie f34813c;

    public C0754ju(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        C0847nf.m17435d(this, getContext());
        C0266ij c0266ij = new C0266ij(this);
        this.f34811a = c0266ij;
        c0266ij.m11393d(attributeSet, R.attr.buttonStyleToggle);
        C0749jp c0749jp = new C0749jp(this);
        this.f34812b = c0749jp;
        c0749jp.m13417b(attributeSet, R.attr.buttonStyleToggle);
        m13502a().m769n(attributeSet, R.attr.buttonStyleToggle);
    }

    /* JADX INFO: renamed from: a */
    private final aie m13502a() {
        if (this.f34813c == null) {
            this.f34813c = new aie(this);
        }
        return this.f34813c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        C0266ij c0266ij = this.f34811a;
        if (c0266ij != null) {
            c0266ij.m11392c();
        }
        C0749jp c0749jp = this.f34812b;
        if (c0749jp != null) {
            c0749jp.m13416a();
        }
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        m13502a();
        ajf.m803d();
    }

    @Override // android.widget.ToggleButton, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0266ij c0266ij = this.f34811a;
        if (c0266ij != null) {
            c0266ij.m11398i();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0266ij c0266ij = this.f34811a;
        if (c0266ij != null) {
            c0266ij.m11394e(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0749jp c0749jp = this.f34812b;
        if (c0749jp != null) {
            c0749jp.m13416a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0749jp c0749jp = this.f34812b;
        if (c0749jp != null) {
            c0749jp.m13416a();
        }
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        m13502a();
        ajf.m803d();
        super.setFilters(inputFilterArr);
    }
}
