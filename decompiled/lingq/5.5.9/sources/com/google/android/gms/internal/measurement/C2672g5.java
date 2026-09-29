package com.google.android.gms.internal.measurement;

import android.support.v4.media.session.C0166e;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2672g5 extends C2658f5 {
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final void m7846a(Object... objArr) {
        for (int i10 = 0; i10 < 15; i10++) {
            if (objArr[i10] == null) {
                throw new NullPointerException(C0166e.m761g("at index ", i10));
            }
        }
        int i11 = this.f14192b + 15;
        Object[] objArr2 = this.f14191a;
        int length = objArr2.length;
        if (length < i11) {
            int i12 = length + (length >> 1) + 1;
            if (i12 < i11) {
                int iHighestOneBit = Integer.highestOneBit(i11 - 1);
                i12 = iHighestOneBit + iHighestOneBit;
            }
            if (i12 < 0) {
                i12 = Integer.MAX_VALUE;
            }
            this.f14191a = Arrays.copyOf(objArr2, i12);
            this.f14193c = false;
        } else if (this.f14193c) {
            this.f14191a = (Object[]) objArr2.clone();
            this.f14193c = false;
        }
        System.arraycopy(objArr, 0, this.f14191a, this.f14192b, 15);
        this.f14192b += 15;
    }
}
