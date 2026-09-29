package p000;

import com.google.android.gms.internal.measurement.zzbk;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzao;
import com.google.android.gms.internal.mlkit_vision_text_common.zzcw;
import com.google.android.gms.internal.vision.C1031p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class dnb {
    /* JADX INFO: renamed from: a */
    public static int m10500a(int i, int i2, int i3) {
        return C1031p.m5725t(i) + i2 + i3;
    }

    /* JADX INFO: renamed from: b */
    public static int m10501b(int i, int i2, int i3, int i4) {
        return C1031p.m5725t(i) + i2 + i3 + i4;
    }

    /* JADX INFO: renamed from: c */
    public static c33 m10502c(int i, zzao zzaoVar, bl2 bl2Var) {
        bl2Var.m3844Z(new zlb(i, zzaoVar));
        return bl2Var.m3858o();
    }

    /* JADX INFO: renamed from: d */
    public static c33 m10503d(int i, zzcw zzcwVar, bl2 bl2Var) {
        bl2Var.m3844Z(new rub(i, zzcwVar));
        return bl2Var.m3858o();
    }

    /* JADX INFO: renamed from: e */
    public static Object m10504e(zzbk zzbkVar, int i, ArrayList arrayList, int i2) {
        qdd.m19875b(i, zzbkVar.name(), arrayList);
        return arrayList.get(i2);
    }

    /* JADX INFO: renamed from: f */
    public static HashMap m10505f(Class cls, lhb lhbVar) {
        HashMap map = new HashMap();
        map.put(cls, lhbVar);
        return map;
    }

    /* JADX INFO: renamed from: g */
    public static HashMap m10506g(Class cls, rub rubVar) {
        HashMap map = new HashMap();
        map.put(cls, rubVar);
        return map;
    }

    /* JADX INFO: renamed from: h */
    public static void m10507h(HashMap map) {
        Collections.unmodifiableMap(new HashMap(map));
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m10508i(e9c e9cVar) {
        if (e9cVar == null) {
            return;
        }
        ho2.m13383c();
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ boolean m10509j(AtomicReferenceArray atomicReferenceArray, i6d i6dVar) {
        while (!atomicReferenceArray.compareAndSet(2, null, i6dVar)) {
            if (atomicReferenceArray.get(2) != null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public static int m10510k(int i, int i2, int i3) {
        return (C1031p.m5718m(i) * i2) + i3;
    }
}
