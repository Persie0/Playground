package com.google.android.gms.internal.clearcut;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import p000.btb;
import p000.ij6;
import p000.jnb;
import p000.l4c;
import p000.lvb;
import p000.p5c;
import p000.utb;

/* JADX INFO: renamed from: com.google.android.gms.internal.clearcut.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C0950c extends jnb implements lvb, RandomAccess {

    /* JADX INFO: renamed from: b */
    public final ArrayList f11778b;

    static {
        new C0950c(10).f45884a = false;
    }

    public C0950c(int i) {
        this(new ArrayList(i));
    }

    @Override // p000.utb
    /* JADX INFO: renamed from: N */
    public final utb mo5294N(int i) {
        ArrayList arrayList = this.f11778b;
        if (i < arrayList.size()) {
            ij6.m13959q();
            return null;
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new C0950c(arrayList2);
    }

    @Override // p000.lvb
    /* JADX INFO: renamed from: W */
    public final lvb mo5295W() {
        return this.f45884a ? new l4c(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        m14564d();
        this.f11778b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // p000.jnb, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m14564d();
        if (collection instanceof lvb) {
            collection = ((lvb) collection).mo5296x();
        }
        boolean zAddAll = this.f11778b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // p000.jnb, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m14564d();
        this.f11778b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String str;
        ArrayList arrayList = this.f11778b;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof zzbb)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, btb.f8994a);
            if (p5c.f55622a.m142c(bArr, 0, bArr.length)) {
                arrayList.set(i, str2);
            }
            return str2;
        }
        zzbb zzbbVar = (zzbb) obj;
        Charset charset = btb.f8994a;
        if (zzbbVar.size() == 0) {
            str = "";
        } else {
            zzbi zzbiVar = (zzbi) zzbbVar;
            str = new String(zzbiVar.f11804d, zzbiVar.m5344g(), zzbiVar.size(), charset);
        }
        zzbi zzbiVar2 = (zzbi) zzbbVar;
        int iM5344g = zzbiVar2.m5344g();
        if (p5c.f55622a.m142c(zzbiVar2.f11804d, iM5344g, zzbiVar2.size() + iM5344g)) {
            arrayList.set(i, str);
        }
        return str;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m14564d();
        Object objRemove = this.f11778b.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof zzbb)) {
            return new String((byte[]) objRemove, btb.f8994a);
        }
        zzbb zzbbVar = (zzbb) objRemove;
        Charset charset = btb.f8994a;
        if (zzbbVar.size() == 0) {
            return "";
        }
        zzbi zzbiVar = (zzbi) zzbbVar;
        return new String(zzbiVar.f11804d, zzbiVar.m5344g(), zzbiVar.size(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m14564d();
        Object obj2 = this.f11778b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof zzbb)) {
            return new String((byte[]) obj2, btb.f8994a);
        }
        zzbb zzbbVar = (zzbb) obj2;
        Charset charset = btb.f8994a;
        if (zzbbVar.size() == 0) {
            return "";
        }
        zzbi zzbiVar = (zzbi) zzbbVar;
        return new String(zzbiVar.f11804d, zzbiVar.m5344g(), zzbiVar.size(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11778b.size();
    }

    @Override // p000.lvb
    /* JADX INFO: renamed from: x */
    public final List mo5296x() {
        return Collections.unmodifiableList(this.f11778b);
    }

    public C0950c(ArrayList arrayList) {
        this.f11778b = arrayList;
    }

    @Override // p000.jnb, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f11778b.size(), collection);
    }
}
