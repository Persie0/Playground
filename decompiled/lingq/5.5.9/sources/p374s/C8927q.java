package p374s;

/* JADX INFO: renamed from: s.q */
/* JADX INFO: loaded from: classes.dex */
public final class C8927q {

    /* JADX INFO: renamed from: a */
    public static final C8917l f46847a = new C8917l(0.4f, 0.2f);

    /* JADX INFO: renamed from: b */
    public static final C8917l f46848b = new C8917l(0.0f, 0.2f);

    /* JADX INFO: renamed from: c */
    public static final a f46849c;

    /* JADX INFO: renamed from: s.q$a */
    public static final class a implements InterfaceC8925p {

        /* JADX INFO: renamed from: a */
        public static final a f46850a = new a();

        @Override // p374s.InterfaceC8925p
        /* JADX INFO: renamed from: a */
        public final float mo17150a(float f3) {
            return f3;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    static {
        if (!((Float.isNaN(0.4f) || Float.isNaN(0.0f) || Float.isNaN(1.0f) || Float.isNaN(1.0f)) ? false : true)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.4, 0.0, 1.0, 1.0.".toString());
        }
        f46849c = a.f46850a;
    }
}
