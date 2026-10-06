package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class mtv extends mtm implements myv {
    private static final long serialVersionUID = 7431625294878419160L;

    protected mtv(Map map) {
        super(map);
    }

    @Override // p000.mtm
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ Collection mo16884a() {
        throw null;
    }

    @Override // p000.mtm
    /* JADX INFO: renamed from: c */
    public final Collection mo16886c(Object obj, Collection collection) {
        return new mtl(this, obj, (Set) collection);
    }

    @Override // p000.mtm, p000.myv
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Set mo16885b(Object obj) {
        return (Set) super.mo16885b(obj);
    }
}
