package p000;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: gx */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnKeyListenerC0226gx implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0238hi {

    /* JADX INFO: renamed from: a */
    public final C0225gw f26702a;

    /* JADX INFO: renamed from: b */
    public DialogInterfaceC0155eg f26703b;

    /* JADX INFO: renamed from: c */
    C0221gs f26704c;

    public DialogInterfaceOnKeyListenerC0226gx(C0225gw c0225gw) {
        this.f26702a = c0225gw;
    }

    @Override // p000.InterfaceC0238hi
    /* JADX INFO: renamed from: a */
    public final void mo8114a(C0225gw c0225gw, boolean z) {
        DialogInterfaceC0155eg dialogInterfaceC0155eg;
        if ((z || c0225gw == this.f26702a) && (dialogInterfaceC0155eg = this.f26703b) != null) {
            dialogInterfaceC0155eg.dismiss();
        }
    }

    @Override // p000.InterfaceC0238hi
    /* JADX INFO: renamed from: b */
    public final boolean mo8115b(C0225gw c0225gw) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f26702a.m9846z(((C0220gr) this.f26704c.m9696a()).getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f26704c.mo9485c(this.f26702a, true);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0033  */
    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82) {
            if (keyEvent.getAction() != 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f26703b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f26703b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f26702a.m9829i(true);
                dialogInterface.dismiss();
                return true;
            }
        } else if (i == 4) {
            i = 4;
            if (keyEvent.getAction() != 0) {
                if (keyEvent.getAction() == 1) {
                    this.f26702a.m9829i(true);
                    dialogInterface.dismiss();
                    return true;
                }
            } else if (keyEvent.getAction() == 1) {
                this.f26702a.m9829i(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f26702a.performShortcut(i, keyEvent, 0);
    }
}
