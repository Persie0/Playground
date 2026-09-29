package p000;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes2.dex */
public final class jw5 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, dx5 {

    /* JADX INFO: renamed from: a */
    public om9 f46313a;

    /* JADX INFO: renamed from: b */
    public DialogInterfaceC0016ae f46314b;

    /* JADX INFO: renamed from: c */
    public uf5 f46315c;

    @Override // p000.dx5
    /* JADX INFO: renamed from: b */
    public final void mo10740b(hw5 hw5Var, boolean z) {
        DialogInterfaceC0016ae dialogInterfaceC0016ae;
        if ((z || hw5Var == this.f46313a) && (dialogInterfaceC0016ae = this.f46314b) != null) {
            dialogInterfaceC0016ae.dismiss();
        }
    }

    @Override // p000.dx5
    /* JADX INFO: renamed from: j */
    public final boolean mo10741j(hw5 hw5Var) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f46313a.m13534q(this.f46315c.m22723a().getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f46315c.mo702b(this.f46313a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        om9 om9Var = this.f46313a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f46314b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f46314b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                om9Var.m13520c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return om9Var.performShortcut(i, keyEvent, 0);
    }
}
