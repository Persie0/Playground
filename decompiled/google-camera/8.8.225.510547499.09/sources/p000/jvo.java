package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jvo implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ jvn f34905a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ boolean f34906b;

    /* JADX INFO: renamed from: c */
    private final AtomicInteger f34907c = new AtomicInteger(0);

    public jvo(jvn jvnVar, boolean z) {
        this.f34905a = jvnVar;
        this.f34906b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str;
        String str2 = this.f34905a.f34901b;
        if (this.f34906b) {
            str = "";
        } else {
            str = "-" + this.f34907c.incrementAndGet();
        }
        return new jur(this.f34905a.f34902c, runnable, String.valueOf(str2).concat(str));
    }
}
