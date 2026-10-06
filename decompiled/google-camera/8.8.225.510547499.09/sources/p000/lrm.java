package p000;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lrm extends lrp {
    @Override // p000.lrp
    /* JADX INFO: renamed from: a */
    protected final int mo15914a(Context context, lpe lpeVar, boolean z) {
        return (((Uri) lpeVar.f38883b).getAuthority().lastIndexOf(64) < 0 || aae.m0a(context, "android.permission.INTERACT_ACROSS_USERS") != 0) ? 3 : 2;
    }
}
