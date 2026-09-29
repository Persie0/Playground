package p491xm;

import dm.C5207g;
import gn.InterfaceC5820a;
import gn.InterfaceC5844x;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import mn.C7646c;
import mn.C7648e;

/* JADX INFO: renamed from: xm.x */
/* JADX INFO: loaded from: classes2.dex */
public final class C10249x extends AbstractC10238m implements InterfaceC10232g, InterfaceC5844x {

    /* JADX INFO: renamed from: a */
    public final TypeVariable<?> f51678a;

    public C10249x(TypeVariable<?> typeVariable) {
        C5207g.m11111f(typeVariable, "typeVariable");
        this.f51678a = typeVariable;
    }

    @Override // p491xm.InterfaceC10232g
    /* JADX INFO: renamed from: D */
    public final AnnotatedElement mo13652D() {
        TypeVariable<?> typeVariable = this.f51678a;
        if (typeVariable instanceof AnnotatedElement) {
            return (AnnotatedElement) typeVariable;
        }
        return null;
    }

    @Override // gn.InterfaceC5839s
    /* JADX INFO: renamed from: a */
    public final C7648e mo12280a() {
        return C7648e.m15232l(this.f51678a.getName());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10249x) {
            if (C5207g.m11106a(this.f51678a, ((C10249x) obj).f51678a)) {
                return true;
            }
        }
        return false;
    }

    @Override // gn.InterfaceC5844x
    public final Collection getUpperBounds() {
        Type[] bounds = this.f51678a.getBounds();
        C5207g.m11110e(bounds, "typeVariable.bounds");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new C10236k(type));
        }
        C10236k c10236k = (C10236k) C6752c.m13445m0(arrayList);
        return C5207g.m11106a(c10236k != null ? c10236k.f51667a : null, Object.class) ? EmptyList.f38032a : arrayList;
    }

    @Override // gn.InterfaceC5824d
    /* JADX INFO: renamed from: h */
    public final InterfaceC5820a mo12239h(C7646c c7646c) {
        return InterfaceC10232g.a.m19211a(this, c7646c);
    }

    public final int hashCode() {
        return this.f51678a.hashCode();
    }

    public final String toString() {
        return C10249x.class.getName() + ": " + this.f51678a;
    }

    @Override // gn.InterfaceC5824d
    /* JADX INFO: renamed from: w */
    public final Collection mo12240w() {
        return InterfaceC10232g.a.m19212b(this);
    }

    @Override // gn.InterfaceC5824d
    /* JADX INFO: renamed from: x */
    public final void mo12241x() {
    }
}
