package androidx.compose.p002ui.platform;

import kotlin.jvm.internal.Lambda;
import p000.fs6;
import p000.lb4;
import p000.u06;
import p000.ui3;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1 */
/* JADX INFO: loaded from: classes.dex */
final class C0379xec1ea390 extends Lambda implements ui3 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f4569b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fs6 f4570c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f4571d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0379xec1ea390(boolean z, fs6 fs6Var, String str) {
        super(0);
        this.f4569b = z;
        this.f4570c = fs6Var;
        this.f4571d = str;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        if (this.f4569b) {
            fs6 fs6Var = this.f4570c;
            String str = this.f4571d;
            lb4 lb4Var = (lb4) fs6Var.f39590b;
            synchronized (((u06) lb4Var.f49400f)) {
            }
        }
        return xfa.f68157a;
    }
}
