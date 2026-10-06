package p000;

import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.util.Log;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kxw implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f37683a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f37684b;

    public /* synthetic */ kxw(ExecutorService executorService, int i) {
        this.f37684b = i;
        this.f37683a = executorService;
    }

    public /* synthetic */ kxw(kqa kqaVar, int i) {
        this.f37684b = i;
        this.f37683a = kqaVar;
    }

    public /* synthetic */ kxw(kuz kuzVar, int i) {
        this.f37684b = i;
        this.f37683a = kuzVar;
    }

    public /* synthetic */ kxw(kyb kybVar, int i) {
        this.f37684b = i;
        this.f37683a = kybVar;
    }

    public /* synthetic */ kxw(kyc kycVar, int i) {
        this.f37684b = i;
        this.f37683a = kycVar;
    }

    public kxw(kzr kzrVar, int i) {
        this.f37684b = i;
        this.f37683a = kzrVar;
    }

    public /* synthetic */ kxw(lcc lccVar, int i) {
        this.f37684b = i;
        this.f37683a = lccVar;
    }

    public kxw(ldn ldnVar, int i) {
        this.f37684b = i;
        this.f37683a = ldnVar;
    }

    public /* synthetic */ kxw(ldx ldxVar, int i, byte[] bArr, byte[] bArr2) {
        this.f37684b = i;
        this.f37683a = ldxVar;
    }

    public /* synthetic */ kxw(lek lekVar, int i) {
        this.f37684b = i;
        this.f37683a = lekVar;
    }

    public /* synthetic */ kxw(lfj lfjVar, int i) {
        this.f37684b = i;
        this.f37683a = lfjVar;
    }

    public /* synthetic */ kxw(lfl lflVar, int i) {
        this.f37684b = i;
        this.f37683a = lflVar;
    }

    public /* synthetic */ kxw(lfn lfnVar, int i) {
        this.f37684b = i;
        this.f37683a = lfnVar;
    }

    public /* synthetic */ kxw(ljm ljmVar, int i) {
        this.f37684b = i;
        this.f37683a = ljmVar;
    }

    public /* synthetic */ kxw(lmi lmiVar, int i) {
        this.f37684b = i;
        this.f37683a = lmiVar;
    }

    public /* synthetic */ kxw(lmk lmkVar, int i) {
        this.f37684b = i;
        this.f37683a = lmkVar;
    }

    /* JADX WARN: Code duplicated, block: B:89:0x01b3 A[PHI: r0
      0x01b3: PHI (r0v43 lfj) = (r0v42 lfj), (r0v45 lfj) binds: [B:93:0x01cc, B:88:0x01b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, lek] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
    @Override // java.lang.Runnable
    public final void run() {
        lfj lfjVar;
        lfj lfjVar2;
        int i = 0;
        switch (this.f37684b) {
            case 0:
                ((kyd) this.f37683a).m15048j();
                return;
            case 1:
                ((kuz) this.f37683a).m14920h();
                return;
            case 2:
                ((kyd) this.f37683a).m15048j();
                return;
            case 3:
                this.f37683a.shutdown();
                return;
            case 4:
                Object obj = this.f37683a;
                kyc kycVar = (kyc) obj;
                if (kycVar.f37712c.cancel(false)) {
                    kycVar.f37711b = true;
                    try {
                        ((kyc) obj).f37715f.close();
                        return;
                    } catch (IOException e) {
                        Log.e("ConfigurableMux", "Couldn't close output after cancellation", e);
                        return;
                    }
                }
                return;
            case 5:
                Object obj2 = this.f37683a;
                kyc kycVar2 = (kyc) obj2;
                kycVar2.f37710a = true;
                try {
                    ((kyc) obj2).m15047e();
                    return;
                } catch (IOException e2) {
                    kycVar2.f37712c.mo8566a(e2);
                    return;
                }
            case 6:
                Object obj3 = this.f37683a;
                kyb kybVar = (kyb) obj3;
                kybVar.f37709c.f37713d.remove(obj3);
                try {
                    ((kyb) obj3).f37709c.m15047e();
                    return;
                } catch (IOException e3) {
                    kybVar.f37709c.f37712c.mo8566a(e3);
                    return;
                }
            case 7:
                ((kzr) this.f37683a).f37786b = false;
                return;
            case 8:
                ((ldi) ((lcf) this.f37683a).mo15164c()).mo15186i();
                return;
            case 9:
                ((lcc) this.f37683a).m15162l();
                return;
            case 10:
                ((ldn) this.f37683a).f37990a.m15187j();
                return;
            case 11:
                this.f37683a.mo15251c();
                return;
            case 12:
                Object obj4 = this.f37683a;
                lfj lfjVar3 = (lfj) obj4;
                if (lfjVar3.f38130g.isCancelled()) {
                    if (!lfjVar3.f38128e.isDone() || lfjVar3.f38128e.isCancelled()) {
                        lfjVar3.f38128e.cancel(false);
                        return;
                    }
                    try {
                        if (((lfj) obj4).f38132i) {
                            return;
                        }
                        ((MediaMuxer) kxk.m14973S(((lfj) obj4).f38128e)).release();
                        ((lfj) obj4).f38132i = true;
                        return;
                    } catch (ExecutionException e4) {
                        Log.w("MuxerImpl", "Error while trying to close media muxer.", e4);
                        return;
                    }
                }
                return;
            case 13:
                Object obj5 = this.f37683a;
                try {
                    Iterator it = ((lfj) obj5).f38131h.iterator();
                    while (it.hasNext()) {
                        if (((Boolean) kxk.m14973S(((lfl) it.next()).f38137b)).booleanValue()) {
                            i++;
                        }
                    }
                    if (i == 0) {
                        if (!((lfj) obj5).f38132i) {
                            ((MediaMuxer) kxk.m14973S(((lfj) obj5).f38128e)).release();
                            ((lfj) obj5).f38132i = true;
                        }
                        ((lfj) obj5).f38129f.cancel(true);
                        return;
                    }
                    if (((lfj) obj5).f38132i) {
                        return;
                    }
                    MediaMuxer mediaMuxer = (MediaMuxer) kxk.m14973S(((lfj) obj5).f38128e);
                    for (lfl lflVar : ((lfj) obj5).f38131h) {
                        if (((Boolean) kxk.m14973S(lflVar.f38137b)).booleanValue()) {
                            int iAddTrack = mediaMuxer.addTrack((MediaFormat) kxk.m14973S(lflVar.f38136a));
                            lflVar.f38142g = (MediaMuxer) kxk.m14973S(((lfj) obj5).f38128e);
                            lflVar.f38138c.mo14894e(Integer.valueOf(iAddTrack));
                        }
                    }
                    mediaMuxer.start();
                    ((lfj) obj5).f38129f.mo14894e(true);
                    return;
                } catch (ExecutionException e5) {
                    Log.e("MuxerImpl", "MediaMuxer should be done by now.", e5);
                    ((lfj) obj5).f38129f.mo8566a(e5);
                    return;
                }
            case 14:
                Object obj6 = this.f37683a;
                try {
                    if (((lfj) obj6).f38129f.isDone() && !((lfj) obj6).f38129f.isCancelled() && ((Boolean) kxk.m14973S(((lfj) obj6).f38129f)).booleanValue()) {
                        ((MediaMuxer) kxk.m14973S(((lfj) obj6).f38128e)).stop();
                    } else {
                        Log.w("MuxerImpl", "Output cancelled since no data written to any track.");
                        ((lfj) obj6).f38130g.cancel(false);
                        if (((lfj) obj6).f38124a.isDone() && !((lfj) obj6).f38124a.isCancelled()) {
                            Object obj7 = ((lpe) kxk.m14973S(((lfj) obj6).f38124a)).f38884c;
                        }
                    }
                    try {
                        if (!((lfj) obj6).f38132i) {
                            ((MediaMuxer) kxk.m14973S(((lfj) obj6).f38128e)).release();
                            ((lfj) obj6).f38132i = true;
                        }
                        lfjVar2 = (lfj) obj6;
                        if (lfjVar2.f38130g.isDone()) {
                            return;
                        }
                        break;
                    } catch (Throwable th) {
                        try {
                            ((lfj) obj6).f38130g.mo8566a(th);
                            lfjVar2 = (lfj) obj6;
                            if (lfjVar2.f38130g.isDone()) {
                                return;
                            }
                        } finally {
                            lfj lfjVar4 = (lfj) obj6;
                            if (!lfjVar4.f38130g.isDone()) {
                                lfjVar4.f38130g.mo14894e(lfj.class);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        ((lfj) obj6).f38130g.mo8566a(th2);
                        try {
                            if (!((lfj) obj6).f38132i) {
                                ((MediaMuxer) kxk.m14973S(((lfj) obj6).f38128e)).release();
                                ((lfj) obj6).f38132i = true;
                            }
                            lfjVar2 = (lfj) obj6;
                            if (lfjVar2.f38130g.isDone()) {
                                return;
                            }
                            break;
                        } catch (Throwable th3) {
                            try {
                                ((lfj) obj6).f38130g.mo8566a(th3);
                                lfjVar2 = (lfj) obj6;
                                if (lfjVar2.f38130g.isDone()) {
                                    return;
                                }
                            } finally {
                                lfj lfjVar5 = (lfj) obj6;
                                if (!lfjVar5.f38130g.isDone()) {
                                    lfjVar5.f38130g.mo14894e(lfj.class);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        try {
                            if (!((lfj) obj6).f38132i) {
                                ((MediaMuxer) kxk.m14973S(((lfj) obj6).f38128e)).release();
                                ((lfj) obj6).f38132i = true;
                            }
                            lfjVar = (lfj) obj6;
                            if (!lfjVar.f38130g.isDone()) {
                                nqf nqfVar = lfjVar.f38130g;
                            }
                            break;
                        } catch (Throwable th5) {
                            try {
                                ((lfj) obj6).f38130g.mo8566a(th5);
                                lfjVar = (lfj) obj6;
                                if (!lfjVar.f38130g.isDone()) {
                                    nqf nqfVar2 = lfjVar.f38130g;
                                }
                            } finally {
                                lfj lfjVar6 = (lfj) obj6;
                                if (!lfjVar6.f38130g.isDone()) {
                                    lfjVar6.f38130g.mo14894e(lfj.class);
                                }
                            }
                        }
                        throw th4;
                    }
                }
                nqf nqfVar3 = lfjVar2.f38130g;
                return;
            case 15:
                ((lfl) this.f37683a).m15281a();
                return;
            case 16:
                lfl lflVar2 = (lfl) this.f37683a;
                lflVar2.f38139d.mo14894e(null);
                lflVar2.m15281a();
                return;
            case 17:
                Object obj8 = this.f37683a;
                lfn lfnVar = (lfn) obj8;
                synchronized (lfnVar.f38153a) {
                    lku.m15613H(((lfn) obj8).f38156d);
                    Runnable runnable = (Runnable) ((lfn) obj8).f38155c.pollFirst();
                    if (runnable == null) {
                        ((lfn) obj8).f38156d = false;
                        return;
                    }
                    try {
                        runnable.run();
                        break;
                    } catch (Throwable th6) {
                        Log.e("SingleTaskExec", "Exception occurred on single-threaded executor", th6);
                    }
                    lfnVar.f38154b.execute(new kxw(lfnVar, 17));
                    return;
                }
            case 18:
                ((ljm) this.f37683a).m15541a();
                return;
            case 19:
                lmk lmkVar = (lmk) this.f37683a;
                lmkVar.f38673b = lmkVar.f38684m.f38647b != null;
                return;
            default:
                lmf.m15727a((lmi) this.f37683a);
                return;
        }
    }
}
