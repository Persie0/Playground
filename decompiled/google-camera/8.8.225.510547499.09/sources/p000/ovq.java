package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ovq extends owb implements ovl, our {

    /* JADX INFO: renamed from: a */
    public Object[] f46675a;

    /* JADX INFO: renamed from: b */
    public long f46676b;

    /* JADX INFO: renamed from: c */
    public long f46677c;

    /* JADX INFO: renamed from: f */
    private final int f46678f;

    /* JADX INFO: renamed from: g */
    private final int f46679g;

    /* JADX INFO: renamed from: h */
    private int f46680h;

    /* JADX INFO: renamed from: i */
    private int f46681i;

    public ovq(int i, int i2) {
        this.f46678f = i;
        this.f46679g = i2;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x008b A[Catch: all -> 0x0114, TryCatch #0 {, blocks: (B:34:0x0081, B:36:0x008b, B:37:0x008e, B:39:0x009d, B:40:0x00a1), top: B:83:0x0081, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x008e A[Catch: all -> 0x0114, TryCatch #0 {, blocks: (B:34:0x0081, B:36:0x008b, B:37:0x008e, B:39:0x009d, B:40:0x00a1), top: B:83:0x0081, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x009d A[Catch: all -> 0x0114, TryCatch #0 {, blocks: (B:34:0x0081, B:36:0x008b, B:37:0x008e, B:39:0x009d, B:40:0x00a1), top: B:83:0x0081, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b4 A[Catch: all -> 0x0117, TryCatch #2 {all -> 0x0117, blocks: (B:32:0x007e, B:33:0x0080, B:42:0x00af, B:43:0x00b0, B:45:0x00b4, B:47:0x00b8, B:48:0x00bd, B:49:0x00c0, B:51:0x00c4, B:52:0x00db, B:57:0x00ec, B:58:0x00ed, B:60:0x00f5, B:64:0x00fb, B:65:0x00fc, B:67:0x00ff, B:68:0x0102, B:72:0x0115, B:73:0x0116, B:34:0x0081, B:36:0x008b, B:37:0x008e, B:39:0x009d, B:40:0x00a1, B:53:0x00dc, B:55:0x00e4, B:56:0x00e7), top: B:86:0x007e, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b8 A[Catch: all -> 0x0117, TryCatch #2 {all -> 0x0117, blocks: (B:32:0x007e, B:33:0x0080, B:42:0x00af, B:43:0x00b0, B:45:0x00b4, B:47:0x00b8, B:48:0x00bd, B:49:0x00c0, B:51:0x00c4, B:52:0x00db, B:57:0x00ec, B:58:0x00ed, B:60:0x00f5, B:64:0x00fb, B:65:0x00fc, B:67:0x00ff, B:68:0x0102, B:72:0x0115, B:73:0x0116, B:34:0x0081, B:36:0x008b, B:37:0x008e, B:39:0x009d, B:40:0x00a1, B:53:0x00dc, B:55:0x00e4, B:56:0x00e7), top: B:86:0x007e, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e4 A[Catch: all -> 0x00fa, TryCatch #4 {, blocks: (B:53:0x00dc, B:55:0x00e4, B:56:0x00e7), top: B:89:0x00dc, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e7 A[Catch: all -> 0x00fa, TRY_LEAVE, TryCatch #4 {, blocks: (B:53:0x00dc, B:55:0x00e4, B:56:0x00e7), top: B:89:0x00dc, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00f5 A[Catch: all -> 0x0117, TryCatch #2 {all -> 0x0117, blocks: (B:32:0x007e, B:33:0x0080, B:42:0x00af, B:43:0x00b0, B:45:0x00b4, B:47:0x00b8, B:48:0x00bd, B:49:0x00c0, B:51:0x00c4, B:52:0x00db, B:57:0x00ec, B:58:0x00ed, B:60:0x00f5, B:64:0x00fb, B:65:0x00fc, B:67:0x00ff, B:68:0x0102, B:72:0x0115, B:73:0x0116, B:34:0x0081, B:36:0x008b, B:37:0x008e, B:39:0x009d, B:40:0x00a1, B:53:0x00dc, B:55:0x00e4, B:56:0x00e7), top: B:86:0x007e, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ff A[Catch: all -> 0x0117, TryCatch #2 {all -> 0x0117, blocks: (B:32:0x007e, B:33:0x0080, B:42:0x00af, B:43:0x00b0, B:45:0x00b4, B:47:0x00b8, B:48:0x00bd, B:49:0x00c0, B:51:0x00c4, B:52:0x00db, B:57:0x00ec, B:58:0x00ed, B:60:0x00f5, B:64:0x00fb, B:65:0x00fc, B:67:0x00ff, B:68:0x0102, B:72:0x0115, B:73:0x0116, B:34:0x0081, B:36:0x008b, B:37:0x008e, B:39:0x009d, B:40:0x00a1, B:53:0x00dc, B:55:0x00e4, B:56:0x00e7), top: B:86:0x007e, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:83:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x00dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x00c4 A[SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    static /* synthetic */ Object m19089d(ovq ovqVar, ous ousVar, ols olsVar) throws Throwable {
        ovp ovpVar;
        ovs ovsVar;
        ovq ovqVar2;
        ovs ovsVar2;
        ous ousVar2;
        ory oryVar;
        ols[] olsVarArrM19102g;
        long jM19092m;
        Object objM19104a;
        Object obj;
        int i;
        opy opyVar;
        Object objM18887m;
        ovq ovqVar3 = ovqVar;
        ous ousVar3 = ousVar;
        if (olsVar instanceof ovp) {
            ovpVar = (ovp) olsVar;
            int i2 = ovpVar.f46670c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ovpVar.f46670c = i2 - Integer.MIN_VALUE;
            } else {
                ovpVar = new ovp(ovqVar3, olsVar);
            }
        } else {
            ovpVar = new ovp(ovqVar3, olsVar);
        }
        Object obj2 = ovpVar.f46668a;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (ovpVar.f46670c) {
            case 0:
                lkm.m15592s(obj2);
                ovsVar = (ovs) ovqVar.m19111i();
                try {
                    if (ousVar3 instanceof ovy) {
                        ovpVar.f46671d = ovqVar3;
                        ovpVar.f46672e = ousVar3;
                        ovpVar.f46673f = ovsVar;
                        ovpVar.f46670c = 1;
                        throw null;
                    }
                    ovqVar2 = ovqVar3;
                    ovsVar2 = ovsVar;
                    ousVar2 = ousVar3;
                    oryVar = (ory) ovpVar.mo18639d().get(ory.f46473c);
                    while (true) {
                        try {
                            olsVarArrM19102g = owc.f46704a;
                            synchronized (ovqVar2) {
                                jM19092m = ovqVar2.m19092m(ovsVar2);
                                if (jM19092m < 0) {
                                    obj = ovr.f46682a;
                                } else {
                                    long j = ovsVar2.f46683a;
                                    Object[] objArr = ovqVar2.f46675a;
                                    objArr.getClass();
                                    objM19104a = ovr.m19104a(objArr, jM19092m);
                                    if (objM19104a instanceof ovo) {
                                        objM19104a = ((ovo) objM19104a).f46666c;
                                    }
                                    ovsVar2.f46683a = jM19092m + 1;
                                    obj = objM19104a;
                                    olsVarArrM19102g = ovqVar2.m19102g(j);
                                }
                            }
                            for (ols olsVar2 : olsVarArrM19102g) {
                                if (olsVar2 != null) {
                                    olsVar2.mo18640e(oki.f46196a);
                                }
                            }
                            if (obj == ovr.f46682a) {
                                ovpVar.f46671d = ovqVar2;
                                ovpVar.f46672e = ousVar2;
                                ovpVar.f46673f = ovsVar2;
                                ovpVar.f46674g = oryVar;
                                ovpVar.f46670c = 2;
                                opyVar = new opy(omn.m18701f(ovpVar), 1);
                                opyVar.m18898x();
                                synchronized (ovqVar2) {
                                    if (ovqVar2.m19092m(ovsVar2) < 0) {
                                        ovsVar2.f46684b = opyVar;
                                    } else {
                                        opyVar.mo18640e(oki.f46196a);
                                    }
                                }
                                objM18887m = opyVar.m18887m();
                                if (objM18887m != oma.COROUTINE_SUSPENDED) {
                                    objM18887m = oki.f46196a;
                                }
                                if (objM18887m == omaVar) {
                                    return omaVar;
                                }
                            } else {
                                if (oryVar != null) {
                                    ooc.m18756v(oryVar);
                                }
                                ovpVar.f46671d = ovqVar2;
                                ovpVar.f46672e = ousVar2;
                                ovpVar.f46673f = ovsVar2;
                                ovpVar.f46674g = oryVar;
                                ovpVar.f46670c = 3;
                                if (ousVar2.mo16103a(obj, ovpVar) == omaVar) {
                                    return omaVar;
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            ovqVar2.m19112j(ovsVar2);
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    ovqVar2 = ovqVar3;
                    ovsVar2 = ovsVar;
                    ovqVar2.m19112j(ovsVar2);
                    throw th;
                }
                break;
            case 1:
                ovsVar2 = ovpVar.f46673f;
                ousVar3 = ovpVar.f46672e;
                ovq ovqVar4 = ovpVar.f46671d;
                try {
                    lkm.m15592s(obj2);
                    ovsVar = ovsVar2;
                    ovqVar3 = ovqVar4;
                    ovqVar2 = ovqVar3;
                    ovsVar2 = ovsVar;
                    ousVar2 = ousVar3;
                    oryVar = (ory) ovpVar.mo18639d().get(ory.f46473c);
                    while (true) {
                        olsVarArrM19102g = owc.f46704a;
                        synchronized (ovqVar2) {
                            jM19092m = ovqVar2.m19092m(ovsVar2);
                            if (jM19092m < 0) {
                                obj = ovr.f46682a;
                            } else {
                                long j2 = ovsVar2.f46683a;
                                Object[] objArr2 = ovqVar2.f46675a;
                                objArr2.getClass();
                                objM19104a = ovr.m19104a(objArr2, jM19092m);
                                if (objM19104a instanceof ovo) {
                                    objM19104a = ((ovo) objM19104a).f46666c;
                                }
                                ovsVar2.f46683a = jM19092m + 1;
                                obj = objM19104a;
                                olsVarArrM19102g = ovqVar2.m19102g(j2);
                            }
                            while (i < r9) {
                                if (olsVar2 != null) {
                                    olsVar2.mo18640e(oki.f46196a);
                                }
                            }
                            if (obj == ovr.f46682a) {
                                ovpVar.f46671d = ovqVar2;
                                ovpVar.f46672e = ousVar2;
                                ovpVar.f46673f = ovsVar2;
                                ovpVar.f46674g = oryVar;
                                ovpVar.f46670c = 2;
                                opyVar = new opy(omn.m18701f(ovpVar), 1);
                                opyVar.m18898x();
                                synchronized (ovqVar2) {
                                    if (ovqVar2.m19092m(ovsVar2) < 0) {
                                        ovsVar2.f46684b = opyVar;
                                    } else {
                                        opyVar.mo18640e(oki.f46196a);
                                    }
                                    objM18887m = opyVar.m18887m();
                                    if (objM18887m != oma.COROUTINE_SUSPENDED) {
                                        objM18887m = oki.f46196a;
                                    }
                                    if (objM18887m == omaVar) {
                                        return omaVar;
                                    }
                                }
                            } else {
                                if (oryVar != null) {
                                    ooc.m18756v(oryVar);
                                }
                                ovpVar.f46671d = ovqVar2;
                                ovpVar.f46672e = ousVar2;
                                ovpVar.f46673f = ovsVar2;
                                ovpVar.f46674g = oryVar;
                                ovpVar.f46670c = 3;
                                if (ousVar2.mo16103a(obj, ovpVar) == omaVar) {
                                    return omaVar;
                                }
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    ovqVar2 = ovqVar4;
                    ovqVar2.m19112j(ovsVar2);
                    throw th;
                }
                break;
            case 2:
                oryVar = ovpVar.f46674g;
                ovsVar2 = ovpVar.f46673f;
                ousVar2 = ovpVar.f46672e;
                ovqVar2 = ovpVar.f46671d;
                try {
                    lkm.m15592s(obj2);
                    while (true) {
                        olsVarArrM19102g = owc.f46704a;
                        synchronized (ovqVar2) {
                            jM19092m = ovqVar2.m19092m(ovsVar2);
                            if (jM19092m < 0) {
                                obj = ovr.f46682a;
                            } else {
                                long j3 = ovsVar2.f46683a;
                                Object[] objArr3 = ovqVar2.f46675a;
                                objArr3.getClass();
                                objM19104a = ovr.m19104a(objArr3, jM19092m);
                                if (objM19104a instanceof ovo) {
                                    objM19104a = ((ovo) objM19104a).f46666c;
                                }
                                ovsVar2.f46683a = jM19092m + 1;
                                obj = objM19104a;
                                olsVarArrM19102g = ovqVar2.m19102g(j3);
                            }
                            while (i < r9) {
                                if (olsVar2 != null) {
                                    olsVar2.mo18640e(oki.f46196a);
                                }
                            }
                            if (obj == ovr.f46682a) {
                                ovpVar.f46671d = ovqVar2;
                                ovpVar.f46672e = ousVar2;
                                ovpVar.f46673f = ovsVar2;
                                ovpVar.f46674g = oryVar;
                                ovpVar.f46670c = 2;
                                opyVar = new opy(omn.m18701f(ovpVar), 1);
                                opyVar.m18898x();
                                synchronized (ovqVar2) {
                                    if (ovqVar2.m19092m(ovsVar2) < 0) {
                                        ovsVar2.f46684b = opyVar;
                                    } else {
                                        opyVar.mo18640e(oki.f46196a);
                                    }
                                    objM18887m = opyVar.m18887m();
                                    if (objM18887m != oma.COROUTINE_SUSPENDED) {
                                        objM18887m = oki.f46196a;
                                    }
                                    if (objM18887m == omaVar) {
                                        return omaVar;
                                    }
                                }
                            } else {
                                if (oryVar != null) {
                                    ooc.m18756v(oryVar);
                                }
                                ovpVar.f46671d = ovqVar2;
                                ovpVar.f46672e = ousVar2;
                                ovpVar.f46673f = ovsVar2;
                                ovpVar.f46674g = oryVar;
                                ovpVar.f46670c = 3;
                                if (ousVar2.mo16103a(obj, ovpVar) == omaVar) {
                                    return omaVar;
                                }
                            }
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    ovqVar2.m19112j(ovsVar2);
                    throw th;
                }
                break;
            case 3:
                oryVar = ovpVar.f46674g;
                ovsVar2 = ovpVar.f46673f;
                ousVar2 = ovpVar.f46672e;
                ovqVar2 = ovpVar.f46671d;
                try {
                    lkm.m15592s(obj2);
                    while (true) {
                        olsVarArrM19102g = owc.f46704a;
                        synchronized (ovqVar2) {
                            jM19092m = ovqVar2.m19092m(ovsVar2);
                            if (jM19092m < 0) {
                                obj = ovr.f46682a;
                            } else {
                                long j4 = ovsVar2.f46683a;
                                Object[] objArr4 = ovqVar2.f46675a;
                                objArr4.getClass();
                                objM19104a = ovr.m19104a(objArr4, jM19092m);
                                if (objM19104a instanceof ovo) {
                                    objM19104a = ((ovo) objM19104a).f46666c;
                                }
                                ovsVar2.f46683a = jM19092m + 1;
                                obj = objM19104a;
                                olsVarArrM19102g = ovqVar2.m19102g(j4);
                            }
                            while (i < r9) {
                                if (olsVar2 != null) {
                                    olsVar2.mo18640e(oki.f46196a);
                                }
                            }
                            if (obj == ovr.f46682a) {
                                ovpVar.f46671d = ovqVar2;
                                ovpVar.f46672e = ousVar2;
                                ovpVar.f46673f = ovsVar2;
                                ovpVar.f46674g = oryVar;
                                ovpVar.f46670c = 2;
                                opyVar = new opy(omn.m18701f(ovpVar), 1);
                                opyVar.m18898x();
                                synchronized (ovqVar2) {
                                    if (ovqVar2.m19092m(ovsVar2) < 0) {
                                        ovsVar2.f46684b = opyVar;
                                    } else {
                                        opyVar.mo18640e(oki.f46196a);
                                    }
                                    objM18887m = opyVar.m18887m();
                                    if (objM18887m != oma.COROUTINE_SUSPENDED) {
                                        objM18887m = oki.f46196a;
                                    }
                                    if (objM18887m == omaVar) {
                                        return omaVar;
                                    }
                                }
                            } else {
                                if (oryVar != null) {
                                    ooc.m18756v(oryVar);
                                }
                                ovpVar.f46671d = ovqVar2;
                                ovpVar.f46672e = ousVar2;
                                ovpVar.f46673f = ovsVar2;
                                ovpVar.f46674g = oryVar;
                                ovpVar.f46670c = 3;
                                if (ousVar2.mo16103a(obj, ovpVar) == omaVar) {
                                    return omaVar;
                                }
                            }
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    ovqVar2.m19112j(ovsVar2);
                    throw th;
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: k */
    private final int m19090k() {
        return this.f46680h + this.f46681i;
    }

    /* JADX INFO: renamed from: l */
    private final long m19091l() {
        return m19099c() + ((long) this.f46680h);
    }

    /* JADX INFO: renamed from: m */
    private final long m19092m(ovs ovsVar) {
        long j = ovsVar.f46683a;
        if (j < m19091l()) {
            return j;
        }
        if (this.f46679g <= 0 && j <= m19099c() && this.f46681i != 0) {
            return j;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: n */
    private final void m19093n() {
        owd[] owdVarArr;
        Object[] objArr = this.f46675a;
        objArr.getClass();
        ovr.m19105b(objArr, m19099c(), null);
        this.f46680h--;
        long jM19099c = m19099c() + 1;
        if (this.f46676b < jM19099c) {
            this.f46676b = jM19099c;
        }
        if (this.f46677c < jM19099c) {
            if (this.f46703e != 0 && (owdVarArr = this.f46702d) != null) {
                for (owd owdVar : owdVarArr) {
                    if (owdVar != null) {
                        ovs ovsVar = (ovs) owdVar;
                        long j = ovsVar.f46683a;
                        if (j >= 0 && j < jM19099c) {
                            ovsVar.f46683a = jM19099c;
                        }
                    }
                }
            }
            this.f46677c = jM19099c;
        }
        boolean z = oqu.f46432a;
    }

    /* JADX INFO: renamed from: o */
    private final void m19094o(Object obj) {
        int iM19090k = m19090k();
        Object[] objArrM19097r = this.f46675a;
        if (objArrM19097r == null) {
            objArrM19097r = m19097r(null, 0, 2);
        } else {
            int length = objArrM19097r.length;
            if (iM19090k >= length) {
                objArrM19097r = m19097r(objArrM19097r, iM19090k, length + length);
            }
        }
        ovr.m19105b(objArrM19097r, m19099c() + ((long) iM19090k), obj);
    }

    /* JADX INFO: renamed from: p */
    private final void m19095p(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        boolean z = oqu.f46432a;
        for (long jM19099c = m19099c(); jM19099c < jMin; jM19099c++) {
            Object[] objArr = this.f46675a;
            objArr.getClass();
            ovr.m19105b(objArr, jM19099c, null);
        }
        this.f46676b = j;
        this.f46677c = j2;
        this.f46680h = (int) (j3 - jMin);
        this.f46681i = (int) (j4 - j3);
    }

    /* JADX INFO: renamed from: q */
    private final boolean m19096q(Object obj) {
        if (this.f46703e == 0) {
            boolean z = oqu.f46432a;
            if (this.f46678f != 0) {
                m19094o(obj);
                int i = this.f46680h + 1;
                this.f46680h = i;
                if (i > this.f46678f) {
                    m19093n();
                }
                this.f46677c = m19099c() + ((long) this.f46680h);
            }
            return true;
        }
        if (this.f46680h >= this.f46679g && this.f46677c <= this.f46676b) {
            return false;
        }
        m19094o(obj);
        int i2 = this.f46680h + 1;
        this.f46680h = i2;
        if (i2 > this.f46679g) {
            m19093n();
        }
        long jM19099c = m19099c() + ((long) this.f46680h);
        long j = this.f46676b;
        if (((int) (jM19099c - j)) > this.f46678f) {
            m19095p(j + 1, this.f46677c, m19091l(), ((long) this.f46681i) + m19099c() + ((long) this.f46680h));
        }
        return true;
    }

    /* JADX INFO: renamed from: r */
    private final Object[] m19097r(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i2];
        this.f46675a = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long jM19099c = m19099c();
        for (int i3 = 0; i3 < i; i3++) {
            long j = ((long) i3) + jM19099c;
            ovr.m19105b(objArr2, j, ovr.m19104a(objArr, j));
        }
        return objArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [ols[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX INFO: renamed from: s */
    private final ols[] m19098s(ols[] olsVarArr) {
        owd[] owdVarArr;
        ovs ovsVar;
        ols olsVar;
        if (this.f46703e != 0 && (owdVarArr = this.f46702d) != null) {
            int length = olsVarArr.length;
            int i = 0;
            olsVarArr = olsVarArr;
            while (i < owdVarArr.length) {
                owd owdVar = owdVarArr[i];
                if (owdVar != null && (olsVar = (ovsVar = (ovs) owdVar).f46684b) != null && m19092m(ovsVar) >= 0) {
                    int length2 = olsVarArr.length;
                    if (length >= length2) {
                        olsVarArr = olsVarArr;
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) olsVarArr, Math.max(2, length2 + length2));
                        objArrCopyOf.getClass();
                        olsVarArr = objArrCopyOf;
                    }
                    olsVarArr = olsVarArr;
                    ((ols[]) olsVarArr)[length] = olsVar;
                    ovsVar.f46684b = null;
                    length++;
                }
                i++;
                olsVarArr = olsVarArr;
            }
        }
        return (ols[]) olsVarArr;
    }

    @Override // p000.ovl, p000.ous
    /* JADX INFO: renamed from: a */
    public final Object mo16103a(Object obj, ols olsVar) {
        ols[] olsVarArrM19098s;
        ovo ovoVar;
        if (mo19085b(obj)) {
            return oki.f46196a;
        }
        opy opyVar = new opy(omn.m18701f(olsVar), 1);
        opyVar.m18898x();
        ols[] olsVarArrM19098s2 = owc.f46704a;
        synchronized (this) {
            if (m19096q(obj)) {
                opyVar.mo18640e(oki.f46196a);
                olsVarArrM19098s = m19098s(olsVarArrM19098s2);
                ovoVar = null;
            } else {
                ovo ovoVar2 = new ovo(this, ((long) m19090k()) + m19099c(), obj, opyVar);
                m19094o(ovoVar2);
                this.f46681i++;
                if (this.f46679g == 0) {
                    olsVarArrM19098s2 = m19098s(olsVarArrM19098s2);
                }
                olsVarArrM19098s = olsVarArrM19098s2;
                ovoVar = ovoVar2;
            }
        }
        if (ovoVar != null) {
            ook.m18772J(opyVar, ovoVar);
        }
        for (ols olsVar2 : olsVarArrM19098s) {
            if (olsVar2 != null) {
                olsVar2.mo18640e(oki.f46196a);
            }
        }
        Object objM18887m = opyVar.m18887m();
        oma omaVar = oma.COROUTINE_SUSPENDED;
        if (objM18887m == omaVar) {
            olsVar.getClass();
        }
        if (objM18887m != omaVar) {
            objM18887m = oki.f46196a;
        }
        return objM18887m != omaVar ? oki.f46196a : objM18887m;
    }

    @Override // p000.ovl
    /* JADX INFO: renamed from: b */
    public final boolean mo19085b(Object obj) {
        int i;
        boolean z;
        ols[] olsVarArrM19098s = owc.f46704a;
        synchronized (this) {
            if (m19096q(obj)) {
                olsVarArrM19098s = m19098s(olsVarArrM19098s);
                z = true;
            } else {
                z = false;
            }
        }
        for (ols olsVar : olsVarArrM19098s) {
            if (olsVar != null) {
                olsVar.mo18640e(oki.f46196a);
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    public final long m19099c() {
        return Math.min(this.f46677c, this.f46676b);
    }

    @Override // p000.ovn, p000.our
    /* JADX INFO: renamed from: da */
    public final Object mo16104da(ous ousVar, ols olsVar) {
        return m19089d(this, ousVar, olsVar);
    }

    @Override // p000.owb
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ owd mo19100e() {
        return new ovs();
    }

    /* JADX INFO: renamed from: f */
    public final void m19101f() {
        if (this.f46679g != 0 || this.f46681i > 1) {
            Object[] objArr = this.f46675a;
            objArr.getClass();
            while (this.f46681i > 0 && ovr.m19104a(objArr, (m19099c() + ((long) m19090k())) - 1) == ovr.f46682a) {
                this.f46681i--;
                ovr.m19105b(objArr, m19099c() + ((long) m19090k()), null);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:69:0x0102 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x0103  */
    /* JADX INFO: renamed from: g */
    public final ols[] m19102g(long j) {
        long j2;
        long j3;
        long j4;
        ols[] olsVarArr;
        long j5;
        long jMax;
        long j6;
        long j7;
        owd[] owdVarArr;
        boolean z = oqu.f46432a;
        if (j > this.f46677c) {
            return owc.f46704a;
        }
        long jM19099c = m19099c();
        long j8 = ((long) this.f46680h) + jM19099c;
        if (this.f46679g == 0 && this.f46681i > 0) {
            j8++;
        }
        int i = 0;
        if (this.f46703e != 0 && (owdVarArr = this.f46702d) != null) {
            for (owd owdVar : owdVarArr) {
                if (owdVar != null) {
                    long j9 = ((ovs) owdVar).f46683a;
                    if (j9 >= 0 && j9 < j8) {
                        j8 = j9;
                    }
                }
            }
        }
        if (j8 <= this.f46677c) {
            return owc.f46704a;
        }
        long jM19091l = m19091l();
        int iMin = this.f46703e > 0 ? Math.min(this.f46681i, this.f46679g - ((int) (jM19091l - j8))) : this.f46681i;
        ols[] olsVarArr2 = owc.f46704a;
        long j10 = ((long) this.f46681i) + jM19091l;
        if (iMin > 0) {
            olsVarArr2 = new ols[iMin];
            Object[] objArr = this.f46675a;
            objArr.getClass();
            j4 = jM19091l;
            while (true) {
                if (jM19091l < j10) {
                    Object objM19104a = ovr.m19104a(objArr, jM19091l);
                    j2 = j8;
                    oxz oxzVar = ovr.f46682a;
                    if (objM19104a != oxzVar) {
                        objM19104a.getClass();
                        int i2 = i + 1;
                        ovo ovoVar = (ovo) objM19104a;
                        j3 = j10;
                        olsVarArr2[i] = ovoVar.f46667d;
                        ovr.m19105b(objArr, jM19091l, oxzVar);
                        ovr.m19105b(objArr, j4, ovoVar.f46666c);
                        j7 = 1;
                        j4++;
                        if (i2 >= iMin) {
                            olsVarArr = olsVarArr2;
                            break;
                        }
                        i = i2;
                    } else {
                        j3 = j10;
                        j7 = 1;
                    }
                    jM19091l += j7;
                    j8 = j2;
                    j10 = j3;
                } else {
                    j2 = j8;
                    j3 = j10;
                }
            }
            long j11 = j4 - jM19099c;
            if (this.f46703e == 0) {
                j5 = j4;
            } else {
                j5 = j2;
            }
            jMax = Math.max(this.f46676b, j4 - ((long) Math.min(this.f46678f, (int) j11)));
            if (this.f46679g == 0 || jMax >= j3) {
                j6 = jMax;
            } else {
                Object[] objArr2 = this.f46675a;
                objArr2.getClass();
                if (ooc.m18737c(ovr.m19104a(objArr2, jMax), ovr.f46682a)) {
                    j4++;
                    j6 = jMax + 1;
                } else {
                    j6 = jMax;
                }
            }
            m19095p(j6, j5, j4, j3);
            m19101f();
            if (olsVarArr.length == 0) {
                return olsVarArr;
            }
            return m19098s(olsVarArr);
        }
        j2 = j8;
        j3 = j10;
        j4 = jM19091l;
        olsVarArr = olsVarArr2;
        long j12 = j4 - jM19099c;
        if (this.f46703e == 0) {
            j5 = j4;
        } else {
            j5 = j2;
        }
        jMax = Math.max(this.f46676b, j4 - ((long) Math.min(this.f46678f, (int) j12)));
        if (this.f46679g == 0) {
            j6 = jMax;
        } else {
            j6 = jMax;
        }
        m19095p(j6, j5, j4, j3);
        m19101f();
        if (olsVarArr.length == 0) {
            return olsVarArr;
        }
        return m19098s(olsVarArr);
    }

    @Override // p000.owb
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ owd[] mo19103h() {
        return new ovs[2];
    }
}
