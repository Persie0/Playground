package com.lingq.p055ui.lesson.menu;

import ae.C0062b;
import android.graphics.Rect;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.tooltips.InterfaceC4912b;
import com.lingq.p055ui.tooltips.TooltipStep;
import com.lingq.util.C4924a;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7142w;
import p183ik.C6343f;
import p225kk.C6715l;
import p338qd.C8573r0;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/ui/lesson/menu/LessonReviewMenuViewModel;", "Landroidx/lifecycle/h0;", "Lcom/lingq/ui/tooltips/b;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LessonReviewMenuViewModel extends AbstractC1036h0 implements InterfaceC4912b {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC4912b f28330d;

    /* JADX INFO: renamed from: e */
    public final C7138s f28331e;

    /* JADX INFO: renamed from: f */
    public final C7134o f28332f;

    public LessonReviewMenuViewModel(InterfaceC4912b interfaceC4912b, C1024c0 c1024c0) {
        C5207g.m11111f(interfaceC4912b, "tooltipsController");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f28330d = interfaceC4912b;
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f28331e = c7138sM10448a;
        this.f28332f = C0062b.m341d2(c7138sM10448a, C8573r0.m16767w0(this), C6715l.f37936a);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: H1 */
    public final void mo9722H1(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "tooltipStep");
        this.f28330d.mo9722H1(tooltipStep);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: I */
    public final void mo9723I(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        this.f28330d.mo9723I(tooltipStep);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: L */
    public final void mo9724L() {
        this.f28330d.mo9724L();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: T0 */
    public final void mo9727T0() {
        this.f28330d.mo9727T0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: Y1 */
    public final void mo9729Y1() {
        this.f28330d.mo9729Y1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: a1 */
    public final void mo9730a1() {
        this.f28330d.mo9730a1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: b0 */
    public final void mo9731b0(boolean z10) {
        this.f28330d.mo9731b0(z10);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: g0 */
    public final InterfaceC7116c<List<TooltipStep>> mo9733g0() {
        return this.f28330d.mo9733g0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: g2 */
    public final void mo9734g2(TooltipStep tooltipStep, Rect rect, Rect rect2, boolean z10, boolean z11, boolean z12, InterfaceC2041a<C9072e> interfaceC2041a) {
        C5207g.m11111f(tooltipStep, "step");
        C5207g.m11111f(rect, "viewRect");
        C5207g.m11111f(rect2, "tooltipRect");
        C5207g.m11111f(interfaceC2041a, "action");
        this.f28330d.mo9734g2(tooltipStep, rect, rect2, z10, z11, z12, interfaceC2041a);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: h */
    public final InterfaceC7142w<Boolean> mo9735h() {
        return this.f28330d.mo9735h();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: j0 */
    public final void mo9736j0() {
        this.f28330d.mo9736j0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: k0 */
    public final InterfaceC7116c<TooltipStep> mo9737k0() {
        return this.f28330d.mo9737k0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: k1 */
    public final InterfaceC7116c<C9072e> mo9738k1() {
        return this.f28330d.mo9738k1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: p0 */
    public final boolean mo9741p0(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        return this.f28330d.mo9741p0(tooltipStep);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: r0 */
    public final InterfaceC7116c<TooltipStep> mo9743r0() {
        return this.f28330d.mo9743r0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: u */
    public final InterfaceC7116c<C6343f> mo9744u() {
        return this.f28330d.mo9744u();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: u0 */
    public final void mo9745u0(boolean z10) {
        this.f28330d.mo9745u0(z10);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: v1 */
    public final boolean mo9746v1(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        return this.f28330d.mo9746v1(tooltipStep);
    }
}
