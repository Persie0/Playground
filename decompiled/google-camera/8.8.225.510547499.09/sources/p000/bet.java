package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bet extends bem {
    @Override // p000.bem
    /* JADX INFO: renamed from: a */
    public final void mo2266a(beu beuVar, beu beuVar2) {
        beuVar.f3063c = beuVar2;
    }

    @Override // p000.bem
    /* JADX INFO: renamed from: b */
    public final void mo2267b(beu beuVar, Thread thread) {
        beuVar.f3062b = thread;
    }

    @Override // p000.bem
    /* JADX INFO: renamed from: c */
    public final boolean mo2268c(bev bevVar, beq beqVar, beq beqVar2) {
        synchronized (bevVar) {
            if (bevVar.f3069e != beqVar) {
                return false;
            }
            bevVar.f3069e = beqVar2;
            return true;
        }
    }

    @Override // p000.bem
    /* JADX INFO: renamed from: d */
    public final boolean mo2269d(bev bevVar, Object obj, Object obj2) {
        synchronized (bevVar) {
            if (bevVar.f3068d != obj) {
                return false;
            }
            bevVar.f3068d = obj2;
            return true;
        }
    }

    @Override // p000.bem
    /* JADX INFO: renamed from: e */
    public final boolean mo2270e(bev bevVar, beu beuVar, beu beuVar2) {
        synchronized (bevVar) {
            if (bevVar.f3070f != beuVar) {
                return false;
            }
            bevVar.f3070f = beuVar2;
            return true;
        }
    }
}
