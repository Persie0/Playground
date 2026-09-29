package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class kz6 extends r46 {

    /* JADX INFO: renamed from: A */
    public int f48813A;

    /* JADX INFO: renamed from: C */
    public int f48815C;

    /* JADX INFO: renamed from: E */
    public int f48817E;

    /* JADX INFO: renamed from: z */
    public gz6[] f48818z = new gz6[16];

    /* JADX INFO: renamed from: B */
    public int[] f48814B = new int[16];

    /* JADX INFO: renamed from: D */
    public Object[] f48816D = new Object[16];

    /* JADX INFO: renamed from: S */
    public final void m15734S() {
        this.f48813A = 0;
        this.f48815C = 0;
        Arrays.fill(this.f48816D, 0, this.f48817E, (Object) null);
        this.f48817E = 0;
    }

    /* JADX INFO: renamed from: T */
    public final void m15735T(InterfaceC3510qt interfaceC3510qt, fb9 fb9Var, v48 v48Var, hz6 hz6Var) {
        if (this.f48813A != 0) {
            pj3 pj3Var = new pj3(this);
            kz6 kz6Var = (kz6) pj3Var.f56314e;
            while (true) {
                gz6 gz6Var = kz6Var.f48818z[pj3Var.f56311b];
                oj3 oj3VarMo12972b = gz6Var.mo12972b(pj3Var);
                InterfaceC3510qt interfaceC3510qt2 = interfaceC3510qt;
                fb9 fb9Var2 = fb9Var;
                v48 v48Var2 = v48Var;
                hz6 hz6Var2 = hz6Var;
                try {
                    gz6Var.mo3126a(pj3Var, interfaceC3510qt2, fb9Var2, v48Var2, hz6Var2);
                    int i = pj3Var.f56311b;
                    int i2 = kz6Var.f48813A;
                    if (i < i2) {
                        gz6 gz6Var2 = kz6Var.f48818z[i];
                        pj3Var.f56312c += gz6Var2.f41551a;
                        pj3Var.f56313d += gz6Var2.f41552b;
                        int i3 = i + 1;
                        pj3Var.f56311b = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        interfaceC3510qt = interfaceC3510qt2;
                        fb9Var = fb9Var2;
                        v48Var = v48Var2;
                        hz6Var = hz6Var2;
                    } else {
                        break;
                    }
                } catch (Throwable th) {
                    if (hz6Var2 == null) {
                        throw th;
                    }
                    bna.m3988z0(th, new r60(oj3VarMo12972b, fb9Var2, hz6Var2, 8));
                    throw th;
                }
            }
        }
        m15734S();
    }

    /* JADX INFO: renamed from: U */
    public final boolean m15736U() {
        return this.f48813A == 0;
    }

    /* JADX INFO: renamed from: V */
    public final void m15737V(gz6 gz6Var) {
        int i = this.f48813A;
        gz6[] gz6VarArr = this.f48818z;
        if (i == gz6VarArr.length) {
            gz6[] gz6VarArr2 = new gz6[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(gz6VarArr, 0, gz6VarArr2, 0, i);
            this.f48818z = gz6VarArr2;
        }
        int i2 = this.f48815C;
        int i3 = gz6Var.f41551a;
        int i4 = gz6Var.f41552b;
        int i5 = i2 + i3;
        int[] iArr = this.f48814B;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            AbstractC3550rv.m20825S(0, 0, length, iArr, iArr2);
            this.f48814B = iArr2;
        }
        int i7 = this.f48817E + i4;
        Object[] objArr = this.f48816D;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.f48816D = objArr2;
        }
        gz6[] gz6VarArr3 = this.f48818z;
        int i9 = this.f48813A;
        this.f48813A = i9 + 1;
        gz6VarArr3[i9] = gz6Var;
        this.f48815C += gz6Var.f41551a;
        this.f48817E += i4;
    }
}
