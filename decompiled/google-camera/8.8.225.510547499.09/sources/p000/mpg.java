package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mpg implements ous {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object[] f41246a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ int f41247b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ ooh f41248c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ ous f41249d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ oyt f41250e;

    public mpg(Object[] objArr, int i, ooh oohVar, ous ousVar, oyt oytVar) {
        this.f41246a = objArr;
        this.f41247b = i;
        this.f41248c = oohVar;
        this.f41249d = ousVar;
        this.f41250e = oytVar;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0051  */
    /* JADX WARN: Code duplicated, block: B:22:0x0077  */
    /* JADX WARN: Code duplicated, block: B:23:0x007b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005b -> B:20:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.ous
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object mo16103a(p000.oky r7, p000.ols r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p000.mpf
            if (r0 == 0) goto L13
            r0 = r8
            mpf r0 = (p000.mpf) r0
            int r1 = r0.f41244c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41244c = r1
            goto L18
        L13:
            mpf r0 = new mpf
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f41242a
            oma r1 = p000.oma.COROUTINE_SUSPENDED
            int r2 = r0.f41244c
            r3 = 1
            switch(r2) {
                case 0: goto L30;
                case 1: goto L2a;
                default: goto L22;
            }
        L22:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2a:
            mpg r7 = r0.f41245d
            p000.lkm.m15592s(r8)
            goto L5d
        L30:
            p000.lkm.m15592s(r8)
            int r8 = r7.f46218a
            java.lang.Object r7 = r7.f46219b
            java.lang.Object[] r2 = r6.f41246a
            int r4 = r6.f41247b
            int r8 = r8 % r4
            r4 = r2[r8]
            mpi r5 = p000.mpi.f41256a
            if (r4 != r5) goto L7f
            r2[r8] = r7
            r7 = r6
        L45:
            java.lang.Object[] r8 = r7.f41246a
            ooh r2 = r7.f41248c
            int r2 = r2.f46350a
            r8 = r8[r2]
            mpi r2 = p000.mpi.f41256a
            if (r8 == r2) goto L7c
            ous r2 = r7.f41249d
            r0.f41245d = r7
            r0.f41244c = r3
            java.lang.Object r8 = r2.mo16103a(r8, r0)
            if (r8 == r1) goto L7b
        L5d:
            java.lang.Object[] r8 = r7.f41246a
            ooh r2 = r7.f41248c
            int r2 = r2.f46350a
            mpi r4 = p000.mpi.f41256a
            r8[r2] = r4
            oyt r8 = r7.f41250e
            r8.m19208a()
            ooh r8 = r7.f41248c
            int r2 = r8.f46350a
            int r2 = r2 + r3
            r8.f46350a = r2
            int r4 = r7.f41247b
            if (r2 != r4) goto L45
            r2 = 0
            r8.f46350a = r2
            goto L45
        L7b:
            return r1
        L7c:
            oki r7 = p000.oki.f46196a
            return r7
        L7f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Check failed."
            r7.<init>(r8)
            goto L88
        L87:
            throw r7
        L88:
            goto L87
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.mpg.mo16103a(oky, ols):java.lang.Object");
    }
}
