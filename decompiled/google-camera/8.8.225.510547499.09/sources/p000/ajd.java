package p000;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ajd implements KeyListener {

    /* JADX INFO: renamed from: a */
    private final KeyListener f485a;

    public ajd(KeyListener keyListener) {
        this.f485a = keyListener;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f485a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f485a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f485a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f485a.onKeyUp(view, editable, i, keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:9:0x0016  */
    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean zM148c;
        switch (i) {
            case 67:
                zM148c = abr.m148c(editable, keyEvent, false);
                break;
            case 112:
                zM148c = abr.m148c(editable, keyEvent, true);
                break;
            default:
                if (!this.f485a.onKeyDown(view, editable, i, keyEvent)) {
                    return true;
                }
                return false;
        }
        if (zM148c) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        } else if (!this.f485a.onKeyDown(view, editable, i, keyEvent)) {
            return false;
        }
        return true;
    }
}
