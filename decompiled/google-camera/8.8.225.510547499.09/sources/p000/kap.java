package p000;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kap implements kba {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f35491a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f35492b;

    public /* synthetic */ kap(ite iteVar, int i) {
        this.f35492b = i;
        this.f35491a = iteVar;
    }

    public kap(Object obj, int i) {
        this.f35492b = i;
        this.f35491a = obj;
    }

    public /* synthetic */ kap(ReentrantLock reentrantLock, int i) {
        this.f35492b = i;
        this.f35491a = reentrantLock;
    }

    public /* synthetic */ kap(kdt kdtVar, int i) {
        this.f35492b = i;
        this.f35491a = kdtVar;
    }

    public /* synthetic */ kap(khu khuVar, int i) {
        this.f35492b = i;
        this.f35491a = khuVar;
    }

    public /* synthetic */ kap(khx khxVar, int i) {
        this.f35492b = i;
        this.f35491a = khxVar;
    }

    public kap(InterfaceC0951rb interfaceC0951rb, int i) {
        this.f35492b = i;
        this.f35491a = interfaceC0951rb;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, rb] */
    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        switch (this.f35492b) {
            case 0:
                break;
            case 1:
                ite iteVar = (ite) this.f35491a;
                iteVar.mo11728I(true);
                iteVar.mo11765p();
                break;
            case 2:
                ((kdt) this.f35491a).m14005f();
                break;
            case 3:
                ((khu) this.f35491a).m14294p();
                break;
            case 4:
                ((khx) this.f35491a).m14302d();
                break;
            case 5:
                ((ReentrantLock) this.f35491a).unlock();
                break;
            default:
                this.f35491a.close();
                break;
        }
    }
}
