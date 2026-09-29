package androidx.window.layout;

import android.content.Context;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3222b;
import p000.c83;
import p000.d5b;
import p000.dp5;
import p000.iy5;
import p000.ph2;
import p000.q4b;
import p000.u6b;
import p000.v72;

/* JADX INFO: renamed from: androidx.window.layout.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0768a implements d5b {

    /* JADX INFO: renamed from: b */
    public final q4b f7137b;

    public C0768a(u6b u6bVar, q4b q4bVar, iy5 iy5Var) {
        this.f7137b = q4bVar;
    }

    /* JADX INFO: renamed from: a */
    public final c83 m2895a(Context context) {
        C3222b c3222bM15526e = AbstractC3224d.m15526e(new WindowInfoTrackerImpl$windowLayoutInfo$1(this, context, null));
        v72 v72Var = ph2.f56212a;
        return AbstractC3224d.m15544w(c3222bM15526e, dp5.f36000a);
    }
}
