package ph;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.installreferrer.api.InstallReferrerClient;
import p473x4.InterfaceC10075a;

/* JADX INFO: renamed from: ph.v2 */
/* JADX INFO: loaded from: classes.dex */
public final class C8372v2 implements InterfaceC10075a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45405a;

    /* JADX INFO: renamed from: b */
    public final ViewGroup f45406b;

    /* JADX INFO: renamed from: c */
    public final TextView f45407c;

    /* JADX INFO: renamed from: d */
    public final View f45408d;

    public /* synthetic */ C8372v2(int i10, View view, ViewGroup viewGroup, TextView textView) {
        this.f45405a = i10;
        this.f45406b = viewGroup;
        this.f45407c = textView;
        this.f45408d = view;
    }

    public /* synthetic */ C8372v2(RelativeLayout relativeLayout, View view, TextView textView, int i10) {
        this.f45405a = i10;
        this.f45406b = relativeLayout;
        this.f45408d = view;
        this.f45407c = textView;
    }

    /* JADX INFO: renamed from: a */
    public final RelativeLayout m16417a() {
        int i10 = this.f45405a;
        ViewGroup viewGroup = this.f45406b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }
        return (RelativeLayout) viewGroup;
    }
}
