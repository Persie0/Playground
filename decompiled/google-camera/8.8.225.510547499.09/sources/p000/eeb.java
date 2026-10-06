package p000;

import com.google.android.apps.camera.rectiface.Rectiface$RectifaceCallback;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eeb implements Rectiface$RectifaceCallback {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ eea f13599a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ boolean f13600b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ AtomicReference f13601c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ eec f13602d;

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ int f13603e;

    public eeb(eec eecVar, eea eeaVar, boolean z, AtomicReference atomicReference, int i) {
        this.f13603e = i;
        this.f13602d = eecVar;
        this.f13599a = eeaVar;
        this.f13600b = z;
        this.f13601c = atomicReference;
    }

    @Override // com.google.android.apps.camera.rectiface.Rectiface$RectifaceCallback
    public final void saveImageCopy() {
        switch (this.f13603e) {
            case 0:
                if (this.f13602d.m7211g((eea) this.f13601c.get())) {
                    this.f13602d.m7210f(this.f13599a, dzk.DOGFOOD_ONLY);
                }
                break;
            default:
                if (this.f13602d.m7211g((eea) this.f13601c.get())) {
                    this.f13602d.m7210f(this.f13599a, dzk.DOGFOOD_ONLY);
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [gaw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [gaw, java.lang.Object] */
    @Override // com.google.android.apps.camera.rectiface.Rectiface$RectifaceCallback
    public final void update(float f) {
        switch (this.f13603e) {
            case 0:
                this.f13599a.f13597n.f25500a.mo9016a(eec.f13604a, f);
                if (this.f13600b) {
                    dhv dhvVar = this.f13602d.f13611h;
                    int i = dhn.f11140a;
                    dhvVar.mo6177e();
                }
                break;
            default:
                this.f13599a.f13597n.f25500a.mo9016a(eec.f13604a, f);
                if (this.f13600b) {
                    dhv dhvVar2 = this.f13602d.f13611h;
                    int i2 = dhn.f11140a;
                    dhvVar2.mo6177e();
                }
                break;
        }
    }
}
