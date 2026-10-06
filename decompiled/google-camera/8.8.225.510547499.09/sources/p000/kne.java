package p000;

import android.hardware.HardwareBuffer;
import android.hardware.Sensor;
import android.hardware.SensorDirectChannel;
import android.hardware.SensorManager;
import android.support.wearable.complications.rendering.p002EM.voNZjxiJou;
import com.google.android.apps.camera.jni.tracking.yRU.CswIK;
import com.google.android.apps.camera.zoomui.view.WdNM.xPAWq;
import com.google.android.gms.dynamite.p017ho.DNTdN;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kne implements kni {

    /* JADX INFO: renamed from: a */
    public final kbo f36589a;

    /* JADX INFO: renamed from: c */
    private final SensorManager f36591c;

    /* JADX INFO: renamed from: d */
    private final Set f36592d = new HashSet();

    /* JADX INFO: renamed from: b */
    public ktz f36590b = null;

    public kne(SensorManager sensorManager, kbo kboVar) {
        this.f36591c = sensorManager;
        this.f36589a = kboVar.mo6314a("DirectGyro");
    }

    /* JADX INFO: renamed from: c */
    private final synchronized void m14590c() {
        this.f36589a.mo13940b("Shutting down gyro direct channel");
        ktz ktzVar = this.f36590b;
        if (ktzVar == null) {
            this.f36589a.mo13947i("Failed to stop direct gyro provider: Already stopped");
            return;
        }
        if (((SensorDirectChannel) ktzVar.f37201d).configure((Sensor) ktzVar.f37199b, 0) == 0) {
            this.f36589a.mo13942d("Failed to stop direct gyro provider: Unable to configure gyro direct channel.");
        } else {
            this.f36589a.mo13940b("Stopped gyro direct channel successfully.");
        }
        ((SensorDirectChannel) ktzVar.f37201d).close();
        ((khb) ktzVar.f37200c).m14250p();
        this.f36590b = null;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00d3 A[Catch: all -> 0x00e1, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x000c, B:9:0x0020, B:11:0x0026, B:14:0x002f, B:20:0x004a, B:28:0x0068, B:29:0x0072, B:36:0x0086, B:44:0x00b3, B:50:0x00c7, B:52:0x00d3, B:53:0x00d6, B:55:0x00d8), top: B:64:0x0001, inners: #5 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    private final synchronized void m14591d() {
        Throwable th;
        SensorDirectChannel sensorDirectChannelCreateDirectChannel;
        this.f36589a.mo13940b("Starting up gyro direct channel");
        if (this.f36590b != null) {
            this.f36589a.mo13947i(voNZjxiJou.SlmFiD);
            return;
        }
        try {
            HardwareBuffer hardwareBufferCreate = HardwareBuffer.create(624000, 1, 33, 1, 25165827L);
            if (hardwareBufferCreate == null) {
                this.f36589a.mo13942d("Failed to start direct gyro provider: Hardware Buffer returned null.");
                return;
            }
            khb khbVar = new khb(hardwareBufferCreate);
            SensorDirectChannel sensorDirectChannel = 0;
            try {
                try {
                    knf knfVar = new knf(khbVar, null, null, null);
                    try {
                        sensorDirectChannelCreateDirectChannel = this.f36591c.createDirectChannel(hardwareBufferCreate);
                        if (sensorDirectChannelCreateDirectChannel == null) {
                            try {
                                this.f36589a.mo13942d(xPAWq.FNAjeDps);
                                this.f36589a.mo13940b("Closing hardware buffer");
                                khbVar.m14250p();
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                this.f36589a.mo13943e(CswIK.dUGAPwdfQjNKkce, th);
                                this.f36589a.mo13940b(DNTdN.BCUZhwnhBb);
                                khbVar.m14250p();
                                if (sensorDirectChannelCreateDirectChannel != null) {
                                    sensorDirectChannelCreateDirectChannel.close();
                                }
                            }
                        }
                        Sensor defaultSensor = this.f36591c.getDefaultSensor(4);
                        if (defaultSensor == null) {
                            this.f36589a.mo13942d("Failed to start direct gyro provider: Getting default sensor returned null.");
                            this.f36589a.mo13940b("Closing hardware buffer");
                            khbVar.m14250p();
                        } else if (sensorDirectChannelCreateDirectChannel.configure(defaultSensor, 2) != 0) {
                            this.f36589a.mo13940b("Started gyro direct channel successfully");
                            this.f36590b = new ktz(khbVar, sensorDirectChannelCreateDirectChannel, defaultSensor, knfVar, null, null, null);
                            return;
                        } else {
                            this.f36589a.mo13942d("Failed to start direct gyro provider: Unable to configure gyro direct channel.");
                            this.f36589a.mo13940b("Closing hardware buffer");
                            khbVar.m14250p();
                        }
                        sensorDirectChannelCreateDirectChannel.close();
                    } catch (Throwable th3) {
                        th = th3;
                        sensorDirectChannelCreateDirectChannel = null;
                    }
                } catch (Throwable th4) {
                    sensorDirectChannel = hardwareBufferCreate;
                    th = th4;
                    this.f36589a.mo13940b("Closing hardware buffer");
                    khbVar.m14250p();
                    if (sensorDirectChannel != 0) {
                        sensorDirectChannel.close();
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                this.f36589a.mo13940b("Closing hardware buffer");
                khbVar.m14250p();
                if (sensorDirectChannel != 0) {
                    sensorDirectChannel.close();
                }
                throw th;
            }
        } catch (IllegalArgumentException e) {
            this.f36589a.mo13943e("Failed to start direct gyro provider: Creating the hardware buffer threw an IllegalArgumentException exception.", e);
        }
    }

    @Override // p000.kni
    /* JADX INFO: renamed from: a */
    public final synchronized knh mo7000a(String str) {
        if (this.f36592d.isEmpty()) {
            m14591d();
        } else {
            for (knh knhVar : this.f36592d) {
                if (str.equals(knhVar.mo6998a())) {
                    this.f36589a.mo13940b("Fast gyro provider session existed for: " + knhVar.mo6998a() + ". No new session added.");
                    return knhVar;
                }
            }
        }
        if (this.f36590b == null) {
            this.f36589a.mo13942d("Failed to open new direct gyro session: Hardware was null.");
            return null;
        }
        knl knlVar = new knl(this, str, 1);
        this.f36592d.add(knlVar);
        this.f36589a.mo13940b("Fast gyro provider session added for: ".concat(knlVar.f36614a));
        return knlVar;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m14592b(knh knhVar) {
        if (this.f36592d.remove(knhVar)) {
            this.f36589a.mo13940b("Fast gyro provider session closed for: " + ((knl) knhVar).f36614a + " Remaining number of sessions = " + this.f36592d.size());
        }
        if (this.f36592d.isEmpty()) {
            m14590c();
        }
    }

    protected final synchronized void finalize() {
        ktz ktzVar = this.f36590b;
        if (ktzVar != null) {
            if (((SensorDirectChannel) ktzVar.f37201d).configure((Sensor) ktzVar.f37199b, 0) == 0) {
                this.f36589a.mo13942d("Failed to stop direct gyro provider in finalizer: Unable to configure gyro direct channel.");
            }
            ((SensorDirectChannel) ktzVar.f37201d).close();
            ((khb) ktzVar.f37200c).m14250p();
            this.f36589a.mo13947i("Gyro direct channel reference potentially leaked and was closed in finalizer.");
            this.f36590b = null;
        }
    }
}
