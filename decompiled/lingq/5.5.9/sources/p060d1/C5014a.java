package p060d1;

import dm.C5207g;

/* JADX INFO: renamed from: d1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5014a implements InterfaceC5025l {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C5207g.m11106a(C5014a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C5207g.m11109d(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIcon");
        return C5207g.m11106a(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "AndroidPointerIcon(pointerIcon=null)";
    }
}
