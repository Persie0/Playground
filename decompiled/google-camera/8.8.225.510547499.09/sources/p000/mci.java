package p000;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.upload.F250UploadClient$upload$1", m18657c = "F250UploadClient.kt", m18658d = "invokeSuspend", m18659e = {95})
public final class mci extends oml implements onm {

    /* JADX INFO: renamed from: a */
    int f39946a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f39947b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ oeh f39948c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ String f39949d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ lzd f39950e;

    /* JADX INFO: renamed from: f */
    private /* synthetic */ Object f39951f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mci(String str, lzd lzdVar, oeh oehVar, String str2, ols olsVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(2, olsVar);
        this.f39947b = str;
        this.f39950e = lzdVar;
        this.f39948c = oehVar;
        this.f39949d = str2;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((mci) mo562c((oub) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oem oemVar;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f39946a) {
            case 0:
                lkm.m15592s(obj);
                oub oubVar = (oub) this.f39951f;
                if (this.f39947b != null) {
                    ncg ncgVar = mcj.f39952a;
                    oemVar = new oem(this.f39947b, "PUT", null, this.f39948c, true);
                } else {
                    ncg ncgVar2 = mcj.f39952a;
                    oej oejVar = new oej();
                    oejVar.m18418d("X-Goog-Upload-Header-Content-Length", String.valueOf(this.f39948c.mo18410d()));
                    String str = this.f39949d;
                    oeh oehVar = this.f39948c;
                    boolean z = mpw.m16770i("POST", "put") || mpw.m16770i("POST", "post");
                    lku.m15669w(z);
                    oemVar = new oem(str, "POST", oejVar, oehVar, false);
                }
                oemVar.mo18427g(new mcl(oubVar), 4194304, 250);
                npt nptVarM17615a = npt.m17615a(new kij(oemVar, 15));
                nax naxVar = new nax((byte[]) null);
                naxVar.m17234c("Scotty-Uploader-ResumableTransfer-%d");
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(nax.m17231d(naxVar));
                executorServiceNewSingleThreadExecutor.submit(nptVarM17615a);
                executorServiceNewSingleThreadExecutor.shutdown();
                mch mchVar = new mch(oemVar, nptVarM17615a, this.f39948c);
                this.f39946a = 1;
                if (ooc.m18748n(oubVar, mchVar, this) == omaVar) {
                    return omaVar;
                }
                break;
            default:
                lkm.m15592s(obj);
                break;
        }
        return oki.f46196a;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        mci mciVar = new mci(this.f39947b, this.f39950e, this.f39948c, this.f39949d, olsVar, null, null, null);
        mciVar.f39951f = obj;
        return mciVar;
    }
}
