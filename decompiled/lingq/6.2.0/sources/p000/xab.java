package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xab implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68010a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yab f68011b;

    public /* synthetic */ xab(yab yabVar, float f) {
        this.f68010a = 3;
        this.f68011b = yabVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        int i = this.f68010a;
        yab yabVar = this.f68011b;
        switch (i) {
            case 0:
                r3b r3bVar = yabVar.f69583a;
                C3741x c3741x = r3bVar.f58580d;
                if (c3741x != null) {
                    c3741x.invoke(r3bVar.f58579c);
                    return;
                } else {
                    fa4.m11636J("youTubePlayerInitListener");
                    throw null;
                }
            case 1:
                r3b r3bVar2 = yabVar.f69583a;
                for (AbstractC2949e2 abstractC2949e2 : r3bVar2.getListeners()) {
                    vab r3bVar3 = r3bVar2.getInstance();
                    abstractC2949e2.getClass();
                    r3bVar3.getClass();
                }
                return;
            case 2:
                r3b r3bVar4 = yabVar.f69583a;
                Iterator<T> it = r3bVar4.getListeners().iterator();
                while (it.hasNext()) {
                    ((AbstractC2949e2) it.next()).mo8499d(r3bVar4.getInstance());
                }
                return;
            default:
                r3b r3bVar5 = yabVar.f69583a;
                for (AbstractC2949e2 abstractC2949e3 : r3bVar5.getListeners()) {
                    vab r3bVar6 = r3bVar5.getInstance();
                    abstractC2949e3.getClass();
                    r3bVar6.getClass();
                }
                return;
        }
    }

    public /* synthetic */ xab(yab yabVar, int i) {
        this.f68010a = i;
        this.f68011b = yabVar;
    }
}
