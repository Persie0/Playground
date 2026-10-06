package p000;

import com.google.android.apps.camera.app.silentfeedback.p004ip.TVkaNXnfP;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gbk implements fvw {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ gbl f24098a;

    /* JADX INFO: renamed from: b */
    private final gbh f24099b;

    /* JADX INFO: renamed from: c */
    private final ccz f24100c;

    /* JADX INFO: renamed from: d */
    private final kbz f24101d;

    /* JADX INFO: renamed from: e */
    private final glk f24102e;

    public gbk(gbl gblVar, gbh gbhVar, glk glkVar, ccz cczVar, kbz kbzVar, byte[] bArr, byte[] bArr2) {
        this.f24098a = gblVar;
        this.f24099b = gbhVar;
        this.f24102e = glkVar;
        this.f24100c = cczVar;
        this.f24101d = kbzVar;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [gav, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [gav, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [gyh, java.lang.Object] */
    @Override // p000.fvw
    /* JADX INFO: renamed from: a */
    public final void mo8841a() throws Throwable {
        Throwable th;
        Exception runtimeException = new RuntimeException("Unknown exception in PictureTaker.");
        try {
            try {
                try {
                    gbi gbiVar = (gbi) this.f24098a.f24103a.get(1000L, TimeUnit.MILLISECONDS);
                    if (!((Boolean) gbiVar.mo7626a().mo3831be()).booleanValue()) {
                        String str = "Take picture was invoked, but the picture taker is not available! Command " + String.valueOf(gbiVar);
                        this.f24098a.f24104b.mo13942d(str);
                        kec kecVar = new kec(str);
                        this.f24098a.f24104b.mo13944f("PictureTakerCommand.run: success=false");
                        this.f24099b.close();
                        this.f24102e.f25502c.mo9917w(kecVar);
                        this.f24102e.f25501b.mo9013f();
                        ((fua) this.f24102e.f25503d).f23578f.close();
                        return;
                    }
                    this.f24098a.f24104b.mo13944f(TVkaNXnfP.NGlKvdDPqAbYpT + String.valueOf(gbiVar));
                    this.f24101d.mo13961e("collect3AStats");
                    this.f24100c.m3474b(4);
                    this.f24101d.mo13963g("captureImage");
                    gbiVar.mo7628c(this.f24099b, this.f24102e);
                    if (!((Boolean) this.f24098a.f24108f.mo10031c(gzy.f27036at)).booleanValue() && this.f24098a.f24109g.m5652K()) {
                        this.f24101d.mo13963g("FFListener#onImageCaptured");
                        ((dyp) this.f24098a.f24109g.m5651J()).mo6926e();
                    }
                    this.f24101d.mo13962f();
                    this.f24098a.f24104b.mo13944f("PictureTakerCommand.run: success=true");
                    this.f24099b.close();
                } catch (InterruptedException | ExecutionException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th2) {
                th = th2;
                this.f24098a.f24104b.mo13944f("PictureTakerCommand.run: success=false");
                this.f24099b.close();
                this.f24102e.f25502c.mo9917w(runtimeException);
                this.f24102e.f25501b.mo9013f();
                ((fua) this.f24102e.f25503d).f23578f.close();
                throw th;
            }
        } catch (TimeoutException e2) {
            this.f24098a.f24104b.mo13943e("ImageCaptureCommand retrieval timed out", e2);
            this.f24098a.f24104b.mo13944f("PictureTakerCommand.run: success=false");
            this.f24099b.close();
            this.f24102e.f25502c.mo9917w(e2);
        } catch (Exception e3) {
            gbl gblVar = this.f24098a;
            gblVar.f24104b.mo13943e("PictureTaker command failed: " + gblVar.f24103a.toString(), e3);
            try {
                throw e3;
            } catch (Throwable th3) {
                th = th3;
                runtimeException = e3;
                this.f24098a.f24104b.mo13944f("PictureTakerCommand.run: success=false");
                this.f24099b.close();
                this.f24102e.f25502c.mo9917w(runtimeException);
                this.f24102e.f25501b.mo9013f();
                ((fua) this.f24102e.f25503d).f23578f.close();
                throw th;
            }
        }
    }

    public final String toString() {
        return "PictureTakerCommand";
    }
}
