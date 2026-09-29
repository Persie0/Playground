package mc;

import android.view.View;
import java.util.List;
import p177ic.C6308a;
import p471x2.C10061r0;
import p471x2.C10063s0;

/* JADX INFO: renamed from: mc.g */
/* JADX INFO: loaded from: classes.dex */
public final class C7541g extends C10061r0.b {

    /* JADX INFO: renamed from: c */
    public final View f41615c;

    /* JADX INFO: renamed from: d */
    public int f41616d;

    /* JADX INFO: renamed from: e */
    public int f41617e;

    /* JADX INFO: renamed from: f */
    public final int[] f41618f = new int[2];

    public C7541g(View view) {
        this.f41615c = view;
    }

    @Override // p471x2.C10061r0.b
    /* JADX INFO: renamed from: a */
    public final C10063s0 mo15047a(C10063s0 c10063s0, List<C10061r0> list) {
        for (C10061r0 c10061r0 : list) {
            if ((c10061r0.f51049a.mo18859c() & 8) != 0) {
                this.f41615c.setTranslationY(C6308a.m12937b(c10061r0.f51049a.mo18858b(), this.f41617e, 0));
                break;
            }
        }
        return c10063s0;
    }
}
