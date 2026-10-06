package p000;

import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jzj implements kbg {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f35293a;

    /* JADX INFO: renamed from: b */
    private boolean f35294b = true;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f35295c;

    public jzj(fpf fpfVar, int i) {
        this.f35295c = i;
        this.f35293a = fpfVar;
    }

    public jzj(jzl jzlVar, int i) {
        this.f35295c = i;
        this.f35293a = jzlVar;
    }

    @Override // p000.kbg
    /* JADX INFO: renamed from: bf */
    public final /* synthetic */ void mo3415bf(Object obj) {
        switch (this.f35295c) {
            case 0:
                Long l = (Long) obj;
                if (this.f35294b) {
                    this.f35294b = false;
                } else if (!((jzl) this.f35293a).f35301c.mo16813g()) {
                    Log.e("MetaEncoder", "Fail to write metadata. Metadata track is not present.");
                } else {
                    Object obj2 = this.f35293a;
                    long jLongValue = l.longValue();
                    int iIntValue = ((Integer) ((jzl) this.f35293a).f35301c.mo16809c()).intValue();
                    jzl jzlVar = (jzl) obj2;
                    jzlVar.f35300b.offer(Long.valueOf(jLongValue));
                    if (jzlVar.f35300b.size() >= jzlVar.f35299a) {
                        jzlVar.m13797a(((Long) jzlVar.f35300b.poll()).longValue(), iIntValue);
                    }
                }
                break;
            default:
                if (!this.f35294b) {
                    ((fpf) this.f35293a).f23033e.m5718c(true);
                } else {
                    this.f35294b = false;
                }
                break;
        }
    }
}
