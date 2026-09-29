package com.lingq.p055ui.imports.userImport;

import ae.C0062b;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8294h2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class UserImportTextFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8294h2> {

    /* JADX INFO: renamed from: j */
    public static final UserImportTextFragment$binding$2 f26764j = new UserImportTextFragment$binding$2();

    public UserImportTextFragment$binding$2() {
        super(1, C8294h2.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentUserImportTextBinding;", 0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8294h2 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.btnBack;
        ImageView imageView = (ImageView) C0062b.m298P0(view2, R.id.btnBack);
        if (imageView != null) {
            i10 = R.id.btnDone;
            TextView textView = (TextView) C0062b.m298P0(view2, R.id.btnDone);
            if (textView != null) {
                i10 = R.id.etContent;
                TextInputEditText textInputEditText = (TextInputEditText) C0062b.m298P0(view2, R.id.etContent);
                if (textInputEditText != null) {
                    i10 = R.id.tlContent;
                    TextInputLayout textInputLayout = (TextInputLayout) C0062b.m298P0(view2, R.id.tlContent);
                    if (textInputLayout != null) {
                        return new C8294h2(imageView, textView, textInputEditText, textInputLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
