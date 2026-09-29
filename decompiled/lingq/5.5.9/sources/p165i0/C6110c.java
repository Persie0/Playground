package p165i0;

import dm.C5207g;
import java.util.Map;
import java.util.NoSuchElementException;
import p100em.InterfaceC5432d;

/* JADX INFO: renamed from: i0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6110c<K, V> extends C6109b<K, V> implements InterfaceC5432d.a {

    /* JADX INFO: renamed from: c */
    public final C6116i<K, V> f35922c;

    /* JADX INFO: renamed from: d */
    public V f35923d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6110c(C6116i<K, V> c6116i, K k10, V v10) {
        super(k10, v10);
        C5207g.m11111f(c6116i, "parentIterator");
        this.f35922c = c6116i;
        this.f35923d = v10;
    }

    @Override // p165i0.C6109b, java.util.Map.Entry
    public final V getValue() {
        return this.f35923d;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // p165i0.C6109b, java.util.Map.Entry
    public final V setValue(V v10) {
        V v11 = this.f35923d;
        this.f35923d = v10;
        C6114g<K, V, Map.Entry<K, V>> c6114g = this.f35922c.f35941a;
        C6113f<K, V> c6113f = c6114g.f35936d;
        K k10 = this.f35920a;
        if (c6113f.containsKey(k10)) {
            boolean z10 = c6114g.f35929c;
            if (!z10) {
                c6113f.put(k10, v10);
            } else {
                if (!z10) {
                    throw new NoSuchElementException();
                }
                AbstractC6128u abstractC6128u = c6114g.f35927a[c6114g.f35928b];
                Object obj = abstractC6128u.f35956a[abstractC6128u.f35958c];
                c6113f.put(k10, v10);
                c6114g.m12618c(obj != null ? obj.hashCode() : 0, c6113f.f35932c, obj, 0);
            }
            c6114g.f35939g = c6113f.f35934e;
        }
        return v11;
    }
}
