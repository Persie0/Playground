package p000;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class zq2 implements KeyListener {

    /* JADX INFO: renamed from: a */
    public final KeyListener f71965a;

    public zq2(KeyListener keyListener) {
        this.f71965a = keyListener;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f71965a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f71965a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean zM12870w;
        if (i != 67) {
            zM12870w = i != 112 ? false : gv5.m12870w(editable, keyEvent, true);
        } else {
            zM12870w = gv5.m12870w(editable, keyEvent, false);
        }
        if (zM12870w) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        } else if (!this.f71965a.onKeyDown(view, editable, i, keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f71965a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f71965a.onKeyUp(view, editable, i, keyEvent);
    }
}
