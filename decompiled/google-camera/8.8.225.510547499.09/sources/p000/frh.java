package p000;

import android.hardware.HardwareBuffer;
import com.google.googlex.gcam.ShotMetadata;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class frh implements edb {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ long f23304a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ kpp f23305b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ kmv f23306c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ ftg f23307d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ frk f23308e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ npk f23309f;

    public frh(frk frkVar, npk npkVar, long j, kpp kppVar, kmv kmvVar, ftg ftgVar, byte[] bArr, byte[] bArr2) {
        this.f23308e = frkVar;
        this.f23309f = npkVar;
        this.f23304a = j;
        this.f23305b = kppVar;
        this.f23306c = kmvVar;
        this.f23307d = ftgVar;
    }

    @Override // p000.edb
    /* JADX INFO: renamed from: a */
    public final void mo7172a(HardwareBuffer hardwareBuffer, ShotMetadata shotMetadata) {
        kpw kpwVarMo8715b = this.f23308e.f23321d.mo8715b(new iay((gzl) this.f23309f.f44028b, Long.valueOf(this.f23304a), kxk.m14965K(this.f23305b), this.f23309f.f44027a), hardwareBuffer, shotMetadata);
        this.f23306c.m14586l();
        this.f23307d.mo8684c(kpwVarMo8715b);
    }
}
