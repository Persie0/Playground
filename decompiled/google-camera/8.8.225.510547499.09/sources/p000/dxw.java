package p000;

import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dxw implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f12856a;

    /* JADX INFO: renamed from: b */
    private final oju f12857b;

    public dxw(oju ojuVar, oju ojuVar2) {
        this.f12856a = ojuVar;
        this.f12857b = ojuVar2;
    }

    /* JADX INFO: renamed from: b */
    public static dxw m6883b(oju ojuVar, oju ojuVar2) {
        return new dxw(ojuVar, ojuVar2);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Handler get() {
        jvb jvbVar = (jvb) this.f12856a.get();
        return jvh.m13558f(jvbVar, "MicrovideoQSharedStartup");
    }
}
