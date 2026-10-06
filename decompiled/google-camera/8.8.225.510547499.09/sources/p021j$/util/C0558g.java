package p021j$.util;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import p021j$.util.concurrent.AbstractC0535m;
import p021j$.util.concurrent.C0542t;
import p021j$.util.concurrent.InterfaceC0543u;

/* JADX INFO: renamed from: j$.util.g */
/* JADX INFO: loaded from: classes3.dex */
final class C0558g implements Map, Serializable, Map {

    /* JADX INFO: renamed from: a */
    private final Map f33266a;

    /* JADX INFO: renamed from: b */
    final Object f33267b;

    /* JADX INFO: renamed from: c */
    private transient Set f33268c;

    /* JADX INFO: renamed from: d */
    private transient Set f33269d;

    /* JADX INFO: renamed from: e */
    private transient Collection f33270e;

    C0558g(Map map) {
        map.getClass();
        this.f33266a = map;
        this.f33267b = this;
    }

    /* JADX INFO: renamed from: a */
    private static Set m12586a(Set set, Object obj) {
        if (DesugarCollections.f33118e == null) {
            return Collections.synchronizedSet(set);
        }
        try {
            return (Set) DesugarCollections.f33118e.newInstance(set, obj);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new Error("Unable to instantiate a synchronized list.", e);
        }
    }

    @Override // java.util.Map
    public final void clear() {
        synchronized (this.f33267b) {
            this.f33266a.clear();
        }
    }

