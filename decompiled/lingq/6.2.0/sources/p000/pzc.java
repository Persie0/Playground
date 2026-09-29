package p000;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public abstract class pzc {

    /* JADX INFO: renamed from: a */
    public static final qn3 f57062a;

    static {
        Object fgbVar;
        ((xfb) sfb.f60802a).getClass();
        AtomicReference atomicReference = bgb.f8523f;
        String strReplace = "Phlogger";
        if (atomicReference.get() != null) {
            dgb dgbVar = (dgb) atomicReference.get();
            fgbVar = new fgb("Phlogger", dgbVar.f35632a, dgbVar.f35633b, dgbVar.f35634c);
        } else {
            for (int i = 7; i >= 0; i--) {
                char cCharAt = "Phlogger".charAt(i);
                if (cCharAt == '$') {
                    strReplace = "Phlogger".replace('$', '.');
                    break;
                } else {
                    if (cCharAt == '.') {
                        break;
                    }
                }
            }
            bgb bgbVar = new bgb(strReplace);
            if (bgb.f8520c || bgb.f8521d) {
                bgbVar.f8526b = new egb(strReplace);
            } else if (bgb.f8522e) {
                dgb dgbVar2 = fgb.f39087h;
                bgbVar.f8526b = new fgb(strReplace, Level.OFF, dgbVar2.f35633b, dgbVar2.f35634c);
            } else {
                bgbVar.f8526b = null;
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = zfb.f71505a;
            concurrentLinkedQueue.offer(bgbVar);
            fgbVar = bgbVar;
            if (atomicReference.get() != null) {
                while (true) {
                    bgb bgbVar2 = (bgb) concurrentLinkedQueue.poll();
                    if (bgbVar2 == null) {
                        break;
                    }
                    dgb dgbVar3 = (dgb) atomicReference.get();
                    bgbVar2.f8526b = new fgb((String) bgbVar2.f60774a, dgbVar3.f35632a, dgbVar3.f35633b, dgbVar3.f35634c);
                }
                bgb.m3703E();
                fgbVar = bgbVar;
            }
        }
        f57062a = new qn3(fgbVar);
    }
}
