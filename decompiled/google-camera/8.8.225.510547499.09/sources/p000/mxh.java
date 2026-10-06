package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mxh extends mtt implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final mxh f41759a;

    /* JADX INFO: renamed from: b */
    public static final mxh f41760b;

    /* JADX INFO: renamed from: c */
    private final transient mws f41761c;

    static {
        int i = mws.f41739d;
        f41759a = new mxh(mzr.f41857a);
        f41760b = new mxh(mws.m17097l(mzj.f41841a));
    }

    public mxh(mws mwsVar) {
        this.f41761c = mwsVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // p000.mzl
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Set mo17126a() {
        return this.f41761c.isEmpty() ? mzx.f41874a : new mzy(this.f41761c, mzi.f41840a);
    }

    Object writeReplace() {
        return new mxg(this.f41761c);
    }
}
