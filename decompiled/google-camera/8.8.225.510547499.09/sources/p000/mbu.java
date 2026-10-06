package p000;

import com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250Worker;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250Worker$doWork$2", m18657c = "F250Worker.kt", m18658d = "invokeSuspend", m18659e = {60, 63, 64, 65, 70, 77, 81, 84})
public final class mbu extends oml implements onm {

    /* JADX INFO: renamed from: a */
    Object f39868a;

    /* JADX INFO: renamed from: b */
    int f39869b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ F250Worker f39870c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbu(F250Worker f250Worker, ols olsVar) {
        super(2, olsVar);
        this.f39870c = f250Worker;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((mbu) mo562c((oqs) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e A[Catch: all -> 0x0030, PHI: r1
      0x006e: PHI (r1v16 ??) = (r1v29 ??), (r1v30 ??) binds: [B:24:0x006c, B:15:0x002c] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x0030, blocks: (B:9:0x0020, B:29:0x008e, B:12:0x0026, B:27:0x007e, B:15:0x002c, B:25:0x006e), top: B:54:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x007e A[Catch: all -> 0x0030, PHI: r1
      0x007e: PHI (r1v18 ??) = (r1v27 ??), (r1v28 ??) binds: [B:26:0x007c, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0030, blocks: (B:9:0x0020, B:29:0x008e, B:12:0x0026, B:27:0x007e, B:15:0x002c, B:25:0x006e), top: B:54:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0108 A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        if (r8 != r0) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r6v0 */
    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo561b(Object obj) throws Throwable {
        ?? r1;
        F250Worker f250Worker;
        Object objM4730i;
        ?? r2;
        Object objM4731j;
        ?? r3;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        ?? r4 = this.f39869b;
        try {
            switch (r4) {
                case 0:
                    lkm.m15592s(obj);
                    mau mauVar = new mau(this.f39870c.f7988g, lwg.f39427a, null);
                    mav mavVar = this.f39870c.f7991j;
                    lvo lvoVarM16279e = mau.m16279e(mauVar, null, null, oer.UPLOAD_BACKGROUND_START, 11);
                    this.f39868a = mauVar;
                    this.f39869b = 1;
                    if (mavVar.m16285a(lvoVarM16279e, this) == omaVar) {
                        return omaVar;
                    }
                    r4 = mauVar;
                    try {
                        F250Worker f250Worker2 = this.f39870c;
                        this.f39868a = r4;
                        this.f39869b = 2;
                        objM4730i = f250Worker2.m4730i((mau) r4, this);
                        r2 = r4;
                        if (objM4730i != omaVar) {
                            F250Worker f250Worker3 = this.f39870c;
                            this.f39868a = r2;
                            this.f39869b = 3;
                            objM4731j = f250Worker3.m4731j((mau) r2, this);
                            r3 = r2;
                            if (objM4731j != omaVar) {
                                F250Worker f250Worker4 = this.f39870c;
                                this.f39868a = r3;
                                this.f39869b = 4;
                                Object objM4732k = f250Worker4.m4732k((mau) r3, this);
                                r4 = r3;
                            }
                            break;
                        }
                        return omaVar;
                    } catch (Throwable th) {
                        th = th;
                        if (th instanceof CancellationException) {
                            osk oskVar = osk.f46496a;
                            mbt mbtVar = new mbt(this.f39870c, null);
                            this.f39868a = null;
                            this.f39869b = 5;
                            obj = ook.m18774L(oskVar, mbtVar, this);
                            if (obj == omaVar) {
                                return omaVar;
                            }
                            return (C0139dr) obj;
                        }
                        if (this.f39870c.m2096d() < 10) {
                            mav mavVar2 = this.f39870c.f7991j;
                            lvo lvoVarM16277c = mau.m16277c((mau) r4, oer.ERROR_UPLOAD_IGNORABLE, th, null, 12);
                            this.f39868a = null;
                            this.f39869b = 6;
                            if (mavVar2.m16285a(lvoVarM16277c, this) == omaVar) {
                                return omaVar;
                            }
                            this.f39870c.m2096d();
                            return C0139dr.m6615d();
                        }
                        mav mavVar3 = this.f39870c.f7991j;
                        lvo lvoVarM16277c2 = mau.m16277c((mau) r4, oer.ERROR_UPLOAD_TOO_FREQUENT_ERRORS_PAUSING, th, null, 12);
                        this.f39868a = r4;
                        this.f39869b = 7;
                        if (mavVar3.m16285a(lvoVarM16277c2, this) == omaVar) {
                            r1 = r4;
                            return omaVar;
                        }
                        r1 = r4;
                        f250Worker = this.f39870c;
                        this.f39868a = null;
                        this.f39869b = 8;
                        if (f250Worker.m4731j((mau) r1, this) == omaVar) {
                            return omaVar;
                        }
                        return C0139dr.m6614c();
                    }
                case 1:
                    Object obj2 = this.f39868a;
                    lkm.m15592s(obj);
                    r4 = obj2;
                    F250Worker f250Worker5 = this.f39870c;
                    this.f39868a = r4;
                    this.f39869b = 2;
                    objM4730i = f250Worker5.m4730i((mau) r4, this);
                    r2 = r4;
                    if (objM4730i != omaVar) {
                        F250Worker f250Worker6 = this.f39870c;
                        this.f39868a = r2;
                        this.f39869b = 3;
                        objM4731j = f250Worker6.m4731j((mau) r2, this);
                        r3 = r2;
                        if (objM4731j != omaVar) {
                            F250Worker f250Worker7 = this.f39870c;
                            this.f39868a = r3;
                            this.f39869b = 4;
                            Object objM4732k2 = f250Worker7.m4732k((mau) r3, this);
                            r4 = r3;
                        }
                        break;
                    }
                    return omaVar;
                case 2:
                    Object obj3 = this.f39868a;
                    lkm.m15592s(obj);
                    r2 = obj3;
                    F250Worker f250Worker8 = this.f39870c;
                    this.f39868a = r2;
                    this.f39869b = 3;
                    objM4731j = f250Worker8.m4731j((mau) r2, this);
                    r3 = r2;
                    if (objM4731j != omaVar) {
                        F250Worker f250Worker9 = this.f39870c;
                        this.f39868a = r3;
                        this.f39869b = 4;
                        Object objM4732k3 = f250Worker9.m4732k((mau) r3, this);
                        r4 = r3;
                        break;
                    }
                    return omaVar;
                case 3:
                    Object obj4 = this.f39868a;
                    lkm.m15592s(obj);
                    r3 = obj4;
                    F250Worker f250Worker10 = this.f39870c;
                    this.f39868a = r3;
                    this.f39869b = 4;
                    Object objM4732k4 = f250Worker10.m4732k((mau) r3, this);
                    r4 = r3;
                    break;
                case 4:
                    Object obj5 = this.f39868a;
                    lkm.m15592s(obj);
                    r4 = obj5;
                    return C0139dr.m6616e();
                case 5:
                    lkm.m15592s(obj);
                    return (C0139dr) obj;
                case 6:
                    lkm.m15592s(obj);
                    this.f39870c.m2096d();
                    return C0139dr.m6615d();
                case 7:
                    Object obj6 = this.f39868a;
                    lkm.m15592s(obj);
                    r1 = obj6;
                    r1 = r4;
                    f250Worker = this.f39870c;
                    this.f39868a = null;
                    this.f39869b = 8;
                    if (f250Worker.m4731j((mau) r1, this) == omaVar) {
                        return omaVar;
                    }
                    return C0139dr.m6614c();
                default:
                    lkm.m15592s(obj);
                    return C0139dr.m6614c();
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        return new mbu(this.f39870c, olsVar);
    }
}
