package p000;

import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import androidx.wear.ambient.AmbientMode;

/* JADX INFO: renamed from: ig */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0263ig implements InterfaceC0223gu {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f30697a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f30698b;

    public C0263ig(ActionMenuView actionMenuView, int i) {
        this.f30698b = i;
        this.f30697a = actionMenuView;
    }

    public C0263ig(Toolbar toolbar, int i) {
        this.f30698b = i;
        this.f30697a = toolbar;
    }

    public C0263ig(C0186fk c0186fk, int i) {
        this.f30698b = i;
        this.f30697a = c0186fk;
    }

    @Override // p000.InterfaceC0223gu
    /* JADX INFO: renamed from: H */
    public final boolean mo8241H(C0225gw c0225gw, MenuItem menuItem) {
        switch (this.f30698b) {
            case 0:
                AmbientMode.AmbientController ambientController = ((ActionMenuView) this.f30697a).f991e;
                if (ambientController == null) {
                    return false;
                }
                if (((Toolbar) ambientController.f1697a).f1206B.m19479g(menuItem)) {
                    return true;
                }
                AmbientMode.AmbientController ambientController2 = ((Toolbar) ambientController.f1697a).f1207C;
                return ambientController2 != null && ((C0186fk) ambientController2.f1697a).f22354b.onMenuItemSelected(0, menuItem);
            case 1:
            default:
                return false;
        }
    }

    @Override // p000.InterfaceC0223gu
    /* JADX INFO: renamed from: D */
    public final void mo8237D(C0225gw c0225gw) {
        switch (this.f30698b) {
            case 0:
                InterfaceC0223gu interfaceC0223gu = ((ActionMenuView) this.f30697a).f990d;
                if (interfaceC0223gu != null) {
                    interfaceC0223gu.mo8237D(c0225gw);
                }
                break;
            case 1:
                if (((C0186fk) this.f30697a).f22353a.mo13691s()) {
                    ((C0186fk) this.f30697a).f22354b.onPanelClosed(108, c0225gw);
                } else if (((C0186fk) this.f30697a).f22354b.onPreparePanel(0, null, c0225gw)) {
                    ((C0186fk) this.f30697a).f22354b.onMenuOpened(108, c0225gw);
                }
                break;
            default:
                if (!((Toolbar) this.f30697a).f1224a.m1080m()) {
                    ((Toolbar) this.f30697a).f1206B.m19478f(c0225gw);
                }
                InterfaceC0223gu interfaceC0223gu2 = ((Toolbar) this.f30697a).f1249z;
                if (interfaceC0223gu2 != null) {
                    interfaceC0223gu2.mo8237D(c0225gw);
                }
                break;
        }
    }
}
