package p204jj;

import android.view.KeyEvent;
import android.widget.TextView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.textfield.TextInputEditText;
import dm.C5207g;
import java.util.List;
import p225kk.C6716m;
import p473x4.InterfaceC10075a;
import ph.C8362t2;
import ph.C8383x3;
import ph.C8393z3;

/* JADX INFO: renamed from: jj.k */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6490k implements TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37093a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC10075a f37094b;

    public /* synthetic */ C6490k(InterfaceC10075a interfaceC10075a, int i10) {
        this.f37093a = i10;
        this.f37094b = interfaceC10075a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        int i11 = this.f37093a;
        InterfaceC10075a interfaceC10075a = this.f37094b;
        switch (i11) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C8383x3 c8383x3 = (C8383x3) interfaceC10075a;
                C5207g.m11111f(c8383x3, "$this_with");
                if (i10 != 6) {
                    return false;
                }
                List<Integer> list = C6716m.f37937a;
                C6716m.m13321f(textView.getContext(), textView);
                ((TextInputEditText) c8383x3.f45469b).clearFocus();
                return true;
            case 1:
                C8362t2 c8362t2 = (C8362t2) interfaceC10075a;
                C5207g.m11111f(c8362t2, "$this_with");
                if (i10 != 6) {
                    return false;
                }
                List<Integer> list2 = C6716m.f37937a;
                C6716m.m13321f(textView.getContext(), textView);
                ((TextInputEditText) c8362t2.f45287d).clearFocus();
                return true;
            default:
                C8393z3 c8393z3 = (C8393z3) interfaceC10075a;
                C5207g.m11111f(c8393z3, "$this_with");
                if (i10 != 6) {
                    return false;
                }
                List<Integer> list3 = C6716m.f37937a;
                C6716m.m13321f(textView.getContext(), textView);
                c8393z3.f45508b.clearFocus();
                return true;
        }
    }
}
