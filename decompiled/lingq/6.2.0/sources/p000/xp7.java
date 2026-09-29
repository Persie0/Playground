package p000;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class xp7 {

    /* JADX INFO: renamed from: d */
    public static final xp7 f68496d;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68497a;

    /* JADX INFO: renamed from: b */
    public int f68498b;

    /* JADX INFO: renamed from: c */
    public int f68499c;

    static {
        int i = 0;
        f68496d = new xp7(i, i, 0);
    }

    public xp7(int i) {
        this.f68497a = 4;
        this.f68498b = 2;
        this.f68499c = i;
    }

    /* JADX INFO: renamed from: a */
    public void m24630a(o38 o38Var) {
        View view = o38Var.f53781a;
        this.f68498b = view.getLeft();
        this.f68499c = view.getTop();
        view.getRight();
        view.getBottom();
    }

    public String toString() {
        switch (this.f68497a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(xp7.class.getSimpleName());
                sb.append("[position = ");
                sb.append(this.f68498b);
                sb.append(", length = ");
                return wq1.m24123s(sb, this.f68499c, "]");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ xp7(int i, int i2, int i3) {
        this.f68497a = i3;
        this.f68498b = i;
        this.f68499c = i2;
    }
}
