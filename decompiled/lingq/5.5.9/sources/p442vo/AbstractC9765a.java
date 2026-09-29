package p442vo;

import dm.C5207g;

/* JADX INFO: renamed from: vo.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9765a {

    /* JADX INFO: renamed from: a */
    public final String f49829a;

    /* JADX INFO: renamed from: b */
    public final boolean f49830b;

    /* JADX INFO: renamed from: c */
    public C9767c f49831c;

    /* JADX INFO: renamed from: d */
    public long f49832d;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public /* synthetic */ AbstractC9765a() {
        throw null;
    }

    public AbstractC9765a(String str, boolean z10) {
        C5207g.m11111f(str, "name");
        this.f49829a = str;
        this.f49830b = z10;
        this.f49832d = -1L;
    }

    /* JADX INFO: renamed from: a */
    public abstract long mo18071a();

    public final String toString() {
        return this.f49829a;
    }
}
