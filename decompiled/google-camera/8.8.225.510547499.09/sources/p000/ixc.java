package p000;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ixc {

    /* JADX INFO: renamed from: a */
    public final float f32529a;

    /* JADX INFO: renamed from: b */
    public final float f32530b;

    /* JADX INFO: renamed from: c */
    public final boolean f32531c;

    /* JADX INFO: renamed from: d */
    public int f32532d = 0;

    /* JADX INFO: renamed from: f */
    public final C0167es f32534f = new ixb(this);

    /* JADX INFO: renamed from: e */
    public final View.OnGenericMotionListener f32533e = new View.OnGenericMotionListener() { // from class: ixa
        @Override // android.view.View.OnGenericMotionListener
        public final boolean onGenericMotion(View view, MotionEvent motionEvent) {
            ixc ixcVar = this.f32527a;
            if (!ixcVar.f32531c) {
                return false;
            }
            RecyclerView recyclerView = (RecyclerView) view;
            if (motionEvent.getAction() != 8 || motionEvent.getSource() != 4194304) {
                return false;
            }
            float axisValue = motionEvent.getAxisValue(26);
            AbstractC0812ly abstractC0812ly = recyclerView.f1124n;
            if (abstractC0812ly == null) {
                return false;
            }
            if (abstractC0812ly.mo1163W()) {
                int i = (int) (((-axisValue) * ixcVar.f32530b) + ixcVar.f32532d);
                ixcVar.f32532d = i;
                recyclerView.m1230ac(0, i);
                return true;
            }
            if (!abstractC0812ly.mo1162V()) {
                return false;
            }
            int i2 = (int) (((-axisValue) * ixcVar.f32529a) + ixcVar.f32532d);
            ixcVar.f32532d = i2;
            recyclerView.m1230ac(i2, 0);
            return true;
        }
    };

    public ixc(Context context) {
        this.f32531c = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        this.f32529a = afr.m553a(ViewConfiguration.get(context));
        this.f32530b = afr.m554b(ViewConfiguration.get(context));
    }
}
