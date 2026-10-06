package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: renamed from: il */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0268il extends CheckedTextView {

    /* JADX INFO: renamed from: a */
    private final C0266ij f31421a;

    /* JADX INFO: renamed from: b */
    private final C0749jp f31422b;

    /* JADX INFO: renamed from: c */
    private final kbh f31423c;

    /* JADX INFO: renamed from: d */
    private aie f31424d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0268il(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C0100R.attr.checkedTextViewStyle);
        C0849nh.m17473a(context);
        C0847nf.m17435d(this, getContext());
        C0749jp c0749jp = new C0749jp(this);
        this.f31422b = c0749jp;
        c0749jp.m13417b(attributeSet, C0100R.attr.checkedTextViewStyle);
        c0749jp.m13416a();
        C0266ij c0266ij = new C0266ij(this);
        this.f31421a = c0266ij;
        c0266ij.m11393d(attributeSet, C0100R.attr.checkedTextViewStyle);
        kbh kbhVar = new kbh(this);
        this.f31423c = kbhVar;
        kbhVar.m13937e(attributeSet);
        m11420a().m769n(attributeSet, C0100R.attr.checkedTextViewStyle);
    }

    /* JADX INFO: renamed from: a */
    private final aie m11420a() {
        if (this.f31424d == null) {
            this.f31424d = new aie(this);
        }
        return this.f31424d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        C0749jp c0749jp = this.f31422b;
        if (c0749jp != null) {
            c0749jp.m13416a();
        }
        C0266ij c0266ij = this.f31421a;
        if (c0266ij != null) {
            c0266ij.m11392c();
        }
        kbh kbhVar = this.f31423c;
        if (kbhVar != null) {
            kbhVar.m13936d();
        }
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        abm.m140g(customSelectionActionModeCallback);
        return customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0139dr.m6613b(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        m11420a();
        ajf.m803d();
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0266ij c0266ij = this.f31421a;
        if (c0266ij != null) {
            c0266ij.m11398i();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0266ij c0266ij = this.f31421a;
        if (c0266ij != null) {
            c0266ij.m11394e(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C0194fs.m8752a(getContext(), i));
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0749jp c0749jp = this.f31422b;
        if (c0749jp != null) {
            c0749jp.m13416a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0749jp c0749jp = this.f31422b;
        if (c0749jp != null) {
            c0749jp.m13416a();
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0749jp c0749jp = this.f31422b;
        if (c0749jp != null) {
            c0749jp.m13418c(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        kbh kbhVar = this.f31423c;
        if (kbhVar != null) {
            if (kbhVar.f35524a) {
                kbhVar.f35524a = false;
            } else {
                kbhVar.f35524a = true;
                kbhVar.m13936d();
            }
        }
    }
}
