package p000;

import java.util.List;
import p021j$.util.Collection$EL;
import p021j$.util.Comparator$CC;
import p021j$.util.stream.Collectors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ctd implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f9419a;

    public ctd(oju ojuVar) {
        this.f9419a = ojuVar;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List get() {
        List list = (List) Collection$EL.stream(((ohm) this.f9419a).get()).sorted(Comparator$CC.comparing(cqk.f8917d)).collect(Collectors.toList());
        list.getClass();
        return list;
    }
}
