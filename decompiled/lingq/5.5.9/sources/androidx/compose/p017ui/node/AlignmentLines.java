package androidx.compose.p017ui.node;

import androidx.compose.p017ui.layout.AlignmentLineKt;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.C6753d;
import p127g1.AbstractC5636a;
import p127g1.C5642f;
import p166i1.InterfaceC6133a;
import p260m8.C7499b;
import p338qd.C8573r0;
import p375s0.C8941c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public abstract class AlignmentLines {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6133a f3701a;

    /* JADX INFO: renamed from: c */
    public boolean f3703c;

    /* JADX INFO: renamed from: d */
    public boolean f3704d;

    /* JADX INFO: renamed from: e */
    public boolean f3705e;

    /* JADX INFO: renamed from: f */
    public boolean f3706f;

    /* JADX INFO: renamed from: g */
    public boolean f3707g;

    /* JADX INFO: renamed from: h */
    public InterfaceC6133a f3708h;

    /* JADX INFO: renamed from: b */
    public boolean f3702b = true;

    /* JADX INFO: renamed from: i */
    public final HashMap f3709i = new HashMap();

    public AlignmentLines(InterfaceC6133a interfaceC6133a) {
        this.f3701a = interfaceC6133a;
    }

    /* JADX INFO: renamed from: a */
    public static final void m2068a(AlignmentLines alignmentLines, AbstractC5636a abstractC5636a, int i10, NodeCoordinator nodeCoordinator) {
        alignmentLines.getClass();
        float f3 = i10;
        long jM14932c = C7499b.m14932c(f3, f3);
        while (true) {
            jM14932c = alignmentLines.mo2069b(nodeCoordinator, jM14932c);
            nodeCoordinator = nodeCoordinator.f3846i;
            C5207g.m11108c(nodeCoordinator);
            if (C5207g.m11106a(nodeCoordinator, alignmentLines.f3701a.mo2152f())) {
                break;
            } else if (alignmentLines.mo2070c(nodeCoordinator).containsKey(abstractC5636a)) {
                float fMo2071d = alignmentLines.mo2071d(nodeCoordinator, abstractC5636a);
                jM14932c = C7499b.m14932c(fMo2071d, fMo2071d);
            }
        }
        int iM16710Y0 = abstractC5636a instanceof C5642f ? C8573r0.m16710Y0(C8941c.m17165d(jM14932c)) : C8573r0.m16710Y0(C8941c.m17164c(jM14932c));
        HashMap map = alignmentLines.f3709i;
        if (map.containsKey(abstractC5636a)) {
            int iIntValue = ((Number) C6753d.m13460M0(abstractC5636a, map)).intValue();
            C5642f c5642f = AlignmentLineKt.f3660a;
            C5207g.m11111f(abstractC5636a, "<this>");
            iM16710Y0 = abstractC5636a.f34483a.mo1337m0(Integer.valueOf(iIntValue), Integer.valueOf(iM16710Y0)).intValue();
        }
        map.put(abstractC5636a, Integer.valueOf(iM16710Y0));
    }

    /* JADX INFO: renamed from: b */
    public abstract long mo2069b(NodeCoordinator nodeCoordinator, long j10);

    /* JADX INFO: renamed from: c */
    public abstract Map<AbstractC5636a, Integer> mo2070c(NodeCoordinator nodeCoordinator);

    /* JADX INFO: renamed from: d */
    public abstract int mo2071d(NodeCoordinator nodeCoordinator, AbstractC5636a abstractC5636a);

    /* JADX INFO: renamed from: e */
    public final boolean m2072e() {
        return this.f3703c || this.f3705e || this.f3706f || this.f3707g;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2073f() {
        m2076i();
        return this.f3708h != null;
    }

    /* JADX INFO: renamed from: g */
    public final void m2074g() {
        this.f3702b = true;
        InterfaceC6133a interfaceC6133a = this.f3701a;
        InterfaceC6133a interfaceC6133aMo2154j = interfaceC6133a.mo2154j();
        if (interfaceC6133aMo2154j == null) {
            return;
        }
        if (this.f3703c) {
            interfaceC6133aMo2154j.mo2150Q();
        } else if (this.f3705e || this.f3704d) {
            interfaceC6133aMo2154j.requestLayout();
        }
        if (this.f3706f) {
            interfaceC6133a.mo2150Q();
        }
        if (this.f3707g) {
            interfaceC6133aMo2154j.requestLayout();
        }
        interfaceC6133aMo2154j.mo2151e().m2074g();
    }

    /* JADX INFO: renamed from: h */
    public final void m2075h() {
        HashMap map = this.f3709i;
        map.clear();
        InterfaceC2052l<InterfaceC6133a, C9072e> interfaceC2052l = new InterfaceC2052l<InterfaceC6133a, C9072e>() { // from class: androidx.compose.ui.node.AlignmentLines$recalculate$1
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(InterfaceC6133a interfaceC6133a) {
                AlignmentLines alignmentLines;
                InterfaceC6133a interfaceC6133a2 = interfaceC6133a;
                C5207g.m11111f(interfaceC6133a2, "childOwner");
                if (interfaceC6133a2.mo2146K()) {
                    if (interfaceC6133a2.mo2151e().f3702b) {
                        interfaceC6133a2.mo2144C();
                    }
                    Iterator it = interfaceC6133a2.mo2151e().f3709i.entrySet().iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        alignmentLines = this.f3710b;
                        if (!zHasNext) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        AlignmentLines.m2068a(alignmentLines, (AbstractC5636a) entry.getKey(), ((Number) entry.getValue()).intValue(), interfaceC6133a2.mo2152f());
                    }
                    NodeCoordinator nodeCoordinator = interfaceC6133a2.mo2152f().f3846i;
                    C5207g.m11108c(nodeCoordinator);
                    while (!C5207g.m11106a(nodeCoordinator, alignmentLines.f3701a.mo2152f())) {
                        for (AbstractC5636a abstractC5636a : alignmentLines.mo2070c(nodeCoordinator).keySet()) {
                            AlignmentLines.m2068a(alignmentLines, abstractC5636a, alignmentLines.mo2071d(nodeCoordinator, abstractC5636a), nodeCoordinator);
                        }
                        nodeCoordinator = nodeCoordinator.f3846i;
                        C5207g.m11108c(nodeCoordinator);
                    }
                }
                return C9072e.f47360a;
            }
        };
        InterfaceC6133a interfaceC6133a = this.f3701a;
        interfaceC6133a.mo2153g(interfaceC2052l);
        map.putAll(mo2070c(interfaceC6133a.mo2152f()));
        this.f3702b = false;
    }

    /* JADX INFO: renamed from: i */
    public final void m2076i() {
        AlignmentLines alignmentLinesMo2151e;
        AlignmentLines alignmentLinesMo2151e2;
        boolean zM2072e = m2072e();
        InterfaceC6133a interfaceC6133a = this.f3701a;
        if (!zM2072e) {
            InterfaceC6133a interfaceC6133aMo2154j = interfaceC6133a.mo2154j();
            if (interfaceC6133aMo2154j == null) {
                return;
            }
            interfaceC6133a = interfaceC6133aMo2154j.mo2151e().f3708h;
            if (interfaceC6133a == null || !interfaceC6133a.mo2151e().m2072e()) {
                InterfaceC6133a interfaceC6133a2 = this.f3708h;
                if (interfaceC6133a2 == null || interfaceC6133a2.mo2151e().m2072e()) {
                    return;
                }
                InterfaceC6133a interfaceC6133aMo2154j2 = interfaceC6133a2.mo2154j();
                if (interfaceC6133aMo2154j2 != null && (alignmentLinesMo2151e2 = interfaceC6133aMo2154j2.mo2151e()) != null) {
                    alignmentLinesMo2151e2.m2076i();
                }
                InterfaceC6133a interfaceC6133aMo2154j3 = interfaceC6133a2.mo2154j();
                interfaceC6133a = (interfaceC6133aMo2154j3 == null || (alignmentLinesMo2151e = interfaceC6133aMo2154j3.mo2151e()) == null) ? null : alignmentLinesMo2151e.f3708h;
            }
        }
        this.f3708h = interfaceC6133a;
    }
}
