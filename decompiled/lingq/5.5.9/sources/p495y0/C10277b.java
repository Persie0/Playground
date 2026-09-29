package p495y0;

import android.graphics.Shader;
import p286o2.C7903c;
import p338qd.C8584v;
import p387t0.AbstractC9161o;
import p387t0.C9156l0;
import p387t0.C9163p;

/* JADX INFO: renamed from: y0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C10277b {
    /* JADX INFO: renamed from: a */
    public static final AbstractC9161o m19251a(C7903c c7903c) {
        Shader shader = c7903c.f43040a;
        boolean z10 = true;
        if (!(shader != null) && c7903c.f43042c == 0) {
            z10 = false;
        }
        if (z10) {
            return shader != null ? new C9163p(shader) : new C9156l0(C8584v.m16783h(c7903c.f43042c));
        }
        return null;
    }
}
