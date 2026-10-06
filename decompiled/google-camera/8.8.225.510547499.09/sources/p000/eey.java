package p000;

import android.hardware.HardwareBuffer;
import android.location.Location;
import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.JpgEncodeOptions;
import com.google.googlex.gcam.LockedHardwareBuffer;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.imageio.JpgHelper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eey implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ efa f13771a;

    /* JADX INFO: renamed from: b */
    private final nqf f13772b;

    /* JADX INFO: renamed from: c */
    private int f13773c;

    /* JADX INFO: renamed from: d */
    private final boolean f13774d;

    /* JADX INFO: renamed from: e */
    private final ShotMetadata f13775e;

    /* JADX INFO: renamed from: f */
    private final int f13776f;

    /* JADX INFO: renamed from: g */
    private final long f13777g;

    /* JADX INFO: renamed from: h */
    private final mrm f13778h;

    /* JADX INFO: renamed from: i */
    private final ihk f13779i;

    public eey(efa efaVar, ihk ihkVar, nqf nqfVar, int i, boolean z, ShotMetadata shotMetadata, int i2, long j, mrm mrmVar, byte[] bArr, byte[] bArr2) {
        this.f13771a = efaVar;
        this.f13779i = ihkVar;
        this.f13772b = nqfVar;
        this.f13773c = i;
        this.f13774d = z;
        this.f13775e = shotMetadata;
        this.f13776f = i2;
        this.f13777g = j;
        this.f13778h = mrmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterleavedReadViewU8 interleavedReadViewU8M5041a;
        kbc kbcVar;
        ihk ihkVar = this.f13779i;
        mrm mrmVar = (mrm) ihkVar.f30967b;
        if (mrmVar.mo16813g()) {
            interleavedReadViewU8M5041a = ((InterleavedImageU8) mrmVar.mo16809c()).m5005e();
        } else {
            mrm mrmVar2 = (mrm) ihkVar.f30966a;
            if (!mrmVar2.mo16813g()) {
                return;
            } else {
                interleavedReadViewU8M5041a = LockedHardwareBuffer.m5040c((HardwareBuffer) mrmVar2.mo16809c(), 3L).m5041a();
            }
        }
        kbc kbcVar2 = new kbc(interleavedReadViewU8M5041a.m5013d(), interleavedReadViewU8M5041a.m5012c());
        int i = 0;
        if (this.f13774d) {
            int iM17721g = ntw.m17721g(this.f13775e.m5099e());
            ntw.m17725k(this.f13775e, 60);
            kbc kbcVarM13909i = kbcVar2.m13909i(kay.m13889b(iM17721g));
            this.f13773c = 0;
            kbcVar = kbcVarM13909i;
            i = iM17721g;
        } else {
            kbcVar = kbcVar2;
        }
        mrm mrmVarM5156a = JpgHelper.m5156a(interleavedReadViewU8M5041a, new JpgEncodeOptions(), i);
        if (!mrmVarM5156a.mo16813g()) {
            ((nbe) ((nbe) efa.f13787a.m17251b()).mo17276G((char) 1352)).mo17290o("Error encoding burst image");
            this.f13772b.mo8566a(new RuntimeException("Image couldn't be encoded."));
            return;
        }
        ExifInterface exifInterfaceM7069a = ebq.m7069a(kbcVar.f35517a, kbcVar.f35518b, this.f13775e, this.f13778h);
        efa efaVar = this.f13771a;
        efaVar.f13790d.mo9810f(exifInterfaceM7069a, efaVar.f13793g.mo14558k(), this.f13773c);
        kep kepVar = new kep(exifInterfaceM7069a);
        kepVar.m14071g(this.f13777g);
        kepVar.m14072h(this.f13771a.f13793g.mo14558k(), exifInterfaceM7069a.mo4680a(ExifInterface.f7812Z), exifInterfaceM7069a.mo4680a(ExifInterface.f7793G));
        mrm mrmVarMo8117c = this.f13771a.f13788b.mo8117c();
        if (mrmVarMo8117c.mo16813g()) {
            kepVar.m14068d((Location) mrmVarMo8117c.mo16809c());
        }
        this.f13771a.f13794h.m13108n(exifInterfaceM7069a);
        this.f13772b.mo14894e(fxt.m8941a((this.f13775e.m5096b() / 1000) + ((long) this.f13776f), (byte[]) mrmVarM5156a.mo16809c(), kbcVar, this.f13773c, exifInterfaceM7069a, null));
    }
}
