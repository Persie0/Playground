package p000;

import android.content.Context;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class lmu extends lhf {

    /* JADX INFO: renamed from: e */
    final /* synthetic */ msa f38709e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lmu(mrm mrmVar, ohb ohbVar, Context context, msa msaVar) {
        super("StorageMetric", mrmVar, ohbVar, context);
        this.f38709e = msaVar;
    }

    @Override // p000.lhf
    /* JADX INFO: renamed from: a */
    public final mxk mo15334a(pat patVar) {
        if ((patVar.f47276a & 128) == 0) {
            return mzx.f41874a;
        }
        mxi mxiVarM17132D = mxk.m17132D();
        pao paoVar = patVar.f47283h;
        if (paoVar == null) {
            paoVar = pao.f47241k;
        }
        Iterator it = paoVar.f47252j.iterator();
        while (it.hasNext()) {
            mxiVarM17132D.m17129h(this.f38709e.m16851f(((pan) it.next()).f47237b));
        }
        return mxiVarM17132D.mo17127f();
    }
}
