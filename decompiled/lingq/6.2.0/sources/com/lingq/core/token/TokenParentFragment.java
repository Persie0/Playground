package com.lingq.core.token;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import androidx.navigation.fragment.NavHostFragment;
import com.lingq.core.designsystem.R$style;
import com.lingq.feature.token.R$id;
import com.lingq.feature.token.R$layout;
import com.lingq.feature.token.R$navigation;
import kotlin.jvm.internal.PropertyReference1Impl;
import p000.C3309ls;
import p000.a4a;
import p000.bh4;
import p000.c4a;
import p000.jfa;
import p000.qt3;
import p000.sq5;
import p000.u86;
import p000.ud6;
import p000.uq0;
import p000.vd6;
import p000.y38;

/* JADX INFO: loaded from: classes2.dex */
public final class TokenParentFragment extends qt3 {

    /* JADX INFO: renamed from: U0 */
    public static final /* synthetic */ bh4[] f23317U0 = {new PropertyReference1Impl(TokenParentFragment.class, "binding", "getBinding()Lcom/lingq/feature/token/databinding/FragmentTokenParentBinding;")};

    /* JADX INFO: renamed from: S0 */
    public final C3309ls f23318S0;

    /* JADX INFO: renamed from: T0 */
    public final sq5 f23319T0;

    public TokenParentFragment() {
        super(7);
        this.f23318S0 = jfa.m14432o(this, TokenParentFragment$binding$2.f23320i);
        this.f23319T0 = new sq5(3, y38.m24933a(c4a.class), new uq0(this, 18));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: A */
    public final View mo2074A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R$layout.fragment_token_parent, viewGroup, false);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: M */
    public final void mo2085M(View view) {
        view.getClass();
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635cM2136D = m2106h().m2136D(R$id.nav_host_fragment_token_container);
        abstractComponentCallbacksC0635cM2136D.getClass();
        ud6 ud6VarM2573c0 = ((NavHostFragment) abstractComponentCallbacksC0635cM2136D).m2573c0();
        u86 u86VarM23234b = ((vd6) ud6VarM2573c0.f63766h.getValue()).m23234b(R$navigation.nav_graph_token_host);
        Bundle bundle = new Bundle();
        sq5 sq5Var = this.f23319T0;
        bundle.putParcelable("tokenData", ((c4a) sq5Var.getValue()).f9486a);
        bundle.putBoolean("fromVocabulary", true);
        bundle.putInt("lessonId", ((c4a) sq5Var.getValue()).f9487b);
        bundle.putBoolean("shouldPlayTts", ((c4a) sq5Var.getValue()).f9488c);
        bundle.putBoolean("isSentence", ((c4a) sq5Var.getValue()).f9490e);
        ud6VarM2573c0.f63760b.m13138r(u86VarM23234b, bundle);
    }

    @Override // p000.be2
    /* JADX INFO: renamed from: g0 */
    public final int mo3661g0() {
        return R$style.AppTheme_BottomSheetDialog_Token;
    }

    @Override // p000.sg0, p000.C0820bq, p000.be2
    /* JADX INFO: renamed from: h0 */
    public final Dialog mo3662h0(Bundle bundle) {
        return new a4a(this, m2090R(), R$style.AppTheme_BottomSheetDialog_Token);
    }
}
