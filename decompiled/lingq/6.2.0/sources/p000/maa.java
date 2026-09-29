package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class maa extends laa {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3275kv f50855a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ naa f50856b;

    public maa(naa naaVar, C3275kv c3275kv) {
        this.f50856b = naaVar;
        this.f50855a = c3275kv;
    }

    @Override // p000.laa, p000.caa
    /* JADX INFO: renamed from: a */
    public final void mo4474a(daa daaVar) {
        ((ArrayList) this.f50855a.get(this.f50856b.f52545b)).remove(daaVar);
        daaVar.mo10189I(this);
    }
}
