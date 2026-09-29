package p000;

import androidx.compose.foundation.layout.Direction;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public final class y33 extends i16 {

    /* JADX INFO: renamed from: b */
    public final Direction f69209b;

    /* JADX INFO: renamed from: c */
    public final float f69210c;

    /* JADX INFO: renamed from: d */
    public final String f69211d;

    public y33(Direction direction, float f, String str) {
        this.f69209b = direction;
        this.f69210c = f;
        this.f69211d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y33)) {
            return false;
        }
        y33 y33Var = (y33) obj;
        return this.f69209b == y33Var.f69209b && this.f69210c == y33Var.f69210c;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        z33 z33Var = new z33();
        z33Var.f70828J = this.f69209b;
        z33Var.f70829K = this.f69210c;
        return z33Var;
    }

    public final int hashCode() {
        return Float.hashCode(this.f69210c) + (this.f69209b.hashCode() * 31);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = this.f69211d;
        y64Var.f69367c.m25511b(Float.valueOf(this.f69210c), "fraction");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        z33 z33Var = (z33) d16Var;
        z33Var.f70828J = this.f69209b;
        z33Var.f70829K = this.f69210c;
    }
}
