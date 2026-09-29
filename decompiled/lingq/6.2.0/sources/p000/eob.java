package p000;

import android.os.SystemClock;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.mlkit_vision_document_scanner.C0969a;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzmx;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzmy;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zznt;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zznu;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzx;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class eob implements oz6 {

    /* JADX INFO: renamed from: f */
    public static boolean f37640f;

    /* JADX INFO: renamed from: g */
    public static int f37641g;

    /* JADX INFO: renamed from: a */
    public final eo3 f37642a;

    /* JADX INFO: renamed from: b */
    public final Feature[] f37643b;

    /* JADX INFO: renamed from: c */
    public final i3d f37644c;

    /* JADX INFO: renamed from: d */
    public final C0969a f37645d;

    /* JADX INFO: renamed from: e */
    public final ekd f37646e;

    public eob(eo3 eo3Var) {
        int i;
        C0969a c0969aM14530c = jkd.m14530c();
        ekd ekdVar = new ekd(g06.m12269c().m12272b(), 0);
        this.f37642a = eo3Var;
        b3d b3dVar = new b3d();
        b3dVar.f7886b = zzmx.MODE_AUTO;
        Boolean bool = Boolean.TRUE;
        b3dVar.f7887c = bool;
        b3dVar.f7888d = bool;
        b3dVar.f7896l = -1;
        b3dVar.f7895k = Boolean.valueOf(eo3Var.f37601b);
        b3dVar.f7897m = bool;
        b3dVar.f7890f = Boolean.valueOf(eo3Var.f37602c);
        boolean z = eo3Var.f37603d;
        b3dVar.f7893i = Boolean.valueOf(z);
        boolean z2 = eo3Var.f37604e;
        b3dVar.f7894j = Boolean.valueOf(z2);
        b3dVar.f7898n = Boolean.FALSE;
        b3dVar.f7899o = Boolean.valueOf(eo3Var.f37605f);
        Object[] objArrCopyOf = new Object[4];
        int[] iArr = eo3Var.f37600a;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            zzmy zzmyVar = i4 != 101 ? i4 != 102 ? zzmy.FORMAT_UNKNOWN : zzmy.FORMAT_PDF : zzmy.FORMAT_JPEG;
            zzmyVar.getClass();
            int length2 = objArrCopyOf.length;
            int i5 = i3 + 1;
            if (i5 < 0) {
                C3386nv.m17626m("cannot store more than Integer.MAX_VALUE elements");
                throw null;
            }
            if (i5 <= length2) {
                i = length2;
            } else {
                i = length2 + (length2 >> 1) + 1;
                if (i < i5) {
                    int iHighestOneBit = Integer.highestOneBit(i3);
                    i = iHighestOneBit + iHighestOneBit;
                }
                if (i < 0) {
                    i = Integer.MAX_VALUE;
                }
            }
            if (i > length2) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i);
            }
            objArrCopyOf[i3] = zzmyVar;
            i2++;
            i3 = i5;
        }
        b3dVar.f7891g = zzx.m5469j(objArrCopyOf, i3);
        b3dVar.f7892h = Boolean.FALSE;
        this.f37644c = new i3d(b3dVar);
        this.f37646e = ekdVar;
        this.f37645d = c0969aM14530c;
        kkd kkdVar = new kkd();
        kkdVar.f47464a = new Object[4];
        kkdVar.f47465b = 0;
        kkdVar.m15326a(pz6.f57048h);
        if (z) {
            kkdVar.m15326a(pz6.f57050j);
        }
        if (z2) {
            kkdVar.m15326a(pz6.f57049i);
        }
        kkdVar.f47466c = true;
        this.f37643b = (Feature[]) zzx.m5469j(kkdVar.f47464a, kkdVar.f47465b).toArray(new Feature[0]);
    }

    @Override // p000.oz6
    /* JADX INFO: renamed from: a */
    public final Feature[] mo11281a() {
        return this.f37643b;
    }

    /* JADX INFO: renamed from: b */
    public final void m11282b(zznt zzntVar, long j, long j2) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ca1 ca1Var = new ca1();
        C3329mb c3329mb = new C3329mb(20, false);
        c3329mb.f50861c = Long.valueOf((jElapsedRealtime - j) & Long.MAX_VALUE);
        c3329mb.f50862d = zzntVar;
        c3329mb.f50863e = this.f37644c;
        ca1Var.f9784d = new j9d(c3329mb);
        this.f37645d.m5463a(new cdb(ca1Var), zznu.ON_DEVICE_DOCUMENT_SCANNER_UI_FINISH);
        this.f37646e.m11214a(zzntVar.zza(), j2, jCurrentTimeMillis);
    }
}
