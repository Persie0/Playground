package p000;

import androidx.compose.p002ui.focus.C0301c;
import androidx.compose.p002ui.focus.InterfaceC0300b;

/* JADX INFO: loaded from: classes.dex */
public final class fj4 {

    /* JADX INFO: renamed from: a */
    public final ld9 f39191a;

    /* JADX INFO: renamed from: b */
    public gj4 f39192b;

    /* JADX INFO: renamed from: c */
    public InterfaceC0300b f39193c;

    public fj4(ld9 ld9Var) {
        this.f39191a = ld9Var;
    }

    /* JADX INFO: renamed from: a */
    public final gj4 m11888a() {
        gj4 gj4Var = this.f39192b;
        if (gj4Var != null) {
            return gj4Var;
        }
        fa4.m11636J("keyboardActions");
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m11889b(int i) {
        vi3 vi3Var;
        ld9 ld9Var;
        if (i == 7) {
            vi3Var = m11888a().f40873a;
        } else {
            if (i == 2 || i == 6 || i == 5) {
                m11888a();
            } else if (i == 3) {
                vi3Var = m11888a().f40874b;
            } else if (i == 4) {
                m11888a();
            } else if (i != 1 && i != 0) {
                C3386nv.m17633t("invalid ImeAction");
                return false;
            }
            vi3Var = null;
        }
        if (vi3Var != null) {
            vi3Var.invoke(this);
            return true;
        }
        if (i == 6) {
            InterfaceC0300b interfaceC0300b = this.f39193c;
            if (interfaceC0300b != null) {
                ((C0301c) interfaceC0300b).m1363i(1, true);
                return true;
            }
            fa4.m11636J("focusManager");
            throw null;
        }
        if (i != 5) {
            if (i != 7 || (ld9Var = this.f39191a) == null) {
                return false;
            }
            ((pa2) ld9Var).m19004a();
            return true;
        }
        InterfaceC0300b interfaceC0300b2 = this.f39193c;
        if (interfaceC0300b2 != null) {
            ((C0301c) interfaceC0300b2).m1363i(2, true);
            return true;
        }
        fa4.m11636J("focusManager");
        throw null;
    }
}
