package p000;

import com.google.android.libraries.camera.exif.ExifInterface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gjy implements gbi {

    /* JADX INFO: renamed from: a */
    public static final byte[] f25200a = ByteBuffer.allocate(12).order(ByteOrder.nativeOrder()).putInt(0).array();

    /* JADX INFO: renamed from: b */
    private static final byte[] f25201b = ByteBuffer.allocate(12).order(ByteOrder.nativeOrder()).putInt(2).array();

    /* JADX INFO: renamed from: c */
    private final gbi f25202c;

    /* JADX INFO: renamed from: d */
    private final jwf f25203d = new jwf(f25200a);

    /* JADX INFO: renamed from: e */
    private final dhv f25204e;

    public gjy(gbi gbiVar, dhv dhvVar) {
        this.f25202c = gbiVar;
        this.f25204e = dhvVar;
    }

    @Override // p000.gbi
    /* JADX INFO: renamed from: a */
    public final jwn mo7626a() {
        return this.f25202c.mo7626a();
    }

    @Override // p000.gbi
    /* JADX INFO: renamed from: b */
    public final jwn mo7627b() {
        dhv dhvVar = this.f25204e;
        dhx dhxVar = dib.f11240a;
        dhvVar.mo6178f();
        return this.f25202c.mo7627b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [gyh, java.lang.Object] */
    @Override // p000.gbi
    /* JADX INFO: renamed from: c */
    public final void mo7628c(gbh gbhVar, glk glkVar) {
        if (glkVar.f25502c.mo9903i() != gyw.LONG_SHOT) {
            this.f25202c.mo7628c(gbhVar, glkVar);
            return;
        }
        this.f25203d.mo3415bf(f25201b);
        new kbc(0, 0);
        hln hlnVar = new hln(krd.JPEG);
        hlnVar.m10447a(new ExifInterface());
        hlnVar.m10448b(kay.m13889b(((fua) glkVar.f25503d).f23573a));
        glkVar.f25502c.mo9912r(null, hlnVar).mo2282d(new ghv(this.f25203d, 9), not.INSTANCE);
    }

    public final String toString() {
        mrl mrlVarM16765d = mpw.m16765d(this);
        mrlVarM16765d.m16823b("delegate", this.f25202c);
        return mrlVarM16765d.toString();
    }
}
