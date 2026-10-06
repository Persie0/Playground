package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dcd implements nph {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ kmq f10499a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ int f10500b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ int f10501c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ int f10502d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ int f10503e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ dfn f10504f;

    public dcd(dfn dfnVar, kmq kmqVar, int i, int i2, int i3, int i4, byte[] bArr) {
        this.f10504f = dfnVar;
        this.f10499a = kmqVar;
        this.f10502d = i;
        this.f10503e = i2;
        this.f10500b = i3;
        this.f10501c = i4;
    }

    @Override // p000.nph
    /* JADX INFO: renamed from: a */
    public final void mo3810a(Throwable th) {
        throw new doc("Failed to open any of the available camera", kcl.CAMERA_ERROR_CODE_UNKNOWN, this.f10499a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kbo] */
    /* JADX WARN: Type inference failed for: r10v11, types: [dcm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [dcm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v7, types: [dcm, java.lang.Object] */
    @Override // p000.nph
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo3811b(Object obj) {
        final DialogInterfaceC0155eg dialogInterfaceC0155egMo5915a;
        ddj ddjVar = (ddj) obj;
        final dfn dfnVar = this.f10504f;
        final kmq kmqVar = this.f10499a;
        final int i = this.f10502d;
        final int i2 = this.f10503e;
        final int iM6034d = dez.m6034d(ddjVar, this.f10500b, this.f10501c, ((cwd) dfnVar.f10793f).m5671s());
        dfnVar.f10789b.mo13940b(ddjVar.toString());
        if (iM6034d == 4) {
            dialogInterfaceC0155egMo5915a = dfnVar.f10788a.mo5917c(i, i2, kmqVar);
        } else {
            dialogInterfaceC0155egMo5915a = iM6034d == 3 ? dfnVar.f10788a.mo5915a(i, i2, kmqVar) : dfnVar.f10788a.mo5916b(i, i2, kmqVar);
        }
        final byte[] bArr = null;
        ((jvd) dfnVar.f10791d).execute(new Runnable(dialogInterfaceC0155egMo5915a, kmqVar, i, i2, iM6034d, bArr) { // from class: dcc

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ DialogInterfaceC0155eg f10493a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ kmq f10494b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ int f10495c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ int f10496d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ int f10497e;

            /* JADX WARN: Type inference failed for: r2v2, types: [dcm, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                dfn dfnVar2 = this.f10498f;
                DialogInterfaceC0155eg dialogInterfaceC0155eg = this.f10493a;
                kmq kmqVar2 = this.f10494b;
                int i3 = this.f10496d;
                int i4 = this.f10497e;
                int i5 = this.f10495c;
                if (((dcf) dfnVar2.f10792e).m5922b(dialogInterfaceC0155eg)) {
                    dfnVar2.f10788a.mo5918d(kmqVar2, i3, i4, i5, 2);
                }
            }
        });
    }
}
