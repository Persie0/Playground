package p000;

import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hir implements hix {

    /* JADX INFO: renamed from: b */
    private static final nbh f27942b = nbh.m17259h("com/google/android/apps/camera/speechenhancer/SpeechEnhancerVideoProcessorImpl");

    /* JADX INFO: renamed from: a */
    public boolean f27943a;

    /* JADX INFO: renamed from: c */
    private final dhv f27944c;

    /* JADX INFO: renamed from: d */
    private final mrm f27945d;

    /* JADX INFO: renamed from: e */
    private final cso f27946e;

    /* JADX INFO: renamed from: f */
    private final cdu f27947f;

    /* JADX INFO: renamed from: g */
    private final kym f27948g;

    public hir(mrm mrmVar, cso csoVar, kym kymVar, cdu cduVar, dhv dhvVar, byte[] bArr, byte[] bArr2) {
        this.f27945d = mrmVar;
        this.f27946e = csoVar;
        this.f27948g = kymVar;
        this.f27947f = cduVar;
        this.f27944c = dhvVar;
        if (mrmVar.mo16813g()) {
            cduVar.m3529i().m13537d(((hiw) mrmVar.mo16809c()).mo10345a(new hiq(this, 0)));
        }
    }

    @Override // p000.hix
    /* JADX INFO: renamed from: a */
    public final void mo10356a() {
        this.f27943a = false;
    }

    @Override // p000.hix
    /* JADX INFO: renamed from: b */
    public final void mo10357b() {
        ((ConcurrentLinkedQueue) this.f27948g.f37734b).clear();
    }

    @Override // p000.hix
    /* JADX INFO: renamed from: c */
    public final void mo10358c(kpw kpwVar) {
        ByteBuffer byteBufferM11539k;
        if (this.f27945d.mo16813g()) {
            kym kymVar = this.f27948g;
            long jMo7248d = kpwVar.mo7248d();
            if (!((ConcurrentLinkedQueue) kymVar.f37734b).isEmpty() && !((ConcurrentLinkedQueue) kymVar.f37734b).isEmpty()) {
                double size = ((ConcurrentLinkedQueue) kymVar.f37734b).size();
                Long l = (Long) ((ConcurrentLinkedQueue) kymVar.f37734b).peek();
                l.getClass();
                Duration durationOfNanos = Duration.ofNanos(jMo7248d - l.longValue());
                Duration duration = nnd.f43933a;
                double seconds = durationOfNanos.getSeconds();
                double nano = durationOfNanos.getNano();
                double d = kymVar.f37733a;
                Double.isNaN(nano);
                Double.isNaN(seconds);
                Double.isNaN(size);
                if (size / (seconds + (nano / 1.0E9d)) > d) {
                    return;
                }
            }
            ((ConcurrentLinkedQueue) kymVar.f37734b).offer(Long.valueOf(jMo7248d));
            if (((ConcurrentLinkedQueue) kymVar.f37734b).size() > kymVar.f37733a) {
                ((ConcurrentLinkedQueue) kymVar.f37734b).poll();
            }
            if (this.f27943a) {
                return;
            }
            kbc kbcVarM13903h = kbc.m13903h(kpwVar.mo7247c(), kpwVar.mo7246b());
            kay kayVar = (kay) ((jwf) this.f27946e.m5465a()).f34942d;
            ByteBuffer buffer = ((kpv) kpwVar.mo7251g().get(0)).getBuffer();
            if (kpwVar.mo7245a() == 54) {
                int iMo7247c = kpwVar.mo7247c() * kpwVar.mo7246b();
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(iMo7247c);
                for (int i = 0; i < iMo7247c; i++) {
                    byteBufferAllocateDirect.put(i, (byte) ((buffer.getShort(i + i) >> 8) & 255));
                }
                byteBufferM11539k = inr.m11539k(byteBufferAllocateDirect, kbcVarM13903h.f35517a, kbcVarM13903h.f35518b, kayVar.f35503e);
            } else if (kpwVar.mo7245a() == 35) {
                byteBufferM11539k = inr.m11539k(buffer, kbcVarM13903h.f35517a, kbcVarM13903h.f35518b, kayVar.f35503e);
            } else {
                ((nbe) ((nbe) f27942b.m17252c()).mo17276G(3657)).mo17291p("Unsupported Image Format: %d.", kpwVar.mo7245a());
                byteBufferM11539k = null;
            }
            if (byteBufferM11539k == null) {
                return;
            }
            dhv dhvVar = this.f27944c;
            dhw dhwVar = dis.f11705a;
            dhvVar.mo6177e();
            mqu mquVar = mqu.f41450a;
            this.f27944c.mo6178f();
            ((hiw) this.f27945d.mo16809c()).mo10351g(byteBufferM11539k, kbcVarM13903h.f35517a, kbcVarM13903h.f35518b, kayVar.f35503e, kpwVar.mo7248d(), mquVar);
        }
    }
}
