package com.lingq.p055ui.token;

import androidx.constraintlayout.motion.widget.MotionLayout;
import com.linguist.R;
import dm.C5207g;
import java.util.List;
import km.InterfaceC6727j;
import no.C7828f;
import p225kk.C6716m;
import p278nh.C7777d;
import p338qd.C8573r0;

/* JADX INFO: renamed from: com.lingq.ui.token.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C4866c implements MotionLayout.InterfaceC0752i {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TokenFragment f31724a;

    public C4866c(TokenFragment tokenFragment) {
        this.f31724a = tokenFragment;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0752i
    /* JADX INFO: renamed from: a */
    public final void mo2825a(int i10) {
        TokenFragment tokenFragment = this.f31724a;
        if (i10 == R.id.rightTransition || i10 == R.id.leftTransition || i10 == R.id.downTransition) {
            InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
            TokenViewModel tokenViewModelM10363o0 = tokenFragment.m10363o0();
            C7828f.m15570d(C8573r0.m16767w0(tokenViewModelM10363o0), null, null, new TokenViewModel$dismissWithAutoCreate$1(tokenViewModelM10363o0, false, null), 3);
        }
        if (i10 == R.id.expandedTransition) {
            InterfaceC6727j<Object>[] interfaceC6727jArr2 = TokenFragment.f31202R0;
            tokenFragment.m10363o0().m10384z2(TokenViewState.Expanded.f31717a);
        } else if (i10 == R.id.collapsedTransition) {
            InterfaceC6727j<Object>[] interfaceC6727jArr3 = TokenFragment.f31202R0;
            tokenFragment.m10363o0().m10384z2(TokenViewState.Collapsed.f31716a);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0752i
    /* JADX INFO: renamed from: b */
    public final void mo2826b() {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0752i
    /* JADX INFO: renamed from: c */
    public final void mo2827c(int i10) {
        List<Integer> list = C6716m.f37937a;
        TokenFragment tokenFragment = this.f31724a;
        C6716m.m13321f(tokenFragment.m3578a0(), tokenFragment.m3580c0());
        if (!C7777d.m15481b(tokenFragment)) {
            tokenFragment.m10363o0().mo9724L();
        }
        if (i10 == R.id.expandedTransition) {
            tokenFragment.m10363o0().mo10041b();
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0752i
    /* JADX INFO: renamed from: d */
    public final void mo2828d(int i10, int i11, float f3) {
        if (i10 == R.id.collapsedTransition && i11 == R.id.expandedTransition) {
            InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
            TokenFragment tokenFragment = this.f31724a;
            if (C5207g.m11106a(tokenFragment.m10363o0().f31473y0.getValue(), TokenViewState.Collapsed.f31716a) && tokenFragment.m10363o0().f31431U.f34366a.f31181g == TokenControllerType.Lesson) {
                if (f3 > 0.05f) {
                    TokenMotionLayout tokenMotionLayout = tokenFragment.m10362n0().f45395q;
                    List<Integer> list = C6716m.f37937a;
                    tokenMotionLayout.setBackgroundColor(C6716m.m13333r(R.attr.fadePopupBgColor, tokenFragment.m3578a0()));
                    return;
                }
                tokenFragment.m10362n0().f45395q.setBackgroundColor(tokenFragment.m3578a0().getColor(R.color.transparent));
            }
        }
    }
}
