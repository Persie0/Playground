package p000;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fhl {

    /* JADX INFO: renamed from: a */
    public final long f22014a;

    /* JADX INFO: renamed from: c */
    public long f22016c;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ fhm f22019f;

    /* JADX INFO: renamed from: g */
    private final kyt f22020g;

    /* JADX INFO: renamed from: b */
    public long f22015b = 0;

    /* JADX INFO: renamed from: d */
    public boolean f22017d = false;

    /* JADX INFO: renamed from: e */
    public boolean f22018e = false;

    public fhl(fhm fhmVar, kyt kytVar, long j) {
        this.f22019f = fhmVar;
        this.f22020g = kytVar;
        this.f22014a = j;
        long j2 = fhmVar.f22024d;
        this.f22016c = j2;
        while (true) {
            j2++;
            if (j2 >= fhmVar.f22025e) {
                return;
            }
            lpe lpeVar = (lpe) fhmVar.f22022b.get(Long.valueOf(j2));
            lpeVar.getClass();
            if (((MediaCodec.BufferInfo) lpeVar.f38883b).presentationTimeUs >= j) {
                return;
            } else {
                this.f22016c = j2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m8432a(long j, boolean z) {
        synchronized (this.f22019f) {
            if (this.f22018e) {
                return;
            }
            this.f22015b = j;
            this.f22017d = z;
            long j2 = this.f22016c + 1;
            while (true) {
                fhm fhmVar = this.f22019f;
                if (j2 >= fhmVar.f22025e) {
                    break;
                }
                if (j2 > fhmVar.f22024d) {
                    lpe lpeVar = (lpe) fhmVar.f22022b.get(Long.valueOf(j2));
                    lpeVar.getClass();
                    if (j < ((MediaCodec.BufferInfo) lpeVar.f38883b).presentationTimeUs) {
                        break;
                    } else if (((MediaCodec.BufferInfo) lpeVar.f38883b).presentationTimeUs < this.f22014a) {
                        this.f22016c = j2;
                    } else {
                        m8434c(lpeVar, j2);
                    }
                } else if (j2 >= 0) {
                    fhmVar.f22021a.mo13947i("packet at index " + j2 + " was likely dropped too early");
                }
                j2++;
            }
            m8433b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8433b() {
        if (!this.f22018e && this.f22017d) {
            fhm fhmVar = this.f22019f;
            long j = fhmVar.f22023c;
            long j2 = this.f22015b;
            if (j >= j2 || fhmVar.f22026f || this.f22014a == j2) {
                this.f22020g.close();
                this.f22018e = true;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m8434c(lpe lpeVar, long j) {
        if (this.f22018e) {
            return;
        }
        this.f22019f.f22021a.mo13946h("writing packet <" + ((MediaCodec.BufferInfo) lpeVar.f38883b).presentationTimeUs + ">");
        this.f22020g.mo8409b((ByteBuffer) lpeVar.f38884c, (MediaCodec.BufferInfo) lpeVar.f38883b);
        this.f22016c = j;
    }
}
