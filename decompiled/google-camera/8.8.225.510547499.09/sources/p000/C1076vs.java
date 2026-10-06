package p000;

/* JADX INFO: renamed from: vs */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "androidx.camera.camera2.pipe.graph.CameraGraphImpl", m18657c = "CameraGraphImpl.kt", m18658d = "acquireSession", m18659e = {161})
final class C1076vs extends omf {

    /* JADX INFO: renamed from: a */
    /* synthetic */ Object f47869a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C1077vt f47870b;

    /* JADX INFO: renamed from: c */
    int f47871c;

    /* JADX INFO: renamed from: d */
    C1077vt f47872d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1076vs(C1077vt c1077vt, ols olsVar) {
        super(olsVar);
        this.f47870b = c1077vt;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        this.f47869a = obj;
        this.f47871c |= Integer.MIN_VALUE;
        return this.f47870b.mo19369b(this);
    }
}
