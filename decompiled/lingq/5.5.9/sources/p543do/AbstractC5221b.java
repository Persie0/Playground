package p543do;

import co.InterfaceC2076h;
import dm.C5207g;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import jo.C6531c;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8863u;
import p372rm.InterfaceC8865w;

/* JADX INFO: renamed from: do.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5221b extends AbstractTypeConstructor {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5221b(InterfaceC2076h interfaceC2076h) {
        super(interfaceC2076h);
        if (interfaceC2076h != null) {
        } else {
            m11229k(0);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003e  */
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m11229k(int i10) {
        String str = (i10 == 1 || i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 3 || i10 == 4) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else if (i10 == 2) {
            objArr[0] = "classifier";
        } else if (i10 == 3 || i10 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else {
            objArr[0] = "storageManager";
        }
        if (i10 == 1) {
            objArr[1] = "getBuiltIns";
        } else if (i10 == 3 || i10 == 4) {
            objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        }
        if (i10 != 1) {
            if (i10 == 2) {
                objArr[2] = "isSameClassifier";
            } else if (i10 != 3 && i10 != 4) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 3 && i10 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p543do.AbstractC5231g
    /* JADX INFO: renamed from: c */
    public final boolean mo11230c(InterfaceC8834e interfaceC8834e) {
        boolean z10;
        boolean z11 = false;
        if (interfaceC8834e instanceof InterfaceC8830c) {
            InterfaceC8830c interfaceC8830cMo11235q = mo11235q();
            C5207g.m11111f(interfaceC8830cMo11235q, "first");
            if (!C5207g.m11106a(interfaceC8830cMo11235q.mo11874a(), interfaceC8834e.mo11874a())) {
                z10 = false;
                break;
            }
            InterfaceC8838g interfaceC8838gMo11876g = interfaceC8830cMo11235q.mo11876g();
            InterfaceC8838g interfaceC8838gMo11876g2 = interfaceC8834e.mo11876g();
            while (true) {
                if (interfaceC8838gMo11876g != null && interfaceC8838gMo11876g2 != null) {
                    if (!(interfaceC8838gMo11876g instanceof InterfaceC8863u)) {
                        if (!(interfaceC8838gMo11876g2 instanceof InterfaceC8863u)) {
                            if (interfaceC8838gMo11876g instanceof InterfaceC8865w) {
                                if (!(interfaceC8838gMo11876g2 instanceof InterfaceC8865w) || !C5207g.m11106a(((InterfaceC8865w) interfaceC8838gMo11876g).mo17120e(), ((InterfaceC8865w) interfaceC8838gMo11876g2).mo17120e())) {
                                    break;
                                }
                            } else if (!(interfaceC8838gMo11876g2 instanceof InterfaceC8865w) && C5207g.m11106a(interfaceC8838gMo11876g.mo11874a(), interfaceC8838gMo11876g2.mo11874a())) {
                                interfaceC8838gMo11876g = interfaceC8838gMo11876g.mo11876g();
                                interfaceC8838gMo11876g2 = interfaceC8838gMo11876g2.mo11876g();
                            }
                        }
                        z10 = false;
                        break;
                    }
                    z10 = interfaceC8838gMo11876g2 instanceof InterfaceC8863u;
                    break;
                }
                z10 = true;
                break;
            }
            if (z10) {
                z11 = true;
            }
        }
        return z11;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    /* JADX INFO: renamed from: e */
    public final AbstractC5257t mo11231e() {
        if (AbstractC6795c.m13536I(mo11235q())) {
            return null;
        }
        return mo11234o().m13549f();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    /* JADX INFO: renamed from: f */
    public final Collection mo11232f() {
        InterfaceC8838g interfaceC8838gMo11876g = mo11235q().mo11876g();
        if (interfaceC8838gMo11876g instanceof InterfaceC8830c) {
            C6531c c6531c = new C6531c();
            InterfaceC8830c interfaceC8830c = (InterfaceC8830c) interfaceC8838gMo11876g;
            c6531c.add(interfaceC8830c.mo5316v());
            interfaceC8830c.mo13599b0();
            return c6531c;
        }
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        m11229k(3);
        throw null;
    }

    @Override // p543do.InterfaceC5240k0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public abstract InterfaceC8830c mo11235q();

    @Override // p543do.InterfaceC5240k0
    /* JADX INFO: renamed from: o */
    public final AbstractC6795c mo11234o() {
        AbstractC6795c abstractC6795cM14108e = DescriptorUtilsKt.m14108e(mo11235q());
        if (abstractC6795cM14108e != null) {
            return abstractC6795cM14108e;
        }
        m11229k(1);
        throw null;
    }
}