    @Override // java.util.Map, p021j$.util.Map, java.util.concurrent.ConcurrentMap
    public final Object compute(Object obj, BiFunction biFunction) {
        Object obj$default$compute;
        Object objApply;
        synchronized (this.f33267b) {
            Map map = this.f33266a;
            if (map instanceof Map) {
                obj$default$compute = ((Map) map).compute(obj, biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                loop0: while (true) {
                    Object objPutIfAbsent = concurrentMap.get(obj);
                    while (true) {
                        objApply = biFunction.apply(obj, objPutIfAbsent);
                        if (objApply == null) {
                            if (objPutIfAbsent != null && !concurrentMap.remove(obj, objPutIfAbsent)) {
                                break;
                            }
                            obj$default$compute = null;
                        } else {
                            if (objPutIfAbsent != null) {
                                if (!concurrentMap.replace(obj, objPutIfAbsent, objApply)) {
                                    break;
                                }
                                break;
                            }
                            objPutIfAbsent = concurrentMap.putIfAbsent(obj, objApply);
                            if (objPutIfAbsent == null) {
                                break loop0;
                            }
                        }
                        throw th;
                    }
                }
                obj$default$compute = objApply;
            } else {
                obj$default$compute = Map.CC.$default$compute(map, obj, biFunction);
            }
        }
        return obj$default$compute;
    }

    @Override // java.util.Map, p021j$.util.Map, java.util.concurrent.ConcurrentMap
    public final Object computeIfAbsent(Object obj, Function function) {
        Object objComputeIfAbsent;
        synchronized (this.f33267b) {
            objComputeIfAbsent = Map.EL.computeIfAbsent(this.f33266a, obj, function);
        }
        return objComputeIfAbsent;
    }

    @Override // java.util.Map, p021j$.util.Map, java.util.concurrent.ConcurrentMap
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Object obj$default$computeIfPresent;
        synchronized (this.f33267b) {
            Map map = this.f33266a;
            if (map instanceof Map) {
                obj$default$computeIfPresent = ((Map) map).computeIfPresent(obj, biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                biFunction.getClass();
                while (true) {
                    Object obj2 = concurrentMap.get(obj);
                    if (obj2 == null) {
                        obj$default$computeIfPresent = null;
                        break;
                    }
                    Object objApply = biFunction.apply(obj, obj2);
                    if (objApply == null) {
                        if (concurrentMap.remove(obj, obj2)) {
                            obj$default$computeIfPresent = objApply;
                            break;
                        }
                    } else if (concurrentMap.replace(obj, obj2, objApply)) {
                        obj$default$computeIfPresent = objApply;
                        break;
                    }
                }
            } else {
                obj$default$computeIfPresent = Map.CC.$default$computeIfPresent(map, obj, biFunction);
            }
        }
        return obj$default$computeIfPresent;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        boolean zContainsKey;
        synchronized (this.f33267b) {
            zContainsKey = this.f33266a.containsKey(obj);
        }
        return zContainsKey;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        boolean zContainsValue;
        synchronized (this.f33267b) {
            zContainsValue = this.f33266a.containsValue(obj);
        }
        return zContainsValue;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        Set set;
        synchronized (this.f33267b) {
            if (this.f33269d == null) {
                this.f33269d = m12586a(this.f33266a.entrySet(), this.f33267b);
            }
            set = this.f33269d;
        }
        return set;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f33267b) {
            zEquals = this.f33266a.equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Map, p021j$.util.Map, java.util.concurrent.ConcurrentMap
    public final void forEach(BiConsumer biConsumer) {
        synchronized (this.f33267b) {
            Map.EL.forEach(this.f33266a, biConsumer);
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        synchronized (this.f33267b) {
            obj2 = this.f33266a.get(obj);
        }
        return obj2;
    }

    @Override // java.util.Map, p021j$.util.Map, java.util.concurrent.ConcurrentMap
    public final Object getOrDefault(Object obj, Object obj2) {
        Object orDefault;
        synchronized (this.f33267b) {
            orDefault = Map.EL.getOrDefault(this.f33266a, obj, obj2);
        }
        return orDefault;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f33267b) {
            iHashCode = this.f33266a.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f33267b) {
            zIsEmpty = this.f33266a.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Map
    public final Set keySet() {
        Set set;
        synchronized (this.f33267b) {
            if (this.f33268c == null) {
                this.f33268c = m12586a(this.f33266a.keySet(), this.f33267b);
            }
            set = this.f33268c;
        }
        return set;
    }

    @Override // java.util.Map, p021j$.util.Map, java.util.concurrent.ConcurrentMap
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        Object obj$default$merge;
        synchronized (this.f33267b) {
            Map map = this.f33266a;
            if (map instanceof Map) {
                obj$default$merge = ((Map) map).merge(obj, obj2, biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                biFunction.getClass();
                obj2.getClass();
                loop0: while (true) {
                    Object objPutIfAbsent = concurrentMap.get(obj);
                    while (objPutIfAbsent == null) {
                        objPutIfAbsent = concurrentMap.putIfAbsent(obj, obj2);
                        if (objPutIfAbsent == null) {
                            break loop0;
                        }
                    }
                    Object objApply = biFunction.apply(objPutIfAbsent, obj2);
                    if (objApply != null) {
                        if (concurrentMap.replace(obj, objPutIfAbsent, objApply)) {
                            obj2 = objApply;
                            break;
                        }
                    } else if (concurrentMap.remove(obj, objPutIfAbsent)) {
                        obj2 = null;
                        break;
                    }
                }
                obj$default$merge = obj2;
            } else {
                obj$default$merge = Map.CC.$default$merge(map, obj, obj2, biFunction);
            }
        }
        return obj$default$merge;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        Object objPut;
        synchronized (this.f33267b) {
            objPut = this.f33266a.put(obj, obj2);
        }
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        synchronized (this.f33267b) {
            this.f33266a.putAll(map);
        }
    }

    @Override // java.util.Map, p021j$.util.Map, java.util.concurrent.ConcurrentMap
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object objPutIfAbsent;
        synchronized (this.f33267b) {
            objPutIfAbsent = Map.EL.putIfAbsent(this.f33266a, obj, obj2);
        }
        return objPutIfAbsent;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        Object objRemove;
        synchronized (this.f33267b) {
            objRemove = this.f33266a.remove(obj);
        }
        return objRemove;
    }

    @Override // java.util.Map, p021j$.util.Map, java.util.concurrent.ConcurrentMap
    public final Object replace(Object obj, Object obj2) {
        Object objReplace;
        synchronized (this.f33267b) {
            Map map = this.f33266a;
            objReplace = map instanceof Map ? ((Map) map).replace(obj, obj2) : Map.CC.$default$replace(map, obj, obj2);
        }
        return objReplace;
    }

    @Override // java.util.Map, p021j$.util.Map, java.util.concurrent.ConcurrentMap
    public final void replaceAll(BiFunction biFunction) {
        synchronized (this.f33267b) {
            Map map = this.f33266a;
            if (map instanceof Map) {
                ((Map) map).replaceAll(biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                biFunction.getClass();
                C0542t c0542t = new C0542t(0, concurrentMap, biFunction);
                if (concurrentMap instanceof InterfaceC0543u) {
                    ((InterfaceC0543u) concurrentMap).forEach(c0542t);
                } else {
                    AbstractC0535m.m12564a(concurrentMap, c0542t);
                }
            } else {
                Map.CC.$default$replaceAll(map, biFunction);
            }
        }
    }

    @Override // java.util.Map
    public final int size() {
        int size;
        synchronized (this.f33267b) {
            size = this.f33266a.size();
        }
        return size;
    }

    public final String toString() {
        String string;
        synchronized (this.f33267b) {
            string = this.f33266a.toString();
        }
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        Collection collection;
        Collection collectionSynchronizedCollection;
        synchronized (this.f33267b) {
            if (this.f33270e == null) {
                Collection collectionValues = this.f33266a.values();
                Object obj = this.f33267b;
                if (DesugarCollections.f33117d == null) {
                    collectionSynchronizedCollection = Collections.synchronizedCollection(collectionValues);
                } else {
                    try {
                        collectionSynchronizedCollection = (Collection) DesugarCollections.f33117d.newInstance(collectionValues, obj);
                    } catch (IllegalAccessException e) {
                        e = e;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    } catch (InstantiationException e2) {
                        e = e2;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    } catch (InvocationTargetException e3) {
                        e = e3;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    }
                }
                this.f33270e = collectionSynchronizedCollection;
            }
            collection = this.f33270e;
        }
        return collection;
    }

    @Override // java.util.Map, p021j$.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(Object obj, Object obj2) {
        boolean zRemove;
        synchronized (this.f33267b) {
            Map map = this.f33266a;
            zRemove = map instanceof Map ? ((Map) map).remove(obj, obj2) : Map.CC.$default$remove(map, obj, obj2);
        }
        return zRemove;
    }

    @Override // java.util.Map, p021j$.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean zReplace;
        synchronized (this.f33267b) {
            Map map = this.f33266a;
            zReplace = map instanceof Map ? ((Map) map).replace(obj, obj2, obj3) : Map.CC.$default$replace(map, obj, obj2, obj3);
        }
        return zReplace;
    }
}
