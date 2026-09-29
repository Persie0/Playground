package tl;

import android.support.v4.media.C0141b;
import java.util.ArrayList;
import java.util.List;
import jm.C6526i;

/* JADX INFO: renamed from: tl.y */
/* JADX INFO: loaded from: classes2.dex */
public final class C9337y<T> extends AbstractC9315c<T> {

    /* JADX INFO: renamed from: a */
    public final List<T> f48071a;

    public C9337y(ArrayList arrayList) {
        this.f48071a = arrayList;
    }

    @Override // tl.AbstractC9315c
    /* JADX INFO: renamed from: a */
    public final int mo1822a() {
        return this.f48071a.size();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, T t10) {
        if (new C6526i(0, size()).m13106i(i10)) {
            this.f48071a.add(size() - i10, t10);
        } else {
            StringBuilder sbM614j = C0141b.m614j("Position index ", i10, " must be in range [");
            sbM614j.append(new C6526i(0, size()));
            sbM614j.append("].");
            throw new IndexOutOfBoundsException(sbM614j.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f48071a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i10) {
        return this.f48071a.get(C9327o.m17683C(i10, this));
    }

    @Override // tl.AbstractC9315c
    /* JADX INFO: renamed from: l */
    public final T mo1830l(int i10) {
        return this.f48071a.remove(C9327o.m17683C(i10, this));
    }

    @Override // java.util.AbstractList, java.util.List
    public final T set(int i10, T t10) {
        return this.f48071a.set(C9327o.m17683C(i10, this), t10);
    }
}
