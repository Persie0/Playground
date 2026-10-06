package p000;

import androidx.work.impl.background.systemalarm.vIy.VCYBIzY;
import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class oem implements oeo {

    /* JADX INFO: renamed from: a */
    public String f45748a;

    /* JADX INFO: renamed from: b */
    public oeo f45749b;

    /* JADX INFO: renamed from: c */
    public int f45750c;

    /* JADX INFO: renamed from: d */
    public lij f45751d;

    /* JADX INFO: renamed from: e */
    private final oej f45752e;

    /* JADX INFO: renamed from: f */
    private String f45753f;

    /* JADX INFO: renamed from: g */
    private String f45754g;

    /* JADX INFO: renamed from: h */
    private final oeh f45755h;

    /* JADX INFO: renamed from: i */
    private double f45756i;

    /* JADX INFO: renamed from: j */
    private long f45757j;

    /* JADX INFO: renamed from: k */
    private final Random f45758k;

    /* JADX INFO: renamed from: l */
    private int f45759l;

    /* JADX INFO: renamed from: m */
    private int f45760m;

    public oem(String str, String str2, oej oejVar, oeh oehVar, boolean z) {
        if (z) {
            this.f45748a = str;
        } else {
            this.f45753f = str;
            this.f45754g = str2;
        }
        this.f45752e = oejVar == null ? new oej() : oejVar;
        this.f45755h = oehVar;
        this.f45756i = 0.0d;
        this.f45757j = 1L;
        this.f45758k = new Random();
        this.f45750c = 1;
    }

    /* JADX INFO: renamed from: f */
    private final synchronized void m18428f() {
        int i;
        while (true) {
            i = this.f45750c;
            if (i != 2) {
                break;
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            }
        }
        if (i == 3) {
            throw new oeq(oep.f45765b, EArqVBjecl.JiNVpZRYVt);
        }
        lku.m15657k(i == 1);
    }

    /* JADX INFO: renamed from: h */
    private final void m18429h(oeq oeqVar) throws oeq {
        if (this.f45756i >= 60.0d) {
            throw oeqVar;
        }
        double dNextDouble = this.f45758k.nextDouble();
        try {
            double d = this.f45756i;
            long j = this.f45757j;
            double d2 = j;
            Double.isNaN(d2);
            this.f45756i = d + (d2 * dNextDouble);
            double d3 = j * 1000;
            Double.isNaN(d3);
            Thread.sleep((long) (d3 * dNextDouble));
        } catch (InterruptedException e) {
        }
        long j2 = this.f45757j;
        this.f45757j = j2 + j2;
    }

    /* JADX INFO: renamed from: i */
    private final void m18430i() {
        this.f45757j = 1L;
        this.f45756i = 0.0d;
    }

    /* JADX INFO: renamed from: j */
    private final boolean m18431j() throws oeq {
        try {
            return this.f45755h.mo18413g();
        } catch (IOException e) {
            throw new oeq(oep.f45766c, "Could not call hasMoreData() on upload stream.", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    private final lqq m18432k(oej oejVar, String str, oeh oehVar) throws Throwable {
        npt nptVarM17615a;
        m18428f();
        oej oejVar2 = new oej();
        oejVar2.m18419e("X-Goog-Upload-Protocol", "resumable");
        oejVar2.m18419e("X-Goog-Upload-Command", str);
        for (String str2 : oejVar.m18417c()) {
            Iterator it = oejVar.m18416b(str2).iterator();
            while (it.hasNext()) {
                oejVar2.m18419e(str2, (String) it.next());
            }
        }
        oeo oeoVarM15405N = lij.m15405N(str.equals("start") ? this.f45753f : this.f45748a, str.contains("start") ? this.f45754g : "PUT", oejVar2, oehVar);
        if (this.f45751d != null && !str.equals("start")) {
            synchronized (this) {
                oeoVarM15405N.mo18427g(new oel(this, this.f45751d, null, null), this.f45759l, this.f45760m);
            }
        }
        synchronized (this) {
            this.f45749b = oeoVarM15405N;
            nptVarM17615a = npt.m17615a(new kij((oek) oeoVarM15405N, 14));
            nax naxVar = new nax((byte[]) null);
            naxVar.m17234c("Scotty-Uploader-HttpUrlConnectionHttpClient-%d");
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(nax.m17231d(naxVar));
            executorServiceNewSingleThreadExecutor.execute(nptVarM17615a);
            executorServiceNewSingleThreadExecutor.shutdown();
        }
        try {
            mbb mbbVar = (mbb) nptVarM17615a.get();
            Object obj = mbbVar.f39760a;
            if (obj == null) {
                return (lqq) mbbVar.f39761b;
            }
            if (((oeq) obj).f45772a != oep.f45765b) {
                throw ((Throwable) mbbVar.f39760a);
            }
            m18428f();
            throw new oeq(oep.CONNECTION_ERROR, "");
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(VCYBIzY.TLUmTmYNgcFp.concat(String.valueOf(e.getMessage())), e);
        }
    }

    /* JADX INFO: renamed from: l */
    private static final boolean m18433l(lqq lqqVar) {
        return lqqVar.f39001a / 100 == 4;
    }

    /* JADX INFO: renamed from: m */
    private static final boolean m18434m(lqq lqqVar) {
        String strM18415a;
        Object obj = lqqVar.f39003c;
        return (obj == null || (strM18415a = ((oej) obj).m18415a("X-Goog-Upload-Status")) == null || !mpw.m16770i("final", strM18415a)) ? false : true;
    }

    /* JADX INFO: renamed from: n */
    private static final boolean m18435n(lqq lqqVar) {
        String strM18415a;
        Object obj = lqqVar.f39003c;
        return obj != null && (strM18415a = ((oej) obj).m18415a("X-Goog-Upload-Status")) != null && mpw.m16770i("active", strM18415a) && lqqVar.f39001a == 200;
    }

    @Override // p000.oeo
    /* JADX INFO: renamed from: a */
    public final long mo18421a() {
        return this.f45755h.mo18409c();
    }

    @Override // p000.oeo
    /* JADX INFO: renamed from: b */
    public final String mo18422b() {
        return this.f45748a;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x010b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:70:0x0140  */
    /* JADX WARN: Code duplicated, block: B:98:0x00ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x007f -> B:36:0x0082). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:111:0x0133
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: c */
    public final p000.lqq m18436c(boolean r8) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.oem.m18436c(boolean):lqq");
    }

    @Override // p000.oeo
    /* JADX INFO: renamed from: d */
    public final synchronized void mo18424d() {
        this.f45751d = null;
    }

    /* JADX INFO: renamed from: e */
    public final lqq m18437e() throws Throwable {
        synchronized (this) {
        }
        m18430i();
        while (true) {
            try {
                String str = null;
                lqq lqqVarM18432k = m18432k(this.f45752e, "start", new oen(mro.m16831a(null)));
                if (m18434m(lqqVarM18432k)) {
                    return lqqVarM18432k;
                }
                if (m18435n(lqqVarM18432k)) {
                    oej oejVar = (oej) lqqVarM18432k.f39003c;
                    String strM18415a = oejVar.m18415a("X-Goog-Upload-URL");
                    try {
                        new URL(strM18415a);
                        this.f45748a = strM18415a;
                        synchronized (this) {
                            lij lijVar = this.f45751d;
                            if (lijVar != null) {
                                String str2 = this.f45748a;
                                if (str2 != null && !ook.m18800n(str2)) {
                                    str = str2;
                                }
                                if (str != null) {
                                    ooc.m18750p(((mcl) lijVar).f39954a, new mef(str));
                                } else {
                                    ((mcl) lijVar).m16311a(this, new oeq(oep.BAD_URL, "Upload transfer handle blank"));
                                }
                            }
                        }
                        String strM18415a2 = oejVar.m18415a("X-Goog-Upload-Chunk-Granularity");
                        if (strM18415a2 != null) {
                            try {
                                Integer.parseInt(strM18415a2);
                            } catch (NumberFormatException e) {
                                throw new oeq(oep.SERVER_ERROR, "Server returned an invalid chunk granularity.", e);
                            }
                        }
                        return m18436c(false);
                    } catch (MalformedURLException e2) {
                        throw new oeq(oep.SERVER_ERROR, "Server returned an invalid upload url.", e2);
                    }
                }
                if (m18433l(lqqVarM18432k)) {
                    return lqqVarM18432k;
                }
                m18429h(new oeq(oep.SERVER_ERROR, lqqVarM18432k.m15889b()));
            } catch (oeq e3) {
                if (!e3.m18438a()) {
                    throw e3;
                }
                m18429h(e3);
            }
        }
    }

    @Override // p000.oeo
    /* JADX INFO: renamed from: g */
    public final synchronized void mo18427g(lij lijVar, int i, int i2) {
        lku.m15670x(true, "Progress threshold (bytes) must be greater than 0");
        lku.m15670x(true, "Progress threshold (millis) must be greater or equal to 0");
        this.f45751d = lijVar;
        this.f45759l = 4194304;
        this.f45760m = 250;
    }
}
