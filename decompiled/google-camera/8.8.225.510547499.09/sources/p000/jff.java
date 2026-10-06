package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jff implements jef {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ BasePendingResult f33863a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ihk f33864b;

    public jff(ihk ihkVar, BasePendingResult basePendingResult, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f33864b = ihkVar;
        this.f33863a = basePendingResult;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    @Override // p000.jef
    /* JADX INFO: renamed from: a */
    public final void mo12969a(Status status) {
        this.f33864b.f30967b.remove(this.f33863a);
    }
}
