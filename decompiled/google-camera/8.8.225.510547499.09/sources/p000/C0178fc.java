package p000;

import android.view.Window;

/* JADX INFO: renamed from: fc */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0178fc implements InterfaceC0238hi {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f21223a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f21224b;

    public C0178fc(LayoutInflaterFactory2C0179fd layoutInflaterFactory2C0179fd, int i) {
        this.f21224b = i;
        this.f21223a = layoutInflaterFactory2C0179fd;
    }

    public C0178fc(C0259ic c0259ic, int i) {
        this.f21224b = i;
        this.f21223a = c0259ic;
    }

    @Override // p000.InterfaceC0238hi
    /* JADX INFO: renamed from: b */
    public final boolean mo8115b(C0225gw c0225gw) {
        Window.Callback callbackM8254u;
        switch (this.f21224b) {
            case 0:
                if (c0225gw == c0225gw.mo9821a()) {
                    LayoutInflaterFactory2C0179fd layoutInflaterFactory2C0179fd = (LayoutInflaterFactory2C0179fd) this.f21223a;
                    if (layoutInflaterFactory2C0179fd.f21388w && (callbackM8254u = layoutInflaterFactory2C0179fd.m8254u()) != null && !((LayoutInflaterFactory2C0179fd) this.f21223a).f21345D) {
                        callbackM8254u.onMenuOpened(108, c0225gw);
                    }
                }
                return true;
            case 1:
                Window.Callback callbackM8254u2 = ((LayoutInflaterFactory2C0179fd) this.f21223a).m8254u();
                if (callbackM8254u2 != null) {
                    callbackM8254u2.onMenuOpened(108, c0225gw);
                }
                return true;
            default:
                Object obj = this.f21223a;
                if (c0225gw == ((C0259ic) obj).f25573c) {
                    return false;
                }
                C0227gy c0227gy = ((SubMenuC0246hq) c0225gw).f29025k;
                InterfaceC0238hi interfaceC0238hi = ((C0215gm) obj).f25575e;
                if (interfaceC0238hi != null) {
                    return interfaceC0238hi.mo8115b(c0225gw);
                }
                return false;
        }
    }

    @Override // p000.InterfaceC0238hi
    /* JADX INFO: renamed from: a */
    public final void mo8114a(C0225gw c0225gw, boolean z) {
        switch (this.f21224b) {
            case 0:
                C0225gw c0225gwMo9821a = c0225gw.mo9821a();
                C0177fb c0177fbM8253t = ((LayoutInflaterFactory2C0179fd) this.f21223a).m8253t(c0225gwMo9821a != c0225gw ? c0225gwMo9821a : c0225gw);
                if (c0177fbM8253t != null) {
                    if (c0225gwMo9821a == c0225gw) {
                        ((LayoutInflaterFactory2C0179fd) this.f21223a).m8258y(c0177fbM8253t, z);
                    } else {
                        ((LayoutInflaterFactory2C0179fd) this.f21223a).m8256w(c0177fbM8253t.f21170a, c0177fbM8253t, c0225gwMo9821a);
                        ((LayoutInflaterFactory2C0179fd) this.f21223a).m8258y(c0177fbM8253t, true);
                    }
                }
                break;
            case 1:
                ((LayoutInflaterFactory2C0179fd) this.f21223a).m8257x(c0225gw);
                break;
            default:
                if (c0225gw instanceof SubMenuC0246hq) {
                    c0225gw.mo9821a().m9829i(false);
                }
                InterfaceC0238hi interfaceC0238hi = ((C0215gm) this.f21223a).f25575e;
                if (interfaceC0238hi != null) {
                    interfaceC0238hi.mo8114a(c0225gw, z);
                }
                break;
        }
    }
}
