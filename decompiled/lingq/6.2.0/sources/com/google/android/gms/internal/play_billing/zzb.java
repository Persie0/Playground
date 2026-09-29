package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import p000.C3299li;
import p000.irb;

/* JADX INFO: loaded from: classes2.dex */
enum zzb {
    RESPONSE_CODE_UNSPECIFIED(-999),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    EXPIRED_OFFER_TOKEN(11),
    NETWORK_ERROR(12);

    private static final zzbz zzp;
    private final int zzr;

    static {
        C3299li c3299li = new C3299li();
        c3299li.f49691b = new Object[8];
        c3299li.f49690a = 0;
        for (zzb zzbVar : values()) {
            Integer numValueOf = Integer.valueOf(zzbVar.zzr);
            int i = c3299li.f49690a + 1;
            Object[] objArr = (Object[]) c3299li.f49691b;
            int length = objArr.length;
            int i2 = i + i;
            if (i2 > length) {
                if (i2 > length) {
                    length = length + (length >> 1) + 1;
                    if (length < i2) {
                        int iHighestOneBit = Integer.highestOneBit(i2 - 1);
                        length = iHighestOneBit + iHighestOneBit;
                    }
                    if (length < 0) {
                        length = Integer.MAX_VALUE;
                    }
                }
                c3299li.f49691b = Arrays.copyOf(objArr, length);
            }
            Object[] objArr2 = (Object[]) c3299li.f49691b;
            int i3 = c3299li.f49690a;
            int i4 = i3 + i3;
            objArr2[i4] = numValueOf;
            objArr2[i4 + 1] = zzbVar;
            c3299li.f49690a = i3 + 1;
        }
        irb irbVar = (irb) c3299li.f49692c;
        if (irbVar != null) {
            throw irbVar.m14081a();
        }
        zzci zzciVarM5675b = zzci.m5675b(c3299li.f49690a, (Object[]) c3299li.f49691b, c3299li);
        irb irbVar2 = (irb) c3299li.f49692c;
        if (irbVar2 != null) {
            throw irbVar2.m14081a();
        }
        zzp = zzciVarM5675b;
    }

    zzb(int i) {
        this.zzr = i;
    }

    public static zzb zza(int i) {
        zzbz zzbzVar = zzp;
        Integer numValueOf = Integer.valueOf(i);
        return !zzbzVar.containsKey(numValueOf) ? RESPONSE_CODE_UNSPECIFIED : (zzb) zzbzVar.get(numValueOf);
    }
}
