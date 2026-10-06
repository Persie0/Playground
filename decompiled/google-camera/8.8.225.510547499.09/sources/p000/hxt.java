package p000;

import android.app.Activity;
import android.content.Context;
import android.net.TrafficStats;
import android.widget.LinearLayout;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.eduimageview.EduImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hxt {

    /* JADX INFO: renamed from: a */
    public final Context f29839a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ EduImageView f29840b;

    /* JADX INFO: renamed from: c */
    int f29841c;

    /* JADX INFO: renamed from: d */
    private final String f29842d;

    /* JADX INFO: renamed from: e */
    private final String f29843e;

    /* JADX INFO: renamed from: f */
    private kba f29844f;

    /* JADX INFO: renamed from: g */
    private final jfo f29845g;

    public hxt(EduImageView eduImageView, Context context, String str, String str2, jfo jfoVar, byte[] bArr) {
        this.f29840b = eduImageView;
        this.f29839a = context;
        this.f29842d = str;
        this.f29843e = str2;
        this.f29845g = jfoVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m10838a() {
        this.f29840b.f7014a.setContentDescription(this.f29843e);
        this.f29840b.f7014a.setClickable(false);
        jfo jfoVar = this.f29845g;
        if (jfoVar != null) {
            Object obj = jfoVar.f33911b;
            Object obj2 = jfoVar.f33910a;
            int i = hsy.f29470z;
            ((LinearLayout) obj).setVisibility(0);
            EduImageView eduImageView = (EduImageView) obj2;
            eduImageView.m4360a();
            eduImageView.setBackgroundColor(kxk.m15009b(C0100R.dimen.gm3_sys_elevation_level1, eduImageView.getContext()));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10839b(boolean z) {
        this.f29840b.f7014a.setOnClickListener(null);
        this.f29840b.f7015b.setVisibility(8);
        kba kbaVar = this.f29844f;
        if (kbaVar != null) {
            kbaVar.close();
            this.f29844f = null;
        }
        Context context = this.f29840b.getContext();
        if (context == null) {
            return;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isDestroyed() || activity.isFinishing()) {
                return;
            }
        }
        int iM11534f = inr.m11534f(context);
        this.f29841c = iM11534f;
        try {
            TrafficStats.setThreadStatsTag(256);
            if (iM11534f == 3 || z) {
                ((bpn) box.m2827c(context).m2864d(this.f29842d).m3307m()).m2848a(new hxr(this, 1)).m2858k(this.f29840b.f7014a);
            } else if (iM11534f == 2) {
                ((bpn) ((bpn) ((bpn) box.m2827c(context).m2864d(this.f29842d).m3300J()).m3299I()).m3307m()).m2848a(new hxr(this, 0)).m2858k(this.f29840b.f7014a);
            } else {
                ((bpn) ((bpn) ((bpn) box.m2827c(context).m2864d(this.f29842d).m3300J()).m3299I()).m3307m()).m2848a(new hxr(this, 2)).m2858k(this.f29840b.f7014a);
            }
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m10840c() {
        hxq hxqVar = new hxq(this);
        kba kbaVar = this.f29844f;
        if (kbaVar != null) {
            kbaVar.close();
        }
        this.f29844f = inr.m11533e(this.f29839a, hxqVar);
    }
}
