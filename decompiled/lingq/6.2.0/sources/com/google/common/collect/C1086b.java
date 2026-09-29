package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import p000.C3386nv;
import p000.bna;

/* JADX INFO: renamed from: com.google.common.collect.b */
/* JADX INFO: loaded from: classes2.dex */
public class C1086b implements Iterator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13445a = 0;

    /* JADX INFO: renamed from: b */
    public final Iterator f13446b;

    /* JADX INFO: renamed from: c */
    public Object f13447c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f13448d;

    public C1086b(C1095k c1095k) {
        this.f13448d = c1095k;
        Collection collection = c1095k.f13467b;
        this.f13447c = collection;
        this.f13446b = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* JADX INFO: renamed from: a */
    public void m6326a() {
        C1095k c1095k = (C1095k) this.f13448d;
        c1095k.m6337f();
        if (c1095k.f13467b == ((Collection) this.f13447c)) {
            return;
        }
        C3386nv.m17619e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f13445a) {
            case 0:
                break;
            case 1:
                break;
            default:
                m6326a();
                break;
        }
        return this.f13446b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f13445a;
        Iterator it = this.f13446b;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) it.next();
                this.f13447c = (Collection) entry.getValue();
                return ((C1087c) this.f13448d).m6327a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) it.next();
                this.f13447c = entry2;
                return entry2.getKey();
            default:
                m6326a();
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f13445a;
        Object obj = this.f13448d;
        Iterator it = this.f13446b;
        switch (i) {
            case 0:
                bna.m3985y("no calls to next() since the last call to remove()", ((Collection) this.f13447c) != null);
                it.remove();
                ((C1087c) obj).f13452d.f13382e -= ((Collection) this.f13447c).size();
                ((Collection) this.f13447c).clear();
                this.f13447c = null;
                break;
            case 1:
                bna.m3985y("no calls to next() since the last call to remove()", ((Map.Entry) this.f13447c) != null);
                Collection collection = (Collection) ((Map.Entry) this.f13447c).getValue();
                it.remove();
                ((C1089e) obj).f13459b.f13382e -= collection.size();
                collection.clear();
                this.f13447c = null;
                break;
            default:
                it.remove();
                C1095k c1095k = (C1095k) obj;
                c1095k.f13470e.f13382e--;
                c1095k.m6338g();
                break;
        }
    }

    public C1086b(C1095k c1095k, ListIterator listIterator) {
        this.f13448d = c1095k;
        this.f13447c = c1095k.f13467b;
        this.f13446b = listIterator;
    }

    public C1086b(C1089e c1089e, Iterator it) {
        this.f13446b = it;
        this.f13448d = c1089e;
    }

    public C1086b(C1087c c1087c) {
        this.f13448d = c1087c;
        this.f13446b = c1087c.f13451c.entrySet().iterator();
    }
}
