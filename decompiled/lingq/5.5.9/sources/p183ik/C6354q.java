package p183ik;

import ae.C0062b;
import android.graphics.Rect;
import cm.InterfaceC2041a;
import com.lingq.p055ui.tooltips.InterfaceC4912b;
import com.lingq.p055ui.tooltips.TooltipStep;
import dm.C5207g;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C6752c;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.flow.C7114a;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StateFlowImpl;
import p225kk.C6704a;
import p338qd.C8573r0;
import sl.C9072e;

/* JADX INFO: renamed from: ik.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C6354q implements InterfaceC4912b {

    /* JADX INFO: renamed from: H */
    public final C7135p f36691H;

    /* JADX INFO: renamed from: I */
    public final StateFlowImpl f36692I;

    /* JADX INFO: renamed from: J */
    public final C7135p f36693J;

    /* JADX INFO: renamed from: a */
    public final C6704a f36694a;

    /* JADX INFO: renamed from: b */
    public Set<TooltipStep> f36695b;

    /* JADX INFO: renamed from: c */
    public final AbstractChannel f36696c;

    /* JADX INFO: renamed from: d */
    public final C7114a f36697d;

    /* JADX INFO: renamed from: e */
    public final AbstractChannel f36698e;

    /* JADX INFO: renamed from: f */
    public final C7114a f36699f;

    /* JADX INFO: renamed from: g */
    public final AbstractChannel f36700g;

    /* JADX INFO: renamed from: h */
    public final C7114a f36701h;

    /* JADX INFO: renamed from: i */
    public final AbstractChannel f36702i;

    /* JADX INFO: renamed from: j */
    public final C7114a f36703j;

    /* JADX INFO: renamed from: k */
    public final C7114a f36704k;

    /* JADX INFO: renamed from: l */
    public final StateFlowImpl f36705l;

    public C6354q(C6704a c6704a) {
        C5207g.m11111f(c6704a, "appSettings");
        this.f36694a = c6704a;
        c6704a.m13300b();
        this.f36695b = C6752c.m13456x0(c6704a.m13302d());
        AbstractChannel abstractChannelM16738m = C8573r0.m16738m(-1, null, 6);
        this.f36696c = abstractChannelM16738m;
        this.f36697d = C0062b.m287L1(abstractChannelM16738m);
        C0062b.m287L1(C8573r0.m16738m(-1, null, 6));
        AbstractChannel abstractChannelM16738m2 = C8573r0.m16738m(-1, null, 6);
        this.f36698e = abstractChannelM16738m2;
        this.f36699f = C0062b.m287L1(abstractChannelM16738m2);
        AbstractChannel abstractChannelM16738m3 = C8573r0.m16738m(-1, null, 6);
        this.f36700g = abstractChannelM16738m3;
        this.f36701h = C0062b.m287L1(abstractChannelM16738m3);
        AbstractChannel abstractChannelM16738m4 = C8573r0.m16738m(-1, null, 6);
        this.f36702i = abstractChannelM16738m4;
        this.f36703j = C0062b.m287L1(abstractChannelM16738m4);
        this.f36704k = C0062b.m287L1(C8573r0.m16738m(-1, null, 6));
        Boolean bool = Boolean.TRUE;
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(bool);
        this.f36705l = stateFlowImplM14379a;
        this.f36691H = C0062b.m306S(stateFlowImplM14379a);
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a(bool);
        this.f36692I = stateFlowImplM14379a2;
        this.f36693J = C0062b.m306S(stateFlowImplM14379a2);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: H1 */
    public final void mo9722H1(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "tooltipStep");
        this.f36700g.mo16479j(tooltipStep);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: I */
    public final void mo9723I(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        this.f36695b.add(tooltipStep);
        if (this.f36695b.size() == TooltipStep.values().length - 1) {
            this.f36695b.add(TooltipStep.Finished);
        }
        this.f36694a.m13312n(C6752c.m13453u0(this.f36695b));
        this.f36698e.mo16479j(tooltipStep);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: L */
    public final void mo9724L() {
        this.f36702i.mo16479j(C9072e.f47360a);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: T0 */
    public final void mo9727T0() {
        TooltipStep tooltipStep = TooltipStep.Finished;
        C6704a c6704a = this.f36694a;
        c6704a.m13306h(tooltipStep);
        this.f36695b.add(tooltipStep);
        c6704a.m13312n(C6752c.m13453u0(this.f36695b));
        this.f36702i.mo16479j(C9072e.f47360a);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: Y1 */
    public final void mo9729Y1() {
        this.f36695b = C6752c.m13456x0(this.f36694a.m13302d());
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: a1 */
    public final void mo9730a1() {
        C6704a c6704a = this.f36694a;
        c6704a.f37891b.edit().putInt("tutorial_lingqs", c6704a.f37891b.getInt("tutorial_lingqs", 0) + 1).apply();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: b0 */
    public final void mo9731b0(boolean z10) {
        if (!z10) {
            mo9724L();
        }
        this.f36692I.setValue(Boolean.valueOf(z10));
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: g0 */
    public final InterfaceC7116c<List<TooltipStep>> mo9733g0() {
        return this.f36704k;
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: g2 */
    public final void mo9734g2(TooltipStep tooltipStep, Rect rect, Rect rect2, boolean z10, boolean z11, boolean z12, InterfaceC2041a<C9072e> interfaceC2041a) {
        C5207g.m11111f(tooltipStep, "step");
        C5207g.m11111f(rect, "viewRect");
        C5207g.m11111f(rect2, "tooltipRect");
        C5207g.m11111f(interfaceC2041a, "action");
        boolean zIsDisabled = tooltipStep.isDisabled(true);
        C6704a c6704a = this.f36694a;
        if (zIsDisabled) {
            c6704a.m13306h(tooltipStep);
            mo9723I(tooltipStep);
        } else {
            if (!((Boolean) this.f36693J.getValue()).booleanValue() || rect.isEmpty() || !mo9746v1(tooltipStep) || this.f36695b.contains(tooltipStep) || this.f36695b.contains(TooltipStep.Finished)) {
                return;
            }
            c6704a.m13306h(tooltipStep);
            this.f36696c.mo16479j(new C6343f(tooltipStep, rect, rect2, z10, z11, z12, interfaceC2041a));
        }
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: h */
    public final InterfaceC7142w<Boolean> mo9735h() {
        return this.f36691H;
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: j0 */
    public final void mo9736j0() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f36695b = linkedHashSet;
        TooltipStep tooltipStep = TooltipStep.Start;
        linkedHashSet.add(tooltipStep);
        this.f36692I.setValue(Boolean.TRUE);
        C6704a c6704a = this.f36694a;
        c6704a.f37891b.edit().putInt("tutorial_lingqs", 0).apply();
        c6704a.f37891b.edit().putInt("tutorial_known_words", 0).apply();
        c6704a.m13306h(tooltipStep);
        c6704a.m13312n(C6752c.m13453u0(this.f36695b));
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: k0 */
    public final InterfaceC7116c<TooltipStep> mo9737k0() {
        return this.f36701h;
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: k1 */
    public final InterfaceC7116c<C9072e> mo9738k1() {
        return this.f36703j;
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: p0 */
    public final boolean mo9741p0(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        return this.f36695b.contains(tooltipStep) || this.f36695b.contains(TooltipStep.Finished);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: r0 */
    public final InterfaceC7116c<TooltipStep> mo9743r0() {
        return this.f36699f;
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: u */
    public final InterfaceC7116c<C6343f> mo9744u() {
        return this.f36697d;
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: u0 */
    public final void mo9745u0(boolean z10) {
        if (!z10) {
            mo9724L();
        }
        this.f36705l.setValue(Boolean.valueOf(z10));
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: v1 */
    public final boolean mo9746v1(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        return tooltipStep.requires(this.f36695b, this.f36694a.f37891b.getInt("tutorial_lingqs", 0));
    }
}
