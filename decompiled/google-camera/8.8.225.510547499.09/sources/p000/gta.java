package p000;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gta {

    /* JADX INFO: renamed from: a */
    private final float f26314a;

    /* JADX INFO: renamed from: b */
    private final float f26315b;

    /* JADX INFO: renamed from: c */
    private final boolean f26316c;

    /* JADX INFO: renamed from: d */
    private final boolean f26317d;

    public gta(boolean z, boolean z2, boolean z3) {
        this.f26316c = z;
        this.f26317d = z2;
        this.f26314a = true != z3 ? 4.666667f : 1.4f;
        this.f26315b = true != z3 ? 3.5f : 1.2727273f;
    }

    /* JADX INFO: renamed from: a */
    public final gtg m9729a(gth gthVar, Collection collection, boolean z) {
        float f;
        float f2;
        float fSqrt;
        float fMax;
        float fM9774c = guh.m9774c(gthVar, collection) * 5.0E-4f;
        if (this.f26316c) {
            Iterator it = collection.iterator();
            f = Float.MAX_VALUE;
            while (it.hasNext()) {
                gth gthVar2 = (gth) it.next();
                if (gthVar != gthVar2) {
                    mrm mrmVar = gthVar.f26354p;
                    mrm mrmVar2 = gthVar2.f26354p;
                    if ((mrmVar.mo16813g() || mrmVar2.mo16813g()) && mrmVar.mo16813g() && mrmVar2.mo16813g()) {
                        HashMap mapM9752a = gtf.m9752a(((gtt) mrmVar.mo16809c()).f26393a);
                        HashMap mapM9752a2 = gtf.m9752a(((gtt) mrmVar2.mo16809c()).f26393a);
                        if (!mapM9752a.keySet().equals(mapM9752a2.keySet()) || mapM9752a.isEmpty()) {
                            fMax = 10.0f;
                        } else {
                            fMax = 0.0f;
                            for (Integer num : mapM9752a.keySet()) {
                                ((List) mapM9752a.get(num)).getClass();
                                ((List) mapM9752a2.get(num)).getClass();
                                List list = (List) mapM9752a.get(num);
                                List list2 = (List) mapM9752a2.get(num);
                                lku.m15614I(list.size() == list2.size(), "The vector sizes are different.");
                                int size = list.size();
                                float f3 = 0.0f;
                                for (int i = 0; i <= size - 1; i++) {
                                    float fFloatValue = ((Float) list.get(i)).floatValue() - ((Float) list2.get(i)).floatValue();
                                    f3 += fFloatValue * fFloatValue;
                                }
                                fMax = Math.max(fMax, f3);
                            }
                        }
                    } else {
                        fMax = 10.0f;
                    }
                    if (fMax < f) {
                        f = fMax;
                    }
                }
            }
        } else {
            f = Float.MAX_VALUE;
        }
        float f4 = z ? this.f26315b : this.f26314a;
        if (this.f26317d) {
            Iterator it2 = collection.iterator();
            float f5 = Float.MAX_VALUE;
            while (it2.hasNext()) {
                gth gthVar3 = (gth) it2.next();
                if (gthVar != gthVar3) {
                    mrm mrmVar3 = gthVar.f26356r;
                    mrm mrmVar4 = gthVar3.f26356r;
                    if (mrmVar3.mo16813g() && mrmVar4.mo16813g()) {
                        float[] fArr = (float[]) mrmVar3.mo16809c();
                        float[] fArr2 = (float[]) mrmVar4.mo16809c();
                        int length = fArr.length;
                        lku.m15614I(length == fArr2.length, "The vector sizes are different.");
                        float f6 = 0.0f;
                        float f7 = 0.0f;
                        float f8 = 0.0f;
                        for (int i2 = 0; i2 < length; i2++) {
                            float f9 = fArr[i2];
                            float f10 = fArr2[i2];
                            f6 += f9 * f10;
                            f7 += f9 * f9;
                            f8 += f10 * f10;
                        }
                        fSqrt = 1.0f - (f6 / (((float) Math.sqrt(f7)) * ((float) Math.sqrt(f8))));
                    } else {
                        fSqrt = 10.0f;
                    }
                    if (fSqrt < f5) {
                        f5 = fSqrt;
                    }
                }
            }
            f2 = f5 * f4;
        } else {
            f2 = Float.MAX_VALUE;
        }
        float fM14987ae = kxk.m14987ae(fM9774c, f, f2);
        long j = gthVar.f26339a;
        return new gtg(fM14987ae, fM9774c);
    }
}
