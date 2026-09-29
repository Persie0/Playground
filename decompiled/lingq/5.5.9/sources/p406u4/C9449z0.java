package p406u4;

import android.view.View;
import android.view.WindowId;

/* JADX INFO: renamed from: u4.z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C9449z0 implements InterfaceC9399a1 {

    /* JADX INFO: renamed from: a */
    public final WindowId f48446a;

    public C9449z0(View view) {
        this.f48446a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C9449z0) && ((C9449z0) obj).f48446a.equals(this.f48446a);
    }

    public final int hashCode() {
        return this.f48446a.hashCode();
    }
}
