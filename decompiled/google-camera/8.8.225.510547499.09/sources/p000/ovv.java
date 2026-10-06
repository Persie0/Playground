package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ovv extends owb implements ovm, our {

    /* JADX INFO: renamed from: a */
    private final opn f46693a;

    /* JADX INFO: renamed from: b */
    private int f46694b;

    public ovv(Object obj) {
        this.f46693a = ook.m18796j(obj);
    }

    /* JADX INFO: renamed from: f */
    private final boolean m19109f(Object obj, Object obj2) {
        int i;
        owd[] owdVarArr;
        oxz oxzVar;
        synchronized (this) {
            Object obj3 = this.f46693a.f46397a;
            if (obj != null && !ooc.m18737c(obj3, obj)) {
                return false;
            }
            if (ooc.m18737c(obj3, obj2)) {
                return true;
            }
            this.f46693a.m18855c(obj2);
            int i2 = this.f46694b;
            if ((i2 & 1) != 0) {
                this.f46694b = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.f46694b = i3;
            owd[] owdVarArr2 = this.f46702d;
            while (true) {
                ovx[] ovxVarArr = (ovx[]) owdVarArr2;
                if (ovxVarArr != null) {
                    for (ovx ovxVar : ovxVarArr) {
                        if (ovxVar != null) {
                            opn opnVar = ovxVar.f46697a;
                            while (true) {
                                Object obj4 = opnVar.f46397a;
                                if (obj4 == null || obj4 == (oxzVar = ovw.f46696b)) {
                                    break;
                                }
                                oxz oxzVar2 = ovw.f46695a;
                                if (obj4 != oxzVar2) {
                                    if (ovxVar.f46697a.m18856d(obj4, oxzVar2)) {
                                        ((opy) obj4).mo18640e(oki.f46196a);
                                        break;
                                    }
                                } else {
                                    if (ovxVar.f46697a.m18856d(obj4, oxzVar)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.f46694b;
                    if (i == i3) {
                        this.f46694b = i3 + 1;
                        return true;
                    }
                    owdVarArr = this.f46702d;
                }
                owdVarArr2 = owdVarArr;
                i3 = i;
            }
        }
    }

    @Override // p000.ovl, p000.ous
    /* JADX INFO: renamed from: a */
    public final Object mo16103a(Object obj, ols olsVar) {
        mo19087d(obj);
        return oki.f46196a;
    }

    @Override // p000.ovl
    /* JADX INFO: renamed from: b */
    public final boolean mo19085b(Object obj) {
        throw null;
    }

    @Override // p000.ovm
    /* JADX INFO: renamed from: c */
    public final Object mo19086c() {
        oxz oxzVar = owm.f46723a;
        Object obj = this.f46693a.f46397a;
        if (obj == oxzVar) {
            return null;
        }
        return obj;
    }

    @Override // p000.ovm
    /* JADX INFO: renamed from: d */
    public final void mo19087d(Object obj) {
        if (obj == null) {
            obj = owm.f46723a;
        }
        m19109f(null, obj);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0075 A[Catch: all -> 0x0054, PHI: r2 r5 r6 r7 r11
      0x0075: PHI (r2v6 ory) = (r2v3 ory), (r2v5 ory), (r2v5 ory), (r2v5 ory), (r2v7 ory) binds: [B:29:0x0066, B:44:0x00b0, B:67:0x0075, B:51:0x00e4, B:13:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x0075: PHI (r5v8 ovx) = (r5v4 ovx), (r5v7 ovx), (r5v7 ovx), (r5v7 ovx), (r5v9 ovx) binds: [B:29:0x0066, B:44:0x00b0, B:67:0x0075, B:51:0x00e4, B:13:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x0075: PHI (r6v3 ous) = (r6v0 ous), (r6v2 ous), (r6v2 ous), (r6v2 ous), (r6v4 ous) binds: [B:29:0x0066, B:44:0x00b0, B:67:0x0075, B:51:0x00e4, B:13:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x0075: PHI (r7v8 ovv) = (r7v4 ovv), (r7v7 ovv), (r7v7 ovv), (r7v7 ovv), (r7v9 ovv) binds: [B:29:0x0066, B:44:0x00b0, B:67:0x0075, B:51:0x00e4, B:13:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x0075: PHI (r11v10 java.lang.Object) = 
      (r11v5 java.lang.Object)
      (r11v9 java.lang.Object)
      (r11v9 java.lang.Object)
      (r11v9 java.lang.Object)
      (r11v17 java.lang.Object)
     binds: [B:29:0x0066, B:44:0x00b0, B:67:0x0075, B:51:0x00e4, B:13:0x0035] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0035, B:30:0x0075, B:32:0x007b, B:34:0x0080, B:43:0x00a1, B:45:0x00b2, B:47:0x00d5, B:48:0x00da, B:50:0x00e2, B:36:0x0086, B:40:0x008d, B:21:0x0050, B:29:0x0066), top: B:63:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x007b A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0035, B:30:0x0075, B:32:0x007b, B:34:0x0080, B:43:0x00a1, B:45:0x00b2, B:47:0x00d5, B:48:0x00da, B:50:0x00e2, B:36:0x0086, B:40:0x008d, B:21:0x0050, B:29:0x0066), top: B:63:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0080 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0035, B:30:0x0075, B:32:0x007b, B:34:0x0080, B:43:0x00a1, B:45:0x00b2, B:47:0x00d5, B:48:0x00da, B:50:0x00e2, B:36:0x0086, B:40:0x008d, B:21:0x0050, B:29:0x0066), top: B:63:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x008a  */
    /* JADX WARN: Code duplicated, block: B:39:0x008c  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b2 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0035, B:30:0x0075, B:32:0x007b, B:34:0x0080, B:43:0x00a1, B:45:0x00b2, B:47:0x00d5, B:48:0x00da, B:50:0x00e2, B:36:0x0086, B:40:0x008d, B:21:0x0050, B:29:0x0066), top: B:63:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d5 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0035, B:30:0x0075, B:32:0x007b, B:34:0x0080, B:43:0x00a1, B:45:0x00b2, B:47:0x00d5, B:48:0x00da, B:50:0x00e2, B:36:0x0086, B:40:0x008d, B:21:0x0050, B:29:0x0066), top: B:63:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e2 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0035, B:30:0x0075, B:32:0x007b, B:34:0x0080, B:43:0x00a1, B:45:0x00b2, B:47:0x00d5, B:48:0x00da, B:50:0x00e2, B:36:0x0086, B:40:0x008d, B:21:0x0050, B:29:0x0066), top: B:63:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00b0 -> B:30:0x0075). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.ovn, p000.our
    /* JADX INFO: renamed from: da */
    public final java.lang.Object mo16104da(p000.ous r11, p000.ols r12) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ovv.mo16104da(ous, ols):java.lang.Object");
    }

    @Override // p000.ovm
    /* JADX INFO: renamed from: db */
    public final boolean mo19088db(Object obj, Object obj2) {
        if (obj == null) {
            obj = owm.f46723a;
        }
        if (obj2 == null) {
            obj2 = owm.f46723a;
        }
        return m19109f(obj, obj2);
    }

    @Override // p000.owb
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ owd mo19100e() {
        return new ovx();
    }

    @Override // p000.owb
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ owd[] mo19103h() {
        return new ovx[2];
    }
}
