package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0877x extends AbstractC0830c<String> implements InterfaceC0879y, RandomAccess {

    /* JADX INFO: renamed from: b */
    public final ArrayList f5945b;

    static {
        new C0877x(10).f5822a = false;
    }

    public C0877x(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    public C0877x(ArrayList<Object> arrayList) {
        this.f5945b = arrayList;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.datastore.preferences.protobuf.C0871u.c
    /* JADX INFO: renamed from: E */
    public final C0871u.c mo3165E(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f5945b);
        return new C0877x((ArrayList<Object>) arrayList);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0879y
    /* JADX INFO: renamed from: J */
    public final void mo3211J(ByteString byteString) {
        m3192a();
        this.f5945b.add(byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        m3192a();
        this.f5945b.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0830c, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection<? extends String> collection) {
        m3192a();
        if (collection instanceof InterfaceC0879y) {
            collection = ((InterfaceC0879y) collection).mo3213k();
        }
        boolean zAddAll = this.f5945b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0830c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0830c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m3192a();
        this.f5945b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0879y
    /* JADX INFO: renamed from: g0 */
    public final Object mo3212g0(int i10) {
        return this.f5945b.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        String str;
        ArrayList arrayList = this.f5945b;
        Object obj = arrayList.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            byteString.getClass();
            str = byteString.size() == 0 ? "" : byteString.mo3058C(C0871u.f5935a);
            if (byteString.mo3062t()) {
                arrayList.set(i10, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, C0871u.f5935a);
            Utf8.AbstractC0817b abstractC0817b = Utf8.f5816a;
            boolean z10 = false;
            if (Utf8.f5816a.mo3161c(0, bArr.length, bArr) == 0) {
                z10 = true;
            }
            if (z10) {
                arrayList.set(i10, str);
            }
        }
        return str;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0879y
    /* JADX INFO: renamed from: k */
    public final List<?> mo3213k() {
        return Collections.unmodifiableList(this.f5945b);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0879y
    /* JADX INFO: renamed from: n */
    public final InterfaceC0879y mo3214n() {
        return this.f5822a ? new C0838e1(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        m3192a();
        Object objRemove = this.f5945b.remove(i10);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof ByteString)) {
            return new String((byte[]) objRemove, C0871u.f5935a);
        }
        ByteString byteString = (ByteString) objRemove;
        byteString.getClass();
        return byteString.size() == 0 ? "" : byteString.mo3058C(C0871u.f5935a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        m3192a();
        Object obj2 = this.f5945b.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof ByteString)) {
            return new String((byte[]) obj2, C0871u.f5935a);
        }
        ByteString byteString = (ByteString) obj2;
        byteString.getClass();
        return byteString.size() == 0 ? "" : byteString.mo3058C(C0871u.f5935a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5945b.size();
    }
}
