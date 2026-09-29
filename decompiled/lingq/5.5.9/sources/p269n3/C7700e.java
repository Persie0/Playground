package p269n3;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.C0892f;
import androidx.emoji2.text.C0897k;

/* JADX INFO: renamed from: n3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C7700e implements KeyListener {

    /* JADX INFO: renamed from: a */
    public final KeyListener f42217a;

    /* JADX INFO: renamed from: b */
    public final a f42218b;

    /* JADX INFO: renamed from: n3.e$a */
    public static class a {
    }

    public C7700e(KeyListener keyListener) {
        a aVar = new a();
        this.f42217a = keyListener;
        this.f42218b = aVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f42217a.clearMetaKeyState(view, editable, i10);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f42217a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        boolean zM3531a;
        boolean z10;
        this.f42218b.getClass();
        Object obj = C0892f.f5983j;
        if (i10 != 67) {
            zM3531a = i10 != 112 ? false : C0897k.m3531a(editable, keyEvent, true);
        } else {
            zM3531a = C0897k.m3531a(editable, keyEvent, false);
        }
        if (zM3531a) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z10 = true;
        } else {
            z10 = false;
        }
        return z10 || this.f42217a.onKeyDown(view, editable, i10, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f42217a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f42217a.onKeyUp(view, editable, i10, keyEvent);
    }
}
