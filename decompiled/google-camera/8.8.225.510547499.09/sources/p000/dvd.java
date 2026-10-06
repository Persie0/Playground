package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dvd implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f12638a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f12639b;

    public dvd(dug dugVar, int i) {
        this.f12639b = i;
        this.f12638a = dugVar;
    }

    public dvd(dvg dvgVar, int i) {
        this.f12639b = i;
        this.f12638a = dvgVar;
    }

    public dvd(eyi eyiVar, int i) {
        this.f12639b = i;
        this.f12638a = eyiVar;
    }

    public dvd(fdq fdqVar, int i) {
        this.f12639b = i;
        this.f12638a = fdqVar;
    }

    public dvd(gwu gwuVar, int i) {
        this.f12639b = i;
        this.f12638a = gwuVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        switch (this.f12639b) {
            case 0:
                if (((dug) this.f12638a).mo6726e()) {
                    ((dug) this.f12638a).onAccuracyChanged(sensor, i);
                }
                break;
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        mws mwsVarM17095j;
        switch (this.f12639b) {
            case 0:
                if (((dug) this.f12638a).mo6726e()) {
                    ((dug) this.f12638a).onSensorChanged(sensorEvent);
                    return;
                }
                return;
            case 1:
                ((dvg) this.f12638a).m6775h(sensorEvent.timestamp, sensorEvent.values);
                return;
            case 2:
                if (sensorEvent.sensor.getType() == 1) {
                    eyi eyiVar = (eyi) this.f12638a;
                    if (eyiVar.f20967d) {
                        inh inhVar = eyiVar.f20966c;
                        float f = sensorEvent.values[0] * 0.15f;
                        inh inhVar2 = eyiVar.f20966c;
                        inhVar.f31591a = f + (inhVar2.f31591a * 0.85f);
                        float f2 = sensorEvent.values[1] * 0.15f;
                        inh inhVar3 = eyiVar.f20966c;
                        inhVar2.f31592b = f2 + (inhVar3.f31592b * 0.85f);
                        inhVar3.f31593c = (sensorEvent.values[2] * 0.15f) + (eyiVar.f20966c.f31593c * 0.85f);
                    } else {
                        eyiVar.f20966c.m11512a(sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]);
                        eyiVar.f20967d = true;
                    }
                    ((eyi) this.f12638a).f20973j.m7010c(sensorEvent.values, sensorEvent.timestamp);
                    return;
                }
                if (sensorEvent.sensor.getType() == 2) {
                    ((eyi) this.f12638a).f20968e[0] = sensorEvent.values[0];
                    ((eyi) this.f12638a).f20968e[1] = sensorEvent.values[1];
                    ((eyi) this.f12638a).f20968e[2] = sensorEvent.values[2];
                    return;
                }
                if (sensorEvent.sensor.getType() == 4) {
                    float[] fArr = sensorEvent.values;
                    fArr[0] = fArr[0] - ((eyi) this.f12638a).f20971h[0];
                    float[] fArr2 = sensorEvent.values;
                    fArr2[1] = fArr2[1] - ((eyi) this.f12638a).f20971h[1];
                    float[] fArr3 = sensorEvent.values;
                    fArr3[2] = fArr3[2] - ((eyi) this.f12638a).f20971h[2];
                    float f3 = sensorEvent.values[0] * sensorEvent.values[0];
                    float f4 = sensorEvent.values[1] * sensorEvent.values[1];
                    float f5 = sensorEvent.values[2] * sensorEvent.values[2];
                    eyi eyiVar2 = (eyi) this.f12638a;
                    float f6 = f3 + f4 + f5;
                    eyiVar2.f20976m = f6;
                    eyp eypVar = eyiVar2.f20975l;
                    if (eypVar != null) {
                        eypVar.mo8051a(Float.valueOf(f6));
                    }
                    Object obj = this.f12638a;
                    eyi eyiVar3 = (eyi) obj;
                    if (eyiVar3.f20969f != 0) {
                        long j = sensorEvent.timestamp - eyiVar3.f20969f;
                        synchronized (obj) {
                            float f7 = j;
                            float[] fArr4 = ((eyi) obj).f20970g;
                            float f8 = f7 * 1.0E-9f;
                            fArr4[0] = fArr4[0] + (sensorEvent.values[0] * f8);
                            float[] fArr5 = ((eyi) obj).f20970g;
                            fArr5[1] = fArr5[1] + (sensorEvent.values[1] * f8);
                            float[] fArr6 = ((eyi) obj).f20970g;
                            fArr6[2] = fArr6[2] + (sensorEvent.values[2] * f8);
                            ((eyi) obj).f20972i++;
                            break;
                        }
                    }
                    eyiVar3.f20969f = sensorEvent.timestamp;
                    ((eyi) this.f12638a).f20973j.m7011d(sensorEvent.values, sensorEvent.timestamp);
                    return;
                }
                return;
            case 3:
                if (sensorEvent.sensor.getType() != 9) {
                    if (sensorEvent.sensor.getType() == 4) {
                        fdv fdvVar = ((fdq) this.f12638a).f21470a;
                        float[] fArr7 = (float[]) sensorEvent.values.clone();
                        long j2 = sensorEvent.timestamp;
                        float fM8285a = fdv.m8285a(fArr7, fArr7);
                        if (fdvVar.f21497d >= 0 && fM8285a <= 1.0E-4f) {
                            fdvVar.f21499f = Math.min(fdvVar.f21499f + 1, 5);
                            return;
                        } else {
                            fdvVar.f21497d = j2;
                            fdvVar.f21499f = 0;
                            return;
                        }
                    }
                    return;
                }
                fdv fdvVar2 = ((fdq) this.f12638a).f21470a;
                float[] fArr8 = (float[]) sensorEvent.values.clone();
                long j3 = sensorEvent.timestamp;
                float fSqrt = (float) Math.sqrt(fdv.m8285a(fArr8, fArr8));
                if (fSqrt == 0.0f) {
                    return;
                }
                float f9 = 1.0f / fSqrt;
                float fAcos = (float) Math.acos(fdv.m8285a(new float[]{fArr8[0] * f9, fArr8[1] * f9, fArr8[2] * f9}, fdvVar2.f21494a));
                if (fdvVar2.f21496c >= 0 && fAcos <= fdvVar2.f21495b) {
                    fdvVar2.f21498e = Math.min(fdvVar2.f21498e + 1, 5);
                    return;
                } else {
                    fdvVar2.f21496c = j3;
                    fdvVar2.f21498e = 0;
                    return;
                }
            default:
                if (sensorEvent.sensor.getType() == ((gwu) this.f12638a).f26637c.getType()) {
                    SensorManager.getRotationMatrixFromVector(((gwu) this.f12638a).f26639e, sensorEvent.values);
                    gwu gwuVar = (gwu) this.f12638a;
                    SensorManager.remapCoordinateSystem(gwuVar.f26639e, 1, 3, gwuVar.f26640f);
                    gwu gwuVar2 = (gwu) this.f12638a;
                    SensorManager.getOrientation(gwuVar2.f26640f, gwuVar2.f26641g);
                    Object obj2 = this.f12638a;
                    gwu gwuVar3 = (gwu) obj2;
                    float[] fArr9 = gwuVar3.f26641g;
                    float f10 = (fArr9[0] * 57.29578f) % 360.0f;
                    if (f10 < 0.0f) {
                        f10 += 360.0f;
                    }
                    float f11 = fArr9[1] * 57.29578f;
                    float f12 = (fArr9[2] * 57.29578f) % 360.0f;
                    if (f12 < 0.0f) {
                        f12 += 360.0f;
                    }
                    gwt gwtVar = new gwt(f10, f11, f12);
                    synchronized (gwuVar3.f26638d) {
                        mwsVarM17095j = mws.m17095j(((gwu) obj2).f26642h);
                        break;
                    }
                    int size = mwsVarM17095j.size();
                    for (int i = 0; i < size; i++) {
                        ((gws) mwsVarM17095j.get(i)).mo3532b(gwtVar);
                    }
                    return;
                }
                return;
        }
    }
}
