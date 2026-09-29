package p000;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C1135j;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class fga extends AbstractList implements iw4, RandomAccess {

    /* JADX INFO: renamed from: a */
    public final C1135j f39084a;

    public fga(C1135j c1135j) {
        this.f39084a = c1135j;
    }

    @Override // p000.iw4
    /* JADX INFO: renamed from: T */
    public final void mo6553T(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.f39084a.get(i);
    }

    @Override // p000.iw4
    public final Object getRaw(int i) {
        return this.f39084a.f13595b.get(i);
    }

    @Override // p000.iw4
    public final List getUnderlyingElements() {
        return Collections.unmodifiableList(this.f39084a.f13595b);
    }

    @Override // p000.iw4
    public final iw4 getUnmodifiableView() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        dga dgaVar = new dga(1);
        dgaVar.f35631b = this.f39084a.iterator();
        return dgaVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        cga cgaVar = new cga(1);
        cgaVar.f10032b = this.f39084a.listIterator(i);
        return cgaVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39084a.size();
    }
}
