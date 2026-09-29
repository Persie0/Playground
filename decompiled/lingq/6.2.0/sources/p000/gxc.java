package p000;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;
import com.lingq.core.domain.model.review.ReviewType;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gxc {

    /* JADX INFO: renamed from: a */
    public static final yd7 f41511a = new yd7(9);

    /* JADX INFO: renamed from: a */
    public static ArrayList m12969a(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < materialToolbar.getChildCount(); i++) {
            View childAt = materialToolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m12970b(ReviewType reviewType) {
        reviewType.getClass();
        return reviewType == ReviewType.Integrated || reviewType == ReviewType.IntegratedWord;
    }

    /* JADX INFO: renamed from: c */
    public static final String m12971c(ReviewType reviewType) {
        reviewType.getClass();
        switch (qg8.f57765a[reviewType.ordinal()]) {
            case 1:
                return "page";
            case 2:
                return "due";
            case 3:
                return "lesson";
            case 4:
                return "srs";
            case 5:
                return "phrases";
            case 6:
                return "all";
            case 7:
            case 8:
                return "sentence";
            default:
                gm5.m12750e();
                return null;
        }
    }
}
