package p389t2;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import dm.C5207g;

/* JADX INFO: renamed from: t2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C9184c {
    /* JADX INFO: renamed from: a */
    public static final void m17517a(Bundle bundle, String str, Size size) {
        C5207g.m11111f(bundle, "bundle");
        C5207g.m11111f(str, "key");
        bundle.putSize(str, size);
    }

    /* JADX INFO: renamed from: b */
    public static final void m17518b(Bundle bundle, String str, SizeF sizeF) {
        C5207g.m11111f(bundle, "bundle");
        C5207g.m11111f(str, "key");
        bundle.putSizeF(str, sizeF);
    }
}
