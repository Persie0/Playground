package p000;

import com.google.android.gms.dynamite.p017ho.DNTdN;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class efz implements egc {

    /* JADX INFO: renamed from: a */
    private static final nbh f13905a = nbh.m17259h("com/google/android/apps/camera/hdrplus/debug/AfDebugMetadataSaverImpl");

    /* JADX INFO: renamed from: b */
    private final dhv f13906b;

    /* JADX INFO: renamed from: c */
    private final boolean f13907c;

    public efz(dhv dhvVar) {
        this.f13906b = dhvVar;
        Optional optionalMo6173a = dhvVar.mo6173a(did.f11416a);
        boolean z = false;
        if (optionalMo6173a.isPresent() && ((Integer) optionalMo6173a.get()).equals(Integer.valueOf(dic.SHUTTER_ASAP.ordinal())) && ivt.f32353g != null) {
            z = true;
        }
        this.f13907c = z;
    }

    /* JADX INFO: renamed from: b */
    private static void m7288b(ByteArrayOutputStream byteArrayOutputStream, String str, byte[] bArr) {
        byteArrayOutputStream.write(str.getBytes());
        byteArrayOutputStream.write(bArr);
    }

    @Override // p000.egc
    /* JADX INFO: renamed from: a */
    public final mrm mo7289a(kpp kppVar) {
        mrm mrmVarM16829i;
        if (kppVar == null) {
            ((nbe) ((nbe) f13905a.m17252c()).mo17276G((char) 1420)).mo17290o("3A_DEBUG captureResult is null");
            mrmVarM16829i = mqu.f41450a;
        } else {
            dhv dhvVar = this.f13906b;
            dhx dhxVar = did.f11416a;
            dhvVar.mo6177e();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                mrm mrmVarM16828h = ivt.f32354h != null ? mrm.m16828h((byte[]) kppVar.mo9517d(ivt.f32354h)) : mqu.f41450a;
                if (mrmVarM16828h.mo16813g()) {
                    m7288b(byteArrayOutputStream, "aecDebug", (byte[]) mrmVarM16828h.mo16809c());
                }
                mrm mrmVarM16828h2 = ivt.f32355i != null ? mrm.m16828h((byte[]) kppVar.mo9517d(ivt.f32355i)) : mqu.f41450a;
                if (mrmVarM16828h2.mo16813g()) {
                    m7288b(byteArrayOutputStream, "afDebug", (byte[]) mrmVarM16828h2.mo16809c());
                }
                mrm mrmVarM16828h3 = ivt.f32356j != null ? mrm.m16828h((byte[]) kppVar.mo9517d(ivt.f32356j)) : mqu.f41450a;
                if (mrmVarM16828h3.mo16813g()) {
                    m7288b(byteArrayOutputStream, "awbDebug", (byte[]) mrmVarM16828h3.mo16809c());
                }
                mrmVarM16829i = mrm.m16829i(byteArrayOutputStream.toByteArray());
            } catch (IOException e) {
                ((nbe) ((nbe) ((nbe) f13905a.m17252c()).mo17283h(e)).mo17276G(1412)).mo17293r("Ignoring unexpected exception %s", e);
                mrmVarM16829i = mqu.f41450a;
            }
        }
        if (this.f13907c && !mrmVarM16829i.mo16813g()) {
            ((nbe) ((nbe) f13905a.m17252c()).mo17276G((char) 1419)).mo17290o(DNTdN.frUsDwHexLqlhf);
            dhv dhvVar2 = this.f13906b;
            dhx dhxVar2 = dib.f11240a;
            dhvVar2.mo6177e();
        }
        return mrmVarM16829i;
    }
}
