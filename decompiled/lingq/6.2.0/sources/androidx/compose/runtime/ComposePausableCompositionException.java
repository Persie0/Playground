package androidx.compose.runtime;

import androidx.collection.AbstractC0040c;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import p000.h66;
import p000.omd;
import p000.s56;
import p000.u91;
import p000.vx8;
import p000.vz1;
import p000.wk9;

/* JADX INFO: loaded from: classes.dex */
final class ComposePausableCompositionException extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final AbstractC0040c f3654a;

    /* JADX INFO: renamed from: b */
    public final h66 f3655b;

    /* JADX INFO: renamed from: c */
    public final s56 f3656c;

    /* JADX INFO: renamed from: d */
    public final int f3657d;

    public ComposePausableCompositionException(AbstractC0040c abstractC0040c, h66 h66Var, s56 s56Var, int i, Exception exc) {
        super(exc);
        this.f3654a = abstractC0040c;
        this.f3655b = h66Var;
        this.f3656c = s56Var;
        this.f3657d = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List listM23604J;
        StringBuilder sb = new StringBuilder("\n            |Failed to execute op number ");
        sb.append(this.f3657d);
        sb.append(":\n            |");
        vx8 vx8VarM18129S = omd.m18129S(new ComposePausableCompositionException$operationsSequence$1(this, null));
        if (vx8VarM18129S.hasNext()) {
            Object next = vx8VarM18129S.next();
            if (vx8VarM18129S.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (vx8VarM18129S.hasNext()) {
                    arrayList.add(vx8VarM18129S.next());
                }
                listM23604J = arrayList;
            } else {
                listM23604J = vz1.m23604J(next);
            }
        } else {
            listM23604J = EmptyList.f47638a;
        }
        sb.append(u91.m22596N0(u91.m22616h1(50, listM23604J), "\n", null, null, null, 62));
        sb.append("\n            ");
        return wk9.m24030M(sb.toString());
    }
}
