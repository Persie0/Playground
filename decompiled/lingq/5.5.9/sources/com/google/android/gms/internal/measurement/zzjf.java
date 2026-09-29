package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class zzjf extends zzjb {

    /* JADX INFO: renamed from: i */
    public static final Object[] f14553i;

    /* JADX INFO: renamed from: j */
    public static final zzjf f14554j;

    /* JADX INFO: renamed from: d */
    public final transient Object[] f14555d;

    /* JADX INFO: renamed from: e */
    public final transient int f14556e;

    /* JADX INFO: renamed from: f */
    public final transient Object[] f14557f;

    /* JADX INFO: renamed from: g */
    public final transient int f14558g;

    /* JADX INFO: renamed from: h */
    public final transient int f14559h;

    static {
        Object[] objArr = new Object[0];
        f14553i = objArr;
        f14554j = new zzjf(0, 0, 0, objArr, objArr);
    }

    public zzjf(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        this.f14555d = objArr;
        this.f14556e = i10;
        this.f14557f = objArr2;
        this.f14558g = i11;
        this.f14559h = i12;
    }

    /* JADX INFO: renamed from: D */
    public final zzja m8488D() {
        return zzja.m8483y(this.f14559h, this.f14555d);
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    /* JADX INFO: renamed from: a */
    public final void mo8478a(Object[] objArr) {
        System.arraycopy(this.f14555d, 0, objArr, 0, this.f14559h);
    }

    @Override // com.google.android.gms.internal.measurement.zziw, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f14557f;
            if (objArr.length != 0) {
                int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) obj.hashCode()) * (-862048943)), 15)) * 461845907);
                while (true) {
                    int i10 = iRotateLeft & this.f14558g;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iRotateLeft = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzjb, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f14556e;
    }

    @Override // com.google.android.gms.internal.measurement.zzjb, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzja zzjaVarM8488D = this.f14549b;
        if (zzjaVarM8488D == null) {
            zzjaVarM8488D = m8488D();
            this.f14549b = zzjaVarM8488D;
        }
        return zzjaVarM8488D.listIterator(0);
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    /* JADX INFO: renamed from: l */
    public final int mo8479l() {
        return this.f14559h;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    /* JADX INFO: renamed from: q */
    public final int mo8480q() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    /* JADX INFO: renamed from: s */
    public final Object[] mo8481s() {
        return this.f14555d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f14559h;
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    /* JADX INFO: renamed from: t */
    public final AbstractC2728k5 iterator() {
        zzja zzjaVarM8488D = this.f14549b;
        if (zzjaVarM8488D == null) {
            zzjaVarM8488D = m8488D();
            this.f14549b = zzjaVarM8488D;
        }
        return zzjaVarM8488D.listIterator(0);
    }
}
