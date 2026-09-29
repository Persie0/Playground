package p000;

import com.google.android.gms.internal.mlkit_vision_text_common.C0972c;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class fq5 extends AbstractCollection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39455a;

    /* JADX INFO: renamed from: b */
    public final AbstractMap f39456b;

    public /* synthetic */ fq5(AbstractMap abstractMap, int i) {
        this.f39455a = i;
        this.f39456b = abstractMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f39455a) {
            case 0:
                this.f39456b.clear();
                break;
            default:
                ((C0972c) this.f39456b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f39455a) {
            case 0:
                return this.f39456b.containsValue(obj);
            default:
                return ((C0972c) this.f39456b).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f39455a) {
            case 0:
                return this.f39456b.isEmpty();
            default:
                return ((C0972c) this.f39456b).isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f39455a;
        AbstractMap abstractMap = this.f39456b;
        switch (i) {
            case 0:
                return new eq5(abstractMap.entrySet().iterator(), 0);
            default:
                return new erb(((C0972c) abstractMap).entrySet().iterator(), 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.f39455a;
        AbstractMap abstractMap = this.f39456b;
        switch (i) {
            case 0:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (atb.m3037a(obj, entry.getValue())) {
                            abstractMap.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                C0972c c0972c = (C0972c) abstractMap;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused2) {
                    for (Map.Entry entry2 : c0972c.entrySet()) {
                        if (ts3.m22281b(obj, entry2.getValue())) {
                            c0972c.remove(entry2.getKey());
                            return true;
                        }
                    }
                    return false;
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.f39455a;
        AbstractMap abstractMap = this.f39456b;
        switch (i) {
            case 0:
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return abstractMap.keySet().removeAll(hashSet);
                }
            default:
                C0972c c0972c = (C0972c) abstractMap;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : c0972c.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return c0972c.f12025d.m5474b().removeAll(hashSet2);
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.f39455a;
        AbstractMap abstractMap = this.f39456b;
        switch (i) {
            case 0:
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return abstractMap.keySet().retainAll(hashSet);
                }
            default:
                C0972c c0972c = (C0972c) abstractMap;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : c0972c.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return c0972c.f12025d.m5474b().retainAll(hashSet2);
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f39455a) {
            case 0:
                return this.f39456b.size();
            default:
                return ((C0972c) this.f39456b).f12024c.size();
        }
    }
}
