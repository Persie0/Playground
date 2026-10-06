package p000;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.google.android.apps.camera.p014ui.gridlines.GridLinesUi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hyj {

    /* JADX INFO: renamed from: a */
    public final RectF f29918a = new RectF();

    /* JADX INFO: renamed from: b */
    public hyk f29919b;

    /* JADX INFO: renamed from: c */
    public final View f29920c;

    /* JADX INFO: renamed from: d */
    public final hym f29921d;

    /* JADX INFO: renamed from: e */
    public final hym f29922e;

    /* JADX INFO: renamed from: f */
    public final hym f29923f;

    /* JADX INFO: renamed from: g */
    public final hyi f29924g;

    /* JADX INFO: renamed from: h */
    public final hyi f29925h;

    /* JADX INFO: renamed from: i */
    public final hyi f29926i;

    public hyj(GridLinesUi gridLinesUi, Paint paint, Paint paint2) {
        this.f29920c = gridLinesUi;
        this.f29921d = new hym(paint);
        this.f29922e = new hym(paint);
        this.f29924g = new hyi(paint);
        this.f29925h = new hyi(paint);
        this.f29923f = new hym(paint2);
        this.f29926i = new hyi(paint2);
    }

    /* JADX INFO: renamed from: a */
    public final void m10871a(hyk hykVar) {
        this.f29919b = hykVar;
        m10872b();
        this.f29920c.invalidate();
    }

    /* JADX INFO: renamed from: b */
    public final void m10872b() {
        hym hymVar = this.f29921d;
        hyk hykVar = this.f29919b;
        boolean z = hykVar.f29935i;
        hymVar.f29916b = z;
        this.f29922e.f29916b = z;
        this.f29924g.f29916b = z;
        this.f29925h.f29916b = z;
        hym hymVar2 = this.f29923f;
        hymVar2.f29916b = z;
        this.f29926i.f29916b = z;
        hymVar2.m10869a(true != hykVar.f29934h ? 0 : 255);
        this.f29926i.m10869a(true == this.f29919b.f29934h ? 255 : 0);
        this.f29919b.mo10868a(this.f29918a);
        hym hymVar3 = this.f29921d;
        hyk hykVar2 = this.f29919b;
        hymVar3.f29915a = hykVar2.f29927a;
        this.f29922e.f29915a = hykVar2.f29928b;
        this.f29924g.f29915a = hykVar2.f29929c;
        this.f29925h.f29915a = hykVar2.f29930d;
        this.f29923f.f29915a = hykVar2.f29931e;
        this.f29926i.f29915a = hykVar2.f29932f;
        this.f29920c.invalidate();
    }
}
