package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class zr9 {

    /* JADX INFO: renamed from: a */
    public final as9 f72009a;

    /* JADX INFO: renamed from: b */
    public final String f72010b;

    /* JADX INFO: renamed from: c */
    public boolean f72011c;

    /* JADX INFO: renamed from: d */
    public sr9 f72012d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f72013e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public boolean f72014f;

    public zr9(as9 as9Var, String str) {
        this.f72009a = as9Var;
        this.f72010b = str;
    }

    /* JADX INFO: renamed from: b */
    public static void m25750b(zr9 zr9Var, String str, ui3 ui3Var) {
        zr9Var.getClass();
        str.getClass();
        ui3Var.getClass();
        zr9Var.m25753c(new dh2(str, ui3Var), 0L);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m25752a() {
        sr9 sr9Var = this.f72012d;
        if (sr9Var != null && sr9Var.f61321b) {
            this.f72014f = true;
        }
        ArrayList arrayList = this.f72013e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((sr9) arrayList.get(size)).f61321b) {
                Logger logger = this.f72009a.f7434b;
                sr9 sr9Var2 = (sr9) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    bna.m3948f(logger, sr9Var2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    public final void m25753c(sr9 sr9Var, long j) {
        sr9Var.getClass();
        synchronized (this.f72009a) {
            if (!this.f72011c) {
                if (m25754e(sr9Var, j, false)) {
                    this.f72009a.m3022c(this);
                }
                return;
            }
            boolean z = sr9Var.f61321b;
            Logger logger = this.f72009a.f7434b;
            if (z) {
                if (logger.isLoggable(Level.FINE)) {
                    bna.m3948f(logger, sr9Var, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (logger.isLoggable(Level.FINE)) {
                    bna.m3948f(logger, sr9Var, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    /* JADX WARN: Code duplicated, block: B:28:0x0076 A[LOOP:0: B:23:0x0062->B:28:0x0076, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x007c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x007a A[EDGE_INSN: B:40:0x007a->B:30:0x007a BREAK  A[LOOP:0: B:23:0x0062->B:28:0x0076], SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public final boolean m25754e(sr9 sr9Var, long j, boolean z) {
        Iterator it;
        int size;
        String strConcat;
        Logger logger = this.f72009a.f7434b;
        sr9Var.getClass();
        zr9 zr9Var = sr9Var.f61322c;
        if (zr9Var != this) {
            if (zr9Var != null) {
                C3386nv.m17633t("task is in multiple queues");
                return false;
            }
            sr9Var.f61322c = this;
        }
        long jNanoTime = System.nanoTime();
        long j2 = jNanoTime + j;
        ArrayList arrayList = this.f72013e;
        int iIndexOf = arrayList.indexOf(sr9Var);
        if (iIndexOf == -1) {
            sr9Var.f61323d = j2;
            if (logger.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(bna.m3925N(j2 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(bna.m3925N(j2 - jNanoTime));
                }
                bna.m3948f(logger, sr9Var, this, strConcat);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((sr9) it.next()).f61323d - jNanoTime > j) {
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, sr9Var);
            if (size == 0) {
                return true;
            }
        } else if (sr9Var.f61323d > j2) {
            arrayList.remove(iIndexOf);
            sr9Var.f61323d = j2;
            if (logger.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(bna.m3925N(j2 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(bna.m3925N(j2 - jNanoTime));
                }
                bna.m3948f(logger, sr9Var, this, strConcat);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((sr9) it.next()).f61323d - jNanoTime > j) {
                    break;
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, sr9Var);
            if (size == 0) {
                return true;
            }
        } else if (logger.isLoggable(Level.FINE)) {
            bna.m3948f(logger, sr9Var, this, "already scheduled");
            return false;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m25755f() {
        as9 as9Var = this.f72009a;
        TimeZone timeZone = kcb.f47051a;
        synchronized (as9Var) {
            this.f72011c = true;
            if (m25752a()) {
                this.f72009a.m3022c(this);
            }
        }
    }

    public final String toString() {
        return this.f72010b;
    }
}
