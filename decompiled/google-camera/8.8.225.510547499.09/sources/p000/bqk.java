package p000;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class bqk implements bql {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f4189a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f4190b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f4191c;

    public bqk(bro broVar, btg btgVar, int i) {
        this.f4191c = i;
        this.f4190b = broVar;
        this.f4189a = btgVar;
    }

    public bqk(InputStream inputStream, btg btgVar, int i) {
        this.f4191c = i;
        this.f4189a = inputStream;
        this.f4190b = btgVar;
    }

    public bqk(ByteBuffer byteBuffer, btg btgVar, int i) {
        this.f4191c = i;
        this.f4189a = byteBuffer;
        this.f4190b = btgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [btg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [btg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [btg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [btg, java.lang.Object] */
    @Override // p000.bql
    /* JADX INFO: renamed from: a */
    public final int mo2921a(bqh bqhVar) throws Throwable {
        bxm bxmVar;
        switch (this.f4191c) {
            case 0:
                try {
                    return bqhVar.mo2916a((InputStream) this.f4189a, this.f4190b);
                } finally {
                    ((InputStream) this.f4189a).reset();
                }
            case 1:
                try {
                    return bqhVar.mo2917b((ByteBuffer) this.f4189a, this.f4190b);
                } finally {
                    cav.m3364c((ByteBuffer) this.f4189a);
                }
            default:
                try {
                    bxmVar = new bxm(new FileInputStream(((bro) this.f4190b).mo2949a().getFileDescriptor()), this.f4189a);
                    try {
                        int iMo2916a = bqhVar.mo2916a(bxmVar, this.f4189a);
                        bxmVar.m3166b();
                        ((bro) this.f4190b).mo2949a();
                        return iMo2916a;
                    } catch (Throwable th) {
                        th = th;
                        if (bxmVar != null) {
                            bxmVar.m3166b();
                        }
                        ((bro) this.f4190b).mo2949a();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bxmVar = null;
                }
                break;
        }
    }
}
