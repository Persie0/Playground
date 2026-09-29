package com.lingq.feature.reader.reader.state;

import com.lingq.core.domain.model.onboarding.TooltipStep;
import java.util.Iterator;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.a08;
import p000.b08;
import p000.c7a;
import p000.d8d;
import p000.e28;
import p000.e7a;
import p000.m83;
import p000.un1;
import p000.vz1;
import p000.wfb;
import p000.xz7;

/* JADX INFO: renamed from: com.lingq.feature.reader.reader.state.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2503b {
    public static final a08 Companion = new a08();

    /* JADX INFO: renamed from: a */
    public final e7a f30312a;

    /* JADX INFO: renamed from: b */
    public final un1 f30313b;

    /* JADX INFO: renamed from: c */
    public final C3244l f30314c;

    /* JADX INFO: renamed from: d */
    public final C3244l f30315d;

    /* JADX INFO: renamed from: e */
    public final C3244l f30316e;

    /* JADX INFO: renamed from: f */
    public final C3244l f30317f;

    /* JADX INFO: renamed from: g */
    public final C3244l f30318g;

    /* JADX INFO: renamed from: h */
    public xz7 f30319h;

    /* JADX INFO: renamed from: i */
    public final C3244l f30320i;

    /* JADX INFO: renamed from: j */
    public final C3244l f30321j;

    /* JADX INFO: renamed from: k */
    public final C3244l f30322k;

    /* JADX INFO: renamed from: l */
    public final C3244l f30323l;

    /* JADX INFO: renamed from: m */
    public final C3244l f30324m;

    public C2503b(e7a e7aVar, un1 un1Var) {
        e7aVar.getClass();
        un1Var.getClass();
        this.f30312a = e7aVar;
        this.f30313b = un1Var;
        this.f30314c = AbstractC3352my.m17114d(null);
        this.f30315d = AbstractC3352my.m17114d(null);
        this.f30316e = AbstractC3352my.m17114d(null);
        this.f30317f = AbstractC3352my.m17114d(null);
        this.f30318g = AbstractC3352my.m17114d(null);
        Boolean bool = Boolean.FALSE;
        this.f30320i = AbstractC3352my.m17114d(bool);
        C3244l c3244lM17114d = AbstractC3352my.m17114d(null);
        this.f30321j = c3244lM17114d;
        this.f30322k = c3244lM17114d;
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(bool);
        this.f30323l = c3244lM17114d2;
        this.f30324m = c3244lM17114d2;
    }

    /* JADX INFO: renamed from: a */
    public static final void m9405a(C2503b c2503b) {
        C3244l c3244l = c2503b.f30323l;
        C3244l c3244l2 = c2503b.f30318g;
        if (c2503b.f30321j.getValue() == null && !((Boolean) c3244l.getValue()).booleanValue() && ((Boolean) c2503b.f30320i.getValue()).booleanValue()) {
            TooltipStep tooltipStep = TooltipStep.FirstLingQ;
            boolean zM10164d = d8d.m10164d(tooltipStep);
            e7a e7aVar = c2503b.f30312a;
            if (zM10164d) {
                if (e7aVar.mo8753Z0(tooltipStep) && !e7aVar.mo8744P0(tooltipStep)) {
                    e7aVar.mo8742L(tooltipStep);
                }
            } else if (e7aVar.mo8753Z0(tooltipStep) && !e7aVar.mo8744P0(tooltipStep)) {
                c3244l.m15572j(null, Boolean.TRUE);
                return;
            }
            Iterator it = vz1.m23605K(new b08((e28) c3244l2.getValue(), TooltipStep.TapBlueWord, true, false, 24.0f), new b08((e28) c3244l2.getValue(), TooltipStep.TapSecondBlueWord, 8), new b08((e28) c3244l2.getValue(), TooltipStep.TapThirdBlueWord, 24)).iterator();
            while (it.hasNext()) {
                if (c2503b.m9412h((b08) it.next())) {
                    return;
                }
            }
            int i = 16;
            Iterator it2 = vz1.m23605K(new b08((e28) c2503b.f30316e.getValue(), TooltipStep.ReviewMenuHighlight, i), new b08((e28) c2503b.f30314c.getValue(), TooltipStep.PlayAudioHighlight, i), new b08((e28) c2503b.f30315d.getValue(), TooltipStep.SentenceModeHighlight, i), new b08((e28) c2503b.f30317f.getValue(), TooltipStep.SwipePageHighlight, i)).iterator();
            while (it2.hasNext() && !c2503b.m9412h((b08) it2.next())) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m9406b(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        c7a c7aVar = (c7a) this.f30321j.getValue();
        if ((c7aVar != null ? c7aVar.f9664a : null) == tooltipStep) {
            m9408d();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m9407c() {
        this.f30312a.mo8742L(TooltipStep.FirstLingQ);
        Boolean bool = Boolean.FALSE;
        C3244l c3244l = this.f30323l;
        c3244l.getClass();
        c3244l.m15572j(null, bool);
        wfb.m23926u(this.f30313b, null, null, new ReaderTooltipStateHolder$onFirstLingQSheetDismissed$1(this, null), 3);
    }

    /* JADX INFO: renamed from: d */
    public final void m9408d() {
        TooltipStep tooltipStep;
        C3244l c3244l = this.f30321j;
        c7a c7aVar = (c7a) c3244l.getValue();
        if (c7aVar == null || (tooltipStep = c7aVar.f9664a) == null) {
            return;
        }
        this.f30312a.mo8742L(tooltipStep);
        c3244l.m15571i(null);
        wfb.m23926u(this.f30313b, null, null, new ReaderTooltipStateHolder$onTooltipDismiss$1(this, null), 3);
    }

    /* JADX INFO: renamed from: e */
    public final void m9409e() {
        if (this.f30321j.getValue() != null || ((Boolean) this.f30323l.getValue()).booleanValue()) {
            return;
        }
        wfb.m23926u(this.f30313b, null, null, new ReaderTooltipStateHolder$requestReEvaluation$1(this, null), 3);
    }

    /* JADX INFO: renamed from: f */
    public final void m9410f() {
        if (((Boolean) this.f30320i.getValue()).booleanValue()) {
            return;
        }
        wfb.m23926u(this.f30313b, null, null, new ReaderTooltipStateHolder$setContentReady$1(this, null), 3);
    }

    /* JADX INFO: renamed from: g */
    public final void m9411g() {
        AbstractC3224d.m15545x(new m83(AbstractC3224d.m15535n(AbstractC3224d.m15531j(this.f30320i, this.f30318g, this.f30315d, this.f30317f, new ReaderTooltipStateHolder$start$1(5, null)), 300L), new ReaderTooltipStateHolder$start$2(this, null), 2), this.f30313b);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m9412h(b08 b08Var) {
        TooltipStep tooltipStep = b08Var.f7730b;
        boolean zM10164d = d8d.m10164d(tooltipStep);
        e7a e7aVar = this.f30312a;
        if (zM10164d) {
            if (!e7aVar.mo8753Z0(tooltipStep) || e7aVar.mo8744P0(tooltipStep)) {
                return false;
            }
            e7aVar.mo8742L(tooltipStep);
            return false;
        }
        e28 e28Var = b08Var.f7729a;
        if (e28Var == null || !e7aVar.mo8753Z0(tooltipStep) || e7aVar.mo8744P0(tooltipStep)) {
            return false;
        }
        c7a c7aVar = new c7a(tooltipStep, e28Var, b08Var.f7731c, b08Var.f7732d, b08Var.f7733e, 24);
        C3244l c3244l = this.f30321j;
        c3244l.getClass();
        c3244l.m15572j(null, c7aVar);
        return true;
    }
}
