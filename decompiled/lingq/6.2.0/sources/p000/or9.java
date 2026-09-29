package p000;

/* JADX INFO: loaded from: classes.dex */
public final class or9 implements InterfaceC3579sm {

    /* JADX INFO: renamed from: a */
    public final voa f54790a;

    /* JADX INFO: renamed from: b */
    public final jda f54791b;

    /* JADX INFO: renamed from: c */
    public final Object f54792c;

    /* JADX INFO: renamed from: d */
    public final Object f54793d;

    /* JADX INFO: renamed from: e */
    public final AbstractC3081hn f54794e;

    /* JADX INFO: renamed from: f */
    public final AbstractC3081hn f54795f;

    /* JADX INFO: renamed from: g */
    public final AbstractC3081hn f54796g;

    /* JADX INFO: renamed from: h */
    public long f54797h;

    /* JADX INFO: renamed from: i */
    public AbstractC3081hn f54798i;

    public or9(InterfaceC0025an interfaceC0025an, jda jdaVar, Object obj, Object obj2, AbstractC3081hn abstractC3081hn) {
        this.f54790a = interfaceC0025an.mo589a(jdaVar);
        this.f54791b = jdaVar;
        this.f54792c = obj2;
        this.f54793d = obj;
        this.f54794e = (AbstractC3081hn) jdaVar.f45442a.invoke(obj);
        vi3 vi3Var = jdaVar.f45442a;
        this.f54795f = (AbstractC3081hn) vi3Var.invoke(obj2);
        this.f54796g = abstractC3081hn != null ? do7.m10533i(abstractC3081hn) : ((AbstractC3081hn) vi3Var.invoke(obj)).mo10485c();
        this.f54797h = -1L;
    }

    @Override // p000.InterfaceC3579sm
    /* JADX INFO: renamed from: b */
    public final boolean mo10817b() {
        return this.f54790a.mo17607b();
    }

    @Override // p000.InterfaceC3579sm
    /* JADX INFO: renamed from: c */
    public final long mo10818c() {
        if (this.f54797h < 0) {
            this.f54797h = this.f54790a.mo9842d(this.f54794e, this.f54795f, this.f54796g);
        }
        return this.f54797h;
    }

    @Override // p000.InterfaceC3579sm
    /* JADX INFO: renamed from: d */
    public final jda mo10819d() {
        return this.f54791b;
    }

    @Override // p000.InterfaceC3579sm
    /* JADX INFO: renamed from: e */
    public final AbstractC3081hn mo10820e(long j) {
        if (!m21452f(j)) {
            return this.f54790a.mo4033i(j, this.f54794e, this.f54795f, this.f54796g);
        }
        AbstractC3081hn abstractC3081hn = this.f54798i;
        if (abstractC3081hn != null) {
            return abstractC3081hn;
        }
        AbstractC3081hn abstractC3081hnMo17609s = this.f54790a.mo17609s(this.f54794e, this.f54795f, this.f54796g);
        this.f54798i = abstractC3081hnMo17609s;
        return abstractC3081hnMo17609s;
    }

    @Override // p000.InterfaceC3579sm
    /* JADX INFO: renamed from: g */
    public final Object mo10821g(long j) {
        if (m21452f(j)) {
            return this.f54792c;
        }
        AbstractC3081hn abstractC3081hnMo4036r = this.f54790a.mo4036r(j, this.f54794e, this.f54795f, this.f54796g);
        int iMo10484b = abstractC3081hnMo4036r.mo10484b();
        for (int i = 0; i < iMo10484b; i++) {
            if (Float.isNaN(abstractC3081hnMo4036r.mo10483a(i))) {
                ji7.m14492b("AnimationVector cannot contain a NaN. " + abstractC3081hnMo4036r + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.f54791b.f45443b.invoke(abstractC3081hnMo4036r);
    }

    @Override // p000.InterfaceC3579sm
    /* JADX INFO: renamed from: h */
    public final Object mo10822h() {
        return this.f54792c;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f54793d + " -> " + this.f54792c + ",initial velocity: " + this.f54796g + ", duration: " + (mo10818c() / 1000000) + " ms,animationSpec: " + this.f54790a;
    }
}
