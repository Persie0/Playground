package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class opg implements opa {

    /* JADX INFO: renamed from: a */
    public final opa f46375a;

    /* JADX INFO: renamed from: b */
    public final oni f46376b;

    public opg(opa opaVar, oni oniVar) {
        this.f46375a = opaVar;
        this.f46376b = oniVar;
    }

    @Override // p000.opa
    /* JADX INFO: renamed from: a */
    public final Iterator mo18817a() {
        return new opf(this);
    }
}
