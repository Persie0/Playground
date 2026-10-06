package p000;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class laj {

    /* JADX INFO: renamed from: b */
    public final Object[] f37816b;

    /* JADX INFO: renamed from: c */
    public final kzy[] f37817c;

    /* JADX INFO: renamed from: e */
    private final AtomicInteger f37819e;

    /* JADX INFO: renamed from: a */
    public final lav f37815a = lav.m15121j();

    /* JADX INFO: renamed from: d */
    public volatile boolean f37818d = false;

    /* JADX WARN: Multi-variable type inference failed */
    public laj(Iterable iterable) {
        int i = 0;
        int size = iterable.size();
        this.f37816b = new Object[size];
        this.f37817c = new kzy[size];
        this.f37819e = new AtomicInteger(size);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ((kzx) it.next()).mo15104c(not.INSTANCE, new lah(this, i), new lai(this, i)).mo15109h(kzj.f37771a);
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m15118a() {
        if (this.f37819e.decrementAndGet() == 0) {
            if (!this.f37818d) {
                this.f37815a.m15130l(Arrays.asList(this.f37816b));
                return;
            }
            kzy kzyVar = null;
            for (kzy kzyVar2 : this.f37817c) {
                if (kzyVar2 != null) {
                    if (kzyVar == null) {
                        kzyVar = kzyVar2;
                    } else {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(kzyVar, kzyVar2);
                        } catch (Exception e) {
                        }
                    }
                }
            }
            if (kzyVar != null) {
                this.f37815a.m15131m(kzyVar);
            } else {
                this.f37815a.m15131m(kzy.m15111a(new AssertionError("Result list was marked as having an exception,but no exception was found")));
            }
        }
    }
}
