package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: renamed from: ik */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class C0267ik extends CheckBox {

    /* JADX INFO: renamed from: a */
    public final C0269im f31268a;

    /* JADX INFO: renamed from: b */
    private final C0266ij f31269b;

    /* JADX INFO: renamed from: c */
    private final C0749jp f31270c;

    /* JADX INFO: renamed from: d */
    private aie f31271d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0267ik(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C0100R.attr.checkboxStyle);
        C0849nh.m17473a(context);
        C0847nf.m17435d(this, getContext());
        C0269im c0269im = new C0269im(this);
        this.f31268a = c0269im;
        c0269im.m11455b(attributeSet, C0100R.attr.checkboxStyle);
        C0266ij c0266ij = new C0266ij(this);
        this.f31269b = c0266ij;
        c0266ij.m11393d(attributeSet, C0100R.attr.checkboxStyle);
        C0749jp c0749jp = new C0749jp(this);
        this.f31270c = c0749jp;
        c0749jp.m13417b(attributeSet, C0100R.attr.checkboxStyle);
        m11403a().m769n(attributeSet, C0100R.attr.checkboxStyle);
    }

    /* JADX INFO: renamed from: a */
    private final aie m11403a() {
        if (this.f31271d == null) {
            this.f31271d = new aie(this);
        }
        return this.f31271d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        C0266ij c0266ij = this.f31269b;
        if (c0266ij != null) {
            c0266ij.m11392c();
        }
        C0749jp c0749jp = this.f31270c;
        if (c0749jp != null) {
            c0749jp.m13416a();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingLeft() {
        return super.getCompoundPaddingLeft();
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        m11403a();
        ajf.m803d();
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0266ij c0266ij = this.f31269b;
        if (c0266ij != null) {
            c0266ij.m11398i();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0266ij c0266ij = this.f31269b;
        if (c0266ij != null) {
            c0266ij.m11394e(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(C0194fs.m8752a(getContext(), i));
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0749jp c0749jp = this.f31270c;
        if (c0749jp != null) {
            c0749jp.m13416a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0749jp c0749jp = this.f31270c;
        if (c0749jp != null) {
            c0749jp.m13416a();
        }
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        m11403a();
        ajf.m803d();
        super.setFilters(inputFilterArr);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0269im c0269im = this.f31268a;
        if (c0269im != null) {
            c0269im.m11456c();
        }
    }
}
