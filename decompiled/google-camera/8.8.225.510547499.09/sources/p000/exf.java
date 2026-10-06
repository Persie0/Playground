package p000;

import com.google.android.apps.lightcycle.panorama.LightCycleNative;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class exf extends Thread {

    /* JADX INFO: renamed from: a */
    public final ArrayBlockingQueue f20729a = new ArrayBlockingQueue(50);

    /* JADX INFO: renamed from: b */
    public boolean f20730b = false;

    /* JADX INFO: renamed from: c */
    private eyp f20731c = null;

    /* JADX INFO: renamed from: d */
    private Boolean f20732d = false;

    /* JADX INFO: renamed from: a */
    public final synchronized void m7982a(eyp eypVar) {
        if (isInterrupted() || !isAlive()) {
            throw new RuntimeException("IncrementalAligner is already shut down.");
        }
        this.f20731c = eypVar;
        this.f20732d = true;
        super.interrupt();
    }

    @Override // java.lang.Thread
    public final void interrupt() {
        this.f20729a.add("Poison Pill");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int size;
        int i;
        while (!isInterrupted()) {
            ArrayList arrayList = new ArrayList();
            boolean z = true;
            try {
                String str = (String) this.f20729a.take();
                this.f20730b = true;
                arrayList.add(str);
                while (!this.f20729a.isEmpty()) {
                    arrayList.add((String) this.f20729a.take());
                }
                while (true) {
                    if (i >= size) {
                        z = false;
                        break;
                    } else {
                        if ("Poison Pill".equals((String) arrayList.get(i)) || this.f20732d.booleanValue()) {
                            break;
                        }
                        Object obj = exh.f20734a;
                        LightCycleNative.AlignNextImage();
                        i++;
                    }
                }
            } catch (InterruptedException e) {
                interrupt();
            }
            size = arrayList.size();
            i = 0;
            this.f20730b = false;
            if (z) {
                break;
            }
        }
        eyp eypVar = this.f20731c;
        if (eypVar != null) {
            eypVar.mo8051a(null);
        }
    }
}
