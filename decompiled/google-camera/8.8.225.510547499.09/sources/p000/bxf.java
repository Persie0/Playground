package p000;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bxf implements bqh {
    @Override // p000.bqh
    /* JADX INFO: renamed from: a */
    public final int mo2916a(InputStream inputStream, btg btgVar) throws Throwable {
        ajl ajlVar = new ajl(inputStream);
        ajj ajjVarM833a = ajlVar.m833a("Orientation");
        int iM811a = 1;
        if (ajjVarM833a != null) {
            try {
                iM811a = ajjVarM833a.m811a(ajlVar.f551i);
            } catch (NumberFormatException e) {
            }
        }
        if (iM811a == 0) {
            return -1;
        }
        return iM811a;
    }

    @Override // p000.bqh
    /* JADX INFO: renamed from: b */
    public final int mo2917b(ByteBuffer byteBuffer, btg btgVar) {
        return mo2916a(cav.m3362a(byteBuffer), btgVar);
    }

    @Override // p000.bqh
    /* JADX INFO: renamed from: c */
    public final ImageHeaderParser$ImageType mo2918c(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // p000.bqh
    /* JADX INFO: renamed from: d */
    public final ImageHeaderParser$ImageType mo2919d(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
