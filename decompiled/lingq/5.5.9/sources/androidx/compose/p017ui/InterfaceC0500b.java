package androidx.compose.p017ui;

import androidx.compose.p017ui.node.ModifierNodeOwnerScope;
import androidx.compose.p017ui.node.NodeCoordinator;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import dm.C5207g;
import p166i1.InterfaceC6137c;

/* JADX INFO: renamed from: androidx.compose.ui.b */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0500b {

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ int f3324m = 0;

    /* JADX INFO: renamed from: androidx.compose.ui.b$a */
    public static final class a implements InterfaceC0500b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a f3325a = new a();

        @Override // androidx.compose.p017ui.InterfaceC0500b
        /* JADX INFO: renamed from: K */
        public final InterfaceC0500b mo1929K(InterfaceC0500b interfaceC0500b) {
            C5207g.m11111f(interfaceC0500b, "other");
            return interfaceC0500b;
        }

        @Override // androidx.compose.p017ui.InterfaceC0500b
        /* JADX INFO: renamed from: o */
        public final <R> R mo1925o(R r10, InterfaceC2056p<? super R, ? super b, ? extends R> interfaceC2056p) {
            C5207g.m11111f(interfaceC2056p, "operation");
            return r10;
        }

        @Override // androidx.compose.p017ui.InterfaceC0500b
        /* JADX INFO: renamed from: t */
        public final boolean mo1926t(InterfaceC2052l<? super b, Boolean> interfaceC2052l) {
            C5207g.m11111f(interfaceC2052l, "predicate");
            return true;
        }

        public final String toString() {
            return "Modifier";
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.b$b */
    public interface b extends InterfaceC0500b {
        @Override // androidx.compose.p017ui.InterfaceC0500b
        /* JADX INFO: renamed from: o */
        default <R> R mo1925o(R r10, InterfaceC2056p<? super R, ? super b, ? extends R> interfaceC2056p) {
            C5207g.m11111f(interfaceC2056p, "operation");
            return interfaceC2056p.mo1337m0(r10, this);
        }

        @Override // androidx.compose.p017ui.InterfaceC0500b
        /* JADX INFO: renamed from: t */
        default boolean mo1926t(InterfaceC2052l<? super b, Boolean> interfaceC2052l) {
            C5207g.m11111f(interfaceC2052l, "predicate");
            return interfaceC2052l.mo528n(this).booleanValue();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.b$c */
    public static abstract class c implements InterfaceC6137c {

        /* JADX INFO: renamed from: a */
        public final c f3326a = this;

        /* JADX INFO: renamed from: b */
        public int f3327b;

        /* JADX INFO: renamed from: c */
        public int f3328c;

        /* JADX INFO: renamed from: d */
        public c f3329d;

        /* JADX INFO: renamed from: e */
        public c f3330e;

        /* JADX INFO: renamed from: f */
        public ModifierNodeOwnerScope f3331f;

        /* JADX INFO: renamed from: g */
        public NodeCoordinator f3332g;

        /* JADX INFO: renamed from: h */
        public boolean f3333h;

        /* JADX INFO: renamed from: i */
        public boolean f3334i;

        /* JADX INFO: renamed from: j */
        public boolean f3335j;

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: E */
        public final void m1930E() {
            if (!this.f3335j) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!(this.f3332g != null)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            mo1932G();
            this.f3335j = false;
        }

        /* JADX INFO: renamed from: F */
        public void mo1931F() {
        }

        /* JADX INFO: renamed from: G */
        public void mo1932G() {
        }

        /* JADX INFO: renamed from: H */
        public void mo1933H() {
        }

        @Override // p166i1.InterfaceC6137c
        /* JADX INFO: renamed from: v */
        public final c mo1934v() {
            return this.f3326a;
        }
    }

    /* JADX INFO: renamed from: K */
    default InterfaceC0500b mo1929K(InterfaceC0500b interfaceC0500b) {
        C5207g.m11111f(interfaceC0500b, "other");
        return interfaceC0500b == a.f3325a ? this : new CombinedModifier(this, interfaceC0500b);
    }

    /* JADX INFO: renamed from: o */
    <R> R mo1925o(R r10, InterfaceC2056p<? super R, ? super b, ? extends R> interfaceC2056p);

    /* JADX INFO: renamed from: t */
    boolean mo1926t(InterfaceC2052l<? super b, Boolean> interfaceC2052l);
}
