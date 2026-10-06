package p000;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class byt implements bys {

    /* JADX INFO: renamed from: a */
    public static final byt f4785a = new byt(0);

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f4786b;

    public byt(int i) {
        this.f4786b = i;
    }

    @Override // p000.bys
    /* JADX INFO: renamed from: a */
    public final bsz mo3199a(bsz bszVar, bqr bqrVar) {
        byte[] bArrArray;
        switch (this.f4786b) {
            case 0:
                return bszVar;
            default:
                ByteBuffer byteBufferM3189b = ((byh) bszVar.mo3016c()).m3189b();
                int i = cav.f4932a;
                grt grtVar = null;
                if (!byteBufferM3189b.isReadOnly() && byteBufferM3189b.hasArray()) {
                    grtVar = new grt(byteBufferM3189b.array(), byteBufferM3189b.arrayOffset(), byteBufferM3189b.limit());
                }
                if (grtVar != null && grtVar.f26180b == 0 && grtVar.f26179a == ((byte[]) grtVar.f26181c).length) {
                    bArrArray = byteBufferM3189b.array();
                } else {
                    ByteBuffer byteBufferAsReadOnlyBuffer = byteBufferM3189b.asReadOnlyBuffer();
                    byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.limit()];
                    cav.m3364c(byteBufferAsReadOnlyBuffer);
                    byteBufferAsReadOnlyBuffer.get(bArr);
                    bArrArray = bArr;
                }
                return new bxz(bArrArray, 0);
        }
    }
}
