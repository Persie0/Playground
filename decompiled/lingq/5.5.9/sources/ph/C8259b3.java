package ph;

import ae.C0062b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.recyclerview.widget.RecyclerView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.card.MaterialCardView;
import com.linguist.R;
import p473x4.InterfaceC10075a;

/* JADX INFO: renamed from: ph.b3 */
/* JADX INFO: loaded from: classes.dex */
public final class C8259b3 implements InterfaceC10075a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44616a;

    /* JADX INFO: renamed from: b */
    public final View f44617b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f44618c;

    /* JADX INFO: renamed from: d */
    public final View f44619d;

    public /* synthetic */ C8259b3(int i10, View view, ViewGroup viewGroup, TextView textView) {
        this.f44616a = i10;
        this.f44618c = viewGroup;
        this.f44619d = view;
        this.f44617b = textView;
    }

    public /* synthetic */ C8259b3(ViewGroup viewGroup, View view, View view2, int i10) {
        this.f44616a = i10;
        this.f44618c = viewGroup;
        this.f44617b = view;
        this.f44619d = view2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static C8259b3 m16398a(View view) {
        int i10 = R.id.iv_crown;
        ImageView imageView = (ImageView) C0062b.m298P0(view, R.id.iv_crown);
        if (imageView != null) {
            i10 = R.id.tv_unlimited_lingqs;
            TextView textView = (TextView) C0062b.m298P0(view, R.id.tv_unlimited_lingqs);
            if (textView != null) {
                return new C8259b3(1, imageView, (MaterialCardView) view, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public static C8259b3 m16399c(LayoutInflater layoutInflater, RecyclerView recyclerView) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item_search_empty, (ViewGroup) recyclerView, false);
        TextView textView = (TextView) C0062b.m298P0(viewInflate, R.id.tv_no_content);
        if (textView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.tv_no_content)));
        }
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        return new C8259b3(linearLayout, textView, linearLayout, 3);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final RelativeLayout m16400b() {
        int i10 = this.f44616a;
        ViewGroup viewGroup = this.f44618c;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                break;
            case 1:
            case 3:
            case 5:
            default:
                break;
            case 2:
                break;
            case 4:
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
        }
        return (RelativeLayout) viewGroup;
    }
}
