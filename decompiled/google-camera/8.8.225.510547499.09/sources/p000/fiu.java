package p000;

import android.media.MediaCodec;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class fiu implements lfg {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f22152a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f22153b;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f22154d;

    public fiu(fhn fhnVar, lfg lfgVar, int i) {
        this.f22154d = i;
        this.f22152a = fhnVar;
        this.f22153b = lfgVar;
    }

    public fiu(fiv fivVar, fhv fhvVar, int i) {
        this.f22154d = i;
        this.f22153b = fivVar;
        this.f22152a = fhvVar;
    }

    @Override // p000.lfg
    /* JADX INFO: renamed from: d */
    public final void mo8417d() {
        int i = this.f22154d;
    }

    @Override // p000.lfg
    /* JADX INFO: renamed from: e */
    public final void mo8418e(int i) {
        int i2 = this.f22154d;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, lfg] */
    @Override // p000.lfg
    /* JADX INFO: renamed from: a */
    public final void mo8414a(let letVar) {
        switch (this.f22154d) {
            case 0:
                fiv fivVar = (fiv) this.f22153b;
                fivVar.f22172d.post(new fit(fivVar, 3));
                break;
            default:
                leu leuVarMo15264b = letVar.mo15264b();
                if (leuVarMo15264b != null) {
                    ((fhn) this.f22152a).f22031a.add(leuVarMo15264b);
                }
                this.f22153b.mo8414a(letVar);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, lfg] */
    @Override // p000.lfg
    /* JADX INFO: renamed from: b */
    public final void mo8415b(long j) {
        switch (this.f22154d) {
            case 0:
                boolean z = fhc.f21954a;
                boolean z2 = fhc.f21954a;
                break;
            default:
                this.f22153b.mo8415b(j);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, lfg] */
    @Override // p000.lfg
    /* JADX INFO: renamed from: c */
    public final void mo8416c(MediaCodec.BufferInfo bufferInfo) {
        switch (this.f22154d) {
            case 0:
                if (((fiv) this.f22153b).f22180l.compareAndSet(0L, bufferInfo.presentationTimeUs)) {
                    long j = bufferInfo.presentationTimeUs;
                }
                if ((bufferInfo.flags & 1) != 0) {
                    ((fiv) this.f22153b).f22181m.set(((fiv) this.f22153b).f22182n.getAndSet(0));
                } else {
                    ((fiv) this.f22153b).f22182n.incrementAndGet();
                }
                if (((fhj) this.f22152a).mo8427f(bufferInfo.presentationTimeUs).m19207n()) {
                    bufferInfo.flags |= Integer.MIN_VALUE;
                }
                ((fiv) this.f22153b).f22177i.incrementAndGet();
                ((fiv) this.f22153b).f22178j.incrementAndGet();
                ((fiv) this.f22153b).f22179k.set(bufferInfo.presentationTimeUs);
                ((fiv) this.f22153b).f22170b.mo8466b(bufferInfo);
                break;
            default:
                this.f22153b.mo8416c(bufferInfo);
                break;
        }
    }
}
