package p000;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hsy extends C0829mo {

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ int f29470z = 0;

    /* JADX INFO: renamed from: s */
    public final TextView f29471s;

    /* JADX INFO: renamed from: t */
    public final TextView f29472t;

    /* JADX INFO: renamed from: u */
    public final View[] f29473u;

    /* JADX INFO: renamed from: v */
    public final View f29474v;

    /* JADX INFO: renamed from: w */
    public final LinearLayout f29475w;

    /* JADX INFO: renamed from: x */
    public final HorizontalScrollView f29476x;

    /* JADX INFO: renamed from: y */
    public hsu f29477y;

    public hsy(View view, View[] viewArr) {
        super(view);
        this.f29471s = (TextView) this.f41155a.findViewById(C0100R.id.title);
        this.f29472t = (TextView) this.f41155a.findViewById(C0100R.id.subtitle);
        this.f29473u = viewArr;
        this.f29474v = this.f41155a.findViewById(C0100R.id.beta_label);
        this.f29475w = (LinearLayout) this.f41155a.findViewById(C0100R.id.example_images_view);
        this.f29476x = (HorizontalScrollView) this.f41155a.findViewById(C0100R.id.example_images_scroll_view);
    }
}
