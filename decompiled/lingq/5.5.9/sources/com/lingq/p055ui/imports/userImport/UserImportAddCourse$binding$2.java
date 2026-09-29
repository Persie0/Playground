package com.lingq.p055ui.imports.userImport;

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
import ph.C8270d2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class UserImportAddCourse$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8270d2> {

    /* JADX INFO: renamed from: j */
    public static final UserImportAddCourse$binding$2 f26561j = new UserImportAddCourse$binding$2();

    public UserImportAddCourse$binding$2() {
        super(1, C8270d2.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentUserImportAddCourseBinding;", 0);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8270d2 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.btnCancel;
        TextView textView = (TextView) C0062b.m298P0(view2, R.id.btnCancel);
        if (textView != null) {
            i10 = R.id.btnDone;
            TextView textView2 = (TextView) C0062b.m298P0(view2, R.id.btnDone);
            if (textView2 != null) {
                i10 = R.id.tlField;
                if (((TextInputLayout) C0062b.m298P0(view2, R.id.tlField)) != null) {
                    i10 = R.id.tvField;
                    TextInputEditText textInputEditText = (TextInputEditText) C0062b.m298P0(view2, R.id.tvField);
                    if (textInputEditText != null) {
                        i10 = R.id.tvTitle;
                        if (((TextView) C0062b.m298P0(view2, R.id.tvTitle)) != null) {
                            return new C8270d2(textView, textView2, textInputEditText);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
