package p000;

import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "androidx.core.view.ViewGroupKt$descendants$1", m18657c = "ViewGroup.kt", m18658d = "invokeSuspend", m18659e = {119, 121})
public final class afu extends omk implements onm {

    /* JADX INFO: renamed from: a */
    Object f277a;

    /* JADX INFO: renamed from: b */
    Object f278b;

    /* JADX INFO: renamed from: c */
    int f279c;

    /* JADX INFO: renamed from: d */
    int f280d;

    /* JADX INFO: renamed from: e */
    int f281e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ ViewGroup f282f;

    /* JADX INFO: renamed from: g */
    private /* synthetic */ Object f283g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afu(ViewGroup viewGroup, ols olsVar) {
        super(olsVar);
        this.f282f = viewGroup;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((afu) mo562c((opc) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0061  */
    /* JADX WARN: Code duplicated, block: B:16:0x007c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x007d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0081 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:9:0x0041  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:13:0x0061
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final java.lang.Object mo561b(java.lang.Object r9) {
        /*
            r8 = this;
            oma r0 = p000.oma.COROUTINE_SUSPENDED
            int r1 = r8.f281e
            r2 = 1
            switch(r1) {
                case 0: goto L28;
                case 1: goto L17;
                default: goto L8;
            }
        L8:
            int r1 = r8.f280d
            int r3 = r8.f279c
            java.lang.Object r4 = r8.f277a
            java.lang.Object r5 = r8.f283g
            opc r5 = (p000.opc) r5
            p000.lkm.m15592s(r9)
            r9 = r8
            goto L3c
        L17:
            int r1 = r8.f280d
            int r3 = r8.f279c
            java.lang.Object r4 = r8.f278b
            java.lang.Object r5 = r8.f277a
            java.lang.Object r6 = r8.f283g
            opc r6 = (p000.opc) r6
            p000.lkm.m15592s(r9)
            r9 = r8
            goto L5d
        L28:
            p000.lkm.m15592s(r9)
            java.lang.Object r9 = r8.f283g
            opc r9 = (p000.opc) r9
            android.view.ViewGroup r1 = r8.f282f
            int r3 = r1.getChildCount()
            r4 = 0
            r6 = r9
            r5 = r1
            r1 = r3
            r3 = 0
            r9 = r8
            goto L3f
        L3c:
            int r3 = r3 + r2
            r6 = r5
            r5 = r4
        L3f:
            if (r3 >= r1) goto L82
            r4 = r5
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            android.view.View r4 = r4.getChildAt(r3)
            r4.getClass()
            r9.f283g = r6
            r9.f277a = r5
            r9.f278b = r4
            r9.f279c = r3
            r9.f280d = r1
            r9.f281e = r2
            java.lang.Object r7 = r6.mo18838a(r4, r9)
            if (r7 == r0) goto L81
        L5d:
            boolean r7 = r4 instanceof android.view.ViewGroup
            if (r7 == 0) goto L7d
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            opa r4 = p000.abj.m117f(r4)
            r9.f283g = r6
            r9.f277a = r5
            r7 = 0
            r9.f278b = r7
            r9.f279c = r3
            r9.f280d = r1
            r7 = 2
            r9.f281e = r7
            java.lang.Object r4 = r6.m18840c(r4, r9)
            if (r4 == r0) goto L7c
            goto L7d
        L7c:
            return r0
        L7d:
            r4 = r5
            r5 = r6
            goto L3c
        L81:
            return r0
        L82:
            oki r9 = p000.oki.f46196a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.afu.mo561b(java.lang.Object):java.lang.Object");
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        afu afuVar = new afu(this.f282f, olsVar);
        afuVar.f283g = obj;
        return afuVar;
    }
}
