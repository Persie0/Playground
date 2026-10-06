package com.google.android.apps.camera.p014ui.gridlines;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.Map;
import p000.hyh;
import p000.hyj;
import p000.hyk;
import p000.hyl;
import p000.hyn;
import p000.mwx;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class GridLinesUi extends View {

    /* JADX INFO: renamed from: c */
    private static final hyk f7020c = new hyh();

    /* JADX INFO: renamed from: d */
    private static final hyk f7021d = new hyl(new float[]{0.0f, 1.0f}, false, true);

    /* JADX INFO: renamed from: e */
    private static final hyk f7022e = new hyl(new float[]{0.33333334f, 0.6666666f}, false, false);

    /* JADX INFO: renamed from: f */
    private static final hyk f7023f = new hyl(new float[]{0.25f, 0.5f, 0.75f}, true, false);

    /* JADX INFO: renamed from: g */
    private static final hyk f7024g = new hyl(new float[]{0.38196602f, 0.618034f}, false, false);

    /* JADX INFO: renamed from: a */
    public final Map f7025a;

    /* JADX INFO: renamed from: b */
    public final hyj f7026b;

    public GridLinesUi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7025a = mwx.m17122q(hyn.OFF, f7021d, hyn.THREE_BY_THREE, f7022e, hyn.FOUR_BY_FOUR, f7023f, hyn.GOLDEN_RATIO, f7024g);
        Paint paint = new Paint();
        paint.setStrokeWidth(context.getResources().getDimensionPixelSize(C0100R.dimen.grid_line_width));
        paint.setColor(m4368a(context.getResources()));
        Paint paint2 = new Paint();
        paint2.setStrokeWidth(context.getResources().getDimensionPixelSize(C0100R.dimen.grid_line_width));
        paint2.setColor(m4368a(context.getResources()));
        hyj hyjVar = new hyj(this, paint, paint2);
        this.f7026b = hyjVar;
        hyjVar.m10871a(f7020c);
    }

    /* JADX INFO: renamed from: a */
    private static int m4368a(Resources resources) {
        return resources.getColor(C0100R.color.grid_line, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        hyj hyjVar = this.f7026b;
        if (hyjVar.f29919b.f29933g) {
            return;
        }
        hyjVar.f29921d.mo10870b(canvas, hyjVar.f29918a);
        hyjVar.f29922e.mo10870b(canvas, hyjVar.f29918a);
        hyjVar.f29924g.mo10870b(canvas, hyjVar.f29918a);
        hyjVar.f29925h.mo10870b(canvas, hyjVar.f29918a);
        hyjVar.f29923f.mo10870b(canvas, hyjVar.f29918a);
        hyjVar.f29926i.mo10870b(canvas, hyjVar.f29918a);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        hyj hyjVar = this.f7026b;
        hyjVar.f29918a.set(i, i2, i3, i4);
        hyjVar.m10872b();
        hyjVar.f29920c.invalidate();
    }
}
