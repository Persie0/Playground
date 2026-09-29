package p000;

import com.google.android.gms.internal.clearcut.AbstractC0949b;
import com.google.android.gms.internal.clearcut.zzco;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public abstract class btb {

    /* JADX INFO: renamed from: a */
    public static final Charset f8994a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b */
    public static final byte[] f8995b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f8995b = bArr;
        ByteBuffer.wrap(bArr);
        int length = bArr.length;
        try {
            if (length < 0) {
                throw new zzco("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if ((0 - 0) + length > Integer.MAX_VALUE) {
                throw zzco.m5346a();
            }
        } catch (zzco e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0949b m4167a(Object obj, Object obj2) {
        AbstractC0949b abstractC0949b = (AbstractC0949b) ((zmb) obj);
        tsb tsbVar = (tsb) abstractC0949b.mo5293a(5);
        tsbVar.m22294a(abstractC0949b);
        zmb zmbVar = (zmb) obj2;
        if (tsbVar.f62832a.getClass().isInstance(zmbVar)) {
            tsbVar.m22294a((AbstractC0949b) zmbVar);
            return tsbVar.m22296c();
        }
        C3386nv.m17626m("mergeFrom(MessageLite) can only merge messages of the same type.");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static int m4168b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
