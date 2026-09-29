package p000;

import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yc2 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69621a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f69622b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f69623c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f69624d;

    public /* synthetic */ yc2(Object obj, int i, int i2, Object obj2) {
        this.f69621a = i2;
        this.f69623c = obj;
        this.f69622b = i;
        this.f69624d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f69621a;
        Object obj = this.f69624d;
        int i2 = this.f69622b;
        Object obj2 = this.f69623c;
        switch (i) {
            case 0:
                ((bm7) ((zc2) obj2).f71350c).mo3878j(i2, obj);
                break;
            default:
                sg5 sg5Var = (sg5) obj;
                for (ug5 ug5Var : (CopyOnWriteArraySet) obj2) {
                    if (!ug5Var.f63889d) {
                        if (i2 != -1) {
                            ug5Var.f63887b.m24468a(i2);
                        }
                        ug5Var.f63888c = true;
                        sg5Var.invoke(ug5Var.f63886a);
                    }
                }
                break;
        }
    }
}
