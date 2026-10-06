package p000;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jqn extends jqj {

    /* JADX INFO: renamed from: a */
    private final jez f34599a;

    /* JADX INFO: renamed from: b */
    private final jqk f34600b;

    /* JADX INFO: renamed from: c */
    private final joo f34601c;

    public jqn(jqk jqkVar, jez jezVar, joo jooVar, byte[] bArr) {
        this.f34600b = jqkVar;
        this.f34599a = jezVar;
        this.f34601c = jooVar;
    }

    @Override // p000.jqj
    /* JADX INFO: renamed from: c */
    public final void mo13468c(Status status) {
        if (status.m4645b()) {
            this.f34599a.mo12841c(Status.f7601a);
        } else {
            this.f34599a.mo12841c(status);
        }
    }

    @Override // p000.jqj
    /* JADX INFO: renamed from: d */
    public final void mo13469d(Status status) {
        if (!status.m4645b()) {
            this.f34599a.mo12841c(status);
            return;
        }
        joo jooVar = this.f34601c;
        if (jooVar == null) {
            this.f34599a.mo12841c(Status.f7601a);
        } else {
            this.f34600b.m13470e(jooVar, this);
        }
    }
}
