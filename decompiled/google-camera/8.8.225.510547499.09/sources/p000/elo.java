package p000;

import android.content.Context;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class elo implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f14608a;

    /* JADX INFO: renamed from: b */
    private final oju f14609b;

    /* JADX INFO: renamed from: c */
    private final oju f14610c;

    /* JADX INFO: renamed from: d */
    private final oju f14611d;

    public elo(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        this.f14608a = ojuVar;
        this.f14609b = ojuVar2;
        this.f14610c = ojuVar3;
        this.f14611d = ojuVar4;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final eij get() {
        Context contextM6830a = ((dws) this.f14608a).m6830a();
        hlw hlwVar = (hlw) this.f14609b.get();
        ihk ihkVar = (ihk) this.f14610c.get();
        return new eij(contextM6830a, hlwVar, ihkVar.m11335E(hlwVar), (Set) this.f14611d.get(), null, null, null);
    }
}
