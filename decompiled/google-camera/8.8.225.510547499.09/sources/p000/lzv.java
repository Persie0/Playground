package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class lzv {
    /* JADX INFO: renamed from: a */
    public Object mo16256a(lzb lzbVar, ols olsVar) {
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public Object mo16257c(lzb lzbVar, lxm lxmVar, ols olsVar) {
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public abstract Object mo16258e(long j, double d, lwh lwhVar, ols olsVar);

    /* JADX INFO: renamed from: f */
    public abstract Object mo16259f(long j, ols olsVar);

    /* JADX INFO: renamed from: g */
    public abstract Object mo16260g(lxm lxmVar, ols olsVar);

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX INFO: renamed from: h */
    public final Object m16261h(lzb lzbVar, double d, ols olsVar) {
        lzs lzsVar;
        double d2;
        if (olsVar instanceof lzs) {
            lzs lzsVar2 = (lzs) olsVar;
            int i = lzsVar2.f39659d;
            if ((i & Integer.MIN_VALUE) != 0) {
                lzsVar2.f39659d = i - Integer.MIN_VALUE;
                lzsVar = lzsVar2;
            } else {
                lzsVar = new lzs(this, olsVar);
            }
        } else {
            lzsVar = new lzs(this, olsVar);
        }
        Object obj = lzsVar.f39657b;
        Object obj2 = oma.COROUTINE_SUSPENDED;
        switch (lzsVar.f39659d) {
            case 0:
                lkm.m15592s(obj);
                long j = lzbVar.f39611u;
                lzsVar.f39660e = lzbVar;
                lzsVar.f39656a = d;
                lzsVar.f39659d = 1;
                if (mo16262i(j, d, lzsVar) == obj2) {
                    return obj2;
                }
                d2 = d;
                break;
                break;
            case 1:
                double d3 = lzsVar.f39656a;
                lzbVar = lzsVar.f39660e;
                lkm.m15592s(obj);
                d2 = d3;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return lzb.m16222c(lzbVar, null, null, lxv.m16126a(lzbVar.f39610t, null, null, null, null, d2, 31), 3145727);
    }

    /* JADX INFO: renamed from: i */
    public abstract Object mo16262i(long j, double d, ols olsVar);

    /* JADX INFO: renamed from: j */
    public Object mo16263j(lzb lzbVar, lxm lxmVar, boolean z, oni oniVar, ols olsVar) {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public final Object m16264l(lzb lzbVar, String str, ols olsVar) {
        lzu lzuVar;
        if (olsVar instanceof lzu) {
            lzuVar = (lzu) olsVar;
            int i = lzuVar.f39671c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lzuVar.f39671c = i - Integer.MIN_VALUE;
            } else {
                lzuVar = new lzu(this, olsVar);
            }
        } else {
            lzuVar = new lzu(this, olsVar);
        }
        Object obj = lzuVar.f39669a;
        Object obj2 = oma.COROUTINE_SUSPENDED;
        switch (lzuVar.f39671c) {
            case 0:
                lkm.m15592s(obj);
                long j = lzbVar.f39611u;
                lzuVar.f39672d = lzbVar;
                lzuVar.f39673e = str;
                lzuVar.f39671c = 1;
                if (mo16265m(j, str, lzuVar) == obj2) {
                    return obj2;
                }
                break;
            case 1:
                str = lzuVar.f39673e;
                lzbVar = lzuVar.f39672d;
                lkm.m15592s(obj);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return lzb.m16222c(lzbVar, null, str, null, 4128767);
    }

    /* JADX INFO: renamed from: m */
    public abstract Object mo16265m(long j, String str, ols olsVar);

    /* JADX INFO: renamed from: n */
    public abstract Object mo16266n(long j, lwh lwhVar, ols olsVar);

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX INFO: renamed from: p */
    public final Object m16267p(lzb lzbVar, lvn lvnVar, nzw nzwVar, ols olsVar) {
        lzp lzpVar;
        nzw nzwVar2;
        if (olsVar instanceof lzp) {
            lzp lzpVar2 = (lzp) olsVar;
            int i = lzpVar2.f39642c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lzpVar2.f39642c = i - Integer.MIN_VALUE;
                lzpVar = lzpVar2;
            } else {
                lzpVar = new lzp(this, olsVar);
            }
        } else {
            lzpVar = new lzp(this, olsVar);
        }
        Object obj = lzpVar.f39640a;
        Object obj2 = oma.COROUTINE_SUSPENDED;
        switch (lzpVar.f39642c) {
            case 0:
                lkm.m15592s(obj);
                long j = lzbVar.f39611u;
                lzpVar.f39643d = lzbVar;
                lzpVar.f39645f = lvnVar;
                lzpVar.f39644e = nzwVar;
                lzpVar.f39642c = 1;
                if (mo16268q(j, lvnVar, nzwVar, lwh.UPLOADED_TO_F250, lzpVar) == obj2) {
                    return obj2;
                }
                nzwVar2 = nzwVar;
                break;
            case 1:
                nzw nzwVar3 = lzpVar.f39644e;
                lvnVar = lzpVar.f39645f;
                lzbVar = lzpVar.f39643d;
                lkm.m15592s(obj);
                nzwVar2 = nzwVar3;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return lzb.m16222c(lzbVar, lvnVar, null, lxv.m16126a(lzbVar.f39610t, null, nzwVar2, null, lwh.UPLOADED_TO_F250, 1.0d, 11), 3145471);
    }

    /* JADX INFO: renamed from: q */
    public abstract Object mo16268q(long j, lvn lvnVar, nzw nzwVar, lwh lwhVar, ols olsVar);

    /* JADX WARN: Code duplicated, block: B:18:0x0078 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    static /* synthetic */ Object m16252b(lzv lzvVar, lzb lzbVar, ols olsVar) {
        lzq lzqVar;
        long j;
        maj majVar;
        if (olsVar instanceof lzq) {
            lzqVar = (lzq) olsVar;
            int i = lzqVar.f39647b;
            if ((i & Integer.MIN_VALUE) != 0) {
                lzqVar.f39647b = i - Integer.MIN_VALUE;
            } else {
                lzqVar = new lzq(lzvVar, olsVar);
            }
        } else {
            lzqVar = new lzq(lzvVar, olsVar);
        }
        Object obj = lzqVar.f39646a;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (lzqVar.f39647b) {
            case 0:
                lkm.m15592s(obj);
                long j2 = lzbVar.f39611u;
                lwh lwhVar = lwh.UPLOAD_FAILED_PERMANENTLY;
                lzqVar.f39650e = (maj) lzvVar;
                lzqVar.f39648c = lzbVar;
                lzqVar.f39647b = 1;
                if (lzvVar.mo16266n(j2, lwhVar, lzqVar) == omaVar) {
                    return omaVar;
                }
                j = lzbVar.f39611u;
                lzqVar.f39650e = null;
                lzqVar.f39648c = null;
                lzqVar.f39647b = 2;
                majVar = (maj) lzvVar;
                if (adr.m307c(majVar.f39706a, new mab(majVar, omn.m18689ac(new lvl[]{lvl.ANNOTATION, lvl.ATTACHMENT}), lwh.UPLOAD_FAILED_PERMANENTLY, j), lzqVar) == omaVar) {
                    return omaVar;
                }
                return oki.f46196a;
            case 1:
                lzbVar = lzqVar.f39648c;
                lzvVar = lzqVar.f39650e;
                lkm.m15592s(obj);
                j = lzbVar.f39611u;
                lzqVar.f39650e = null;
                lzqVar.f39648c = null;
                lzqVar.f39647b = 2;
                majVar = (maj) lzvVar;
                if (adr.m307c(majVar.f39706a, new mab(majVar, omn.m18689ac(new lvl[]{lvl.ANNOTATION, lvl.ATTACHMENT}), lwh.UPLOAD_FAILED_PERMANENTLY, j), lzqVar) == omaVar) {
                    return omaVar;
                }
                return oki.f46196a;
            case 2:
                lkm.m15592s(obj);
                return oki.f46196a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    static /* synthetic */ Object m16253d(lzv lzvVar, lzb lzbVar, lxm lxmVar, ols olsVar) {
        lzr lzrVar;
        lxm lxmVarM16117a;
        if (olsVar instanceof lzr) {
            lzrVar = (lzr) olsVar;
            int i = lzrVar.f39652b;
            if ((i & Integer.MIN_VALUE) != 0) {
                lzrVar.f39652b = i - Integer.MIN_VALUE;
            } else {
                lzrVar = new lzr(lzvVar, olsVar);
            }
        } else {
            lzrVar = new lzr(lzvVar, olsVar);
        }
        Object obj = lzrVar.f39651a;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (lzrVar.f39652b) {
            case 0:
                lkm.m15592s(obj);
                long j = lzbVar.f39611u;
                lwh lwhVar = lwh.UPLOAD_PAUSED;
                lzrVar.f39655e = (maj) lzvVar;
                lzrVar.f39653c = lxmVar;
                lzrVar.f39652b = 1;
                if (lzvVar.mo16266n(j, lwhVar, lzrVar) == omaVar) {
                    return omaVar;
                }
                lxmVarM16117a = lxm.m16117a(lxmVar, null, null, lxv.m16126a(lxmVar.f39520j, null, null, null, lwh.UPLOAD_PAUSED, 0.0d, 47), 1535);
                lzrVar.f39655e = null;
                lzrVar.f39653c = null;
                lzrVar.f39652b = 2;
                if (lzvVar.mo16260g(lxmVarM16117a, lzrVar) == omaVar) {
                    return omaVar;
                }
                return oki.f46196a;
            case 1:
                lxmVar = lzrVar.f39653c;
                lzvVar = lzrVar.f39655e;
                lkm.m15592s(obj);
                lxmVarM16117a = lxm.m16117a(lxmVar, null, null, lxv.m16126a(lxmVar.f39520j, null, null, null, lwh.UPLOAD_PAUSED, 0.0d, 47), 1535);
                lzrVar.f39655e = null;
                lzrVar.f39653c = null;
                lzrVar.f39652b = 2;
                if (lzvVar.mo16260g(lxmVarM16117a, lzrVar) == omaVar) {
                    return omaVar;
                }
                return oki.f46196a;
            case 2:
                lkm.m15592s(obj);
                return oki.f46196a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0099  */
    /* JADX WARN: Code duplicated, block: B:23:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ea A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: k */
    static /* synthetic */ Object m16254k(lzv lzvVar, lzb lzbVar, lxm lxmVar, boolean z, oni oniVar, ols olsVar) {
        lzt lztVar;
        lzb lzbVar2;
        oni oniVar2;
        boolean z2;
        Object objMo16259f;
        lzv lzvVar2;
        boolean z3;
        lzb lzbVar3;
        double dDoubleValue;
        long j;
        lzb lzbVar4;
        double d;
        long j2;
        lwh lwhVar;
        lzb lzbVar5;
        double d2;
        lxv lxvVar;
        lwh lwhVar2;
        lzv lzvVar3 = lzvVar;
        if (olsVar instanceof lzt) {
            lztVar = (lzt) olsVar;
            int i = lztVar.f39665e;
            if ((i & Integer.MIN_VALUE) != 0) {
                lztVar.f39665e = i - Integer.MIN_VALUE;
            } else {
                lztVar = new lzt(lzvVar, olsVar);
            }
        } else {
            lztVar = new lzt(lzvVar, olsVar);
        }
        Object obj = lztVar.f39664d;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (lztVar.f39665e) {
            case 0:
                lkm.m15592s(obj);
                lztVar.f39661a = lzvVar3;
                lzbVar2 = lzbVar;
                lztVar.f39666f = lzbVar2;
                oniVar2 = oniVar;
                lztVar.f39667g = oniVar2;
                z2 = z;
                lztVar.f39662b = z2;
                lztVar.f39665e = 1;
                if (lzvVar.mo16260g(lxmVar, lztVar) != omaVar) {
                    long j3 = lzbVar2.f39611u;
                    lztVar.f39661a = lzvVar3;
                    lztVar.f39666f = lzbVar2;
                    lztVar.f39667g = oniVar2;
                    lztVar.f39662b = z2;
                    lztVar.f39665e = 2;
                    objMo16259f = lzvVar3.mo16259f(j3, lztVar);
                    if (objMo16259f != omaVar) {
                        lzvVar2 = lzvVar3;
                        z3 = z2;
                        lzbVar3 = lzbVar2;
                        obj = objMo16259f;
                        dDoubleValue = ((Number) oniVar2.mo1803a(omn.m18698c(((Number) obj).doubleValue()))).doubleValue();
                        j = lzbVar3.f39611u;
                        lztVar.f39661a = lzvVar2;
                        lztVar.f39666f = lzbVar3;
                        lztVar.f39667g = null;
                        lztVar.f39662b = z3;
                        lztVar.f39663c = dDoubleValue;
                        lztVar.f39665e = 3;
                        if (lzvVar2.mo16262i(j, dDoubleValue, lztVar) != omaVar) {
                            lzbVar4 = lzbVar3;
                            if (z3) {
                                j2 = lzbVar4.f39611u;
                                lwhVar = lwh.UPLOAD_PAUSED;
                                lztVar.f39661a = lzbVar4;
                                lztVar.f39666f = null;
                                lztVar.f39662b = true;
                                lztVar.f39663c = dDoubleValue;
                                lztVar.f39665e = 4;
                                if (lzvVar2.mo16266n(j2, lwhVar, lztVar) != omaVar) {
                                    return omaVar;
                                }
                                lzbVar5 = lzbVar4;
                                d2 = dDoubleValue;
                                d = d2;
                                lzbVar4 = lzbVar5;
                            } else {
                                d = dDoubleValue;
                            }
                            lxvVar = lzbVar4.f39610t;
                            if (z3) {
                                lwhVar2 = lwh.UPLOAD_PAUSED;
                            } else {
                                lwhVar2 = lxvVar.f39541e;
                            }
                            return lzb.m16222c(lzbVar4, null, null, lxv.m16126a(lxvVar, null, null, null, lwhVar2, d, 15), 3145727);
                        }
                    }
                }
                return omaVar;
            case 1:
                boolean z4 = lztVar.f39662b;
                oniVar2 = lztVar.f39667g;
                lzb lzbVar6 = lztVar.f39666f;
                lzv lzvVar4 = (lzv) lztVar.f39661a;
                lkm.m15592s(obj);
                lzbVar2 = lzbVar6;
                z2 = z4;
                lzvVar3 = lzvVar4;
                long j4 = lzbVar2.f39611u;
                lztVar.f39661a = lzvVar3;
                lztVar.f39666f = lzbVar2;
                lztVar.f39667g = oniVar2;
                lztVar.f39662b = z2;
                lztVar.f39665e = 2;
                objMo16259f = lzvVar3.mo16259f(j4, lztVar);
                if (objMo16259f != omaVar) {
                    lzvVar2 = lzvVar3;
                    z3 = z2;
                    lzbVar3 = lzbVar2;
                    obj = objMo16259f;
                    dDoubleValue = ((Number) oniVar2.mo1803a(omn.m18698c(((Number) obj).doubleValue()))).doubleValue();
                    j = lzbVar3.f39611u;
                    lztVar.f39661a = lzvVar2;
                    lztVar.f39666f = lzbVar3;
                    lztVar.f39667g = null;
                    lztVar.f39662b = z3;
                    lztVar.f39663c = dDoubleValue;
                    lztVar.f39665e = 3;
                    if (lzvVar2.mo16262i(j, dDoubleValue, lztVar) != omaVar) {
                        lzbVar4 = lzbVar3;
                        if (z3) {
                            j2 = lzbVar4.f39611u;
                            lwhVar = lwh.UPLOAD_PAUSED;
                            lztVar.f39661a = lzbVar4;
                            lztVar.f39666f = null;
                            lztVar.f39662b = true;
                            lztVar.f39663c = dDoubleValue;
                            lztVar.f39665e = 4;
                            if (lzvVar2.mo16266n(j2, lwhVar, lztVar) != omaVar) {
                                return omaVar;
                            }
                            lzbVar5 = lzbVar4;
                            d2 = dDoubleValue;
                            d = d2;
                            lzbVar4 = lzbVar5;
                        } else {
                            d = dDoubleValue;
                        }
                        lxvVar = lzbVar4.f39610t;
                        if (z3) {
                            lwhVar2 = lwh.UPLOAD_PAUSED;
                        } else {
                            lwhVar2 = lxvVar.f39541e;
                        }
                        return lzb.m16222c(lzbVar4, null, null, lxv.m16126a(lxvVar, null, null, null, lwhVar2, d, 15), 3145727);
                    }
                }
                return omaVar;
            case 2:
                z3 = lztVar.f39662b;
                oniVar2 = lztVar.f39667g;
                lzbVar3 = lztVar.f39666f;
                lzv lzvVar5 = (lzv) lztVar.f39661a;
                lkm.m15592s(obj);
                lzvVar2 = lzvVar5;
                dDoubleValue = ((Number) oniVar2.mo1803a(omn.m18698c(((Number) obj).doubleValue()))).doubleValue();
                j = lzbVar3.f39611u;
                lztVar.f39661a = lzvVar2;
                lztVar.f39666f = lzbVar3;
                lztVar.f39667g = null;
                lztVar.f39662b = z3;
                lztVar.f39663c = dDoubleValue;
                lztVar.f39665e = 3;
                if (lzvVar2.mo16262i(j, dDoubleValue, lztVar) != omaVar) {
                    lzbVar4 = lzbVar3;
                    if (z3) {
                        j2 = lzbVar4.f39611u;
                        lwhVar = lwh.UPLOAD_PAUSED;
                        lztVar.f39661a = lzbVar4;
                        lztVar.f39666f = null;
                        lztVar.f39662b = true;
                        lztVar.f39663c = dDoubleValue;
                        lztVar.f39665e = 4;
                        if (lzvVar2.mo16266n(j2, lwhVar, lztVar) != omaVar) {
                            return omaVar;
                        }
                        lzbVar5 = lzbVar4;
                        d2 = dDoubleValue;
                        d = d2;
                        lzbVar4 = lzbVar5;
                    } else {
                        d = dDoubleValue;
                    }
                    lxvVar = lzbVar4.f39610t;
                    if (z3) {
                        lwhVar2 = lwh.UPLOAD_PAUSED;
                    } else {
                        lwhVar2 = lxvVar.f39541e;
                    }
                    return lzb.m16222c(lzbVar4, null, null, lxv.m16126a(lxvVar, null, null, null, lwhVar2, d, 15), 3145727);
                }
                return omaVar;
            case 3:
                double d3 = lztVar.f39663c;
                z3 = lztVar.f39662b;
                lzbVar4 = lztVar.f39666f;
                lzvVar2 = (lzv) lztVar.f39661a;
                lkm.m15592s(obj);
                dDoubleValue = d3;
                if (z3) {
                    j2 = lzbVar4.f39611u;
                    lwhVar = lwh.UPLOAD_PAUSED;
                    lztVar.f39661a = lzbVar4;
                    lztVar.f39666f = null;
                    lztVar.f39662b = true;
                    lztVar.f39663c = dDoubleValue;
                    lztVar.f39665e = 4;
                    if (lzvVar2.mo16266n(j2, lwhVar, lztVar) != omaVar) {
                        return omaVar;
                    }
                    lzbVar5 = lzbVar4;
                    d2 = dDoubleValue;
                    d = d2;
                    lzbVar4 = lzbVar5;
                } else {
                    d = dDoubleValue;
                }
                lxvVar = lzbVar4.f39610t;
                if (z3) {
                    lwhVar2 = lwh.UPLOAD_PAUSED;
                } else {
                    lwhVar2 = lxvVar.f39541e;
                }
                return lzb.m16222c(lzbVar4, null, null, lxv.m16126a(lxvVar, null, null, null, lwhVar2, d, 15), 3145727);
            case 4:
                d2 = lztVar.f39663c;
                z3 = lztVar.f39662b;
                lzbVar5 = (lzb) lztVar.f39661a;
                lkm.m15592s(obj);
                d = d2;
                lzbVar4 = lzbVar5;
                lxvVar = lzbVar4.f39610t;
                if (z3) {
                    lwhVar2 = lwh.UPLOAD_PAUSED;
                } else {
                    lwhVar2 = lxvVar.f39541e;
                }
                return lzb.m16222c(lzbVar4, null, null, lxv.m16126a(lxvVar, null, null, null, lwhVar2, d, 15), 3145727);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
