package p000;

import java.util.AbstractSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class okr extends AbstractSet implements Set {
    protected okr() {
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo18596a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return mo18596a();
    }
}
