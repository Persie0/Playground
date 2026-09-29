package androidx.compose.p017ui.layout;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.Map;
import p127g1.InterfaceC5645i;

/* JADX INFO: renamed from: androidx.compose.ui.layout.e */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0524e extends InterfaceC5645i {
    /* JADX INFO: renamed from: P */
    default C0523d m2043P(int i10, int i11, Map map, InterfaceC2052l interfaceC2052l) {
        C5207g.m11111f(map, "alignmentLines");
        C5207g.m11111f(interfaceC2052l, "placementBlock");
        return new C0523d(i10, i11, map, this, interfaceC2052l);
    }
}
