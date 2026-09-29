package p000;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* JADX INFO: loaded from: classes.dex */
public final class bj8 {

    /* JADX INFO: renamed from: a */
    public final List f8613a;

    /* JADX INFO: renamed from: b */
    public final float f8614b;

    /* JADX INFO: renamed from: c */
    public final float f8615c;

    /* JADX INFO: renamed from: d */
    public final ListBuilder f8616d;

    /* JADX WARN: Code duplicated, block: B:24:0x0166  */
    /* JADX WARN: Code duplicated, block: B:26:0x0172 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0174  */
    /* JADX WARN: Code duplicated, block: B:30:0x017b  */
    /* JADX WARN: Code duplicated, block: B:31:0x017f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0182  */
    /* JADX WARN: Code duplicated, block: B:34:0x0186  */
    /* JADX WARN: Code duplicated, block: B:38:0x01a1 A[LOOP:0: B:11:0x0136->B:38:0x01a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x01b2 A[EDGE_INSN: B:54:0x01b2->B:40:0x01b2 BREAK  A[LOOP:0: B:11:0x0136->B:38:0x01a1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public bj8(AbstractList abstractList, float f, float f2) {
        ArrayList arrayListM23608N;
        ArrayList arrayListM23608N2;
        char c;
        char c2;
        char c3;
        yr1 yr1Var;
        yr1 yr1Var2;
        List list;
        int size;
        int i;
        yr1 yr1Var3;
        char c4;
        abstractList.getClass();
        this.f8613a = abstractList;
        this.f8614b = f;
        this.f8615c = f2;
        ListBuilder listBuilderM23650t = vz1.m23650t();
        char c5 = 5;
        char c6 = 4;
        char c7 = 3;
        if (abstractList.size() <= 0 || ((i13) abstractList.get(0)).f43327a.size() != 3) {
            arrayListM23608N = null;
            arrayListM23608N2 = null;
        } else {
            yr1 yr1Var4 = (yr1) ((i13) abstractList.get(0)).f43327a.get(1);
            float[] fArr = yr1Var4.f70312a;
            long jM13710a = i73.m13710a((yr1Var4.m25288a() * 0.125f) + (fArr[4] * 0.375f) + (fArr[2] * 0.375f) + (fArr[0] * 0.125f), (yr1Var4.m25289b() * 0.125f) + (fArr[5] * 0.375f) + (fArr[3] * 0.375f) + (fArr[1] * 0.125f));
            float[] fArr2 = yr1Var4.f70312a;
            float f3 = fArr2[0];
            float f4 = fArr2[1];
            float f5 = fArr2[2] * 0.5f;
            float f6 = fArr2[3] * 0.5f;
            yr1 yr1VarM3230a = b34.m3230a(f3, f4, f5 + (f3 * 0.5f), f6 + (f4 * 0.5f), (fArr2[4] * 0.25f) + (f3 * 0.25f) + f5, (fArr2[5] * 0.25f) + (f4 * 0.25f) + f6, do7.m10544t(jM13710a), do7.m10545u(jM13710a));
            yr1 yr1VarM3230a2 = b34.m3230a(do7.m10544t(jM13710a), do7.m10545u(jM13710a), (yr1Var4.m25288a() * 0.25f) + (fArr2[4] * 0.5f) + (fArr2[2] * 0.25f), (yr1Var4.m25289b() * 0.25f) + (fArr2[5] * 0.5f) + (fArr2[3] * 0.25f), (yr1Var4.m25288a() * 0.5f) + (fArr2[4] * 0.5f), (yr1Var4.m25289b() * 0.5f) + (fArr2[5] * 0.5f), yr1Var4.m25288a(), yr1Var4.m25289b());
            arrayListM23608N2 = vz1.m23608N(((i13) abstractList.get(0)).f43327a.get(0), yr1VarM3230a);
            arrayListM23608N = vz1.m23608N(yr1VarM3230a2, ((i13) abstractList.get(0)).f43327a.get(2));
        }
        int size2 = abstractList.size();
        if (size2 >= 0) {
            int i2 = 0;
            yr1Var = null;
            yr1Var2 = null;
            while (true) {
                if (i2 == 0 && arrayListM23608N != null) {
                    list = arrayListM23608N;
                } else if (i2 == this.f8613a.size()) {
                    c = c5;
                    if (arrayListM23608N2 != null) {
                        list = arrayListM23608N2;
                        size = list.size();
                        c2 = c6;
                        i = 0;
                        while (i < size) {
                            yr1Var3 = (yr1) list.get(i);
                            if (yr1Var3.m25291d()) {
                                c4 = c7;
                                if (yr1Var2 != null) {
                                    float[] fArr3 = yr1Var2.f70312a;
                                    fArr3[6] = yr1Var3.m25288a();
                                    fArr3[7] = yr1Var3.m25289b();
                                }
                            } else {
                                if (yr1Var2 != null) {
                                    listBuilderM23650t.add(yr1Var2);
                                }
                                c4 = c7;
                                if (yr1Var == null) {
                                    yr1Var = yr1Var3;
                                    yr1Var2 = yr1Var;
                                } else {
                                    yr1Var2 = yr1Var3;
                                }
                            }
                            i++;
                            c7 = c4;
                        }
                        c3 = c7;
                        if (i2 != size2) {
                            break;
                        }
                        i2++;
                        c5 = c;
                        c6 = c2;
                        c7 = c3;
                    } else {
                        c2 = c6;
                        c3 = c7;
                        break;
                    }
                } else {
                    list = ((i13) this.f8613a.get(i2)).f43327a;
                }
                c = c5;
                size = list.size();
                c2 = c6;
                i = 0;
                while (i < size) {
                    yr1Var3 = (yr1) list.get(i);
                    if (yr1Var3.m25291d()) {
                        if (yr1Var2 != null) {
                            listBuilderM23650t.add(yr1Var2);
                        }
                        c4 = c7;
                        if (yr1Var == null) {
                            yr1Var = yr1Var3;
                            yr1Var2 = yr1Var;
                        } else {
                            yr1Var2 = yr1Var3;
                        }
                    } else {
                        c4 = c7;
                        if (yr1Var2 != null) {
                            float[] fArr4 = yr1Var2.f70312a;
                            fArr4[6] = yr1Var3.m25288a();
                            fArr4[7] = yr1Var3.m25289b();
                        }
                    }
                    i++;
                    c7 = c4;
                }
                c3 = c7;
                if (i2 != size2) {
                    break;
                    break;
                }
                i2++;
                c5 = c;
                c6 = c2;
                c7 = c3;
            }
        } else {
            c = 5;
            c2 = 4;
            c3 = 3;
            yr1Var = null;
            yr1Var2 = null;
        }
        if (yr1Var2 != null && yr1Var != null) {
            float[] fArr5 = yr1Var2.f70312a;
            float f7 = fArr5[0];
            float f8 = fArr5[1];
            float f9 = fArr5[2];
            float f10 = fArr5[c3];
            float f11 = fArr5[c2];
            float f12 = fArr5[c];
            float[] fArr6 = yr1Var.f70312a;
            listBuilderM23650t.add(b34.m3230a(f7, f8, f9, f10, f11, f12, fArr6[0], fArr6[1]));
        }
        ListBuilder listBuilderM23635i = vz1.m23635i(listBuilderM23650t);
        this.f8616d = listBuilderM23635i;
        Object obj = listBuilderM23635i.get(listBuilderM23635i.mo4182d() - 1);
        int iMo4182d = listBuilderM23635i.mo4182d();
        int i3 = 0;
        while (i3 < iMo4182d) {
            yr1 yr1Var5 = (yr1) this.f8616d.get(i3);
            yr1 yr1Var6 = (yr1) obj;
            if (Math.abs(yr1Var5.f70312a[0] - yr1Var6.m25288a()) > 1.0E-4f || Math.abs(yr1Var5.f70312a[1] - yr1Var6.m25289b()) > 1.0E-4f) {
                C3386nv.m17626m("RoundedPolygon must be contiguous, with the anchor points of all curves matching the anchor points of the preceding and succeeding cubics");
                throw null;
            }
            i3++;
            obj = yr1Var5;
        }
    }

    /* JADX INFO: renamed from: a */
    public final bj8 m3787a() {
        char c;
        char c2;
        char c3;
        char c4;
        char c5 = 4;
        float[] fArr = new float[4];
        ListBuilder listBuilder = this.f8616d;
        int iMo4182d = listBuilder.mo4182d();
        float fMax = Float.MIN_VALUE;
        char c6 = 0;
        float fMin = Float.MAX_VALUE;
        float fMin2 = Float.MAX_VALUE;
        int i = 0;
        float fMax2 = Float.MIN_VALUE;
        while (i < iMo4182d) {
            yr1 yr1Var = (yr1) listBuilder.get(i);
            yr1Var.getClass();
            boolean zM25291d = yr1Var.m25291d();
            char c7 = c5;
            float[] fArr2 = yr1Var.f70312a;
            if (zM25291d) {
                fArr[c6] = fArr2[c6];
                fArr[1] = fArr2[1];
                fArr[2] = fArr2[c6];
                fArr[3] = fArr2[1];
                c = c6;
                c2 = 2;
                c3 = 1;
                c4 = 3;
            } else {
                c = c6;
                float fMin3 = Math.min(fArr2[c6], yr1Var.m25288a());
                c2 = 2;
                float fMin4 = Math.min(fArr2[1], yr1Var.m25289b());
                c3 = 1;
                float fMax3 = Math.max(fArr2[c], yr1Var.m25288a());
                float fMax4 = Math.max(fArr2[1], yr1Var.m25289b());
                c4 = 3;
                fArr[c] = Math.min(fMin3, Math.min(fArr2[2], fArr2[c7]));
                fArr[1] = Math.min(fMin4, Math.min(fArr2[3], fArr2[5]));
                fArr[2] = Math.max(fMax3, Math.max(fArr2[2], fArr2[c7]));
                fArr[3] = Math.max(fMax4, Math.max(fArr2[3], fArr2[5]));
            }
            fMin = Math.min(fMin, fArr[c]);
            fMin2 = Math.min(fMin2, fArr[c3]);
            fMax = Math.max(fMax, fArr[c2]);
            fMax2 = Math.max(fMax2, fArr[c4]);
            i++;
            c5 = c7;
            c6 = c;
        }
        char c8 = c6;
        fArr[c8] = fMin;
        fArr[1] = fMin2;
        fArr[2] = fMax;
        fArr[3] = fMax2;
        float f = fMax - fMin;
        float f2 = fMax2 - fMin2;
        float fMax5 = Math.max(f, f2);
        return m3788b(new aj8(((fMax5 - f) / 2.0f) - fArr[c8], fMax5, ((fMax5 - f2) / 2.0f) - fArr[1]));
    }

    /* JADX INFO: renamed from: b */
    public final bj8 m3788b(eg7 eg7Var) {
        long jM10523J = do7.m10523J(i73.m13710a(this.f8614b, this.f8615c), eg7Var);
        ListBuilder listBuilderM23650t = vz1.m23650t();
        List list = this.f8613a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            listBuilderM23650t.add(((i13) list.get(i)).mo12278a(eg7Var));
        }
        return new bj8(vz1.m23635i(listBuilderM23650t), do7.m10544t(jM10523J), do7.m10545u(jM10523J));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj8)) {
            return false;
        }
        return fa4.m11650l(this.f8613a, ((bj8) obj).f8613a);
    }

    public final int hashCode() {
        return this.f8613a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[RoundedPolygon. Cubics = ");
        sb.append(u91.m22596N0(this.f8616d, null, null, null, null, 63));
        sb.append(" || Features = ");
        sb.append(u91.m22596N0(this.f8613a, null, null, null, null, 63));
        sb.append(" || Center = (");
        sb.append(this.f8614b);
        sb.append(", ");
        return wq1.m24121q(sb, this.f8615c, ")]");
    }
}
