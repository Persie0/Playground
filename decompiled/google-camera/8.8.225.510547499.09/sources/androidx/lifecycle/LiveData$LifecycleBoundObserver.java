package androidx.lifecycle;

import p000.akq;
import p000.akr;
import p000.akt;
import p000.akv;
import p000.alb;
import p000.alc;
import p000.ale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class LiveData$LifecycleBoundObserver extends alb implements akt {

    /* JADX INFO: renamed from: a */
    final akv f1519a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ alc f1520b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveData$LifecycleBoundObserver(alc alcVar, akv akvVar, ale aleVar) {
        super(alcVar, aleVar);
        this.f1520b = alcVar;
        this.f1519a = akvVar;
    }

    @Override // p000.akt
    /* JADX INFO: renamed from: a */
    public final void mo883a(akv akvVar, akq akqVar) {
        akr akrVar = this.f1519a.getLifecycle().f598a;
        if (akrVar == akr.DESTROYED) {
            this.f1520b.mo903f(this.f619c);
            return;
        }
        akr akrVar2 = null;
        while (akrVar2 != akrVar) {
            m896d(mo893f());
            akrVar2 = akrVar;
            akrVar = this.f1519a.getLifecycle().f598a;
        }
    }

    @Override // p000.alb
    /* JADX INFO: renamed from: b */
    public final void mo894b() {
        this.f1519a.getLifecycle().m881c(this);
    }

    @Override // p000.alb
    /* JADX INFO: renamed from: c */
    public final boolean mo895c(akv akvVar) {
        return this.f1519a == akvVar;
    }

    @Override // p000.alb
    /* JADX INFO: renamed from: f */
    public final boolean mo893f() {
        return this.f1519a.getLifecycle().f598a.m872a(akr.f595d);
    }
}
