package com.lingq.core.p012ui.dragdrop;

import androidx.compose.foundation.lazy.C0127b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.cd4;
import p000.gq6;
import p000.iv4;
import p000.kg7;
import p000.og7;
import p000.qc9;
import p000.t66;
import p000.u91;
import p000.un1;
import p000.wfb;
import p000.xc9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.core.ui.dragdrop.a */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1918a implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1919b f23965a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Ref$ObjectRef f23966b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ un1 f23967c;

    public /* synthetic */ C1918a(C1919b c1919b, Ref$ObjectRef ref$ObjectRef, og7 og7Var, un1 un1Var) {
        this.f23965a = c1919b;
        this.f23966b = ref$ObjectRef;
        this.f23967c = un1Var;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x013f  */
    /* JADX WARN: Code duplicated, block: B:64:0x018c  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ae  */
    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        float f;
        float fFloatValue;
        Float fValueOf;
        iv4 iv4Var;
        Object next;
        kg7 kg7Var = (kg7) obj;
        kg7Var.getClass();
        kg7Var.m15189a();
        long j = ((gq6) obj2).f41189a;
        C1919b c1919b = this.f23965a;
        C0127b c0127b = c1919b.f23968a;
        qc9 qc9Var = c1919b.f23971d;
        qc9Var.m19862i(Float.intBitsToFloat((int) (j & 4294967295L)) + qc9Var.m19861h());
        t66 t66Var = c1919b.f23975h;
        iv4 iv4Var2 = (iv4) ((xc9) t66Var).getValue();
        Pair pair = iv4Var2 != null ? new Pair(Integer.valueOf(iv4Var2.f44662o), Integer.valueOf(iv4Var2.f44662o + iv4Var2.f44663p)) : null;
        if (pair != null) {
            int iIntValue = ((Number) pair.f47623a).intValue();
            int iIntValue2 = ((Number) pair.f47624b).intValue();
            float fM19861h = qc9Var.m19861h() + iIntValue;
            float fM19861h2 = qc9Var.m19861h() + iIntValue2;
            Integer numM8797a = c1919b.m8797a();
            if (numM8797a != null) {
                int iIntValue3 = numM8797a.intValue();
                c0127b.getClass();
                iv4Var = (iv4) u91.m22592J0(iIntValue3 - ((iv4) u91.m22589G0(c0127b.m980j().f42985k)).f44648a, c0127b.m980j().f42985k);
            } else {
                iv4Var = null;
            }
            if (iv4Var != null) {
                List list = c0127b.m980j().f42985k;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    iv4 iv4Var3 = (iv4) obj3;
                    iv4Var3.getClass();
                    int i = iv4Var3.f44662o;
                    if (iv4Var3.f44663p + i >= fM19861h && i <= fM19861h2 && iv4Var.f44648a != iv4Var3.f44648a) {
                        arrayList.add(obj3);
                    }
                }
                f = 0.0f;
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    iv4 iv4Var4 = (iv4) next;
                    if (fM19861h - iv4Var.f44662o <= 0.0f) {
                        if (fM19861h < iv4Var4.f44662o) {
                            break;
                        }
                    } else {
                        iv4Var4.getClass();
                        if (fM19861h2 > iv4Var4.f44662o + iv4Var4.f44663p) {
                            break;
                        }
                    }
                }
                iv4 iv4Var5 = (iv4) next;
                if (iv4Var5 != null) {
                    int i2 = iv4Var5.f44648a;
                    Integer numM8797a2 = c1919b.m8797a();
                    if (numM8797a2 != null) {
                        int iIntValue4 = numM8797a2.intValue() - 1;
                        if (iIntValue4 < 0) {
                            iIntValue4 = 0;
                        }
                        int i3 = i2 - 1;
                        int i4 = i3 >= 0 ? i3 : 0;
                        if (iIntValue4 != i4) {
                            wfb.m23926u(c1919b.f23969b, null, null, new DragDropState$onDrag$1$1$3$1$1(c1919b, iIntValue4, i4, null), 3);
                            ((xc9) c1919b.f23976i).setValue(Integer.valueOf(i2));
                        }
                    } else {
                        ((xc9) c1919b.f23976i).setValue(Integer.valueOf(i2));
                    }
                }
            } else {
                f = 0.0f;
            }
        } else {
            f = 0.0f;
        }
        Ref$ObjectRef ref$ObjectRef = this.f23966b;
        cd4 cd4Var = (cd4) ref$ObjectRef.f47718a;
        if (cd4Var == null || !cd4Var.mo4538b()) {
            C0127b c0127b2 = c1919b.f23968a;
            iv4 iv4Var6 = (iv4) ((xc9) t66Var).getValue();
            if (iv4Var6 != null) {
                float fM19861h3 = qc9Var.m19861h() + iv4Var6.f44662o;
                float fM19861h4 = qc9Var.m19861h() + iv4Var6.f44662o + iv4Var6.f44663p;
                if (qc9Var.m19861h() > f) {
                    float f2 = (fM19861h4 - c0127b2.m980j().f42987m) + 50.0f;
                    fValueOf = Float.valueOf(f2);
                    if (f2 <= f) {
                        fValueOf = null;
                    }
                } else if (qc9Var.m19861h() < f) {
                    float f3 = (fM19861h3 - c0127b2.m980j().f42986l) - 50.0f;
                    fValueOf = Float.valueOf(f3);
                    if (f3 >= f) {
                        fValueOf = null;
                    }
                } else {
                    fValueOf = null;
                }
                if (fValueOf != null) {
                    fFloatValue = fValueOf.floatValue();
                } else {
                    fFloatValue = f;
                }
            } else {
                fFloatValue = f;
            }
            Float fValueOf2 = Float.valueOf(fFloatValue);
            if (fFloatValue == f) {
                fValueOf2 = null;
            }
            if (fValueOf2 != null) {
                ref$ObjectRef.f47718a = wfb.m23926u(this.f23967c, null, null, new DragAndDropExtensionsKt$detectDrag$2$4$2$1(c1919b, fValueOf2.floatValue(), null), 3);
            } else {
                cd4 cd4Var2 = (cd4) ref$ObjectRef.f47718a;
                if (cd4Var2 != null) {
                    cd4Var2.mo4537a(null);
                }
            }
        }
        return xfa.f68157a;
    }
}
