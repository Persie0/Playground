package androidx.compose.p017ui.focus;

import androidx.compose.p017ui.InterfaceC0500b;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p105f0.C5458f;
import p166i1.C6139d;
import p351r0.C8687f;
import p351r0.InterfaceC8686e;
import p351r0.InterfaceC8692k;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class FocusInvalidationManager {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2052l<InterfaceC2041a<C9072e>, C9072e> f3358a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashSet f3359b = new LinkedHashSet();

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f3360c = new LinkedHashSet();

    /* JADX INFO: renamed from: d */
    public final LinkedHashSet f3361d = new LinkedHashSet();

    /* JADX INFO: renamed from: e */
    public final InterfaceC2041a<C9072e> f3362e = new InterfaceC2041a<C9072e>() { // from class: androidx.compose.ui.focus.FocusInvalidationManager$invalidateNodes$1
        {
            super(0);
        }

        @Override // cm.InterfaceC2041a
        /* JADX INFO: renamed from: E */
        public final C9072e mo807E() {
            FocusStateImpl focusStateImplM16939a;
            FocusInvalidationManager focusInvalidationManager = this.f3363b;
            Iterator it = focusInvalidationManager.f3361d.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                LinkedHashSet<FocusTargetModifierNode> linkedHashSet = focusInvalidationManager.f3359b;
                int i10 = 16;
                if (!zHasNext) {
                    LinkedHashSet linkedHashSet2 = focusInvalidationManager.f3361d;
                    linkedHashSet2.clear();
                    LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                    LinkedHashSet<InterfaceC8686e> linkedHashSet4 = focusInvalidationManager.f3360c;
                    for (InterfaceC8686e interfaceC8686e : linkedHashSet4) {
                        if (interfaceC8686e.mo1934v().f3335j) {
                            if (!interfaceC8686e.mo1934v().f3335j) {
                                throw new IllegalStateException("Check failed.".toString());
                            }
                            C5458f c5458f = new C5458f(new InterfaceC0500b.c[i10]);
                            InterfaceC0500b.c cVar = interfaceC8686e.mo1934v().f3330e;
                            if (cVar == null) {
                                C6139d.m12648a(c5458f, interfaceC8686e.mo1934v());
                            } else {
                                c5458f.m11687b(cVar);
                            }
                            FocusTargetModifierNode focusTargetModifierNode = null;
                            boolean z10 = true;
                            boolean z11 = false;
                            while (c5458f.m11695l()) {
                                InterfaceC0500b.c cVar2 = (InterfaceC0500b.c) c5458f.m11697n(c5458f.f34019c - 1);
                                if ((cVar2.f3328c & 1024) == 0) {
                                    C6139d.m12648a(c5458f, cVar2);
                                } else {
                                    while (cVar2 != null) {
                                        if ((cVar2.f3327b & 1024) != 0) {
                                            if (!(cVar2 instanceof FocusTargetModifierNode)) {
                                                break;
                                            }
                                            FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) cVar2;
                                            if (focusTargetModifierNode != null) {
                                                z11 = true;
                                            }
                                            if (linkedHashSet.contains(focusTargetModifierNode2)) {
                                                linkedHashSet3.add(focusTargetModifierNode2);
                                                z10 = false;
                                            }
                                            focusTargetModifierNode = focusTargetModifierNode2;
                                            break;
                                        }
                                        cVar2 = cVar2.f3330e;
                                    }
                                }
                            }
                            if (z10) {
                                if (z11) {
                                    focusStateImplM16939a = C8687f.m16939a(interfaceC8686e);
                                } else if (focusTargetModifierNode == null || (focusStateImplM16939a = focusTargetModifierNode.f3392k) == null) {
                                    focusStateImplM16939a = FocusStateImpl.Inactive;
                                }
                                interfaceC8686e.mo2095w(focusStateImplM16939a);
                            }
                            i10 = 16;
                        }
                    }
                    linkedHashSet4.clear();
                    for (FocusTargetModifierNode focusTargetModifierNode3 : linkedHashSet) {
                        if (focusTargetModifierNode3.f3335j) {
                            FocusStateImpl focusStateImpl = focusTargetModifierNode3.f3392k;
                            focusTargetModifierNode3.m1972J();
                            if (!C5207g.m11106a(focusStateImpl, focusTargetModifierNode3.f3392k) || linkedHashSet3.contains(focusTargetModifierNode3)) {
                                C8687f.m16940b(focusTargetModifierNode3);
                            }
                        }
                    }
                    linkedHashSet.clear();
                    linkedHashSet3.clear();
                    if (!linkedHashSet2.isEmpty()) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    if (!linkedHashSet4.isEmpty()) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    if (linkedHashSet.isEmpty()) {
                        return C9072e.f47360a;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                InterfaceC8692k interfaceC8692k = (InterfaceC8692k) it.next();
                if (!interfaceC8692k.mo1934v().f3335j) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                C5458f c5458f2 = new C5458f(new InterfaceC0500b.c[16]);
                InterfaceC0500b.c cVar3 = interfaceC8692k.mo1934v().f3330e;
                if (cVar3 == null) {
                    C6139d.m12648a(c5458f2, interfaceC8692k.mo1934v());
                } else {
                    c5458f2.m11687b(cVar3);
                }
                while (c5458f2.m11695l()) {
                    InterfaceC0500b.c cVar4 = (InterfaceC0500b.c) c5458f2.m11697n(c5458f2.f34019c - 1);
                    if ((cVar4.f3328c & 1024) == 0) {
                        C6139d.m12648a(c5458f2, cVar4);
                    } else {
                        while (cVar4 != null) {
                            if ((cVar4.f3327b & 1024) != 0) {
                                if (!(cVar4 instanceof FocusTargetModifierNode)) {
                                    break;
                                }
                                linkedHashSet.add((FocusTargetModifierNode) cVar4);
                                break;
                            }
                            cVar4 = cVar4.f3330e;
                        }
                    }
                }
            }
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public FocusInvalidationManager(InterfaceC2052l<? super InterfaceC2041a<C9072e>, C9072e> interfaceC2052l) {
        this.f3358a = interfaceC2052l;
    }

    /* JADX INFO: renamed from: a */
    public final void m1953a(LinkedHashSet linkedHashSet, Object obj) {
        if (linkedHashSet.contains(obj)) {
            return;
        }
        linkedHashSet.add(obj);
        if (this.f3361d.size() + this.f3360c.size() + this.f3359b.size() == 1) {
            this.f3358a.mo528n(this.f3362e);
        }
    }
}
