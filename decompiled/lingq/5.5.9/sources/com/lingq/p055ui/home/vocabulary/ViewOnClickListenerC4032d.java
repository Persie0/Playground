package com.lingq.p055ui.home.vocabulary;

import android.view.View;
import androidx.fragment.app.Fragment;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.p053ui.ViewKeys;
import com.lingq.shared.uimodel.ExportType;
import com.lingq.util.C4924a;
import dj.C5195m;
import dm.C5207g;
import kh.C6690q;
import km.InterfaceC6727j;
import mo.C7661i;
import no.C7828f;
import p338qd.C8573r0;
import sl.C9072e;

/* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.d */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC4032d implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f26341a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Fragment f26342b;

    public /* synthetic */ ViewOnClickListenerC4032d(int i10, Fragment fragment) {
        this.f26341a = i10;
        this.f26342b = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f26341a;
        Fragment fragment = this.f26342b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                VocabularyAddFragment vocabularyAddFragment = (VocabularyAddFragment) fragment;
                InterfaceC6727j<Object>[] interfaceC6727jArr = VocabularyAddFragment.f26096T0;
                C5207g.m11111f(vocabularyAddFragment, "this$0");
                String strValueOf = String.valueOf(vocabularyAddFragment.m10018u0().f44893c.getText());
                if (!(!C7661i.m15250P2(strValueOf))) {
                    C8573r0.m16725g0(vocabularyAddFragment).m3995p();
                } else {
                    VocabularyAddViewModel vocabularyAddViewModel = (VocabularyAddViewModel) vocabularyAddFragment.f26098R0.getValue();
                    C7828f.m15570d(C8573r0.m16767w0(vocabularyAddViewModel), vocabularyAddViewModel.f26124e, null, new VocabularyAddViewModel$wordExists$1(vocabularyAddViewModel, strValueOf, null), 2);
                }
                break;
            default:
                final VocabularyFragment vocabularyFragment = (VocabularyFragment) fragment;
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = VocabularyFragment.f26133G0;
                C5207g.m11111f(vocabularyFragment, "this$0");
                C5207g.m11110e(view, "it");
                new C5195m(view, new InterfaceC2052l<VocabularyMenuItem, C9072e>() { // from class: com.lingq.ui.home.vocabulary.VocabularyFragment$onViewCreated$2$2$1

                    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyFragment$onViewCreated$2$2$1$a */
                    public /* synthetic */ class C4005a {

                        /* JADX INFO: renamed from: a */
                        public static final /* synthetic */ int[] f26157a;

                        static {
                            int[] iArr = new int[VocabularyMenuItem.values().length];
                            try {
                                iArr[VocabularyMenuItem.Settings.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[VocabularyMenuItem.Export.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[VocabularyMenuItem.ExportAll.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            try {
                                iArr[VocabularyMenuItem.ExportAnki.ordinal()] = 4;
                            } catch (NoSuchFieldError unused4) {
                            }
                            try {
                                iArr[VocabularyMenuItem.ExportAllAnki.ordinal()] = 5;
                            } catch (NoSuchFieldError unused5) {
                            }
                            f26157a = iArr;
                        }
                    }

                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(VocabularyMenuItem vocabularyMenuItem) {
                        VocabularyMenuItem vocabularyMenuItem2 = vocabularyMenuItem;
                        C5207g.m11111f(vocabularyMenuItem2, "menuItem");
                        int i11 = C4005a.f26157a[vocabularyMenuItem2.ordinal()];
                        VocabularyFragment vocabularyFragment2 = vocabularyFragment;
                        if (i11 == 1) {
                            C4924a.m10447Z(C8573r0.m16725g0(vocabularyFragment2), new C6690q(ViewKeys.ActivitiesSettings.ordinal()));
                        } else if (i11 == 2) {
                            VocabularyFragment.m10020o0(vocabularyFragment2, ExportType.CSV, false);
                        } else if (i11 == 3) {
                            VocabularyFragment.m10020o0(vocabularyFragment2, ExportType.CSV, true);
                        } else if (i11 == 4) {
                            VocabularyFragment.m10020o0(vocabularyFragment2, ExportType.Anki, false);
                        } else if (i11 == 5) {
                            VocabularyFragment.m10020o0(vocabularyFragment2, ExportType.Anki, true);
                        }
                        return C9072e.f47360a;
                    }
                });
                break;
        }
    }
}
