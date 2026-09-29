package com.lingq.p055ui.home.vocabulary;

import ae.C0062b;
import android.view.View;
import android.widget.TextView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.textfield.TextInputEditText;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8300i2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class VocabularyAddFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8300i2> {

    /* JADX INFO: renamed from: j */
    public static final VocabularyAddFragment$binding$2 f26100j = new VocabularyAddFragment$binding$2();

    public VocabularyAddFragment$binding$2() {
        super(1, C8300i2.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentVocabularyAddBinding;", 0);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8300i2 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.btnAdd;
        TextView textView = (TextView) C0062b.m298P0(view2, R.id.btnAdd);
        if (textView != null) {
            i10 = R.id.btnCancel;
            TextView textView2 = (TextView) C0062b.m298P0(view2, R.id.btnCancel);
            if (textView2 != null) {
                i10 = R.id.etTerm;
                TextInputEditText textInputEditText = (TextInputEditText) C0062b.m298P0(view2, R.id.etTerm);
                if (textInputEditText != null) {
                    i10 = R.id.tvTitle;
                    if (((TextView) C0062b.m298P0(view2, R.id.tvTitle)) != null) {
                        return new C8300i2(textView, textView2, textInputEditText);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
