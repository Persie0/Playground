package p000;

import android.graphics.Bitmap;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gxp implements gys {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ File f26736a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ gyh f26737b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ gxq f26738c;

    public gxp(gxq gxqVar, File file, gyh gyhVar) {
        this.f26738c = gxqVar;
        this.f26736a = file;
        this.f26737b = gyhVar;
    }

    @Override // p000.gys
    /* JADX INFO: renamed from: a */
    public final void mo6399a() {
        this.f26738c.f26742c.execute(new gpn(this.f26736a, 18));
    }

    @Override // p000.gys
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo6400b() {
    }

    @Override // p000.gys
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void mo6401c(fcu fcuVar) {
    }

    @Override // p000.gys
    /* JADX INFO: renamed from: d */
    public final void mo6402d(Bitmap bitmap) {
        if (this.f26738c.f26741b.mo6184l(dib.f11341bv)) {
            return;
        }
        this.f26738c.f26742c.execute(new gxn(bitmap, this.f26736a, this.f26737b, 2));
    }

    @Override // p000.gys
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void mo6403e() {
    }

    @Override // p000.gys
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void mo6404f(mrm mrmVar) {
    }

    @Override // p000.gys
    /* JADX INFO: renamed from: g */
    public final void mo6405g(int i, int i2, Throwable th) {
        this.f26738c.f26742c.execute(new gpn(this.f26736a, 19));
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
