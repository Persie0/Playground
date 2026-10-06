package p000;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class abb {

    /* JADX INFO: renamed from: a */
    public final Context f47a;

    /* JADX INFO: renamed from: e */
    public CharSequence f51e;

    /* JADX INFO: renamed from: f */
    public CharSequence f52f;

    /* JADX INFO: renamed from: g */
    public PendingIntent f53g;

    /* JADX INFO: renamed from: h */
    public int f54h;

    /* JADX INFO: renamed from: i */
    public abc f55i;

    /* JADX INFO: renamed from: k */
    public Bundle f57k;

    /* JADX INFO: renamed from: l */
    public String f58l;

    /* JADX INFO: renamed from: m */
    public final Notification f59m;

    /* JADX INFO: renamed from: n */
    @Deprecated
    public final ArrayList f60n;

    /* JADX INFO: renamed from: b */
    public final ArrayList f48b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final ArrayList f49c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ArrayList f50d = new ArrayList();

    /* JADX INFO: renamed from: j */
    public boolean f56j = false;

    @Deprecated
    public abb(Context context) {
        Notification notification = new Notification();
        this.f59m = notification;
        this.f47a = context;
        this.f58l = null;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f54h = 0;
        this.f60n = new ArrayList();
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m77b(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    /* JADX INFO: renamed from: a */
    public final Bundle m78a() {
        if (this.f57k == null) {
            this.f57k = new Bundle();
        }
        return this.f57k;
    }

    /* JADX INFO: renamed from: c */
    public final void m79c(int i) {
        this.f59m.icon = i;
    }

    /* JADX INFO: renamed from: d */
    public final void m80d(abc abcVar) {
        if (this.f55i != abcVar) {
            this.f55i = abcVar;
            if (abcVar == null || abcVar.f61b == this) {
                return;
            }
            abcVar.f61b = this;
            abb abbVar = abcVar.f61b;
            if (abbVar != null) {
                abbVar.m80d(abcVar);
            }
        }
    }
}
