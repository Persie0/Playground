package p420um;

import cm.InterfaceC2041a;
import co.InterfaceC2074f;
import mn.C7648e;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8838g;
import p373rn.AbstractC8875g;
import sm.InterfaceC9077e;

/* JADX INFO: renamed from: um.m0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9580m0 extends AbstractC9578l0 {

    /* JADX INFO: renamed from: f */
    public final boolean f49221f;

    /* JADX INFO: renamed from: g */
    public InterfaceC2074f<AbstractC8875g<?>> f49222g;

    /* JADX INFO: renamed from: h */
    public InterfaceC2041a<InterfaceC2074f<AbstractC8875g<?>>> f49223h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public AbstractC9580m0(InterfaceC8838g interfaceC8838g, InterfaceC9077e interfaceC9077e, C7648e c7648e, boolean z10, InterfaceC8837f0 interfaceC8837f0) {
        super(interfaceC8838g, interfaceC9077e, c7648e, null, interfaceC8837f0);
        if (interfaceC8838g == null) {
            m18040N(0);
            throw null;
        }
        if (interfaceC9077e == null) {
            m18040N(1);
            throw null;
        }
        if (c7648e == null) {
            m18040N(2);
            throw null;
        }
        if (interfaceC8837f0 == null) {
            m18040N(3);
            throw null;
        }
        this.f49221f = z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m18040N(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "annotations";
        } else if (i10 == 2) {
            objArr[0] = "name";
        } else if (i10 == 3) {
            objArr[0] = "source";
        } else if (i10 == 4 || i10 == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i10 == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i10 != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX INFO: renamed from: P0 */
    public final void m18041P0(InterfaceC2074f<AbstractC8875g<?>> interfaceC2074f, InterfaceC2041a<InterfaceC2074f<AbstractC8875g<?>>> interfaceC2041a) {
        if (interfaceC2041a == null) {
            m18040N(5);
            throw null;
        }
        this.f49223h = interfaceC2041a;
        if (interfaceC2074f == null) {
            interfaceC2074f = interfaceC2041a.mo807E();
        }
        this.f49222g = interfaceC2074f;
    }

    @Override // p372rm.InterfaceC8855o0
    /* JADX INFO: renamed from: e0 */
    public final AbstractC8875g<?> mo11885e0() {
        InterfaceC2074f<AbstractC8875g<?>> interfaceC2074f = this.f49222g;
        if (interfaceC2074f != null) {
            return interfaceC2074f.mo807E();
        }
        return null;
    }

    @Override // p372rm.InterfaceC8855o0
    /* JADX INFO: renamed from: q0 */
    public final boolean mo11894q0() {
        return this.f49221f;
    }
}
