package p081e0;

import dm.C5207g;
import java.util.Arrays;
import p446w2.InterfaceC9806d;

/* JADX INFO: renamed from: e0.u */
/* JADX INFO: loaded from: classes.dex */
public class C5339u implements InterfaceC9806d {

    /* JADX INFO: renamed from: a */
    public int f33618a;

    /* JADX INFO: renamed from: b */
    public Object f33619b;

    public C5339u() {
        this.f33619b = new int[10];
    }

    public C5339u(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f33619b = new Object[i10];
    }

    @Override // p446w2.InterfaceC9806d
    /* JADX INFO: renamed from: a */
    public boolean mo11464a(Object obj) {
        int i10;
        boolean z10;
        int i11 = 0;
        while (true) {
            i10 = this.f33618a;
            if (i11 >= i10) {
                z10 = false;
                break;
            }
            if (((Object[]) this.f33619b)[i11] == obj) {
                z10 = true;
                break;
            }
            i11++;
        }
        if (z10) {
            throw new IllegalStateException("Already in the pool!");
        }
        Object obj2 = this.f33619b;
        if (i10 >= ((Object[]) obj2).length) {
            return false;
        }
        ((Object[]) obj2)[i10] = obj;
        this.f33618a = i10 + 1;
        return true;
    }

    @Override // p446w2.InterfaceC9806d
    /* JADX INFO: renamed from: b */
    public Object mo11465b() {
        int i10 = this.f33618a;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object obj = this.f33619b;
        Object obj2 = ((Object[]) obj)[i11];
        ((Object[]) obj)[i11] = null;
        this.f33618a = i10 - 1;
        return obj2;
    }

    /* JADX INFO: renamed from: c */
    public final int m11466c() {
        int[] iArr = (int[]) this.f33619b;
        int i10 = this.f33618a - 1;
        this.f33618a = i10;
        return iArr[i10];
    }

    /* JADX INFO: renamed from: d */
    public final void m11467d(int i10) {
        int i11 = this.f33618a;
        Object obj = this.f33619b;
        if (i11 >= ((int[]) obj).length) {
            int[] iArrCopyOf = Arrays.copyOf((int[]) obj, ((int[]) obj).length * 2);
            C5207g.m11110e(iArrCopyOf, "copyOf(this, newSize)");
            this.f33619b = iArrCopyOf;
        }
        int[] iArr = (int[]) this.f33619b;
        int i12 = this.f33618a;
        this.f33618a = i12 + 1;
        iArr[i12] = i10;
    }
}
