package p000;

import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gkz {

    /* JADX INFO: renamed from: a */
    public final Object f25432a;

    /* JADX INFO: renamed from: b */
    public final Object f25433b;

    /* JADX INFO: renamed from: c */
    public final Object f25434c;

    /* JADX INFO: renamed from: d */
    public final Object f25435d;

    /* JADX INFO: renamed from: e */
    public final Object f25436e;

    /* JADX INFO: renamed from: f */
    public final Object f25437f;

    /* JADX INFO: renamed from: g */
    public final Object f25438g;

    /* JADX INFO: renamed from: h */
    public final Object f25439h;

    /* JADX INFO: renamed from: i */
    public final Object f25440i;

    /* JADX INFO: renamed from: j */
    public final Object f25441j;

    /* JADX INFO: renamed from: k */
    public final Object f25442k;

    /* JADX INFO: renamed from: l */
    public final Object f25443l;

    /* JADX INFO: renamed from: m */
    public final Object f25444m;

    /* JADX INFO: renamed from: n */
    public final Object f25445n;

    /* JADX INFO: renamed from: o */
    public final Object f25446o;

    public gkz(jwn jwnVar, jwn jwnVar2, jww jwwVar, jwn jwnVar3, jww jwwVar2, jwn jwnVar4, jwn jwnVar5, hmw hmwVar, edk edkVar, dhv dhvVar, gcx gcxVar, jwn jwnVar6, ebv ebvVar, eby ebyVar, ikw ikwVar) {
        this.f25444m = jwnVar;
        this.f25440i = jwnVar2;
        this.f25435d = jwwVar;
        this.f25436e = jwnVar3;
        this.f25434c = jwwVar2;
        this.f25439h = jwnVar4;
        this.f25433b = jwnVar5;
        this.f25446o = dhvVar;
        this.f25443l = gcxVar;
        this.f25442k = hmwVar;
        this.f25437f = edkVar;
        this.f25438g = jwnVar6;
        this.f25432a = ebvVar;
        this.f25445n = ebyVar;
        this.f25441j = ikwVar;
    }

    public gkz(kms kmsVar, dhv dhvVar, jww jwwVar, gdc gdcVar, jvd jvdVar, khb khbVar, hai haiVar, AccessibilityManager accessibilityManager, jww jwwVar2, Set set, Set set2, byte[] bArr) {
        this.f25439h = mwc.m17057v();
        this.f25436e = new ArrayList(10);
        this.f25440i = new ArrayList(10);
        this.f25435d = new HashSet();
        this.f25433b = kmsVar;
        this.f25432a = dhvVar;
        this.f25441j = jwwVar;
        this.f25445n = gdcVar;
        this.f25443l = jvdVar;
        this.f25444m = khbVar;
        this.f25437f = haiVar;
        this.f25446o = accessibilityManager;
        this.f25442k = jwwVar2;
        this.f25438g = set;
        this.f25434c = set2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:7:0x008c  */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r1v8, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r2v4, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, jwn] */
    /* JADX INFO: renamed from: a */
    public final ebn m9396a() {
        boolean z;
        boolean z2;
        gzl gzlVar = (gzl) this.f25444m.mo3831be();
        boolean zBooleanValue = ((Boolean) this.f25440i.mo3831be()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) this.f25435d.mo3831be()).booleanValue();
        int iIntValue = ((Integer) this.f25446o.mo6173a(dip.f11685a).get()).intValue();
        boolean zBooleanValue3 = ((Boolean) this.f25434c.mo3831be()).booleanValue();
        boolean zMo6184l = this.f25446o.mo6184l(dib.f11297bD);
        gcy gcyVar = (gcy) ((jxc) this.f25443l).mo3831be();
        boolean zBooleanValue4 = ((Boolean) this.f25433b.mo3831be()).booleanValue();
        if (((Boolean) ((hmw) this.f25442k).m10476a().mo3831be()).booleanValue()) {
            if (((edk) this.f25437f).equals(edk.REGULAR)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        boolean zBooleanValue5 = ((Boolean) this.f25439h.mo3831be()).booleanValue();
        boolean z3 = (this.f25437f == edk.LONG_EXPOSURE || ((Boolean) ((eby) this.f25445n).f13316b.mo3831be()).booleanValue()) && !((eby) this.f25445n).m7100k();
        if (z3) {
            if (((ebv) this.f25432a).m7086e((cle) this.f25438g.mo3831be())) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        return new ebn(gzlVar, zBooleanValue, zBooleanValue2, iIntValue != 0, zBooleanValue3, zMo6184l, gcyVar, zBooleanValue4, z, zBooleanValue5, z3, z2, ((ikw) this.f25441j).equals(ikw.LONG_EXPOSURE));
    }

    public gkz(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, oju ojuVar13, oju ojuVar14, oju ojuVar15) {
        ojuVar.getClass();
        this.f25432a = ojuVar;
        ojuVar2.getClass();
        this.f25433b = ojuVar2;
        ojuVar3.getClass();
        this.f25434c = ojuVar3;
        ojuVar4.getClass();
        this.f25435d = ojuVar4;
        ojuVar5.getClass();
        this.f25436e = ojuVar5;
        ojuVar6.getClass();
        this.f25437f = ojuVar6;
        ojuVar7.getClass();
        this.f25438g = ojuVar7;
        ojuVar8.getClass();
        this.f25439h = ojuVar8;
        ojuVar9.getClass();
        this.f25440i = ojuVar9;
        ojuVar10.getClass();
        this.f25441j = ojuVar10;
        ojuVar11.getClass();
        this.f25442k = ojuVar11;
        ojuVar12.getClass();
        this.f25443l = ojuVar12;
        ojuVar13.getClass();
        this.f25444m = ojuVar13;
        ojuVar14.getClass();
        this.f25445n = ojuVar14;
        ojuVar15.getClass();
        this.f25446o = ojuVar15;
    }
}
