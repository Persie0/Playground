package p166i1;

import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.focus.FocusTargetModifierNode;
import androidx.compose.p017ui.node.BackwardsCompatNode;
import androidx.compose.p017ui.node.C0543b;
import androidx.compose.p017ui.node.InterfaceC0544c;
import androidx.compose.p017ui.node.LayoutNode;
import androidx.compose.p017ui.node.NodeCoordinator;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import p022b1.InterfaceC1291d;
import p105f0.C5458f;
import p106f1.InterfaceC5459a;
import p142h1.InterfaceC5874e;
import p351r0.InterfaceC8686e;
import p351r0.InterfaceC8692k;

/* JADX INFO: renamed from: i1.u */
/* JADX INFO: loaded from: classes.dex */
public final class C6166u {

    /* JADX INFO: renamed from: a */
    public final LayoutNode f35995a;

    /* JADX INFO: renamed from: b */
    public final C0543b f35996b;

    /* JADX INFO: renamed from: c */
    public NodeCoordinator f35997c;

    /* JADX INFO: renamed from: d */
    public final C0543b.a f35998d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0500b.c f35999e;

    /* JADX INFO: renamed from: f */
    public C5458f<InterfaceC0500b.b> f36000f;

    /* JADX INFO: renamed from: g */
    public C5458f<InterfaceC0500b.b> f36001g;

    /* JADX INFO: renamed from: h */
    public a f36002h;

    /* JADX INFO: renamed from: i1.u$a */
    public final class a {

        /* JADX INFO: renamed from: a */
        public InterfaceC0500b.c f36003a;

        /* JADX INFO: renamed from: b */
        public int f36004b;

        /* JADX INFO: renamed from: c */
        public C5458f<InterfaceC0500b.b> f36005c;

        /* JADX INFO: renamed from: d */
        public C5458f<InterfaceC0500b.b> f36006d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C6166u f36007e;

        public a(C6166u c6166u, InterfaceC0500b.c cVar, int i10, C5458f<InterfaceC0500b.b> c5458f, C5458f<InterfaceC0500b.b> c5458f2) {
            C5207g.m11111f(cVar, "node");
            this.f36007e = c6166u;
            this.f36003a = cVar;
            this.f36004b = i10;
            this.f36005c = c5458f;
            this.f36006d = c5458f2;
        }

        /* JADX INFO: renamed from: a */
        public final void m12688a(int i10) {
            InterfaceC0500b.c cVar = this.f36003a;
            InterfaceC0500b.b bVar = this.f36006d.f34017a[i10];
            this.f36007e.getClass();
            InterfaceC0500b.c cVarM12683b = C6166u.m12683b(bVar, cVar);
            this.f36003a = cVarM12683b;
            if (!(!cVarM12683b.f3335j)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            cVarM12683b.f3333h = true;
            int i11 = this.f36004b | cVarM12683b.f3327b;
            this.f36004b = i11;
            cVarM12683b.f3328c = i11;
        }

        /* JADX INFO: renamed from: b */
        public final void m12689b(int i10, int i11) {
            InterfaceC0500b.c cVar = this.f36003a.f3329d;
            C5207g.m11108c(cVar);
            this.f36003a = cVar;
            InterfaceC0500b.b bVar = this.f36005c.f34017a[i10];
            InterfaceC0500b.b bVar2 = this.f36006d.f34017a[i11];
            boolean zM11106a = C5207g.m11106a(bVar, bVar2);
            C6166u c6166u = this.f36007e;
            if (zM11106a) {
                c6166u.getClass();
            } else {
                InterfaceC0500b.c cVar2 = this.f36003a;
                c6166u.getClass();
                this.f36003a = C6166u.m12685e(bVar, bVar2, cVar2);
            }
            int i12 = this.f36004b;
            InterfaceC0500b.c cVar3 = this.f36003a;
            int i13 = i12 | cVar3.f3327b;
            this.f36004b = i13;
            cVar3.f3328c = i13;
        }
    }

