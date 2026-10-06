package p000;

import android.graphics.Rect;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fyn implements fzu {

    /* JADX INFO: renamed from: a */
    public static final nbh f23925a = nbh.m17259h("com/google/android/apps/camera/one/imagesaver/imagesavers/YuvImageBackendImageSaver");

    /* JADX INFO: renamed from: b */
    public final grc f23926b;

    /* JADX INFO: renamed from: c */
    public final Rect f23927c;

    /* JADX INFO: renamed from: d */
    public final Executor f23928d = jzn.m13824l("BckndYuvEx");

    /* JADX INFO: renamed from: e */
    private final cem f23929e;

    /* JADX INFO: renamed from: f */
    private final bkn f23930f;

    public fyn(cem cemVar, grc grcVar, gdz gdzVar, bkn bknVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f23929e = cemVar;
        this.f23926b = grcVar;
        this.f23930f = bknVar;
        this.f23927c = gdzVar.f24349c;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.Set] */
    @Override // p000.fzu
    /* JADX INFO: renamed from: a */
    public final fzt mo3603a(glk glkVar) {
        kay kayVarM3566d = this.f23929e.m3566d();
        fyp fypVar = new fyp(glkVar.f25502c, kayVarM3566d);
        ?? r3 = glkVar.f25502c;
        bkn bknVar = this.f23930f;
        return new fyd(new fym(this, r3, kayVarM3566d, fypVar, new fzh(bknVar.f3651a, fzf.SW_JPEG)));
    }

    @Override // p000.fzu
    /* JADX INFO: renamed from: b */
    public final fzt mo3604b(glk glkVar) {
        return mo3603a(glkVar);
    }
}
