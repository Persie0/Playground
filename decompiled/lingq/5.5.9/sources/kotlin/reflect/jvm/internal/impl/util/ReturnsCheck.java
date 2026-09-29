package kotlin.reflect.jvm.internal.impl.util;

import cm.InterfaceC2052l;
import dm.C5207g;
import io.InterfaceC6378e;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p543do.AbstractC5257t;
import p543do.AbstractC5265x;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ReturnsCheck implements InterfaceC6378e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2052l<AbstractC6795c, AbstractC5257t> f39928a;

    /* JADX INFO: renamed from: b */
    public final String f39929b;

    public static final class ReturnsBoolean extends ReturnsCheck {

        /* JADX INFO: renamed from: c */
        public static final ReturnsBoolean f39930c = new ReturnsBoolean();

        public ReturnsBoolean() {
            super("Boolean", new InterfaceC2052l<AbstractC6795c, AbstractC5257t>() { // from class: kotlin.reflect.jvm.internal.impl.util.ReturnsCheck.ReturnsBoolean.1
                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final AbstractC5257t mo528n(AbstractC6795c abstractC6795c) {
                    AbstractC6795c abstractC6795c2 = abstractC6795c;
                    C5207g.m11111f(abstractC6795c2, "$this$null");
                    AbstractC5265x abstractC5265xM13562t = abstractC6795c2.m13562t(PrimitiveType.BOOLEAN);
                    if (abstractC5265xM13562t != null) {
                        return abstractC5265xM13562t;
                    }
                    AbstractC6795c.m13540a(63);
                    throw null;
                }
            });
        }
    }

    public static final class ReturnsInt extends ReturnsCheck {

        /* JADX INFO: renamed from: c */
        public static final ReturnsInt f39932c = new ReturnsInt();

        public ReturnsInt() {
            super("Int", new InterfaceC2052l<AbstractC6795c, AbstractC5257t>() { // from class: kotlin.reflect.jvm.internal.impl.util.ReturnsCheck.ReturnsInt.1
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final AbstractC5257t mo528n(AbstractC6795c abstractC6795c) {
                    AbstractC6795c abstractC6795c2 = abstractC6795c;
                    C5207g.m11111f(abstractC6795c2, "$this$null");
                    AbstractC5265x abstractC5265xM13562t = abstractC6795c2.m13562t(PrimitiveType.INT);
                    if (abstractC5265xM13562t != null) {
                        return abstractC5265xM13562t;
                    }
                    AbstractC6795c.m13540a(58);
                    throw null;
                }
            });
        }
    }

    public static final class ReturnsUnit extends ReturnsCheck {

        /* JADX INFO: renamed from: c */
        public static final ReturnsUnit f39934c = new ReturnsUnit();

        public ReturnsUnit() {
            super("Unit", new InterfaceC2052l<AbstractC6795c, AbstractC5257t>() { // from class: kotlin.reflect.jvm.internal.impl.util.ReturnsCheck.ReturnsUnit.1
                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final AbstractC5257t mo528n(AbstractC6795c abstractC6795c) {
                    AbstractC6795c abstractC6795c2 = abstractC6795c;
                    C5207g.m11111f(abstractC6795c2, "$this$null");
                    AbstractC5265x abstractC5265xM13565x = abstractC6795c2.m13565x();
                    C5207g.m11110e(abstractC5265xM13565x, "unitType");
                    return abstractC5265xM13565x;
                }
            });
        }
    }

    public ReturnsCheck(String str, InterfaceC2052l interfaceC2052l) {
        this.f39928a = interfaceC2052l;
        this.f39929b = "must return ".concat(str);
    }

    @Override // io.InterfaceC6378e
    /* JADX INFO: renamed from: a */
    public final String mo13009a(InterfaceC6822c interfaceC6822c) {
        return InterfaceC6378e.a.m13012a(this, interfaceC6822c);
    }

    @Override // io.InterfaceC6378e
    /* JADX INFO: renamed from: b */
    public final String mo13010b() {
        return this.f39929b;
    }

    @Override // io.InterfaceC6378e
    /* JADX INFO: renamed from: c */
    public final boolean mo13011c(InterfaceC6822c interfaceC6822c) {
        C5207g.m11111f(interfaceC6822c, "functionDescriptor");
        return C5207g.m11106a(interfaceC6822c.mo11900y(), this.f39928a.mo528n(DescriptorUtilsKt.m14108e(interfaceC6822c)));
    }
}
