package p407u5;

import java.util.ArrayList;
import java.util.HashMap;
import p407u5.InterfaceC9460k;

/* JADX INFO: renamed from: u5.f */
/* JADX INFO: loaded from: classes.dex */
public final class C9455f<K extends InterfaceC9460k, V> {

    /* JADX INFO: renamed from: a */
    public final a<K, V> f48447a = new a<>();

    /* JADX INFO: renamed from: b */
    public final HashMap f48448b = new HashMap();

    /* JADX INFO: renamed from: u5.f$a */
    public static class a<K, V> {

        /* JADX INFO: renamed from: a */
        public final K f48449a;

        /* JADX INFO: renamed from: b */
        public ArrayList f48450b;

        /* JADX INFO: renamed from: c */
        public a<K, V> f48451c;

        /* JADX INFO: renamed from: d */
        public a<K, V> f48452d;

        public a() {
            this(null);
        }

        public a(K k10) {
            this.f48452d = this;
            this.f48451c = this;
            this.f48449a = k10;
        }
    }

    /* JADX INFO: renamed from: a */
    public final V m17858a(K k10) {
        a aVar;
        HashMap map = this.f48448b;
        a aVar2 = (a) map.get(k10);
        if (aVar2 == null) {
            a aVar3 = new a(k10);
            map.put(k10, aVar3);
            aVar = aVar3;
        } else {
            k10.mo17866a();
            aVar = aVar2;
        }
        a<K, V> aVar4 = aVar.f48452d;
        aVar4.f48451c = aVar.f48451c;
        aVar.f48451c.f48452d = aVar4;
        a<K, V> aVar5 = this.f48447a;
        aVar.f48452d = aVar5;
        a<K, V> aVar6 = aVar5.f48451c;
        aVar.f48451c = aVar6;
        aVar6.f48452d = aVar;
        aVar.f48452d.f48451c = aVar;
        ArrayList arrayList = aVar.f48450b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return (V) aVar.f48450b.remove(size - 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m17859b(K k10, V v10) {
        HashMap map = this.f48448b;
        a aVar = (a) map.get(k10);
        if (aVar == null) {
            aVar = new a(k10);
            a<K, V> aVar2 = aVar.f48452d;
            aVar2.f48451c = aVar.f48451c;
            aVar.f48451c.f48452d = aVar2;
            a<K, V> aVar3 = this.f48447a;
            aVar.f48452d = aVar3.f48452d;
            aVar.f48451c = aVar3;
            aVar3.f48452d = aVar;
            aVar.f48452d.f48451c = aVar;
            map.put(k10, aVar);
        } else {
            k10.mo17866a();
        }
        if (aVar.f48450b == null) {
            aVar.f48450b = new ArrayList();
        }
        aVar.f48450b.add(v10);
    }

    /* JADX INFO: renamed from: c */
    public final V m17860c() {
        a<K, V> aVar = this.f48447a;
        a aVar2 = aVar.f48452d;
        while (true) {
            V v10 = null;
            if (aVar2.equals(aVar)) {
                return null;
            }
            ArrayList arrayList = aVar2.f48450b;
            int size = arrayList != null ? arrayList.size() : 0;
            if (size > 0) {
                v10 = (V) aVar2.f48450b.remove(size - 1);
            }
            if (v10 != null) {
                return v10;
            }
            a<K, V> aVar3 = aVar2.f48452d;
            aVar3.f48451c = aVar2.f48451c;
            aVar2.f48451c.f48452d = aVar3;
            HashMap map = this.f48448b;
            Object obj = aVar2.f48449a;
            map.remove(obj);
            ((InterfaceC9460k) obj).mo17866a();
            aVar2 = aVar2.f48452d;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        a<K, V> aVar = this.f48447a;
        a aVar2 = aVar.f48451c;
        boolean z10 = false;
        while (!aVar2.equals(aVar)) {
            sb2.append('{');
            sb2.append(aVar2.f48449a);
            sb2.append(':');
            ArrayList arrayList = aVar2.f48450b;
            sb2.append(arrayList != null ? arrayList.size() : 0);
            sb2.append("}, ");
            aVar2 = aVar2.f48451c;
            z10 = true;
        }
        if (z10) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}
