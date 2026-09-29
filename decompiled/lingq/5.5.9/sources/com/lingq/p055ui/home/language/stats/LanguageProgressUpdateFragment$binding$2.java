package com.lingq.p055ui.home.language.stats;

import ae.C0062b;
import android.view.View;
import android.widget.TextView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8391z1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class LanguageProgressUpdateFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8391z1> {

    /* JADX INFO: renamed from: j */
    public static final LanguageProgressUpdateFragment$binding$2 f24223j = new LanguageProgressUpdateFragment$binding$2();

    public LanguageProgressUpdateFragment$binding$2() {
        super(1, C8391z1.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentUpdateLanguageProgressBinding;", 0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8391z1 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.btnCancel;
        TextView textView = (TextView) C0062b.m298P0(view2, R.id.btnCancel);
        if (textView != null) {
            i10 = R.id.btnDone;
            TextView textView2 = (TextView) C0062b.m298P0(view2, R.id.btnDone);
            if (textView2 != null) {
                i10 = R.id.tlField1;
                TextInputLayout textInputLayout = (TextInputLayout) C0062b.m298P0(view2, R.id.tlField1);
                if (textInputLayout != null) {
                    i10 = R.id.tlField2;
                    TextInputLayout textInputLayout2 = (TextInputLayout) C0062b.m298P0(view2, R.id.tlField2);
                    if (textInputLayout2 != null) {
                        i10 = R.id.tvField1;
                        TextInputEditText textInputEditText = (TextInputEditText) C0062b.m298P0(view2, R.id.tvField1);
                        if (textInputEditText != null) {
                            i10 = R.id.tvField2;
                            TextInputEditText textInputEditText2 = (TextInputEditText) C0062b.m298P0(view2, R.id.tvField2);
                            if (textInputEditText2 != null) {
                                i10 = R.id.tvTitle;
                                TextView textView3 = (TextView) C0062b.m298P0(view2, R.id.tvTitle);
                                if (textView3 != null) {
                                    return new C8391z1(textView, textView2, textInputLayout, textInputLayout2, textInputEditText, textInputEditText2, textView3);
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
