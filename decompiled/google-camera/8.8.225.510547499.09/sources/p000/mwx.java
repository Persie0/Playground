package p000;

import android.support.wearable.complications.rendering.p002EM.voNZjxiJou;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class mwx implements Map, Serializable, p021j$.util.Map {

    /* JADX INFO: renamed from: a */
    private transient mxk f41746a;

    /* JADX INFO: renamed from: b */
    private transient mxk f41747b;

    /* JADX INFO: renamed from: c */
    private transient mwj f41748c;

    /* JADX INFO: renamed from: i */
    public static mwt m17115i() {
        return new mwt();
    }

    /* JADX INFO: renamed from: j */
    public static mwt m17116j(int i) {
        lku.m15655i(i, "expectedSize");
        return new mwt(i);
    }

    /* JADX INFO: renamed from: l */
    public static mwx m17117l(Iterable iterable) {
        mwt mwtVar = new mwt(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        mwtVar.m17111f(iterable);
        return mwtVar.mo17059b();
    }

    /* JADX INFO: renamed from: m */
    public static mwx m17118m(Map map) {
        return m17117l(map.entrySet());
    }

    /* JADX INFO: renamed from: n */
    public static mwx m17119n(Object obj, Object obj2) {
        lku.m15653g(obj, obj2);
        return mzw.m17191a(1, new Object[]{obj, obj2});
    }

    /* JADX INFO: renamed from: o */
    public static mwx m17120o(Object obj, Object obj2, Object obj3, Object obj4) {
        lku.m15653g(obj, obj2);
        lku.m15653g(obj3, obj4);
        return mzw.m17191a(2, new Object[]{obj, obj2, obj3, obj4});
    }

    /* JADX INFO: renamed from: p */
    public static mwx m17121p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        lku.m15653g(obj, obj2);
        lku.m15653g(obj3, obj4);
        lku.m15653g(obj5, obj6);
        return mzw.m17191a(3, new Object[]{obj, obj2, obj3, obj4, obj5, obj6});
    }

    /* JADX INFO: renamed from: q */
    public static mwx m17122q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        lku.m15653g(obj, obj2);
        lku.m15653g(obj3, obj4);
        lku.m15653g(obj5, obj6);
        lku.m15653g(obj7, obj8);
        return mzw.m17191a(4, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8});
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(voNZjxiJou.PAdEGT);
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p021j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return p021j$.util.Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, p021j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return p021j$.util.Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, p021j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return p021j$.util.Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    /* JADX INFO: renamed from: ct */
    public abstract mxk mo17113ct();

    /* JADX INFO: renamed from: cu */
    public abstract mxk mo17114cu();

    /* JADX INFO: renamed from: cv */
    public naz mo17079cv() {
        throw null;
    }

    /* JADX INFO: renamed from: cw */
    public abstract boolean mo17080cw();

    /* JADX INFO: renamed from: d */
    public abstract mwj mo17065d();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public mwj values() {
        mwj mwjVar = this.f41748c;
        if (mwjVar != null) {
            return mwjVar;
        }
        mwj mwjVarMo17065d = mo17065d();
        this.f41748c = mwjVarMo17065d;
        return mwjVarMo17065d;
    }

    @Override // java.util.Map, p021j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        p021j$.util.Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, p021j$.util.Map, java.util.concurrent.ConcurrentMap
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return mpw.m16787z(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map, p021j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return p021j$.util.Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p021j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return p021j$.util.Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final mxk entrySet() {
        mxk mxkVar = this.f41746a;
        if (mxkVar != null) {
            return mxkVar;
        }
        mxk mxkVarMo17113ct = mo17113ct();
        this.f41746a = mxkVarMo17113ct;
        return mxkVarMo17113ct;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p021j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        return p021j$.util.Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, p021j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return p021j$.util.Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, p021j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return p021j$.util.Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, p021j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        p021j$.util.Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public mxk keySet() {
        mxk mxkVar = this.f41747b;
        if (mxkVar != null) {
            return mxkVar;
        }
        mxk mxkVarMo17114cu = mo17114cu();
        this.f41747b = mxkVarMo17114cu;
        return mxkVarMo17114cu;
    }

    public final String toString() {
        StringBuilder sbM15649c = lku.m15649c(size());
        sbM15649c.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sbM15649c.append(", ");
            }
            sbM15649c.append(entry.getKey());
            sbM15649c.append('=');
            sbM15649c.append(entry.getValue());
            z = false;
        }
        sbM15649c.append('}');
        return sbM15649c.toString();
    }

    Object writeReplace() {
        return new mww(this);
    }
}
