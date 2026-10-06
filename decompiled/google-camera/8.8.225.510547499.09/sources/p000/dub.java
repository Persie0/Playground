package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class dub implements dto {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ duc f12577a;

    public dub(duc ducVar) {
        this.f12577a = ducVar;
    }

    @Override // p000.dto
    /* JADX INFO: renamed from: f */
    public final Set mo6741f() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f12577a.f12581d.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((dto) it.next()).mo6741f());
        }
        return hashSet;
    }

    @Override // p000.dto
    /* JADX INFO: renamed from: g */
    public final void mo6742g(Sensor sensor) {
        for (dto dtoVar : this.f12577a.f12581d) {
            if (dtoVar.mo6741f().contains(sensor)) {
                dtoVar.mo6742g(sensor);
            }
        }
    }

    @Override // p000.dto
    /* JADX INFO: renamed from: h */
    public final void mo6743h(Sensor sensor) {
        for (dto dtoVar : this.f12577a.f12581d) {
            if (dtoVar.mo6741f().contains(sensor)) {
                dtoVar.mo6743h(sensor);
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        for (dto dtoVar : this.f12577a.f12581d) {
            if (dtoVar.mo6741f().contains(sensor)) {
                dtoVar.onAccuracyChanged(sensor, i);
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        for (dto dtoVar : this.f12577a.f12581d) {
            if (dtoVar.mo6741f().contains(sensorEvent.sensor)) {
                dtoVar.onSensorChanged(sensorEvent);
            }
        }
    }
}
