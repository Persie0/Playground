package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class qna {

    /* JADX INFO: renamed from: a */
    public static final sq6 f57992a = new sq6(lq6.f50006a, 0, 0);

    /* JADX INFO: renamed from: a */
    public static final n9a m20081a(kwa kwaVar, C3419on c3419on) {
        n9a n9aVarMo4329a = kwaVar.mo4329a(c3419on);
        int length = c3419on.f54604b.length();
        C3419on c3419on2 = n9aVarMo4329a.f52522a;
        mq6 mq6Var = n9aVarMo4329a.f52523b;
        int length2 = c3419on2.f54604b.length();
        int iMin = Math.min(length, 100);
        for (int i = 0; i < iMin; i++) {
            m20082b(mq6Var.mo13411t(i), length2, i);
        }
        m20082b(mq6Var.mo13411t(length), length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i2 = 0; i2 < iMin2; i2++) {
            m20083c(mq6Var.mo13407j(i2), length, i2);
        }
        m20083c(mq6Var.mo13407j(length2), length, length2);
        return new n9a(c3419on2, new sq6(mq6Var, c3419on.f54604b.length(), c3419on2.f54604b.length()));
    }

    /* JADX INFO: renamed from: b */
    public static final void m20082b(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbM22994q = ux5.m22994q(i3, i, "OffsetMapping.originalToTransformed returned invalid mapping: ", " -> ", " is not in range of transformed text [0, ");
        sbM22994q.append(i2);
        sbM22994q.append(']');
        l54.m15816c(sbM22994q.toString());
    }

    /* JADX INFO: renamed from: c */
    public static final void m20083c(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbM22994q = ux5.m22994q(i3, i, "OffsetMapping.transformedToOriginal returned invalid mapping: ", " -> ", " is not in range of original text [0, ");
        sbM22994q.append(i2);
        sbM22994q.append(']');
        l54.m15816c(sbM22994q.toString());
    }
}
