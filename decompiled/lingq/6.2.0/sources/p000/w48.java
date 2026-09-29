package p000;

import kotlin.Result;

/* JADX INFO: loaded from: classes.dex */
public final class w48 implements xl5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66385a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sm0 f66386b;

    public /* synthetic */ w48(sm0 sm0Var, int i) {
        this.f66385a = i;
        this.f66386b = sm0Var;
    }

    @Override // p000.xl5
    public final void onResult(Object obj) {
        int i = this.f66385a;
        sm0 sm0Var = this.f66386b;
        switch (i) {
            case 0:
                if (!sm0Var.m21472y()) {
                    sm0Var.resumeWith(obj);
                }
                break;
            default:
                Throwable th = (Throwable) obj;
                if (!sm0Var.m21472y()) {
                    th.getClass();
                    sm0Var.resumeWith(new Result.Failure(th));
                }
                break;
        }
    }
}
