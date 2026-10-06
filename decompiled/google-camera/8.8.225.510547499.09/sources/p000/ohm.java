package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ohm implements ohi {

    /* JADX INFO: renamed from: a */
    public static final ohi f46015a = ohj.m18487a(Collections.emptySet());

    /* JADX INFO: renamed from: b */
    private final List f46016b;

    /* JADX INFO: renamed from: c */
    private final List f46017c;

    public ohm(List list, List list2) {
        this.f46016b = list;
        this.f46017c = list2;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Set get() {
        int size = this.f46016b.size();
        ArrayList arrayList = new ArrayList(this.f46017c.size());
        int size2 = this.f46017c.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((oju) this.f46017c.get(i)).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(lkm.m15560A(size));
        int size3 = this.f46016b.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object obj = ((oju) this.f46016b.get(i2)).get();
            obj.getClass();
            hashSet.add(obj);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object obj2 : (Collection) arrayList.get(i3)) {
                obj2.getClass();
                hashSet.add(obj2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
