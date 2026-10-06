package p000;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cry extends jxc {
    public cry(dbr dbrVar, dhv dhvVar, hak hakVar, hak hakVar2) {
        super(jwr.m13632b(hakVar, hakVar2, dbrVar.f10419b));
        dhw dhwVar = dis.f11705a;
        dhvVar.mo6177e();
    }

    @Override // p000.jxc
    /* JADX INFO: renamed from: d */
    protected final /* bridge */ /* synthetic */ Object mo3833d(Object obj) {
        List list = (List) obj;
        gzo gzoVar = (gzo) list.get(0);
        gzo gzoVar2 = (gzo) list.get(1);
        kmq kmqVar = (kmq) list.get(2);
        if (kmq.BACK.equals(kmqVar)) {
            return gzoVar;
        }
        return kmq.f36557a.equals(kmqVar) ? gzoVar2 : gzo.OFF;
    }
}
