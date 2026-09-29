package com.google.android.gms.internal.vision;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzii$zzb extends IOException {
    public zzii$zzb(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
        super(str.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str) : new String("CodedOutputStream was writing to a flat byte array and ran out of space.: "), indexOutOfBoundsException);
    }

    public zzii$zzb(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
