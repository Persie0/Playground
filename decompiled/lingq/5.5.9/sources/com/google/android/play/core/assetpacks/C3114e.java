package com.google.android.play.core.assetpacks;

import android.os.ParcelFileDescriptor;
import java.util.concurrent.ExecutionException;
import p338qd.InterfaceC8589w1;
import p457wd.C9903d;
import td.InterfaceC9268p;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.e */
/* JADX INFO: loaded from: classes.dex */
public final class C3114e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC9268p f15909a;

    public C3114e(InterfaceC9268p interfaceC9268p) {
        this.f15909a = interfaceC9268p;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final ParcelFileDescriptor.AutoCloseInputStream m8982a(String str, int i10, int i11, String str2) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) C9903d.m18405a(((InterfaceC8589w1) this.f15909a.zza()).mo8957c(str, i10, i11, str2));
            if (parcelFileDescriptor == null || parcelFileDescriptor.getFileDescriptor() == null) {
                throw new zzck(String.format("Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s", Integer.valueOf(i10), str, str2, Integer.valueOf(i11)), i10);
            }
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        } catch (InterruptedException e10) {
            throw new zzck("Extractor was interrupted while waiting for chunk file.", e10, i10);
        } catch (ExecutionException e11) {
            throw new zzck(String.format("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", Integer.valueOf(i10), str, str2, Integer.valueOf(i11)), e11, i10);
        }
    }
}
