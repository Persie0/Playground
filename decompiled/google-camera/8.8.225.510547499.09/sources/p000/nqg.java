package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nqg implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ThreadFactory f44057a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f44058b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Object f44059c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f44060d;

    public nqg(ThreadFactory threadFactory, String str, AtomicLong atomicLong, int i) {
        this.f44060d = i;
        this.f44057a = threadFactory;
        this.f44058b = str;
        this.f44059c = atomicLong;
    }

    public /* synthetic */ nqg(ThreadFactory threadFactory, String str, opl oplVar, int i) {
        this.f44060d = i;
        this.f44057a = threadFactory;
        this.f44058b = str;
        this.f44059c = oplVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        CharSequence charSequenceSubSequence;
        switch (this.f44060d) {
            case 0:
                Thread threadNewThread = this.f44057a.newThread(runnable);
                String str = this.f44058b;
                if (str != null) {
                    Object obj = this.f44059c;
                    obj.getClass();
                    threadNewThread.setName(nax.m17230b(str, Long.valueOf(((AtomicLong) obj).getAndIncrement())));
                }
                return threadNewThread;
            default:
                ThreadFactory threadFactory = this.f44057a;
                String str2 = this.f44058b;
                Object obj2 = this.f44059c;
                int[] iArr = C1067vj.f47847a;
                Thread threadNewThread2 = threadFactory.newThread(runnable);
                threadNewThread2.getClass();
                String strValueOf = String.valueOf(((opl) obj2).m18846b());
                strValueOf.getClass();
                if (strValueOf.length() >= 2) {
                    charSequenceSubSequence = strValueOf.subSequence(0, strValueOf.length());
                } else {
                    StringBuilder sb = new StringBuilder(2);
                    okz it = new oot(1, 2 - strValueOf.length()).iterator();
                    while (it.f46220a) {
                        it.m18604a();
                        sb.append('0');
                    }
                    sb.append((CharSequence) strValueOf);
                    charSequenceSubSequence = sb;
                }
                threadNewThread2.setName(str2.concat(String.valueOf(charSequenceSubSequence.toString())));
                return threadNewThread2;
        }
    }
}
