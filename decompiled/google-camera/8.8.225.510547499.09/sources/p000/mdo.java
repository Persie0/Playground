package p000;

import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.upload.ResourceManifestUploader$transmitUploadError$2", m18657c = "ResourceManifestUploader.kt", m18658d = "invokeSuspend", m18659e = {C0100R.styleable.AppCompatTheme_windowMinWidthMajor})
public final class mdo extends oml implements oni {

    /* JADX INFO: renamed from: a */
    int f40114a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ mea f40115b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ mdz f40116c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ lwz f40117d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdo(lwz lwzVar, mea meaVar, mdz mdzVar, ols olsVar, byte[] bArr) {
        super(1, olsVar);
        this.f40117d = lwzVar;
        this.f40115b = meaVar;
        this.f40116c = mdzVar;
    }

    @Override // p000.oni
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo1803a(Object obj) {
        return new mdo(this.f40117d, this.f40115b, this.f40116c, (ols) obj, null).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f40114a) {
            case 0:
                lkm.m15592s(obj);
                Object obj2 = this.f40117d.f39489a;
                lzb lzbVar = this.f40115b.f40161a;
                double dM16332a = this.f40116c.m16332a(0L);
                this.f40114a = 1;
                Object objMo16258e = ((lzv) obj2).mo16258e(lzbVar.f39611u, dM16332a, lwh.UPLOAD_PAUSED, this);
                if (objMo16258e != oma.COROUTINE_SUSPENDED) {
                    objMo16258e = oki.f46196a;
                }
                if (objMo16258e == omaVar) {
                    return omaVar;
                }
                break;
            default:
                lkm.m15592s(obj);
                break;
        }
        return oki.f46196a;
    }
}
