package p000;

import com.google.common.collect.AbstractC1104t;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ox5 implements fs1 {

    /* JADX INFO: renamed from: b */
    public static final AbstractC1104t f55126b = AbstractC1104t.m6350c().m6352d(new tj0(6)).m6351a(AbstractC1104t.m6350c().mo6319e().m6352d(new tj0(7)));

    /* JADX INFO: renamed from: a */
    public final ArrayList f55127a = new ArrayList();

    @Override // p000.fs1
    /* JADX INFO: renamed from: a */
    public final long mo12042a(long j) {
        int i = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f55127a;
            if (i >= arrayList.size()) {
                break;
            }
            long j2 = ((gs1) arrayList.get(i)).f41258b;
            long j3 = ((gs1) arrayList.get(i)).f41260d;
            if (j < j2) {
                if (jMin != -9223372036854775807L) {
                    jMin = Math.min(jMin, j2);
                    break;
                }
                jMin = j2;
                break;
            }
            if (j < j3) {
                jMin = jMin == -9223372036854775807L ? j3 : Math.min(jMin, j3);
            }
            i++;
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // p000.fs1
    /* JADX INFO: renamed from: c */
    public final boolean mo12043c(gs1 gs1Var, long j) {
        long j2 = gs1Var.f41258b;
        bna.m3969q(j2 != -9223372036854775807L);
        bna.m3969q(gs1Var.f41259c != -9223372036854775807L);
        boolean z = j2 <= j && j < gs1Var.f41260d;
        ArrayList arrayList = this.f55127a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((gs1) arrayList.get(size)).f41258b) {
                arrayList.add(size + 1, gs1Var);
                return z;
            }
        }
        arrayList.add(0, gs1Var);
        return z;
    }

    @Override // p000.fs1
    public final void clear() {
        this.f55127a.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.fs1
    /* JADX INFO: renamed from: d */
    public final ImmutableList mo12044d(long j) {
        ArrayList arrayList = this.f55127a;
        if (!arrayList.isEmpty()) {
            if (j >= ((gs1) arrayList.get(0)).f41258b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    gs1 gs1Var = (gs1) arrayList.get(i);
                    if (j >= gs1Var.f41258b && j < gs1Var.f41260d) {
                        arrayList2.add(gs1Var);
                    }
                    if (j < gs1Var.f41258b) {
                        break;
                    }
                }
                ImmutableList immutableListM6282E = ImmutableList.m6282E(f55126b, arrayList2);
                c14 c14VarM6284m = ImmutableList.m6284m();
                for (int i2 = 0; i2 < immutableListM6282E.size(); i2++) {
                    c14VarM6284m.m3159d(((gs1) immutableListM6282E.get(i2)).f41257a);
                }
                return c14VarM6284m.m4280g();
            }
        }
        return ImmutableList.m6289v();
    }

    @Override // p000.fs1
    /* JADX INFO: renamed from: i */
    public final long mo12045i(long j) {
        ArrayList arrayList = this.f55127a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((gs1) arrayList.get(0)).f41258b) {
            return -9223372036854775807L;
        }
        long jMax = ((gs1) arrayList.get(0)).f41258b;
        for (int i = 0; i < arrayList.size(); i++) {
            long j2 = ((gs1) arrayList.get(i)).f41258b;
            long j3 = ((gs1) arrayList.get(i)).f41260d;
            if (j3 > j) {
                if (j2 > j) {
                    break;
                }
                jMax = Math.max(jMax, j2);
            } else {
                jMax = Math.max(jMax, j3);
            }
        }
        return jMax;
    }

    @Override // p000.fs1
    /* JADX INFO: renamed from: k */
    public final void mo12046k(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f55127a;
            if (i >= arrayList.size()) {
                return;
            }
            long j2 = ((gs1) arrayList.get(i)).f41258b;
            if (j > j2 && j > ((gs1) arrayList.get(i)).f41260d) {
                arrayList.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }
}
