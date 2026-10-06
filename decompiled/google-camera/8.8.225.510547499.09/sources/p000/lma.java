package p000;

import android.content.Context;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lma extends lhf {

    /* JADX INFO: renamed from: e */
    final /* synthetic */ msa f38642e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lma(mrm mrmVar, ohb ohbVar, Context context, msa msaVar) {
        super("NetworkMetric", mrmVar, ohbVar, context);
        this.f38642e = msaVar;
    }

    @Override // p000.lhf
    /* JADX INFO: renamed from: a */
    public final mxk mo15334a(pat patVar) {
        if ((patVar.f47276a & 32) == 0) {
            return mzx.f41874a;
        }
        mxi mxiVarM17132D = mxk.m17132D();
        ozr ozrVar = patVar.f47281f;
        if (ozrVar == null) {
            ozrVar = ozr.f47067b;
        }
        Iterator it = ozrVar.f47069a.iterator();
        while (it.hasNext()) {
            mxiVarM17132D.m17129h(this.f38642e.m16849d(((ozq) it.next()).f47063d));
        }
        return mxiVarM17132D.mo17127f();
    }
}
