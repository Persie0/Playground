package p000;

import android.hardware.camera2.CameraCharacteristics;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kdd implements kat {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f35634a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f35635b;

    public kdd(kmq kmqVar, int i) {
        this.f35635b = i;
        this.f35634a = kmqVar;
    }

    public kdd(kon konVar, int i, byte[] bArr) {
        this.f35635b = i;
        this.f35634a = konVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kme] */
    @Override // p000.kat
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo13589a(Object obj) {
        boolean z = true;
        switch (this.f35635b) {
            case 0:
                return Boolean.valueOf(obj.mo14558k() == this.f35634a);
            default:
                if (obj.mo14544M() && obj.mo14535D()) {
                    Object obj2 = this.f35634a;
                    Iterator it = ((kmc) obj).f36526b.iterator();
                    while (it.hasNext()) {
                        Integer num = (Integer) ((kmc) ((kon) obj2).f36701a.mo13854a((kmg) it.next())).mo14561n(CameraCharacteristics.SENSOR_INFO_COLOR_FILTER_ARRANGEMENT);
                        if (num.intValue() != 0 && num.intValue() != 2 && num.intValue() != 3 && num.intValue() != 4) {
                            z = false;
                        }
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
