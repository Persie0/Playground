package p000;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.wear.ambient.AmbientDelegate;

/* JADX INFO: renamed from: ij */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0266ij {

    /* JADX INFO: renamed from: a */
    private final View f31159a;

    /* JADX INFO: renamed from: d */
    private C0850ni f31162d;

    /* JADX INFO: renamed from: e */
    private C0850ni f31163e;

    /* JADX INFO: renamed from: f */
    private C0850ni f31164f;

    /* JADX INFO: renamed from: c */
    private int f31161c = -1;

    /* JADX INFO: renamed from: b */
    private final C0271io f31160b = C0271io.m11552d();

    public C0266ij(View view) {
        this.f31159a = view;
    }

    /* JADX INFO: renamed from: a */
    public final ColorStateList m11390a() {
        C0850ni c0850ni = this.f31163e;
        if (c0850ni != null) {
            return c0850ni.f42633a;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final PorterDuff.Mode m11391b() {
        C0850ni c0850ni = this.f31163e;
        if (c0850ni != null) {
            return c0850ni.f42634b;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m11392c() {
        Drawable background = this.f31159a.getBackground();
        if (background != null) {
            if (this.f31162d != null) {
                if (this.f31164f == null) {
                    this.f31164f = new C0850ni();
                }
                C0850ni c0850ni = this.f31164f;
                c0850ni.f42633a = null;
                c0850ni.f42636d = false;
                c0850ni.f42634b = null;
                c0850ni.f42635c = false;
                ColorStateList colorStateListM473d = afh.m473d(this.f31159a);
                if (colorStateListM473d != null) {
                    c0850ni.f42636d = true;
                    c0850ni.f42633a = colorStateListM473d;
                }
                PorterDuff.Mode modeM474e = afh.m474e(this.f31159a);
                if (modeM474e != null) {
                    c0850ni.f42635c = true;
                    c0850ni.f42634b = modeM474e;
                }
                if (c0850ni.f42636d || c0850ni.f42635c) {
                    C0833ms.m16838h(background, c0850ni, this.f31159a.getDrawableState());
                    return;
                }
            }
            C0850ni c0850ni2 = this.f31163e;
            if (c0850ni2 != null) {
                C0833ms.m16838h(background, c0850ni2, this.f31159a.getDrawableState());
                return;
            }
            C0850ni c0850ni3 = this.f31162d;
            if (c0850ni3 != null) {
                C0833ms.m16838h(background, c0850ni3, this.f31159a.getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m11393d(AttributeSet attributeSet, int i) {
        AmbientDelegate ambientDelegateM1568D = AmbientDelegate.m1568D(this.f31159a.getContext(), attributeSet, C0193fr.f23282z, i, 0);
        View view = this.f31159a;
        afn.m536c(view, view.getContext(), C0193fr.f23282z, attributeSet, (TypedArray) ambientDelegateM1568D.f1686b, i, 0);
        try {
            if (ambientDelegateM1568D.m1575A(0)) {
                this.f31161c = ambientDelegateM1568D.m1616s(0, -1);
                ColorStateList colorStateListM11554a = this.f31160b.m11554a(this.f31159a.getContext(), this.f31161c);
                if (colorStateListM11554a != null) {
                    m11395f(colorStateListM11554a);
                }
            }
            if (ambientDelegateM1568D.m1575A(1)) {
                afh.m479j(this.f31159a, ambientDelegateM1568D.m1617t(1));
            }
            if (ambientDelegateM1568D.m1575A(2)) {
                afh.m480k(this.f31159a, C0768kh.m14230a(ambientDelegateM1568D.m1613p(2, -1), null));
            }
        } finally {
            ambientDelegateM1568D.m1622y();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m11394e(int i) {
        this.f31161c = i;
        C0271io c0271io = this.f31160b;
        m11395f(c0271io != null ? c0271io.m11554a(this.f31159a.getContext(), i) : null);
        m11392c();
    }

    /* JADX INFO: renamed from: f */
    final void m11395f(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f31162d == null) {
                this.f31162d = new C0850ni();
            }
            C0850ni c0850ni = this.f31162d;
            c0850ni.f42633a = colorStateList;
            c0850ni.f42636d = true;
        } else {
            this.f31162d = null;
        }
        m11392c();
    }

    /* JADX INFO: renamed from: g */
    public final void m11396g(ColorStateList colorStateList) {
        if (this.f31163e == null) {
            this.f31163e = new C0850ni();
        }
        C0850ni c0850ni = this.f31163e;
        c0850ni.f42633a = colorStateList;
        c0850ni.f42636d = true;
        m11392c();
    }

    /* JADX INFO: renamed from: h */
    public final void m11397h(PorterDuff.Mode mode) {
        if (this.f31163e == null) {
            this.f31163e = new C0850ni();
        }
        C0850ni c0850ni = this.f31163e;
        c0850ni.f42634b = mode;
        c0850ni.f42635c = true;
        m11392c();
    }

    /* JADX INFO: renamed from: i */
    public final void m11398i() {
        this.f31161c = -1;
        m11395f(null);
        m11392c();
    }
}
