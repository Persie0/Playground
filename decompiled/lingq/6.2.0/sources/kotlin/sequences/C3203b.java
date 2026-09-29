package kotlin.sequences;

import java.util.Iterator;
import p000.qv7;
import p000.ux8;
import p000.z91;

/* JADX INFO: renamed from: kotlin.sequences.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C3203b implements ux8 {

    /* JADX INFO: renamed from: a */
    public final z91 f47725a;

    /* JADX INFO: renamed from: b */
    public final qv7 f47726b;

    public C3203b(z91 z91Var, qv7 qv7Var) {
        SequencesKt___SequencesKt$flatMap$2 sequencesKt___SequencesKt$flatMap$2 = SequencesKt___SequencesKt$flatMap$2.f47720i;
        this.f47725a = z91Var;
        this.f47726b = qv7Var;
    }

    @Override // p000.ux8
    public final Iterator iterator() {
        return new C3202a(this);
    }
}
