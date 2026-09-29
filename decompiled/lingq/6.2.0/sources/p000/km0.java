package p000;

/* JADX INFO: loaded from: classes.dex */
public final class km0 implements w93 {

    /* JADX INFO: renamed from: a */
    public static final km0 f47508a = new km0();

    /* JADX INFO: renamed from: b */
    public static Boolean f47509b;

    @Override // p000.w93
    /* JADX INFO: renamed from: b */
    public final boolean mo15333b() {
        Boolean bool = f47509b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw AbstractC3393o1.m17745t("canFocus is read before it is written");
    }

    @Override // p000.w93
    /* JADX INFO: renamed from: d */
    public final void mo15334d(boolean z) {
        f47509b = Boolean.valueOf(z);
    }
}
