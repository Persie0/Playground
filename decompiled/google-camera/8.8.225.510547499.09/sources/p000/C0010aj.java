package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: aj */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0010aj {

    /* JADX INFO: renamed from: a */
    public final ArrayList f478a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final void m795a(C0011ak c0011ak) {
        this.f478a.clear();
        for (int i = 1; i < c0011ak.f572e; i++) {
            C0012al c0012al = ((C0012al[]) c0011ak.f574g.f1685a)[i];
            for (int i2 = 0; i2 < 6; i2++) {
                c0012al.f615e[i2] = 0.0f;
            }
            c0012al.f615e[c0012al.f613c] = 1.0f;
            if (c0012al.f618h == 4) {
                this.f478a.add(c0012al);
            }
        }
        int size = this.f478a.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0012al c0012al2 = (C0012al) this.f478a.get(i3);
            int i4 = c0012al2.f612b;
            if (i4 != -1) {
                C0008ah c0008ah = c0011ak.f570c[i4].f399d;
                int i5 = c0008ah.f356a;
                for (int i6 = 0; i6 < i5; i6++) {
                    C0012al c0012alM650d = c0008ah.m650d(i6);
                    if (c0012alM650d != null) {
                        float fM648b = c0008ah.m648b(i6);
                        for (int i7 = 0; i7 < 6; i7++) {
                            float[] fArr = c0012alM650d.f615e;
                            fArr[i7] = fArr[i7] + (c0012al2.f615e[i7] * fM648b);
                        }
                        if (!this.f478a.contains(c0012alM650d)) {
                            this.f478a.add(c0012alM650d);
                        }
                    }
                }
                for (int i8 = 0; i8 < 6; i8++) {
                    c0012al2.f615e[i8] = 0.0f;
                }
            }
        }
    }

    public final String toString() {
        int size = this.f478a.size();
        String strConcat = "Goal: ";
        for (int i = 0; i < size; i++) {
            C0012al c0012al = (C0012al) this.f478a.get(i);
            StringBuilder sb = new StringBuilder();
            sb.append(c0012al);
            sb.append("[");
            String strConcat2 = "null[";
            int i2 = 0;
            while (true) {
                float[] fArr = c0012al.f615e;
                if (i2 < 6) {
                    String str = strConcat2 + c0012al.f615e[i2];
                    float[] fArr2 = c0012al.f615e;
                    strConcat2 = str.concat(i2 < 5 ? ", " : "] ");
                    i2++;
                }
            }
            strConcat = strConcat.concat(strConcat2);
        }
        return strConcat;
    }
}
