package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0880y0 extends C0882z0<Object, Object> {
    public C0880y0(int i10) {
        super(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.C0882z0
    /* JADX INFO: renamed from: g */
    public final void mo3495g() {
        if (!this.f5957d) {
            for (int i10 = 0; i10 < m3503d(); i10++) {
                ((C0863q.b) m3502c(i10).getKey()).mo3139e();
            }
            Iterator<Map.Entry<Object, Object>> it = m3504e().iterator();
            while (it.hasNext()) {
                ((C0863q.b) it.next().getKey()).mo3139e();
            }
        }
        super.mo3495g();
    }

    @Override // androidx.datastore.preferences.protobuf.C0882z0, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((C0863q.b) obj, obj2);
    }
}
