package p000;

import kotlin.text.Regex;

/* JADX INFO: loaded from: classes.dex */
public final class o18 extends m88 {

    /* JADX INFO: renamed from: c */
    public final String f53596c;

    /* JADX INFO: renamed from: d */
    public final long f53597d;

    /* JADX INFO: renamed from: e */
    public final e18 f53598e;

    public o18(String str, long j, e18 e18Var) {
        this.f53596c = str;
        this.f53597d = j;
        this.f53598e = e18Var;
    }

    @Override // p000.m88
    /* JADX INFO: renamed from: b */
    public final long mo3001b() {
        return this.f53597d;
    }

    @Override // p000.m88
    /* JADX INFO: renamed from: c */
    public final xv5 mo3002c() {
        String str = this.f53596c;
        if (str != null) {
            Regex regex = xv5.f68845e;
            try {
                return AbstractC3122is.m14103q(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    @Override // p000.m88
    /* JADX INFO: renamed from: e */
    public final hj0 mo3003e() {
        return this.f53598e;
    }
}
