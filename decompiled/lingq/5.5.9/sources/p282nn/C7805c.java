package p282nn;

import ae.C0062b;
import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import kotlin.reflect.jvm.internal.impl.protobuf.C6995f;

/* JADX INFO: renamed from: nn.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C7805c extends AbstractList<String> implements RandomAccess, InterfaceC7806d {

    /* JADX INFO: renamed from: b */
    public static final C7811i f42891b = new C7811i(new C7805c());

    /* JADX INFO: renamed from: a */
    public final ArrayList f42892a;

    public C7805c() {
        this.f42892a = new ArrayList();
    }

    public C7805c(InterfaceC7806d interfaceC7806d) {
        this.f42892a = new ArrayList(interfaceC7806d.size());
        addAll(interfaceC7806d);
    }

    @Override // p282nn.InterfaceC7806d
    /* JADX INFO: renamed from: R */
    public final void mo15534R(C7807e c7807e) {
        this.f42892a.add(c7807e);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        this.f42892a.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection<? extends String> collection) {
        if (collection instanceof InterfaceC7806d) {
            collection = ((InterfaceC7806d) collection).mo15536k();
        }
        boolean zAddAll = this.f42892a.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // p282nn.InterfaceC7806d
    /* JADX INFO: renamed from: c0 */
    public final AbstractC7803a mo15535c0(int i10) {
        AbstractC7803a c7807e;
        ArrayList arrayList = this.f42892a;
        Object obj = arrayList.get(i10);
        if (obj instanceof AbstractC7803a) {
            c7807e = (AbstractC7803a) obj;
        } else if (obj instanceof String) {
            String str = (String) obj;
            C7807e c7807e2 = AbstractC7803a.f42882a;
            try {
                c7807e = new C7807e(str.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e10) {
                throw new RuntimeException("UTF-8 not supported?", e10);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            C7807e c7807e3 = AbstractC7803a.f42882a;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            c7807e = new C7807e(bArr2);
        }
        if (c7807e != obj) {
            arrayList.set(i10, c7807e);
        }
        return c7807e;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f42892a.clear();
        ((AbstractList) this).modCount++;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        String str;
        ArrayList arrayList = this.f42892a;
        Object obj = arrayList.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC7803a) {
            AbstractC7803a abstractC7803a = (AbstractC7803a) obj;
            abstractC7803a.getClass();
            try {
                str = abstractC7803a.mo15529v();
                if (abstractC7803a.mo15524o()) {
                    arrayList.set(i10, str);
                }
                return str;
            } catch (UnsupportedEncodingException e10) {
                throw new RuntimeException("UTF-8 not supported?", e10);
            }
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = C6995f.f39527a;
        try {
            str = new String(bArr, "UTF-8");
            if (C0062b.m284K1(bArr, 0, bArr.length) == 0) {
                arrayList.set(i10, str);
            }
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException("UTF-8 not supported?", e11);
        }
        return str;
    }

    @Override // p282nn.InterfaceC7806d
    /* JADX INFO: renamed from: k */
    public final List<?> mo15536k() {
        return Collections.unmodifiableList(this.f42892a);
    }

    @Override // p282nn.InterfaceC7806d
    /* JADX INFO: renamed from: n */
    public final C7811i mo15537n() {
        return new C7811i(this);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        Object objRemove = this.f42892a.remove(i10);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (objRemove instanceof AbstractC7803a) {
            AbstractC7803a abstractC7803a = (AbstractC7803a) objRemove;
            abstractC7803a.getClass();
            try {
                return abstractC7803a.mo15529v();
            } catch (UnsupportedEncodingException e10) {
                throw new RuntimeException("UTF-8 not supported?", e10);
            }
        }
        byte[] bArr = (byte[]) objRemove;
        byte[] bArr2 = C6995f.f39527a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException("UTF-8 not supported?", e11);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        Object obj2 = this.f42892a.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof AbstractC7803a) {
            AbstractC7803a abstractC7803a = (AbstractC7803a) obj2;
            abstractC7803a.getClass();
            try {
                return abstractC7803a.mo15529v();
            } catch (UnsupportedEncodingException e10) {
                throw new RuntimeException("UTF-8 not supported?", e10);
            }
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = C6995f.f39527a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException("UTF-8 not supported?", e11);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f42892a.size();
    }
}
