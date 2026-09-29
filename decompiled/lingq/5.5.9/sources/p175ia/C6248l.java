package p175ia;

import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.source.hls.SampleQueueMappingException;
import ga.InterfaceC5731n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p290o6.C7968m;
import p479xa.C10129a;
import p479xa.C10134c0;

/* JADX INFO: renamed from: ia.l */
/* JADX INFO: loaded from: classes.dex */
public final class C6248l implements InterfaceC5731n {

    /* JADX INFO: renamed from: a */
    public final int f36327a;

    /* JADX INFO: renamed from: b */
    public final C6249m f36328b;

    /* JADX INFO: renamed from: c */
    public int f36329c = -1;

    public C6248l(C6249m c6249m, int i10) {
        this.f36328b = c6249m;
        this.f36327a = i10;
    }

    /* JADX INFO: renamed from: a */
    public final void m12850a() {
        C10129a.m18990b(this.f36329c == -1);
        C6249m c6249m = this.f36328b;
        c6249m.m12860u();
        c6249m.f36361f0.getClass();
        int[] iArr = c6249m.f36361f0;
        int i10 = this.f36327a;
        int i11 = iArr[i10];
        if (i11 == -1) {
            i11 = c6249m.f36359e0.contains(c6249m.f36357d0.m12091a(i10)) ? -3 : -2;
        } else {
            boolean[] zArr = c6249m.f36367i0;
            if (!zArr[i11]) {
                zArr[i11] = true;
            }
        }
        this.f36329c = i11;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ga.InterfaceC5731n
    /* JADX INFO: renamed from: c */
    public final void mo425c() throws IOException {
        int i10 = this.f36329c;
        C6249m c6249m = this.f36328b;
        if (i10 == -2) {
            c6249m.m12860u();
            throw new SampleQueueMappingException(c6249m.f36357d0.m12091a(this.f36327a).f34803d[0].f12484l);
        }
        if (i10 == -1) {
            c6249m.m12856D();
            return;
        }
        if (i10 != -3) {
            c6249m.m12856D();
            C6249m.c cVar = c6249m.f36340Q[i10];
            DrmSession drmSession = cVar.f13415h;
            if (drmSession != null) {
                if (drmSession.getState() != 1) {
                    return;
                }
                DrmSession.DrmSessionException drmSessionExceptionMo6936f = cVar.f13415h.mo6936f();
                drmSessionExceptionMo6936f.getClass();
                throw drmSessionExceptionMo6936f;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0094  */
    @Override // ga.InterfaceC5731n
    /* JADX INFO: renamed from: d */
    public final int mo426d(long j10) {
        C6245i next;
        C6245i c6245i;
        int i10 = this.f36329c;
        boolean z10 = true;
        if (!((i10 == -1 || i10 == -3 || i10 == -2) ? false : true)) {
            return 0;
        }
        C6249m c6249m = this.f36328b;
        if (c6249m.m12854B()) {
            return 0;
        }
        C6249m.c cVar = c6249m.f36340Q[i10];
        int iM7397o = cVar.m7397o(c6249m.f36376o0, j10);
        ArrayList<C6245i> arrayList = c6249m.f36332I;
        if (arrayList instanceof Collection) {
            c6245i = arrayList.isEmpty() ? null : arrayList.get(arrayList.size() - 1);
        } else {
            Iterator<C6245i> it = arrayList.iterator();
            if (it.hasNext()) {
                do {
                    next = it.next();
                } while (it.hasNext());
                c6245i = next;
            }
        }
        C6245i c6245i2 = c6245i;
        if (c6245i2 != null && !c6245i2.f36285K) {
            iM7397o = Math.min(iM7397o, c6245i2.m12845e(i10) - (cVar.f13424q + cVar.f13426s));
        }
        synchronized (cVar) {
            if (iM7397o >= 0) {
                try {
                    if (cVar.f13426s + iM7397o > cVar.f13423p) {
                        z10 = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                z10 = false;
            }
            C10129a.m18990b(z10);
            cVar.f13426s += iM7397o;
        }
        return iM7397o;
    }

    @Override // ga.InterfaceC5731n
    /* JADX INFO: renamed from: e */
    public final boolean mo427e() {
        int i10 = this.f36329c;
        boolean z10 = true;
        if (i10 != -3) {
            if ((i10 == -1 || i10 == -3 || i10 == -2) ? false : true) {
                C6249m c6249m = this.f36328b;
                if (!c6249m.m12854B() && c6249m.f36340Q[i10].m7399q(c6249m.f36376o0)) {
                }
            }
            z10 = false;
        }
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ce, code lost:
    
        if (r8.get(0).f36285K == false) goto L92;
     */
    @Override // ga.InterfaceC5731n
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo430h(C7968m c7968m, DecoderInputBuffer decoderInputBuffer, int i10) {
        int i11;
        C2416m c2416m;
        boolean z10;
        int i12;
        int i13 = this.f36329c;
        if (i13 == -3) {
            decoderInputBuffer.m13268l(4);
            return -4;
        }
        if ((i13 == -1 || i13 == -3 || i13 == -2) ? false : true) {
            C6249m c6249m = this.f36328b;
            if (c6249m.m12854B()) {
                return -3;
            }
            ArrayList<C6245i> arrayList = c6249m.f36332I;
            if (!arrayList.isEmpty()) {
                int i14 = 0;
                while (i14 < arrayList.size() - 1) {
                    int i15 = arrayList.get(i14).f36286k;
                    int length = c6249m.f36340Q.length;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= length) {
                            z10 = true;
                            break;
                        }
                        if (c6249m.f36367i0[i16]) {
                            C6249m.c cVar = c6249m.f36340Q[i16];
                            synchronized (cVar) {
                                i12 = cVar.f13426s != cVar.f13423p ? cVar.f13417j[cVar.m7396n(cVar.f13426s)] : cVar.f13403C;
                            }
                            if (i12 == i15) {
                                z10 = false;
                                break;
                            }
                        }
                        i16++;
                    }
                    if (!z10) {
                        break;
                    }
                    i14++;
                }
                int i17 = C10134c0.f51354a;
                if (i14 > arrayList.size() || i14 < 0) {
                    throw new IllegalArgumentException();
                }
                if (i14 != 0) {
                    arrayList.subList(0, i14).clear();
                }
                C6245i c6245i = arrayList.get(0);
                C2416m c2416m2 = c6245i.f35397d;
                if (!c2416m2.equals(c6249m.f36353b0)) {
                    c6249m.f36370k.m7327b(c6249m.f36352b, c2416m2, c6245i.f35398e, c6245i.f35399f, c6245i.f35400g);
                }
                c6249m.f36353b0 = c2416m2;
            }
            int i18 = !arrayList.isEmpty() ? 0 : 0;
            int iM7402t = c6249m.f36340Q[i13].m7402t(c7968m, decoderInputBuffer, i10, c6249m.f36376o0);
            if (iM7402t == -5) {
                C2416m c2416mM7127e = (C2416m) c7968m.f43384b;
                c2416mM7127e.getClass();
                if (i13 == c6249m.f36346W) {
                    C6249m.c cVar2 = c6249m.f36340Q[i13];
                    synchronized (cVar2) {
                        i11 = (cVar2.f13426s != cVar2.f13423p ? 1 : i18) != 0 ? cVar2.f13417j[cVar2.m7396n(cVar2.f13426s)] : cVar2.f13403C;
                    }
                    while (i18 < arrayList.size() && arrayList.get(i18).f36286k != i11) {
                        i18++;
                    }
                    if (i18 < arrayList.size()) {
                        c2416m = arrayList.get(i18).f35397d;
                    } else {
                        c2416m = c6249m.f36351a0;
                        c2416m.getClass();
                    }
                    c2416mM7127e = c2416mM7127e.m7127e(c2416m);
                }
                c7968m.f43384b = c2416mM7127e;
            }
            return iM7402t;
        }
        return -3;
    }
}
