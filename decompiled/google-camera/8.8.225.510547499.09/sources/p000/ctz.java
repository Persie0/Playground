package p000;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ctz implements kbg {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f9563a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f9564b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f9565c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f9566d;

    public /* synthetic */ ctz(cce cceVar, PointF pointF, RectF rectF, int i) {
        this.f9566d = i;
        this.f9564b = cceVar;
        this.f9563a = pointF;
        this.f9565c = rectF;
    }

    public /* synthetic */ ctz(csl cslVar, kfk kfkVar, csn csnVar, int i) {
        this.f9566d = i;
        this.f9563a = cslVar;
        this.f9564b = kfkVar;
        this.f9565c = csnVar;
    }

    public /* synthetic */ ctz(fna fnaVar, chw chwVar, ikw ikwVar, int i) {
        this.f9566d = i;
        this.f9565c = fnaVar;
        this.f9563a = chwVar;
        this.f9564b = ikwVar;
    }

    public /* synthetic */ ctz(glu gluVar, dhv dhvVar, kfk kfkVar, int i) {
        this.f9566d = i;
        this.f9565c = gluVar;
        this.f9563a = dhvVar;
        this.f9564b = kfkVar;
    }

    public /* synthetic */ ctz(AtomicReference atomicReference, jwn jwnVar, jvd jvdVar, int i) {
        this.f9566d = i;
        this.f9564b = atomicReference;
        this.f9565c = jwnVar;
        this.f9563a = jvdVar;
    }

    public /* synthetic */ ctz(Predicate predicate, gfa gfaVar, gev gevVar, int i) {
        this.f9566d = i;
        this.f9564b = predicate;
        this.f9565c = gfaVar;
        this.f9563a = gevVar;
    }

    public /* synthetic */ ctz(kfk kfkVar, csl cslVar, csn csnVar, int i) {
        this.f9566d = i;
        this.f9564b = kfkVar;
        this.f9563a = cslVar;
        this.f9565c = csnVar;
    }

    public /* synthetic */ ctz(oju ojuVar, jwn jwnVar, kce kceVar, int i) {
        this.f9566d = i;
        this.f9564b = ojuVar;
        this.f9563a = jwnVar;
        this.f9565c = kceVar;
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kfk] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.function.Predicate] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kfk] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r2v30, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object, kce] */
    /* JADX WARN: Type inference failed for: r2v7, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object, kfk] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // p000.kbg
    /* JADX INFO: renamed from: bf */
    public final void mo3415bf(Object obj) {
        switch (this.f9566d) {
            case 0:
                Object obj2 = this.f9563a;
                ?? r1 = this.f9564b;
                Object obj3 = this.f9565c;
                csl cslVar = (csl) obj2;
                if (((Boolean) ((jwf) cslVar.f9278h).f34942d).booleanValue()) {
                    dfn.m6063f(r1, cslVar, (csn) obj3);
                }
                break;
            case 1:
                Object obj4 = this.f9564b;
                Object obj5 = this.f9563a;
                Object obj6 = this.f9565c;
                cdg cdgVar = (cdg) obj;
                cce cceVar = (cce) obj4;
                if (((Float) cceVar.f5109a.mo3831be()).floatValue() == 1.0f) {
                    PointF pointF = (PointF) obj5;
                    RectF rectF = (RectF) obj6;
                    cceVar.f5110b.mo8144S(new ili(pointF.x - rectF.left, pointF.y - rectF.top, rectF.width(), rectF.height()), cdgVar.equals(cdg.AE_AF_LOCKED));
                }
                break;
            case 2:
                ?? r0 = this.f9564b;
                Object obj7 = this.f9563a;
                Object obj8 = this.f9565c;
                if (((Boolean) obj).booleanValue()) {
                    dfn.m6063f(r0, (csl) obj7, (csn) obj8);
                }
                break;
            case 3:
                ?? r2 = this.f9564b;
                ?? r3 = this.f9565c;
                Object obj9 = this.f9563a;
                if (r2.test(r3)) {
                    r3.mo9129o(false, (gev) obj9);
                }
                break;
            case 4:
                Object obj10 = this.f9564b;
                ?? r4 = this.f9565c;
                ?? r5 = this.f9563a;
                if (!((Boolean) obj).booleanValue()) {
                    AtomicReference atomicReference = (AtomicReference) obj10;
                    if (atomicReference.get() != null) {
                        ((kba) atomicReference.get()).close();
                    }
                    nxy nxyVar = nss.f44437b.f44439a;
                    if (!nxyVar.isEmpty()) {
                        nsr nsrVar = (nsr) nxyVar.get(0);
                        nsu nsuVar = nsrVar.f44432b;
                        if (nsuVar == null) {
                            nsuVar = nsu.f44448c;
                        }
                        nst nstVar = nsuVar.f44451b;
                        if (nstVar == null) {
                            nstVar = nst.f44441e;
                        }
                        int i = nstVar.f44443a;
                        nsu nsuVar2 = nsrVar.f44432b;
                        nst nstVar2 = (nsuVar2 == null ? nsu.f44448c : nsuVar2).f44451b;
                        if (nstVar2 == null) {
                            nstVar2 = nst.f44441e;
                        }
                        int i2 = nstVar2.f44444b;
                        nst nstVar3 = (nsuVar2 == null ? nsu.f44448c : nsuVar2).f44451b;
                        if (nstVar3 == null) {
                            nstVar3 = nst.f44441e;
                        }
                        int i3 = nstVar3.f44443a;
                        nst nstVar4 = (nsuVar2 == null ? nsu.f44448c : nsuVar2).f44451b;
                        if (nstVar4 == null) {
                            nstVar4 = nst.f44441e;
                        }
                        int i4 = i3 + nstVar4.f44445c;
                        nst nstVar5 = (nsuVar2 == null ? nsu.f44448c : nsuVar2).f44451b;
                        if (nstVar5 == null) {
                            nstVar5 = nst.f44441e;
                        }
                        int i5 = nstVar5.f44444b;
                        if (nsuVar2 == null) {
                            nsuVar2 = nsu.f44448c;
                        }
                        nst nstVar6 = nsuVar2.f44451b;
                        if (nstVar6 == null) {
                            nstVar6 = nst.f44441e;
                        }
                        new Rect(i, i2, i4, i5 + nstVar6.f44446d);
                    }
                } else {
                    ((AtomicReference) obj10).set(r4.mo3830a(new kbg() { // from class: fmn
                        @Override // p000.kbg
                        /* JADX INFO: renamed from: bf */
                        public final void mo3415bf(Object obj11) {
                        }
                    }, r5));
                }
                break;
            case 5:
                Object obj11 = this.f9565c;
                Object obj12 = this.f9563a;
                Object obj13 = this.f9564b;
                Integer num = (Integer) obj;
                fna fnaVar = (fna) obj11;
                if (num.intValue() != fnaVar.f22764a) {
                    fnaVar.f22764a = num.intValue();
                    fnaVar.m8601a((chw) obj12, (ikw) obj13);
                    break;
                }
                break;
            case 6:
                Object obj14 = this.f9565c;
                Object obj15 = this.f9563a;
                Object obj16 = this.f9564b;
                hyd hydVar = (hyd) obj;
                hye hyeVar = hydVar.f29901a;
                if (hyeVar == hye.UNKNOWN) {
                    ((fna) obj14).f22768e = hydVar;
                    break;
                } else {
                    chw chwVar = (chw) obj15;
                    if (chwVar.f5764a) {
                        fna fnaVar2 = (fna) obj14;
                        if (fnaVar2.f22768e.f29901a != hyeVar) {
                            fnaVar2.f22768e = hydVar;
                            fnaVar2.m8601a(chwVar, (ikw) obj16);
                            break;
                        }
                    }
                }
                break;
            case 7:
                Object obj17 = this.f9565c;
                Object obj18 = this.f9563a;
                Object obj19 = this.f9564b;
                Boolean bool = (Boolean) obj;
                chw chwVar2 = (chw) obj18;
                if (chwVar2.f5764a) {
                    fna fnaVar3 = (fna) obj17;
                    if (fnaVar3.f22767d != bool.booleanValue()) {
                        fnaVar3.f22767d = bool.booleanValue();
                        fnaVar3.m8601a(chwVar2, (ikw) obj19);
                        break;
                    }
                }
                break;
            case 8:
                Object obj20 = this.f9565c;
                Object obj21 = this.f9563a;
                Object obj22 = this.f9564b;
                Integer num2 = (Integer) obj;
                fna fnaVar4 = (fna) obj20;
                if (num2.intValue() != fnaVar4.f22765b) {
                    fnaVar4.f22765b = num2.intValue();
                    fnaVar4.m8601a((chw) obj21, (ikw) obj22);
                    break;
                }
                break;
            case 9:
                Object obj23 = this.f9565c;
                Object obj24 = this.f9563a;
                Object obj25 = this.f9564b;
                Integer num3 = (Integer) obj;
                fna fnaVar5 = (fna) obj23;
                if (num3.intValue() != fnaVar5.f22766c) {
                    fnaVar5.f22766c = num3.intValue();
                    fnaVar5.m8601a((chw) obj24, (ikw) obj25);
                    break;
                }
                break;
            case 10:
                Object obj26 = this.f9565c;
                Object obj27 = this.f9563a;
                Object obj28 = this.f9564b;
                Integer num4 = (Integer) obj;
                fna fnaVar6 = (fna) obj26;
                if (num4.intValue() != fnaVar6.f22764a) {
                    fnaVar6.f22764a = num4.intValue();
                    fnaVar6.m8601a((chw) obj27, (ikw) obj28);
                    break;
                }
                break;
            case 11:
                Object obj29 = this.f9565c;
                ?? r6 = this.f9563a;
                ?? r7 = this.f9564b;
                List list = (List) obj;
                glt gltVar = (glt) list.get(0);
                float fFloatValue = ((Float) list.get(1)).floatValue();
                if (ivu.f32374b != null && ((glu) obj29).mo9467k()) {
                    ArrayList arrayList = new ArrayList();
                    Float fValueOf = Float.valueOf(0.0f);
                    arrayList.add(fValueOf);
                    arrayList.add(Float.valueOf(gltVar.f25532a));
                    arrayList.add(Float.valueOf(gltVar.f25533b));
                    if (true != r6.mo6183k(dho.f11142b)) {
                        fFloatValue = -1.0f;
                    }
                    arrayList.add(Float.valueOf(fFloatValue));
                    arrayList.add(fValueOf);
                    arrayList.add(Float.valueOf(gltVar.f25534c));
                    r7.mo14123j(mxk.m17137I(kgq.m14215e(ivu.f32374b, kxk.m14990ah(arrayList)), kgq.m14215e(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(gltVar.f25535d))));
                    break;
                }
                break;
            default:
                ?? r8 = this.f9564b;
                ?? r9 = this.f9563a;
                ?? r10 = this.f9565c;
                mxk mxkVar = ((kho) ((gmo) r8.get()).mo6051a()).f36067c;
                r9.mo3831be();
                r10.mo13955c(((Boolean) obj).booleanValue() ? 1 : 0);
                break;
        }
    }
}
