package p000;

import android.content.DialogInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class csr {

    /* JADX INFO: renamed from: a */
    public final crh f9376a;

    /* JADX INFO: renamed from: b */
    public final icf f9377b;

    /* JADX INFO: renamed from: c */
    public final jvd f9378c;

    /* JADX INFO: renamed from: d */
    public chm f9379d;

    /* JADX INFO: renamed from: e */
    public DialogInterfaceC0155eg f9380e;

    /* JADX INFO: renamed from: f */
    public final jfs f9381f;

    public csr(jfs jfsVar, crh crhVar, icf icfVar, jvd jvdVar, byte[] bArr, byte[] bArr2) {
        this.f9381f = jfsVar;
        this.f9376a = crhVar;
        this.f9377b = icfVar;
        this.f9378c = jvdVar;
    }

    /* JADX INFO: renamed from: a */
    public final DialogInterface.OnClickListener m5470a() {
        return new cdo(this, 6);
    }

    /* JADX INFO: renamed from: b */
    public final DialogInterface.OnClickListener m5471b() {
        return new cdo(this, 5);
    }

    /* JADX INFO: renamed from: c */
    public final void m5472c() {
        this.f9378c.execute(new cqr(this, 14));
    }
}
