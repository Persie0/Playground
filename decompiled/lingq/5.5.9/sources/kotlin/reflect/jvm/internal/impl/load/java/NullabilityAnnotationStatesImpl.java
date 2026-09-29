package kotlin.reflect.jvm.internal.impl.load.java;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.name.C6979a;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import mn.C7646c;
import zm.InterfaceC10536u;

/* JADX INFO: loaded from: classes2.dex */
public final class NullabilityAnnotationStatesImpl<T> implements InterfaceC10536u<T> {

    /* JADX INFO: renamed from: b */
    public final Map<C7646c, T> f38609b;

    /* JADX INFO: renamed from: c */
    public final LockBasedStorageManager.C7044j f38610c = new LockBasedStorageManager("Java nullability annotation states").mo6222g(new InterfaceC2052l<C7646c, T>(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStatesImpl$cache$1

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ NullabilityAnnotationStatesImpl<T> f38611b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(1);
            this.f38611b = this;
        }

        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final Object mo528n(C7646c c7646c) {
            Object value;
            T next;
            C7646c c7646c2 = c7646c;
            C5207g.m11110e(c7646c2, "it");
            Map<C7646c, T> map = this.f38611b.f38609b;
            C5207g.m11111f(map, "values");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<Map.Entry<C7646c, T>> it = map.entrySet().iterator();
            while (true) {
                boolean z10 = true;
                value = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<C7646c, T> next2 = it.next();
                C7646c key = next2.getKey();
                if (!C5207g.m11106a(c7646c2, key)) {
                    C5207g.m11111f(key, "packageName");
                    if (!c7646c2.m15216d()) {
                        value = c7646c2.m15217e();
                    }
                    if (!C5207g.m11106a(value, key)) {
                        z10 = false;
                    }
                }
                if (z10) {
                    linkedHashMap.put(next2.getKey(), next2.getValue());
                }
            }
            if (!(!linkedHashMap.isEmpty())) {
                linkedHashMap = null;
            }
            if (linkedHashMap != null) {
                Iterator<T> it2 = linkedHashMap.entrySet().iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        int length = C6979a.m13892b((C7646c) ((Map.Entry) next).getKey(), c7646c2).m15214b().length();
                        do {
                            T next3 = it2.next();
                            int length2 = C6979a.m13892b((C7646c) ((Map.Entry) next3).getKey(), c7646c2).m15214b().length();
                            if (length > length2) {
                                next = next3;
                                length = length2;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    next = null;
                }
                Map.Entry entry = (Map.Entry) next;
                value = entry != null ? entry.getValue() : null;
            }
            return value;
        }
    });

    /* JADX WARN: Multi-variable type inference failed */
    public NullabilityAnnotationStatesImpl(Map<C7646c, ? extends T> map) {
        this.f38609b = map;
    }
}
