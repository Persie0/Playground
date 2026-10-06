package p000;

import android.content.Context;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class lkh extends lhf {

    /* JADX INFO: renamed from: e */
    final /* synthetic */ ohb f38484e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ ohb f38485f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lkh(mrm mrmVar, ohb ohbVar, Context context, ohb ohbVar2, ohb ohbVar3) {
        super("CrashMetric", mrmVar, ohbVar, context);
        this.f38484e = ohbVar2;
        this.f38485f = ohbVar3;
    }

    @Override // p000.lhf
    /* JADX INFO: renamed from: a */
    public final mxk mo15334a(pat patVar) {
        if ((patVar.f47276a & 64) == 0) {
            return mzx.f41874a;
        }
        if (((Boolean) this.f38484e.get()).booleanValue()) {
            return mxk.m17134F((Collection) this.f38485f.get());
        }
        paf pafVar = patVar.f47282g;
        if (pafVar == null) {
            pafVar = paf.f47175l;
        }
        nmv nmvVar = pafVar.f47184h;
        if (nmvVar == null) {
            nmvVar = nmv.f43910f;
        }
        mxi mxiVarM17132D = mxk.m17132D();
        nms nmsVar = nmvVar.f43915d;
        if (nmsVar == null) {
            nmsVar = nms.f43891f;
        }
        mxiVarM17132D.mo17072d(nmsVar.f43895c);
        Iterator it = nmvVar.f43916e.iterator();
        while (it.hasNext()) {
            mxiVarM17132D.mo17072d(((nms) it.next()).f43895c);
        }
        Iterator it2 = (nmvVar.f43913b == 4 ? (nmt) nmvVar.f43914c : nmt.f43899b).f43901a.iterator();
        while (it2.hasNext()) {
            nms nmsVar2 = ((nmu) it2.next()).f43906b;
            if (nmsVar2 == null) {
                nmsVar2 = nms.f43891f;
            }
            mxiVarM17132D.mo17072d(nmsVar2.f43895c);
        }
        return mxiVarM17132D.mo17127f();
    }
}
