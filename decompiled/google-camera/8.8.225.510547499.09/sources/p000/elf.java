package p000;

import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class elf {

    /* JADX INFO: renamed from: a */
    public static final nbh f14552a = nbh.m17259h("com/google/android/apps/camera/imax/cyclops/video/EncoderDrainer");

    /* JADX INFO: renamed from: b */
    public final elc f14553b;

    /* JADX INFO: renamed from: c */
    public final elg f14554c;

    /* JADX INFO: renamed from: d */
    public final Queue f14555d = new LinkedList();

    /* JADX INFO: renamed from: e */
    public final Object f14556e = new Object();

    /* JADX INFO: renamed from: m */
    private Thread f14564m = null;

    /* JADX INFO: renamed from: n */
    private Thread f14565n = null;

    /* JADX INFO: renamed from: f */
    public int f14557f = -1;

    /* JADX INFO: renamed from: g */
    public boolean f14558g = false;

    /* JADX INFO: renamed from: h */
    public boolean f14559h = false;

    /* JADX INFO: renamed from: i */
    public boolean f14560i = false;

    /* JADX INFO: renamed from: j */
    public boolean f14561j = false;

    /* JADX INFO: renamed from: k */
    public int f14562k = 0;

    /* JADX INFO: renamed from: l */
    public int f14563l = 0;

    public elf(elc elcVar, elg elgVar) {
        this.f14553b = elcVar;
        this.f14554c = elgVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0081 A[Catch: all -> 0x00c2, TRY_LEAVE, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000b, B:10:0x0015, B:14:0x0029, B:16:0x0034, B:17:0x0041, B:20:0x0048, B:21:0x0055, B:22:0x005c, B:25:0x0063, B:29:0x0077, B:31:0x0081, B:32:0x008e, B:35:0x0095, B:36:0x00a2, B:28:0x006a, B:41:0x00b2, B:13:0x001c, B:42:0x00b3, B:23:0x005d, B:24:0x0062), top: B:52:0x0001, inners: #0, #1, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final synchronized void m7446a() {
        if (this.f14565n != null && this.f14564m != null) {
            this.f14553b.mo7412b();
            this.f14558g = true;
            try {
                this.f14564m.join(1000L);
            } catch (InterruptedException e) {
                ((nbe) ((nbe) ((nbe) f14552a.m17251b()).mo17283h(e)).mo17276G((char) 1565)).mo17290o("Failed to stop drainer");
            }
            this.f14560i = false;
            if (!this.f14564m.isAlive()) {
                this.f14564m = null;
                this.f14559h = true;
                synchronized (this.f14556e) {
                    this.f14556e.notifyAll();
                    this.f14565n.join(1000L);
                    this.f14561j = false;
                    if (this.f14565n.isAlive()) {
                        ((nbe) ((nbe) f14552a.m17251b()).mo17276G((char) 1566)).mo17290o("Stopping writer timed out, forcing stop");
                        this.f14565n.join();
                    }
                    this.f14565n = null;
                    this.f14554c.m7449b();
                    this.f14553b.mo7413c();
                    return;
                }
            }
            ((nbe) ((nbe) f14552a.m17251b()).mo17276G((char) 1563)).mo17290o("Stopping drainer timed out, forcing stop");
            try {
                this.f14564m.join();
            } catch (InterruptedException e2) {
                ((nbe) ((nbe) ((nbe) f14552a.m17251b()).mo17283h(e2)).mo17276G((char) 1564)).mo17290o("Failed to stop drainer");
            }
            this.f14564m = null;
            this.f14559h = true;
            synchronized (this.f14556e) {
                this.f14556e.notifyAll();
            }
            try {
                this.f14565n.join(1000L);
            } catch (InterruptedException e3) {
                ((nbe) ((nbe) ((nbe) f14552a.m17251b()).mo17283h(e3)).mo17276G((char) 1568)).mo17290o("Failed to stop writer thread");
            }
            this.f14561j = false;
            if (this.f14565n.isAlive()) {
                ((nbe) ((nbe) f14552a.m17251b()).mo17276G((char) 1566)).mo17290o("Stopping writer timed out, forcing stop");
                try {
                    this.f14565n.join();
                } catch (InterruptedException e4) {
                    ((nbe) ((nbe) ((nbe) f14552a.m17251b()).mo17283h(e4)).mo17276G((char) 1567)).mo17290o("Failed to stop drainer");
                }
            }
            this.f14565n = null;
            this.f14554c.m7449b();
            this.f14553b.mo7413c();
            return;
            throw th;
        }
        ((nbe) ((nbe) f14552a.m17251b()).mo17276G((char) 1562)).mo17290o("stop called more than once!");
    }

    /* JADX INFO: renamed from: b */
    public final synchronized boolean m7447b() {
        if (this.f14565n == null && this.f14564m == null) {
            this.f14557f = -1;
            this.f14558g = false;
            this.f14559h = false;
            this.f14560i = true;
            this.f14561j = true;
            this.f14562k = 0;
            this.f14563l = 0;
            if (!this.f14553b.mo7414d()) {
                ((nbe) ((nbe) f14552a.m17251b()).mo17276G((char) 1572)).mo17290o("Failed to start the encoder.");
                return false;
            }
            eld eldVar = new eld(this);
            this.f14565n = eldVar;
            eldVar.start();
            ele eleVar = new ele(this);
            this.f14564m = eleVar;
            eleVar.start();
            return true;
        }
        ((nbe) ((nbe) f14552a.m17251b()).mo17276G((char) 1571)).mo17290o("start called more than once!");
        return true;
    }
}
