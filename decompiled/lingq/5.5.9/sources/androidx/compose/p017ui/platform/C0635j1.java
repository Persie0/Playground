package androidx.compose.p017ui.platform;

import java.util.ArrayList;
import java.util.Iterator;
import p249lo.InterfaceC7415h;

/* JADX INFO: renamed from: androidx.compose.ui.platform.j1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0635j1 implements InterfaceC7415h<C0632i1> {

    /* JADX INFO: renamed from: a */
    public final ArrayList f4320a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final void m2359b(Object obj, String str) {
        this.f4320a.add(new C0632i1(obj, str));
    }

    @Override // p249lo.InterfaceC7415h
    public final Iterator<C0632i1> iterator() {
        return this.f4320a.iterator();
    }
}
