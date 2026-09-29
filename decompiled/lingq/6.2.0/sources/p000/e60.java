package p000;

import androidx.media3.common.ParserException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class e60 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f36733a;

    /* JADX INFO: renamed from: b */
    public final int f36734b;

    /* JADX INFO: renamed from: c */
    public final int f36735c;

    /* JADX INFO: renamed from: d */
    public final int f36736d;

    /* JADX INFO: renamed from: e */
    public final int f36737e;

    /* JADX INFO: renamed from: f */
    public final int f36738f;

    /* JADX INFO: renamed from: g */
    public final int f36739g;

    /* JADX INFO: renamed from: h */
    public final int f36740h;

    /* JADX INFO: renamed from: i */
    public final int f36741i;

    /* JADX INFO: renamed from: j */
    public final int f36742j;

    /* JADX INFO: renamed from: k */
    public final float f36743k;

    /* JADX INFO: renamed from: l */
    public final String f36744l;

    public e60(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.f36733a = arrayList;
        this.f36734b = i;
        this.f36735c = i2;
        this.f36736d = i3;
        this.f36737e = i4;
        this.f36738f = i5;
        this.f36739g = i6;
        this.f36740h = i7;
        this.f36741i = i8;
        this.f36742j = i9;
        this.f36743k = f;
        this.f36744l = str;
    }

    /* JADX INFO: renamed from: a */
    public static e60 m10863a(k47 k47Var) throws ParserException {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        try {
            k47Var.m14819N(4);
            int iM14842z = (k47Var.m14842z() & 3) + 1;
            if (iM14842z == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iM14842z2 = k47Var.m14842z() & 31;
            for (int i9 = 0; i9 < iM14842z2; i9++) {
                int iM14812G = k47Var.m14812G();
                int i10 = k47Var.f46701b;
                k47Var.m14819N(iM14812G);
                byte[] bArr = k47Var.f46700a;
                byte[] bArr2 = new byte[iM14812G + 4];
                System.arraycopy(m41.f50559a, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i10, bArr2, 4, iM14812G);
                arrayList.add(bArr2);
            }
            int iM14842z3 = k47Var.m14842z();
            for (int i11 = 0; i11 < iM14842z3; i11++) {
                int iM14812G2 = k47Var.m14812G();
                int i12 = k47Var.f46701b;
                k47Var.m14819N(iM14812G2);
                byte[] bArr3 = k47Var.f46700a;
                byte[] bArr4 = new byte[iM14812G2 + 4];
                System.arraycopy(m41.f50559a, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i12, bArr4, 4, iM14812G2);
                arrayList.add(bArr4);
            }
            if (iM14842z2 > 0) {
                m76 m76VarM25803k = zuc.m25803k((byte[]) arrayList.get(0), 4, ((byte[]) arrayList.get(0)).length);
                int i13 = m76VarM25803k.f50717e;
                int i14 = m76VarM25803k.f50718f;
                int i15 = m76VarM25803k.f50720h + 8;
                int i16 = m76VarM25803k.f50721i + 8;
                int i17 = m76VarM25803k.f50728p;
                int i18 = m76VarM25803k.f50729q;
                int i19 = m76VarM25803k.f50730r;
                int i20 = m76VarM25803k.f50731s;
                float f2 = m76VarM25803k.f50719g;
                int i21 = m76VarM25803k.f50713a;
                int i22 = m76VarM25803k.f50714b;
                int i23 = m76VarM25803k.f50715c;
                byte[] bArr5 = m41.f50559a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i21), Integer.valueOf(i22), Integer.valueOf(i23));
                i4 = i18;
                i5 = i19;
                i6 = i20;
                f = f2;
                i2 = i14;
                i3 = i15;
                i7 = i16;
                i8 = i17;
                i = i13;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = 16;
                f = 1.0f;
                i7 = -1;
                i8 = -1;
            }
            return new e60(arrayList, iM14842z, i, i2, i3, i7, i8, i4, i5, i6, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.m2516a(e, "Error parsing AVC config");
        }
    }
}
