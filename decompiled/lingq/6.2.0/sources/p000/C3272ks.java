package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: ks */
/* JADX INFO: loaded from: classes2.dex */
public final class C3272ks extends h3d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48373a;

    public /* synthetic */ C3272ks(int i) {
        this.f48373a = i;
    }

    @Override // p000.h3d
    /* JADX INFO: renamed from: b */
    public final ey5 mo13039b(jy5 jy5Var, ByteBuffer byteBuffer) {
        switch (this.f48373a) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                so0 so0Var = new so0(byteBuffer.limit(), byteBuffer.array());
                so0Var.m21511o(12);
                int iM21500d = (so0Var.m21500d() + so0Var.m21503g(12)) - 4;
                so0Var.m21511o(44);
                so0Var.m21512p(so0Var.m21503g(12));
                so0Var.m21511o(16);
                ArrayList arrayList = new ArrayList();
                while (so0Var.m21500d() < iM21500d) {
                    so0Var.m21511o(48);
                    int iM21503g = so0Var.m21503g(8);
                    so0Var.m21511o(4);
                    int iM21500d2 = so0Var.m21500d() + so0Var.m21503g(12);
                    String str = null;
                    String str2 = null;
                    while (so0Var.m21500d() < iM21500d2) {
                        int iM21503g2 = so0Var.m21503g(8);
                        int iM21503g3 = so0Var.m21503g(8);
                        int iM21500d3 = so0Var.m21500d() + iM21503g3;
                        if (iM21503g2 == 2) {
                            int iM21503g4 = so0Var.m21503g(16);
                            so0Var.m21511o(8);
                            if (iM21503g4 == 3) {
                                while (so0Var.m21500d() < iM21500d3) {
                                    int iM21503g5 = so0Var.m21503g(8);
                                    Charset charset = StandardCharsets.US_ASCII;
                                    byte[] bArr = new byte[iM21503g5];
                                    so0Var.m21506j(iM21503g5, bArr);
                                    String str3 = new String(bArr, charset);
                                    int iM21503g6 = so0Var.m21503g(8);
                                    for (int i = 0; i < iM21503g6; i++) {
                                        so0Var.m21512p(so0Var.m21503g(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (iM21503g2 == 21) {
                            Charset charset2 = StandardCharsets.US_ASCII;
                            byte[] bArr2 = new byte[iM21503g3];
                            so0Var.m21506j(iM21503g3, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        so0Var.m21509m(iM21500d3 * 8);
                    }
                    so0Var.m21509m(iM21500d2 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new C3158js(iM21503g, str.concat(str2)));
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new ey5(arrayList);
            default:
                k47 k47Var = new k47(byteBuffer.limit(), byteBuffer.array());
                String strM14837u = k47Var.m14837u();
                strM14837u.getClass();
                String strM14837u2 = k47Var.m14837u();
                strM14837u2.getClass();
                return new ey5(new eu2(strM14837u, strM14837u2, k47Var.m14836t(), k47Var.m14836t(), Arrays.copyOfRange(k47Var.f46700a, k47Var.f46701b, k47Var.f46702c)));
        }
    }
}
