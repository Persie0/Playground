package p000;

import com.google.common.collect.AbstractC1104t;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hs1 implements wm9 {

    /* JADX INFO: renamed from: c */
    public static final AbstractC1104t f42862c = AbstractC1104t.m6350c().m6352d(new tj0(3));

    /* JADX INFO: renamed from: a */
    public final ImmutableList f42863a;

    /* JADX INFO: renamed from: b */
    public final long[] f42864b;

    /* JADX WARN: Code duplicated, block: B:37:0x00d9  */
    /* JADX WARN: Multi-variable type inference failed */
    public hs1(List list) {
        int i = 0;
        long j = -9223372036854775807L;
        if (list.size() == 1) {
            d14 d14VarListIterator = ((ImmutableList) list).listIterator(0);
            Object next = d14VarListIterator.next();
            if (d14VarListIterator.hasNext()) {
                StringBuilder sb = new StringBuilder("expected one element but was: <");
                sb.append(next);
                while (i < 4 && d14VarListIterator.hasNext()) {
                    sb.append(", ");
                    sb.append(d14VarListIterator.next());
                    i++;
                }
                if (d14VarListIterator.hasNext()) {
                    sb.append(", ...");
                }
                sb.append('>');
                throw new IllegalArgumentException(sb.toString());
            }
            gs1 gs1Var = (gs1) next;
            long j2 = gs1Var.f41258b;
            long j3 = gs1Var.f41259c;
            long j4 = j2 == -9223372036854775807L ? 0L : j2;
            ImmutableList immutableList = gs1Var.f41257a;
            if (j3 == -9223372036854775807L) {
                this.f42863a = ImmutableList.m6291y(immutableList);
                this.f42864b = new long[]{j4};
                return;
            } else {
                this.f42863a = ImmutableList.m6280B(immutableList, ImmutableList.m6289v());
                this.f42864b = new long[]{j4, j3 + j4};
                return;
            }
        }
        long[] jArr = new long[list.size() * 2];
        this.f42864b = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        ImmutableList immutableListM6282E = ImmutableList.m6282E(f42862c, list);
        int i2 = 0;
        while (i < immutableListM6282E.size()) {
            gs1 gs1Var2 = (gs1) immutableListM6282E.get(i);
            long j5 = gs1Var2.f41258b;
            long j6 = gs1Var2.f41259c;
            ImmutableList immutableList2 = gs1Var2.f41257a;
            j5 = j5 == j ? 0L : j5;
            long j7 = j5 + j6;
            if (i2 != 0) {
                int i3 = i2 - 1;
                long j8 = this.f42864b[i3];
                if (j8 < j5) {
                    this.f42864b[i2] = j5;
                    arrayList.add(immutableList2);
                    i2++;
                } else if (j8 == j5 && ((ImmutableList) arrayList.get(i3)).isEmpty()) {
                    arrayList.set(i3, immutableList2);
                } else {
                    ss5.m21707d0("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                    this.f42864b[i3] = j5;
                    arrayList.set(i3, immutableList2);
                }
            } else {
                this.f42864b[i2] = j5;
                arrayList.add(immutableList2);
                i2++;
            }
            if (j6 != j) {
                this.f42864b[i2] = j7;
                arrayList.add(ImmutableList.m6289v());
                i2++;
            }
            i++;
            j = j;
        }
        this.f42863a = ImmutableList.m6287r(arrayList);
    }

    @Override // p000.wm9
    /* JADX INFO: renamed from: b */
    public final int mo4446b(long j) {
        int iM22806a = uma.m22806a(this.f42864b, j, false);
        if (iM22806a < this.f42863a.size()) {
            return iM22806a;
        }
        return -1;
    }

    @Override // p000.wm9
    /* JADX INFO: renamed from: c */
    public final long mo4447c(int i) {
        bna.m3969q(i < this.f42863a.size());
        return this.f42864b[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.wm9
    /* JADX INFO: renamed from: i */
    public final List mo4453i(long j) {
        int iM22809d = uma.m22809d(this.f42864b, j, false);
        return iM22809d == -1 ? ImmutableList.m6289v() : (ImmutableList) this.f42863a.get(iM22809d);
    }

    @Override // p000.wm9
    /* JADX INFO: renamed from: l */
    public final int mo4454l() {
        return this.f42863a.size();
    }
}
