package p505ya;

import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.List;
import p385sf.C9000b;
import p479xa.C10148q;
import p479xa.C10151t;

/* JADX INFO: renamed from: ya.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10319a {

    /* JADX INFO: renamed from: a */
    public final List<byte[]> f51885a;

    /* JADX INFO: renamed from: b */
    public final int f51886b;

    /* JADX INFO: renamed from: c */
    public final int f51887c;

    /* JADX INFO: renamed from: d */
    public final int f51888d;

    /* JADX INFO: renamed from: e */
    public final float f51889e;

    /* JADX INFO: renamed from: f */
    public final String f51890f;

    public C10319a(ArrayList arrayList, int i10, int i11, int i12, float f3, String str) {
        this.f51885a = arrayList;
        this.f51886b = i10;
        this.f51887c = i11;
        this.f51888d = i12;
        this.f51889e = f3;
        this.f51890f = str;
    }

    /* JADX INFO: renamed from: a */
    public static C10319a m19319a(C10151t c10151t) throws ParserException {
        byte[] bArr;
        int i10;
        int i11;
        float f3;
        String strM17240f;
        try {
            c10151t.m19125F(4);
            int iM19145t = (c10151t.m19145t() & 3) + 1;
            if (iM19145t == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iM19145t2 = c10151t.m19145t() & 31;
            int i12 = 0;
            while (true) {
                bArr = C9000b.f47202g;
                if (i12 >= iM19145t2) {
                    break;
                }
                int iM19150y = c10151t.m19150y();
                int i13 = c10151t.f51439b;
                c10151t.m19125F(iM19150y);
                byte[] bArr2 = c10151t.f51438a;
                byte[] bArr3 = new byte[iM19150y + 4];
                System.arraycopy(bArr, 0, bArr3, 0, 4);
                System.arraycopy(bArr2, i13, bArr3, 4, iM19150y);
                arrayList.add(bArr3);
                i12++;
            }
            int iM19145t3 = c10151t.m19145t();
            for (int i14 = 0; i14 < iM19145t3; i14++) {
                int iM19150y2 = c10151t.m19150y();
                int i15 = c10151t.f51439b;
                c10151t.m19125F(iM19150y2);
                byte[] bArr4 = c10151t.f51438a;
                byte[] bArr5 = new byte[iM19150y2 + 4];
                System.arraycopy(bArr, 0, bArr5, 0, 4);
                System.arraycopy(bArr4, i15, bArr5, 4, iM19150y2);
                arrayList.add(bArr5);
            }
            if (iM19145t2 > 0) {
                C10148q.c cVarM19116d = C10148q.m19116d((byte[]) arrayList.get(0), iM19145t, ((byte[]) arrayList.get(0)).length);
                int i16 = cVarM19116d.f51419e;
                int i17 = cVarM19116d.f51420f;
                float f10 = cVarM19116d.f51421g;
                strM17240f = C9000b.m17240f(cVarM19116d.f51415a, cVarM19116d.f51416b, cVarM19116d.f51417c);
                i10 = i16;
                i11 = i17;
                f3 = f10;
            } else {
                i10 = -1;
                i11 = -1;
                f3 = 1.0f;
                strM17240f = null;
            }
            return new C10319a(arrayList, iM19145t, i10, i11, f3, strM17240f);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw ParserException.m6770a("Error parsing AVC config", e10);
        }
    }
}
