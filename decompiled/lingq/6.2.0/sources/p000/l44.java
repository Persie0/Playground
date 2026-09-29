package p000;

import androidx.compose.animation.core.C0061c;
import androidx.compose.runtime.AbstractC0278f;

/* JADX INFO: loaded from: classes.dex */
public final class l44 implements dh9 {

    /* JADX INFO: renamed from: a */
    public Comparable f49014a;

    /* JADX INFO: renamed from: b */
    public Comparable f49015b;

    /* JADX INFO: renamed from: c */
    public final jda f49016c;

    /* JADX INFO: renamed from: d */
    public final t66 f49017d;

    /* JADX INFO: renamed from: e */
    public or9 f49018e;

    /* JADX INFO: renamed from: f */
    public boolean f49019f;

    /* JADX INFO: renamed from: g */
    public boolean f49020g;

    /* JADX INFO: renamed from: h */
    public long f49021h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0061c f49022i;

    public l44(C0061c c0061c, Comparable comparable, Comparable comparable2, jda jdaVar, k44 k44Var) {
        this.f49022i = c0061c;
        this.f49014a = comparable;
        this.f49015b = comparable2;
        this.f49016c = jdaVar;
        this.f49017d = AbstractC0278f.m1260j(comparable);
        this.f49018e = new or9(k44Var, jdaVar, this.f49014a, this.f49015b, null);
    }

    @Override // p000.dh9
    public final Object getValue() {
        return ((xc9) this.f49017d).getValue();
    }
}
