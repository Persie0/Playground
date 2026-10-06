package p000;

import android.graphics.PointF;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fpn extends iqc {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ fpp f23116a;

    public fpn(fpp fppVar) {
        this.f23116a = fppVar;
    }

    @Override // p000.iqd
    /* JADX INFO: renamed from: a */
    public final boolean mo3470a(PointF pointF) {
        fpp fppVar = this.f23116a;
        if (!fppVar.f23124g) {
            return false;
        }
        if (Duration.ofNanos(fppVar.f23122e.m16858b()).compareTo(fpp.f23118a) < 0) {
            this.f23116a.f23120c.mo3415bf(true);
        }
        fpp fppVar2 = this.f23116a;
        fppVar2.m8667k(fppVar2.f23126i);
        return true;
    }
}
