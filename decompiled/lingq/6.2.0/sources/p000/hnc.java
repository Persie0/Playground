package p000;

import com.google.android.gms.internal.mlkit_vision_document_scanner.zzx;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class hnc {

    /* JADX INFO: renamed from: d */
    public static final hnc f42672d;

    /* JADX INFO: renamed from: e */
    public static final hnc f42673e;

    /* JADX INFO: renamed from: a */
    public final boolean f42674a;

    /* JADX INFO: renamed from: b */
    public final zzx f42675b;

    /* JADX INFO: renamed from: c */
    public final zzx f42676c;

    static {
        int i;
        dld dldVar = zzx.f12014b;
        f42672d = new hnc(false, zzx.m5469j(new Object[4], 0), zzx.m5469j(new Object[4], 0));
        Object[] objArrCopyOf = new Object[4];
        Object[] objArr = new Object[4];
        dec decVar = new dec();
        int length = objArrCopyOf.length;
        boolean z = true;
        int i2 = 0 + 1;
        if (i2 < 0) {
            C3386nv.m17626m("cannot store more than Integer.MAX_VALUE elements");
            return;
        }
        if (i2 <= length) {
            i = length;
        } else {
            i = (length >> 1) + length + 1;
            if (i < i2) {
                int iHighestOneBit = Integer.highestOneBit(0);
                i = iHighestOneBit + iHighestOneBit;
            }
            if (i < 0) {
                i = Integer.MAX_VALUE;
            }
        }
        if (i > length) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, i);
        }
        objArrCopyOf[0] = decVar;
        zzx.m5469j(objArrCopyOf, 0 + 1);
        zzx.m5469j(objArr, 0);
        f42673e = new hnc(z, zzx.m5469j(new Object[4], 0), zzx.m5469j(new Object[4], 0));
    }

    public /* synthetic */ hnc(boolean z, zzx zzxVar, zzx zzxVar2) {
        this.f42674a = z;
        this.f42675b = zzxVar;
        this.f42676c = zzxVar2;
    }
}
