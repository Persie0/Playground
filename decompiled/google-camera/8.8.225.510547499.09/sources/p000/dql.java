package p000;

import android.os.Trace;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dql implements ciw {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f12326a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f12327b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f12328c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f12329d;

    public /* synthetic */ dql(Executor executor, String str, Runnable runnable, int i) {
        this.f12329d = i;
        this.f12328c = executor;
        this.f12327b = str;
        this.f12326a = runnable;
    }

    public /* synthetic */ dql(kbz kbzVar, ohb ohbVar, ohb ohbVar2, int i) {
        this.f12329d = i;
        this.f12326a = kbzVar;
        this.f12327b = ohbVar;
        this.f12328c = ohbVar2;
    }

    public /* synthetic */ dql(npu npuVar, kbz kbzVar, ohb ohbVar, int i) {
        this.f12329d = i;
        this.f12327b = npuVar;
        this.f12326a = kbzVar;
        this.f12328c = ohbVar;
    }

    @Override // p000.ciw
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String mo3539c() {
        switch (this.f12329d) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return dez.m6039i(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, npu] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ohb] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, ohb] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, ohb] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, ohb] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, ohb] */
    @Override // p000.ciw
    /* JADX INFO: renamed from: bd */
    public final nps mo3538bd() {
        int i = 1;
        switch (this.f12329d) {
            case 0:
                ?? r0 = this.f12326a;
                ?? r1 = this.f12327b;
                ?? r3 = this.f12328c;
                r1.getClass();
                int i2 = 17;
                r0.mo13960d("CpuFaceBeautificationStartup", new dgt((ohb) r1, i2));
                r3.getClass();
                r0.mo13960d("GpuFaceBeautificationStartup", new dgt((ohb) r3, i2));
                return kxk.m14965K(true);
            case 1:
                ?? r2 = this.f12328c;
                Object obj = this.f12327b;
                final ?? r4 = this.f12326a;
                final nqf nqfVarM17621g = nqf.m17621g();
                final String str = (String) obj;
                r2.execute(new Runnable() { // from class: cix
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str2 = str;
                        Runnable runnable = r4;
                        nqf nqfVar = nqfVarM17621g;
                        try {
                            Trace.beginSection("task:" + str2);
                            runnable.run();
                            Trace.endSection();
                            nqfVar.mo14894e(true);
                        } finally {
                            nqfVar.mo14894e(false);
                        }
                    }
                });
                return nqfVarM17621g;
            case 2:
                ?? r5 = this.f12326a;
                ?? r6 = this.f12327b;
                ?? r7 = this.f12328c;
                r6.getClass();
                r5.mo13960d("GpuPostprocessingFaceObfuscationStartup", new drs((ohb) r6, i));
                r7.getClass();
                r5.mo13960d("GpuThumbnailFaceObfuscationStartup", new drs((ohb) r7, i));
                return kxk.m14965K(true);
            default:
                return this.f12327b.submit(new cpb((kbz) this.f12326a, (ohb) this.f12328c, 7));
        }
    }
}
