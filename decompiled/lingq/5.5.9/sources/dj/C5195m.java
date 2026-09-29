package dj;

import ae.C0062b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.vocabulary.VocabularyMenuItem;
import com.linguist.R;
import dm.C5207g;
import ni.C7793a;
import p199jd.ViewOnClickListenerC6464i;
import p408u6.ViewOnClickListenerC9466e;
import sl.C9072e;
import vi.ViewOnClickListenerC9734i;

/* JADX INFO: renamed from: dj.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C5195m {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2052l<VocabularyMenuItem, C9072e> f33237a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C5195m(View view, InterfaceC2052l<? super VocabularyMenuItem, C9072e> interfaceC2052l) {
        C5207g.m11111f(view, "view");
        this.f33237a = interfaceC2052l;
        Object systemService = view.getContext().getSystemService("layout_inflater");
        C5207g.m11109d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        final int i10 = 0;
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.menu_vocabulary, (ViewGroup) null, false);
        int i11 = R.id.btnExport;
        TextView textView = (TextView) C0062b.m298P0(viewInflate, R.id.btnExport);
        if (textView != null) {
            i11 = R.id.btnExportAll;
            TextView textView2 = (TextView) C0062b.m298P0(viewInflate, R.id.btnExportAll);
            if (textView2 != null) {
                i11 = R.id.btnExportAllAnki;
                TextView textView3 = (TextView) C0062b.m298P0(viewInflate, R.id.btnExportAllAnki);
                if (textView3 != null) {
                    i11 = R.id.btnExportAnki;
                    TextView textView4 = (TextView) C0062b.m298P0(viewInflate, R.id.btnExportAnki);
                    if (textView4 != null) {
                        i11 = R.id.btnSettings;
                        TextView textView5 = (TextView) C0062b.m298P0(viewInflate, R.id.btnSettings);
                        if (textView5 != null) {
                            final int i12 = 1;
                            final PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2, true);
                            textView5.setOnClickListener(new View.OnClickListener() { // from class: dj.l
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    int i13 = i10;
                                    C5195m c5195m = this;
                                    PopupWindow popupWindow2 = popupWindow;
                                    switch (i13) {
                                        case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                            C5207g.m11111f(popupWindow2, "$popupWindow");
                                            C5207g.m11111f(c5195m, "this$0");
                                            popupWindow2.dismiss();
                                            c5195m.f33237a.mo528n(VocabularyMenuItem.Settings);
                                            break;
                                        default:
                                            C5207g.m11111f(popupWindow2, "$popupWindow");
                                            C5207g.m11111f(c5195m, "this$0");
                                            popupWindow2.dismiss();
                                            c5195m.f33237a.mo528n(VocabularyMenuItem.ExportAllAnki);
                                            break;
                                    }
                                }
                            });
                            textView.setOnClickListener(new ViewOnClickListenerC9734i(popupWindow, 5, this));
                            textView2.setOnClickListener(new ViewOnClickListenerC6464i(popupWindow, 14, this));
                            textView4.setOnClickListener(new ViewOnClickListenerC9466e(popupWindow, 6, this));
                            textView3.setOnClickListener(new View.OnClickListener() { // from class: dj.l
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    int i13 = i12;
                                    C5195m c5195m = this;
                                    PopupWindow popupWindow2 = popupWindow;
                                    switch (i13) {
                                        case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                            C5207g.m11111f(popupWindow2, "$popupWindow");
                                            C5207g.m11111f(c5195m, "this$0");
                                            popupWindow2.dismiss();
                                            c5195m.f33237a.mo528n(VocabularyMenuItem.Settings);
                                            break;
                                        default:
                                            C5207g.m11111f(popupWindow2, "$popupWindow");
                                            C5207g.m11111f(c5195m, "this$0");
                                            popupWindow2.dismiss();
                                            c5195m.f33237a.mo528n(VocabularyMenuItem.ExportAllAnki);
                                            break;
                                    }
                                }
                            });
                            C7793a.m15503g(popupWindow);
                            popupWindow.showAsDropDown(view);
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
