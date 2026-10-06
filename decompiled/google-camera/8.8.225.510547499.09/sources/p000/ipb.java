package p000;

import android.R;
import android.graphics.Rect;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.VideoView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ipb implements ioz {

    /* JADX INFO: renamed from: a */
    public final ioy f31672a;

    /* JADX INFO: renamed from: b */
    public final ioe f31673b;

    /* JADX INFO: renamed from: c */
    public final ior f31674c;

    /* JADX INFO: renamed from: d */
    public final View f31675d;

    /* JADX INFO: renamed from: e */
    public final int f31676e;

    /* JADX INFO: renamed from: f */
    public VideoView f31677f;

    /* JADX INFO: renamed from: g */
    public ImageButton f31678g;

    /* JADX INFO: renamed from: h */
    public ImageButton f31679h;

    /* JADX INFO: renamed from: i */
    public TextView f31680i;

    /* JADX INFO: renamed from: j */
    public TextView f31681j;

    /* JADX INFO: renamed from: k */
    public SeekBar f31682k;

    /* JADX INFO: renamed from: l */
    public View f31683l;

    /* JADX INFO: renamed from: m */
    public boolean f31684m;

    /* JADX INFO: renamed from: n */
    public boolean f31685n;

    /* JADX INFO: renamed from: o */
    public View f31686o;

    /* JADX INFO: renamed from: p */
    private final boolean f31687p;

    public ipb(ioy ioyVar, ioe ioeVar, ior iorVar, View view, boolean z) {
        this.f31672a = ioyVar;
        this.f31673b = ioeVar;
        this.f31674c = iorVar;
        this.f31675d = view;
        this.f31687p = z;
        this.f31676e = view.getResources().getInteger(R.integer.config_shortAnimTime);
    }

    @Override // p000.ioz
    /* JADX INFO: renamed from: a */
    public final void mo11573a(int i) {
        this.f31680i.setText(jzn.m13835w(i));
        this.f31682k.setMax(i);
    }

    @Override // p000.ioz
    /* JADX INFO: renamed from: b */
    public final void mo11574b(int i) {
        this.f31681j.setText(jzn.m13835w(i));
        this.f31682k.setProgress(i);
    }

    @Override // p000.ioz
    /* JADX INFO: renamed from: c */
    public final void mo11575c() {
        int i = 1;
        this.f31685n = true;
        if (!this.f31687p) {
            this.f31683l.animate().alpha(1.0f).setDuration(this.f31676e).withStartAction(new idd(this, 20)).start();
        }
        if (this.f31684m) {
            this.f31679h.setVisibility(8);
            this.f31678g.animate().alpha(1.0f).setDuration(this.f31676e).withStartAction(new ipa(this, i)).start();
        } else {
            this.f31678g.setVisibility(8);
            this.f31679h.animate().alpha(1.0f).setDuration(this.f31676e).withStartAction(new ipa(this, 0)).start();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m11577d(Rect rect) {
        this.f31686o.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }
}
