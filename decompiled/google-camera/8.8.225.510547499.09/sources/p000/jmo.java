package p000;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jmo extends jfq {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ jmi f34363a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ khb f34364b;

    public jmo(khb khbVar, jmi jmiVar, byte[] bArr, byte[] bArr2) {
        this.f34364b = khbVar;
        this.f34363a = jmiVar;
    }

    @Override // p000.jfr
    /* JADX INFO: renamed from: b */
    public final void mo13055b(Status status) {
        if (status.f7607g == 0) {
            this.f34364b.m14243i(new jmr(this.f34363a));
        } else {
            this.f34364b.m14242h(new jdv(status));
        }
    }
}
