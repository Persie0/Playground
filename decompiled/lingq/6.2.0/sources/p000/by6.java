package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class by6 extends gz6 {

    /* JADX INFO: renamed from: c */
    public static final by6 f9174c = new by6(0, 2, 1);

    @Override // p000.gz6
    /* JADX INFO: renamed from: a */
    public final void mo3126a(pj3 pj3Var, InterfaceC3510qt interfaceC3510qt, fb9 fb9Var, v48 v48Var, hz6 hz6Var) {
        int i = ((k84) pj3Var.m19200f(0)).f46854a;
        List list = (List) pj3Var.m19200f(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            interfaceC3510qt.mo1298a(i3, obj);
            interfaceC3510qt.mo1306l(i3, obj);
        }
    }
}
