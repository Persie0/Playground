package p000;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aor extends C0829mo {

    /* JADX INFO: renamed from: s */
    public final Drawable f1916s;

    /* JADX INFO: renamed from: t */
    public ColorStateList f1917t;

    /* JADX INFO: renamed from: u */
    public boolean f1918u;

    /* JADX INFO: renamed from: v */
    public boolean f1919v;

    /* JADX INFO: renamed from: w */
    private final SparseArray f1920w;

    public aor(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.f1920w = sparseArray;
        TextView textView = (TextView) view.findViewById(R.id.title);
        sparseArray.put(R.id.title, textView);
        sparseArray.put(R.id.summary, view.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view.findViewById(R.id.icon));
        sparseArray.put(C0100R.id.icon_frame, view.findViewById(C0100R.id.icon_frame));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        this.f1916s = view.getBackground();
        if (textView != null) {
            this.f1917t = textView.getTextColors();
        }
    }

    /* JADX INFO: renamed from: B */
    public final View m1781B(int i) {
        View view = (View) this.f1920w.get(i);
        if (view != null) {
            return view;
        }
        View viewFindViewById = this.f41155a.findViewById(i);
        if (viewFindViewById != null) {
            this.f1920w.put(i, viewFindViewById);
        }
        return viewFindViewById;
    }
}
