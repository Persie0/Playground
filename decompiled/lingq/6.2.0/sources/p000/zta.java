package p000;

/* JADX INFO: loaded from: classes.dex */
public interface zta {
    /* JADX INFO: renamed from: a */
    default wta mo3069a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    /* JADX INFO: renamed from: b */
    default wta mo3070b(Class cls, p56 p56Var) {
        return mo3069a(cls);
    }

    /* JADX INFO: renamed from: c */
    default wta mo3071c(z21 z21Var, p56 p56Var) {
        Class cls = z21Var.f70781a;
        cls.getClass();
        return mo3070b(cls, p56Var);
    }
}
