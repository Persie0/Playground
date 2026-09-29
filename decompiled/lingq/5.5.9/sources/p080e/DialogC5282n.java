package p080e;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.DialogC0192k;
import com.linguist.R;
import p471x2.C10038g;

/* JADX INFO: renamed from: e.n */
/* JADX INFO: loaded from: classes.dex */
public class DialogC5282n extends DialogC0192k implements InterfaceC5272d {

    /* JADX INFO: renamed from: d */
    public LayoutInflaterFactory2C5275g f33474d;

    /* JADX INFO: renamed from: e */
    public final C5281m f33475e;

    /* JADX WARN: Type inference failed for: r2v2, types: [e.m] */
    public DialogC5282n(Context context, int i10) {
        int i11;
        if (i10 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i11 = typedValue.resourceId;
        } else {
            i11 = i10;
        }
        super(context, i11);
        this.f33475e = new C10038g.a() { // from class: e.m
            @Override // p471x2.C10038g.a
            /* JADX INFO: renamed from: v */
            public final boolean mo11393v(KeyEvent keyEvent) {
                return this.f33473a.m11395e(keyEvent);
            }
        };
        AbstractC5274f abstractC5274fM11394d = m11394d();
        if (i10 == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i10 = typedValue2.resourceId;
        }
        ((LayoutInflaterFactory2C5275g) abstractC5274fM11394d).f33421p0 = i10;
        abstractC5274fM11394d.mo11339n();
    }

    @Override // p080e.InterfaceC5272d
    /* JADX INFO: renamed from: C */
    public final void mo877C() {
    }

    @Override // androidx.activity.DialogC0192k, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m11394d().mo11329c(view, layoutParams);
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC5274f m11394d() {
        if (this.f33474d == null) {
            C5287s.a aVar = AbstractC5274f.f33368a;
            this.f33474d = new LayoutInflaterFactory2C5275g(getContext(), getWindow(), this, this);
        }
        return this.f33474d;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        m11394d().mo11340o();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C10038g.m18803b(this.f33475e, getWindow().getDecorView(), this, keyEvent);
    }

    /* JADX INFO: renamed from: e */
    final boolean m11395e(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final <T extends View> T findViewById(int i10) {
        return (T) m11394d().mo11331e(i10);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        m11394d().mo11337k();
    }

    @Override // p080e.InterfaceC5272d
    /* JADX INFO: renamed from: o */
    public final void mo880o() {
    }

    @Override // androidx.activity.DialogC0192k, android.app.Dialog
    public void onCreate(Bundle bundle) {
        m11394d().mo11336j();
        super.onCreate(bundle);
        m11394d().mo11339n();
    }

    @Override // androidx.activity.DialogC0192k, android.app.Dialog
    public final void onStop() {
        super.onStop();
        m11394d().mo11343r();
    }

    @Override // androidx.activity.DialogC0192k, android.app.Dialog
    public void setContentView(int i10) {
        m11394d().mo11345u(i10);
    }

    @Override // androidx.activity.DialogC0192k, android.app.Dialog
    public void setContentView(View view) {
        m11394d().mo11346v(view);
    }

    @Override // androidx.activity.DialogC0192k, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m11394d().mo11347w(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i10) {
        super.setTitle(i10);
        m11394d().mo11328A(getContext().getString(i10));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m11394d().mo11328A(charSequence);
    }

    @Override // p080e.InterfaceC5272d
    /* JADX INFO: renamed from: x */
    public final void mo881x() {
    }
}
