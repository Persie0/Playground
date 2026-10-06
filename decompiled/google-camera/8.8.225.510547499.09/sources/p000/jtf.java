package p000;

import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jtf extends jua {

    /* JADX INFO: renamed from: a */
    private final WeakReference f34762a;

    /* JADX INFO: renamed from: b */
    private final WeakReference f34763b;

    public jtf(Map map, Object obj, jez jezVar) {
        super(jezVar);
        this.f34762a = new WeakReference(map);
        this.f34763b = new WeakReference(obj);
    }

    @Override // p000.jsy
    /* JADX INFO: renamed from: e */
    public final void mo13498e(Status status) {
        Map map = (Map) this.f34762a.get();
        Object obj = this.f34763b.get();
        if (status.f7607g == 4002 && map != null && obj != null) {
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
