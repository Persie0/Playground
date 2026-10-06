package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gdv implements gdu {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f24343a;

    /* JADX INFO: renamed from: b */
    private final AtomicBoolean f24344b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f24345c;

    public gdv(gdt gdtVar, int i) {
        this.f24345c = i;
        this.f24343a = gdtVar;
    }

    public gdv(gdw gdwVar, int i) {
        this.f24345c = i;
        this.f24343a = gdwVar;
    }

    @Override // p000.gdu, p000.kba, java.lang.AutoCloseable
    public final void close() {
        switch (this.f24345c) {
            case 0:
                if (this.f24344b.getAndSet(true)) {
                    return;
                }
                Object obj = this.f24343a;
                synchronized (((gdw) obj).f24346a) {
                    ((jwf) obj).mo3415bf(Integer.valueOf(((Integer) ((jwf) obj).f34942d).intValue() - 1));
                    break;
                }
                return;
            default:
                if (this.f24344b.getAndSet(true)) {
                    return;
                }
                Object obj2 = this.f24343a;
                gdt gdtVar = (gdt) obj2;
                synchronized (gdtVar.f24338b) {
                    ((gdt) obj2).f24341e++;
                    ((gdt) obj2).f24340d.f34974a = Integer.valueOf(((gdt) obj2).m9081a());
                    break;
                }
                gdtVar.f24340d.m13646c();
                synchronized (gdtVar.f24338b) {
                    nax naxVar = (nax) ((gdt) obj2).f24339c.peekFirst();
                    if (naxVar == null) {
                        return;
                    }
                    if (!((gdt) obj2).f24342f) {
                        throw null;
                    }
                    naxVar.f41919a = new gdx("FiniteTicketPool is closed.");
                    ((gdt) obj2).f24339c.removeFirst();
                    ((gdt) obj2).f24340d.f34974a = Integer.valueOf(((gdt) obj2).m9081a());
                    gdtVar.f24340d.m13646c();
                    throw null;
                }
        }
    }
}
