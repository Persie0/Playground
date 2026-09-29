package p000;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: renamed from: f1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2985f1 extends AbstractList implements List, vg4 {
    /* JADX INFO: renamed from: d */
    public abstract int mo4182d();

    /* JADX INFO: renamed from: f */
    public abstract Object mo4183f(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return mo4183f(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo4182d();
    }
}
