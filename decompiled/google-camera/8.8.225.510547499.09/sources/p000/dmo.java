package p000;

import android.graphics.Bitmap;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dmo implements gys {

    /* JADX INFO: renamed from: a */
    private final kbz f12037a;

    /* JADX INFO: renamed from: b */
    private final long f12038b;

    /* JADX INFO: renamed from: c */
    private long f12039c;

    /* JADX INFO: renamed from: d */
    private kcc f12040d;

    /* JADX INFO: renamed from: e */
    private final bko f12041e;

    public dmo(bko bkoVar, kbz kbzVar, dhv dhvVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f12041e = bkoVar;
        this.f12037a = kbzVar;
        this.f12038b = ((Integer) dhvVar.mo6173a(dib.f11382x).get()).intValue();
    }

    @Override // p000.gys
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo6399a() {
    }

    @Override // p000.gys
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo6400b() {
    }

    @Override // p000.gys
    /* JADX INFO: renamed from: c */
    public final void mo6401c(fcu fcuVar) {
        this.f12040d = this.f12037a.mo13957a("Thumbnail.CaptureToTinyThumb");
    }

    @Override // p000.gys
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void mo6402d(Bitmap bitmap) {
    }

    @Override // p000.gys
    /* JADX INFO: renamed from: e */
    public final void mo6403e() {
        kcc kccVar = this.f12040d;
        if (kccVar != null) {
            kccVar.mo13952a();
            this.f12040d = null;
        }
        if (this.f12038b == 0 || this.f12039c == 0 || TimeUnit.NANOSECONDS.toMillis(SystemClock.elapsedRealtimeNanos() - this.f12039c) <= this.f12038b) {
            return;
        }
        this.f12041e.m2632z();
    }

    @Override // p000.gys
    /* JADX INFO: renamed from: f */
    public final void mo6404f(mrm mrmVar) {
        if (mrmVar.mo16813g()) {
            this.f12039c = ((hkz) mrmVar.mo16809c()).m10429d();
        }
    }

    @Override // p000.gys
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void mo6405g(int i, int i2, Throwable th) {
    }

    @Override // p000.gys
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void mo6406h(int i, int i2, Throwable th) {
    }

    @Override // p000.gys
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void mo6407i(int i, int i2) {
    }

    @Override // p000.gys
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void mo6408j(int i, int i2) {
    }
}
