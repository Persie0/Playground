package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.google.android.apps.camera.rectiface.jni.cxx.hsSUWRJfoeC;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fif implements kyt {

    /* JADX INFO: renamed from: c */
    final /* synthetic */ fig f22104c;

    /* JADX INFO: renamed from: d */
    private final kyt f22105d;

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f22102a = new AtomicInteger(0);

    /* JADX INFO: renamed from: e */
    private final AtomicBoolean f22106e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public final nqf f22103b = nqf.m17621g();

    public fif(fig figVar, kyt kytVar) {
        this.f22104c = figVar;
        this.f22105d = kytVar;
    }

    @Override // p000.kyt
    /* JADX INFO: renamed from: a */
    public final void mo8408a(nps npsVar) {
        this.f22105d.mo8408a(npsVar);
        this.f22103b.mo16665f(npsVar);
    }

    @Override // p000.lfk
    /* JADX INFO: renamed from: b */
    public final void mo8409b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        try {
            this.f22105d.mo8409b(byteBuffer, bufferInfo);
            this.f22102a.incrementAndGet();
        } catch (CancellationException e) {
        } catch (Throwable th) {
            ((nbe) ((nbe) ((nbe) fig.f22107a.m17252c()).mo17283h(th)).mo17276G((char) 2318)).mo17290o(hsSUWRJfoeC.WJaFz);
            this.f22104c.f22108b.mo8412c();
        }
    }

    @Override // p000.lfk, java.lang.AutoCloseable
    public final void close() {
        kyt kytVar;
        int i;
        this.f22106e.set(true);
        try {
            int iDecrementAndGet = this.f22104c.f22110d.decrementAndGet();
            fig figVar = this.f22104c;
            if (figVar.f22112f && !figVar.f22108b.mo8411b().isCancelled() && iDecrementAndGet == 0) {
                synchronized (this.f22104c.f22111e) {
                    fig figVar2 = this.f22104c;
                    ArrayList arrayList = new ArrayList();
                    synchronized (figVar2.f22111e) {
                        Iterator it = figVar2.f22109c.iterator();
                        i = -1;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            fif fifVar = (fif) it.next();
                            if (fifVar.f22103b.isDone()) {
                                String string = ((MediaFormat) kxk.m14973S(fifVar.f22103b)).getString("mime");
                                if (lqi.m15853A(string)) {
                                    arrayList.add(Integer.valueOf(fifVar.f22102a.get()));
                                } else if (string.equals("application/microvideo-meta-stream")) {
                                    i = fifVar.f22102a.get();
                                }
                            } else {
                                lku.m15613H(fifVar.f22102a.get() == 0);
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        throw new RuntimeException("No video tracks are being added; aborting microvideo.");
                    }
                    if (i != -1) {
                        Iterator it2 = arrayList.iterator();
                        do {
                            if (!it2.hasNext()) {
                                StringBuilder sb = new StringBuilder();
                                Iterator it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                    sb.append(((Integer) it3.next()).intValue());
                                    sb.append(",");
                                }
                                throw new RuntimeException(String.format("Number of motion and video frames substantially differ (video=%s motion=%d).", sb, Integer.valueOf(i)));
                            }
                        } while (Math.abs(((Integer) it2.next()).intValue() - i) >= 25);
                    }
                    Iterator it4 = arrayList.iterator();
                    int i2 = 0;
                    while (it4.hasNext()) {
                        int iIntValue = ((Integer) it4.next()).intValue();
                        if (i2 < iIntValue) {
                            i2 = iIntValue;
                        }
                    }
                    if (i2 < 10) {
                        throw new RuntimeException(String.format(Locale.US, "Too few video frames (max: %d) in microvideo", Integer.valueOf(i2)));
                    }
                    this.f22104c.f22109c.clear();
                }
            }
            kytVar = this.f22105d;
        } catch (CancellationException e) {
            kytVar = this.f22105d;
        } catch (Throwable th) {
            try {
                ((nbe) ((nbe) ((nbe) fig.f22107a.m17252c()).mo17283h(th)).mo17276G(2316)).mo17290o("Error occurred while closing");
                this.f22104c.f22108b.mo8412c();
                kytVar = this.f22105d;
            } catch (Throwable th2) {
                this.f22105d.close();
                throw th2;
            }
        }
        kytVar.close();
    }
}
