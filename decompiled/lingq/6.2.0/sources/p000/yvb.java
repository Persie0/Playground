package p000;

import android.os.Bundle;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class yvb implements oxc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ v3c f70562a;

    public yvb(v3c v3cVar) {
        this.f70562a = v3cVar;
    }

    @Override // p000.oxc
    /* JADX INFO: renamed from: f */
    public final String mo4005f() {
        ptb ptbVar = new ptb();
        v3c v3cVar = this.f70562a;
        v3cVar.m23087c(new kzb(v3cVar, ptbVar, 3, false));
        return (String) ptb.m19477H(ptbVar.m19478G(500L), String.class);
    }

    @Override // p000.oxc
    /* JADX INFO: renamed from: g */
    public final void mo4006g(String str, String str2, Bundle bundle) {
        v3c v3cVar = this.f70562a;
        v3cVar.m23087c(new dxb(v3cVar, str, str2, bundle, true));
    }

    @Override // p000.oxc
    /* JADX INFO: renamed from: l */
    public final long mo4007l() {
        return this.f70562a.m23090g();
    }

    @Override // p000.oxc
    /* JADX INFO: renamed from: m */
    public final String mo4008m() {
        ptb ptbVar = new ptb();
        v3c v3cVar = this.f70562a;
        v3cVar.m23087c(new kzb(v3cVar, ptbVar, 4, false));
        return (String) ptb.m19477H(ptbVar.m19478G(500L), String.class);
    }

    @Override // p000.oxc
    /* JADX INFO: renamed from: n */
    public final void mo4009n(Bundle bundle) {
        v3c v3cVar = this.f70562a;
        v3cVar.m23087c(new lxb(v3cVar, bundle));
    }

    @Override // p000.oxc
    /* JADX INFO: renamed from: o */
    public final void mo4010o(String str) {
        v3c v3cVar = this.f70562a;
        v3cVar.m23087c(new yyb(v3cVar, str, 1));
    }

    @Override // p000.oxc
    /* JADX INFO: renamed from: p */
    public final void mo4011p(String str) {
        v3c v3cVar = this.f70562a;
        v3cVar.m23087c(new yyb(v3cVar, str, 0));
    }

    @Override // p000.oxc
    /* JADX INFO: renamed from: q */
    public final void mo4012q(String str, String str2, Bundle bundle) {
        v3c v3cVar = this.f70562a;
        v3cVar.m23087c(new qxb(v3cVar, str, str2, bundle));
    }

    @Override // p000.oxc
    /* JADX INFO: renamed from: r */
    public final List mo4013r(String str, String str2) {
        return this.f70562a.m23089f(str, str2);
    }

    @Override // p000.oxc
    /* JADX INFO: renamed from: s */
    public final int mo4014s(String str) {
        return this.f70562a.m23086b(str);
    }

    @Override // p000.oxc
    /* JADX INFO: renamed from: t */
    public final String mo4015t() {
        ptb ptbVar = new ptb();
        v3c v3cVar = this.f70562a;
        v3cVar.m23087c(new kzb(v3cVar, ptbVar, 1));
        return (String) ptb.m19477H(ptbVar.m19478G(50L), String.class);
    }

    @Override // p000.oxc
    /* JADX INFO: renamed from: u */
    public final String mo4016u() {
        ptb ptbVar = new ptb();
        v3c v3cVar = this.f70562a;
        v3cVar.m23087c(new kzb(v3cVar, ptbVar, 0));
        return (String) ptb.m19477H(ptbVar.m19478G(500L), String.class);
    }

    @Override // p000.oxc
    /* JADX INFO: renamed from: v */
    public final Map mo4017v(String str, String str2, boolean z) {
        return this.f70562a.m23085a(str, str2, z);
    }
}
