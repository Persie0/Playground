package androidx.media3.container;

import java.nio.ByteBuffer;
import p000.bna;
import p000.so0;
import p000.tp6;

/* JADX INFO: renamed from: androidx.media3.container.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C0714a {

    /* JADX INFO: renamed from: a */
    public final boolean f6420a;

    public C0714a(C0715b c0715b, tp6 tp6Var) throws ObuParser$NotYetImplementedException {
        int i = tp6Var.f62698a;
        ByteBuffer byteBuffer = tp6Var.f62699b;
        bna.m3969q(i == 6 || i == 3);
        int iMin = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        so0 so0Var = new so0(iMin, bArr);
        if (c0715b.f6421a) {
            throw new ObuParser$NotYetImplementedException();
        }
        if (so0Var.m21502f()) {
            this.f6420a = false;
            return;
        }
        int iM21503g = so0Var.m21503g(2);
        boolean zM21502f = so0Var.m21502f();
        if (c0715b.f6422b) {
            throw new ObuParser$NotYetImplementedException();
        }
        if (!zM21502f) {
            this.f6420a = true;
            return;
        }
        boolean zM21502f2 = (iM21503g == 3 || iM21503g == 0) ? true : so0Var.m21502f();
        so0Var.m21510n();
        if (!c0715b.f6424d) {
            throw new ObuParser$NotYetImplementedException();
        }
        if (so0Var.m21502f()) {
            if (!c0715b.f6425e) {
                throw new ObuParser$NotYetImplementedException();
            }
            so0Var.m21510n();
        }
        if (c0715b.f6423c) {
            throw new ObuParser$NotYetImplementedException();
        }
        if (iM21503g != 3) {
            so0Var.m21510n();
        }
        so0Var.m21511o(c0715b.f6426f);
        if (iM21503g != 2 && iM21503g != 0 && !zM21502f2) {
            so0Var.m21511o(3);
        }
        this.f6420a = ((iM21503g == 3 || iM21503g == 0) ? 255 : so0Var.m21503g(8)) != 0;
    }

    /* JADX INFO: renamed from: b */
    public static C0714a m2522b(C0715b c0715b, tp6 tp6Var) {
        try {
            return new C0714a(c0715b, tp6Var);
        } catch (ObuParser$NotYetImplementedException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2523a() {
        return this.f6420a;
    }
}
