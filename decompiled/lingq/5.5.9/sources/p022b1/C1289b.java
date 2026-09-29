package p022b1;

import android.view.KeyEvent;
import dm.C5207g;

/* JADX INFO: renamed from: b1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1289b {

    /* JADX INFO: renamed from: a */
    public final KeyEvent f8000a;

    public final boolean equals(Object obj) {
        if (obj instanceof C1289b) {
            return C5207g.m11106a(this.f8000a, ((C1289b) obj).f8000a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8000a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f8000a + ')';
    }
}
