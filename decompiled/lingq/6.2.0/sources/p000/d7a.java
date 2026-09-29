package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.lingq.core.tooltips.R$id;
import com.lingq.core.tooltips.R$layout;
import com.lingq.p020ui.MainActivity;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class d7a extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final sva f35093a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7a(MainActivity mainActivity, y5a y5aVar, vg1 vg1Var) {
        super(mainActivity);
        y5aVar.getClass();
        View viewInflate = LayoutInflater.from(mainActivity).inflate(R$layout.view_tooltip, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R$id.tv_message;
        TextView textView = (TextView) lfa.m16159c(viewInflate, i);
        if (textView != null) {
            i = R$id.view_more;
            ImageView imageView = (ImageView) lfa.m16159c(viewInflate, i);
            if (imageView != null) {
                i = R$id.viewParent;
                if (((ConstraintLayout) lfa.m16159c(viewInflate, i)) != null) {
                    this.f35093a = new sva(textView, imageView);
                    p6a p6aVar = y5aVar.f69329b;
                    String str = p6aVar.f55663a;
                    String[] strArr = (String[]) p6aVar.f55664b.toArray(new String[0]);
                    textView.setText(abd.m245a(str, (String[]) Arrays.copyOf(strArr, strArr.length)));
                    imageView.setOnClickListener(new h31(vg1Var, 12));
                    return;
                }
            }
        }
        C3386nv.m17635v("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final sva getBinding() {
        return this.f35093a;
    }
}
