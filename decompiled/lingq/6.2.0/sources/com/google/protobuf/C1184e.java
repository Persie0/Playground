package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import p000.AbstractC3319m1;
import p000.ega;
import p000.ij6;
import p000.jw4;
import p000.m94;
import p000.p94;

/* JADX INFO: renamed from: com.google.protobuf.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C1184e extends AbstractC3319m1 implements jw4, RandomAccess {

    /* JADX INFO: renamed from: b */
    public final List f13937b;

    static {
        new C1184e();
    }

    public C1184e() {
        super(false);
        this.f13937b = Collections.EMPTY_LIST;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m16594d();
        this.f13937b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC3319m1, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m16594d();
        if (collection instanceof jw4) {
            collection = ((jw4) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.f13937b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // p000.AbstractC3319m1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m16594d();
        this.f13937b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String str;
        List list = this.f13937b;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof ByteString)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, p94.f55800a);
            if (AbstractC1192m.f13964a.m6882b(bArr, 0, bArr.length) == 0) {
                list.set(i, str2);
            }
            return str2;
        }
        ByteString byteString = (ByteString) obj;
        Charset charset = p94.f55800a;
        if (byteString.size() == 0) {
            str = "";
        } else {
            ByteString.LiteralByteString literalByteString = (ByteString.LiteralByteString) byteString;
            str = new String(literalByteString.f13925c, literalByteString.mo6784h(), literalByteString.size(), charset);
        }
        ByteString.LiteralByteString literalByteString2 = (ByteString.LiteralByteString) byteString;
        int iMo6784h = literalByteString2.mo6784h();
        if (AbstractC1192m.f13964a.m6882b(literalByteString2.f13925c, iMo6784h, literalByteString2.size() + iMo6784h) == 0) {
            list.set(i, str);
        }
        return str;
    }

    @Override // p000.jw4
    public final Object getRaw(int i) {
        return this.f13937b.get(i);
    }

    @Override // p000.jw4
    public final List getUnderlyingElements() {
        return Collections.unmodifiableList(this.f13937b);
    }

    @Override // p000.jw4
    public final jw4 getUnmodifiableView() {
        return this.f50407a ? new ega(this) : this;
    }

    @Override // p000.m94
    public final m94 mutableCopyWithCapacity(int i) {
        List list = this.f13937b;
        if (i < list.size()) {
            ij6.m13959q();
            return null;
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(list);
        return new C1184e(arrayList);
    }

    @Override // p000.AbstractC3319m1, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m16594d();
        Object objRemove = this.f13937b.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof ByteString)) {
            return new String((byte[]) objRemove, p94.f55800a);
        }
        ByteString byteString = (ByteString) objRemove;
        Charset charset = p94.f55800a;
        if (byteString.size() == 0) {
            return "";
        }
        ByteString.LiteralByteString literalByteString = (ByteString.LiteralByteString) byteString;
        return new String(literalByteString.f13925c, literalByteString.mo6784h(), literalByteString.size(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m16594d();
        Object obj2 = this.f13937b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof ByteString)) {
            return new String((byte[]) obj2, p94.f55800a);
        }
        ByteString byteString = (ByteString) obj2;
        Charset charset = p94.f55800a;
        if (byteString.size() == 0) {
            return "";
        }
        ByteString.LiteralByteString literalByteString = (ByteString.LiteralByteString) byteString;
        return new String(literalByteString.f13925c, literalByteString.mo6784h(), literalByteString.size(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13937b.size();
    }

    @Override // p000.jw4
    /* JADX INFO: renamed from: u */
    public final void mo6818u(ByteString byteString) {
        m16594d();
        this.f13937b.add(byteString);
        ((AbstractList) this).modCount++;
    }

    public C1184e(ArrayList arrayList) {
        super(true);
        this.f13937b = arrayList;
    }

    public C1184e(int i) {
        this(new ArrayList(i));
    }

    @Override // p000.AbstractC3319m1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f13937b.size(), collection);
    }
}
