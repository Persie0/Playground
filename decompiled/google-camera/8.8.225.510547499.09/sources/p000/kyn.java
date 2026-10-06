package p000;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class kyn {

    /* JADX INFO: renamed from: a */
    public final int f37735a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ lpe f37736b;

    public kyn(lpe lpeVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f37736b = lpeVar;
        this.f37735a = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m15064a() {
        return ((ByteBuffer) this.f37736b.f38883b).getInt(this.f37735a);
    }
}
