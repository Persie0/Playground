package p000;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class ydb extends pk9 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ int f69701A;

    public /* synthetic */ ydb(int i) {
        this.f69701A = i;
    }

    @Override // p000.pk9
    /* JADX INFO: renamed from: c */
    public co3 mo17372c(Context context, Looper looper, co7 co7Var, Object obj, qo3 qo3Var, ro3 ro3Var) {
        switch (this.f69701A) {
            case 2:
                return new yuc(context, looper, 51, co7Var, qo3Var, ro3Var, 0);
            default:
                return super.mo17372c(context, looper, co7Var, obj, qo3Var, ro3Var);
        }
    }

    @Override // p000.pk9
    /* JADX INFO: renamed from: d */
    public /* synthetic */ co3 mo17373d(Context context, Looper looper, co7 co7Var, Object obj, scb scbVar, scb scbVar2) {
        switch (this.f69701A) {
            case 0:
                return new beb(context, looper, co7Var, (cs9) obj, scbVar, scbVar2);
            case 1:
                return new reb(context, looper, co7Var, scbVar, scbVar2);
            default:
                return super.mo17373d(context, looper, co7Var, obj, scbVar, scbVar2);
        }
    }
}
