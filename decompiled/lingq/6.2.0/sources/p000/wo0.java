package p000;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wo0 implements xm9 {

    /* JADX INFO: renamed from: a */
    public final ArrayDeque f67111a = new ArrayDeque();

    /* JADX INFO: renamed from: b */
    public final ArrayDeque f67112b;

    /* JADX INFO: renamed from: c */
    public final ArrayDeque f67113c;

    /* JADX INFO: renamed from: d */
    public uo0 f67114d;

    /* JADX INFO: renamed from: e */
    public long f67115e;

    /* JADX INFO: renamed from: f */
    public long f67116f;

    /* JADX INFO: renamed from: g */
    public long f67117g;

    public wo0() {
        for (int i = 0; i < 10; i++) {
            this.f67111a.add(new uo0(1));
        }
        this.f67112b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.f67112b;
            C3440oy c3440oy = new C3440oy(this, 5);
            vo0 vo0Var = new vo0();
            vo0Var.f65689h = c3440oy;
            arrayDeque.add(vo0Var);
        }
        this.f67113c = new ArrayDeque();
        this.f67117g = -9223372036854775807L;
    }

    @Override // p000.k32
    /* JADX INFO: renamed from: a */
    public void mo14782a() {
    }

    @Override // p000.k32
    /* JADX INFO: renamed from: b */
    public final void mo14783b(long j) {
        this.f67117g = j;
    }

    @Override // p000.xm9
    /* JADX INFO: renamed from: c */
    public final void mo19837c(long j) {
        this.f67115e = j;
    }

    @Override // p000.k32
    /* JADX INFO: renamed from: e */
    public final Object mo14785e() {
        bna.m3987z(this.f67114d == null);
        ArrayDeque arrayDeque = this.f67111a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        uo0 uo0Var = (uo0) arrayDeque.pollFirst();
        this.f67114d = uo0Var;
        return uo0Var;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    @Override // p000.k32
    /* JADX INFO: renamed from: f */
    public final void mo14786f(zm9 zm9Var) {
        bna.m3969q(zm9Var == this.f67114d);
        uo0 uo0Var = (uo0) zm9Var;
        if (uo0Var.m3751d(4)) {
            long j = this.f67116f;
            this.f67116f = 1 + j;
            uo0Var.f64125k = j;
            this.f67113c.add(uo0Var);
        } else {
            long j2 = uo0Var.f50502g;
            if (j2 != Long.MIN_VALUE) {
                long j3 = this.f67117g;
                if (j3 == -9223372036854775807L || j2 >= j3) {
                    long j4 = this.f67116f;
                    this.f67116f = 1 + j4;
                    uo0Var.f64125k = j4;
                    this.f67113c.add(uo0Var);
                } else {
                    uo0Var.mo16607k();
                    this.f67111a.add(uo0Var);
                }
            } else {
                long j5 = this.f67116f;
                this.f67116f = 1 + j5;
                uo0Var.f64125k = j5;
                this.f67113c.add(uo0Var);
            }
        }
        this.f67114d = null;
    }

    @Override // p000.k32
    public void flush() {
        ArrayDeque arrayDeque;
        this.f67116f = 0L;
        this.f67115e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.f67113c;
            boolean zIsEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.f67111a;
            if (zIsEmpty) {
                break;
            }
            uo0 uo0Var = (uo0) arrayDeque2.poll();
            String str = uma.f64080a;
            uo0Var.mo16607k();
            arrayDeque.add(uo0Var);
        }
        uo0 uo0Var2 = this.f67114d;
        if (uo0Var2 != null) {
            uo0Var2.mo16607k();
            arrayDeque.add(uo0Var2);
            this.f67114d = null;
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract vj6 mo19423g();

    /* JADX INFO: renamed from: h */
    public abstract void mo19424h(uo0 uo0Var);

    @Override // p000.k32
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public vo0 mo14784d() {
        ArrayDeque arrayDeque = this.f67112b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.f67113c;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            uo0 uo0Var = (uo0) arrayDeque2.peek();
            String str = uma.f64080a;
            if (uo0Var.f50502g > this.f67115e) {
                return null;
            }
            uo0 uo0Var2 = (uo0) arrayDeque2.poll();
            boolean zM3751d = uo0Var2.m3751d(4);
            ArrayDeque arrayDeque3 = this.f67111a;
            if (zM3751d) {
                vo0 vo0Var = (vo0) arrayDeque.pollFirst();
                vo0Var.f8576b |= 4;
                uo0Var2.mo16607k();
                arrayDeque3.add(uo0Var2);
                return vo0Var;
            }
            mo19424h(uo0Var2);
            if (mo19426j()) {
                vj6 vj6VarMo19423g = mo19423g();
                vo0 vo0Var2 = (vo0) arrayDeque.pollFirst();
                long j = uo0Var2.f50502g;
                vo0Var2.f52260c = j;
                vo0Var2.f65686e = vj6VarMo19423g;
                vo0Var2.f65687f = j;
                uo0Var2.mo16607k();
                arrayDeque3.add(uo0Var2);
                return vo0Var2;
            }
            uo0Var2.mo16607k();
            arrayDeque3.add(uo0Var2);
        }
    }

    /* JADX INFO: renamed from: j */
    public abstract boolean mo19426j();
}
