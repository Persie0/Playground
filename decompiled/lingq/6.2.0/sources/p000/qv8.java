package p000;

import androidx.compose.p002ui.semantics.C0423c;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qv8 {

    /* JADX INFO: renamed from: a */
    public final kv8 f58253a;

    /* JADX INFO: renamed from: b */
    public final u56 f58254b;

    public qv8(C0423c c0423c, d84 d84Var) {
        this.f58253a = c0423c.f4974d;
        List listM1839j = C0423c.m1839j(4, c0423c);
        this.f58254b = new u56(listM1839j.size());
        int size = listM1839j.size();
        for (int i = 0; i < size; i++) {
            C0423c c0423c2 = (C0423c) listM1839j.get(i);
            if (d84Var.m10151a(c0423c2.f4976f)) {
                this.f58254b.m22474a(c0423c2.f4976f);
            }
        }
    }
}
