package p000;

import android.hardware.camera2.CameraCharacteristics;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cem {

    /* JADX INFO: renamed from: a */
    private final int f5453a;

    /* JADX INFO: renamed from: b */
    private final boolean f5454b;

    /* JADX INFO: renamed from: c */
    private final inm f5455c;

    /* JADX INFO: renamed from: d */
    private final dhv f5456d;

    /* JADX INFO: renamed from: e */
    private final jwn f5457e;

    /* JADX INFO: renamed from: f */
    private final kov f5458f;

    public cem(kov kovVar, inm inmVar, dhv dhvVar, int i, boolean z, jwn jwnVar) {
        this.f5453a = i;
        this.f5454b = z;
        this.f5458f = kovVar;
        this.f5455c = inmVar;
        this.f5456d = dhvVar;
        this.f5457e = jwnVar;
    }

    /* JADX INFO: renamed from: a */
    public static int m3563a(int i, int i2, inm inmVar, boolean z, dhv dhvVar) {
        int i3;
        if (dhvVar.mo6184l(dib.f11314bU) && inmVar.m11528d()) {
            kay kayVarM13889b = kay.m13889b(i2);
            if (inmVar.f31601a) {
                float[] fArrM11530f = inmVar.m11530f();
                float fAsin = (float) Math.asin(fArrM11530f[5]);
                float f = (float) (-Math.asin(fArrM11530f[4]));
                if (Math.abs(fAsin) > Math.abs(f)) {
                    i3 = fAsin < 0.0f ? 180 : 0;
                } else if (Math.abs(fAsin) < Math.abs(f)) {
                    i3 = f < 0.0f ? 90 : 270;
                }
                kayVarM13889b = kay.m13889b(i3);
            }
            i2 = kayVarM13889b.f35503e;
            if (inmVar.m11527c()) {
                i2 = (360 - i2) % 360;
            }
        } else if (z) {
            i2 = (360 - i2) % 360;
        }
        return (i + i2) % 360;
    }

    /* JADX INFO: renamed from: b */
    public static int m3564b(int i, inm inmVar, kmd kmdVar, jwn jwnVar, dhv dhvVar) {
        Integer num = (Integer) kmdVar.mo14559l(CameraCharacteristics.LENS_FACING);
        Integer numValueOf = Integer.valueOf(dhvVar.mo6184l(dib.f11315bV) ? ((Integer) jwnVar.mo3831be()).intValue() : kmdVar.mo14553f());
        if (num != null) {
            return m3563a(numValueOf.intValue(), i, inmVar, num.intValue() == 0, dhvVar);
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final jwn m3565c() {
        return jwr.m13640j(new ggk(this.f5458f), new dzm(this, 1));
    }

    /* JADX INFO: renamed from: d */
    public final kay m3566d() {
        return m3567e(this.f5458f.m14647a());
    }

    /* JADX INFO: renamed from: e */
    public final kay m3567e(kay kayVar) {
        return kay.m13889b(m3563a(this.f5456d.mo6184l(dib.f11315bV) ? ((Integer) this.f5457e.mo3831be()).intValue() : this.f5453a, kayVar.f35503e, this.f5455c, this.f5454b, this.f5456d));
    }
}
