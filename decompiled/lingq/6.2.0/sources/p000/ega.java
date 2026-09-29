package p000;

import com.google.protobuf.ByteString;
import com.google.protobuf.C1184e;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class ega extends AbstractList implements jw4, RandomAccess {

    /* JADX INFO: renamed from: a */
    public final C1184e f37222a;

    public ega(C1184e c1184e) {
        this.f37222a = c1184e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.f37222a.get(i);
    }

    @Override // p000.jw4
    public final Object getRaw(int i) {
        return this.f37222a.f13937b.get(i);
    }

    @Override // p000.jw4
    public final List getUnderlyingElements() {
        return Collections.unmodifiableList(this.f37222a.f13937b);
    }

    @Override // p000.jw4
    public final jw4 getUnmodifiableView() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        dga dgaVar = new dga(0);
        dgaVar.f35631b = this.f37222a.iterator();
        return dgaVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        cga cgaVar = new cga(0);
        cgaVar.f10032b = this.f37222a.listIterator(i);
        return cgaVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f37222a.f13937b.size();
    }

    @Override // p000.jw4
    /* JADX INFO: renamed from: u */
    public final void mo6818u(ByteString byteString) {
        throw new UnsupportedOperationException();
    }
}
