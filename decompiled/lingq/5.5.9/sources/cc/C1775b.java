package cc;

import java.util.HashSet;
import p326q.C8446b;

/* JADX INFO: renamed from: cc.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1775b extends AbstractC1774a7 {

    /* JADX INFO: renamed from: d */
    public String f9676d;

    /* JADX INFO: renamed from: e */
    public HashSet f9677e;

    /* JADX INFO: renamed from: f */
    public C8446b f9678f;

    /* JADX INFO: renamed from: g */
    public Long f9679g;

    /* JADX INFO: renamed from: h */
    public Long f9680h;

    public C1775b(C1846i7 c1846i7) {
        super(c1846i7);
    }

    @Override // cc.AbstractC1774a7
    /* JADX INFO: renamed from: k */
    public final void mo5496k() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public final C1945t7 m5497l(Integer num) {
        if (this.f9678f.containsKey(num)) {
            return (C1945t7) this.f9678f.getOrDefault(num, null);
        }
        C1945t7 c1945t7 = new C1945t7(this, this.f9676d);
        this.f9678f.put(num, c1945t7);
        return c1945t7;
    }
}
