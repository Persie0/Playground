package p000;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.wear.ambient.AmbientDelegate;

/* JADX INFO: renamed from: im */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0269im {

    /* JADX INFO: renamed from: a */
    public PorterDuff.Mode f31467a = null;

    /* JADX INFO: renamed from: b */
    public boolean f31468b = false;

    /* JADX INFO: renamed from: c */
    public boolean f31469c = false;

    /* JADX INFO: renamed from: d */
    private final CompoundButton f31470d;

    /* JADX INFO: renamed from: e */
    private boolean f31471e;

    public C0269im(CompoundButton compoundButton) {
        this.f31470d = compoundButton;
    }

    /* JADX INFO: renamed from: a */
    public final void m11454a() {
        Drawable drawableM669a = ahh.m669a(this.f31470d);
        if (drawableM669a != null) {
            if (this.f31468b || this.f31469c) {
                Drawable drawableMutate = drawableM669a.mutate();
                if (this.f31468b) {
                    acv.m238g(drawableMutate, null);
                }
                if (this.f31469c) {
                    acv.m239h(drawableMutate, this.f31467a);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f31470d.getDrawableState());
                }
                this.f31470d.setButtonDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    final void m11455b(AttributeSet attributeSet, int i) {
        int iM1616s;
        int iM1616s2;
        AmbientDelegate ambientDelegateM1568D = AmbientDelegate.m1568D(this.f31470d.getContext(), attributeSet, C0193fr.f23269m, i, 0);
        CompoundButton compoundButton = this.f31470d;
        afn.m536c(compoundButton, compoundButton.getContext(), C0193fr.f23269m, attributeSet, (TypedArray) ambientDelegateM1568D.f1686b, i, 0);
        try {
            if (ambientDelegateM1568D.m1575A(1) && (iM1616s2 = ambientDelegateM1568D.m1616s(1, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.f31470d;
                    compoundButton2.setButtonDrawable(C0194fs.m8752a(compoundButton2.getContext(), iM1616s2));
                } catch (Resources.NotFoundException e) {
                    if (ambientDelegateM1568D.m1575A(0)) {
                        CompoundButton compoundButton3 = this.f31470d;
                        compoundButton3.setButtonDrawable(C0194fs.m8752a(compoundButton3.getContext(), iM1616s));
                    }
                }
            } else if (ambientDelegateM1568D.m1575A(0) && (iM1616s = ambientDelegateM1568D.m1616s(0, 0)) != 0) {
                CompoundButton compoundButton4 = this.f31470d;
                compoundButton4.setButtonDrawable(C0194fs.m8752a(compoundButton4.getContext(), iM1616s));
            }
            if (ambientDelegateM1568D.m1575A(2)) {
                ahg.m667c(this.f31470d, ambientDelegateM1568D.m1617t(2));
            }
            if (ambientDelegateM1568D.m1575A(3)) {
                ahg.m668d(this.f31470d, C0768kh.m14230a(ambientDelegateM1568D.m1613p(3, -1), null));
            }
        } finally {
            ambientDelegateM1568D.m1622y();
        }
    }

    /* JADX INFO: renamed from: c */
    final void m11456c() {
        if (this.f31471e) {
            this.f31471e = false;
        } else {
            this.f31471e = true;
            m11454a();
        }
    }
}
