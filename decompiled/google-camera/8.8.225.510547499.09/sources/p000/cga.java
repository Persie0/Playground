package p000;

import com.google.googlex.gcam.FloatDeque;
import com.google.googlex.gcam.GcamModuleJNI;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cga {

    /* JADX INFO: renamed from: a */
    public final FloatDeque f5555a;

    public cga() {
        this.f5555a = new FloatDeque(GcamModuleJNI.new_FloatDeque__SWIG_0(), true);
    }

    public cga(FloatDeque floatDeque) {
        this.f5555a = floatDeque;
    }

    /* JADX INFO: renamed from: a */
    public final float m3615a(int i) {
        FloatDeque floatDeque = this.f5555a;
        return GcamModuleJNI.FloatDeque_getitem(floatDeque.f8259a, floatDeque, i);
    }

    /* JADX INFO: renamed from: b */
    public final long m3616b() {
        FloatDeque floatDeque = this.f5555a;
        return GcamModuleJNI.FloatDeque_size(floatDeque.f8259a, floatDeque);
    }

    /* JADX INFO: renamed from: c */
    public final void m3617c(float f) {
        FloatDeque floatDeque = this.f5555a;
        GcamModuleJNI.FloatDeque_push_back(floatDeque.f8259a, floatDeque, f);
    }
}
