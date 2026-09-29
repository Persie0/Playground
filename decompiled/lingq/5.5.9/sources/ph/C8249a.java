package ph;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import com.lingq.p055ui.tooltips.TooltipContainer;
import p473x4.InterfaceC10075a;

/* JADX INFO: renamed from: ph.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8249a implements InterfaceC10075a {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f44543a;

    /* JADX INFO: renamed from: b */
    public final FragmentContainerView f44544b;

    /* JADX INFO: renamed from: c */
    public final TooltipContainer f44545c;

    /* JADX INFO: renamed from: d */
    public final TextView f44546d;

    /* JADX INFO: renamed from: e */
    public final LinearLayout f44547e;

    public C8249a(ConstraintLayout constraintLayout, FragmentContainerView fragmentContainerView, TooltipContainer tooltipContainer, TextView textView, LinearLayout linearLayout) {
        this.f44543a = constraintLayout;
        this.f44544b = fragmentContainerView;
        this.f44545c = tooltipContainer;
        this.f44546d = textView;
        this.f44547e = linearLayout;
    }
}
