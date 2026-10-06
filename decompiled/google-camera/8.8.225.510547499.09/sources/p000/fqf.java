package p000;

import android.hardware.HardwareBuffer;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.YuvImage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fqf implements fsy {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ kmv f23204a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ long f23205b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ kpp f23206c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ kpw f23207d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ kpw f23208e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ ftg f23209f;

    /* JADX INFO: renamed from: g */
    final /* synthetic */ kbo f23210g;

    /* JADX INFO: renamed from: h */
    final /* synthetic */ fqg f23211h;

    /* JADX INFO: renamed from: i */
    final /* synthetic */ npk f23212i;

    public fqf(fqg fqgVar, kmv kmvVar, npk npkVar, long j, kpp kppVar, kpw kpwVar, kpw kpwVar2, ftg ftgVar, kbo kboVar, byte[] bArr, byte[] bArr2) {
        this.f23211h = fqgVar;
        this.f23204a = kmvVar;
        this.f23212i = npkVar;
        this.f23205b = j;
        this.f23206c = kppVar;
        this.f23207d = kpwVar;
        this.f23208e = kpwVar2;
        this.f23209f = ftgVar;
        this.f23210g = kboVar;
    }

    /* JADX INFO: renamed from: e */
    private final kpw m8698e(HardwareBuffer hardwareBuffer, ShotMetadata shotMetadata) {
        return this.f23211h.f23214a.mo8715b(new iay((gzl) this.f23212i.f44028b, Long.valueOf(this.f23205b), kxk.m14965K(this.f23206c), this.f23212i.f44027a), hardwareBuffer, shotMetadata);
    }

    @Override // p000.fsy
    /* JADX INFO: renamed from: a */
    public final void mo8699a(RuntimeException runtimeException) {
        this.f23204a.m14586l();
        this.f23208e.close();
        this.f23210g.mo13943e("Couldn't retrieve Rgb result from FastMomentsHdr", runtimeException);
        this.f23209f.mo8683b(runtimeException);
    }

    @Override // p000.fsy
    /* JADX INFO: renamed from: b */
    public final void mo8700b(HardwareBuffer hardwareBuffer, ShotMetadata shotMetadata) {
        this.f23204a.m14586l();
        kpw kpwVarM8698e = m8698e(hardwareBuffer, shotMetadata);
        this.f23208e.close();
        this.f23209f.mo8684c(kpwVarM8698e);
    }

    @Override // p000.fsy
    /* JADX INFO: renamed from: c */
    public final void mo8701c(YuvImage yuvImage, ShotMetadata shotMetadata) {
        this.f23204a.m14586l();
        kpw kpwVarMo8714a = this.f23211h.f23214a.mo8714a(new iay((gzl) this.f23212i.f44028b, Long.valueOf(this.f23205b), kxk.m14965K(this.f23206c), this.f23212i.f44027a), ntw.m17720f(yuvImage), this.f23207d, shotMetadata);
        this.f23208e.close();
        this.f23209f.mo8684c(kpwVarMo8714a);
    }

    @Override // p000.fsy
    /* JADX INFO: renamed from: d */
    public final void mo8702d(HardwareBuffer hardwareBuffer, ShotMetadata shotMetadata) {
        this.f23204a.m14586l();
        kpw kpwVarM8698e = m8698e(hardwareBuffer, shotMetadata);
        this.f23208e.close();
        this.f23209f.mo8684c(kpwVarM8698e);
    }
}
