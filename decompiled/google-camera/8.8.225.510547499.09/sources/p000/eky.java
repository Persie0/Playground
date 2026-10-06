package p000;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.util.Log;
import android.view.Surface;
import com.google.android.apps.camera.imax.cyclops.image.StereoPanorama;
import com.google.android.apps.camera.imax.cyclops.processing.OmnistereoRendererImpl;
import com.google.geo.lightfield.processing.ProgressCallback;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eky implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AtomicReference f14523a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ProgressCallback f14524b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ ekz f14525c;

    public eky(ekz ekzVar, AtomicReference atomicReference, ProgressCallback progressCallback) {
        this.f14525c = ekzVar;
        this.f14523a = atomicReference;
        this.f14524b = progressCallback;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0108  */
    /* JADX WARN: Code duplicated, block: B:28:0x0141  */
    /* JADX WARN: Code duplicated, block: B:29:0x0153  */
    /* JADX WARN: Code duplicated, block: B:40:0x017d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0198  */
    /* JADX WARN: Code duplicated, block: B:43:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x0211  */
    /* JADX WARN: Code duplicated, block: B:63:0x0219  */
    /* JADX WARN: Code duplicated, block: B:69:0x0162 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x01e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x016d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x017b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x01d9 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        ekh ekhVarMo7410a;
        OmnistereoRendererImpl omnistereoRendererImpl;
        float fM7455a;
        AtomicReference atomicReference;
        boolean z2;
        int name;
        int integer;
        int integer2;
        AtomicReference atomicReference2 = this.f14523a;
        ekz ekzVar = this.f14525c;
        ProgressCallback progressCallback = this.f14524b;
        progressCallback.setProgress(0.0f);
        lup lupVar = new lup();
        lupVar.m16020b();
        String strM7358b = ekzVar.f14532g.m7358b();
        int[] iArr = {0, 0};
        MediaExtractor mediaExtractor = new MediaExtractor();
        MediaFormat mediaFormatM7454b = elj.m7454b(mediaExtractor, strM7358b);
        mediaExtractor.release();
        if (mediaFormatM7454b != null) {
            iArr[0] = mediaFormatM7454b.getInteger("width");
            iArr[1] = mediaFormatM7454b.getInteger("height");
        }
        lur lurVar = new lur(iArr[0], iArr[1]);
        Surface surface = new Surface(lurVar.f39253c);
        elj eljVar = new elj(surface);
        String strM7358b2 = ekzVar.f14532g.m7358b();
        eljVar.f14591f = false;
        eljVar.f14589d = elj.m7454b(eljVar.f14588c, strM7358b2);
        MediaFormat mediaFormat = eljVar.f14589d;
        StereoPanorama result = null;
        if (mediaFormat != null) {
            if (mediaFormat.containsKey("durationUs")) {
                eljVar.f14590e = eljVar.f14589d.getLong("durationUs");
            }
            try {
                eljVar.f14593h = MediaCodec.createDecoderByType(eljVar.f14589d.getString("mime"));
                eljVar.f14589d.getString("mime");
                try {
                    eljVar.f14593h.configure(eljVar.f14589d, eljVar.f14587b, (MediaCrypto) null, 0);
                    try {
                        eljVar.f14593h.start();
                        eljVar.f14592g = eljVar.f14593h.getInputBuffers();
                        eljVar.f14591f = true;
                    } catch (Exception e) {
                        ((nbe) ((nbe) ((nbe) elj.f14586a.m17251b()).mo17283h(e)).mo17276G((char) 1588)).mo17290o("Could not start MediaCodec");
                        z = eljVar.f14591f;
                        if (z) {
                            ((nbe) ((nbe) ekz.f14526a.m17251b()).mo17276G((char) 1558)).mo17293r("Failed to open video file %s", ekzVar.f14532g.m7358b());
                            atomicReference = atomicReference2;
                        }
                        atomicReference.set(result);
                    }
                } catch (IllegalArgumentException e2) {
                    ((nbe) ((nbe) ((nbe) elj.f14586a.m17251b()).mo17283h(e2)).mo17276G((char) 1590)).mo17290o("Could not configure MediaCodec");
                    z = eljVar.f14591f;
                } catch (IllegalStateException e3) {
                    ((nbe) ((nbe) ((nbe) elj.f14586a.m17251b()).mo17283h(e3)).mo17276G((char) 1589)).mo17290o("Could not configure MediaCodec");
                    z = eljVar.f14591f;
                }
            } catch (IOException e4) {
                ((nbe) ((nbe) elj.f14586a.m17251b()).mo17276G((char) 1591)).mo17293r("Could not create MediaCodec of type %s", eljVar.f14589d.getString("mime"));
                z = eljVar.f14591f;
            }
            ekhVarMo7410a = ekzVar.f14527b.mo7410a(ekzVar.f14532g.m7357a(), ekzVar.f14529d, ekzVar.f14530e, ekzVar.f14531f);
            omnistereoRendererImpl = (OmnistereoRendererImpl) ekhVarMo7410a;
            if (omnistereoRendererImpl.f6745b) {
                progressCallback.setProgress(0.2f);
                fM7455a = 0.0f;
                while (true) {
                    if (fM7455a < 1.0f) {
                        atomicReference = atomicReference2;
                        z2 = true;
                        break;
                    }
                    try {
                        if (!eljVar.m7456c()) {
                            atomicReference = atomicReference2;
                            z2 = true;
                            break;
                        }
                        try {
                            atomicReference = atomicReference2;
                            try {
                                if (!lurVar.f39254d.tryAcquire(10000L, TimeUnit.MILLISECONDS)) {
                                    z2 = true;
                                    break;
                                }
                                lurVar.f39253c.updateTexImage();
                                name = lurVar.f39252b.getName();
                                integer = eljVar.f14589d.getInteger("width");
                                integer2 = eljVar.f14589d.getInteger("height");
                                if (omnistereoRendererImpl.f6745b) {
                                    omnistereoRendererImpl.nativeApplyTexture(omnistereoRendererImpl.f6744a, name, integer, integer2);
                                    omnistereoRendererImpl.f6744a++;
                                }
                                progressCallback.setProgress((fM7455a * 0.75f) + 0.2f);
                                fM7455a = eljVar.m7455a();
                                atomicReference2 = atomicReference;
                            } catch (InterruptedException e5) {
                                e = e5;
                                Log.e(lur.f39251a, e.getMessage());
                                z2 = true;
                            }
                        } catch (InterruptedException e6) {
                            e = e6;
                            atomicReference = atomicReference2;
                        }
                    } catch (IllegalStateException e7) {
                        atomicReference = atomicReference2;
                        ((nbe) ((nbe) ((nbe) ekz.f14526a.m17251b()).mo17283h(e7)).mo17276G((char) 1555)).mo17290o("Could not decodeNextFrame");
                        z2 = false;
                    }
                }
                if (eljVar.f14591f) {
                    try {
                        eljVar.f14593h.stop();
                    } catch (IllegalStateException e8) {
                        ((nbe) ((nbe) ((nbe) elj.f14586a.m17251b()).mo17283h(e8)).mo17276G((char) 1586)).mo17290o("Exception when stopping the decoder");
                    }
                    eljVar.f14593h.release();
                    eljVar.f14588c.release();
                    eljVar.f14591f = false;
                }
                surface.release();
                lurVar.f39253c.release();
                lurVar.f39252b.delete();
                if (z2) {
                    result = ekhVarMo7410a.getResult(ekzVar.f14528c);
                } else {
                    result = null;
                }
                progressCallback.setProgress(1.0f);
                omnistereoRendererImpl.nativeRelease();
                omnistereoRendererImpl.f6745b = false;
                lupVar.m16019a();
            } else {
                ((nbe) ((nbe) ekz.f14526a.m17251b()).mo17276G((char) 1557)).mo17290o("Failed to initialize omnistereo renderer");
                atomicReference = atomicReference2;
                result = null;
            }
            atomicReference.set(result);
        }
        ((nbe) ((nbe) elj.f14586a.m17251b()).mo17276G((char) 1592)).mo17293r("Could not extract MediaFormat from %s", strM7358b2);
        z = eljVar.f14591f;
        surface = surface;
        if (z) {
            ekhVarMo7410a = ekzVar.f14527b.mo7410a(ekzVar.f14532g.m7357a(), ekzVar.f14529d, ekzVar.f14530e, ekzVar.f14531f);
            omnistereoRendererImpl = (OmnistereoRendererImpl) ekhVarMo7410a;
            if (omnistereoRendererImpl.f6745b) {
                ((nbe) ((nbe) ekz.f14526a.m17251b()).mo17276G((char) 1557)).mo17290o("Failed to initialize omnistereo renderer");
                atomicReference = atomicReference2;
                result = null;
            } else {
                progressCallback.setProgress(0.2f);
                fM7455a = 0.0f;
                while (true) {
                    if (fM7455a < 1.0f) {
                        atomicReference = atomicReference2;
                        z2 = true;
                        break;
                    }
                    if (!eljVar.m7456c()) {
                        atomicReference = atomicReference2;
                        z2 = true;
                        break;
                    }
                    atomicReference = atomicReference2;
                    if (!lurVar.f39254d.tryAcquire(10000L, TimeUnit.MILLISECONDS)) {
                        z2 = true;
                        break;
                    }
                    lurVar.f39253c.updateTexImage();
                    name = lurVar.f39252b.getName();
                    integer = eljVar.f14589d.getInteger("width");
                    integer2 = eljVar.f14589d.getInteger("height");
                    if (omnistereoRendererImpl.f6745b) {
                        omnistereoRendererImpl.nativeApplyTexture(omnistereoRendererImpl.f6744a, name, integer, integer2);
                        omnistereoRendererImpl.f6744a++;
                    }
                    progressCallback.setProgress((fM7455a * 0.75f) + 0.2f);
                    fM7455a = eljVar.m7455a();
                    atomicReference2 = atomicReference;
                }
                if (eljVar.f14591f) {
                    eljVar.f14593h.stop();
                    eljVar.f14593h.release();
                    eljVar.f14588c.release();
                    eljVar.f14591f = false;
                }
                surface.release();
                lurVar.f39253c.release();
                lurVar.f39252b.delete();
                if (z2) {
                    result = ekhVarMo7410a.getResult(ekzVar.f14528c);
                } else {
                    result = null;
                }
                progressCallback.setProgress(1.0f);
                omnistereoRendererImpl.nativeRelease();
                omnistereoRendererImpl.f6745b = false;
                lupVar.m16019a();
            }
        } else {
            ((nbe) ((nbe) ekz.f14526a.m17251b()).mo17276G((char) 1558)).mo17293r("Failed to open video file %s", ekzVar.f14532g.m7358b());
            atomicReference = atomicReference2;
        }
        atomicReference.set(result);
    }
}
