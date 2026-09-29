package com.google.android.gms.internal.mlkit_vision_document_scanner;

import java.util.Objects;
import p000.oed;

/* JADX INFO: loaded from: classes2.dex */
final class zzab extends zzx {

    /* JADX INFO: renamed from: e */
    public static final zzx f11995e = new zzab(new Object[0], 0);

    /* JADX INFO: renamed from: c */
    public final transient Object[] f11996c;

    /* JADX INFO: renamed from: d */
    public final transient int f11997d;

    public zzab(Object[] objArr, int i) {
        this.f11996c = objArr;
        this.f11997d = i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzt
    /* JADX INFO: renamed from: d */
    public final Object[] mo5464d() {
        return this.f11996c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzt
    /* JADX INFO: renamed from: f */
    public final int mo5465f() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzt
    /* JADX INFO: renamed from: g */
    public final int mo5466g() {
        return this.f11997d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        oed.m17956d(i, this.f11997d);
        Object obj = this.f11996c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzx, com.google.android.gms.internal.mlkit_vision_document_scanner.zzt
    /* JADX INFO: renamed from: h */
    public final int mo5467h(Object[] objArr) {
        Object[] objArr2 = this.f11996c;
        int i = this.f11997d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11997d;
    }
}
