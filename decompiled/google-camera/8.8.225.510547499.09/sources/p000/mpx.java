package p000;

import androidx.wear.ambient.AmbientMode;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedOutputStream;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class mpx {

    /* JADX INFO: renamed from: a */
    public final Object f41306a;

    /* JADX INFO: renamed from: b */
    public int f41307b;

    /* JADX INFO: renamed from: c */
    public final Object f41308c;

    /* JADX INFO: renamed from: d */
    public final Object f41309d;

    /* JADX INFO: renamed from: e */
    public final Object f41310e;

    /* JADX INFO: renamed from: f */
    public final Object f41311f;

    public mpx(InputStream inputStream, AmbientMode.AmbientController ambientController, ExecutorService executorService, byte[] bArr) {
        this.f41306a = new Object();
        this.f41308c = "SPEECH_ENHANCER_RAW_AUDIO_STREAM_PARSER";
        this.f41309d = inputStream;
        this.f41311f = ambientController;
        this.f41310e = executorService;
        this.f41307b = 1;
    }

    public mpx(msn msnVar) {
        this.f41310e = UUID.randomUUID();
        this.f41307b = 0;
        this.f41308c = new ArrayList();
        this.f41306a = new ArrayList();
        this.f41311f = msd.m16856c(msnVar);
        this.f41309d = msnVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m16788a(IOException iOException) {
        synchronized (this.f41306a) {
            this.f41307b = 5;
        }
        if (iOException != null) {
            mpy mpyVar = new mpy(iOException);
            ((nbe) ((nbe) ((nbe) mpr.f41274a.m17251b()).mo17283h(mpyVar)).mo17276G(4581)).mo17301z("Got an error from audio stream parser '%s'. Error: %s", "SPEECH_ENHANCER_RAW_AUDIO_STREAM_PARSER", mpyVar);
            return;
        }
        try {
            Object obj = ((AmbientMode.AmbientController) this.f41311f).f1697a;
            PipedOutputStream pipedOutputStream = ((mpr) obj).f41275b;
            if (pipedOutputStream != null) {
                pipedOutputStream.close();
            } else {
                ((mpr) obj).f41276c.f41295a.ifPresent(mpn.f41260a);
            }
        } catch (IOException e) {
            ((nbe) ((nbe) ((nbe) mpr.f41274a.m17251b()).mo17283h(e)).mo17276G((char) 4580)).mo17290o("Got an exception when trying to close the piped output stream.");
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
    /* JADX INFO: renamed from: b */
    public final void m16789b() {
        synchronized (this.f41306a) {
            int i = this.f41307b;
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            Object obj = this.f41308c;
            String strM16762a = mpw.m16762a(i);
            if (i == 0) {
                throw null;
            }
            lku.m15617L(z, "Can't run: state of audio stream parser '%s' is '%s'.", obj, strM16762a);
            this.f41307b = 2;
        }
        this.f41310e.execute(new lmg(this, 14));
    }

    /* JADX INFO: renamed from: c */
    public final boolean m16790c() {
        boolean z;
        synchronized (this.f41306a) {
            z = this.f41307b == 2;
        }
        return z;
    }
}
