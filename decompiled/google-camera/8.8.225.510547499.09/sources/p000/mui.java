package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mui extends AbstractSet {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ mun f41635a;

    public mui(mun munVar) {
        this.f41635a = munVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f41635a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map mapM16954k = this.f41635a.m16954k();
        if (mapM16954k != null) {
            return mapM16954k.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iM16948d = this.f41635a.m16948d(entry.getKey());
            if (iM16948d != -1 && mpw.m16768g(this.f41635a.m16952i(iM16948d), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.f41635a.m16953j();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map mapM16954k = this.f41635a.m16954k();
        if (mapM16954k != null) {
            return mapM16954k.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        mun munVar = this.f41635a;
        if (munVar.m16959p()) {
            return false;
        }
        int iM16947c = munVar.m16947c();
        int iM16528aj = mkv.m16528aj(entry.getKey(), entry.getValue(), iM16947c, this.f41635a.m16951h(), this.f41635a.m16960q(), this.f41635a.m16961r(), this.f41635a.m16962s());
        if (iM16528aj == -1) {
            return false;
        }
        this.f41635a.m16957n(iM16528aj, iM16947c);
        mun munVar2 = this.f41635a;
        munVar2.f41650f--;
        munVar2.m16955l();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f41635a.size();
    }
}
