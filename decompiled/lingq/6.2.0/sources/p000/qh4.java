package p000;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qh4 {

    /* JADX INFO: renamed from: a */
    public int f57779a = -1;

    /* JADX INFO: renamed from: b */
    public int f57780b = -1;

    /* JADX INFO: renamed from: c */
    public String f57781c = null;

    /* JADX INFO: renamed from: d */
    public HashMap f57782d;

    /* JADX INFO: renamed from: a */
    public abstract void mo3770a(HashMap map);

    /* JADX INFO: renamed from: b */
    public abstract qh4 mo3771b();

    /* JADX INFO: renamed from: c */
    public qh4 m19971c(qh4 qh4Var) {
        this.f57779a = qh4Var.f57779a;
        this.f57780b = qh4Var.f57780b;
        this.f57781c = qh4Var.f57781c;
        this.f57782d = qh4Var.f57782d;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo3772d(HashSet hashSet);

    /* JADX INFO: renamed from: e */
    public abstract void mo3773e(Context context, AttributeSet attributeSet);

    /* JADX INFO: renamed from: f */
    public void mo19972f(HashMap map) {
    }
}
