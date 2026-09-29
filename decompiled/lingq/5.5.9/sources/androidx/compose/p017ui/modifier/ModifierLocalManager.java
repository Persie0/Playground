package androidx.compose.p017ui.modifier;

import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.node.BackwardsCompatNode;
import androidx.compose.p017ui.node.InterfaceC0549h;
import androidx.compose.p017ui.node.LayoutNode;
import cm.InterfaceC2041a;
import dm.C5207g;
import java.util.HashSet;
import java.util.Iterator;
import p105f0.C5458f;
import p142h1.AbstractC5872c;
import p142h1.InterfaceC5873d;
import p142h1.InterfaceC5874e;
import p166i1.C6139d;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class ModifierLocalManager {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0549h f3694a;

    /* JADX INFO: renamed from: b */
    public final C5458f<BackwardsCompatNode> f3695b;

    /* JADX INFO: renamed from: c */
    public final C5458f<AbstractC5872c<?>> f3696c;

    /* JADX INFO: renamed from: d */
    public final C5458f<LayoutNode> f3697d;

    /* JADX INFO: renamed from: e */
    public final C5458f<AbstractC5872c<?>> f3698e;

    /* JADX INFO: renamed from: f */
    public boolean f3699f;

    public ModifierLocalManager(InterfaceC0549h interfaceC0549h) {
        C5207g.m11111f(interfaceC0549h, "owner");
        this.f3694a = interfaceC0549h;
        this.f3695b = new C5458f<>(new BackwardsCompatNode[16]);
        this.f3696c = new C5458f<>(new AbstractC5872c[16]);
        this.f3697d = new C5458f<>(new LayoutNode[16]);
        this.f3698e = new C5458f<>(new AbstractC5872c[16]);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static void m2066b(InterfaceC0500b.c cVar, AbstractC5872c abstractC5872c, HashSet hashSet) {
        boolean z10;
        InterfaceC0500b.c cVar2 = cVar.f3326a;
        if (!cVar2.f3335j) {
            throw new IllegalStateException("Check failed.".toString());
        }
        C5458f c5458f = new C5458f(new InterfaceC0500b.c[16]);
        InterfaceC0500b.c cVar3 = cVar2.f3330e;
        if (cVar3 == null) {
            C6139d.m12648a(c5458f, cVar2);
        } else {
            c5458f.m11687b(cVar3);
        }
        while (c5458f.m11695l()) {
            InterfaceC0500b.c cVar4 = (InterfaceC0500b.c) c5458f.m11697n(c5458f.f34019c - 1);
            if ((cVar4.f3328c & 32) != 0) {
                InterfaceC0500b.c cVar5 = cVar4;
                while (true) {
                    if (cVar5 != null) {
                        if ((cVar5.f3327b & 32) != 0) {
                            if (cVar5 instanceof InterfaceC5874e) {
                                InterfaceC5874e interfaceC5874e = (InterfaceC5874e) cVar5;
                                if (interfaceC5874e instanceof BackwardsCompatNode) {
                                    BackwardsCompatNode backwardsCompatNode = (BackwardsCompatNode) interfaceC5874e;
                                    if ((backwardsCompatNode.f3714k instanceof InterfaceC5873d) && backwardsCompatNode.f3712I.contains(abstractC5872c)) {
                                        hashSet.add(interfaceC5874e);
                                    }
                                }
                                z10 = !interfaceC5874e.mo2092r().mo602o(abstractC5872c);
                            } else {
                                z10 = true;
                            }
                            if (!z10) {
                                break;
                            }
                        }
                        cVar5 = cVar5.f3330e;
                    }
                }
            }
            C6139d.m12648a(c5458f, cVar4);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2067a() {
        if (this.f3699f) {
            return;
        }
        this.f3699f = true;
        this.f3694a.mo2237q(new InterfaceC2041a<C9072e>() { // from class: androidx.compose.ui.modifier.ModifierLocalManager$invalidate$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C9072e mo807E() {
                ModifierLocalManager modifierLocalManager = this.f3700b;
                int i10 = 0;
                modifierLocalManager.f3699f = false;
                HashSet hashSet = new HashSet();
                C5458f<LayoutNode> c5458f = modifierLocalManager.f3697d;
                int i11 = c5458f.f34019c;
                C5458f<AbstractC5872c<?>> c5458f2 = modifierLocalManager.f3698e;
                if (i11 > 0) {
                    LayoutNode[] layoutNodeArr = c5458f.f34017a;
                    int i12 = 0;
                    do {
                        LayoutNode layoutNode = layoutNodeArr[i12];
                        AbstractC5872c<?> abstractC5872c = c5458f2.f34017a[i12];
                        InterfaceC0500b.c cVar = layoutNode.f3758U.f35999e;
                        if (cVar.f3335j) {
                            ModifierLocalManager.m2066b(cVar, abstractC5872c, hashSet);
                        }
                        i12++;
                    } while (i12 < i11);
                }
                c5458f.m11691h();
                c5458f2.m11691h();
                C5458f<BackwardsCompatNode> c5458f3 = modifierLocalManager.f3695b;
                int i13 = c5458f3.f34019c;
                C5458f<AbstractC5872c<?>> c5458f4 = modifierLocalManager.f3696c;
                if (i13 > 0) {
                    BackwardsCompatNode[] backwardsCompatNodeArr = c5458f3.f34017a;
                    do {
                        BackwardsCompatNode backwardsCompatNode = backwardsCompatNodeArr[i10];
                        AbstractC5872c<?> abstractC5872c2 = c5458f4.f34017a[i10];
                        if (backwardsCompatNode.f3335j) {
                            ModifierLocalManager.m2066b(backwardsCompatNode, abstractC5872c2, hashSet);
                        }
                        i10++;
                    } while (i10 < i13);
                }
                c5458f3.m11691h();
                c5458f4.m11691h();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((BackwardsCompatNode) it.next()).m2082K();
                }
                return C9072e.f47360a;
            }
        });
    }
}
