package p000;

/* JADX INFO: renamed from: qt */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3510qt {
    /* JADX INFO: renamed from: a */
    void mo1298a(int i, Object obj);

    /* JADX INFO: renamed from: c */
    void mo1300c(Object obj);

    /* JADX INFO: renamed from: e */
    default void mo1301e() {
        Object objMo1307n = mo1307n();
        oe1 oe1Var = objMo1307n instanceof oe1 ? (oe1) objMo1307n : null;
        if (oe1Var != null) {
            oe1Var.mo1502i();
        }
    }

    /* JADX INFO: renamed from: f */
    void mo1302f(int i, int i2, int i3);

    /* JADX INFO: renamed from: g */
    default void mo1303g(Object obj, zi3 zi3Var) {
        zi3Var.invoke(mo1307n(), obj);
    }

    /* JADX INFO: renamed from: h */
    void mo1304h(int i, int i2);

    /* JADX INFO: renamed from: k */
    void mo1305k();

    /* JADX INFO: renamed from: l */
    void mo1306l(int i, Object obj);

    /* JADX INFO: renamed from: m */
    default void mo4607m() {
    }

    /* JADX INFO: renamed from: n */
    Object mo1307n();
}
