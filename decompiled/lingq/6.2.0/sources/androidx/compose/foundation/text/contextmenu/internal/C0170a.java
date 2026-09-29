package androidx.compose.foundation.text.contextmenu.internal;

import android.view.ActionMode;
import android.view.View;
import androidx.compose.foundation.C0145m;
import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3412ok;
import p000.RunnableC3725wk;
import p000.dt9;
import p000.ed9;
import p000.kt9;
import p000.ui3;
import p000.vi3;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0170a implements kt9 {

    /* JADX INFO: renamed from: a */
    public final View f2860a;

    /* JADX INFO: renamed from: b */
    public final vi3 f2861b;

    /* JADX INFO: renamed from: c */
    public final ui3 f2862c;

    /* JADX INFO: renamed from: d */
    public final C0145m f2863d = new C0145m();

    /* JADX INFO: renamed from: e */
    public final ed9 f2864e = new ed9(new C3412ok(this, 0));

    /* JADX INFO: renamed from: f */
    public final C3412ok f2865f = new C3412ok(this, 1);

    /* JADX INFO: renamed from: g */
    public final C3412ok f2866g = new C3412ok(this, 2);

    /* JADX INFO: renamed from: h */
    public ActionMode f2867h;

    /* JADX INFO: renamed from: i */
    public RunnableC3725wk f2868i;

    /* JADX INFO: renamed from: j */
    public Runnable f2869j;

    public C0170a(View view, vi3 vi3Var, ui3 ui3Var) {
        this.f2860a = view;
        this.f2861b = vi3Var;
        this.f2862c = ui3Var;
    }

    @Override // p000.kt9
    /* JADX INFO: renamed from: a */
    public final Object mo1064a(dt9 dt9Var, SuspendLambda suspendLambda) {
        Object objM1026b = this.f2863d.m1026b(MutatePriority.Default, new AndroidTextContextMenuToolbarProvider$showTextContextMenu$2(this, dt9Var, null), suspendLambda);
        return objM1026b == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1026b : xfa.f68157a;
    }
}
