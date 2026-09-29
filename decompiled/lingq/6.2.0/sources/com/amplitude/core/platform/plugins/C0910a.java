package com.amplitude.core.platform.plugins;

import com.amplitude.core.AbstractC0903a;
import com.amplitude.core.platform.C0907a;
import com.amplitude.core.platform.Plugin$Type;
import com.amplitude.core.platform.intercept.C0909b;
import java.util.Map;
import p000.C3296lf;
import p000.b90;
import p000.fa4;
import p000.fs6;
import p000.wfb;
import p000.yv5;
import p000.zf7;

/* JADX INFO: renamed from: com.amplitude.core.platform.plugins.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0910a implements zf7 {

    /* JADX INFO: renamed from: c */
    public AbstractC0903a f11156c;

    /* JADX INFO: renamed from: e */
    public C0907a f11158e;

    /* JADX INFO: renamed from: f */
    public C0909b f11159f;

    /* JADX INFO: renamed from: a */
    public final Plugin$Type f11154a = Plugin$Type.Destination;

    /* JADX INFO: renamed from: b */
    public final fs6 f11155b = new fs6(28);

    /* JADX INFO: renamed from: d */
    public final boolean f11157d = true;

    @Override // p000.zf7
    /* JADX INFO: renamed from: a */
    public final void mo5089a(AbstractC0903a abstractC0903a) {
        this.f11156c = abstractC0903a;
        fs6 fs6Var = this.f11155b;
        fs6Var.getClass();
        fs6Var.f39591c = abstractC0903a;
        C0907a c0907a = new C0907a(abstractC0903a);
        this.f11158e = c0907a;
        c0907a.m5136a();
        this.f11159f = new C0909b(abstractC0903a.m5111e(), abstractC0903a, abstractC0903a.m5113g(), abstractC0903a.f11016a, this);
        C3296lf c3296lf = new C3296lf(1);
        m5146e();
        c3296lf.mo5089a(fs6Var.m12113t());
        yv5 yv5Var = (yv5) ((Map) fs6Var.f39590b).get(c3296lf.getType());
        if (yv5Var != null) {
            yv5Var.f70552a.add(c3296lf);
        }
    }

    @Override // p000.zf7
    /* JADX INFO: renamed from: b */
    public final b90 mo5143b(b90 b90Var) {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m5144c(b90 b90Var) {
        if (b90Var.f8142a != null || b90Var.f8143b != null) {
            wfb.m23926u(m5146e().f11018c, m5146e().f11021f, null, new AmplitudeDestination$enqueue$1$1(this, b90Var, null), 2);
            return;
        }
        m5146e().m5113g().mo16257c("Event is invalid for missing information like userId and deviceId. Dropping event: " + b90Var.mo3490a());
    }

    /* JADX INFO: renamed from: d */
    public final void m5145d() {
        wfb.m23926u(m5146e().f11018c, m5146e().f11021f, null, new AmplitudeDestination$flush$1(this, null), 2);
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC0903a m5146e() {
        AbstractC0903a abstractC0903a = this.f11156c;
        if (abstractC0903a != null) {
            return abstractC0903a;
        }
        fa4.m11636J("amplitude");
        throw null;
    }

    @Override // p000.zf7
    public final Plugin$Type getType() {
        return this.f11154a;
    }
}
