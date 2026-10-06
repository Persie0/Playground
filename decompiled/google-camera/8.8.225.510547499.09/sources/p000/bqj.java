package p000;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.FileInputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class bqj implements bqm {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ bro f4187a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ btg f4188b;

    public bqj(bro broVar, btg btgVar) {
        this.f4187a = broVar;
        this.f4188b = btgVar;
    }

    @Override // p000.bqm
    /* JADX INFO: renamed from: a */
    public final ImageHeaderParser$ImageType mo2920a(bqh bqhVar) throws Throwable {
        bxm bxmVar;
        try {
            bxmVar = new bxm(new FileInputStream(this.f4187a.mo2949a().getFileDescriptor()), this.f4188b);
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo2918c = bqhVar.mo2918c(bxmVar);
                bxmVar.m3166b();
                this.f4187a.mo2949a();
                return imageHeaderParser$ImageTypeMo2918c;
            } catch (Throwable th) {
                th = th;
                if (bxmVar != null) {
                    bxmVar.m3166b();
                }
                this.f4187a.mo2949a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bxmVar = null;
        }
    }
}
