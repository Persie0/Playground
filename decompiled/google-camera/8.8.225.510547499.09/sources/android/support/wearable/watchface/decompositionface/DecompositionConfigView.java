package android.support.wearable.watchface.decompositionface;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;
import p000.C0901pf;
import p000.C0902pg;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class DecompositionConfigView extends ImageView {

    /* JADX INFO: renamed from: a */
    private final GestureDetector.SimpleOnGestureListener f1424a;

    /* JADX INFO: renamed from: b */
    private final GestureDetector f1425b;

    public DecompositionConfigView(Context context) {
        super(context);
        getContext();
        new C0902pg();
        new Rect();
        C0901pf c0901pf = new C0901pf();
        this.f1424a = c0901pf;
        this.f1425b = new GestureDetector(getContext(), c0901pf);
        new Rect();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f1425b.onTouchEvent(motionEvent);
    }

    public DecompositionConfigView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        new C0902pg();
        new Rect();
        C0901pf c0901pf = new C0901pf();
        this.f1424a = c0901pf;
        this.f1425b = new GestureDetector(getContext(), c0901pf);
        new Rect();
    }
}
