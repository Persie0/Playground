package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class wp3 implements zp3 {
    @Override // p000.zp3
    /* JADX INFO: renamed from: a */
    public final ArrayList mo24096a(fb2 fb2Var, int i, int i2) {
        return ss5.m21712h(i, Math.max((i + i2) / (fb2Var.mo916w0(150.0f) + i2), 1), i2);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof wp3) && xj2.m24560b(150.0f, 150.0f);
    }

    public final int hashCode() {
        return Float.hashCode(150.0f);
    }
}
