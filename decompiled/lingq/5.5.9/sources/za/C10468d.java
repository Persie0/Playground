package za;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* JADX INFO: renamed from: za.d */
/* JADX INFO: loaded from: classes.dex */
public final class C10468d implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    public final float[] f52340a = new float[16];

    /* JADX INFO: renamed from: b */
    public final float[] f52341b = new float[16];

    /* JADX INFO: renamed from: c */
    public final float[] f52342c = new float[16];

    /* JADX INFO: renamed from: d */
    public final float[] f52343d = new float[3];

    /* JADX INFO: renamed from: e */
    public final Display f52344e;

    /* JADX INFO: renamed from: f */
    public final a[] f52345f;

    /* JADX INFO: renamed from: g */
    public boolean f52346g;

    /* JADX INFO: renamed from: za.d$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo19420a(float f3, float[] fArr);
    }

    public C10468d(Display display, a... aVarArr) {
        this.f52344e = display;
        this.f52345f = aVarArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i10;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f52340a;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f52344e.getRotation();
        float[] fArr3 = this.f52341b;
        if (rotation != 0) {
            int i11 = 129;
            if (rotation != 1) {
                i10 = 130;
                if (rotation != 2) {
                    if (rotation != 3) {
                        throw new IllegalStateException();
                    }
                    i11 = 130;
                    i10 = 1;
                }
            } else {
                i10 = 129;
                i11 = 2;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i11, i10, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, 131, fArr3);
        float[] fArr4 = this.f52343d;
        SensorManager.getOrientation(fArr3, fArr4);
        float f3 = fArr4[2];
        Matrix.rotateM(this.f52340a, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        float[] fArr5 = this.f52340a;
        if (!this.f52346g) {
            C10467c.m19419a(this.f52342c, fArr5);
            this.f52346g = true;
        }
        System.arraycopy(fArr5, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr5, 0, this.f52341b, 0, this.f52342c, 0);
        for (a aVar : this.f52345f) {
            aVar.mo19420a(f3, fArr2);
        }
    }
}
