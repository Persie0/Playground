package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.Feature;
import java.util.Arrays;
import p000.kjb;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_common.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C0966a {

    /* JADX INFO: renamed from: a */
    public Object[] f11921a = new Object[8];

    /* JADX INFO: renamed from: b */
    public int f11922b = 0;

    /* JADX INFO: renamed from: c */
    public kjb f11923c;

    /* JADX INFO: renamed from: a */
    public final void m5446a(String str, Feature feature) {
        int i = this.f11922b + 1;
        Object[] objArr = this.f11921a;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            if (i2 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int iHighestOneBit = Integer.highestOneBit(i2 - 1);
                i3 = iHighestOneBit + iHighestOneBit;
            }
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            this.f11921a = Arrays.copyOf(objArr, i3);
        }
        Object[] objArr2 = this.f11921a;
        int i4 = this.f11922b;
        int i5 = i4 + i4;
        objArr2[i5] = str;
        objArr2[i5 + 1] = feature;
        this.f11922b = i4 + 1;
    }

    /* JADX INFO: renamed from: b */
    public final zzai m5447b() {
        kjb kjbVar = this.f11923c;
        if (kjbVar != null) {
            throw kjbVar.m15276a();
        }
        zzaq zzaqVarM5455a = zzaq.m5455a(this.f11922b, this.f11921a, this);
        kjb kjbVar2 = this.f11923c;
        if (kjbVar2 == null) {
            return zzaqVarM5455a;
        }
        throw kjbVar2.m15276a();
    }
}
