package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nqd implements Runnable {

    /* JADX INFO: renamed from: a */
    Runnable f44049a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ nqe f44050b;

    public nqd(nqe nqeVar) {
        this.f44050b = nqeVar;
    }

    public final String toString() {
        String str;
        Runnable runnable = this.f44049a;
        if (runnable != null) {
            return "SequentialExecutorWorker{running=" + runnable.toString() + "}";
        }
        switch (this.f44050b.f44054d) {
            case 1:
                str = "IDLE";
                break;
            case 2:
                str = "QUEUING";
                break;
            case 3:
                str = "QUEUED";
                break;
            case 4:
                str = "RUNNING";
                break;
            default:
                str = "null";
                break;
        }
        return "SequentialExecutorWorker{state=" + str + "}";
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0052 */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if (r1 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
    
        r11.f44049a.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        r11.f44049a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
    
        p000.nqe.f44051a.logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.SequentialExecutor$QueueWorker", "workOnQueue", "Exception while executing runnable " + java.lang.String.valueOf(r11.f44049a), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
    
        r11.f44049a = null;
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
    
        r11.f44049a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() throws Throwable {
        boolean z = false;
        boolean zInterrupted = false;
        while (true) {
            try {
                try {
                    synchronized (this.f44050b.f44052b) {
                        if (!z) {
                            nqe nqeVar = this.f44050b;
                            if (nqeVar.f44054d != 4) {
                                nqeVar.f44053c++;
                                nqeVar.f44054d = 4;
                            }
                        }
                        Runnable runnable = (Runnable) this.f44050b.f44052b.poll();
                        this.f44049a = runnable;
                        if (runnable == null) {
                            this.f44050b.f44054d = 1;
                        }
                    }
                    if (zInterrupted) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                } catch (Error e) {
                    synchronized (this.f44050b.f44052b) {
                        this.f44050b.f44054d = 1;
                        throw e;
                    }
                }
            } catch (Throwable th) {
                th = th;
                if (zInterrupted) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
    }
}
