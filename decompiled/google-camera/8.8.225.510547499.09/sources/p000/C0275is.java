package p000;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import androidx.wear.ambient.AmbientDelegate;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: renamed from: is */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0275is extends MultiAutoCompleteTextView {

    /* JADX INFO: renamed from: a */
    private static final int[] f31961a = {R.attr.popupBackground};

    /* JADX INFO: renamed from: b */
    private final C0266ij f31962b;

    /* JADX INFO: renamed from: c */
    private final C0749jp f31963c;

    /* JADX INFO: renamed from: d */
    private final bck f31964d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0275is(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C0100R.attr.autoCompleteTextViewStyle);
        C0849nh.m17473a(context);
        C0847nf.m17435d(this, getContext());
        AmbientDelegate ambientDelegateM1568D = AmbientDelegate.m1568D(getContext(), attributeSet, f31961a, C0100R.attr.autoCompleteTextViewStyle, 0);
        if (ambientDelegateM1568D.m1575A(0)) {
            setDropDownBackgroundDrawable(ambientDelegateM1568D.m1618u(0));
        }
        ambientDelegateM1568D.m1622y();
        C0266ij c0266ij = new C0266ij(this);
        this.f31962b = c0266ij;
        c0266ij.m11393d(attributeSet, C0100R.attr.autoCompleteTextViewStyle);
        C0749jp c0749jp = new C0749jp(this);
        this.f31963c = c0749jp;
        c0749jp.m13417b(attributeSet, C0100R.attr.autoCompleteTextViewStyle);
        c0749jp.m13416a();
        bck bckVar = new bck(this, (byte[]) null);
        this.f31964d = bckVar;
        bckVar.m2215m(attributeSet, C0100R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (bck.m2199n(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerM2200o = bck.m2200o(keyListener);
            if (keyListenerM2200o == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerM2200o);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        C0266ij c0266ij = this.f31962b;
        if (c0266ij != null) {
            c0266ij.m11392c();
        }
        C0749jp c0749jp = this.f31963c;
        if (c0749jp != null) {
            c0749jp.m13416a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0139dr.m6613b(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.f31964d.m2216p(inputConnectionOnCreateInputConnection);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0266ij c0266ij = this.f31962b;
        if (c0266ij != null) {
            c0266ij.m11398i();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0266ij c0266ij = this.f31962b;
        if (c0266ij != null) {
            c0266ij.m11394e(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0749jp c0749jp = this.f31963c;
        if (c0749jp != null) {
            c0749jp.m13416a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0749jp c0749jp = this.f31963c;
        if (c0749jp != null) {
            c0749jp.m13416a();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0194fs.m8752a(getContext(), i));
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(bck.m2200o(keyListener));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0749jp c0749jp = this.f31963c;
        if (c0749jp != null) {
            c0749jp.m13418c(context, i);
        }
    }
}
