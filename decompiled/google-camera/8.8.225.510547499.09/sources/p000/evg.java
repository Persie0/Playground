package p000;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class evg {

    /* JADX INFO: renamed from: a */
    public static final nbh f20388a = nbh.m17259h("com/google/android/apps/camera/legacy/app/module/pckimageintent/ImageIntentResultHandler");

    /* JADX INFO: renamed from: b */
    public final WeakReference f20389b;

    /* JADX INFO: renamed from: c */
    public final jvd f20390c;

    /* JADX INFO: renamed from: d */
    public final mrm f20391d;

    /* JADX INFO: renamed from: e */
    public final chj f20392e;

    /* JADX INFO: renamed from: f */
    public final Executor f20393f;

    public evg(WeakReference weakReference, jvd jvdVar, bko bkoVar, chk chkVar, Executor executor, byte[] bArr, byte[] bArr2) {
        this.f20389b = weakReference;
        this.f20390c = jvdVar;
        this.f20392e = chkVar;
        this.f20393f = executor;
        this.f20391d = cds.m3506e(bkoVar.m2611e());
    }
}
