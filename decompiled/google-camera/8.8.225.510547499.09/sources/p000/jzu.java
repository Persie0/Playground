package p000;

import android.media.AudioRecord;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import com.google.android.gms.dynamite.p017ho.DNTdN;
import java.io.FileDescriptor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jzu implements jyx {

    /* JADX INFO: renamed from: a */
    public final Object f35389a;

    /* JADX INFO: renamed from: b */
    public final jys f35390b;

    /* JADX INFO: renamed from: c */
    public final jzh f35391c;

    /* JADX INFO: renamed from: d */
    public final jyw f35392d;

    /* JADX INFO: renamed from: e */
    public final jza f35393e;

    /* JADX INFO: renamed from: f */
    public final Map f35394f;

    /* JADX INFO: renamed from: g */
    public jyt f35395g = null;

    /* JADX INFO: renamed from: h */
    public final nps f35396h;

    /* JADX INFO: renamed from: i */
    public final ExecutorService f35397i;

    /* JADX INFO: renamed from: j */
    public knr f35398j;

    /* JADX INFO: renamed from: k */
    public jyz f35399k;

    /* JADX INFO: renamed from: l */
    public int f35400l;

    /* JADX INFO: renamed from: m */
    private final npu f35401m;

    /* JADX INFO: renamed from: n */
    private final int f35402n;

    /* JADX INFO: renamed from: o */
    private final boolean f35403o;

    /* JADX INFO: renamed from: p */
    private final boolean f35404p;

    /* JADX WARN: Code duplicated, block: B:55:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:59:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:63:0x01d7 A[LOOP:0: B:61:0x01d1->B:63:0x01d7, LOOP_END] */
    /* JADX WARN: Type inference failed for: r2v5, types: [crh, java.lang.Object] */
    public jzu(jzv jzvVar) {
        jwf jwfVar;
        jza jzaVar;
        jyz jyzVar;
        jwf jwfVar2;
        mrm mrmVarM16829i;
        jzu jzuVar = this;
        jzuVar.f35394f = new HashMap();
        jzuVar.f35389a = new Object();
        jzuVar.f35401m = jzvVar.f35405a;
        jzvVar.m13852t();
        jzuVar.f35402n = jzvVar.f35417m;
        nps npsVar = jzvVar.f35424t;
        jzuVar.f35396h = npsVar;
        jzuVar.f35397i = kxk.m15033z();
        jzvVar.f35408d.m13671c();
        jzuVar.f35404p = jzvVar.f35423s;
        if (jzvVar.f35427w != null || jzvVar.f35421q) {
            jzuVar.f35403o = true;
        } else {
            jzuVar.f35403o = false;
        }
        HashSet hashSet = new HashSet();
        if (!jzuVar.f35403o) {
            if (jzvVar.f35407c != null) {
                hashSet.add(jyv.AUDIO);
            }
            if (jzvVar.f35408d != null) {
                hashSet.add(jyv.VIDEO);
            }
            if (jzvVar.f35420p) {
                hashSet.add(jyv.METADATA);
            }
        }
        jzh jzhVar = new jzh(hashSet, jzvVar.f35413i);
        jzuVar.f35391c = jzhVar;
        jxv jxvVar = jzvVar.f35408d;
        jyn jynVar = new jyn(nod.m17553i(kxk.m14962H(npsVar, jzvVar.m13852t()), new gyl(jzuVar, jzvVar, jxvVar != null ? jxvVar.f35097a.f35066e : 0, 2), not.INSTANCE));
        jzuVar.f35390b = jynVar;
        jwf jwfVar3 = new jwf(0L);
        jwf jwfVar4 = new jwf(Long.MAX_VALUE);
        jze jzeVar = new jze();
        jxv jxvVar2 = jzvVar.f35408d;
        if (jxvVar2 != null) {
            jwfVar = jwfVar4;
            jzuVar = this;
            jzuVar.f35392d = new jzs(jxvVar2, jzvVar.f35409e, jzvVar.f35410f, jzvVar.f35411g, jzvVar.f35412h, jynVar, mrm.m16828h(jzvVar.f35425u), mrm.m16828h(jzvVar.f35427w), jzvVar.f35421q, jzhVar, jzvVar.f35406b, jwfVar3, jwfVar, jzvVar.f35422r, jzeVar);
        } else {
            jwfVar = jwfVar4;
            jzuVar.f35392d = null;
        }
        jxs jxsVar = jzvVar.f35407c;
        if (jxsVar != null) {
            int i = jzvVar.f35429y;
            jxsVar.toString();
            int i2 = jxsVar.f35090e == 2 ? 12 : 16;
            try {
                AudioRecord audioRecord = new AudioRecord(i - 1, jxsVar.f35089d, i2, 2, AudioRecord.getMinBufferSize(jxsVar.f35089d, i2, 2) * 10);
                lku.m15613H(audioRecord.getState() == 1);
                mrmVarM16829i = mrm.m16829i(audioRecord);
            } catch (RuntimeException e) {
                Log.e("AudioRecordFactory", "Could not create AudioRecord", e);
                mrmVarM16829i = mqu.f41450a;
            }
            if (mrmVarM16829i.mo16813g()) {
                jzuVar.f35398j = new jzp(new lel((AudioRecord) mrmVarM16829i.mo16809c(), 0));
                kns knsVar = jzvVar.f35428x;
                if (knsVar != null) {
                    jzuVar.f35398j = knsVar.mo5433a(jzuVar.f35398j);
                }
                String.valueOf(jzvVar.f35407c);
                jzuVar.f35393e = new jzd(jxsVar, jzuVar.f35398j, jzuVar.f35390b, jzuVar.f35391c, jzvVar.f35406b, jwfVar3, jwfVar, jzvVar.f35422r, jzeVar, jzuVar.f35404p);
            } else {
                jzuVar.f35391c.m13792a(jzf.AUDIO_RECORD_ERROR);
                jzuVar.f35390b.mo13725f();
                jzaVar = null;
            }
            jyzVar = jzvVar.f35426v;
            if (jyzVar != null) {
                jzuVar.f35399k = jyzVar;
            }
            if (jzvVar.f35420p) {
                jwfVar2 = jwfVar;
                jzuVar.f35394f.put("application/meta", new jzl(jzuVar.f35390b, jzuVar.f35391c, jwfVar2, jzvVar.f35408d));
            } else {
                jwfVar2 = jwfVar;
            }
            for (dsx dsxVar : jzvVar.f35419o) {
                cvn cvnVar = new cvn(jzuVar.f35390b, jwfVar2, (czs) dsxVar.f12521a, dsxVar.f12522b);
                jzuVar.f35394f.put(cvnVar.f9798a, cvnVar);
            }
            jzuVar.f35400l = 1;
        }
        jzaVar = null;
        jzuVar.f35393e = jzaVar;
        jyzVar = jzvVar.f35426v;
        if (jyzVar != null) {
            jzuVar.f35399k = jyzVar;
        }
        if (jzvVar.f35420p) {
            jwfVar2 = jwfVar;
            jzuVar.f35394f.put("application/meta", new jzl(jzuVar.f35390b, jzuVar.f35391c, jwfVar2, jzvVar.f35408d));
        } else {
            jwfVar2 = jwfVar;
        }
        while (r0.hasNext()) {
            cvn cvnVar2 = new cvn(jzuVar.f35390b, jwfVar2, (czs) dsxVar.f12521a, dsxVar.f12522b);
            jzuVar.f35394f.put(cvnVar2.f9798a, cvnVar2);
        }
        jzuVar.f35400l = 1;
    }

    /* JADX INFO: renamed from: r */
    private final nps m13851r(final boolean z) {
        nps npsVarM14966L;
        synchronized (this.f35389a) {
            final long jUptimeMillis = SystemClock.uptimeMillis() * 1000;
            this.f35391c.close();
            final int i = 1;
            nps npsVarSubmit = this.f35401m.submit(new Callable(this) { // from class: jzt

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ jzu f35385a;

                {
                    this.f35385a = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    switch (i) {
                        case 0:
                            jzu jzuVar = this.f35385a;
                            boolean z2 = z;
                            long j = jUptimeMillis;
                            jza jzaVar = jzuVar.f35393e;
                            if (jzaVar != null) {
                                if (z2) {
                                    jzd jzdVar = (jzd) jzaVar;
                                    jzdVar.f35263y = true;
                                    synchronized (jzdVar.f35243e) {
                                        int i2 = ((jzd) jzaVar).f35232P;
                                        if (i2 == 2 || i2 == 5) {
                                            if (((jzd) jzaVar).f35217A) {
                                                ((jzd) jzaVar).f35241c.submit(new bdv((jzd) jzaVar, 15));
                                            }
                                            ((jzd) jzaVar).mo13779b(jzd.m13780c());
                                        }
                                    }
                                } else {
                                    jzaVar.mo13779b(j);
                                }
                                jyz jyzVar = jzuVar.f35399k;
                                if (jyzVar != null) {
                                    jyzVar.mo5567c();
                                }
                                jzuVar.f35393e.mo13778a();
                                break;
                            }
                            return null;
                        default:
                            jzu jzuVar2 = this.f35385a;
                            boolean z3 = z;
                            long j2 = jUptimeMillis;
                            jyw jywVar = jzuVar2.f35392d;
                            if (jywVar != null) {
                                if (z3) {
                                    jzs jzsVar = (jzs) jywVar;
                                    jzsVar.f35376r = true;
                                    synchronized (jzsVar.f35359a) {
                                        int i3 = ((jzs) jywVar).f35382x;
                                        if (i3 == 2 || i3 == 5) {
                                            if (((jzs) jywVar).f35377s) {
                                                ((jzs) jywVar).f35368j.post(new jzq((jzs) jywVar, 0));
                                            }
                                            ((jzs) jywVar).mo13741a(SystemClock.uptimeMillis() * 1000);
                                        }
                                    }
                                } else {
                                    jywVar.mo13741a(j2);
                                }
                                break;
                            }
                            return null;
                    }
                }
            });
            final int i2 = 0;
            npsVarM14966L = kxk.m14966L(kxk.m14959E(npsVarSubmit, this.f35401m.submit(new Callable(this) { // from class: jzt

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ jzu f35385a;

                {
                    this.f35385a = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    switch (i2) {
                        case 0:
                            jzu jzuVar = this.f35385a;
                            boolean z2 = z;
                            long j = jUptimeMillis;
                            jza jzaVar = jzuVar.f35393e;
                            if (jzaVar != null) {
                                if (z2) {
                                    jzd jzdVar = (jzd) jzaVar;
                                    jzdVar.f35263y = true;
                                    synchronized (jzdVar.f35243e) {
                                        int i3 = ((jzd) jzaVar).f35232P;
                                        if (i3 == 2 || i3 == 5) {
                                            if (((jzd) jzaVar).f35217A) {
                                                ((jzd) jzaVar).f35241c.submit(new bdv((jzd) jzaVar, 15));
                                            }
                                            ((jzd) jzaVar).mo13779b(jzd.m13780c());
                                        }
                                    }
                                } else {
                                    jzaVar.mo13779b(j);
                                }
                                jyz jyzVar = jzuVar.f35399k;
                                if (jyzVar != null) {
                                    jyzVar.mo5567c();
                                }
                                jzuVar.f35393e.mo13778a();
                                break;
                            }
                            return null;
                        default:
                            jzu jzuVar2 = this.f35385a;
                            boolean z3 = z;
                            long j2 = jUptimeMillis;
                            jyw jywVar = jzuVar2.f35392d;
                            if (jywVar != null) {
                                if (z3) {
                                    jzs jzsVar = (jzs) jywVar;
                                    jzsVar.f35376r = true;
                                    synchronized (jzsVar.f35359a) {
                                        int i4 = ((jzs) jywVar).f35382x;
                                        if (i4 == 2 || i4 == 5) {
                                            if (((jzs) jywVar).f35377s) {
                                                ((jzs) jywVar).f35368j.post(new jzq((jzs) jywVar, 0));
                                            }
                                            ((jzs) jywVar).mo13741a(SystemClock.uptimeMillis() * 1000);
                                        }
                                    }
                                } else {
                                    jywVar.mo13741a(j2);
                                }
                                break;
                            }
                            return null;
                    }
                }
            }), this.f35401m.submit(new bdv(this, 19))).m17606b(new cnm(this, 7), this.f35401m));
        }
        return npsVarM14966L;
    }

    @Override // p000.jyx
    /* JADX INFO: renamed from: a */
    public final int mo13742a() {
        return this.f35402n;
    }

    @Override // p000.jyx
    /* JADX INFO: renamed from: b */
    public final MediaCodec mo13743b() {
        jyw jywVar = this.f35392d;
        if (jywVar != null) {
            return ((jzs) jywVar).f35361c;
        }
        return null;
    }

    @Override // p000.jyx
    /* JADX INFO: renamed from: c */
    public final mrm mo13744c() {
        synchronized (this.f35389a) {
            lku.m15613H(this.f35400l != 4);
            jyw jywVar = this.f35392d;
            Surface surface = jywVar != null ? ((jzs) jywVar).f35362d : null;
            if (surface == null) {
                return mqu.f41450a;
            }
            return mrm.m16829i(surface);
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        try {
            mo13752k().get();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("VideoRecorderImpl", "Failed to stop the video recorder at close");
        }
    }

    @Override // p000.jyx
    /* JADX INFO: renamed from: d */
    public final mrm mo13745d() {
        try {
            return (mrm) this.f35396h.get();
        } catch (InterruptedException | ExecutionException e) {
            Log.w("VideoRecorderImpl", "Failed to retrieve the location. Ignoring");
            return mqu.f41450a;
        }
    }

    @Override // p000.jyx
    /* JADX INFO: renamed from: e */
    public final mrm mo13746e() {
        jyw jywVar = this.f35392d;
        if (jywVar != null) {
            return mrm.m16829i(Long.valueOf(((jzs) jywVar).f35373o.get()));
        }
        Log.w("VideoRecorderImpl", "Cannot get frame count.");
        return mqu.f41450a;
    }

    @Override // p000.jyx
    /* JADX INFO: renamed from: f */
    public final mrm mo13747f() {
        jyw jywVar = this.f35392d;
        if (jywVar == null) {
            Log.w("VideoRecorderImpl", "Cannot get recording time.");
            return mqu.f41450a;
        }
        jzs jzsVar = (jzs) jywVar;
        if (jzsVar.f35374p.get() > jzsVar.f35375q.get()) {
            return mrm.m16829i(Long.valueOf(TimeUnit.MICROSECONDS.toMillis(jzsVar.m13846b(jzsVar.f35374p.get() - jzsVar.f35375q.get()))));
        }
        Log.w("VideoEncoder", String.format("Invalid recording time, start: %d, end: %d", Long.valueOf(jzsVar.f35375q.get()), Long.valueOf(jzsVar.f35374p.get())));
        return mqu.f41450a;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ba A[Catch: all -> 0x0117, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x0009, B:7:0x002c, B:9:0x002e, B:18:0x004d, B:20:0x0052, B:21:0x0057, B:37:0x00b5, B:38:0x00b6, B:40:0x00ba, B:41:0x00bf, B:52:0x00f0, B:53:0x00f1, B:54:0x00fb, B:56:0x0101, B:57:0x010b, B:58:0x0112, B:12:0x003e, B:13:0x0042, B:62:0x0116, B:22:0x0058, B:24:0x005f, B:25:0x0066, B:27:0x0068, B:29:0x006f, B:31:0x0076, B:32:0x008d, B:33:0x00b1, B:14:0x0043, B:16:0x0047, B:17:0x004c, B:42:0x00c0, B:44:0x00c7, B:45:0x00cf, B:47:0x00d1, B:48:0x00ec), top: B:71:0x0003, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c7 A[Catch: all -> 0x00ee, TryCatch #3 {, blocks: (B:42:0x00c0, B:44:0x00c7, B:45:0x00cf, B:47:0x00d1, B:48:0x00ec), top: B:73:0x00c0, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d1 A[Catch: all -> 0x00ee, TryCatch #3 {, blocks: (B:42:0x00c0, B:44:0x00c7, B:45:0x00cf, B:47:0x00d1, B:48:0x00ec), top: B:73:0x00c0, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0101 A[Catch: all -> 0x0117, LOOP:0: B:54:0x00fb->B:56:0x0101, LOOP_END, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x0009, B:7:0x002c, B:9:0x002e, B:18:0x004d, B:20:0x0052, B:21:0x0057, B:37:0x00b5, B:38:0x00b6, B:40:0x00ba, B:41:0x00bf, B:52:0x00f0, B:53:0x00f1, B:54:0x00fb, B:56:0x0101, B:57:0x010b, B:58:0x0112, B:12:0x003e, B:13:0x0042, B:62:0x0116, B:22:0x0058, B:24:0x005f, B:25:0x0066, B:27:0x0068, B:29:0x006f, B:31:0x0076, B:32:0x008d, B:33:0x00b1, B:14:0x0043, B:16:0x0047, B:17:0x004c, B:42:0x00c0, B:44:0x00c7, B:45:0x00cf, B:47:0x00d1, B:48:0x00ec), top: B:71:0x0003, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p000.jyx
    /* JADX INFO: renamed from: g */
    public final nps mo13748g() {
        jza jzaVar;
        Iterator it;
        synchronized (this.f35389a) {
            int i = this.f35400l;
            if (i != 2) {
                Log.e("VideoRecorderImpl", "STARTED is expected but we got " + kbd.m13920i(i));
                return kxk.m14965K(null);
            }
            long jUptimeMillis = SystemClock.uptimeMillis() * 1000;
            jzh jzhVar = this.f35391c;
            if (!jzhVar.f35283e) {
                jzhVar.f35285g = jUptimeMillis;
                synchronized (jzhVar.f35281c) {
                    Future future = jzhVar.f35288j;
                    if (future != null) {
                        future.cancel(true);
                        jzhVar.f35288j = null;
                    }
                }
            }
            jyw jywVar = this.f35392d;
            if (jywVar == null) {
                jzaVar = this.f35393e;
                if (jzaVar != null) {
                    synchronized (((jzd) jzaVar).f35243e) {
                        if (((jzd) jzaVar).f35232P != 2) {
                            Log.e(DNTdN.cjYnrkEpKsjUWME, "It is not recording now");
                        } else {
                            ((jzd) jzaVar).f35232P = 5;
                            ((jzd) jzaVar).f35256r.add(mzj.m17173c(Long.valueOf(((jzd) jzaVar).m13782d(jUptimeMillis))));
                        }
                    }
                }
                it = this.f35394f.values().iterator();
                while (it.hasNext()) {
                    ((jyr) it.next()).mo5576b(jUptimeMillis);
                }
                this.f35400l = 3;
                return kxk.m14965K(null);
            }
            synchronized (((jzs) jywVar).f35359a) {
                if (((jzs) jywVar).f35382x != 2) {
                    Log.e("VideoEncoder", "VideoEncoder is not recording now");
                } else {
                    if (((jzs) jywVar).f35362d != null && !((jzs) jywVar).f35369k) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("drop-input-frames", 1);
                        bundle.putLong("drop-start-time-us", jUptimeMillis);
                        ((jzs) jywVar).f35361c.setParameters(bundle);
                    }
                    ((jzs) jywVar).f35372n = jUptimeMillis;
                    String.format("Paused recording at %d (or excluding pause time: %d)", Long.valueOf(jUptimeMillis), Long.valueOf(jUptimeMillis - ((jzs) jywVar).f35371m));
                    ((jzs) jywVar).f35382x = 5;
                }
            }
            jzaVar = this.f35393e;
            if (jzaVar != null) {
                synchronized (((jzd) jzaVar).f35243e) {
                    if (((jzd) jzaVar).f35232P != 2) {
                        Log.e(DNTdN.cjYnrkEpKsjUWME, "It is not recording now");
                    } else {
                        ((jzd) jzaVar).f35232P = 5;
                        ((jzd) jzaVar).f35256r.add(mzj.m17173c(Long.valueOf(((jzd) jzaVar).m13782d(jUptimeMillis))));
                    }
                }
            }
            it = this.f35394f.values().iterator();
            while (it.hasNext()) {
                ((jyr) it.next()).mo5576b(jUptimeMillis);
            }
            this.f35400l = 3;
            return kxk.m14965K(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b1 A[Catch: all -> 0x0148, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0009, B:7:0x002c, B:9:0x002e, B:11:0x003c, B:12:0x0041, B:28:0x00ac, B:29:0x00ad, B:31:0x00b1, B:32:0x00b6, B:43:0x00dc, B:44:0x00dd, B:45:0x00e7, B:47:0x00ed, B:48:0x00f7, B:64:0x013d, B:65:0x0143, B:51:0x00fe, B:52:0x0100, B:69:0x0147, B:53:0x0101, B:55:0x0109, B:56:0x0110, B:58:0x0112, B:60:0x0119, B:62:0x0137, B:63:0x013c, B:61:0x011f, B:33:0x00b7, B:35:0x00be, B:36:0x00c5, B:38:0x00c7, B:39:0x00d8, B:13:0x0042, B:15:0x0049, B:16:0x0050, B:18:0x0052, B:20:0x0060, B:22:0x0067, B:23:0x0089, B:24:0x00a8), top: B:76:0x0003, inners: #0, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00be A[Catch: all -> 0x00da, TryCatch #2 {, blocks: (B:33:0x00b7, B:35:0x00be, B:36:0x00c5, B:38:0x00c7, B:39:0x00d8), top: B:78:0x00b7, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c7 A[Catch: all -> 0x00da, TryCatch #2 {, blocks: (B:33:0x00b7, B:35:0x00be, B:36:0x00c5, B:38:0x00c7, B:39:0x00d8), top: B:78:0x00b7, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00dd A[Catch: all -> 0x0148, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0009, B:7:0x002c, B:9:0x002e, B:11:0x003c, B:12:0x0041, B:28:0x00ac, B:29:0x00ad, B:31:0x00b1, B:32:0x00b6, B:43:0x00dc, B:44:0x00dd, B:45:0x00e7, B:47:0x00ed, B:48:0x00f7, B:64:0x013d, B:65:0x0143, B:51:0x00fe, B:52:0x0100, B:69:0x0147, B:53:0x0101, B:55:0x0109, B:56:0x0110, B:58:0x0112, B:60:0x0119, B:62:0x0137, B:63:0x013c, B:61:0x011f, B:33:0x00b7, B:35:0x00be, B:36:0x00c5, B:38:0x00c7, B:39:0x00d8, B:13:0x0042, B:15:0x0049, B:16:0x0050, B:18:0x0052, B:20:0x0060, B:22:0x0067, B:23:0x0089, B:24:0x00a8), top: B:76:0x0003, inners: #0, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ed A[Catch: all -> 0x0148, LOOP:0: B:45:0x00e7->B:47:0x00ed, LOOP_END, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0009, B:7:0x002c, B:9:0x002e, B:11:0x003c, B:12:0x0041, B:28:0x00ac, B:29:0x00ad, B:31:0x00b1, B:32:0x00b6, B:43:0x00dc, B:44:0x00dd, B:45:0x00e7, B:47:0x00ed, B:48:0x00f7, B:64:0x013d, B:65:0x0143, B:51:0x00fe, B:52:0x0100, B:69:0x0147, B:53:0x0101, B:55:0x0109, B:56:0x0110, B:58:0x0112, B:60:0x0119, B:62:0x0137, B:63:0x013c, B:61:0x011f, B:33:0x00b7, B:35:0x00be, B:36:0x00c5, B:38:0x00c7, B:39:0x00d8, B:13:0x0042, B:15:0x0049, B:16:0x0050, B:18:0x0052, B:20:0x0060, B:22:0x0067, B:23:0x0089, B:24:0x00a8), top: B:76:0x0003, inners: #0, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fe A[Catch: all -> 0x0148, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0009, B:7:0x002c, B:9:0x002e, B:11:0x003c, B:12:0x0041, B:28:0x00ac, B:29:0x00ad, B:31:0x00b1, B:32:0x00b6, B:43:0x00dc, B:44:0x00dd, B:45:0x00e7, B:47:0x00ed, B:48:0x00f7, B:64:0x013d, B:65:0x0143, B:51:0x00fe, B:52:0x0100, B:69:0x0147, B:53:0x0101, B:55:0x0109, B:56:0x0110, B:58:0x0112, B:60:0x0119, B:62:0x0137, B:63:0x013c, B:61:0x011f, B:33:0x00b7, B:35:0x00be, B:36:0x00c5, B:38:0x00c7, B:39:0x00d8, B:13:0x0042, B:15:0x0049, B:16:0x0050, B:18:0x0052, B:20:0x0060, B:22:0x0067, B:23:0x0089, B:24:0x00a8), top: B:76:0x0003, inners: #0, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0109 A[Catch: all -> 0x0145, TryCatch #0 {, blocks: (B:53:0x0101, B:55:0x0109, B:56:0x0110, B:58:0x0112, B:60:0x0119, B:62:0x0137, B:63:0x013c, B:61:0x011f), top: B:75:0x0101, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0112 A[Catch: all -> 0x0145, TryCatch #0 {, blocks: (B:53:0x0101, B:55:0x0109, B:56:0x0110, B:58:0x0112, B:60:0x0119, B:62:0x0137, B:63:0x013c, B:61:0x011f), top: B:75:0x0101, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0119 A[Catch: all -> 0x0145, TryCatch #0 {, blocks: (B:53:0x0101, B:55:0x0109, B:56:0x0110, B:58:0x0112, B:60:0x0119, B:62:0x0137, B:63:0x013c, B:61:0x011f), top: B:75:0x0101, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x011f A[Catch: all -> 0x0145, TryCatch #0 {, blocks: (B:53:0x0101, B:55:0x0109, B:56:0x0110, B:58:0x0112, B:60:0x0119, B:62:0x0137, B:63:0x013c, B:61:0x011f), top: B:75:0x0101, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0101 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:61:0x011f, please report this as an issue */
    @Override // p000.jyx
    /* JADX INFO: renamed from: h */
    public final nps mo13749h() {
        jza jzaVar;
        Iterator it;
        jzh jzhVar;
        long j;
        synchronized (this.f35389a) {
            int i = this.f35400l;
            if (i != 3) {
                Log.e("VideoRecorderImpl", "PAUSED is expected but we got " + kbd.m13920i(i));
                return kxk.m14965K(null);
            }
            long jUptimeMillis = SystemClock.uptimeMillis() * 1000;
            jyw jywVar = this.f35392d;
            if (jywVar == null) {
                jzaVar = this.f35393e;
                if (jzaVar != null) {
                    it = this.f35394f.values().iterator();
                    while (it.hasNext()) {
                        ((jyr) it.next()).mo5578d(jUptimeMillis);
                    }
                    jzhVar = this.f35391c;
                    if (jzhVar.f35283e) {
                        synchronized (jzhVar.f35281c) {
                            if (jzhVar.f35285g == 0) {
                                Log.w("EncWatcher", "Resume without pause");
                            } else {
                                j = jUptimeMillis - jzhVar.f35285g;
                                if (j >= 0) {
                                    jzhVar.f35286h += j;
                                } else {
                                    Log.e("EncWatcher", "Pause duration is negative: " + jzhVar.f35286h);
                                }
                                jzhVar.f35285g = 0L;
                                jzhVar.m13794c();
                            }
                        }
                    }
                    this.f35400l = 2;
                    return kxk.m14965K(null);
                }
                synchronized (((jzd) jzaVar).f35243e) {
                    if (((jzd) jzaVar).f35232P != 5) {
                        Log.e("AudioEncoder", "It is not recording now");
                    } else {
                        ((jzd) jzaVar).f35232P = 2;
                        ((jzd) jzaVar).m13787i(((jzd) jzaVar).m13782d(jUptimeMillis));
                    }
                    it = this.f35394f.values().iterator();
                    while (it.hasNext()) {
                        ((jyr) it.next()).mo5578d(jUptimeMillis);
                    }
                    jzhVar = this.f35391c;
                    if (jzhVar.f35283e) {
                        synchronized (jzhVar.f35281c) {
                            if (jzhVar.f35285g == 0) {
                                Log.w("EncWatcher", "Resume without pause");
                            } else {
                                j = jUptimeMillis - jzhVar.f35285g;
                                if (j >= 0) {
                                    jzhVar.f35286h += j;
                                } else {
                                    Log.e("EncWatcher", "Pause duration is negative: " + jzhVar.f35286h);
                                }
                                jzhVar.f35285g = 0L;
                                jzhVar.m13794c();
                            }
                        }
                    }
                    this.f35400l = 2;
                    return kxk.m14965K(null);
                }
            }
            synchronized (((jzs) jywVar).f35359a) {
                if (((jzs) jywVar).f35382x != 5) {
                    Log.e("VideoEncoder", "It is not recording now");
                } else {
                    ((jzs) jywVar).m13849e(jUptimeMillis);
                    if (((jzs) jywVar).f35362d != null && !((jzs) jywVar).f35369k) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("drop-input-frames", 0);
                        bundle.putLong("drop-start-time-us", jUptimeMillis);
                        bundle.putLong("time-offset-us", -((jzs) jywVar).f35371m);
                        ((jzs) jywVar).f35361c.setParameters(bundle);
                    }
                    String.format("Resumed recording at %d (or excluding pause time: %d)", Long.valueOf(jUptimeMillis), Long.valueOf(jUptimeMillis - ((jzs) jywVar).f35371m));
                    ((jzs) jywVar).f35382x = 2;
                }
            }
            jzaVar = this.f35393e;
            if (jzaVar != null) {
                it = this.f35394f.values().iterator();
                while (it.hasNext()) {
                    ((jyr) it.next()).mo5578d(jUptimeMillis);
                }
                jzhVar = this.f35391c;
                if (jzhVar.f35283e) {
                    synchronized (jzhVar.f35281c) {
                        if (jzhVar.f35285g == 0) {
                            Log.w("EncWatcher", "Resume without pause");
                        } else {
                            j = jUptimeMillis - jzhVar.f35285g;
                            if (j >= 0) {
                                jzhVar.f35286h += j;
                            } else {
                                Log.e("EncWatcher", "Pause duration is negative: " + jzhVar.f35286h);
                            }
                            jzhVar.f35285g = 0L;
                            jzhVar.m13794c();
                        }
                    }
                }
                this.f35400l = 2;
                return kxk.m14965K(null);
            }
            synchronized (((jzd) jzaVar).f35243e) {
                if (((jzd) jzaVar).f35232P != 5) {
                    Log.e("AudioEncoder", "It is not recording now");
                } else {
                    ((jzd) jzaVar).f35232P = 2;
                    ((jzd) jzaVar).m13787i(((jzd) jzaVar).m13782d(jUptimeMillis));
                }
            }
            it = this.f35394f.values().iterator();
            while (it.hasNext()) {
                ((jyr) it.next()).mo5578d(jUptimeMillis);
            }
            jzhVar = this.f35391c;
            if (jzhVar.f35283e) {
                synchronized (jzhVar.f35281c) {
                    if (jzhVar.f35285g == 0) {
                        Log.w("EncWatcher", "Resume without pause");
                    } else {
                        j = jUptimeMillis - jzhVar.f35285g;
                        if (j >= 0) {
                            jzhVar.f35286h += j;
                        } else {
                            Log.e("EncWatcher", "Pause duration is negative: " + jzhVar.f35286h);
                        }
                        jzhVar.f35285g = 0L;
                        jzhVar.m13794c();
                    }
                }
            }
            this.f35400l = 2;
            return kxk.m14965K(null);
            throw th;
        }
    }

    @Override // p000.jyx
    /* JADX INFO: renamed from: i */
    public final nps mo13750i() {
        return m13851r(true);
    }

    @Override // p000.jyx
    /* JADX INFO: renamed from: j */
    public final nps mo13751j(jyt jytVar) {
        synchronized (this.f35389a) {
            int i = this.f35400l;
            if (i != 1) {
                return kxk.m14964J(new IllegalStateException("Trying to start with state: " + kbd.m13920i(i)));
            }
            this.f35395g = jytVar;
            this.f35390b.mo13722c(jytVar);
            this.f35391c.f35282d = mrm.m16828h(this.f35395g);
            SystemClock.elapsedRealtime();
            return kxk.m14959E(this.f35401m.submit(new bdv(this, 16)), this.f35401m.submit(new bdv(this, 17)), this.f35401m.submit(new bdv(this, 18))).m17606b(new cnm(this, 6), this.f35401m);
        }
    }

    @Override // p000.jyx
    /* JADX INFO: renamed from: k */
    public final nps mo13752k() {
        return m13851r(false);
    }

    @Override // p000.jyx
    /* JADX INFO: renamed from: l */
    public final void mo13753l(MediaFormat mediaFormat) {
        if (!this.f35403o) {
            Log.w("VideoRecorderImpl", "Should handle encoder internally.");
            return;
        }
        jyw jywVar = this.f35392d;
        if (jywVar == null) {
            Log.w("VideoRecorderImpl", "Failed to notify output media format changed event.");
            return;
        }
        jzs jzsVar = (jzs) jywVar;
        if (!jzsVar.f35369k) {
            throw new IllegalStateException("Should handle encoder internally.");
        }
        jzsVar.m13847c(mediaFormat);
    }

    @Override // p000.jyx
    /* JADX INFO: renamed from: m */
    public final void mo13754m(FileDescriptor fileDescriptor) {
        synchronized (this.f35389a) {
            int i = this.f35400l;
            if (i == 2) {
                this.f35390b.mo13727h(fileDescriptor);
                return;
            }
            Log.w("VideoRecorderImpl", "STARTED is expected but we got " + kbd.m13920i(i));
        }
    }

    @Override // p000.jyx
    /* JADX INFO: renamed from: n */
    public final void mo13755n(int i, MediaCodec.BufferInfo bufferInfo) {
        if (!this.f35403o) {
            Log.w("VideoRecorderImpl", "Should handle encoder internally.");
            return;
        }
        jyw jywVar = this.f35392d;
        if (jywVar == null) {
            Log.w("VideoRecorderImpl", "Failed to write video date due to not video encoder.");
            return;
        }
        jzs jzsVar = (jzs) jywVar;
        if (!jzsVar.f35369k) {
            throw new IllegalStateException("Should handle encoder internally.");
        }
        jzsVar.m13850f(i, bufferInfo);
    }

    @Override // p000.jyx
    /* JADX INFO: renamed from: p */
    public final mrm mo13757p() {
        return mrm.m16828h((jyr) this.f35394f.get("application/meta"));
    }

    @Override // p000.jyx
    /* JADX INFO: renamed from: q */
    public final void mo13758q(float f) {
        synchronized (this.f35389a) {
            if (this.f35400l == 4) {
                return;
            }
            jyw jywVar = this.f35392d;
            if (jywVar == null) {
                Log.w("VideoRecorderImpl", "video encoder is not enabled here, so ignored.");
                return;
            }
            synchronized (((jzs) jywVar).f35359a) {
                int i = ((jzs) jywVar).f35382x;
                if (i != 2) {
                    Log.e("VideoEncoder", "illegal state as " + kbd.m13921j(i));
                } else {
                    int iIntValue = ((Integer) ((jzs) jywVar).f35365g.clamp(Integer.valueOf((int) (((jzs) jywVar).f35364f * f)))).intValue();
                    float f2 = f * ((jzs) jywVar).f35364f;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Request bit rate ");
                    sb.append(f2);
                    sb.append(" but get ");
                    sb.append(iIntValue);
                    Bundle bundle = new Bundle();
                    bundle.putInt("video-bitrate", iIntValue);
                    ((jzs) jywVar).f35361c.setParameters(bundle);
                }
            }
        }
    }

    @Override // p000.jyx
    /* JADX INFO: renamed from: o */
    public final void mo13756o(Object obj) {
        synchronized (this.f35389a) {
            int i = this.f35400l;
            if (i == 2 || i == 3) {
                this.f35390b.mo13735p(obj);
                return;
            }
            Log.e("VideoRecorderImpl", "Trying to add metadata but state is " + kbd.m13920i(i));
        }
    }
}
