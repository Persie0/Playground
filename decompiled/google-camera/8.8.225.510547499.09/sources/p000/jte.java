package p000;

import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jte extends jua {

    /* JADX INFO: renamed from: a */
    private final WeakReference f34760a;

    /* JADX INFO: renamed from: b */
    private final WeakReference f34761b;

    public jte(Map map, Object obj, jez jezVar) {
        super(jezVar);
        this.f34760a = new WeakReference(map);
        this.f34761b = new WeakReference(obj);
    }

    @Override // p000.jsy
    /* JADX INFO: renamed from: e */
    public final void mo13498e(Status status) {
        Map map = (Map) this.f34760a.get();
        Object obj = this.f34761b.get();
        if (!status.m4645b() && map != null && obj != null) {
            synchronized (map) {
                jug jugVar = (jug) map.remove(obj);
                if (jugVar != null) {
                    jugVar.m13504m();
                }
            }
        }
        m13503f(status);
    }
}
