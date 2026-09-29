package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Locale;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfa extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzfa(long j, long j2, int i, IndexOutOfBoundsException indexOutOfBoundsException) {
        Locale locale = Locale.US;
        StringBuilder sbM22996s = ux5.m22996s(j, "Pos: ", ", limit: ");
        sbM22996s.append(j2);
        sbM22996s.append(", len: ");
        sbM22996s.append(i);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbM22996s.toString()), indexOutOfBoundsException);
    }

    public zzfa(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
