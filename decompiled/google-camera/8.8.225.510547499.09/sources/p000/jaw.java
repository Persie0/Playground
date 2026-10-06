package p000;

import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jaw implements jal {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Runnable f33633a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ihk f33634b;

    public jaw(ihk ihkVar, Runnable runnable, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f33634b = ihkVar;
        this.f33633a = runnable;
    }

    @Override // p000.jal
    /* JADX INFO: renamed from: a */
    public final void mo12761a() {
        ((Handler) this.f33634b.f30966a).post(this.f33633a);
    }
}
