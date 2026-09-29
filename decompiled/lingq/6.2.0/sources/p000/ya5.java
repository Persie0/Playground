package p000;

import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import com.lingq.feature.library.C2146e;

/* JADX INFO: loaded from: classes3.dex */
public final class ya5 implements a35 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2146e f69549a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f69550b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ z25 f69551c;

    public ya5(C2146e c2146e, vi3 vi3Var, z25 z25Var) {
        this.f69549a = c2146e;
        this.f69550b = vi3Var;
        this.f69551c = z25Var;
    }

    @Override // p000.a35
    /* JADX INFO: renamed from: g */
    public final void mo64g(String str) {
        this.f69549a.m9069a3();
        this.f69550b.invoke(p95.f55802a);
    }

    @Override // p000.a35
    /* JADX INFO: renamed from: h */
    public final void mo65h(String str) {
        str.getClass();
        this.f69550b.invoke(new u95(str));
    }

    @Override // p000.a35
    /* JADX INFO: renamed from: i */
    public final void mo66i(c55 c55Var) {
        this.f69549a.m9069a3();
        int i = c55Var.f9574a;
        z25 z25Var = this.f69551c;
        String str = z25Var.f70789c;
        int i2 = c55Var.f9575b;
        String str2 = c55Var.f9576c;
        String str3 = z25Var.f70790d;
        String str4 = z25Var.f70791e;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = z25Var.f70792f;
        String str6 = str4;
        boolean z = z25Var.f70793g;
        boolean z2 = c55Var.f9577d;
        String str7 = c55Var.f9578e;
        String str8 = str7 == null ? "" : str7;
        String str9 = c55Var.f9579f;
        this.f69550b.invoke(new o95(new s45(i, str, i2, str2, str3, str6, str5, "", z, new y85(c55Var.f9584k, str8, str9 == null ? "" : str9, z2, c55Var.f9582i, c55Var.f9583j), c55Var.f9580g, c55Var.f9581h, ""), new LqAnalyticsValues$LessonPath.Feed(z25Var.f70792f)));
    }

    @Override // p000.a35
    /* JADX INFO: renamed from: k */
    public final void mo67k(int i) {
        this.f69549a.m9069a3();
        this.f69550b.invoke(new k95(new jo1(i, "", "", "", this.f69551c.f70792f, "", "")));
    }

    @Override // p000.a35
    public final void onDismiss() {
        this.f69549a.m9069a3();
    }
}
