package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gaz extends jxc {

    /* JADX INFO: renamed from: a */
    private final gbi f24058a;

    /* JADX INFO: renamed from: b */
    private final gbi f24059b;

    /* JADX INFO: renamed from: c */
    private final gbi f24060c;

    /* JADX INFO: renamed from: d */
    private final gbi f24061d;

    /* JADX INFO: renamed from: e */
    private final gbi f24062e;

    /* JADX INFO: renamed from: f */
    private final gbi f24063f;

    public gaz(jwn jwnVar, gbi gbiVar, gbi gbiVar2, gbi gbiVar3, gbi gbiVar4, gbi gbiVar5, gbi gbiVar6) {
        super(jwnVar);
        this.f24058a = gbiVar;
        this.f24059b = gbiVar2;
        this.f24060c = gbiVar3;
        this.f24061d = gbiVar4;
        this.f24062e = gbiVar5;
        this.f24063f = gbiVar6;
    }

    @Override // p000.jxc
    /* JADX INFO: renamed from: d */
    protected final /* bridge */ /* synthetic */ Object mo3833d(Object obj) {
        fxg fxgVar = (fxg) obj;
        switch (fxgVar) {
            case NORMAL:
                return this.f24058a;
            case NORMAL_WITH_FLASH:
                return this.f24059b;
            case HDR_PLUS:
                return this.f24060c;
            case HDR_PLUS_WITH_TORCH:
                return this.f24061d;
            case HDR_PLUS_ZSL:
                return this.f24062e;
            case LONG_EXPOSURE:
                return this.f24063f;
            default:
                throw new AssertionError("Invalid AutoHdrPlusRecommendation enum instance:".concat(fxgVar.toString()));
        }
    }

    public final String toString() {
        mrl mrlVarM16765d = mpw.m16765d(this);
        mrlVarM16765d.m16823b("normal", this.f24058a);
        mrlVarM16765d.m16823b("normalFlash", this.f24059b);
        mrlVarM16765d.m16823b("hdrPlus", this.f24060c);
        mrlVarM16765d.m16823b("hdrPlusTorch", this.f24061d);
        mrlVarM16765d.m16823b("hdrPlusZsl", this.f24062e);
        return mrlVarM16765d.toString();
    }
}
