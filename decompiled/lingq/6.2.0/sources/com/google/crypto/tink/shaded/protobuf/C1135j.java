package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import p000.AbstractC3282l1;
import p000.fga;
import p000.ij6;
import p000.iw4;
import p000.l94;
import p000.o94;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C1135j extends AbstractC3282l1 implements iw4, RandomAccess {

    /* JADX INFO: renamed from: b */
    public final ArrayList f13595b;

    static {
        new C1135j(10).f48878a = false;
    }

    public C1135j(int i) {
        this(new ArrayList(i));
    }

    @Override // p000.iw4
    /* JADX INFO: renamed from: T */
    public final void mo6553T(ByteString byteString) {
        m15738d();
        this.f13595b.add(byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m15738d();
        this.f13595b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC3282l1, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m15738d();
        if (collection instanceof iw4) {
            collection = ((iw4) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.f13595b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // p000.AbstractC3282l1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m15738d();
        this.f13595b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String str;
        ArrayList arrayList = this.f13595b;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof ByteString)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, o94.f54077a);
            if (AbstractC1144s.f13628a.m6662c(bArr, 0, bArr.length)) {
                arrayList.set(i, str2);
            }
            return str2;
        }
        ByteString byteString = (ByteString) obj;
        Charset charset = o94.f54077a;
        if (byteString.size() == 0) {
            str = "";
        } else {
            ByteString.LiteralByteString literalByteString = (ByteString.LiteralByteString) byteString;
            str = new String(literalByteString.f13560d, literalByteString.mo6413k(), literalByteString.size(), charset);
        }
        ByteString.LiteralByteString literalByteString2 = (ByteString.LiteralByteString) byteString;
        int iMo6413k = literalByteString2.mo6413k();
        if (AbstractC1144s.f13628a.m6662c(literalByteString2.f13560d, iMo6413k, literalByteString2.size() + iMo6413k)) {
            arrayList.set(i, str);
        }
        return str;
    }

    @Override // p000.iw4
    public final Object getRaw(int i) {
        return this.f13595b.get(i);
    }

    @Override // p000.iw4
    public final List getUnderlyingElements() {
        return Collections.unmodifiableList(this.f13595b);
    }

    @Override // p000.iw4
    public final iw4 getUnmodifiableView() {
        return this.f48878a ? new fga(this) : this;
    }

    @Override // p000.l94
    public final l94 mutableCopyWithCapacity(int i) {
        ArrayList arrayList = this.f13595b;
        if (i < arrayList.size()) {
            ij6.m13959q();
            return null;
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new C1135j(arrayList2);
    }

    @Override // p000.AbstractC3282l1, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m15738d();
        Object objRemove = this.f13595b.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof ByteString)) {
            return new String((byte[]) objRemove, o94.f54077a);
        }
        ByteString byteString = (ByteString) objRemove;
        Charset charset = o94.f54077a;
        if (byteString.size() == 0) {
            return "";
        }
        ByteString.LiteralByteString literalByteString = (ByteString.LiteralByteString) byteString;
        return new String(literalByteString.f13560d, literalByteString.mo6413k(), literalByteString.size(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m15738d();
        Object obj2 = this.f13595b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof ByteString)) {
            return new String((byte[]) obj2, o94.f54077a);
        }
        ByteString byteString = (ByteString) obj2;
        Charset charset = o94.f54077a;
        if (byteString.size() == 0) {
            return "";
        }
        ByteString.LiteralByteString literalByteString = (ByteString.LiteralByteString) byteString;
        return new String(literalByteString.f13560d, literalByteString.mo6413k(), literalByteString.size(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13595b.size();
    }

    public C1135j(ArrayList arrayList) {
        this.f13595b = arrayList;
    }

    @Override // p000.AbstractC3282l1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f13595b.size(), collection);
    }
}
