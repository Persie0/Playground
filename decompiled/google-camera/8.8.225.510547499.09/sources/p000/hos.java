package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hos implements cdj {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f28651a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ bko f28652b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f28653c;

    public hos(cqv cqvVar, bko bkoVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f28653c = i;
        this.f28651a = cqvVar;
        this.f28652b = bkoVar;
    }

    public hos(hot hotVar, bko bkoVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f28653c = i;
        this.f28651a = hotVar;
        this.f28652b = bkoVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, jww] */
    @Override // p000.cdj
    /* JADX INFO: renamed from: d */
    public final void mo3439d() {
        switch (this.f28653c) {
            case 0:
                ((hot) this.f28651a).f28675v.f12398d.mo3415bf(true);
                ((hot) this.f28651a).f28668o.mo14124k(bzq.m3269i());
                ((hot) this.f28651a).f28657d.set(true);
                ((hot) this.f28651a).f28664k.m10602h(false);
                break;
            default:
                ((cqv) this.f28651a).m5382b();
                ((cqv) this.f28651a).f9044b.f9274d.mo3415bf(true);
                ((cqv) this.f28651a).f9043a.mo14124k(bzq.m3269i());
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, jww] */
    @Override // p000.cdj
    /* JADX INFO: renamed from: e */
    public final void mo3440e() {
        switch (this.f28653c) {
            case 0:
                ((hot) this.f28651a).f28675v.f12398d.mo3415bf(true);
                ((hot) this.f28651a).f28676w.f3651a.mo3415bf(true);
                ((hot) this.f28651a).f28668o.mo14124k(bzq.m3268h());
                ((hot) this.f28651a).f28657d.set(true);
                ((hot) this.f28651a).f28664k.m10602h(false);
                break;
            default:
                ((cqv) this.f28651a).f9044b.f9274d.mo3415bf(true);
                ((cqv) this.f28651a).f9044b.f9275e.mo3415bf(true);
                ((cqv) this.f28651a).f9043a.mo14124k(bzq.m3268h());
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, jww] */
    @Override // p000.cdj
    /* JADX INFO: renamed from: f */
    public final void mo3441f() {
        switch (this.f28653c) {
            case 0:
                ((hot) this.f28651a).f28676w.f3651a.mo3415bf(true);
                ((hot) this.f28651a).f28668o.mo14124k(bzq.m3270j());
                break;
            default:
                ((cqv) this.f28651a).f9044b.f9275e.mo3415bf(true);
                ((cqv) this.f28651a).f9043a.mo14124k(bzq.m3270j());
                break;
        }
    }

    @Override // p000.cdj
    /* JADX INFO: renamed from: a */
    public final nps mo3436a() {
        switch (this.f28653c) {
            case 0:
                break;
        }
        return kxk.m14965K(new jwf(this.f28652b.f3652a));
    }

    @Override // p000.cdj
    /* JADX INFO: renamed from: b */
    public final nps mo3437b() {
        switch (this.f28653c) {
            case 0:
                break;
        }
        return kxk.m14965K(bzq.m3281u());
    }

    @Override // p000.cdj
    /* JADX INFO: renamed from: c */
    public final nps mo3438c() {
        nqf nqfVar;
        switch (this.f28653c) {
            case 0:
                return ((hot) this.f28651a).f28672s;
            default:
                synchronized (this.f28651a) {
                    nqfVar = ((cqv) this.f28651a).f9045c;
                    nqfVar.getClass();
                    break;
                }
                return nqfVar;
        }
    }

    @Override // p000.cdj
    /* JADX INFO: renamed from: g */
    public final void mo3442g() {
        switch (this.f28653c) {
            case 0:
                ((hot) this.f28651a).m10551b(false, true);
                break;
            default:
                ((cqv) this.f28651a).m5384d(false, true);
                break;
        }
    }

    @Override // p000.cdj
    /* JADX INFO: renamed from: h */
    public final void mo3443h() {
        switch (this.f28653c) {
            case 0:
                ((hot) this.f28651a).m10551b(true, true);
                break;
            default:
                ((cqv) this.f28651a).m5384d(true, true);
                break;
        }
    }

    @Override // p000.cdj
    /* JADX INFO: renamed from: i */
    public final void mo3444i() {
        switch (this.f28653c) {
            case 0:
                ((hot) this.f28651a).m10551b(true, false);
                break;
            default:
                ((cqv) this.f28651a).m5384d(true, false);
                break;
        }
    }
}
