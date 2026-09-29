package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nq2 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53113a = 0;

    /* JADX INFO: renamed from: b */
    public final int f53114b;

    /* JADX INFO: renamed from: c */
    public final Object f53115c;

    public nq2(List list, int i, Throwable th) {
        xwc.m24776n(list, "initCallbacks cannot be null");
        this.f53115c = new ArrayList(list);
        this.f53114b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f53113a;
        int i2 = this.f53114b;
        Object obj = this.f53115c;
        switch (i) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i3 = 0;
                if (i2 == 1) {
                    while (i3 < size) {
                        ((mq2) arrayList.get(i3)).mo12849b();
                        i3++;
                    }
                } else {
                    while (i3 < size) {
                        ((mq2) arrayList.get(i3)).mo16994a();
                        i3++;
                    }
                }
                break;
            default:
                ((kg6) obj).m15186k(i2);
                break;
        }
    }

    public nq2(kg6 kg6Var, int i) {
        this.f53115c = kg6Var;
        this.f53114b = i;
    }
}
