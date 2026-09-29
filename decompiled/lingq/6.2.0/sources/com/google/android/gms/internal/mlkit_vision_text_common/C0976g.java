package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Iterator;
import p000.C3386nv;
import p000.uk9;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_text_common.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C0976g implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f12036a;

    /* JADX INFO: renamed from: b */
    public int f12037b;

    /* JADX INFO: renamed from: c */
    public int f12038c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzba f12039d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f12040e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ zzba f12041f;

    public C0976g(zzba zzbaVar, int i) {
        this.f12040e = i;
        this.f12041f = zzbaVar;
        this.f12039d = zzbaVar;
        this.f12036a = zzbaVar.f12076e;
        this.f12037b = zzbaVar.isEmpty() ? -1 : 0;
        this.f12038c = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12037b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object c0978i;
        zzba zzbaVar = this.f12039d;
        if (zzbaVar.f12076e != this.f12036a) {
            C3386nv.m17619e();
            return null;
        }
        if (!hasNext()) {
            uk9.m22784s();
            return null;
        }
        int i = this.f12037b;
        this.f12038c = i;
        int i2 = this.f12040e;
        zzba zzbaVar2 = this.f12041f;
        switch (i2) {
            case 0:
                Object obj = zzba.f12071j;
                c0978i = zzbaVar2.m5483b()[i];
                break;
            case 1:
                c0978i = new C0978i(zzbaVar2, i);
                break;
            default:
                Object obj2 = zzba.f12071j;
                c0978i = zzbaVar2.m5484c()[i];
                break;
        }
        int i3 = this.f12037b + 1;
        if (i3 >= zzbaVar.f12077f) {
            i3 = -1;
        }
        this.f12037b = i3;
        return c0978i;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzba zzbaVar = this.f12039d;
        int i = zzbaVar.f12076e;
        int i2 = this.f12036a;
        if (i != i2) {
            C3386nv.m17619e();
            return;
        }
        int i3 = this.f12038c;
        if (!(i3 >= 0)) {
            C3386nv.m17633t("no calls to next() since the last call to remove()");
            return;
        }
        this.f12036a = i2 + 32;
        zzbaVar.remove(zzbaVar.m5483b()[i3]);
        this.f12037b--;
        this.f12038c = -1;
    }
}