    public C6166u(LayoutNode layoutNode) {
        C5207g.m11111f(layoutNode, "layoutNode");
        this.f35995a = layoutNode;
        C0543b c0543b = new C0543b(layoutNode);
        this.f35996b = c0543b;
        this.f35997c = c0543b;
        C0543b.a aVar = c0543b.f3895a0;
        this.f35998d = aVar;
        this.f35999e = aVar;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static InterfaceC0500b.c m12683b(InterfaceC0500b.b bVar, InterfaceC0500b.c cVar) {
        InterfaceC0500b.c backwardsCompatNode;
        if (bVar instanceof AbstractC6165t) {
            backwardsCompatNode = ((AbstractC6165t) bVar).mo1935c();
            C5207g.m11111f(backwardsCompatNode, "node");
            int i10 = backwardsCompatNode instanceof InterfaceC0544c ? 3 : 1;
            if (backwardsCompatNode instanceof InterfaceC6143f) {
                i10 |= 4;
            }
            if (backwardsCompatNode instanceof InterfaceC6154k0) {
                i10 |= 8;
            }
            if (backwardsCompatNode instanceof InterfaceC6146g0) {
                i10 |= 16;
            }
            if (backwardsCompatNode instanceof InterfaceC5874e) {
                i10 |= 32;
            }
            if (backwardsCompatNode instanceof InterfaceC6144f0) {
                i10 |= 64;
            }
            if (backwardsCompatNode instanceof InterfaceC6160o) {
                i10 |= BuildConfig.SDK_TRUNCATE_LENGTH;
            }
            if (backwardsCompatNode instanceof InterfaceC6149i) {
                i10 |= 256;
            }
            if (backwardsCompatNode instanceof InterfaceC6155l) {
                i10 |= 512;
            }
            if (backwardsCompatNode instanceof FocusTargetModifierNode) {
                i10 |= 1024;
            }
            if (backwardsCompatNode instanceof InterfaceC8692k) {
                i10 |= 2048;
            }
            if (backwardsCompatNode instanceof InterfaceC8686e) {
                i10 |= 4096;
            }
            if (backwardsCompatNode instanceof InterfaceC1291d) {
                i10 |= 8192;
            }
            if (backwardsCompatNode instanceof InterfaceC5459a) {
                i10 |= 16384;
            }
            backwardsCompatNode.f3327b = i10;
        } else {
            backwardsCompatNode = new BackwardsCompatNode(bVar);
        }
        if (!(!backwardsCompatNode.f3335j)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        backwardsCompatNode.f3333h = true;
        InterfaceC0500b.c cVar2 = cVar.f3329d;
        if (cVar2 != null) {
            cVar2.f3330e = backwardsCompatNode;
            backwardsCompatNode.f3329d = cVar2;
        }
        cVar.f3329d = backwardsCompatNode;
        backwardsCompatNode.f3330e = cVar;
        return backwardsCompatNode;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC0500b.c m12684c(InterfaceC0500b.c cVar) {
        if (cVar.f3335j) {
            C6169x.m12692a(cVar, 2);
            cVar.m1930E();
        }
        InterfaceC0500b.c cVar2 = cVar.f3330e;
        InterfaceC0500b.c cVar3 = cVar.f3329d;
        if (cVar2 != null) {
            cVar2.f3329d = cVar3;
            cVar.f3330e = null;
        }
        if (cVar3 != null) {
            cVar3.f3330e = cVar2;
            cVar.f3329d = null;
        }
        C5207g.m11108c(cVar2);
        return cVar2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public static InterfaceC0500b.c m12685e(InterfaceC0500b.b bVar, InterfaceC0500b.b bVar2, InterfaceC0500b.c cVar) {
        if (!(bVar instanceof AbstractC6165t) || !(bVar2 instanceof AbstractC6165t)) {
            if (!(cVar instanceof BackwardsCompatNode)) {
                throw new IllegalStateException("Unknown Modifier.Node type".toString());
            }
            BackwardsCompatNode backwardsCompatNode = (BackwardsCompatNode) cVar;
            backwardsCompatNode.getClass();
            C5207g.m11111f(bVar2, "value");
            if (backwardsCompatNode.f3335j) {
                backwardsCompatNode.m2081J();
            }
            backwardsCompatNode.f3714k = bVar2;
            backwardsCompatNode.f3327b = C6169x.m12693b(bVar2);
            if (backwardsCompatNode.f3335j) {
                backwardsCompatNode.m2080I(false);
            }
            if (cVar.f3335j) {
                C6169x.m12692a(cVar, 0);
            } else {
                cVar.f3334i = true;
            }
            return cVar;
        }
        AbstractC6165t abstractC6165t = (AbstractC6165t) bVar2;
        C6167v.a aVar = C6167v.f36008a;
        C5207g.m11109d(cVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
        InterfaceC0500b.c cVarMo1936h = abstractC6165t.mo1936h(cVar);
        if (cVarMo1936h == cVar) {
            if (abstractC6165t.mo1947d()) {
                if (cVarMo1936h.f3335j) {
                    C6169x.m12692a(cVarMo1936h, 0);
                } else {
                    cVarMo1936h.f3334i = true;
                }
            }
            return cVarMo1936h;
        }
        if (!(!cVarMo1936h.f3335j)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        cVarMo1936h.f3333h = true;
        if (cVar.f3335j) {
            C6169x.m12692a(cVar, 2);
            cVar.m1930E();
        }
        InterfaceC0500b.c cVar2 = cVar.f3329d;
        if (cVar2 != null) {
            cVarMo1936h.f3329d = cVar2;
            cVar2.f3330e = cVarMo1936h;
            cVar.f3329d = null;
        }
        InterfaceC0500b.c cVar3 = cVar.f3330e;
        if (cVar3 != null) {
            cVarMo1936h.f3330e = cVar3;
            cVar3.f3329d = cVarMo1936h;
            cVar.f3330e = null;
        }
        cVarMo1936h.f3332g = cVar.f3332g;
        return cVarMo1936h;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final void m12686a(boolean z10) {
        for (InterfaceC0500b.c cVar = this.f35999e; cVar != null; cVar = cVar.f3330e) {
            boolean z11 = cVar.f3335j;
            if (!z11) {
                if (!(!z11)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (!(cVar.f3332g != null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                cVar.f3335j = true;
                cVar.mo1931F();
                if (z10) {
                    if (cVar.f3333h) {
                        C6169x.m12692a(cVar, 1);
                    }
                    if (cVar.f3334i) {
                        C6169x.m12692a(cVar, 0);
                    }
                }
                cVar.f3333h = false;
                cVar.f3334i = false;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v7 ??, still in use, count: 1, list:
          (r9v7 ?? I:i1.u$a) from 0x001c: IPUT (r9v7 ?? I:i1.u$a), (r30v0 'this' ?? I:i1.u A[IMMUTABLE_TYPE, THIS]) i1.u.h i1.u$a
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX INFO: renamed from: d */
    public final void m12687d(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v7 ??, still in use, count: 1, list:
          (r9v7 ?? I:i1.u$a) from 0x001c: IPUT (r9v7 ?? I:i1.u$a), (r30v0 'this' ?? I:i1.u A[IMMUTABLE_TYPE, THIS]) i1.u.h i1.u$a
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r31v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        InterfaceC0500b.c cVar = this.f35999e;
        C0543b.a aVar = this.f35998d;
        if (cVar == aVar) {
            sb2.append("]");
        } else {
            while (cVar != null && cVar != aVar) {
                sb2.append(String.valueOf(cVar));
                if (cVar.f3330e == aVar) {
                    sb2.append("]");
                } else {
                    sb2.append(",");
                    cVar = cVar.f3330e;
                }
            }
        }
        String string = sb2.toString();
        C5207g.m11110e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
