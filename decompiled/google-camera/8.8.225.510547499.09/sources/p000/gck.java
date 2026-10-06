package p000;

import android.hardware.camera2.CaptureRequest;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gck implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f24201a;

    /* JADX INFO: renamed from: b */
    private final oju f24202b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f24203c;

    public gck(oju ojuVar, oju ojuVar2, int i) {
        this.f24203c = i;
        this.f24201a = ojuVar;
        this.f24202b = ojuVar2;
    }

    public gck(oju ojuVar, oju ojuVar2, int i, byte[] bArr) {
        this.f24203c = i;
        this.f24202b = ojuVar;
        this.f24201a = ojuVar2;
    }

    public gck(oju ojuVar, oju ojuVar2, int i, char[] cArr) {
        this.f24203c = i;
        this.f24202b = ojuVar;
        this.f24201a = ojuVar2;
    }

    /* JADX INFO: renamed from: a */
    public static gck m9057a(oju ojuVar, oju ojuVar2) {
        return new gck(ojuVar, ojuVar2, 0);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f24203c) {
            case 0:
                break;
            case 1:
                break;
        }
        return m9058b();
    }

    /* JADX INFO: renamed from: b */
    public final Boolean m9058b() {
        boolean z = true;
        switch (this.f24203c) {
            case 0:
                mrm mrmVar = (mrm) this.f24201a.get();
                Map map = (Map) this.f24202b.get();
                if (!mrmVar.mo16813g() && map.isEmpty()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                jww jwwVar = (jww) this.f24202b.get();
                dhv dhvVar = (dhv) this.f24201a.get();
                CaptureRequest.Key key = ivw.f32418d;
                boolean zMo6184l = dhvVar.mo6184l(dhs.f11165c);
                boolean zBooleanValue = ((Boolean) jwwVar.mo3831be()).booleanValue();
                dhvVar.mo6177e();
                if (key == null || !zMo6184l || !zBooleanValue) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                return Boolean.valueOf(((cde) this.f24201a).m3490a().booleanValue() && ((dhv) this.f24202b.get()).mo6184l(dis.f11707c));
        }
    }
}
