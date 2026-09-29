package p000;

/* JADX INFO: loaded from: classes.dex */
public interface nn3 extends on3 {
    @Override // p000.on3
    /* JADX INFO: renamed from: a */
    default Object mo11685a(Object obj, zi3 zi3Var) {
        return zi3Var.invoke(obj, this);
    }

    @Override // p000.on3
    /* JADX INFO: renamed from: b */
    default boolean mo11686b(qy3 qy3Var) {
        return ((Boolean) qy3Var.invoke(this)).booleanValue();
    }

    @Override // p000.on3
    /* JADX INFO: renamed from: c */
    default boolean mo11687c(vi3 vi3Var) {
        return ((Boolean) vi3Var.invoke(this)).booleanValue();
    }
}
