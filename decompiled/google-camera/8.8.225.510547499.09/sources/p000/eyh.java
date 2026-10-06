package p000;

import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eyh extends HandlerThread {

    /* JADX INFO: renamed from: a */
    Handler f20962a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ eyi f20963b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyh(eyi eyiVar) {
        super("sensor thread");
        this.f20963b = eyiVar;
        this.f20962a = null;
    }

    @Override // android.os.HandlerThread
    protected final void onLooperPrepared() {
        this.f20962a = jvh.m13557e(getLooper());
        eyi eyiVar = this.f20963b;
        SensorManager sensorManager = eyiVar.f20965b;
        sensorManager.registerListener(eyiVar.f20979p, sensorManager.getDefaultSensor(1), 1, this.f20962a);
        eyi eyiVar2 = this.f20963b;
        SensorManager sensorManager2 = eyiVar2.f20965b;
        sensorManager2.registerListener(eyiVar2.f20979p, sensorManager2.getDefaultSensor(4), 1, this.f20962a);
        eyi eyiVar3 = this.f20963b;
        SensorManager sensorManager3 = eyiVar3.f20965b;
        sensorManager3.registerListener(eyiVar3.f20979p, sensorManager3.getDefaultSensor(2), 3, this.f20962a);
    }
}
