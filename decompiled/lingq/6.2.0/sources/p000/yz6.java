package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* JADX INFO: loaded from: classes2.dex */
public final class yz6 implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    public final float[] f70698a = new float[16];

    /* JADX INFO: renamed from: b */
    public final float[] f70699b = new float[16];

    /* JADX INFO: renamed from: c */
    public final float[] f70700c = new float[16];

    /* JADX INFO: renamed from: d */
    public final float[] f70701d = new float[3];

    /* JADX INFO: renamed from: e */
    public final Display f70702e;

    /* JADX INFO: renamed from: f */
    public final xz6[] f70703f;

    /* JADX INFO: renamed from: g */
    public boolean f70704g;

    public yz6(Display display, xz6... xz6VarArr) {
        this.f70702e = display;
        this.f70703f = xz6VarArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f70698a;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f70702e.getRotation();
        float[] fArr3 = this.f70699b;
        if (rotation != 0) {
            int i2 = 129;
            if (rotation != 1) {
                i = 130;
                if (rotation != 2) {
                    if (rotation != 3) {
                        uk9.m22770c();
                        return;
                    } else {
                        i2 = 130;
                        i = 1;
                    }
                }
            } else {
                i = 129;
                i2 = 2;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i2, i, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, 131, fArr3);
        float[] fArr4 = this.f70701d;
        SensorManager.getOrientation(fArr3, fArr4);
        float f = fArr4[2];
        Matrix.rotateM(fArr2, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        boolean z = this.f70704g;
        float[] fArr5 = this.f70700c;
        if (!z) {
            nc0.m17325b(fArr5, fArr2);
            this.f70704g = true;
        }
        System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr2, 0, fArr3, 0, fArr5, 0);
        for (int i3 = 0; i3 < 2; i3++) {
            this.f70703f[i3].mo11811a(f, fArr2);
        }
    }
}
