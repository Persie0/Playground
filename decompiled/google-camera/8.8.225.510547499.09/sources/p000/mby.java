package p000;

import com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250Worker;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250Worker$uploadAllValidResources$latestUploads$1", m18657c = "F250Worker.kt", m18658d = "invokeSuspend", m18659e = {155, 195, 157})
public final class mby extends oml implements onm {

    /* JADX INFO: renamed from: a */
    Object f39896a;

    /* JADX INFO: renamed from: b */
    Object f39897b;

    /* JADX INFO: renamed from: c */
    Object f39898c;

    /* JADX INFO: renamed from: d */
    Object f39899d;

    /* JADX INFO: renamed from: e */
    Object f39900e;

    /* JADX INFO: renamed from: f */
    int f39901f;

    /* JADX INFO: renamed from: g */
    final /* synthetic */ F250Worker f39902g;

    /* JADX INFO: renamed from: h */
    final /* synthetic */ mau f39903h;

    /* JADX INFO: renamed from: i */
    private /* synthetic */ Object f39904i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mby(F250Worker f250Worker, mau mauVar, ols olsVar) {
        super(2, olsVar);
        this.f39902g = f250Worker;
        this.f39903h = mauVar;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((mby) mo562c((ous) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    /* JADX WARN: Code duplicated, block: B:17:0x006d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0075  */
    /* JADX WARN: Code duplicated, block: B:22:0x008a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x008b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r6v3, types: [mau] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008b -> B:12:0x0042). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final java.lang.Object mo561b(java.lang.Object r11) {
        /*
            r10 = this;
            oma r0 = p000.oma.COROUTINE_SUSPENDED
            int r1 = r10.f39901f
            r2 = 0
            switch(r1) {
                case 0: goto L39;
                case 1: goto L1b;
                case 2: goto L12;
                default: goto L8;
            }
        L8:
            java.lang.Object r1 = r10.f39904i
            ous r1 = (p000.ous) r1
            p000.lkm.m15592s(r11)
            r11 = r10
            r7 = r1
            goto L42
        L12:
            java.lang.Object r0 = r10.f39904i
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            p000.lkm.m15592s(r11)
            goto Lba
        L1b:
            java.lang.Object r1 = r10.f39900e
            java.lang.Object r3 = r10.f39899d
            java.lang.Object r4 = r10.f39898c
            java.lang.Object r5 = r10.f39897b
            java.lang.Object r6 = r10.f39896a
            java.lang.Object r7 = r10.f39904i
            ous r7 = (p000.ous) r7
            p000.lkm.m15592s(r11)     // Catch: java.lang.Throwable -> L2f
            r1 = r0
            r0 = r10
            goto L71
        L2f:
            r11 = move-exception
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r1
            r1 = r0
            r0 = r11
            r11 = r10
            goto L96
        L39:
            p000.lkm.m15592s(r11)
            java.lang.Object r11 = r10.f39904i
            ous r11 = (p000.ous) r11
            r7 = r11
            r11 = r10
        L42:
            oly r1 = r11.mo18639d()
            boolean r1 = p000.ooc.m18757w(r1)
            if (r1 == 0) goto Lbb
            com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250Worker r1 = r11.f39902g
            mav r6 = r1.f7991j
            mau r5 = r11.f39903h
            okv r3 = p000.okv.f46215a
            oer r4 = p000.oer.ERROR_QUERY
            lzh r1 = r1.f7989h     // Catch: java.lang.Throwable -> L8f
            r11.f39904i = r7     // Catch: java.lang.Throwable -> L8f
            r11.f39896a = r6     // Catch: java.lang.Throwable -> L8f
            r11.f39897b = r5     // Catch: java.lang.Throwable -> L8f
            r11.f39898c = r3     // Catch: java.lang.Throwable -> L8f
            r11.f39899d = r3     // Catch: java.lang.Throwable -> L8f
            r11.f39900e = r4     // Catch: java.lang.Throwable -> L8f
            r8 = 1
            r11.f39901f = r8     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r1 = r1.mo16248c(r11)     // Catch: java.lang.Throwable -> L8f
            if (r1 == r0) goto L8e
            r9 = r0
            r0 = r11
            r11 = r1
            r1 = r9
        L71:
            lzc r11 = (p000.lzc) r11
            if (r11 == 0) goto Lbb
            r0.f39904i = r7
            r0.f39896a = r2
            r0.f39897b = r2
            r0.f39898c = r2
            r0.f39899d = r2
            r0.f39900e = r2
            r3 = 3
            r0.f39901f = r3
            java.lang.Object r11 = r7.mo16103a(r11, r0)
            if (r11 != r1) goto L8b
            return r1
        L8b:
            r11 = r0
            r0 = r1
            goto L42
        L8e:
            return r0
        L8f:
            r1 = move-exception
            r7 = r6
            r6 = r5
            r5 = r3
            r9 = r1
            r1 = r0
            r0 = r9
        L96:
            boolean r8 = r0 instanceof java.util.concurrent.CancellationException
            if (r8 != 0) goto Lba
            mau r6 = (p000.mau) r6
            oer r4 = (p000.oer) r4
            lvo r3 = r6.m16280a(r5, r3, r4, r0)
            r11.f39904i = r0
            r11.f39896a = r2
            r11.f39897b = r2
            r11.f39898c = r2
            r11.f39899d = r2
            r11.f39900e = r2
            r2 = 2
            r11.f39901f = r2
            mav r7 = (p000.mav) r7
            java.lang.Object r11 = r7.m16285a(r3, r11)
            if (r11 != r1) goto Lba
            return r1
        Lba:
            throw r0
        Lbb:
            oki r11 = p000.oki.f46196a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.mby.mo561b(java.lang.Object):java.lang.Object");
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        mby mbyVar = new mby(this.f39902g, this.f39903h, olsVar);
        mbyVar.f39904i = obj;
        return mbyVar;
    }
}
