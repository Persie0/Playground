package com.lingq.p055ui.home.menu;

import ae.C0062b;
import android.view.View;
import android.widget.LinearLayout;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8354s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class HelpFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8354s> {

    /* JADX INFO: renamed from: j */
    public static final HelpFragment$binding$2 f25037j = new HelpFragment$binding$2();

    public HelpFragment$binding$2() {
        super(1, C8354s.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentHelpBinding;", 0);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8354s mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.appbar;
        if (((AppBarLayout) C0062b.m298P0(view2, R.id.appbar)) != null) {
            i10 = R.id.toolbar;
            MaterialToolbar materialToolbar = (MaterialToolbar) C0062b.m298P0(view2, R.id.toolbar);
            if (materialToolbar != null) {
                i10 = R.id.viewAdvancedReader;
                LinearLayout linearLayout = (LinearLayout) C0062b.m298P0(view2, R.id.viewAdvancedReader);
                if (linearLayout != null) {
                    i10 = R.id.viewBriefOverview;
                    LinearLayout linearLayout2 = (LinearLayout) C0062b.m298P0(view2, R.id.viewBriefOverview);
                    if (linearLayout2 != null) {
                        i10 = R.id.viewEarnCoins;
                        LinearLayout linearLayout3 = (LinearLayout) C0062b.m298P0(view2, R.id.viewEarnCoins);
                        if (linearLayout3 != null) {
                            i10 = R.id.viewHelp;
                            LinearLayout linearLayout4 = (LinearLayout) C0062b.m298P0(view2, R.id.viewHelp);
                            if (linearLayout4 != null) {
                                i10 = R.id.viewImport;
                                LinearLayout linearLayout5 = (LinearLayout) C0062b.m298P0(view2, R.id.viewImport);
                                if (linearLayout5 != null) {
                                    i10 = R.id.viewLibrary;
                                    LinearLayout linearLayout6 = (LinearLayout) C0062b.m298P0(view2, R.id.viewLibrary);
                                    if (linearLayout6 != null) {
                                        i10 = R.id.viewPhrases;
                                        LinearLayout linearLayout7 = (LinearLayout) C0062b.m298P0(view2, R.id.viewPhrases);
                                        if (linearLayout7 != null) {
                                            i10 = R.id.viewPlaylists;
                                            LinearLayout linearLayout8 = (LinearLayout) C0062b.m298P0(view2, R.id.viewPlaylists);
                                            if (linearLayout8 != null) {
                                                i10 = R.id.viewReader;
                                                LinearLayout linearLayout9 = (LinearLayout) C0062b.m298P0(view2, R.id.viewReader);
                                                if (linearLayout9 != null) {
                                                    i10 = R.id.viewStats;
                                                    LinearLayout linearLayout10 = (LinearLayout) C0062b.m298P0(view2, R.id.viewStats);
                                                    if (linearLayout10 != null) {
                                                        i10 = R.id.view_support;
                                                        LinearLayout linearLayout11 = (LinearLayout) C0062b.m298P0(view2, R.id.view_support);
                                                        if (linearLayout11 != null) {
                                                            i10 = R.id.viewVocabulary;
                                                            LinearLayout linearLayout12 = (LinearLayout) C0062b.m298P0(view2, R.id.viewVocabulary);
                                                            if (linearLayout12 != null) {
                                                                return new C8354s(materialToolbar, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9, linearLayout10, linearLayout11, linearLayout12);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
