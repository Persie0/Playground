package com.lingq.p055ui.token.dictionaries;

import ae.C0062b;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8298i0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class DictionaryContentFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8298i0> {

    /* JADX INFO: renamed from: j */
    public static final DictionaryContentFragment$binding$2 f31864j = new DictionaryContentFragment$binding$2();

    public DictionaryContentFragment$binding$2() {
        super(1, C8298i0.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentLessonDictionaryContentBinding;", 0);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8298i0 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.btnCancel;
        TextView textView = (TextView) C0062b.m298P0(view2, R.id.btnCancel);
        if (textView != null) {
            i10 = R.id.btnDone;
            TextView textView2 = (TextView) C0062b.m298P0(view2, R.id.btnDone);
            if (textView2 != null) {
                i10 = R.id.btnTts;
                ImageButton imageButton = (ImageButton) C0062b.m298P0(view2, R.id.btnTts);
                if (imageButton != null) {
                    i10 = R.id.et_hint;
                    AppCompatEditText appCompatEditText = (AppCompatEditText) C0062b.m298P0(view2, R.id.et_hint);
                    if (appCompatEditText != null) {
                        i10 = R.id.rvDictionaries;
                        RecyclerView recyclerView = (RecyclerView) C0062b.m298P0(view2, R.id.rvDictionaries);
                        if (recyclerView != null) {
                            i10 = R.id.tvDictionary;
                            TextView textView3 = (TextView) C0062b.m298P0(view2, R.id.tvDictionary);
                            if (textView3 != null) {
                                i10 = R.id.tvTerm;
                                TextView textView4 = (TextView) C0062b.m298P0(view2, R.id.tvTerm);
                                if (textView4 != null) {
                                    i10 = R.id.viewDictionaryDetails;
                                    if (((RelativeLayout) C0062b.m298P0(view2, R.id.viewDictionaryDetails)) != null) {
                                        i10 = R.id.view_paste;
                                        TextView textView5 = (TextView) C0062b.m298P0(view2, R.id.view_paste);
                                        if (textView5 != null) {
                                            i10 = R.id.viewProgress;
                                            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C0062b.m298P0(view2, R.id.viewProgress);
                                            if (circularProgressIndicator != null) {
                                                i10 = R.id.wvDictionary;
                                                WebView webView = (WebView) C0062b.m298P0(view2, R.id.wvDictionary);
                                                if (webView != null) {
                                                    return new C8298i0((ConstraintLayout) view2, textView, textView2, imageButton, appCompatEditText, recyclerView, textView3, textView4, textView5, circularProgressIndicator, webView);
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
