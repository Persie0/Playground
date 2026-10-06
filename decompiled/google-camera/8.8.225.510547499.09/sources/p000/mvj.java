package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mvj extends mvk {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Iterable f41684a;

    public mvj(Iterable iterable) {
        this.f41684a = iterable;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new myd(mkv.m16510R(this.f41684a.iterator(), new cev(9)));
    }
}
