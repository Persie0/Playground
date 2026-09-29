package p000;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class cr2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34400a;

    /* JADX INFO: renamed from: b */
    public int f34401b;

    /* JADX INFO: renamed from: c */
    public int f34402c;

    /* JADX INFO: renamed from: d */
    public int f34403d;

    /* JADX INFO: renamed from: e */
    public final Object f34404e;

    /* JADX INFO: renamed from: f */
    public Object f34405f;

    /* JADX INFO: renamed from: g */
    public Object f34406g;

    public cr2(int[] iArr) {
        this.f34400a = 1;
        this.f34404e = iArr;
        emd emdVar = new emd(-1, -1);
        this.f34405f = emdVar;
        this.f34406g = emdVar;
    }

    /* JADX INFO: renamed from: c */
    public static cr2 m9857c(int[] iArr) {
        emd emdVar;
        cr2 cr2Var = new cr2(iArr);
        for (int i = 0; i < iArr.length; i++) {
            cr2Var.f34403d++;
            int[] iArr2 = (int[]) cr2Var.f34404e;
            int i2 = iArr2[i];
            while (true) {
                emd emdVar2 = null;
                while (true) {
                    if (cr2Var.f34403d <= 0) {
                        break;
                    }
                    int i3 = cr2Var.f34402c;
                    emdVar = (emd) cr2Var.f34406g;
                    if (i3 == 0) {
                        break;
                    }
                    int i4 = ((emd) emdVar.f37538d.get(Integer.valueOf(iArr2[cr2Var.f34401b]))).f37535a;
                    int i5 = cr2Var.f34402c;
                    if (iArr2[i4 + i5] == i2) {
                        if (emdVar2 != null) {
                            emdVar2.f37537c = (emd) cr2Var.f34406g;
                        }
                        cr2Var.f34402c = i5 + 1;
                        cr2Var.m9860d();
                        break;
                    }
                    emd emdVar3 = (emd) ((emd) cr2Var.f34406g).f37538d.get(Integer.valueOf(iArr2[cr2Var.f34401b]));
                    int i6 = emdVar3.f37535a;
                    emd emdVar4 = new emd(i6, (cr2Var.f34402c + i6) - 1);
                    ((emd) cr2Var.f34406g).f37538d.put(Integer.valueOf(iArr2[cr2Var.f34401b]), emdVar4);
                    int i7 = emdVar4.f37536b + 1;
                    Integer numValueOf = Integer.valueOf(iArr2[i7]);
                    HashMap map = emdVar4.f37538d;
                    map.put(numValueOf, emdVar3);
                    emdVar3.f37535a = i7;
                    if (emdVar2 != null) {
                        emdVar2.f37537c = emdVar4;
                    }
                    map.put(Integer.valueOf(i2), new emd(i, 1073741824));
                    cr2Var.f34403d--;
                    cr2Var.m9861e();
                    emdVar2 = emdVar4;
                }
                HashMap map2 = emdVar.f37538d;
                Integer numValueOf2 = Integer.valueOf(i2);
                if (map2.containsKey(numValueOf2)) {
                    if (emdVar2 != null) {
                        emdVar2.f37537c = (emd) cr2Var.f34406g;
                    }
                    cr2Var.f34401b = i;
                    cr2Var.f34402c++;
                    cr2Var.m9860d();
                    break;
                }
                ((emd) cr2Var.f34406g).f37538d.put(numValueOf2, new emd(i, 1073741824));
                if (emdVar2 != null) {
                    emdVar2.f37537c = (emd) cr2Var.f34406g;
                }
                cr2Var.f34403d--;
                cr2Var.m9861e();
            }
        }
        return cr2Var;
    }

    /* JADX INFO: renamed from: a */
    public void m9858a() {
        this.f34401b = 1;
        this.f34405f = (oy5) this.f34404e;
        this.f34403d = 0;
    }

    /* JADX INFO: renamed from: b */
    public boolean m9859b() {
        ky5 ky5VarM20595b = ((oy5) this.f34405f).f55306b.m20595b();
        int iM22869a = ky5VarM20595b.m22869a(6);
        return !(iM22869a == 0 || ((ByteBuffer) ky5VarM20595b.f64232d).get(iM22869a + ky5VarM20595b.f64229a) == 0) || this.f34402c == 65039;
    }

    /* JADX INFO: renamed from: d */
    public void m9860d() {
        if (this.f34402c == 0) {
            return;
        }
        HashMap map = ((emd) this.f34406g).f37538d;
        int[] iArr = (int[]) this.f34404e;
        emd emdVar = (emd) map.get(Integer.valueOf(iArr[this.f34401b]));
        while (true) {
            int i = (emdVar.f37536b - emdVar.f37535a) + 1;
            int i2 = this.f34402c;
            if (i > i2) {
                return;
            }
            int i3 = this.f34401b + i;
            this.f34401b = i3;
            this.f34406g = emdVar;
            int i4 = i2 - i;
            this.f34402c = i4;
            if (i4 > 0) {
                emdVar = (emd) emdVar.f37538d.get(Integer.valueOf(iArr[i3]));
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m9861e() {
        emd emdVar = ((emd) this.f34406g).f37537c;
        if (emdVar != null) {
            this.f34406g = emdVar;
        } else {
            this.f34406g = (emd) this.f34405f;
            int i = this.f34402c;
            if (i > 0) {
                this.f34402c = i - 1;
            }
            if (this.f34403d > 0) {
                this.f34401b++;
            }
        }
        m9860d();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    /* JADX INFO: renamed from: f */
    public C3283l2 m9862f() {
        int i;
        int i2;
        dmd dmdVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        emd emdVar = (emd) this.f34405f;
        int i3 = 0;
        dmd dmdVar2 = new dmd(emdVar, 0, -1, -1);
        arrayDeque.push(dmdVar2);
        while (!arrayDeque.isEmpty()) {
            dmd dmdVar3 = (dmd) arrayDeque.pop();
            for (emd emdVar2 : dmdVar3.f35885d.f37538d.values()) {
                int i4 = dmdVar3.f35883b;
                int i5 = dmdVar3.f35884c;
                int i6 = emdVar2.f37535a;
                int i7 = emdVar2.f37536b;
                if (m9864h(i4, i5, i6, i7)) {
                    dmdVar = new dmd(emdVar2, dmdVar3.f35882a + 1, i4, i5);
                } else {
                    if (emdVar2.f37538d.isEmpty()) {
                        int i8 = emdVar2.f37535a;
                        if (m9864h(i4, i5, i8, (i8 + i5) - i4)) {
                            dmdVar = new dmd(emdVar2, dmdVar3.f35882a + 1, i4, i5);
                        }
                    }
                    dmdVar = new dmd(emdVar2, 1, emdVar2.f37535a, i7);
                }
                if (dmdVar2.f35882a < dmdVar.f35882a) {
                    dmdVar2 = dmdVar;
                }
                arrayDeque.push(dmdVar);
            }
        }
        int[] iArr = (int[]) this.f34404e;
        int iMin = Math.min(iArr.length, dmdVar2.f35884c + 1);
        loop2: while (true) {
            i = dmdVar2.f35883b;
            i2 = iMin - i;
            emdVar = (emd) emdVar.f37538d.get(Integer.valueOf(iArr[(i3 % i2) + i]));
            if (emdVar == null) {
                break;
            }
            for (int i9 = emdVar.f37535a; i9 < emdVar.f37536b + 1 && i9 < iArr.length; i9++) {
                if (iArr[(i3 % i2) + i] != iArr[i9]) {
                    break loop2;
                }
                i3++;
            }
        }
        return new C3283l2(i, iMin, i3 / i2);
    }

    /* JADX INFO: renamed from: g */
    public void m9863g(emd emdVar, StringBuilder sb) {
        for (emd emdVar2 : emdVar.f37538d.values()) {
            sb.append("  ");
            sb.append(emdVar);
            sb.append(" -> ");
            sb.append(emdVar2);
            sb.append(" [label=\"");
            int[] iArr = (int[]) this.f34404e;
            sb.append(Arrays.toString(Arrays.copyOfRange(iArr, emdVar2.f37535a, Math.min(iArr.length, emdVar2.f37536b + 1))));
            sb.append("\"]\n");
            m9863g(emdVar2, sb);
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m9864h(int i, int i2, int i3, int i4) {
        if (i < 0 || i3 < 0) {
            return false;
        }
        int[] iArr = (int[]) this.f34404e;
        int length = iArr.length;
        int iMin = Math.min(length, i2);
        if (iMin - i != Math.min(length, i4) - i3) {
            return false;
        }
        for (int i5 = i; i5 <= iMin; i5++) {
            if (iArr[i5] != iArr[(i3 + i5) - i]) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        switch (this.f34400a) {
            case 1:
                StringBuilder sb = new StringBuilder("digraph {\n");
                m9863g((emd) this.f34405f, sb);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public cr2(oy5 oy5Var) {
        this.f34400a = 0;
        this.f34401b = 1;
        this.f34404e = oy5Var;
        this.f34405f = oy5Var;
    }
}
