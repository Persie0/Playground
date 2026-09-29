package p060d1;

import androidx.activity.result.C0204c;
import dm.C5207g;

/* JADX INFO: renamed from: d1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5015b implements InterfaceC5025l {

    /* JADX INFO: renamed from: a */
    public final int f32807a = 1008;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C5207g.m11106a(C5015b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C5207g.m11109d(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f32807a == ((C5015b) obj).f32807a;
    }

    public final int hashCode() {
        return this.f32807a;
    }

    public final String toString() {
        return C0204c.m853l(new StringBuilder("AndroidPointerIcon(type="), this.f32807a, ')');
    }
}
