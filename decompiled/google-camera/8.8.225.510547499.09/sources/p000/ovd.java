package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ovd implements our {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ our f46633a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f46634b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f46635c;

    public ovd(our ourVar, lwv lwvVar, int i) {
        this.f46635c = i;
        this.f46633a = ourVar;
        this.f46634b = lwvVar;
    }

    public ovd(our ourVar, onm onmVar, int i) {
        this.f46635c = i;
        this.f46633a = ourVar;
        this.f46634b = onmVar;
    }

    public ovd(our ourVar, onn onnVar, int i) {
        this.f46635c = i;
        this.f46633a = ourVar;
        this.f46634b = onnVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x0100  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (r2.mo16102a(r10, r11, r0) == r4) goto L29;
     */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, onn] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, onn] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, onm] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, onn] */
    @Override // p000.our
    /* JADX INFO: renamed from: da */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo16104da(ous ousVar, ols olsVar) throws Throwable {
        ovc ovcVar;
        ovd ovdVar;
        ovz ovzVar;
        ?? r2;
        own ownVar;
        Throwable th;
        own ownVar2;
        ?? r10;
        ove oveVar;
        ovd ovdVar2;
        Throwable th2;
        switch (this.f46635c) {
            case 0:
                if (olsVar instanceof ovc) {
                    ovcVar = (ovc) olsVar;
                    int i = ovcVar.f46629b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ovcVar.f46629b = i - Integer.MIN_VALUE;
                    } else {
                        ovcVar = new ovc(this, olsVar);
                    }
                } else {
                    ovcVar = new ovc(this, olsVar);
                }
                Object obj = ovcVar.f46628a;
                oma omaVar = oma.COROUTINE_SUSPENDED;
                switch (ovcVar.f46629b) {
                    case 0:
                        lkm.m15592s(obj);
                        try {
                            our ourVar = this.f46633a;
                            ovcVar.f46631d = this;
                            ovcVar.f46632e = ousVar;
                            ovcVar.f46629b = 1;
                            if (ourVar.mo16104da(ousVar, ovcVar) != omaVar) {
                                ovdVar = this;
                                ownVar = new own(ousVar, ovcVar.mo18639d());
                                try {
                                    r10 = ovdVar.f46634b;
                                    ovcVar.f46631d = ownVar;
                                    ovcVar.f46632e = null;
                                    ovcVar.f46629b = 3;
                                    if (r10.mo16102a(ownVar, null, ovcVar) != omaVar) {
                                        ownVar2 = ownVar;
                                        ownVar2.mo18654h();
                                        return oki.f46196a;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    ownVar2 = ownVar;
                                    ownVar2.mo18654h();
                                    throw th;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            ovdVar = this;
                            ovzVar = new ovz(th);
                            r2 = ovdVar.f46634b;
                            ovcVar.f46631d = th;
                            ovcVar.f46632e = null;
                            ovcVar.f46629b = 2;
                            if (ook.m18777O(ovzVar, r2, th, ovcVar) == omaVar) {
                                throw th;
                            }
                        }
                        return omaVar;
                    case 1:
                        ousVar = ovcVar.f46632e;
                        ovdVar = (ovd) ovcVar.f46631d;
                        try {
                            lkm.m15592s(obj);
                            ownVar = new own(ousVar, ovcVar.mo18639d());
                            r10 = ovdVar.f46634b;
                            ovcVar.f46631d = ownVar;
                            ovcVar.f46632e = null;
                            ovcVar.f46629b = 3;
                            if (r10.mo16102a(ownVar, null, ovcVar) != omaVar) {
                                ownVar2 = ownVar;
                                ownVar2.mo18654h();
                                return oki.f46196a;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            ovzVar = new ovz(th);
                            r2 = ovdVar.f46634b;
                            ovcVar.f46631d = th;
                            ovcVar.f46632e = null;
                            ovcVar.f46629b = 2;
                            if (ook.m18777O(ovzVar, r2, th, ovcVar) == omaVar) {
                                throw th;
                            }
                        }
                        return omaVar;
                    case 2:
                        Throwable th6 = (Throwable) ovcVar.f46631d;
                        lkm.m15592s(obj);
                        throw th6;
                    case 3:
                        ownVar2 = (own) ovcVar.f46631d;
                        try {
                            lkm.m15592s(obj);
                            ownVar2.mo18654h();
                            return oki.f46196a;
                        } catch (Throwable th7) {
                            th = th7;
                            ownVar2.mo18654h();
                            throw th;
                        }
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            case 1:
                Object objMo16104da = this.f46633a.mo16104da(new mcz(ousVar, (lwv) this.f46634b, 1), olsVar);
                return objMo16104da == oma.COROUTINE_SUSPENDED ? objMo16104da : oki.f46196a;
            case 2:
                if (olsVar instanceof ove) {
                    oveVar = (ove) olsVar;
                    int i2 = oveVar.f46637b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        oveVar.f46637b = i2 - Integer.MIN_VALUE;
                    } else {
                        oveVar = new ove(this, olsVar, null);
                    }
                } else {
                    oveVar = new ove(this, olsVar, null);
                }
                Object objM18776N = oveVar.f46636a;
                oma omaVar2 = oma.COROUTINE_SUSPENDED;
                switch (oveVar.f46637b) {
                    case 0:
                        lkm.m15592s(objM18776N);
                        our ourVar2 = this.f46633a;
                        oveVar.f46640e = this;
                        oveVar.f46638c = ousVar;
                        oveVar.f46637b = 1;
                        objM18776N = ook.m18776N(ourVar2, ousVar, oveVar);
                        if (objM18776N != omaVar2) {
                            ovdVar2 = this;
                            th2 = (Throwable) objM18776N;
                            if (th2 != null) {
                                ?? r3 = ovdVar2.f46634b;
                                oveVar.f46640e = null;
                                oveVar.f46638c = null;
                                oveVar.f46637b = 2;
                                break;
                            }
                            return oki.f46196a;
                        }
                        return omaVar2;
                    case 1:
                        ousVar = oveVar.f46638c;
                        ovdVar2 = oveVar.f46640e;
                        lkm.m15592s(objM18776N);
                        th2 = (Throwable) objM18776N;
                        if (th2 != null) {
                            ?? r4 = ovdVar2.f46634b;
                            oveVar.f46640e = null;
                            oveVar.f46638c = null;
                            oveVar.f46637b = 2;
                            break;
                        }
                        return oki.f46196a;
                    case 2:
                        lkm.m15592s(objM18776N);
                        return oki.f46196a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            default:
                Object objM19089d = ovq.m19089d((ovq) this.f46633a, new mcz(ousVar, (onm) this.f46634b, 4), olsVar);
                return objM19089d == oma.COROUTINE_SUSPENDED ? objM19089d : oki.f46196a;
        }
    }
}
