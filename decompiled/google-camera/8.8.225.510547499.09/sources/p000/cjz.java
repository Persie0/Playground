package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cjz extends jxc {

    /* JADX INFO: renamed from: a */
    private final jwn f5951a;

    /* JADX INFO: renamed from: b */
    private final jwn f5952b;

    /* JADX INFO: renamed from: c */
    private boolean f5953c;

    public cjz(jwn jwnVar, jwn jwnVar2, jwn jwnVar3) {
        super(jwnVar);
        lku.m15669w(((Integer) jwnVar3.mo3831be()).intValue() >= ((Integer) jwnVar2.mo3831be()).intValue());
        this.f5951a = jwnVar2;
        this.f5952b = jwnVar3;
        this.f5953c = mo3833d((Integer) jwnVar.mo3831be()).booleanValue();
    }

    @Override // p000.jxc
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Boolean mo3833d(Integer num) {
        if (num.intValue() < ((Integer) this.f5951a.mo3831be()).intValue()) {
            this.f5953c = false;
        } else if (num.intValue() >= ((Integer) this.f5952b.mo3831be()).intValue()) {
            this.f5953c = true;
        }
        return Boolean.valueOf(this.f5953c);
    }
}
