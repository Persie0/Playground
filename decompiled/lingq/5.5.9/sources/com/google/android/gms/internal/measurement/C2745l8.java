package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l8 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C2745l8 extends AbstractList implements RandomAccess, InterfaceC2888w6 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2888w6 f14300a;

    public C2745l8(InterfaceC2888w6 interfaceC2888w6) {
        this.f14300a = interfaceC2888w6;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2888w6
    /* JADX INFO: renamed from: I */
    public final Object mo8050I(int i10) {
        return this.f14300a.mo8050I(i10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2888w6
    /* JADX INFO: renamed from: b */
    public final InterfaceC2888w6 mo8051b() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2888w6
    /* JADX INFO: renamed from: e */
    public final List mo8052e() {
        return this.f14300a.mo8052e();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((C2875v6) this.f14300a).get(i10);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2888w6
    /* JADX INFO: renamed from: i0 */
    public final void mo8053i0(zzka zzkaVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C2731k8(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new C2717j8(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14300a.size();
    }
}
