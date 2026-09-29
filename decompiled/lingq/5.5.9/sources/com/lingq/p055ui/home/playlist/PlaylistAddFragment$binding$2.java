package com.lingq.p055ui.home.playlist;

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
import ph.C8281f1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class PlaylistAddFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8281f1> {

    /* JADX INFO: renamed from: j */
    public static final PlaylistAddFragment$binding$2 f25420j = new PlaylistAddFragment$binding$2();

    public PlaylistAddFragment$binding$2() {
        super(1, C8281f1.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentPlaylistAddBinding;", 0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8281f1 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.btnCancel;
        TextView textView = (TextView) C0062b.m298P0(view2, R.id.btnCancel);
        if (textView != null) {
            i10 = R.id.btnDone;
            TextView textView2 = (TextView) C0062b.m298P0(view2, R.id.btnDone);
            if (textView2 != null) {
                i10 = R.id.etName;
                TextInputEditText textInputEditText = (TextInputEditText) C0062b.m298P0(view2, R.id.etName);
                if (textInputEditText != null) {
                    i10 = R.id.tvTitle;
                    TextView textView3 = (TextView) C0062b.m298P0(view2, R.id.tvTitle);
                    if (textView3 != null) {
                        return new C8281f1(textView, textView2, textInputEditText, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
