package p000;

import com.google.android.apps.camera.jni.microvideotonemap.yUpa.qQLA;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class nfp {

    /* JADX INFO: renamed from: e */
    public static final nfp f42200e;

    static {
        nfk nfkVar = new nfk("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray());
        new nfo(nfkVar, '=');
        lku.m15669w(nfkVar.f42186b.length == 64);
        nfk nfkVar2 = new nfk("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".toCharArray());
        new nfo(nfkVar2, '=');
        lku.m15669w(nfkVar2.f42186b.length == 64);
        new nfo("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new nfo("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        f42200e = new nfl(new nfk(qQLA.ofoC, "0123456789ABCDEF".toCharArray()));
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo17449a(byte[] bArr, CharSequence charSequence);

    /* JADX INFO: renamed from: b */
    public abstract void mo17450b(Appendable appendable, byte[] bArr, int i);

    /* JADX INFO: renamed from: c */
    public abstract int mo17451c(int i);

    /* JADX INFO: renamed from: d */
    public abstract int mo17452d(int i);

    /* JADX INFO: renamed from: e */
    public CharSequence mo17453e(CharSequence charSequence) {
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public final String m17454f(byte[] bArr) {
        int length = bArr.length;
        lku.m15612G(0, length, length);
        StringBuilder sb = new StringBuilder(mo17452d(length));
        try {
            mo17450b(sb, bArr, length);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: g */
    public final byte[] m17455g(CharSequence charSequence) {
        try {
            CharSequence charSequenceMo17453e = mo17453e(charSequence);
            int iMo17451c = mo17451c(charSequenceMo17453e.length());
            byte[] bArr = new byte[iMo17451c];
            int iMo17449a = mo17449a(bArr, charSequenceMo17453e);
            if (iMo17449a == iMo17451c) {
                return bArr;
            }
            byte[] bArr2 = new byte[iMo17449a];
            System.arraycopy(bArr, 0, bArr2, 0, iMo17449a);
            return bArr2;
        } catch (nfm e) {
            throw new IllegalArgumentException(e);
        }
    }
}
