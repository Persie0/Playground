package p000;

import android.content.Context;
import com.lingq.core.token.C1909e;
import com.lingq.feature.reader.reader.p017ui.AbstractC2506c;
import com.lingq.feature.vocabulary.AbstractC2823a;
import com.lingq.feature.vocabulary.C2824b;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pv7 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56856a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f56857b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f56858c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f56859d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f56860e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f56861f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f56862g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f56863h;

    public /* synthetic */ pv7(w41 w41Var, Context context, og8 og8Var, bia biaVar, C1909e c1909e, C2824b c2824b, t66 t66Var) {
        this.f56858c = w41Var;
        this.f56859d = context;
        this.f56860e = og8Var;
        this.f56861f = biaVar;
        this.f56862g = c1909e;
        this.f56863h = c2824b;
        this.f56857b = t66Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f56856a;
        xfa xfaVar = xfa.f68157a;
        Object obj = this.f56863h;
        Object obj2 = this.f56862g;
        Object obj3 = this.f56861f;
        Object obj4 = this.f56860e;
        Object obj5 = this.f56859d;
        Object obj6 = this.f56858c;
        switch (i) {
            case 0:
                qc9 qc9Var = (qc9) obj3;
                un1 un1Var = (un1) obj2;
                t66 t66Var = (t66) obj;
                Double d = (Double) AbstractC2506c.m9414b((yz4) obj6, (jy7) obj5, (Map) obj4).f47623a;
                if (d == null) {
                    t66Var.setValue(lbb.f49418a);
                } else {
                    qc9Var.m19862i((float) d.doubleValue());
                    AbstractC2506c.m9416d(un1Var, this.f56857b, t66Var, d.doubleValue());
                }
                break;
            default:
                AbstractC2823a.m9740g((w41) obj6, (Context) obj5, (og8) obj4, (bia) obj3, (C1909e) obj2, (C2824b) obj, this.f56857b, m0b.f50406a);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ pv7(yz4 yz4Var, jy7 jy7Var, Map map, qc9 qc9Var, un1 un1Var, t66 t66Var, t66 t66Var2) {
        this.f56858c = yz4Var;
        this.f56859d = jy7Var;
        this.f56860e = map;
        this.f56861f = qc9Var;
        this.f56862g = un1Var;
        this.f56857b = t66Var;
        this.f56863h = t66Var2;
    }
}
