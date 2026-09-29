package p543do;

import cm.InterfaceC2052l;
import dm.C5207g;
import io.AbstractC6377d;
import io.C6376c;
import io.C6386m;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import km.InterfaceC6719b;
import km.InterfaceC6720c;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.util.TypeRegistry;
import p100em.InterfaceC5429a;

/* JADX INFO: renamed from: do.j0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5238j0 extends AbstractC6377d<AbstractC5234h0<?>, AbstractC5234h0<?>> {

    /* JADX INFO: renamed from: b */
    public static final a f33329b = new a(0);

    /* JADX INFO: renamed from: c */
    public static final C5238j0 f33330c = new C5238j0(EmptyList.f38032a);

    /* JADX INFO: renamed from: do.j0$a */
    public static final class a extends TypeRegistry<AbstractC5234h0<?>, AbstractC5234h0<?>> {
        public a(int i10) {
        }

        /* JADX INFO: renamed from: c */
        public static C5238j0 m11272c(List list) {
            return list.isEmpty() ? C5238j0.f33330c : new C5238j0(list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.util.TypeRegistry
        /* JADX INFO: renamed from: a */
        public final <T extends AbstractC5234h0<?>> int mo11273a(ConcurrentHashMap<InterfaceC6719b<? extends AbstractC5234h0<?>>, Integer> concurrentHashMap, InterfaceC6719b<T> interfaceC6719b, InterfaceC2052l<? super InterfaceC6719b<? extends AbstractC5234h0<?>>, Integer> interfaceC2052l) {
            int iIntValue;
            C5207g.m11111f(concurrentHashMap, "<this>");
            C5207g.m11111f(interfaceC6719b, "kClass");
            Integer num = concurrentHashMap.get(interfaceC6719b);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                Integer num2 = concurrentHashMap.get(interfaceC6719b);
                if (num2 == null) {
                    Integer numMo528n = interfaceC2052l.mo528n(interfaceC6719b);
                    concurrentHashMap.putIfAbsent(interfaceC6719b, Integer.valueOf(numMo528n.intValue()));
                    num2 = numMo528n;
                }
                C5207g.m11110e(num2, "this[kClass] ?: compute(…putIfAbsent(kClass, it) }");
                iIntValue = num2.intValue();
            }
            return iIntValue;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C5238j0() {
        throw null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public C5238j0(List<? extends AbstractC5234h0<?>> list) {
        for (AbstractC5234h0<?> abstractC5234h0 : list) {
            InterfaceC6720c interfaceC6720cMo11248b = abstractC5234h0.mo11248b();
            C5207g.m11111f(interfaceC6720cMo11248b, "tClass");
            int iM14243b = f33329b.m14243b(interfaceC6720cMo11248b);
            int iMo13006a = this.f36779a.mo13006a();
            if (iMo13006a != 0) {
                if (iMo13006a == 1) {
                    InterfaceC5429a interfaceC5429a = this.f36779a;
                    C5207g.m11109d(interfaceC5429a, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                    C6386m c6386m = (C6386m) interfaceC5429a;
                    if (c6386m.f36791b == iM14243b) {
                        this.f36779a = new C6386m(iM14243b, abstractC5234h0);
                    } else {
                        C6376c c6376c = new C6376c();
                        this.f36779a = c6376c;
                        c6376c.mo13007f(c6386m.f36791b, c6386m.f36790a);
                    }
                }
                this.f36779a.mo13007f(iM14243b, abstractC5234h0);
            } else {
                this.f36779a = new C6386m(iM14243b, abstractC5234h0);
            }
        }
    }
}
