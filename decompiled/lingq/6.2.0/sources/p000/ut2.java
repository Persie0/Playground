package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ut2 implements vy2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64320a;

    /* JADX INFO: renamed from: b */
    public final wy8 f64321b;

    public /* synthetic */ ut2(wy8 wy8Var, int i) {
        this.f64320a = i;
        this.f64321b = wy8Var;
    }

    @Override // p000.so7
    public final Object get() {
        int i = this.f64320a;
        wy8 wy8Var = this.f64321b;
        switch (i) {
            case 0:
                return new tt2((uo7) wy8Var.f67529b);
            case 1:
                q43 q43Var = (q43) wy8Var.f67529b;
                q43Var.getClass();
                bz8 bz8Var = bz8.f9201a;
                return bz8.m4240a(q43Var);
            default:
                return new ji5((Context) wy8Var.f67529b);
        }
    }
}
