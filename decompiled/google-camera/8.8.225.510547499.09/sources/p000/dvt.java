package p000;

import com.google.android.apps.camera.jni.tracking.yRU.CswIK;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dvt {

    /* JADX INFO: renamed from: a */
    public int f12681a = 1;

    /* JADX INFO: renamed from: b */
    public dvp f12682b = dvu.f12686a;

    /* JADX INFO: renamed from: c */
    public dtp f12683c;

    /* JADX INFO: renamed from: d */
    public int f12684d;

    /* JADX INFO: renamed from: e */
    private final dtj f12685e;

    public dvt(dtj dtjVar) {
        lku.m15669w(true);
        lku.m15669w(true);
        final dtt dttVar = new dtt() { // from class: dtq
        };
        final dtt dttVar2 = new dtt() { // from class: dtq
        };
        this.f12683c = new dtp() { // from class: dtr
            @Override // p000.dtp
            /* JADX INFO: renamed from: a */
            public final dtu mo6744a(long j) {
                return new dts(j);
            }
        };
        this.f12684d = 1;
        this.f12685e = dtjVar;
    }

    /* JADX INFO: renamed from: c */
    public static final void m6790c(int i) {
        lku.m15669w(i > 0);
    }

    /* JADX INFO: renamed from: a */
    public final dtk m6791a() {
        int i;
        int i2 = this.f12681a;
        if (i2 != -1) {
            this.f12684d = i2;
            i = i2;
        } else {
            int i3 = this.f12684d;
            if (i3 <= 0) {
                throw new IllegalStateException(CswIK.llLNjlR);
            }
            i = i3;
        }
        return new dvq(this.f12685e, i2, i, this.f12682b, this.f12683c);
    }

    /* JADX INFO: renamed from: b */
    public final void m6792b(dvr dvrVar) {
        this.f12682b = new dvs(dvrVar, 0);
    }
}
