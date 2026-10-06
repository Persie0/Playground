package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fyk implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ fyl f23908a;

    /* JADX INFO: renamed from: b */
    private final grm f23909b;

    /* JADX INFO: renamed from: c */
    private final nqf f23910c;

    public fyk(fyl fylVar, grm grmVar, nqf nqfVar) {
        this.f23908a = fylVar;
        this.f23909b = grmVar;
        this.f23910c = nqfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nqf nqfVar;
        RuntimeException runtimeException;
        try {
            try {
                fyl fylVar = this.f23908a;
                grm grmVar = this.f23909b;
                fylVar.f23914d.mo13961e("allocateAndCompressJpeg");
                int iWidth = ((grmVar.f26156e.width() * 3) * grmVar.f26156e.height()) / 2;
                int i = iWidth / 2;
                gsb gsbVarMo9697c = fylVar.f23912b.mo9697c(Integer.valueOf(i));
                try {
                    ByteBuffer byteBuffer = (ByteBuffer) gsbVarMo9697c.m9698a();
                    if (byteBuffer == null) {
                        throw new RuntimeException("Failed to allocate buffer for JPEG: " + i + " bytes");
                    }
                    int iMo9789b = fylVar.f23913c.mo9789b(grmVar, byteBuffer.duplicate());
                    if (iMo9789b > i) {
                        gsbVarMo9697c.close();
                        gsbVarMo9697c = fylVar.f23912b.mo9697c(Integer.valueOf(iWidth));
                        try {
                            byteBuffer = (ByteBuffer) gsbVarMo9697c.m9698a();
                            if (byteBuffer == null) {
                                throw new RuntimeException("Failed to allocate buffer for JPEG: " + iWidth + " bytes");
                            }
                            iMo9789b = fylVar.f23913c.mo9789b(grmVar, byteBuffer.duplicate());
                        } catch (Throwable th) {
                            th = th;
                            gsbVarMo9697c.close();
                            throw th;
                        }
                    }
                    if (iMo9789b <= 0) {
                        throw new RuntimeException("Error compressing jpeg: num bytes written was " + iMo9789b);
                    }
                    byteBuffer.position(0);
                    byteBuffer.limit(iMo9789b);
                    byteBuffer.order(ByteOrder.nativeOrder());
                    byte[] bArr = new byte[iMo9789b];
                    byteBuffer.get(bArr);
                    fylVar.f23914d.mo13962f();
                    gsbVarMo9697c.close();
                    kep kepVarM14064b = kep.m14064b();
                    nps npsVar = this.f23909b.f26154c;
                    npsVar.getClass();
                    kpp kppVar = (kpp) npsVar.get();
                    kbc kbcVarM13902g = kbc.m13902g(this.f23909b.f26156e);
                    kay kayVarMo9788a = this.f23908a.f23913c.mo9788a(this.f23909b);
                    kepVarM14064b.m14070f(kbcVarM13902g.f35517a, kbcVarM13902g.f35518b, kayVarMo9788a, mrm.m16829i(kppVar));
                    kepVarM14064b.m14071g(this.f23909b.f26162k);
                    this.f23910c.mo14894e(fxt.m8941a(this.f23909b.f26152a.mo7248d(), bArr, kbcVarM13902g, kayVarMo9788a.f35503e, kepVarM14064b.f35783a, this.f23908a.f23915e));
                    if (this.f23910c.isDone() || this.f23910c.isCancelled()) {
                        return;
                    }
                    nqfVar = this.f23910c;
                    runtimeException = new RuntimeException("Unknown error while encoding imageToProcess");
                    nqfVar.mo8566a(runtimeException);
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                if (!this.f23910c.isDone() && !this.f23910c.isCancelled()) {
                    this.f23910c.mo8566a(new RuntimeException("Unknown error while encoding imageToProcess"));
                }
                throw th3;
            }
        } catch (Exception e) {
            this.f23910c.mo8566a(e);
            if (this.f23910c.isDone() || this.f23910c.isCancelled()) {
                return;
            }
            nqfVar = this.f23910c;
            runtimeException = new RuntimeException("Unknown error while encoding imageToProcess");
        }
    }
}
