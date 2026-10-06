package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class oye {

    /* JADX INFO: renamed from: a */
    private final opl f46812a = ook.m18794h(0);

    /* JADX INFO: renamed from: b */
    public oyf[] f46813b;

    /* JADX INFO: renamed from: h */
    private final void m19167h(int i, int i2) {
        oyf[] oyfVarArr = this.f46813b;
        oyfVarArr.getClass();
        oyf oyfVar = oyfVarArr[i2];
        oyfVar.getClass();
        oyf oyfVar2 = oyfVarArr[i];
        oyfVar2.getClass();
        oyfVarArr[i] = oyfVar;
        oyfVarArr[i2] = oyfVar2;
        oyfVar.mo18964f(i);
        oyfVar2.mo18964f(i2);
    }

    /* JADX INFO: renamed from: a */
    public final int m19168a() {
        return this.f46812a.f46391b;
    }

    /* JADX INFO: renamed from: b */
    public final oyf m19169b() {
        oyf[] oyfVarArr = this.f46813b;
        if (oyfVarArr != null) {
            return oyfVarArr[0];
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final oyf m19170c() {
        oyf oyfVarM19169b;
        synchronized (this) {
            oyfVarM19169b = m19169b();
        }
        return oyfVarM19169b;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0046  */
    /* JADX WARN: Code duplicated, block: B:13:0x0053  */
    /* JADX WARN: Code duplicated, block: B:15:0x0065  */
    /* JADX WARN: Code duplicated, block: B:18:0x0078 A[LOOP:0: B:9:0x003c->B:18:0x0078, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x007d A[EDGE_INSN: B:21:0x007d->B:19:0x007d BREAK  A[LOOP:0: B:9:0x003c->B:18:0x0078], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x007d A[EDGE_INSN: B:22:0x007d->B:19:0x007d BREAK  A[LOOP:0: B:9:0x003c->B:18:0x0078], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public final oyf m19171d(int i) {
        int i2;
        oyf[] oyfVarArr;
        int i3;
        oyf oyfVar;
        oyf oyfVar2;
        oyf oyfVar3;
        oyf oyfVar4;
        boolean z = oqu.f46432a;
        oyf[] oyfVarArr2 = this.f46813b;
        oyfVarArr2.getClass();
        m19172e(m19168a() - 1);
        if (i < m19168a()) {
            m19167h(i, m19168a());
            int i4 = i - 1;
            if (i <= 0) {
                while (true) {
                    i2 = i + i + 1;
                    if (i2 < m19168a()) {
                        break;
                        break;
                    }
                    oyfVarArr = this.f46813b;
                    oyfVarArr.getClass();
                    i3 = i2 + 1;
                    if (i3 < m19168a()) {
                        oyfVar3 = oyfVarArr[i3];
                        oyfVar3.getClass();
                        oyfVar4 = oyfVarArr[i2];
                        oyfVar4.getClass();
                        if (((Comparable) oyfVar3).compareTo(oyfVar4) < 0) {
                            i2 = i3;
                        }
                    }
                    oyfVar = oyfVarArr[i];
                    oyfVar.getClass();
                    oyfVar2 = oyfVarArr[i2];
                    oyfVar2.getClass();
                    if (((Comparable) oyfVar).compareTo(oyfVar2) > 0) {
                        break;
                        break;
                    }
                    m19167h(i, i2);
                    i = i2;
                }
            } else {
                int i5 = i4 / 2;
                oyf oyfVar5 = oyfVarArr2[i];
                oyfVar5.getClass();
                oyf oyfVar6 = oyfVarArr2[i5];
                oyfVar6.getClass();
                if (((Comparable) oyfVar5).compareTo(oyfVar6) >= 0) {
                    while (true) {
                        i2 = i + i + 1;
                        if (i2 < m19168a()) {
                            break;
                        }
                        oyfVarArr = this.f46813b;
                        oyfVarArr.getClass();
                        i3 = i2 + 1;
                        if (i3 < m19168a()) {
                            oyfVar3 = oyfVarArr[i3];
                            oyfVar3.getClass();
                            oyfVar4 = oyfVarArr[i2];
                            oyfVar4.getClass();
                            if (((Comparable) oyfVar3).compareTo(oyfVar4) < 0) {
                                i2 = i3;
                            }
                        }
                        oyfVar = oyfVarArr[i];
                        oyfVar.getClass();
                        oyfVar2 = oyfVarArr[i2];
                        oyfVar2.getClass();
                        if (((Comparable) oyfVar).compareTo(oyfVar2) > 0) {
                            break;
                        }
                        m19167h(i, i2);
                        i = i2;
                    }
                } else {
                    m19167h(i, i5);
                    m19173f(i5);
                }
            }
        }
        oyf oyfVar7 = oyfVarArr2[m19168a()];
        oyfVar7.getClass();
        oyfVar7.mo18963e(null);
        oyfVar7.mo18964f(-1);
        oyfVarArr2[m19168a()] = null;
        return oyfVar7;
    }

    /* JADX INFO: renamed from: e */
    public final void m19172e(int i) {
        this.f46812a.f46391b = i;
    }

    /* JADX INFO: renamed from: f */
    public final void m19173f(int i) {
        while (i > 0) {
            oyf[] oyfVarArr = this.f46813b;
            oyfVarArr.getClass();
            int i2 = (i - 1) >> 1;
            oyf oyfVar = oyfVarArr[i2];
            oyfVar.getClass();
            oyf oyfVar2 = oyfVarArr[i];
            oyfVar2.getClass();
            if (((Comparable) oyfVar).compareTo(oyfVar2) <= 0) {
                return;
            }
            m19167h(i, i2);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m19174g() {
        return m19168a() == 0;
    }
}
