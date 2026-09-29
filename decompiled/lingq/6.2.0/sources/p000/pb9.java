package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class pb9 extends AbstractSet {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55932a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f55933b;

    public /* synthetic */ pb9(Object obj, int i) {
        this.f55932a = i;
        this.f55933b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i = this.f55932a;
        Object obj2 = this.f55933b;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((kb9) obj2).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((hjb) obj2).put((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        int i = this.f55932a;
        Object obj = this.f55933b;
        switch (i) {
            case 0:
                ((kb9) obj).clear();
                break;
            case 1:
                ((hjb) obj).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        int i = this.f55932a;
        Object obj2 = this.f55933b;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj3 = ((kb9) obj2).get(entry.getKey());
                Object value = entry.getValue();
                if (obj3 != value) {
                    return obj3 != null && obj3.equals(value);
                }
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj4 = ((hjb) obj2).get(entry2.getKey());
                Object value2 = entry2.getValue();
                if (obj4 != value2) {
                    return obj4 != null && obj4.equals(value2);
                }
                return true;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        int i = this.f55932a;
        Object obj = this.f55933b;
        switch (i) {
            case 0:
                return new ob9((kb9) obj);
            case 1:
                return new ob9((hjb) obj);
            default:
                return new kgb(this, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int i = this.f55932a;
        Object obj2 = this.f55933b;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((kb9) obj2).remove(entry.getKey());
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((hjb) obj2).remove(entry2.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.f55932a;
        Object obj = this.f55933b;
        switch (i) {
            case 0:
                return ((kb9) obj).size();
            case 1:
                return ((hjb) obj).size();
            default:
                return ((ynd) obj).f70134e;
        }
    }
}
