package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gub implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f26423a;

    /* JADX INFO: renamed from: b */
    private final oju f26424b;

    /* JADX INFO: renamed from: c */
    private final oju f26425c;

    /* JADX INFO: renamed from: d */
    private final oju f26426d;

    public gub(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        this.f26423a = ojuVar;
        this.f26424b = ojuVar2;
        this.f26425c = ojuVar3;
        this.f26426d = ojuVar4;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gua get() {
        return new gua((Executor) this.f26423a.get(), (jww) this.f26424b.get(), (jww) this.f26425c.get(), ((hog) this.f26426d).m10532a());
    }
}
