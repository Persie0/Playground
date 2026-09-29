package com.google.android.gms.internal.common;

import p000.ted;

/* JADX INFO: loaded from: classes2.dex */
final class zzaf extends zzah {

    /* JADX INFO: renamed from: c */
    public final transient zzah f11818c;

    public zzaf(zzah zzahVar) {
        this.f11818c = zzahVar;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f11818c.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzah zzahVar = this.f11818c;
        ted.m22020b(i, zzahVar.size());
        return zzahVar.get((zzahVar.size() - 1) - i);
    }

    @Override // com.google.android.gms.internal.common.zzah
    /* JADX INFO: renamed from: i */
    public final zzah mo5354i() {
        return this.f11818c;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    public final int indexOf(Object obj) {
        zzah zzahVar = this.f11818c;
        int iLastIndexOf = zzahVar.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (zzahVar.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final zzah subList(int i, int i2) {
        zzah zzahVar = this.f11818c;
        ted.m22021c(i, i2, zzahVar.size());
        return zzahVar.subList(zzahVar.size() - i2, zzahVar.size() - i).mo5354i();
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    public final int lastIndexOf(Object obj) {
        zzah zzahVar = this.f11818c;
        int iIndexOf = zzahVar.indexOf(obj);
        if (iIndexOf >= 0) {
            return (zzahVar.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11818c.size();
    }
}
