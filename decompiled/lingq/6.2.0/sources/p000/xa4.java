package p000;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class xa4 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a */
    public boolean f67991a = true;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ za4 f67992b;

    public xa4(za4 za4Var) {
        this.f67992b = za4Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        View viewM25523l;
        o38 o38VarM2719M;
        za4 za4Var = this.f67992b;
        gld gldVar = za4Var.f71273m;
        if (!this.f67991a || (viewM25523l = za4Var.m25523l(motionEvent)) == null || (o38VarM2719M = za4Var.f71277q.m2719M(viewM25523l)) == null) {
            return;
        }
        RecyclerView recyclerView = za4Var.f71277q;
        if ((gld.m12736b(gldVar.m12741d(recyclerView, o38VarM2719M), recyclerView.getLayoutDirection()) & 16711680) != 0) {
            int pointerId = motionEvent.getPointerId(0);
            int i = za4Var.f71272l;
            if (pointerId == i) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                float x = motionEvent.getX(iFindPointerIndex);
                float y = motionEvent.getY(iFindPointerIndex);
                za4Var.f71264d = x;
                za4Var.f71265e = y;
                za4Var.f71269i = 0.0f;
                za4Var.f71268h = 0.0f;
                gldVar.getClass();
            }
        }
    }
}
