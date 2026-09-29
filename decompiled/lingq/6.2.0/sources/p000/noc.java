package p000;

import com.google.android.gms.internal.vision.AbstractC1034s;
import com.google.android.gms.internal.vision.zzjk;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public abstract class noc {

    /* JADX INFO: renamed from: a */
    public static final Charset f53082a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b */
    public static final byte[] f53083b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f53083b = bArr;
        ByteBuffer.wrap(bArr);
        int length = bArr.length;
        try {
            if (length < 0) {
                throw zzjk.m5836b();
            }
            if (length > Integer.MAX_VALUE) {
                throw zzjk.m5835a();
            }
        } catch (zzjk e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m17574a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC1034s m17575b(Object obj, Object obj2) {
        AbstractC1034s abstractC1034s = (AbstractC1034s) ((gfc) obj);
        rnc rncVar = (rnc) abstractC1034s.mo5699e(5);
        rncVar.m20721a(abstractC1034s);
        gfc gfcVar = (gfc) obj2;
        if (rncVar.f59599a.getClass().isInstance(gfcVar)) {
            rncVar.m20721a((AbstractC1034s) gfcVar);
            return rncVar.m20724e();
        }
        C3386nv.m17626m("mergeFrom(MessageLite) can only merge messages of the same type.");
        return null;
    }
}
