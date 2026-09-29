package androidx.compose.runtime.saveable;

import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C6753d;
import mo.C7661i;
import p385sf.C9000b;

/* JADX INFO: renamed from: androidx.compose.runtime.saveable.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0489c implements InterfaceC0488b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2052l<Object, Boolean> f3235a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f3236b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f3237c;

    /* JADX INFO: renamed from: androidx.compose.runtime.saveable.c$a */
    public static final class a implements InterfaceC0488b.a {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f3239b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC2041a<Object> f3240c;

        public a(String str, InterfaceC2041a<? extends Object> interfaceC2041a) {
            this.f3239b = str;
            this.f3240c = interfaceC2041a;
        }

        @Override // androidx.compose.runtime.saveable.InterfaceC0488b.a
        /* JADX INFO: renamed from: a */
        public final void mo1865a() {
            C0489c c0489c = C0489c.this;
            LinkedHashMap linkedHashMap = c0489c.f3237c;
            String str = this.f3239b;
            List list = (List) linkedHashMap.remove(str);
            if (list != null) {
                list.remove(this.f3240c);
            }
            if (list != null && (!list.isEmpty())) {
                c0489c.f3237c.put(str, list);
            }
        }
    }

    public C0489c(LinkedHashMap linkedHashMap, InterfaceC2052l interfaceC2052l) {
        this.f3235a = interfaceC2052l;
        this.f3236b = linkedHashMap != null ? C6753d.m13467T0(linkedHashMap) : new LinkedHashMap();
        this.f3237c = new LinkedHashMap();
    }

    @Override // androidx.compose.runtime.saveable.InterfaceC0488b
    /* JADX INFO: renamed from: a */
    public final boolean mo1861a(Object obj) {
        return this.f3235a.mo528n(obj).booleanValue();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.compose.runtime.saveable.InterfaceC0488b
    /* JADX INFO: renamed from: b */
    public final Map<String, List<Object>> mo1862b() {
        LinkedHashMap linkedHashMapM13467T0 = C6753d.m13467T0(this.f3236b);
        while (true) {
            for (Map.Entry entry : this.f3237c.entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (list.size() == 1) {
                    Object objMo807E = ((InterfaceC2041a) list.get(0)).mo807E();
                    if (objMo807E != null) {
                        if (!mo1861a(objMo807E)) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        linkedHashMapM13467T0.put(str, C9000b.m17237c(objMo807E));
                    }
                } else {
                    int size = list.size();
                    ArrayList arrayList = new ArrayList(size);
                    for (int i10 = 0; i10 < size; i10++) {
                        Object objMo807E2 = ((InterfaceC2041a) list.get(i10)).mo807E();
                        if (objMo807E2 != null && !mo1861a(objMo807E2)) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        arrayList.add(objMo807E2);
                    }
                    linkedHashMapM13467T0.put(str, arrayList);
                }
            }
            return linkedHashMapM13467T0;
        }
    }

    @Override // androidx.compose.runtime.saveable.InterfaceC0488b
    /* JADX INFO: renamed from: c */
    public final Object mo1863c(String str) {
        C5207g.m11111f(str, "key");
        LinkedHashMap linkedHashMap = this.f3236b;
        List list = (List) linkedHashMap.remove(str);
        if (list == null || !(!list.isEmpty())) {
            return null;
        }
        if (list.size() > 1) {
            linkedHashMap.put(str, list.subList(1, list.size()));
        }
        return list.get(0);
    }

    @Override // androidx.compose.runtime.saveable.InterfaceC0488b
    /* JADX INFO: renamed from: d */
    public final InterfaceC0488b.a mo1864d(String str, InterfaceC2041a<? extends Object> interfaceC2041a) {
        C5207g.m11111f(str, "key");
        if (!(!C7661i.m15250P2(str))) {
            throw new IllegalArgumentException("Registered key is empty or blank".toString());
        }
        LinkedHashMap linkedHashMap = this.f3237c;
        Object arrayList = linkedHashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(str, arrayList);
        }
        ((List) arrayList).add(interfaceC2041a);
        return new a(str, interfaceC2041a);
    }
}
