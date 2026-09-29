package p443w;

import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.platform.InspectableValueKt;
import dm.C5207g;

/* JADX INFO: renamed from: w.q */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC9786q {
    /* JADX INFO: renamed from: a */
    static InterfaceC0500b m18282a(InterfaceC0500b interfaceC0500b) {
        C5207g.m11111f(interfaceC0500b, "<this>");
        if (((double) 1.0f) > 0.0d) {
            return interfaceC0500b.mo1929K(new C9776g(true, InspectableValueKt.f4184a));
        }
        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
    }
}
