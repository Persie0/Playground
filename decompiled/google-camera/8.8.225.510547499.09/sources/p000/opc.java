package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class opc {
    /* JADX INFO: renamed from: a */
    public abstract Object mo18838a(Object obj, ols olsVar);

    /* JADX INFO: renamed from: b */
    public abstract Object mo18839b(Iterator it, ols olsVar);

    /* JADX INFO: renamed from: c */
    public final Object m18840c(opa opaVar, ols olsVar) {
        Object objMo18839b = mo18839b(opaVar.mo18817a(), olsVar);
        return objMo18839b == oma.COROUTINE_SUSPENDED ? objMo18839b : oki.f46196a;
    }
}
