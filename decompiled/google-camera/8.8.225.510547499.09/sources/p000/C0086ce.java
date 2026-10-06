package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

/* JADX INFO: renamed from: ce */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class C0086ce extends AbstractC0083cb {

    /* JADX INFO: renamed from: b */
    public final Activity f5398b;

    /* JADX INFO: renamed from: c */
    public final Context f5399c;

    /* JADX INFO: renamed from: d */
    public final Handler f5400d;

    /* JADX INFO: renamed from: e */
    public final C0111cq f5401e = new C0111cq();

    public C0086ce(Activity activity, Context context, Handler handler) {
        this.f5398b = activity;
        this.f5399c = context;
        this.f5400d = handler;
    }

    @Override // p000.AbstractC0083cb
    /* JADX INFO: renamed from: a */
    public View mo2638a(int i) {
        throw null;
    }

    @Override // p000.AbstractC0083cb
    /* JADX INFO: renamed from: b */
    public boolean mo2639b() {
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public void mo3178e() {
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public final void m3536h(Intent intent, int i, Bundle bundle) {
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        abr.m147b(this.f5399c, intent, bundle);
    }
}
