package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.DialogInterfaceC0215b;
import androidx.appcompat.view.menu.C0222d.a;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.g */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC0225g implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0228j.a {

    /* JADX INFO: renamed from: a */
    public final C0224f f717a;

    /* JADX INFO: renamed from: b */
    public DialogInterfaceC0215b f718b;

    /* JADX INFO: renamed from: c */
    public C0222d f719c;

    public DialogInterfaceOnKeyListenerC0225g(C0224f c0224f) {
        this.f717a = c0224f;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j.a
    /* JADX INFO: renamed from: c */
    public final void mo942c(C0224f c0224f, boolean z10) {
        if (z10 || c0224f == this.f717a) {
            DialogInterfaceC0215b dialogInterfaceC0215b = this.f718b;
            if (dialogInterfaceC0215b != null) {
                dialogInterfaceC0215b.dismiss();
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j.a
    /* JADX INFO: renamed from: d */
    public final boolean mo943d(C0224f c0224f) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        C0222d c0222d = this.f719c;
        if (c0222d.f683f == null) {
            c0222d.f683f = c0222d.new a();
        }
        this.f717a.m933q(c0222d.f683f.getItem(i10), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f719c.mo895c(this.f717a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        C0224f c0224f = this.f717a;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f718b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f718b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                c0224f.m919c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return c0224f.performShortcut(i10, keyEvent, 0);
    }
}
