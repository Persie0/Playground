package p000;

import androidx.compose.foundation.text.contextmenu.modifier.C0174c;
import androidx.compose.foundation.text.contextmenu.modifier.ToolbarHandlerState;

/* JADX INFO: loaded from: classes.dex */
final class pt9 extends i16 {

    /* JADX INFO: renamed from: b */
    public final C0174c f56783b;

    /* JADX INFO: renamed from: c */
    public final vi3 f56784c;

    /* JADX INFO: renamed from: d */
    public final vi3 f56785d;

    /* JADX INFO: renamed from: e */
    public final vm1 f56786e;

    public pt9(C0174c c0174c, vi3 vi3Var, vi3 vi3Var2, vm1 vm1Var) {
        this.f56783b = c0174c;
        this.f56784c = vi3Var;
        this.f56785d = vi3Var2;
        this.f56786e = vm1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pt9)) {
            return false;
        }
        pt9 pt9Var = (pt9) obj;
        return this.f56783b == pt9Var.f56783b && this.f56784c == pt9Var.f56784c && this.f56785d == pt9Var.f56785d && this.f56786e == pt9Var.f56786e;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        return new qt9(this.f56783b, this.f56784c, this.f56785d, this.f56786e);
    }

    public final int hashCode() {
        return this.f56786e.hashCode() + ((this.f56785d.hashCode() + ((this.f56784c.hashCode() + (this.f56783b.hashCode() * 31)) * 31)) * 31);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        qt9 qt9Var = (qt9) d16Var;
        qt9Var.f58192L.f2882a = null;
        C0174c c0174c = this.f56783b;
        qt9Var.f58192L = c0174c;
        c0174c.f2882a = qt9Var;
        c0174c.f2883b = qt9Var.f34836I ? ToolbarHandlerState.Attached : ToolbarHandlerState.Detached;
        qt9Var.f58193M = this.f56784c;
        qt9Var.f58194N = this.f56785d;
        qt9Var.f58195O = this.f56786e;
    }
}
