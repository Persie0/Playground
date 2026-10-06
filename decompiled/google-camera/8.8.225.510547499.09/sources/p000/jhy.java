package p000;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class jhy implements jef {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ jeg f34105a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ jia f34106b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ khb f34107c;

    public jhy(jeg jegVar, khb khbVar, jia jiaVar, byte[] bArr, byte[] bArr2) {
        this.f34105a = jegVar;
        this.f34107c = khbVar;
        this.f34106b = jiaVar;
    }

    @Override // p000.jef
    /* JADX INFO: renamed from: a */
    public final void mo12969a(Status status) {
        if (!status.m4645b()) {
            this.f34107c.m14242h(jib.m13212q(status));
        } else {
            this.f34107c.m14243i(this.f34106b.mo13191a(this.f34105a.mo4652l(TimeUnit.MILLISECONDS)));
        }
    }
}
