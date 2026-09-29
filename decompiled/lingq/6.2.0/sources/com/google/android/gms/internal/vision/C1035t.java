package com.google.android.gms.internal.vision;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import p000.agc;
import p000.ij6;
import p000.mpc;
import p000.noc;
import p000.uzc;
import p000.yqc;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C1035t extends agc implements yqc, RandomAccess {

    /* JADX INFO: renamed from: b */
    public final ArrayList f12243b;

    static {
        new C1035t(10).f614a = false;
    }

    public C1035t(int i) {
        this(new ArrayList(i));
    }

    @Override // p000.yqc
    /* JADX INFO: renamed from: R */
    public final void mo5747R(zzht zzhtVar) {
        m390d();
        this.f12243b.add(zzhtVar);
        ((AbstractList) this).modCount++;
    }

    @Override // p000.mpc
    /* JADX INFO: renamed from: a */
    public final mpc mo5748a(int i) {
        ArrayList arrayList = this.f12243b;
        if (i < arrayList.size()) {
            ij6.m13959q();
            return null;
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new C1035t(arrayList2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        m390d();
        this.f12243b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // p000.agc, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m390d();
        if (collection instanceof yqc) {
            collection = ((yqc) collection).mo5750e();
        }
        boolean zAddAll = this.f12243b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // p000.yqc
    /* JADX INFO: renamed from: b */
    public final yqc mo5749b() {
        return this.f614a ? new uzc(this) : this;
    }

    @Override // p000.agc, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m390d();
        this.f12243b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // p000.yqc
    /* JADX INFO: renamed from: e */
    public final List mo5750e() {
        return Collections.unmodifiableList(this.f12243b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String str;
        ArrayList arrayList = this.f12243b;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof zzht)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, noc.f53082a);
            if (AbstractC1040y.f12266a.m5828f(bArr, 0, bArr.length)) {
                arrayList.set(i, str2);
            }
            return str2;
        }
        zzht zzhtVar = (zzht) obj;
        Charset charset = noc.f53082a;
        if (zzhtVar.mo5832f() == 0) {
            str = "";
        } else {
            zzid zzidVar = (zzid) zzhtVar;
            str = new String(zzidVar.f12298d, zzidVar.mo5834j(), zzidVar.mo5832f(), charset);
        }
        zzid zzidVar2 = (zzid) zzhtVar;
        int iMo5834j = zzidVar2.mo5834j();
        if (AbstractC1040y.f12266a.m5828f(zzidVar2.f12298d, iMo5834j, zzidVar2.mo5832f() + iMo5834j)) {
            arrayList.set(i, str);
        }
        return str;
    }

    @Override // p000.agc, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m390d();
        Object objRemove = this.f12243b.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof zzht)) {
            return new String((byte[]) objRemove, noc.f53082a);
        }
        zzht zzhtVar = (zzht) objRemove;
        Charset charset = noc.f53082a;
        if (zzhtVar.mo5832f() == 0) {
            return "";
        }
        zzid zzidVar = (zzid) zzhtVar;
        return new String(zzidVar.f12298d, zzidVar.mo5834j(), zzidVar.mo5832f(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m390d();
        Object obj2 = this.f12243b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof zzht)) {
            return new String((byte[]) obj2, noc.f53082a);
        }
        zzht zzhtVar = (zzht) obj2;
        Charset charset = noc.f53082a;
        if (zzhtVar.mo5832f() == 0) {
            return "";
        }
        zzid zzidVar = (zzid) zzhtVar;
        return new String(zzidVar.f12298d, zzidVar.mo5834j(), zzidVar.mo5832f(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12243b.size();
    }

    @Override // p000.yqc
    /* JADX INFO: renamed from: z */
    public final Object mo5751z(int i) {
        return this.f12243b.get(i);
    }

    public C1035t(ArrayList arrayList) {
        this.f12243b = arrayList;
    }

    @Override // p000.agc, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f12243b.size(), collection);
    }
}
