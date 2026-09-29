package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2875v6 extends AbstractC2770n5 implements RandomAccess, InterfaceC2888w6 {

    /* JADX INFO: renamed from: b */
    public final List f14477b;

    static {
        new C2875v6((Object) null);
    }

    public C2875v6() {
        this(10);
    }

    public C2875v6(int i10) {
        ArrayList arrayList = new ArrayList(i10);
        super(true);
        this.f14477b = arrayList;
    }

    public C2875v6(Object obj) {
        super(false);
        this.f14477b = Collections.emptyList();
    }

    public C2875v6(ArrayList arrayList) {
        super(true);
        this.f14477b = arrayList;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2888w6
    /* JADX INFO: renamed from: I */
    public final Object mo8050I(int i10) {
        return this.f14477b.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        m8076a();
        this.f14477b.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2770n5, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        m8076a();
        if (collection instanceof InterfaceC2888w6) {
            collection = ((InterfaceC2888w6) collection).mo8052e();
        }
        boolean zAddAll = this.f14477b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2770n5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2888w6
    /* JADX INFO: renamed from: b */
    public final InterfaceC2888w6 mo8051b() {
        return this.f14334a ? new C2745l8(this) : this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2770n5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m8076a();
        this.f14477b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2888w6
    /* JADX INFO: renamed from: e */
    public final List mo8052e() {
        return Collections.unmodifiableList(this.f14477b);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final String get(int i10) {
        List list = this.f14477b;
        Object obj = list.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzka) {
            zzka zzkaVar = (zzka) obj;
            String strMo8497y = zzkaVar.mo8492q() == 0 ? "" : zzkaVar.mo8497y(C2849t6.f14439a);
            if (zzkaVar.mo8494D()) {
                list.set(i10, strMo8497y);
            }
            return strMo8497y;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, C2849t6.f14439a);
        C2838s8 c2838s8 = C2851t8.f14444a;
        int length = bArr.length;
        c2838s8.getClass();
        if (AbstractC2825r8.m8240a(bArr, 0, length)) {
            list.set(i10, str);
        }
        return str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2888w6
    /* JADX INFO: renamed from: i0 */
    public final void mo8053i0(zzka zzkaVar) {
        m8076a();
        this.f14477b.add(zzkaVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2836s6
    /* JADX INFO: renamed from: r */
    public final /* bridge */ /* synthetic */ InterfaceC2836s6 mo7645r(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f14477b);
        return new C2875v6(arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2770n5, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        m8076a();
        Object objRemove = this.f14477b.remove(i10);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof zzka)) {
            return new String((byte[]) objRemove, C2849t6.f14439a);
        }
        zzka zzkaVar = (zzka) objRemove;
        return zzkaVar.mo8492q() == 0 ? "" : zzkaVar.mo8497y(C2849t6.f14439a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        m8076a();
        Object obj2 = this.f14477b.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof zzka)) {
            return new String((byte[]) obj2, C2849t6.f14439a);
        }
        zzka zzkaVar = (zzka) obj2;
        return zzkaVar.mo8492q() == 0 ? "" : zzkaVar.mo8497y(C2849t6.f14439a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14477b.size();
    }
}
