package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class alb {

    /* JADX INFO: renamed from: c */
    public final ale f619c;

    /* JADX INFO: renamed from: d */
    boolean f620d;

    /* JADX INFO: renamed from: e */
    int f621e = -1;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ alc f622f;

    public alb(alc alcVar, ale aleVar) {
        this.f622f = alcVar;
        this.f619c = aleVar;
    }

    /* JADX INFO: renamed from: b */
    public void mo894b() {
    }

    /* JADX INFO: renamed from: c */
    public boolean mo895c(akv akvVar) {
        return false;
    }

    /* JADX INFO: renamed from: f */
    public abstract boolean mo893f();

    /* JADX INFO: renamed from: d */
    public final void m896d(boolean z) {
        boolean z2;
        if (z == this.f620d) {
            return;
        }
        this.f620d = z;
        alc alcVar = this.f622f;
        int i = true != z ? -1 : 1;
        int i2 = alcVar.f626d;
        alcVar.f626d = i + i2;
        if (!alcVar.f627e) {
            alcVar.f627e = true;
            while (true) {
                try {
                    int i3 = alcVar.f626d;
                    if (i2 == i3) {
                        break;
                    }
                    if (i2 != 0) {
                        z2 = false;
                    } else if (i3 > 0) {
                        i2 = 0;
                        z2 = true;
                    } else {
                        i2 = 0;
                        z2 = false;
                    }
                    boolean z3 = i2 > 0 && i3 == 0;
                    if (z2) {
                        alcVar.mo901d();
                    } else if (z3) {
                        alcVar.mo902e();
                    }
                    i2 = i3;
                } catch (Throwable th) {
                    alcVar.f627e = false;
                    throw th;
                }
            }
            alcVar.f627e = false;
        }
        if (this.f620d) {
            this.f622f.m899b(this);
        }
    }
}
