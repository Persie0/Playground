package p000;

import com.lingq.core.data.repository.C1295k;
import com.lingq.core.data.repository.C1302r;
import com.lingq.core.domain.lesson.C1380b;
import com.lingq.core.domain.playlist.C1523f;
import kotlinx.coroutines.flow.AbstractC3224d;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class im3 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44285a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f44286b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f44287c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f44288d;

    public /* synthetic */ im3(int i, vi3 vi3Var, qc9 qc9Var) {
        this.f44285a = 2;
        this.f44287c = i;
        this.f44288d = vi3Var;
        this.f44286b = qc9Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f44285a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f44287c;
        Object obj = this.f44286b;
        Object obj2 = this.f44288d;
        switch (i) {
            case 0:
                return ((C1302r) ((C1523f) obj2).f19947a).m7359s(i2, (String) obj);
            case 1:
                C1295k c1295k = (C1295k) ((C1380b) obj2).f18723b;
                c1295k.getClass();
                ((String) obj).getClass();
                return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(((q05) c1295k.f16498b).f57071K, false, new String[]{"LessonPreviewEntity"}, new mv0(i2, 14)));
            case 2:
                ((vi3) obj2).invoke(Integer.valueOf(l70.m15945h(ss5.m21693T(((qc9) obj).m19861h()), 0, i2) + 1));
                return xfaVar;
            default:
                lw8 lw8Var = (lw8) obj2;
                vi3 vi3Var = (vi3) obj;
                if (lw8Var != null) {
                    vi3Var.invoke(new dra(i2, lw8Var.f50218g, lw8Var.f50219h));
                }
                return xfaVar;
        }
    }

    public /* synthetic */ im3(Object obj, int i, int i2, Object obj2) {
        this.f44285a = i2;
        this.f44288d = obj;
        this.f44286b = obj2;
        this.f44287c = i;
    }
}
