package p000;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class of9 extends h3d {

    /* JADX INFO: renamed from: a */
    public final k47 f54281a = new k47();

    /* JADX INFO: renamed from: b */
    public final so0 f54282b = new so0();

    /* JADX INFO: renamed from: c */
    public g1a f54283c;

    /* JADX WARN: Code duplicated, block: B:14:0x001a  */
    @Override // p000.h3d
    /* JADX INFO: renamed from: b */
    public final ey5 mo13039b(jy5 jy5Var, ByteBuffer byteBuffer) {
        dy5 qf9Var;
        long j;
        long j2;
        k47 k47Var = this.f54281a;
        so0 so0Var = this.f54282b;
        g1a g1aVar = this.f54283c;
        if (g1aVar != null) {
            long j3 = jy5Var.f46391j;
            synchronized (g1aVar) {
                j2 = g1aVar.f40052b;
            }
            if (j3 != j2) {
                g1a g1aVar2 = new g1a(jy5Var.f50502g);
                this.f54283c = g1aVar2;
                g1aVar2.m12279a(jy5Var.f50502g - jy5Var.f46391j);
            }
        } else {
            g1a g1aVar3 = new g1a(jy5Var.f50502g);
            this.f54283c = g1aVar3;
            g1aVar3.m12279a(jy5Var.f50502g - jy5Var.f46391j);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        k47Var.m14816K(iLimit, bArrArray);
        so0Var.m21507k(iLimit, bArrArray);
        so0Var.m21511o(39);
        long jM21503g = (((long) so0Var.m21503g(1)) << 32) | ((long) so0Var.m21503g(32));
        so0Var.m21511o(20);
        int iM21503g = so0Var.m21503g(12);
        int iM21503g2 = so0Var.m21503g(8);
        k47Var.m14819N(14);
        if (iM21503g2 == 0) {
            qf9Var = new qf9();
        } else if (iM21503g2 == 255) {
            long jM14807B = k47Var.m14807B();
            int i = iM21503g - 4;
            k47Var.m14827k(new byte[i], 0, i);
            qf9Var = new tk7(0, jM14807B, jM21503g);
        } else if (iM21503g2 == 4) {
            int iM14842z = k47Var.m14842z();
            ArrayList arrayList = new ArrayList(iM14842z);
            for (int i2 = 0; i2 < iM14842z; i2++) {
                k47Var.m14807B();
                boolean z = (k47Var.m14842z() & 128) != 0;
                ArrayList arrayList2 = new ArrayList();
                if (!z) {
                    int iM14842z2 = k47Var.m14842z();
                    boolean z2 = (iM14842z2 & 64) != 0;
                    boolean z3 = (iM14842z2 & 32) != 0;
                    if (z2) {
                        k47Var.m14807B();
                    }
                    if (!z2) {
                        int iM14842z3 = k47Var.m14842z();
                        ArrayList arrayList3 = new ArrayList(iM14842z3);
                        for (int i3 = 0; i3 < iM14842z3; i3++) {
                            k47Var.m14842z();
                            k47Var.m14807B();
                            arrayList3.add(new to2());
                        }
                        arrayList2 = arrayList3;
                    }
                    if (z3) {
                        k47Var.m14842z();
                        k47Var.m14807B();
                    }
                    k47Var.m14812G();
                    k47Var.m14842z();
                    k47Var.m14842z();
                }
                d40 d40Var = new d40();
                d40Var.f34980a = Collections.unmodifiableList(arrayList2);
                arrayList.add(d40Var);
            }
            qf9Var = new rf9(arrayList);
        } else if (iM21503g2 == 5) {
            g1a g1aVar4 = this.f54283c;
            k47Var.m14807B();
            boolean z4 = (k47Var.m14842z() & 128) != 0;
            List list = Collections.EMPTY_LIST;
            if (z4) {
                j = -9223372036854775807L;
            } else {
                int iM14842z4 = k47Var.m14842z();
                boolean z5 = (iM14842z4 & 64) != 0;
                boolean z6 = (iM14842z4 & 32) != 0;
                boolean z7 = (iM14842z4 & 16) != 0;
                long jM22187d = (!z5 || z7) ? -9223372036854775807L : tk7.m22187d(jM21503g, k47Var);
                if (!z5) {
                    int iM14842z5 = k47Var.m14842z();
                    ArrayList arrayList4 = new ArrayList(iM14842z5);
                    for (int i4 = 0; i4 < iM14842z5; i4++) {
                        k47Var.m14842z();
                        g1aVar4.m12280b(!z7 ? tk7.m22187d(jM21503g, k47Var) : -9223372036854775807L);
                        arrayList4.add(new gna());
                    }
                    list = arrayList4;
                }
                if (z6) {
                    k47Var.m14842z();
                    k47Var.m14807B();
                }
                k47Var.m14812G();
                k47Var.m14842z();
                k47Var.m14842z();
                j = jM22187d;
            }
            qf9Var = new pf9(j, g1aVar4.m12280b(j), list);
        } else if (iM21503g2 != 6) {
            qf9Var = null;
        } else {
            g1a g1aVar5 = this.f54283c;
            long jM22187d2 = tk7.m22187d(jM21503g, k47Var);
            qf9Var = new tk7(1, jM22187d2, g1aVar5.m12280b(jM22187d2));
        }
        return qf9Var == null ? new ey5(new dy5[0]) : new ey5(qf9Var);
    }
}
