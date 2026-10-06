package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fhm implements fhk {

    /* JADX INFO: renamed from: a */
    public final kbo f22021a;

    /* JADX INFO: renamed from: g */
    private final nqf f22027g = nqf.m17621g();

    /* JADX INFO: renamed from: b */
    public final HashMap f22022b = new HashMap();

    /* JADX INFO: renamed from: h */
    private final List f22028h = new ArrayList();

    /* JADX INFO: renamed from: c */
    public long f22023c = 0;

    /* JADX INFO: renamed from: d */
    public long f22024d = -1;

    /* JADX INFO: renamed from: i */
    private long f22029i = 0;

    /* JADX INFO: renamed from: e */
    public long f22025e = 0;

    /* JADX INFO: renamed from: f */
    public boolean f22026f = false;

    public fhm(kbo kboVar, String str) {
        int i = mro.f41481a;
        this.f22021a = kboVar.mo6314a("CCTrack".concat(str));
    }

    @Override // p000.kyt
    /* JADX INFO: renamed from: a */
    public final void mo8408a(nps npsVar) {
        this.f22027g.mo16665f(npsVar);
    }

    @Override // p000.lfk
    /* JADX INFO: renamed from: b */
    public final void mo8409b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.f22021a.mo13946h("writesampledata <" + bufferInfo.presentationTimeUs + ">");
        lpe lpeVarM15802e = lpe.m15802e(byteBuffer, bufferInfo);
        synchronized (this) {
            this.f22023c = ((MediaCodec.BufferInfo) lpeVarM15802e.f38883b).presentationTimeUs;
            long j = this.f22025e;
            this.f22025e = 1 + j;
            this.f22022b.put(Long.valueOf(j), lpeVarM15802e);
            for (fhl fhlVar : this.f22028h) {
                if (bufferInfo.presentationTimeUs >= fhlVar.f22014a && bufferInfo.presentationTimeUs <= fhlVar.f22015b) {
                    fhlVar.m8434c(lpeVarM15802e, j);
                }
                fhlVar.m8433b();
            }
        }
    }

    @Override // p000.fhk
    /* JADX INFO: renamed from: c */
    public final synchronized void mo8429c() {
        String string = this.f22027g.isDone() ? this.f22027g.isCancelled() ? "CANCELLED" : ((MediaFormat) kxk.m14974T(this.f22027g)).getString("mime") : "WAITING";
        kbo kboVar = this.f22021a;
        Locale locale = Locale.US;
        Object[] objArr = new Object[5];
        objArr[0] = string;
        objArr[1] = Integer.valueOf(this.f22022b.size());
        objArr[2] = this.f22022b.isEmpty() ? "n/a" : this.f22022b.get(Long.valueOf(this.f22024d + 1));
        objArr[3] = this.f22022b.isEmpty() ? "n/a" : this.f22022b.get(Long.valueOf(this.f22025e - 1));
        objArr[4] = Long.valueOf(this.f22023c);
        kboVar.mo13940b(String.format(locale, "mime %s, %d entries, span: <%s> - <%s> available to %d", objArr));
        for (fhl fhlVar : this.f22028h) {
            kbo kboVar2 = this.f22021a;
            Locale locale2 = Locale.US;
            Object[] objArr2 = new Object[4];
            objArr2[0] = Long.valueOf(fhlVar.f22016c);
            objArr2[1] = Long.valueOf(fhlVar.f22015b);
            objArr2[2] = true != fhlVar.f22018e ? "NO" : "YES";
            objArr2[3] = true != fhlVar.f22017d ? "NO" : "YES";
            kboVar2.mo13940b(String.format(locale2, "   tr: wrote to index <%d>  can write <%d>  closed %s  willclose %s", objArr2));
        }
    }

    @Override // p000.lfk, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f22026f = true;
        Iterator it = this.f22028h.iterator();
        while (it.hasNext()) {
            ((fhl) it.next()).m8433b();
        }
    }

    @Override // p000.fhk
    /* JADX INFO: renamed from: e */
    public final synchronized fhl mo8431e(kyt kytVar, long j) {
        fhl fhlVar;
        lku.m15614I(j >= this.f22029i, "Requesting packets that were dropped already");
        fhlVar = new fhl(this, kytVar, j);
        kytVar.mo8408a(this.f22027g);
        this.f22028h.add(fhlVar);
        return fhlVar;
    }

    @Override // p000.fhk
    /* JADX INFO: renamed from: d */
    public final synchronized void mo8430d(long j) {
        while (true) {
            long j2 = this.f22024d + 1;
            if (j2 == this.f22025e) {
                break;
            }
            HashMap map = this.f22022b;
            Long lValueOf = Long.valueOf(j2);
            lpe lpeVar = (lpe) map.get(lValueOf);
            lpeVar.getClass();
            if (((MediaCodec.BufferInfo) lpeVar.f38883b).presentationTimeUs > j) {
                break;
            }
            this.f22022b.remove(lValueOf);
            this.f22029i = ((MediaCodec.BufferInfo) lpeVar.f38883b).presentationTimeUs;
            this.f22024d++;
        }
        ArrayList arrayList = new ArrayList();
        for (fhl fhlVar : this.f22028h) {
            if (fhlVar.f22018e) {
                arrayList.add(fhlVar);
            }
        }
        this.f22028h.removeAll(arrayList);
    }
}
