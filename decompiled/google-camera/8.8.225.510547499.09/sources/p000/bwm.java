package p000;

import android.graphics.ImageDecoder;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bwm implements bqt {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f4659a;

    /* JADX INFO: renamed from: b */
    private final Object f4660b;

    public bwm(int i) {
        this.f4659a = i;
        this.f4660b = new bwk();
    }

    public bwm(int i, byte[] bArr) {
        this.f4659a = i;
        this.f4660b = new bwk();
    }

    public bwm(bti btiVar, int i) {
        this.f4659a = i;
        this.f4660b = btiVar;
    }

    public bwm(bxb bxbVar, int i) {
        this.f4659a = i;
        this.f4660b = bxbVar;
    }

    public bwm(dsx dsxVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f4659a = i;
        this.f4660b = dsxVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v11, types: [btg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, java.util.List] */
    @Override // p000.bqt
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean mo2931b(Object obj, bqr bqrVar) {
        switch (this.f4659a) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return (!("HUAWEI".equalsIgnoreCase(Build.MANUFACTURER) || "HONOR".equalsIgnoreCase(Build.MANUFACTURER)) || ((ParcelFileDescriptor) obj).getStatSize() <= 536870912) && bro.m2956d();
            case 4:
                return dsx.m6673A(bzq.m3228A(((dsx) this.f4660b).f12522b, (ByteBuffer) obj));
            case 5:
                dsx dsxVar = (dsx) this.f4660b;
                return dsx.m6673A(bzq.m3229B(dsxVar.f12522b, (InputStream) obj, dsxVar.f12521a));
            default:
                return true;
        }
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [bti, java.lang.Object] */
    @Override // p000.bqt
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bsz mo2930a(Object obj, int i, int i2, bqr bqrVar) {
        switch (this.f4659a) {
            case 0:
                return ((bwk) this.f4660b).mo2930a(ImageDecoder.createSource((ByteBuffer) obj), i, i2, bqrVar);
            case 1:
                bxb bxbVar = (bxb) this.f4660b;
                return bxbVar.m3152a(new bxi((ByteBuffer) obj, bxbVar.f4684g, bxbVar.f4683f, 1), i, i2, bqrVar, bxb.f4681e);
            case 2:
                return ((bwk) this.f4660b).mo2930a(ImageDecoder.createSource(cav.m3363b((InputStream) obj)), i, i2, bqrVar);
            case 3:
                bxb bxbVar2 = (bxb) this.f4660b;
                return bxbVar2.m3152a(new bxi((ParcelFileDescriptor) obj, bxbVar2.f4684g, bxbVar2.f4683f, 2), i, i2, bqrVar, bxb.f4681e);
            case 4:
                return dsx.m6677z(ImageDecoder.createSource((ByteBuffer) obj), i, i2, bqrVar);
            case 5:
                return dsx.m6677z(ImageDecoder.createSource(cav.m3363b((InputStream) obj)), i, i2, bqrVar);
            default:
                return bxk.m3162g(((bpz) obj).mo2903a(), this.f4660b);
        }
    }
}
