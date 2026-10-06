package p000;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ebl implements eda {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ewq f13227a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ glk f13228b;

    public ebl(ewq ewqVar, glk glkVar, byte[] bArr, byte[] bArr2) {
        this.f13227a = ewqVar;
        this.f13228b = glkVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kbz] */
    @Override // p000.eda
    /* JADX INFO: renamed from: a */
    public final void mo7062a(bko bkoVar) {
        this.f13227a.f20674h.mo13961e("DngCallback");
        fyh fyhVarMo3604b = ((fyi) ((cwd) this.f13227a.f20680n).m5651J()).mo3604b(this.f13228b);
        ByteBuffer byteBufferDuplicate = ((ByteBuffer) bkoVar.f3652a).duplicate();
        if (byteBufferDuplicate == null) {
            fyhVarMo3604b.f23902b.mo14686f();
            fyhVarMo3604b.f23901a.mo9642h();
        } else {
            byteBufferDuplicate.capacity();
            fyhVarMo3604b.f23903c.f23904a.execute(new fro(fyhVarMo3604b, byteBufferDuplicate, 7));
        }
        this.f13227a.f20674h.mo13962f();
    }
}
