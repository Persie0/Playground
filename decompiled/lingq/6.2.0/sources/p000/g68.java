package p000;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class g68 {

    /* JADX INFO: renamed from: a */
    public final f68 f40271a;

    /* JADX INFO: renamed from: b */
    public final ArrayDeque f40272b = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    public final ArrayDeque f40273c = new ArrayDeque();

    /* JADX INFO: renamed from: d */
    public final PriorityQueue f40274d = new PriorityQueue();

    /* JADX INFO: renamed from: e */
    public int f40275e = -1;

    /* JADX INFO: renamed from: f */
    public e68 f40276f;

    public g68(f68 f68Var) {
        this.f40271a = f68Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r9 < r1.f36764b) goto L34;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m12382a(long j, k47 k47Var) {
        int i;
        if (j != -9223372036854775807L && (i = this.f40275e) != 0) {
            PriorityQueue priorityQueue = this.f40274d;
            if (i != -1 && priorityQueue.size() >= this.f40275e) {
                e68 e68Var = (e68) priorityQueue.peek();
                String str = uma.f64080a;
            }
            ArrayDeque arrayDeque = this.f40272b;
            k47 k47Var2 = arrayDeque.isEmpty() ? new k47() : (k47) arrayDeque.pop();
            k47Var2.m14815J(k47Var.m14820a());
            System.arraycopy(k47Var.f46700a, k47Var.f46701b, k47Var2.f46700a, 0, k47Var2.m14820a());
            e68 e68Var2 = this.f40276f;
            if (e68Var2 != null && j == e68Var2.f36764b) {
                e68Var2.f36763a.add(k47Var2);
                return;
            }
            ArrayDeque arrayDeque2 = this.f40273c;
            e68 e68Var3 = arrayDeque2.isEmpty() ? new e68() : (e68) arrayDeque2.pop();
            ArrayList arrayList = e68Var3.f36763a;
            bna.m3969q(j != -9223372036854775807L);
            bna.m3987z(arrayList.isEmpty());
            e68Var3.f36764b = j;
            arrayList.add(k47Var2);
            priorityQueue.add(e68Var3);
            this.f40276f = e68Var3;
            int i2 = this.f40275e;
            if (i2 != -1) {
                m12383b(i2);
                return;
            }
            return;
        }
        this.f40271a.mo10702h(j, k47Var);
    }

    /* JADX INFO: renamed from: b */
    public final void m12383b(int i) {
        ArrayList arrayList;
        while (true) {
            PriorityQueue priorityQueue = this.f40274d;
            if (priorityQueue.size() <= i) {
                return;
            }
            e68 e68Var = (e68) priorityQueue.poll();
            String str = uma.f64080a;
            int i2 = 0;
            while (true) {
                arrayList = e68Var.f36763a;
                if (i2 >= arrayList.size()) {
                    break;
                }
                this.f40271a.mo10702h(e68Var.f36764b, (k47) arrayList.get(i2));
                this.f40272b.push((k47) arrayList.get(i2));
                i2++;
            }
            arrayList.clear();
            e68 e68Var2 = this.f40276f;
            if (e68Var2 != null && e68Var2.f36764b == e68Var.f36764b) {
                this.f40276f = null;
            }
            this.f40273c.push(e68Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m12384c(int i) {
        bna.m3987z(i >= 0);
        this.f40275e = i;
        m12383b(i);
    }
}
