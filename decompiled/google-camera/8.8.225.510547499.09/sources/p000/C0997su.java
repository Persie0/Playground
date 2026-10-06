package p000;

/* JADX INFO: renamed from: su */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor", m18657c = "RetryingCameraStateOpener.kt", m18658d = "awaitAvailableCamera-RzXb1QE", m18659e = {92})
public final class C0997su extends omf {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47608a;

    /* JADX INFO: renamed from: b */
    public int f47609b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ bck f47610c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0997su(bck bckVar, ols olsVar, byte[] bArr, byte[] bArr2) {
        super(olsVar);
        this.f47610c = bckVar;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        this.f47608a = obj;
        this.f47609b |= Integer.MIN_VALUE;
        return this.f47610c.m2212i(null, 0L, this);
    }
}
