package p000;

import android.graphics.PointF;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class jt0 {

    /* JADX INFO: renamed from: a */
    public int f46094a;

    /* JADX INFO: renamed from: b */
    public int f46095b;

    /* JADX INFO: renamed from: c */
    public int f46096c;

    /* JADX INFO: renamed from: d */
    public int f46097d;

    /* JADX INFO: renamed from: e */
    public final View f46098e;

    /* JADX INFO: renamed from: f */
    public int f46099f;

    /* JADX INFO: renamed from: g */
    public int f46100g;

    public jt0(View view) {
        this.f46098e = view;
    }

    /* JADX INFO: renamed from: a */
    public final void m14642a(PointF pointF) {
        this.f46096c = Math.round(pointF.x);
        int iRound = Math.round(pointF.y);
        this.f46097d = iRound;
        int i = this.f46100g + 1;
        this.f46100g = i;
        if (this.f46099f == i) {
            int i2 = this.f46094a;
            int i3 = this.f46095b;
            int i4 = this.f46096c;
            r90 r90Var = awa.f7627a;
            this.f46098e.setLeftTopRightBottom(i2, i3, i4, iRound);
            this.f46099f = 0;
            this.f46100g = 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m14643b(PointF pointF) {
        this.f46094a = Math.round(pointF.x);
        int iRound = Math.round(pointF.y);
        this.f46095b = iRound;
        int i = this.f46099f + 1;
        this.f46099f = i;
        if (i == this.f46100g) {
            int i2 = this.f46094a;
            int i3 = this.f46096c;
            int i4 = this.f46097d;
            r90 r90Var = awa.f7627a;
            this.f46098e.setLeftTopRightBottom(i2, iRound, i3, i4);
            this.f46099f = 0;
            this.f46100g = 0;
        }
    }
}
