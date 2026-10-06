package p000;

import com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250AutoWorker;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250AutoWorker$doWork$2", m18657c = "F250AutoWorker.kt", m18658d = "invokeSuspend", m18659e = {48, 51, 52, 53, 58, 62})
public final class mbi extends oml implements onm {

    /* JADX INFO: renamed from: a */
    Object f39795a;

    /* JADX INFO: renamed from: b */
    int f39796b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ F250AutoWorker f39797c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbi(F250AutoWorker f250AutoWorker, ols olsVar) {
        super(2, olsVar);
        this.f39797c = f250AutoWorker;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((mbi) mo562c((oqs) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0062 A[Catch: all -> 0x0025, PHI: r1
      0x0062: PHI (r1v14 ??) = (r1v24 ??), (r1v25 ??) binds: [B:22:0x0060, B:13:0x0021] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x0025, blocks: (B:7:0x0015, B:27:0x0082, B:10:0x001b, B:25:0x0072, B:13:0x0021, B:23:0x0062), top: B:46:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0072 A[Catch: all -> 0x0025, PHI: r1
      0x0072: PHI (r1v16 ??) = (r1v22 ??), (r1v23 ??) binds: [B:24:0x0070, B:10:0x001b] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0025, blocks: (B:7:0x0015, B:27:0x0082, B:10:0x001b, B:25:0x0072, B:13:0x0021, B:23:0x0062), top: B:46:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d7  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
    
        if (r8 != r0) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo561b(Object obj) {
        Object objM4729k;
        ?? r1;
        Object objM4727i;
        ?? r2;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        ?? r3 = this.f39796b;
        try {
            switch (r3) {
                case 0:
                    lkm.m15592s(obj);
                    mau mauVar = new mau(this.f39797c.f7981g, lvm.f39403a, null);
                    mav mavVar = this.f39797c.f7982h;
                    lvo lvoVarM16279e = mau.m16279e(mauVar, null, null, oer.AUTO_BACKGROUND_START, 11);
                    this.f39795a = mauVar;
                    this.f39796b = 1;
                    if (mavVar.m16285a(lvoVarM16279e, this) == omaVar) {
                        return omaVar;
                    }
                    r3 = mauVar;
                    try {
                        F250AutoWorker f250AutoWorker = this.f39797c;
                        this.f39795a = r3;
                        this.f39796b = 2;
                        objM4729k = f250AutoWorker.m4729k((mau) r3, this);
                        r1 = r3;
                        if (objM4729k != omaVar) {
                            F250AutoWorker f250AutoWorker2 = this.f39797c;
                            this.f39795a = r1;
                            this.f39796b = 3;
                            objM4727i = f250AutoWorker2.m4727i((mau) r1, this);
                            r2 = r1;
                            if (objM4727i != omaVar) {
                                F250AutoWorker f250AutoWorker3 = this.f39797c;
                                this.f39795a = r2;
                                this.f39796b = 4;
                                Object objM4728j = f250AutoWorker3.m4728j((mau) r2, this);
                                r3 = r2;
                            }
                            break;
                        }
                        return omaVar;
                    } catch (Throwable th) {
                        th = th;
                        if (!(th instanceof CancellationException)) {
                            mav mavVar2 = this.f39797c.f7982h;
                            lvo lvoVarM16277c = mau.m16277c((mau) r3, oer.ERROR_AUTO_IGNORABLE, th, null, 12);
                            this.f39795a = null;
                            this.f39796b = 6;
                            if (mavVar2.m16285a(lvoVarM16277c, this) == omaVar) {
                                return omaVar;
                            }
                            return this.f39797c.m2096d() < 2 ? C0139dr.m6615d() : C0139dr.m6614c();
                        }
                        F250AutoWorker f250AutoWorker4 = this.f39797c;
                        mav mavVar3 = f250AutoWorker4.f7982h;
                        lvo lvoVarM16278d = mau.m16278d(new mau(f250AutoWorker4.f7981g, lwc.f39425a, null));
                        this.f39795a = null;
                        this.f39796b = 5;
                        if (mavVar3.m16285a(lvoVarM16278d, this) == omaVar) {
                            return omaVar;
                        }
                        return C0139dr.m6615d();
                    }
                case 1:
                    Object obj2 = this.f39795a;
                    lkm.m15592s(obj);
                    r3 = obj2;
                    F250AutoWorker f250AutoWorker5 = this.f39797c;
                    this.f39795a = r3;
                    this.f39796b = 2;
                    objM4729k = f250AutoWorker5.m4729k((mau) r3, this);
                    r1 = r3;
                    if (objM4729k != omaVar) {
                        F250AutoWorker f250AutoWorker6 = this.f39797c;
                        this.f39795a = r1;
                        this.f39796b = 3;
                        objM4727i = f250AutoWorker6.m4727i((mau) r1, this);
                        r2 = r1;
                        if (objM4727i != omaVar) {
                            F250AutoWorker f250AutoWorker7 = this.f39797c;
                            this.f39795a = r2;
                            this.f39796b = 4;
                            Object objM4728j2 = f250AutoWorker7.m4728j((mau) r2, this);
                            r3 = r2;
                        }
                        break;
                    }
                    return omaVar;
                case 2:
                    Object obj3 = this.f39795a;
                    lkm.m15592s(obj);
                    r1 = obj3;
                    F250AutoWorker f250AutoWorker8 = this.f39797c;
                    this.f39795a = r1;
                    this.f39796b = 3;
                    objM4727i = f250AutoWorker8.m4727i((mau) r1, this);
                    r2 = r1;
                    if (objM4727i != omaVar) {
                        F250AutoWorker f250AutoWorker9 = this.f39797c;
                        this.f39795a = r2;
                        this.f39796b = 4;
                        Object objM4728j3 = f250AutoWorker9.m4728j((mau) r2, this);
                        r3 = r2;
                        break;
                    }
                    return omaVar;
                case 3:
                    Object obj4 = this.f39795a;
                    lkm.m15592s(obj);
                    r2 = obj4;
                    F250AutoWorker f250AutoWorker10 = this.f39797c;
                    this.f39795a = r2;
                    this.f39796b = 4;
                    Object objM4728j4 = f250AutoWorker10.m4728j((mau) r2, this);
                    r3 = r2;
                    break;
                case 4:
                    Object obj5 = this.f39795a;
                    lkm.m15592s(obj);
                    r3 = obj5;
                    return C0139dr.m6616e();
                case 5:
                    lkm.m15592s(obj);
                    return C0139dr.m6615d();
                default:
                    lkm.m15592s(obj);
                    if (this.f39797c.m2096d() < 2) {
                    }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        return new mbi(this.f39797c, olsVar);
    }
}
