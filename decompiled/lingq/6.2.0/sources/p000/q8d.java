package p000;

import android.util.Log;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q8d implements gj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57402a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f57403b;

    public /* synthetic */ q8d(Object obj, int i) {
        this.f57402a = i;
        this.f57403b = obj;
    }

    @Override // p000.gj3
    public final Object apply(Object obj) {
        int i = this.f57402a;
        Object obj2 = this.f57403b;
        switch (i) {
            case 0:
                Log.w("FlagStore", "Failed to commit to updated flags for ".concat(String.valueOf(((t9d) obj2).f62030c)), (Throwable) obj);
                return null;
            default:
                w5d w5dVar = (w5d) obj;
                hld hldVar = cbd.f9865a;
                String str = (String) obj2;
                m5d m5dVar = (m5d) w5dVar.m23769s(str, p5d.m18913t()).m23966j();
                if (!Collections.unmodifiableList(((p5d) m5dVar.f63950b).m18914s()).contains("")) {
                    m5dVar.m22739b();
                    ((p5d) m5dVar.f63950b).m18915u("");
                }
                u5d u5dVar = (u5d) w5dVar.m23966j();
                m5dVar.m22739b();
                ((p5d) m5dVar.f63950b).m18916v("");
                p5d p5dVar = (p5d) m5dVar.m22741d();
                u5dVar.m22739b();
                ((w5d) u5dVar.f63950b).m23770u().put(str, p5dVar);
                return (w5d) u5dVar.m22741d();
        }
    }
}
