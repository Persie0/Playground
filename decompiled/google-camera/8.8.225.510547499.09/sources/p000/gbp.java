package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gbp implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f24120a;

    /* JADX INFO: renamed from: b */
    private final oju f24121b;

    /* JADX INFO: renamed from: c */
    private final oju f24122c;

    /* JADX INFO: renamed from: d */
    private final oju f24123d;

    public gbp(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        this.f24120a = ojuVar;
        this.f24121b = ojuVar2;
        this.f24122c = ojuVar3;
        this.f24123d = ojuVar4;
    }

    /* JADX INFO: renamed from: b */
    public static gbp m9022b(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new gbp(ojuVar, ojuVar2, ojuVar3, ojuVar4);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gbi get() {
        kbn kbnVar = ((dki) this.f24120a).get();
        jvb jvbVar = (jvb) this.f24121b.get();
        gbi gbiVar = (gbi) this.f24122c.get();
        jwf jwfVar = (jwf) this.f24123d.get();
        jvbVar.m13537d(jwr.m13642l(gbiVar.mo7627b(), jwfVar));
        jwfVar.mo3415bf((fxi) gbiVar.mo7627b().mo3831be());
        jvbVar.m13537d(jwr.m13642l(gbiVar.mo7626a(), new ecr(kbnVar.mo6314a("ImgCptrCmdReady"), gbiVar, 11)));
        gbiVar.getClass();
        return gbiVar;
    }
}
