package p000;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jtz implements jez {

    /* JADX INFO: renamed from: a */
    final khb f34809a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f34810b;

    public jtz(khb khbVar, int i, byte[] bArr, byte[] bArr2) {
        this.f34810b = i;
        this.f34809a = khbVar;
    }

    @Override // p000.jez
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void mo12841c(Object obj) {
        switch (this.f34810b) {
            case 0:
                Status status = (Status) obj;
                int i = status.f7607g;
                if (i == 0 || i == 4001) {
                    this.f34809a.m14243i(null);
                } else {
                    this.f34809a.m14242h(new jdv(status));
                }
                break;
            default:
                Status status2 = (Status) obj;
                int i2 = status2.f7607g;
                if (i2 == 0) {
                    this.f34809a.m14243i(true);
                } else if (i2 != 4002) {
                    this.f34809a.m14242h(new jdv(status2));
                } else {
                    this.f34809a.m14243i(false);
                }
                break;
        }
    }
}
