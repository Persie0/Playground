package p011aa;

import android.support.v4.media.AbstractC0140a;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import p357r6.C8739a;
import p482xd.C10170b;
import p529z9.C10463c;

/* JADX INFO: renamed from: aa.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0052a extends AbstractC0140a {
    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: p */
    public final Metadata mo211p(C10463c c10463c, ByteBuffer byteBuffer) {
        if (byteBuffer.get() != 116) {
            return null;
        }
        C8739a c8739a = new C8739a(byteBuffer.array(), byteBuffer.limit());
        c8739a.m16976m(12);
        int iM16967d = (c8739a.m16967d() + c8739a.m16970g(12)) - 4;
        c8739a.m16976m(44);
        c8739a.m16977n(c8739a.m16970g(12));
        c8739a.m16976m(16);
        ArrayList arrayList = new ArrayList();
        while (c8739a.m16967d() < iM16967d) {
            c8739a.m16976m(48);
            int iM16970g = c8739a.m16970g(8);
            c8739a.m16976m(4);
            int iM16967d2 = c8739a.m16967d() + c8739a.m16970g(12);
            String str = null;
            String str2 = null;
            while (c8739a.m16967d() < iM16967d2) {
                int iM16970g2 = c8739a.m16970g(8);
                int iM16970g3 = c8739a.m16970g(8);
                int iM16967d3 = c8739a.m16967d() + iM16970g3;
                if (iM16970g2 == 2) {
                    int iM16970g4 = c8739a.m16970g(16);
                    c8739a.m16976m(8);
                    if (iM16970g4 == 3) {
                        while (c8739a.m16967d() < iM16967d3) {
                            int iM16970g5 = c8739a.m16970g(8);
                            Charset charset = C10170b.f51475a;
                            byte[] bArr = new byte[iM16970g5];
                            c8739a.m16972i(bArr, iM16970g5);
                            str = new String(bArr, charset);
                            int iM16970g6 = c8739a.m16970g(8);
                            for (int i10 = 0; i10 < iM16970g6; i10++) {
                                c8739a.m16977n(c8739a.m16970g(8));
                            }
                        }
                    }
                } else if (iM16970g2 == 21) {
                    Charset charset2 = C10170b.f51475a;
                    byte[] bArr2 = new byte[iM16970g3];
                    c8739a.m16972i(bArr2, iM16970g3);
                    str2 = new String(bArr2, charset2);
                }
                c8739a.m16974k(iM16967d3 * 8);
            }
            c8739a.m16974k(iM16967d2 * 8);
            if (str != null && str2 != null) {
                arrayList.add(new AppInfoTable(str.concat(str2), iM16970g));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }
}
