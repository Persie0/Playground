package androidx.compose.p017ui.node;

import cm.InterfaceC2041a;
import dm.C5207g;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import p166i1.C6141e;

/* JADX INFO: renamed from: androidx.compose.ui.node.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0542a {

    /* JADX INFO: renamed from: a */
    public final TreeSet<LayoutNode> f3893a;

    public C0542a() {
        C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<Map<LayoutNode, Integer>>() { // from class: androidx.compose.ui.node.DepthSortedSet$mapOfOriginalDepth$2
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Map<LayoutNode, Integer> mo807E() {
                return new LinkedHashMap();
            }
        });
        this.f3893a = new TreeSet<>(new C6141e());
    }

    /* JADX INFO: renamed from: a */
    public final void m2206a(LayoutNode layoutNode) {
        C5207g.m11111f(layoutNode, "node");
        if (!layoutNode.m2136z()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f3893a.add(layoutNode);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m2207b(LayoutNode layoutNode) {
        C5207g.m11111f(layoutNode, "node");
        if (layoutNode.m2136z()) {
            return this.f3893a.remove(layoutNode);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final String toString() {
        String string = this.f3893a.toString();
        C5207g.m11110e(string, "set.toString()");
        return string;
    }
}
